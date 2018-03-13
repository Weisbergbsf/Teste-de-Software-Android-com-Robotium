package weisberg.com.br.projetotestedesoftware.page.object;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;

import weisberg.com.br.projetotestedesoftware.R;

/**
 * Created by Weisberg on 12/03/2018.
 */

public class IMCPageObject {

    private Solo solo;

    private EditText editTextPeso;
    private EditText editTextAltura;
    private Button buttonCalcular;

    public IMCPageObject(Solo soloRef){
        this.solo = soloRef;
        updateCampos();
    }

    private void updateCampos() {
        editTextPeso = (EditText) solo.getView(R.id.editTextPeso);
        editTextAltura = (EditText) solo.getView(R.id.editTextAltura);
        buttonCalcular = (Button) solo.getView(R.id.buttonCalcularIMC);
    }

    public void preencherCampos(String peso, String altura){
        solo.enterText(editTextPeso, peso);
        solo.enterText(editTextAltura, altura);
    }

    public void clickBotaoCalcular(){
        solo.clickOnView(buttonCalcular);
    }
}
