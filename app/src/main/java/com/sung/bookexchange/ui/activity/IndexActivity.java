package com.sung.bookexchange.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;

import com.google.gson.Gson;
import com.sung.bookexchange.R;
import com.sung.bookexchange.api.RetrofitClient;
import com.sung.bookexchange.common.Constants;
import com.sung.bookexchange.model.BookInfo;
import com.sung.bookexchange.utils.AppManager;
import com.sung.bookexchange.utils.Log;

import java.io.IOException;

import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okhttp3.ResponseBody;
import static me.jessyan.retrofiturlmanager.Utils.NET_TAG;

public class IndexActivity extends BaseActivity {
    private boolean ABLE_EXIT_APP = false;
    private Handler mDoubleClickHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        AppManager.getAppManager().addActivity(this);

        get();
    }

    public static void open(Activity context) {
        if (context == null) return;
        context.startActivity(new Intent(context, IndexActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getAppManager().finishActivity(IndexActivity.class);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (ABLE_EXIT_APP) {// double click exit
                mDoubleClickHandler.removeCallbacksAndMessages(null);
                AppManager.getAppManager().AppExit(this);
                return true;
            }
            ABLE_EXIT_APP = true;
            mDoubleClickHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ABLE_EXIT_APP = false;
                }
            }, Constants.CONFIG_INDEX_EXIT_TIME);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void get() {
        RetrofitClient.getInstance(this)
                .getApiService()
                .getBook("9787532154159")
                .compose(RetrofitClient.getDefaultTransformer())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e(NET_TAG, "request subscribe! " );
                    }

                    @Override
                    public void onNext(ResponseBody response) {
                        try {
                            Log.e(NET_TAG, "request successful --> "+response.string());
                            Gson gson = new Gson();
                            BookInfo book = gson.fromJson(response.string(),BookInfo.class);
                        }catch (IOException e){
                        }
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        throwable.printStackTrace();
                        Log.e(NET_TAG, "request error --> "+throwable.getMessage() );
                    }

                    @Override
                    public void onComplete() {
                        Log.e(NET_TAG, "request complete! " );
                    }
                });
    }

    @OnClick(R.id.go)
    public void onClick(){
        get();
    }
}
