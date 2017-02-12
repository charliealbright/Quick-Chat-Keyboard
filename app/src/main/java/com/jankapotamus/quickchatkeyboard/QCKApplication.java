package com.jankapotamus.quickchatkeyboard;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Charlie on 2/10/17.
 */

public class QCKApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Orbitron-Light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
