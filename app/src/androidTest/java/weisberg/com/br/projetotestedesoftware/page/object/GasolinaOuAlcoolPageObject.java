package weisberg.com.br.projetotestedesoftware.page.object;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;

import weisberg.com.br.projetotestedesoftware.R;

/**
 * Created by Weisberg on 13/03/2018.
 */

public class GasolinaOuAlcoolPageObject {

    private Solo solo;

    private EditText editTextGasolina;
    private EditText editTextAlcool;
    private Button buttonCalcular;

    public GasolinaOuAlcoolPageObject(Solo soloRef){
        this.solo = soloRef;
        updateCampos();
    }


    private void updateCampos() {
        editTextGasolina = (EditText) solo.getView(R.id.editTextGasolina);
        editTextAlcool = (EditText) solo.getView(R.id.editTextAlcool);
        buttonCalcular = (Button) solo.getView(R.id.buttonCalcularGasAlcool);
    }

    public void preencherCampos(String gasolina, String alcool){
        solo.enterText(editTextGasolina, gasolina);
        solo.enterText(editTextAlcool, alcool);
    }

    public void clickBotaoCalcular(){
        solo.clickOnView(buttonCalcular);
    }
}
