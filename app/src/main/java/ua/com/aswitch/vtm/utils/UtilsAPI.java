package ua.com.aswitch.vtm.utils;

import android.content.Context;
import android.net.ConnectivityManager;

import ua.com.aswitch.vtm.MainActivity;

/**
 * Created by taras on 4/18/17.
 */
public class UtilsAPI {

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

}

