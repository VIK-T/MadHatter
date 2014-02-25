package edu.msu.cse.jbull.madhatter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ColorSelectActivity extends Activity {

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

        
    }

}
