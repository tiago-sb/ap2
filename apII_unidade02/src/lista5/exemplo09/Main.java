// Crie uma classe chamada Complexo para representar números complexos. Adicione os
// construtores com e sem argumentos, métodos getters e setters para os atributos e métodos
// para somar e comparar dois números complexos. Crie 5 objetos e teste os métodos.

package lista5.exemplo09;
public class Main {
	public static void main(String[] args) {
		Complexo primeiroCompleto = new Complexo(12, 6);
		Complexo segundoCompleto = new Complexo(17, 6.2);
		Complexo terceiroCompleto = new Complexo(15.6, 6);
		Complexo quartoCompleto = new Complexo(19, 6);
		Complexo quintoCompleto = new Complexo(12, 6);
		
		//imprimir
		System.out.println(primeiroCompleto.toString());
		// soma
		Complexo soma = primeiroCompleto.somarComplexo(segundoCompleto);
		System.out.println(soma.toString());

		// comparação
		if(primeiroCompleto.equals(quintoCompleto)) {
			System.out.println("iguais!");
		}
		else {
			System.out.println("diferentes!");
		}
	}
}
// c.equals(c1)
