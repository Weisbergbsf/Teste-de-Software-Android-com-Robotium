package weisberg.com.br.projetotestedesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button buttonIMC;
    private Button buttonGasolinaOuAlcool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonIMC = (Button) findViewById(R.id.buttonIMC);
        buttonGasolinaOuAlcool = (Button) findViewById(R.id.buttonGasolinaOuAlcool);

        buttonIMC.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, IMCActivity.class));
            }
        });

        buttonGasolinaOuAlcool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, GasolinaOuAlcoolActivity.class));
            }
        });
    }
}
