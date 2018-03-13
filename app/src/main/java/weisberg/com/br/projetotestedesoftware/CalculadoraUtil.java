package weisberg.com.br.projetotestedesoftware;

/**
 * Created by Weisberg on 12/03/2018.
 */

public class CalculadoraUtil {

    public float calcularIMC(float peso, float altura){
        return peso/(altura*altura);
    }

    public float calcularGasolinaOuAlcool(float gasolina, float alcool){
        return alcool/gasolina;
    }
}
