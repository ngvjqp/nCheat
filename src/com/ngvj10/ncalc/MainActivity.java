package com.ngvj10.ncalc;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.ngvj10.ncalc.matematica.mainMatematica;

public class MainActivity extends Activity implements OnClickListener {

	ImageView btMat;
	ImageView btQmq;
	Button btFsc;
	Button btOutros;
	View view;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btMat = (ImageView) findViewById(R.id.btMat);
		btQmq = (ImageView) findViewById(R.id.btQmq);
		btFsc = (Button) findViewById(R.id.btFsc);
		btOutros = (Button) findViewById(R.id.btOutros);

		btMat.setOnClickListener((android.view.View.OnClickListener) this);
		btQmq.setOnClickListener((android.view.View.OnClickListener) this);
		btFsc.setOnClickListener((android.view.View.OnClickListener) this);
		btOutros.setOnClickListener((android.view.View.OnClickListener) this);

		int r = (int) (Math.random() * 255);
		int g = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		view = (View) findViewById(R.id.xmlMain);
		view.setBackgroundColor(Color.rgb(r, g, b));
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
		
		try {
			if (btFsc.getId() == ((Button) v).getId()) {

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if (btOutros.getId() == ((Button) v).getId()) {

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}