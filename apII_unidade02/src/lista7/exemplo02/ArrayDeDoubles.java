package lista7.exemplo02;

public class ArrayDeDoubles {
	public double maiorElemento(double[] vetor, int indice) {
		if (indice == vetor.length - 1) {
            return vetor[indice];
        }

        double maiorNoSubvetor = maiorElemento(vetor, indice + 1);

        if (vetor[indice] > maiorNoSubvetor) {
            return vetor[indice];
        } else {
            return maiorNoSubvetor;
        }
	}
}

// 0 1 2 3 ...
