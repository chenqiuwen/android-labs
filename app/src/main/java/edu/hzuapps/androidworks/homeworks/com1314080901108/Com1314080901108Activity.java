package edu.hzuapps.androidworks.homeworks.com1314080901108;

import android.os.Bundle;
import android.app.Activity;
import android.view.Window;

public class Com1314080901108Activity extends BackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_com1314080901108);
    }
}

