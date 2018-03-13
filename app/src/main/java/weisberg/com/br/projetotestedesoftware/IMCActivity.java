package weisberg.com.br.projetotestedesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IMCActivity extends AppCompatActivity {

    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        buttonVoltar = (Button) findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IMCActivity.this, MenuActivity.class));
                finish();
            }
        });
    }

    public void buttonCalcularIMC(View view){

        try{
            EditText editTextPeso = (EditText) findViewById(R.id.editTextPeso);
            EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);

            float peso = Float.parseFloat(editTextPeso.getText().toString());
            float altura = Float.parseFloat(editTextAltura.getText().toString());
            String resultadoTexto = "";
            float resultado = new CalculadoraUtil().calcularIMC(peso,altura);//peso/(altura*altura);

            if(resultado < 17){
                resultadoTexto = "Muito abaixo do peso";
            }
            if(resultado >= 17 && resultado <= 18.49){
                resultadoTexto = "Abaixo do peso";
            }
            if(resultado >= 18.5 && resultado <= 24.99){
                resultadoTexto = "Peso normal";
            }
            if(resultado >= 25 && resultado <= 29.99){
                resultadoTexto = "Acima do peso";
            }
            if(resultado >= 30 && resultado <= 34.99){
                resultadoTexto = "Obesidade I";
            }
            if(resultado >= 35 && resultado <= 39.99){
                resultadoTexto = "Obesidade II (severa)";
            }
            if(resultado > 40){
                resultadoTexto = "Obesidade III (mórbida)";
            }

            Toast.makeText(getApplicationContext(), resultadoTexto+" imc: "+resultado, Toast.LENGTH_LONG).show();

        }catch (NumberFormatException ex){
            Toast.makeText(getApplicationContext(), "Preencha os dois campos!", Toast.LENGTH_LONG).show();
        }

    }

    public void buttonLimpar(View view){
        EditText editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);

        editTextPeso.setText("");
        editTextAltura.setText("");
    }
}
