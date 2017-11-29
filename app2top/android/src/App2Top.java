package org.godotengine.godot;

import android.app.Activity;
import android.util.Log;

import org.app2top.tracking.App2top;

public class App2Top extends Godot.SingletonBase {
    //variable
    private static final String TAG = "App2Top";
    private Activity activity = null;

    static public Godot.SingletonBase initialize(Activity p_activity) {

        return new App2Top(p_activity);
    }

    //constructor
    public App2Top(Activity p_activity) {
        //The registration of this and its functions
        registerClass("App2Top", new String[]{
                "sendEvent"
        });

        activity = p_activity;
        Log.i(TAG, "App2Top module inited");
    }

    public void sendEvent(final String event) {
        App2top.sendEvent(activity, event);
        Log.i(TAG, "Send event: "+event);
    }
}
