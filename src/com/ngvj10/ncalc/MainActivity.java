package com.ngvj10.ncalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.ngvj10.ncalc.matematica.mainMatematica;

public class MainActivity extends Activity implements OnClickListener {

	ImageView btMat;
	ImageView btQmq;
	ImageView btFsc;
	ImageView btOutros;
	View view;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btMat = (ImageView) findViewById(R.id.btMat);
		btQmq = (ImageView) findViewById(R.id.btQmq);
		btFsc = (ImageView) findViewById(R.id.btFsc);
		btOutros = (ImageView) findViewById(R.id.btOtrs);

		btMat.setOnClickListener((android.view.View.OnClickListener) this);
		btQmq.setOnClickListener((android.view.View.OnClickListener) this);
		btFsc.setOnClickListener((android.view.View.OnClickListener) this);
		btOutros.setOnClickListener((android.view.View.OnClickListener) this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {
		if (btMat.getId() == ((ImageView) v).getId()) {
			startActivity(new Intent(this, mainMatematica.class));
		}
		if (btQmq.getId() == ((ImageView) v).getId()) {

		}
		if (btFsc.getId() == ((ImageView) v).getId()) {

		}
	}
}