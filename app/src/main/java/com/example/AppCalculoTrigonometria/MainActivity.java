package com.example.AppCalculoTrigonometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText DiametroCirculo;
    private EditText LadoARectangulo;
    private EditText LadoBRectangulo;
    private EditText AlturaTriangulo;
    private EditText BaseTriangulo;
    private TextView Mostrar;
    private RadioButton AreaCirculo;
    private RadioButton AreaRectangulo;
    private RadioButton AreaTriangulo;
    private int Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DiametroCirculo = (EditText) findViewById(R.id.DiametroCirculo);
        LadoARectangulo = (EditText) findViewById(R.id.LadoARectangulo);
        LadoBRectangulo = (EditText) findViewById(R.id.LadoBRectangulo);
        AlturaTriangulo = (EditText) findViewById(R.id.AlturaTriangulo);
        BaseTriangulo = (EditText) findViewById(R.id.BaseTriangulo);

        Mostrar= (TextView) findViewById(R.id.Mostrar);

        AreaCirculo= (RadioButton) findViewById(R.id.AreaCirculo);
        AreaRectangulo= (RadioButton) findViewById(R.id.AreaRectangulo);
        AreaTriangulo= (RadioButton) findViewById(R.id.AreaTriangulo);
    }

    public void Calcular(View v){
        if ((AreaCirculo.isChecked())&(DiametroCirculo.getText().toString().trim().length() > 0)){
            Resultado= (int) (Math.pow(Double.parseDouble(DiametroCirculo.getText().toString()), 2.0) * Math.PI);
            Mostrar.setText("El area del Circulo es: "+Resultado);
            Toast.makeText(this,"" + Resultado, Toast.LENGTH_SHORT).show();
        }else if ((AreaRectangulo.isChecked())&(LadoARectangulo.getText().toString().trim().length() > 0)&(LadoBRectangulo.getText().toString().trim().length() > 0)){
            int LadoA = Integer.parseInt(LadoARectangulo.getText().toString().trim());
            int LadoB = Integer.parseInt(LadoBRectangulo.getText().toString().trim());
            Resultado=(int) (LadoA)*(LadoB);
            Mostrar.setText("El area del Rectangulo es: "+Resultado);
            Toast.makeText(this,"" + Resultado, Toast.LENGTH_SHORT).show();
        }else if ((AreaTriangulo.isChecked())&(AlturaTriangulo.getText().toString().trim().length() > 0)&(BaseTriangulo.getText().toString().trim().length() > 0)){
            int Altura = Integer.parseInt(AlturaTriangulo.getText().toString().trim());
            int Base = Integer.parseInt(BaseTriangulo.getText().toString().trim());
            Resultado=(int) (0.5*Altura*Base);
            Mostrar.setText("El area del Triangulo es: "+Resultado);
            Toast.makeText(this,"" + Resultado, Toast.LENGTH_SHORT).show();
        }else{
            Mostrar.setText("Ingrese Valores");
            Toast.makeText(this,"Ingrese Valores", Toast.LENGTH_SHORT).show();
        }
    }
}
