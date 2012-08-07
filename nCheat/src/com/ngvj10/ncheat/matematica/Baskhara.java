package com.ngvj10.ncheat.matematica;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ngvj10.ncheat.R;

public class Baskhara extends Activity implements OnClickListener {

	EditText a;
	EditText b;
	EditText Delta;
	TextView resultado;
	Button calcularB;
	View view;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.baskhara);

		a = (EditText) findViewById(R.id.aBaskhara);
		b = (EditText) findViewById(R.id.bBaskhara);
		Delta = (EditText) findViewById(R.id.deltaBaskhara);
		resultado = (TextView) findViewById(R.id.resultadoBaskhara);
		calcularB = (Button) findViewById(R.id.calculaBaskhara);

		a.setOnClickListener((android.view.View.OnClickListener) this);
		b.setOnClickListener((android.view.View.OnClickListener) this);
		Delta.setOnClickListener((android.view.View.OnClickListener) this);
		calcularB.setOnClickListener((android.view.View.OnClickListener) this);

		int r = (int) (Math.random() * 255);
		int g = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		view = (View) findViewById(R.id.xmlBas);
		view.setBackgroundColor(Color.rgb(r, g, b));
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.calculaBaskhara:
			double a = Integer.parseInt((String) this.a.getText().toString());
			double b = Integer.parseInt((String) this.b.getText().toString());
			double delta = Integer.parseInt((String) this.Delta.getText()
					.toString());

			delta = Math.sqrt(delta);

			double resultado1 = ((b * -1) + delta) / (2 * a);

			double resultado2 = ((b * -1) - delta) / (2 * a);

			resultado.setText("Resultado: x'=" + resultado1 + " x\"="
					+ resultado2);
			break;
		case R.id.aBaskhara:
			this.a.setText("");
			break;
		case R.id.bBaskhara:
			this.b.setText("");
			break;
		case R.id.deltaBaskhara:
			this.Delta.setText("");
			break;
		default:
			throw new RuntimeException("Unknow button ID");
		}

	}

}