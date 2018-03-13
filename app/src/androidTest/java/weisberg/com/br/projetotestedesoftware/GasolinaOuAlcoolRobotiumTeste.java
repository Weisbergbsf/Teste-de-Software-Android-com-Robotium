package weisberg.com.br.projetotestedesoftware;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import org.junit.Assert;

import weisberg.com.br.projetotestedesoftware.page.object.GasolinaOuAlcoolPageObject;
import weisberg.com.br.projetotestedesoftware.page.object.IMCPageObject;

/**
 * Created by Weisberg on 13/03/2018.
 */

public class GasolinaOuAlcoolRobotiumTeste extends ActivityInstrumentationTestCase2<GasolinaOuAlcoolActivity>{

    private Solo solo;
    private GasolinaOuAlcoolPageObject gasolinaOuAlcoolPageObject;

    public GasolinaOuAlcoolRobotiumTeste() {
        super(GasolinaOuAlcoolActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        gasolinaOuAlcoolPageObject = new GasolinaOuAlcoolPageObject(solo);
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testCalculaGasolinaOuAlcool() throws Exception{
        String gasolina = "3.55";
        String alcool = "2.58";
        String resultatoEsperado = "25.28";
        gasolinaOuAlcoolPageObject.preencherCampos(gasolina,alcool);
        gasolinaOuAlcoolPageObject.clickBotaoCalcular();
        Assert.assertTrue(solo.searchText("Abasteça com gasolina"));
    }
}
