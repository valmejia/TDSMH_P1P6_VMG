package mx.edu.tesoem.isc.tsdmh.tdsmh_p1p6_vmg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class PrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtnombre, txtedad, txtcorreo, txttelefono;
    Button btn1enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        txttelefono = findViewById(R.id.txttelefono);
        txtcorreo = findViewById(R.id.txtcorreo);
        btn1enviar = findViewById(R.id.btn1enviar);
        btn1enviar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SegundoActivity.class);
        intent.putExtra("nombre", txtnombre.getText().toString());
        intent.putExtra("edad", txtedad.getText().toString());
        intent.putExtra("correo", txtcorreo.getText().toString());
        intent.putExtra("telefono", txttelefono.getText().toString());

        startActivity(intent);
    }


}