package org.sen.mobile.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.TextView;

//Hello
public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        this.getAnalogClockView();
        
    }
        
    public void getAnalogClockView() {
    	AnalogClock tv = new AnalogClock(this);
        tv.setActivated(true);
        tv.setBackgroundColor(BIND_AUTO_CREATE);
        setContentView(tv);
    }
    
    public void getTextView() {
    	TextView tv = new TextView(this);
        tv.setText("Hello Sen, Android");
        setContentView(tv);
    }
}