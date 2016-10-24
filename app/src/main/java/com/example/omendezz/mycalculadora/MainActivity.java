package com.example.omendezz.mycalculadora;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText vNumeroA;
    private EditText vNumeroB;
    private EditText vResultado;
    private Button botonCalcular;

    calculadora ObjCalculadora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.vNumeroA = (EditText) findViewById(R.id.NumeroA);
        this.vNumeroB = (EditText) findViewById(R.id.NumeroB);
        this.vResultado = (EditText) findViewById(R.id.Resultado);
        botonCalcular = (Button) findViewById(R.id.button);
        ObjCalculadora = new calculadora();

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjCalculadora.setA(Double.parseDouble(vNumeroA.getText().toString()));
                ObjCalculadora.setB(Double.parseDouble(vNumeroB.getText().toString()));
                vResultado.setText("" + ObjCalculadora.sumar());

            }
        });
    }
}
