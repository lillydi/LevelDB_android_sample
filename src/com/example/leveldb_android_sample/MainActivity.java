package com.example.leveldb_android_sample;

import java.io.File;

import com.example.leveldb_android_sample.LevelDB;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	private TextView mTextView;
	protected LevelDB db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTextView = (TextView) findViewById(R.id.myTextView);
		String ss = Environment.getExternalStorageDirectory().getPath()+"/Android/data/test1";
		File dir=new File(ss);
		if(dir.exists() == false)	dir.mkdirs();
		long t0=10, t1=0;
		int num=1000;
		try {
			db=new LevelDB(dir);
			//db.destroy();
			t0 = System.currentTimeMillis();
			for(long i=0; i<num; i++){
				db.put("Key: "+i, "value: "+i);
				//ss=db.getString("Key: "+i);
				//db.delete("key: "+i);
			}
			t1 = System.currentTimeMillis();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			db.close();
		}
		mTextView.append("finish\nThe time is: "+ (t1-t0)+" ms\n");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
