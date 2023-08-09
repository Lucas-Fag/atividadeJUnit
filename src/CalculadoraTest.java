import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testeSomar() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(15.0, calculadora.somar(10, 5), 0.1);
    }

    @Test
    public void testeSomarDecimal() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(12.5, calculadora.somar(6.5, 6), 0.1);
    }

    @Test
    public void testeSubtrair() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(-12.0, calculadora.subtrair(-6, 6), 0.1);
    }

    @Test
    public void testeSubtrairDecimal() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(422727.17, calculadora.subtrair(422728.18, 1.01), 0.1);
    }

    @Test
    public void testeMultiplicar() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(12.0, calculadora.multiplicar(6, 2), 0.1);
    }

    @Test
    public void testeMultiplicarDecimal() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(6.4, calculadora.multiplicar(3.2, 2), 0.1);
    }

    @Test
    public void testeDividir() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(3.0, calculadora.dividir(6, 2), 0.1);
    }

    @Test
    public void testeDividirDecimal() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(6.25, calculadora.dividir(12.5, 2), 0.01);
    }

    @Test(expected = AssertionError.class)
    public void dividedByZero() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(3.0, calculadora.dividir(6, 0), 0.1);
    }

}
