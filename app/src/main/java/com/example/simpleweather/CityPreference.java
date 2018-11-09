package com.example.simpleweather;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Context.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return Hanoi as the default city
    String getCity() {
        return prefs.getString("city", "Thủ Ðô Hà Nội, VN");
    }

    void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }
}
