
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Calculadora Científica***");
		CalculadoraCientifica cc = new CalculadoraCientifica(5.0,4.0);
		cc.somar();
		cc.subtrair();
		cc.dividir();
		cc.multiplicar();
		cc.raiz(cc.getNum2());
		cc.potencia(cc.getNum1(), cc.getNum2());
		
		System.out.println("***Calculadora Financeira***");
		CalculadoraFinanceira cf = new CalculadoraFinanceira(2.0,9.0);
		cf.somar();
		cf.subtrair();
		cf.dividir();
		cf.multiplicar();
		System.out.printf("Porcentagem: %.2f \n", cf.aumentaPercentual(40.0, 100.0));
		

	}

}
