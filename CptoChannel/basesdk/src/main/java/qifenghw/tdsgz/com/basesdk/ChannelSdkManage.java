package qifenghw.tdsgz.com.basesdk;

import android.app.Activity;

/**
 * Created on 2019/4/19.
 *
 * @author liuj
 * @remarks 游戏
 */

public class ChannelSdkManage {

    private static ChannelSdkManage instance;

    private Activity mActivity;

    /**
     * 渠道的sdk
     */
    private SdkLifecycle client;

    private ChannelSdkManage() {
    }
    public static ChannelSdkManage getInstance() {
        if (instance == null) {
            synchronized (ChannelSdkManage.class) {
                if (instance == null) {
                    instance = new ChannelSdkManage();
                }
            }
        }
        return instance;
    }

    //初始化
    public void init(Activity activity) {
        this.mActivity = activity;
        if (null == client) {
            //先获取渠道
            initChannel();
        }
        client.init(activity);

    }
    //登录
    public void login(){

    }
    //支付
    public void pay(){

    }

    /*获取渠道*/
    private void initChannel() {
        // 从 AndroidManifest.xml 或者从什么地方读取出来
        // 发行接入渠道SDK后在清单文件中设置这个路径 游戏会读取这个类实现
        //游戏发行商接入渠道时的封装类(这个类必须实现basesdk中的SdkLifecycle)
        String channelStr = "com.duojiao.huawei.HuaWeiChannel";
        try {
            Class clazz = Class.forName(channelStr);
            client = (SdkLifecycle) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            // 退出游戏
            System.exit(0);
        }
    }
}
