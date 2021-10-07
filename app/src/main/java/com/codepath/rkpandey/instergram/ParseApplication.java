package com.codepath.rkpandey.instergram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GqLAGzhET9FreivTvp4z6hFFdrsfevScwsUph5kz")
                .clientKey("XWsEwMjGSGhZVu9FVeP9AsYTOipagiqshpUIXPnV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
