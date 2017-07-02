package gepleshik.ounegh.ir.gep;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.os.EnvironmentCompat;

import java.util.Map;
import java.util.Set;

/**
 * Created by aseme on 30/06/2017.
 */

public  class App extends Application {

    public static String BASE_URL="http://gepleshic.ounegh.ir";

    public static  String BASE_DIR= Environment.getExternalStorageDirectory().toString()+"/"+"gepleshik";
    public void onCreate() {
        super.onCreate();

    }

}
