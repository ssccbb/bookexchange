//package me.jessyan.updateplugin;
//
//import android.app.PendingIntent;
//import android.content.Context;
//import android.content.Intent;
//
//import me.jessyan.retrofiturlmanager.BuildConfig;
//
///**
// * Create by sung at 2020/6/10
// *
// * @desc: 通知管理类
// * @notice:
// */
//public class NotifactionManager {
//
//    private static class Holder {
//        private static NotifactionManager holder = new NotifactionManager();
//    }
//
//    public static NotifactionManager getInstance() {
//        return Holder.holder;
//    }
//
//
//    /**
//     * 默认的notification id
//     */
//    private static final int DEFAULT_NOTIFICATION_ID = 5000;
//    /**
//     * notification id
//     */
//    private static int notificationId = DEFAULT_NOTIFICATION_ID;
//
//    /**
//     * 获取新的notificationId
//     *
//     * @return
//     */
//    public static int getNewNotificationId() {
//        notificationId++;
//        return notificationId;
//    }
//
//    public static void pushNotify(Context context, NotifyMessage notifyMessage) {
//        if (context == null || notifyMessage == null) {
//            return;
//        }
//
//        Intent notificationIntent = new Intent(context, MainActivity.class);
//        notificationIntent.putExtra("pushReciveMessage", notifyMessage);
//        PendingIntent pendingIntent = PendingIntent.getActivity(context, 9001, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//
//        notify(context, getNewNotificationId(), notifyMessage, pendingIntent);
//    }
//
//    public static void notify(Context context, int notificationId, NotifyMessage notifyMessage, PendingIntent pendingIntent) {
//        if (context == null || notifyMessage == null) {
//            return;
//        }
//
//        int appLogoResId = R.drawable.app_logo;
//        String appName = BuildConfig.getAppName(context);
//        if (Util.isEmpty(notifyMessage.getTitle())) {
//            notifyMessage.setTitle(appName);
//        }
//
//        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//        Notification notification = null;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { //Android 8.0
//            String channelId = context.getPackageName();
//            NotificationChannel mChannel = new NotificationChannel(channelId, appName, NotificationManager.IMPORTANCE_LOW);
//            notificationManager.createNotificationChannel(mChannel);
//            Notification.Builder builder = new Notification.Builder(context, channelId)
//                    .setSmallIcon(appLogoResId)
//                    .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), appLogoResId))
//                    .setTicker(notifyMessage.getContent())
//                    .setContentTitle(notifyMessage.getTitle())
//                    .setContentText(notifyMessage.getContent())
//                    .setAutoCancel(true);
//            if (pendingIntent != null) {
//                builder.setContentIntent(pendingIntent);
//            }
//            notification = builder.build();
//        } else {
//            NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
//                    .setSmallIcon(appLogoResId)
//                    .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), appLogoResId))
//                    .setTicker(notifyMessage.getContent())
//                    .setContentTitle(notifyMessage.getTitle())
//                    .setContentText(notifyMessage.getContent())
//                    .setAutoCancel(true);
//            if (pendingIntent != null) {
//                builder.setContentIntent(pendingIntent);
//            }
//            notification = builder.build();
//        }
//        notificationManager.notify(notificationId, notification);
//    }
//
//    /**
//     * 取消所有的notification
//     *
//     * @param context
//     */
//    public static void cancelAll(Context context) {
//        if (notificationId != DEFAULT_NOTIFICATION_ID) {
//            notificationId = DEFAULT_NOTIFICATION_ID;
//            NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//            mNotificationManager.cancelAll();
//        }
//    }
//
//    /**
//     * 通知的权限校验
//     *
//     * @param context
//     */
//    public static void checkNotification(Context context) {
//        if (!isNotificationEnabled(context)) {
//            if (GlobalSimpleSP.getIsNeedCheckNotification(context)) {
//                PermissionUtils.openSystemSetting(context, "当前应用需要消息通知。");
//                GlobalSimpleSP.storeNeedCheckNotification(context, false);
//            }
//        }
//    }
//
//    @SuppressLint("NewApi")
//    public static boolean isNotificationEnabled(Context context) {
//        try {
//            Class appOpsClass = Class.forName(AppOpsManager.class.getName());
//            Method checkOpNoThrowMethod = appOpsClass.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
//            Field opPostNotificationValue = appOpsClass.getDeclaredField("OP_POST_NOTIFICATION");
//
//            AppOpsManager mAppOps = (AppOpsManager) context.getSystemService(Context.APP_OPS_SERVICE);
//            int value = (Integer) opPostNotificationValue.get(Integer.class);
//            int uid = context.getApplicationInfo().uid;
//            String pkg = context.getApplicationContext().getPackageName();
//
//            return ((Integer) checkOpNoThrowMethod.invoke(mAppOps, value, uid, pkg) == AppOpsManager.MODE_ALLOWED);
//        } catch (NoClassDefFoundError e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return true;
//    }
//}
