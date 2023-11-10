package aula.qts;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
    // CENÁRIO DE TESTE (SOMA):
    
        System.out.println("CENÁRIO DE TESTE (SOMA):");
        // Cenário de teste 1: Soma de dois valores.
        int soma = calc.somar(3,7);
        System.out.println(soma);
        
        // Cenário de teste 2: Soma de dois valores sendo um zero.
        soma = calc.somar(3,0);
        System.out.println(soma);
        
        // Cenário de teste 3: Soma de dois valores sendo que ambos são zero.
        soma = calc.somar(0,0);
        System.out.println(soma);
        
        // Cenário de teste 4: Soma de dois valores sendo um negativo.
        soma = calc.somar(-3, 10);
        System.out.println(soma);

        // Cenário de teste 5: Soma de dois valores negativos.
         soma = calc.somar(-3, -7);
        System.out.println(soma);
        
        // Cenário de teste 6: Soma de dois valores sendo um quebrado.
        try{
            soma = calc.somar(3, 1.5);
            System.out.println(soma);
        }catch(RuntimeException ex){
            System.out.println("Não é possível efetuar a soma com número quebrado");
        }
        // Neste caso, não será possível efetuar a soma, pois a tipagem do valor inserido é diferente de inteiro.
        
    // CENÁRIO DE TESTE (SUBTRAÇÃO):
        
        System.out.println("\nCENÁRIO DE TESTE (SUBTRAÇÃO):");
        // Cenário de teste 1: Subtração de dois valores.
        int subtracao = calc.subtrair(3,7);
        System.out.println(subtracao);
        
        // Cenário de teste 2: Subtração de dois valores sendo um zero.
        subtracao = calc.subtrair(3,0);
        System.out.println(subtracao);
        
        // Cenário de teste 3: Subtração de dois valores sendo que ambos são zero.
        subtracao = calc.subtrair(0,0);
        System.out.println(subtracao);
        
        // Cenário de teste 4: Subtração de dois valores sendo um negativo.
        subtracao = calc.subtrair(-3, 10);
        System.out.println(subtracao);
        
        // Cenário de teste 5: Subtração de dois valores negativos.
        subtracao = calc.subtrair(-3, -7);
        System.out.println(subtracao);

        // Cenário de teste 6: Subtração de dois valores sendo um quebrado.
        try{
            subtracao = calc.subtrair(3, 1.5);
            System.out.println(subtracao);
        }catch(RuntimeException ex){
            System.out.println("Não é possível efetuar a subtração com número quebrado");
        }
        // Neste caso, não será possível efetuar a soma, pois a tipagem do valor inserido é diferente de inteiro.
    
    // CENÁRIO DE TESTE (MULTIPLICAÇÃO):
    
        System.out.println("\nCENÁRIO DE TESTE (MULTIPLICAÇÃO):");
        // Cenário de teste 1: Multiplicação de dois valores.
        int multiplicacao = calc.multiplicar(3,7);
        System.out.println(multiplicacao);
        
        // Cenário de teste 2: Multiplicação de dois valores sendo um zero.
        multiplicacao = calc.multiplicar(3,0);
        System.out.println(multiplicacao);
        
        // Cenário de teste 3: Multiplicação de dois valores sendo que ambos são zero.
        multiplicacao = calc.multiplicar(0,0);
        System.out.println(multiplicacao);
        
        // Cenário de teste 4: Multiplicação de dois valores sendo um negativo.
        multiplicacao = calc.multiplicar(-3, 10);
        System.out.println(multiplicacao);
        
        // Cenário de teste 5: Multiplicação de dois valores negativos.
        multiplicacao = calc.multiplicar(-3, -7);
        System.out.println(multiplicacao);

        // Cenário de teste 6: Multiplicação de dois valores sendo um quebrado.
        try{
            multiplicacao = calc.multiplicar(3, 1.5);
            System.out.println(multiplicacao);
        }catch(RuntimeException ex){
            System.out.println("Não é possível efetuar a multiplicação com número quebrado");
        }
        // Neste caso, não será possível efetuar a multiplicação, pois a tipagem do valor inserido é diferente de inteiro.
    
    // CENÁRIO DE TESTE (DIVISÃO):
    // IMPORTANTE: Caso a divisão de número quebrado, será exibido apenas o 
    //número antes da vírgula, pelo fato da calculadora estar trabalhando apenas com números inteiros.
        
        System.out.println("\nCENÁRIO DE TESTE (DIVISÃO):");
        // Cenário de teste 1: Divisão de dois valores.
        int divisao = calc.dividir(10,2);
        System.out.println(divisao);
        
        // Cenário de teste 2: Divisão de dois valores sendo um zero.
        try{
            divisao = calc.dividir(10,0);
            System.out.println(divisao);
        }catch(ArithmeticException ex){
            System.out.println("Não é possível efetuar divisão por zero");
        }
        // Neste caso, não será possível efetuar a divisão, pois matemáticamente, não é possível efetuar uma divisão por zero.
        
        // Cenário de teste 3: Divisão de dois valores sendo que ambos são zero.
        try{
            divisao = calc.dividir(0,0);
            System.out.println(divisao);
        }catch(ArithmeticException ex){
            System.out.println("Não é possível efetuar divisão por zero");
        }
        // Neste caso, não será possível efetuar a divisão, pois matemáticamente, não é possível efetuar uma divisão por zero.
        
        // Cenário de teste 4: Divisão de dois valores sendo um negativo.
        divisao = calc.dividir(10, -2);
        System.out.println(divisao);
        
        // Cenário de teste 5: Divisão de dois valores negativos.
        divisao = calc.dividir(-10, -2);
        System.out.println(divisao);

        // Cenário de teste 6: Subtração de dois valores sendo um quebrado.
        try{
            divisao = calc.dividir(10, 1.5);
            System.out.println(divisao);
        }catch(RuntimeException ex){
            System.out.println("Não é possível efetuar a divisão com número quebrado");
        }
        // Neste caso, não será possível efetuar a soma, pois a tipagem do valor inserido é diferente de inteiro.
    }
    
}
