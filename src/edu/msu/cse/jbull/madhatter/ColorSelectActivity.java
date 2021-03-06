package edu.msu.cse.jbull.madhatter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;

public class ColorSelectActivity extends Activity {
	
	public static final String COLOR = "edu.msu.cse.jbull.madhatter.COLOR";
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color_select);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.color_select, menu);
		return true;
	}
	
	public void selectColor(int color) {
		Intent result = new Intent();
		result.putExtra(COLOR, color);
		Log.i("COLOR", Integer.toString(color));
		setResult(Activity.RESULT_OK, result);
		finish();
    }

}
