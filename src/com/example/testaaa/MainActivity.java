package com.example.testaaa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tvNum;
	private int newFriendsCount = 10;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tvNum = (TextView) findViewById(R.id.tv_num);
		tvNum.setVisibility(View.GONE);
		TextView tv_contact = (TextView) findViewById(R.id.tv_contact);
		tv_contact.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				newFriendsCount ++;
				refreshViewCount();
			}
		});
		refreshViewCount();
	}

	// 更新，新好友个数
	private void refreshViewCount(){
		if(newFriendsCount > 0){
			tvNum.setVisibility(View.VISIBLE);
			tvNum.setText(String.valueOf(newFriendsCount));
		}else{
			tvNum.setVisibility(View.GONE);
		}
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
