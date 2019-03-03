package org.hvdw.wifion;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Context;
import android.net.wifi.WifiManager;

public class WiFiOn extends Activity {
    public static final String TAG = "WiFiOnApp";
    private static Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();

        Log.d(TAG, "Started WiFiOnApp; in OnCreate void");

        WifiManager wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE); 
        wifiManager.setWifiEnabled(true);
        //wifiManager.setWifiEnabled(false);

        Log.d(TAG, "Switched On WiFi");

        finish();
    }

}
