package com.xiaosai.uicustomviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/3/2 0002.
 */
public class MainActivity extends Activity implements View.OnClickListener {
	private Button btn_callback;
	private Button btn_edit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_callback = (Button) findViewById(R.id.btn_back);
		btn_edit = (Button) findViewById(R.id.btn_edit);
		btn_callback.setOnClickListener(this);
		btn_edit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.btn_back:
				Toast.makeText(MainActivity.this, "Back...", Toast.LENGTH_SHORT).show();
				break;
			case R.id.btn_edit:
				Toast.makeText(MainActivity.this, "Edit...", Toast.LENGTH_SHORT).show();
				break;
		}
	}
}
