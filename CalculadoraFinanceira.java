
public class CalculadoraFinanceira implements Calculadora{
	private double num1;
	private double num2;
	
	public CalculadoraFinanceira(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public void somar(){
		System.out.println("Soma: " + (this.num1 + this.num2));
	}
	public void subtrair(){
		System.out.println("Subtração: " + Math.abs((this.num1 - this.num2)));
	}
	public void dividir(){
		if(num2 > 0){
			System.out.printf("Divisão: %.2f \n",(this.num1 / this.num2));
		}
	}
	public void multiplicar(){
		System.out.println("Multiplicação: " + (this.num1 * this.num2));
	}
	public double aumentaPercentual(double porcentagem, double num1){
		double valor;
		valor = (num1 * porcentagem)/100.0; 
		valor+= num1;
		return valor;
		
	}

}
