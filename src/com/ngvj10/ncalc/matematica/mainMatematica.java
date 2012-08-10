package com.ngvj10.ncalc.matematica;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.ngvj10.ncalc.R;
import com.ngvj10.ncalc.matematica.area.Areas;

public class mainMatematica extends Activity implements OnClickListener {

	Button deltaBaskhara;
	Button Baskhara;
	Button formGPA;
	Button areas;
	View view;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.matematica);

		deltaBaskhara = (Button) findViewById(R.id.delta_baskhara);
		Baskhara = (Button) findViewById(R.id.baskhara);
		formGPA = (Button) findViewById(R.id.formGPAlayoutMtm);
		areas = (Button) findViewById(R.id.btnareas);

		deltaBaskhara
				.setOnClickListener((android.view.View.OnClickListener) this);
		Baskhara.setOnClickListener((android.view.View.OnClickListener) this);
		formGPA.setOnClickListener((android.view.View.OnClickListener) this);
		areas.setOnClickListener((android.view.View.OnClickListener) this);

		int r = (int) (Math.random() * 255);
		int g = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		view = (View) findViewById(R.id.xmlmtm);
		view.setBackgroundColor(Color.rgb(r, g, b));
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {

		if (deltaBaskhara.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, deltaBaskhara.class));
		}
		if (Baskhara.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, Baskhara.class));
		}
		if (formGPA.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, formGPA.class));
		}
		if (areas.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, Areas.class));
		}
	}

}