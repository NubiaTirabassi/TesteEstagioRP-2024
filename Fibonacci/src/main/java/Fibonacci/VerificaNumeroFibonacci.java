package Fibonacci;

public class VerificaNumeroFibonacci {
	
	public boolean calculoFibonacci(Integer numeroInserido) {
		
		Integer anterior = 0;
		Integer atual = 1;
		Integer soma = 0;
        Boolean encontrado = false;
        
		while (soma <= numeroInserido) {
            if (soma == numeroInserido) {
                encontrado = true;
                break;
            }
            soma = anterior + atual;
            anterior = atual;
            atual = soma;
        }
		return encontrado;
	}

}
