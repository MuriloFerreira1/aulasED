package controller;

public class controller {

	public controller() {
		super();
	}
	public int somaAeB(int a, int b) {
		if (b>0) {
			return a+somaAeB(a,b-1);
		}
		else {
			return 0;
		}
	}
	
	public int resto(int divisor, int dividendo) {
		if(dividendo<divisor) {
			return dividendo;
		}else {
			return resto(divisor, dividendo-divisor);
		}
	}
	
	public int paresVetor(int[] vetor,int tamanho) {
		if(tamanho>0) {
			if(vetor[tamanho-1]%2==0) {
				return 1+paresVetor(vetor, tamanho-1);
			}else {
				return paresVetor(vetor, tamanho-1);
			}
		}else {
			return 0;
		}
	}

}
