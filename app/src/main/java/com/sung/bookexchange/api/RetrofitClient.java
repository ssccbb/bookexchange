/*
 * Copyright 2017 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sung.bookexchange.api;

import android.content.Context;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import me.jessyan.retrofiturlmanager.interceptor.BaseInterceptor;
import okhttp3.ConnectionPool;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.sung.bookexchange.api.Api.APP_DEFAULT_DOMAIN;
import static com.sung.bookexchange.api.Api.APP_DOUBAN_DOMAIN;
import static com.sung.bookexchange.api.Api.DOUBAN_DOMAIN_NAME;

/**
 * ================================================
 * Created by JessYan on 18/07/2017 17:03
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public class RetrofitClient {
    private static Context mContext;

    private OkHttpClient mOkHttpClient;
    private Retrofit mRetrofit;

    // API 列表
    private ApiService mOneApiService;

    // 超时时间
    private static final int DEFAULT_TIMEOUT = 20;

    private static class NetWorkManagerHolder {
        private static final RetrofitClient INSTANCE = new RetrofitClient(mContext);
    }

    public static final RetrofitClient getInstance(Context context) {
        if (context != null) {
            mContext = context;
        }
        return NetWorkManagerHolder.INSTANCE;
    }

    public static final RetrofitClient getInstance(Context context, Map<String, String> headers) {
        if (context != null) {
            mContext = context;
        }
        return new RetrofitClient(mContext, headers);
    }

    private RetrofitClient(Context context) {
        this(context, null);
    }

    private RetrofitClient(Context context, Map<String, String> headers) {
        //RetrofitUrlManager 初始化
        this.mOkHttpClient = RetrofitUrlManager.getInstance().with(new OkHttpClient.Builder())
                .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .addInterceptor(new BaseInterceptor(headers))
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .connectionPool(new ConnectionPool(8, 15, TimeUnit.SECONDS))
                .build();

        this.mRetrofit = new Retrofit.Builder()
                .baseUrl(APP_DEFAULT_DOMAIN)
                //使用rxjava
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                //使用Gson
                .addConverterFactory(GsonConverterFactory.create())
                .client(mOkHttpClient)
                .build();

        this.mOneApiService = mRetrofit.create(ApiService.class);
    }

    /**
     * 检查当前baseurl
     */
    public RetrofitClient checkDoMainUrl(String domain_url, String domain_name) {
        HttpUrl httpUrl = RetrofitUrlManager.getInstance().fetchDomain(domain_name);
        //可以在 App 运行时随意切换某个接口的 BaseUrl
        if (httpUrl == null || !httpUrl.toString().equals(domain_url)) {
            RetrofitUrlManager.getInstance().putDomain(domain_name, domain_url);
        }
        return this;
    }

    public static <T> ObservableTransformer<T, T> getDefaultTransformer() {
        return upstream -> upstream.subscribeOn(Schedulers.io())
                .doOnSubscribe(disposable -> {
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doAfterTerminate((Action) () -> {
                });
    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }


    /**
     * 获取api
     *
     * @description 有多个baseurl时请补充get方法
     */
    public ApiService getApiService() {
        checkDoMainUrl(APP_DOUBAN_DOMAIN, DOUBAN_DOMAIN_NAME);
        return mOneApiService;
    }
}
