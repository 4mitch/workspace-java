package br.com.caelum.leilao.dominio.servico;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromoTest {

	@Test
	public void deveRetornarVerdadeiroParaUmPalindromo() {
		//Cria��o do cen�rio
		String frase = "Anotaram a data da maratona";
		
		//Execu��o da unidade
		boolean ehPalindromo = new Palindromo().ehPalindromo(frase);
		
		//Execu��o do teste
		assertTrue(ehPalindromo);
	}
	
	@Test
	public void retornaFalsoParaUmaFraseNaoPalindromo() {
		//Cria��o do cen�rio
		String frase = "N�o � um palindromo";
		
		//Execu��o da unidade
		boolean ehPalindromo = new Palindromo().ehPalindromo(frase);
		
		//Execu�ao do teste
		assertFalse(ehPalindromo);
	}
}
