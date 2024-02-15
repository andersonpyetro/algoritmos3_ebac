package br.com.pyetro;

import java.util.Arrays;

public class TrocoMinimo {
	
	public static void main(String[] args) {
		int quantia = 5893;
		int[] moedas = {5,2,1};
		
		System.out.println("Troco para " + quantia + ": ");
		calcularTrocoMinimo(quantia, moedas);
		
	}

	private static void calcularTrocoMinimo(int quantia, int[] moedas) {
		Arrays.sort(moedas);
		int n = moedas.length;
		
		int indiceMoeda = n-1;
		
		while(quantia>0 && indiceMoeda >=0) {
			if(moedas[indiceMoeda] <= quantia) {
				int numMoedas = quantia / moedas[indiceMoeda];
				System.out.println(numMoedas + " moedas de " + moedas[indiceMoeda]);
				
				quantia -= numMoedas * moedas[indiceMoeda];
				
			}
			indiceMoeda--;
		}
		
	}

}
