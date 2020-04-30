package me.jessyan.retrofiturlmanager.interceptor;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.io.IOException;
import java.util.HashSet;

import me.jessyan.retrofiturlmanager.NetApi;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Create by sung at 2020-04-21
 *
 * @desc: cookie添加拦截器
 * @notice:
 */
public class AddCookiesInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        SharedPreferences config = NetApi.getInstance().getContext().getSharedPreferences("config", Context.MODE_PRIVATE);
        if (config != null) {
            HashSet<String> preferences = (HashSet) config.getStringSet("cookies", null);
            if (preferences != null) {
                for (String cookie : preferences) {
                    builder.addHeader("Cookie", cookie);
                    // This is done so I know which headers are being added; this interceptor is used after the normal logging of OkHttp
                    Log.v("cookies", "Adding Header: " + cookie);
                }
            }
        }
        return chain.proceed(builder.build());
    }
}