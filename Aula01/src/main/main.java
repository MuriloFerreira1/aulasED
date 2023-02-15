package main;
import controller.controller;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		controller c = new controller();
		int opc=0;
		int resultado=0;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog("Insira o exercício: "));
			switch (opc) {
			case 1:
				int a=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A: "));
				int b=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B: "));
				resultado = c.somaAeB(a, b);
				JOptionPane.showMessageDialog(null, "O valor da multiplicação é: "+resultado);
				break;
			case 2:
				int divisor=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do divisor: "));
				int dividendo=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do dividendo: "));
				resultado = c.resto(divisor, dividendo);
				JOptionPane.showMessageDialog(null, "O resto é: "+resultado);
				break;
			case 3:
				int tamanho=Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor: "));
				int vetor[] = new int[tamanho];
				for(int i=0;i<tamanho;i++) {
					vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição: "+(i+1)));
				}							
				resultado = c.paresVetor(vetor, tamanho);
				JOptionPane.showMessageDialog(null, "O número de pares é: "+resultado);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Finalizando.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}
		}while (opc!=0);
		
	}
}
