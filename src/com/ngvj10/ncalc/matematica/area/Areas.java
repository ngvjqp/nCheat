package com.ngvj10.ncalc.matematica.area;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ngvj10.ncalc.R;

public class Areas extends Activity implements OnClickListener {

	Button Tri;
	Button Quad;
	Button Circ;
	View view;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.areas);

		Tri = (Button) findViewById(R.id.botaoAreaTriangulo);
		Quad = (Button) findViewById(R.id.botaoAreaRetangulo);
		Circ = (Button) findViewById(R.id.botaoAreaCirculo);

		Tri.setOnClickListener((android.view.View.OnClickListener) this);
		Quad.setOnClickListener((android.view.View.OnClickListener) this);
		Circ.setOnClickListener((android.view.View.OnClickListener) this);

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

		if (Tri.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, AreaTri.class));
		}
		if (Quad.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, AreaQuad.class));
		}
		if (Circ.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, AreaCirc.class));
		}
	}

}