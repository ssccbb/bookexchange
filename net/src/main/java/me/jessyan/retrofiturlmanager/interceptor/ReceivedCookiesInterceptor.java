package me.jessyan.retrofiturlmanager.interceptor;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.io.IOException;
import java.util.HashSet;

import me.jessyan.retrofiturlmanager.NetApi;
import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Create by sung at 2020-04-21
 *
 * @desc: cookie接收拦截器
 * @notice:
 */
public class ReceivedCookiesInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
            HashSet<String> cookies = new HashSet<>();

            for (String header : originalResponse.headers("Set-Cookie")) {
                Log.v("cookies",header);
                cookies.add(header);
            }

            Context context = NetApi.getInstance().getContext();
            SharedPreferences.Editor config = context.getSharedPreferences("cookies", Context.MODE_PRIVATE)
                    .edit();
            config.putStringSet("cookie", cookies);
            config.commit();
        }else {
            Log.v("cookies","empty cookie");
        }

        return originalResponse;
    }
}
