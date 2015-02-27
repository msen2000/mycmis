package org.delta.mobile.linearlayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts;

public class HelloLinearLayoutActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Intent intend = new Intent(Intent.ACTION_SEND);
        intend.putExtra(Intent.EXTRA_EMAIL, "msen2000@gmail.com");
        
    }
    
    public void pickContent() {
    	Intent intent = new Intent(Intent.ACTION_PICK, Contacts.CONTENT_URI);
    	startActivityForResult(intent, PICK_CONTACT_REQUEST);
    	Context.st
    }
    
    @Override    
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    
    	if(requestCode == Activity.RESULT_OK && requestCode == PICK_CONTACT_REQUEST) {
    		Cursor cursor = getContentResolver().query(data.getData(), new String[] {Contacts.DISPLAY_NAME}, null, null, null);
    		if(cursor.moveToFirst()) {
    			int colIndex = cursor.getColumnIndex(Contacts.DISPLAY_NAME);
    			String name = cursor.getString(colIndex);
    		}
    		
    		
    	}
    	
    }
}