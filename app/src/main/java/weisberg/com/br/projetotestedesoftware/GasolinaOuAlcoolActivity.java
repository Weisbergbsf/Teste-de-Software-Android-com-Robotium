package weisberg.com.br.projetotestedesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GasolinaOuAlcoolActivity extends AppCompatActivity {

    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasolina_ou_alcool);

        buttonVoltar = (Button) findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GasolinaOuAlcoolActivity.this, MenuActivity.class));
                finish();
            }
        });
    }

    public void buttonCalcularGasolinaOuAlcool(View view){
        try{
            EditText editTextGasolina = (EditText) findViewById(R.id.editTextGasolina);
            EditText editTextAlcool = (EditText) findViewById(R.id.editTextAlcool);

            float gasolna = Float.parseFloat(editTextGasolina.getText().toString());
            float alcool = Float.parseFloat(editTextAlcool.getText().toString());
            String resultadoTexto = "";
            float resultado = new CalculadoraUtil().calcularGasolinaOuAlcool(gasolna, alcool);
            if(resultado < 0.7){
                resultadoTexto = "Abasteça com álcool";
            }else{
                resultadoTexto = "Abasteça com gasolina";
            }

            Toast.makeText(getApplicationContext(), resultadoTexto, Toast.LENGTH_LONG).show();

        }catch (NumberFormatException ex){
            Toast.makeText(getApplicationContext(), "Preencha os dois campos!", Toast.LENGTH_LONG).show();
        }
    }

    public void buttonLimpar(View view){
        EditText editTextGasolina = (EditText) findViewById(R.id.editTextGasolina);
        EditText editTextAlcool = (EditText) findViewById(R.id.editTextAlcool);

        editTextGasolina.setText("");
        editTextAlcool.setText("");
    }
}
