package controller;
 // S = 1 + 1 / 2! + 1 / 3! + 1 / 4! + ... + 1 / N!

public class FatfraçaoController {
	
	  public double serie(int n) {
	        return recursiva(n, 1, 0.0);
	    }
	  
public double recursiva(int n, int atual, double soma) {
		if(atual > n) {
			return soma;
		}
		else {
			soma += 1.0/ fat(atual);
			
			return recursiva(n, atual + 1, soma);

		}
	}
	public static int fat(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return (n * fat(n-1));
		}
	}
	
}
