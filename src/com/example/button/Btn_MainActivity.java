package com.example.button;

import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Btn_MainActivity extends Activity implements OnClickListener,OnLongClickListener{
EditText etNombre;
Button btnEnviarR;
Button btnEnviarL;
TextView tvMensaje;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_btn__main);
		
		etNombre=(EditText)findViewById(R.id.etNombre);
		btnEnviarR=(Button)findViewById(R.id.btnEnviarRapido);
		tvMensaje=(TextView)findViewById(R.id.texMensaje);
		//agreagr escucha a l btnEnviar
		btnEnviarR.setOnClickListener(this);
		//
		btnEnviarL=(Button)findViewById(R.id.btnEnviarLento);
		btnEnviarL.setOnLongClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.btn__main, menu);
		return true;
	}

	//Accion al boton click
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//este metodo ejecuta las acciones de todos los votones
		//Switch necesario para saber que boto fue presionado
		switch(v.getId()){
		case R.id.btnEnviarRapido:
			String nomInvitado=etNombre.getText().toString();
			tvMensaje.setText("Targeta enviada a "+nomInvitado);
			break;
		}
		
		
	}

	@Override
	public boolean onLongClick(View v) {
		// TODO Auto-generated method stub cick mas lento}
		switch (v.getId()) {
		case R.id.btnEnviarLento:
			String nomInvitado=etNombre.getText().toString();
			tvMensaje.setText("Targeta enviada a "+nomInvitado);			
			break;

		default:
			break;
		}
		
		return false;
	}
	
	

}
