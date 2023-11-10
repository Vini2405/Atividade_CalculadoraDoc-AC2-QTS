package atividadeqts;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CalculadoraTesteJUnit {

// CENÁRIO DE TESTE (SOMA):
	
	// Cenário de teste 1: Soma de dois valores positivos.
	@Test
	public void SomarDoisNumerosPositivos(){
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(12, soma);
		
	/*	Neste caso, podemos observar que os valores inseridos para soma é 3 e 7, o que somando-os resultará em 10, 
	 * 	porém no assert foi colocado que o resultado esperado é 12. Logo, o JUnit apresentará um erro ou falha, 
	 *  dizendo que o valor esperado é 12, porém o resultado obtido foi diferente, no caso, 10.
	*/	
	}

	// Cenário de teste 2: Soma de dois valores sendo um zero.
	@Test
	public void SomarUmNumeroPositivoComZero(){
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 0);
		
		Assert.assertEquals(3, soma);
		
	/*	Já neste caso, podemos observar que foi informado ao JUnit que o resultado esperado da soma entre 3 e 0 seja 3.
	 *  Como o valor esperado é correto, o JUnit apresentará uma mensagem dizendo que o resultado esperado está correto e que
	 *  a aplicação não apresenta nenhuma falha ou erro referente a este método.
	*/	
	}
	
	// Cenário de teste 3: Soma de dois valores sendo que ambos são zero.
	@Test
	public void SomarDoisZeros(){
		Calculadora calc = new Calculadora();
		int soma = calc.somar(0, 0);
		
		Assert.assertEquals(0, soma);
		
	// O valor esperado foi 0, como resultado da soma será 0, o JUnit não apresentará nenhum erro ou falha nesse método.		
	}
	
	// Cenário de teste 4: Soma de dois valores sendo um negativo.
	@Test
	public void SomarUmNumeroNegativoComPositivo(){
		Calculadora calc = new Calculadora();
		int soma = calc.somar(-3, 10);
		
		Assert.assertEquals(13, soma);
		
	/* O valor esperado foi 13, porém como há um número negativo, será subtraido 3 em 10, ao invés de somar, 
	 * portanto o resultado será 7 e o JUnit apresentará um falha.
	 */
	}
	
	// Cenário de teste 5: Soma de dois valores negativos.
	@Test
	public void SomarDoisNumerosNegativos(){
		Calculadora calc = new Calculadora();
		int soma = calc.somar(-3, -7);
		
		Assert.assertEquals(10, soma);
		
	/* O valor esperado foi 10, porém como há dois números negativos, será somado 3 em 7, porém o sinal de negativo se manterá,
	 * portanto o resultado será -10, ao invés de 10, e o JUnit apresentará um falha.
	 */
	}
	
	// Cenário de teste 6: Soma de dois valores sendo um quebrado.
	@Test
	public void SomaComUmNumeroQuebrado(){
		Calculadora calc = new Calculadora();
		int soma = calc.somar(4, 1.5);
		
		Assert.assertEquals(10, soma);
		
	/* O valor esperado foi 5, porém como há um valor quebrado, ou seja, do tipo real, não será possível realizar a operação, 
	 * pois os valores que devem ser inseridos são apenas inteiros, portanto o JUnit apresentará um erro, ao invés de uma falha,
	 * pois dessa vez, não foi apenas uma falha entre um resultado e um resultado esperado e sim um erro de sintaxe, que prejudica
	 * o funcionamento da aplicação.
	 */
	}
	
	
// CENÁRIO DE TESTE (SUBTRAÇÃO):
	
	// Cenário de teste 1: Subtração de dois valores positivos.
		@Test
		public void SubtrairDoisNumerosPositivos(){
			Calculadora calc = new Calculadora();
			int subtracao = calc.subtrair(3, 7);
			
			Assert.assertEquals(4, subtracao);
			
		/*	Neste caso, podemos observar que os valores inseridos para subtração é 3 e 7, o que subtraindo-os resultará em 4, 
		 * 	como o valor inserido no assert é 4 também, ou seja, o resultado esperado é 4, não apresentará nenhuma falha ou erro,
		 *  pois o resultado irá coincidir com o resultado esperado.
		*/	
		}

		// Cenário de teste 2: Subtração de dois valores sendo um zero.
		@Test
		public void SubtrairUmNumeroPositivoComZero(){
			Calculadora calc = new Calculadora();
			int subtracao = calc.subtrair(3, 0);
			
			Assert.assertEquals(2, subtracao);
			
		/*	Já neste caso, podemos observar que foi informado ao JUnit que o resultado esperado da subtração entre 3 e 0 seja 2.
		 *  Como o valor esperado está incorreto, o JUnit apresentará uma mensagem dizendo que o resultado esperado está incorreto
		 *   e que a aplicação apresenta uma falha referente a este método.
		*/	
		}
		
		// Cenário de teste 3: Subtração de dois valores sendo que ambos são zero.
		@Test
		public void SubtrairDoisZeros(){
			Calculadora calc = new Calculadora();
			int subtracao = calc.subtrair(0, 0);
			
			Assert.assertEquals(0, subtracao);
			
		// O valor esperado foi 0, como resultado da subtração será 0, o JUnit não apresentará nenhum erro ou falha nesse método.	
		}
		
		// Cenário de teste 4: Subtração de dois valores sendo um negativo.
		@Test
		public void SubtrairUmNumeroNegativoComPositivo(){
			Calculadora calc = new Calculadora();
			int subtracao = calc.subtrair(-3, 10);
			
			Assert.assertEquals(7, subtracao);
			
		/* O valor esperado foi 7, porém como há um número negativo e a operação desta vez é subtração, será somado 3 em 10, 
		 * pois temos um valor negativo (-3) e consequentemente o 10 é negativo também, por conta da operação de subtração,
		 * portanto o resultado manterá o sinal de negativo e será -13 e o JUnit apresentará um falha neste método.
		 */
		}
		
		// Cenário de teste 5: Subtração de dois valores negativos.
		@Test
		public void SubtrairDoisNumerosNegativos(){
			Calculadora calc = new Calculadora();
			int subtracao = calc.subtrair(-3, -10);
			
			Assert.assertEquals(7, subtracao);
			
		/* O valor esperado foi 7, no caso, como há dois números negativos, será subtraido 3 em 10, isso irá acontecer pois como é
		 * uma operação de subtração, o sinal de menos da conta, irá se juntar com o sinal do -10, 
		 * consequentemente ficando 10 positivo, portanto, o resultado ficará 7 e o JUnit não irá apontar nenhuma falha/erro.
		 */
		}
		
		// Cenário de teste 6: Subtração de dois valores sendo um quebrado.
		@Test
		public void SubtrairComUmNumeroQuebrado(){
			Calculadora calc = new Calculadora();
			int subtracao = calc.subtrair(3, 2.5);
			
			Assert.assertEquals(1, subtracao);
			
			/* O valor esperado foi 1, porém como há um valor quebrado, ou seja, do tipo real, não será possível realizar a operação, 
			 * pois os valores que devem ser inseridos são apenas inteiros, portanto o JUnit apresentará um erro, ao invés de uma falha,
			 * pois dessa vez, não foi apenas uma falha entre um resultado e um resultado esperado e sim um erro de sintaxe, que prejudica
			 * o funcionamento da aplicação.
			*/
		}
		
// CENÁRIO DE TESTE (MULTIPLICAÇÃO):
		
	// Cenário de teste 1: Multiplicação de dois valores positivos.
		@Test
		public void MultiplicarDoisNumerosPositivos(){
			Calculadora calc = new Calculadora();
			int multiplicacao = calc.multiplicar(3, 7);
				
			Assert.assertEquals(21, multiplicacao);
				
		/*	Neste caso, podemos observar que os valores inseridos para multiplicação é 3 e 7, o que multiplicando-os resultará em 21, 
		* 	como o valor inserido no assert é 4 também, ou seja, o resultado esperado é 21, não apresentará nenhuma falha ou erro,
		*  	pois o resultado irá coincidir com o resultado esperado.
		*/	
		}

		// Cenário de teste 2: Multiplicação de dois valores sendo um zero.
		@Test
		public void MultiplicarUmNumeroPositivoComZero(){
			Calculadora calc = new Calculadora();
			int multiplicacao = calc.multiplicar(3, 0);
				
			Assert.assertEquals(3, multiplicacao);
				
		/*	Já neste caso, podemos observar que foi informado ao JUnit que o resultado esperado da multiplicação entre 3 e 0 seja 3.
		*	Porém o reultado dessa operação dará 0, pois todo número multiplicado por zero resultará em 0.
		*  	Como o valor esperado está incorreto, o JUnit apresentará uma mensagem dizendo que o resultado esperado está incorreto
		*   e que a aplicação apresenta uma falha referente a este método.
		*/	
		}
			
		// Cenário de teste 3: Multiplicação de dois valores sendo que ambos são zero.
		@Test
		public void MultiplicarDoisZeros(){
			Calculadora calc = new Calculadora();
			int multiplicacao = calc.multiplicar(0, 0);
				
			Assert.assertEquals(0, multiplicacao);
				
		// O valor esperado foi 0, como resultado da multiplicação será 0, o JUnit não apresentará nenhum erro ou falha nesse método.		
		}
			
		// Cenário de teste 4: Multiplicação de dois valores sendo um negativo.
		@Test
		public void MultiplicarUmNumeroNegativoComPositivo(){
			Calculadora calc = new Calculadora();
			int multiplicacao = calc.multiplicar(-3, 10);
				
			Assert.assertEquals(-30, multiplicacao);
				
		/* O valor esperado foi -30, como há um número negativo e a operação desta vez é multiplicação, o resultado estará correto, 
		* pois temos um valor negativo (-3), por conta da operação ser multiplicação, precisará aplicar a regra de sinal,
		* consequentemente tornando o resultado negativo, com isso o JUnit não apresentará nenhuma falha.
		*/
		}
			
		// Cenário de teste 5: Multiplicação de dois valores negativos.
		@Test
		public void MultiplicarDoisNumerosNegativos(){
			Calculadora calc = new Calculadora();
			int multiplicacao = calc.multiplicar(-3, -10);
				
			Assert.assertEquals(-30, multiplicacao);
				
		/* O valor esperado foi -30, no caso, como há dois números negativos, o resultado dará positivo, pois também aplicará regra de sinal,
		 * o que consequentemente tornará o resultado 30 positivo. Com isso o JUnit apresentará uma falha.
		*/
		}
		
		// Cenário de teste 6: Multiplicação de dois valores sendo um quebrado.	
		@Test
		public void MultiplicarComUmNumeroQuebrado(){
			Calculadora calc = new Calculadora();
			int multiplicacao = calc.multiplicar(3, 2.5);
				
			Assert.assertEquals(6, multiplicacao);
				
			/* O valor esperado foi 6, porém como há um valor quebrado, ou seja, do tipo real, não será possível realizar a operação, 
			* pois os valores que devem ser inseridos são apenas inteiros, portanto o JUnit apresentará um erro, ao invés de uma falha,
			* pois dessa vez, não foi apenas uma falha entre um resultado e um resultado esperado e sim um erro de sintaxe, que prejudica
			* o funcionamento da aplicação.
			*/
		}

// CENÁRIO DE TESTE (DIVISÃO):
		
		// Cenário de teste 1: Divisão de dois valores positivos.
		@Test
		public void DividirDoisNumerosPositivos(){
			Calculadora calc = new Calculadora();
			int divisao = calc.dividir(5, 10);
					
			Assert.assertEquals(2, divisao);
					
		/*	Neste caso, podemos observar que os valores inseridos para divisão é 5 e 10, o que dividindo-os resultará em 2, 
		* 	como o valor inserido no assert é 2 também, ou seja, o resultado esperado é 2, não apresentará nenhuma falha ou erro,
		*  	pois o resultado irá coincidir com o resultado esperado.
		*/	
		}

		// Cenário de teste 2: Divisão de dois valores sendo um zero.
		@Test
		public void DividirUmNumeroPositivoComZero(){
			Calculadora calc = new Calculadora();
			int divisao = calc.dividir(3, 0);
					
			Assert.assertEquals(0, divisao);
					
		/*	Já neste caso, podemos observar que foi informado ao JUnit que o resultado esperado da divisão entre 3 e 0 seja 0.
		*	Porém não será possível executar essa conta, pois não é possível dividir NENHUM número por zero.
		*  	Como não é possível executar esta conta, o JUnit apresentará um erro ao invés de uma falha.
		*/	
		}
				
		// Cenário de teste 3: Divisão de dois valores sendo que ambos são zero.
		@Test
		public void DividirDoisZeros(){
			Calculadora calc = new Calculadora();
			int divisao = calc.dividir(0, 0);
					
			Assert.assertEquals(0, divisao);
					
		//  O valor esperado foi 0, como dito anteriormente não é possível dividir por 0, 
		//	portanto o JUnit também apresentará um erro neste método.		
		}
				
		// Cenário de teste 4: Divisão de dois valores sendo um negativo.
		@Test
		public void DividirUmNumeroNegativoComPositivo(){
			Calculadora calc = new Calculadora();
			int divisao = calc.dividir(-3, 30);
					
			Assert.assertEquals(-10, divisao);
					
		/* O valor esperado foi -10, como há um número negativo e a operação desta vez é divisão, o resultado estará correto, 
		* pois temos um valor negativo (-3), por conta da operação ser divisão, precisará aplicar a regra de sinal,
		* consequentemente tornando o resultado negativo, com isso o JUnit não apresentará nenhuma falha e o resultado irá coincidir
		* com o resultado esperado.
		*/
		}
				
		// Cenário de teste 5: Divisão de dois valores negativos.
		@Test
		public void DividirDoisNumerosNegativos(){
			Calculadora calc = new Calculadora();
			int divisao = calc.dividir(-3, -21);
					
			Assert.assertEquals(-7, divisao);
					
		/* O valor esperado foi -7, no caso, como há dois números negativos, o resultado dará positivo, pois também aplicará regra de sinal,
		* o que consequentemente tornará o resultado 7 positivo. Com isso o JUnit apresentará uma falha.
		*/
		}
			
		// Cenário de teste 6: Divisão de dois valores sendo um quebrado.	
		@Test
		public void DividirComUmNumeroQuebrado(){
			Calculadora calc = new Calculadora();
			int divisao = calc.dividir(10, 2.5);
					
			Assert.assertEquals(4, divisao);
					
		/* O valor esperado foi 4, porém como há um valor quebrado, ou seja, do tipo real, não será possível realizar a operação, 
		* pois os valores que devem ser inseridos são apenas inteiros, portanto o JUnit apresentará um erro, ao invés de uma falha,
		* pois dessa vez, não foi apenas uma falha entre um resultado e um resultado esperado e sim um erro de sintaxe, que prejudica
		* o funcionamento da aplicação.
		*/
		}
}
