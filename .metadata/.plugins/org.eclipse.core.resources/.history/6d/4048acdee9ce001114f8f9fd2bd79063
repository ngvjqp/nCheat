package com.ngvj10.ncheat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class matematica extends Activity implements OnClickListener {

	EditText aDelta;
	EditText bDelta;
	EditText cDelta;
	TextView resultado;
	Button calcularD;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.matematica);

		aDelta = (EditText) findViewById(R.id.aDelta);
		bDelta = (EditText) findViewById(R.id.bDelta);
		cDelta = (EditText) findViewById(R.id.cDelta);
		resultado = (TextView) findViewById(R.id.resultado);
		calcularD = (Button) findViewById(R.id.calculaDelta);

		calcularD.setOnClickListener((android.view.View.OnClickListener) this);

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {

		if (calcularD.getId() == ((Button) v).getId()) {

			int aO = Integer.parseInt((String) aDelta.getText().toString());
			int bO = Integer.parseInt((String) bDelta.getText().toString());
			int cO = Integer.parseInt((String) cDelta.getText().toString());

			double resultadoO = (bO * bO) - 4 * (aO * cO);

			resultado.setText("Resultado: " + resultadoO);
		}
	}

}
