package br.com.pyetro;

import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {
	
	public static void main(String[] args) {
		int[] S1 = {1,2,3};
		int n1 = 2;
		System.out.println("Subconjuntos para S1: ");
		encontrarSubconjuntos(S1,n1);
		
		int[] S2 = {1,2,3,4};
		int n2 = 1;
		System.out.println("\nSubconjuntos para S2: ");
		encontrarSubconjuntos(S2, n2);		
	}

	private static void encontrarSubconjuntos(int[] S, int n) {
		List<List<Integer>> resultados = new ArrayList<>();
		backtrack(S,n,0, new ArrayList<>(), resultados);
		for(List<Integer> subconjunto : resultados) {
			System.out.println(subconjunto);
		}
		
	}

	private static void backtrack(int[] S, int n, int inicio, List<Integer> temp, List<List<Integer>> resultados) {
		if(temp.size() == n) {
			resultados.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i = inicio; i <S.length; i++) {
			temp.add(S[i]);
			backtrack(S, n, i + 1, temp, resultados);
			temp.remove(temp.size() -1);
		}
		
	}

}
