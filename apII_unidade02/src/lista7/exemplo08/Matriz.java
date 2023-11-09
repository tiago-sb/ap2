package lista7.exemplo08;

public class Matriz {
	
	public static void imprimeMatriz(int[][] matriz) {
		for(int[] linhaAtual : matriz) {
			for(int elementoAtual : linhaAtual) {
				System.out.print(elementoAtual + " ");
			}
			System.out.println();
		}
	}
	
	public static int transposta(int[][] matriz) {
		return -1;
	}
}

// 0,0 0,1 0,2
// 1,0 1,1 1,2
// 2,0 2,1 2,2
