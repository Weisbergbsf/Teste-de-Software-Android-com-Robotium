package weisberg.com.br.projetotestedesoftware;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IMCTeste {

    private CalculadoraUtil calculadoraUtil;

    @Before
    public void setUp() throws Exception{
        calculadoraUtil = new CalculadoraUtil();
    }

    @Test
    public void testMuitoAbaixoDoPeso() throws Exception{
        float inputPeso = 50.0f;
        float inputAltura = 1.79f;
        float output;
        float expected = 15.60f;
        float delta = 0.1f;

        output = calculadoraUtil.calcularIMC(inputPeso,inputAltura);
        assertEquals(expected, output, delta);
    }

    @Test
    public void testAbaixoDoPeso() throws Exception{
        float inputPeso = 55.0f;
        float inputAltura = 1.79f;
        float output;
        float expected = 17.16f;
        float delta = 0.1f;

        output = calculadoraUtil.calcularIMC(inputPeso,inputAltura);
        assertEquals(expected, output, delta);
    }

    @Test
    public void testPesoNormal() throws Exception{
        float inputPeso = 60.0f;
        float inputAltura = 1.79f;
        float output;
        float expected = 18.72f;
        float delta = 0.1f;

        output = calculadoraUtil.calcularIMC(inputPeso,inputAltura);
        assertEquals(expected, output, delta);
    }

    @Test
    public void testAcimaDoPeso() throws Exception{
        float inputPeso = 81.0f;
        float inputAltura = 1.79f;
        float output;
        float expected = 25.28f;
        float delta = 0.1f;

        output = calculadoraUtil.calcularIMC(inputPeso,inputAltura);
        assertEquals(expected, output, delta);
    }

    @Test
    public void testObesidadeI() throws Exception{
        float inputPeso = 97.0f;
        float inputAltura = 1.79f;
        float output;
        float expected = 30.27f;
        float delta = 0.1f;

        output = calculadoraUtil.calcularIMC(inputPeso,inputAltura);
        assertEquals(expected, output, delta);
    }

    @Test
    public void testObesidadeII() throws Exception{
        float inputPeso = 120.0f;
        float inputAltura = 1.79f;
        float output;
        float expected = 37.45f;
        float delta = 0.1f;

        output = calculadoraUtil.calcularIMC(inputPeso,inputAltura);
        assertEquals(expected, output, delta);
    }

    @Test
    public void testObesidadeIII() throws Exception{
        float inputPeso = 150.0f;
        float inputAltura = 1.79f;
        float output;
        float expected = 46.81f;
        float delta = 0.1f;

        output = calculadoraUtil.calcularIMC(inputPeso,inputAltura);
        assertEquals(expected, output, delta);
    }


}
