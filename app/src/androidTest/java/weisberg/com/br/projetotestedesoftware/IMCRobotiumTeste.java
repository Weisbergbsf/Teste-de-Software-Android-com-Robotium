package weisberg.com.br.projetotestedesoftware;


import android.test.ActivityInstrumentationTestCase2;


import com.robotium.solo.Solo;

import org.junit.Assert;

import weisberg.com.br.projetotestedesoftware.page.object.IMCPageObject;

public class IMCRobotiumTeste extends ActivityInstrumentationTestCase2<IMCActivity>{

    private Solo solo;
    private IMCPageObject imcPageObject;

    public IMCRobotiumTeste(){
        super(IMCActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        imcPageObject = new IMCPageObject(solo);
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testCalculaIMC() throws Exception{
        String peso = "81";
        String altura = "1.79";
        String resultatoEsperado = "25.28";
        imcPageObject.preencherCampos(peso,altura);
        imcPageObject.clickBotaoCalcular();
        Assert.assertTrue(solo.searchText("Acima do peso"));
    }
}
