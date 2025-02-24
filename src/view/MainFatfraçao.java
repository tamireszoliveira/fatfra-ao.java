package view;
import javax.swing.JOptionPane;
import controller.FatfraçaoController;
// S = 1 + 1 / 2! + 1 / 3! + 1 / 4! + ... + 1 / N!
public class MainFatfraçao {
	public static void main(String args[]) {
		FatfraçaoController fatfr = new FatfraçaoController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
	System.out.print("O resultado da serie é " + fatfr.serie(n));
	}
}
