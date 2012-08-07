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

public class formGPA extends Activity implements OnClickListener {

	EditText a1;
	EditText an;
	EditText n;
	TextView resultado;
	Button calcularD;
View view;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.progaritmetica);

		a1 = (EditText) findViewById(R.id.a1);
		an = (EditText) findViewById(R.id.an);
		n = (EditText) findViewById(R.id.n);
		resultado = (TextView) findViewById(R.id.resultadoFGPA);
		calcularD = (Button) findViewById(R.id.calculaFGPA);
		

		calcularD.setOnClickListener((android.view.View.OnClickListener) this);
		a1.setOnClickListener((android.view.View.OnClickListener) this);
		an.setOnClickListener((android.view.View.OnClickListener) this);
		n.setOnClickListener((android.view.View.OnClickListener) this);
		
		int r = (int) (Math.random() * 255);
		int g = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		view = (View) findViewById(R.id.xmlFGPA);
		view.setBackgroundColor(Color.rgb(r, g, b));
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.calculaFGPA:
			PA();
			break;
		case R.id.a1:
			this.a1.setText("");
			break;
		case R.id.an:
			this.an.setText("");
			break;
		case R.id.n:
			this.n.setTag("");
		default:
			throw new RuntimeException("Tem q ve isso ae");
		}
	}

	public void PA() {
		int a11 = Integer.parseInt((String) a1.getText().toString());
		int ann = Integer.parseInt((String) an.getText().toString());
		int nn = Integer.parseInt((String) n.getText().toString());
		// an=a1(n-1).r

		double t;
		double r;

		nn--;
		t = ann - a11;
		r = t / nn;

		double resultadoO = r;
		resultado.setText("Resultado: " + resultadoO);
	}

}