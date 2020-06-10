package me.jessyan.updateplugin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Create by sung at 2020/6/10
 *
 * @desc: 用于下载更新文件apk
 * @notice: 不关联任何UI界面
 */
public class DownloadService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}
