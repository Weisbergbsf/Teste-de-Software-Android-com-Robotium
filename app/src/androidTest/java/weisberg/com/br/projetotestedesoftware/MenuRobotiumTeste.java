package weisberg.com.br.projetotestedesoftware;

import android.test.ActivityInstrumentationTestCase2;
import android.view.KeyEvent;

import com.robotium.solo.Solo;

/**
 * Created by Weisberg on 13/03/2018.
 */

public class MenuRobotiumTeste extends ActivityInstrumentationTestCase2<MenuActivity> {

    private Solo solo;

    public MenuRobotiumTeste() {
        super(MenuActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testAccessCalculadoraIMC()throws Exception{
        solo.clickOnButton("Calculadora IMC");
        solo.assertCurrentActivity("Não está na activity IMC", IMCActivity.class);
        solo.sendKey(KeyEvent.KEYCODE_BACK);
        solo.assertCurrentActivity("Não está na activity Menu", MenuActivity.class);
    }

    public void testAccessGasolinaOuAlcool()throws Exception{
        solo.clickOnButton("Gasolina ou Alcool");
        solo.assertCurrentActivity("Não está na activity Gasolina ou Álcool", GasolinaOuAlcoolActivity.class);
        solo.sendKey(KeyEvent.KEYCODE_BACK);
        solo.assertCurrentActivity("Não está na activity Menu", MenuActivity.class);
    }
}
