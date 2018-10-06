package marhaupe.onesignalissue;

import android.content.Intent;
import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends ReactActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-9327513174852711~3345932464");
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "onesignalissue";
    }
}
