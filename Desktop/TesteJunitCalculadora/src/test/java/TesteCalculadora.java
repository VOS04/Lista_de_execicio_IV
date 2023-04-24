import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {
	public Calculadora cal = new Calculadora();

	@Test
	void testSomar() {
		int SomarDoisValores = cal.somar(2, 2);
		assertEquals(4,SomarDoisValores);
	}
	@Test
	void testSubtrair() {
		int SubtrairComSucesso = cal.subtrair(2, 2);
		assertEquals(0,SubtrairComSucesso);
	
	}

	@Test
	void testMultiplicar() {
		int MultiplicarValores = cal.multiplicar(2, 2);
		assertEquals(4,MultiplicarValores);
	}

	@Test
	void testDividir() {
		double DivisãoNumeros = cal.dividir(2, 2);
		assertEquals(1,DivisãoNumeros);
	}

	@Test
	void testPotenciar() {
		double PotenciaDeDoisValores = cal.potenciar(2, 1);
		assertEquals(2,PotenciaDeDoisValores);
	}

}
