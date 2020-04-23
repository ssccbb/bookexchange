package com.sung.bookexchange;

import android.content.Context;
import android.graphics.Bitmap;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.sung.bookexchange.common.BaseApplication;
import com.sung.bookexchange.utils.Log;
import com.sung.common.Constants;

import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import static com.sung.bookexchange.api.Api.APP_DOUBAN_DOMAIN;
import static com.sung.bookexchange.api.Api.APP_GANK_DOMAIN;
import static com.sung.bookexchange.api.Api.APP_GITHUB_DOMAIN;
import static com.sung.bookexchange.api.Api.DOUBAN_DOMAIN_NAME;
import static com.sung.bookexchange.api.Api.GANK_DOMAIN_NAME;
import static com.sung.bookexchange.api.Api.GITHUB_DOMAIN_NAME;

/**
 * Create by sung at 2018/11/13
 *
 * @Description:
 */
public class BookApplication extends BaseApplication {

    public BookApplication() {
    }

    public static BookApplication getInstance() {
        return Holder.instance;
    }

    public static class Holder {
        public static BookApplication instance = new BookApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        FrescoInit(getContext());
        RetrofitInit();
    }

    /**
     * 初始化操作，建议在子线程中进行
     *
     * @param context
     */
    private void FrescoInit(final Context context) {
        try {
            DiskCacheConfig diskCacheConfig = DiskCacheConfig.newBuilder(context)
                    //最大缓存
                    .setMaxCacheSize(Constants.Config.CONFIG_FRESCO_CACHE_SIZE * 1024 * 1024)
                    //子目录
                    .setBaseDirectoryName(Constants.Config.CONFIG_FRESCO_CACHE_DIR)
                    .setBaseDirectoryPathSupplier(() -> {
                        //还是推荐缓存到应用本身的缓存文件夹,这样卸载时能自动清除,其他清理软件也能扫描出来
                        return context.getCacheDir();
                    })
                    .build();
            ImagePipelineConfig config = ImagePipelineConfig.newBuilder(context)
                    .setMainDiskCacheConfig(diskCacheConfig)
                    //.setImageCacheStatsTracker(imageCacheStatsTracker)
                    .setDownsampleEnabled(true)
                    //Downsampling，要不要向下采样,它处理图片的速度比常规的裁剪scaling更快，
                    // 并且同时支持PNG，JPG以及WEP格式的图片，非常强大,与ResizeOptions配合使用
                    .setBitmapsConfig(Bitmap.Config.RGB_565)
                    //如果不是重量级图片应用,就用这个省点内存吧.默认是RGB_888
                    .build();
            Fresco.initialize(context, config);
        } catch (Exception e) {
            Log.e("fresco init error!please check the \"application\"");
        }
    }

    private void RetrofitInit() {
        RetrofitUrlManager.getInstance().setDebug(true);
        //将每个 BaseUrl 进行初始化,运行时可以随时改变 DOMAIN_NAME 对应的值,从而达到切换 BaseUrl 的效果
        RetrofitUrlManager.getInstance().putDomain(GITHUB_DOMAIN_NAME, APP_GITHUB_DOMAIN);
        RetrofitUrlManager.getInstance().putDomain(GANK_DOMAIN_NAME, APP_GANK_DOMAIN);
        RetrofitUrlManager.getInstance().putDomain(DOUBAN_DOMAIN_NAME, APP_DOUBAN_DOMAIN);
    }
}
