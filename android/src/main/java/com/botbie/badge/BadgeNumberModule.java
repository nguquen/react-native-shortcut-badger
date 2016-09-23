package com.botbie.badge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import me.leolin.shortcutbadger.ShortcutBadger;

/**
 * Created by dry on 9/23/16.
 */

public class BadgeNumberModule extends ReactContextBaseJavaModule {

    public BadgeNumberModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "BadgeNumberAndroid";
    }

    @ReactMethod
    public void setNumber(int number) {
        ShortcutBadger.applyCount(this.getReactApplicationContext(), number);
    }
}
