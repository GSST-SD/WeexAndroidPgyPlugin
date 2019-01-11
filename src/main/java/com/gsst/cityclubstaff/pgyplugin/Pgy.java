package com.gsst.cityclubstaff.pgyplugin;

import android.content.Context;
import android.util.Log;
//import android.widget.Toast;

import com.alibaba.weex.plugin.annotation.WeexModule;
import com.taobao.weex.annotation.JSMethod;
//import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

//import com.pgyersdk.crash.PgyCrashManager;
//import com.pgyersdk.feedback.PgyFeedbackShakeManager;
import com.pgyersdk.update.PgyUpdateManager;
//import com.pgyersdk.update.UpdateManagerListener;
//import com.pgyersdk.update.javabean.AppBean;

@WeexModule(name = "pgyupdate", lazyLoad = true)
public  class Pgy extends WXModule {
    private Context mContext;

    private static final String TAG = Pgy.class.getSimpleName();

    @JSMethod
    public void checkUpdate(String appId, final JSCallback jsCallback){
        Log.d(TAG, "pgyupdate checkUpdate ");
        new PgyUpdateManager.Builder()
//            .setForced(true)                //设置是否强制提示更新
            .setUserCanRetry(false)         //失败后是否提示重新下载
//            .setDeleteHistroyApk(false)     // 检查更新前是否删除本地历史 Apk， 默认为true
            .register();

//        new PgyUpdateManager.Builder()
////            .setForced(true)                //设置是否强制提示更新,非自定义回调更新接口此方法有用
//            .setUserCanRetry(false)         //失败后是否提示重新下载，非自定义下载 apk 回调此方法有用
//            .setDeleteHistroyApk(false)     // 检查更新前是否删除本地历史 Apk， 默认为true
//            .setUpdateManagerListener(new UpdateManagerListener() {
//                @Override
//                public void onNoUpdateAvailable() {
//                    //没有更新是回调此方法
//                    Log.d("pgyer", "there is no new version");
//                    Toast.makeText(mWXSDKInstance.getContext(), "没有更新 ", Toast.LENGTH_LONG).show();
//                }
//                @Override
//                public void onUpdateAvailable(AppBean appBean) {
//                    //有更新回调此方法
//                    Log.d("pgyer", "there is new version can update"
//                        + "new versionCode is " + appBean.getVersionCode() + " getDownloadURL " + appBean.getDownloadURL());
//                    Toast.makeText(mWXSDKInstance.getContext(), "有更新 ", Toast.LENGTH_LONG).show();
//                    //调用以下方法，DownloadFileListener 才有效；
//                    //如果完全使用自己的下载方法，不需要设置DownloadFileListener
//                    PgyUpdateManager.downLoadApk(appBean.getDownloadURL());
//                }
//
//                @Override
//                public void checkUpdateFailed(Exception e) {
//                    //更新检测失败回调
//                    //更新拒绝（应用被下架，过期，不在安装有效期，下载次数用尽）以及无网络情况会调用此接口
//                    Log.e("pgyer", "check update failed ", e);
//                    Toast.makeText(mWXSDKInstance.getContext(), "更新检测失败 ", Toast.LENGTH_LONG).show();
//                }
//            })
//            .register();
    }
}
