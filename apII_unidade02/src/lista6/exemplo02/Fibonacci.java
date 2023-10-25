package lista6.exemplo02;
public class Fibonacci {
	public int fibonacci(int numeroEscolhido) {
		if(numeroEscolhido <= 0) {
			return 0;
		}
		if(numeroEscolhido <= 1) {
			return 1;
		} 
		else {
			return fibonacci(numeroEscolhido - 1) + fibonacci(numeroEscolhido - 2);
		}
	}	
}
// 0 1 1 2 3 5 8 13 21 34
// 0 1 2 3 4 5 6 7  8  9
