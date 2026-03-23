package mx.edu.tesoem.isc.tsdmh.tdsmh_p1p6_vmg;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundoActivity extends AppCompatActivity {

    TextView lblnombre, lbledad, lblcorreo, lbltelefono, lbltomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("nombre");
        String edad = bundle.getString("edad");
        String correo = bundle.getString("correo");
        String telefono = bundle.getString("telefono");


        lblnombre = findViewById(R.id.lblnombre);
        lblnombre.setText(nombre);

        lbledad = findViewById(R.id.lbledad);
        lbledad.setText(edad);

        lblcorreo = findViewById(R.id.lblcorreo);
        lblcorreo.setText(correo);

        lbltelefono = findViewById(R.id.lbltelefono);
        lbltelefono.setText(telefono);

        lbltomar = findViewById(R.id.lbltomar);

        int e = Integer.parseInt(lbledad.getText().toString());
        if (e<=20){
            lbltomar.setText("no puedes tomar");
        }else {
            lbltomar.setText("puedes tomar");
        }

    }

}