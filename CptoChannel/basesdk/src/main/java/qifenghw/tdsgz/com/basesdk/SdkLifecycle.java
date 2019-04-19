package qifenghw.tdsgz.com.basesdk;

import android.app.Activity;

import org.json.JSONObject;

/**
 * Created on 2019/4/19.
 *
 * @author liuj
 * @remarks ***
 */

public interface SdkLifecycle {
    void init(Activity activity);

    void login(JSONObject args);

    void logout(JSONObject args);

    void pay(JSONObject args);
}
