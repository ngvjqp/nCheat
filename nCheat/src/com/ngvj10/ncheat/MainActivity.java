package com.ngvj10.ncheat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ngvj10.ncheat.matematica.mainMatematica;

public class MainActivity extends Activity implements OnClickListener {

	Button btMat;
	Button btQmq;
	Button btFsc;
	Button btOutros;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btMat = (Button) findViewById(R.id.btMat);
		btQmq = (Button) findViewById(R.id.btQmq);
		btFsc = (Button) findViewById(R.id.btFsc);
		btOutros = (Button) findViewById(R.id.btOutros);

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
		if (btMat.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, mainMatematica.class));
		}
		if (btQmq.getId() == ((Button) v).getId()) {

		}
		if (btFsc.getId() == ((Button) v).getId()) {

		}
		if (btOutros.getId() == ((Button) v).getId()) {

		}

	}
}