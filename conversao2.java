package entities;

public class conversao {
	
	//Atributos.
	private Double c;
	
	//Contrutores.
	public conversao() {
		
	}
	public conversao(Double c) {
		this.c = c;
	}

	//Metodos.
	public Double fahrenheit() {
		return c * 1.8 + 32;
	}
	public Double kelvin() {
		return c + 273.15;
	}
	public Double reaumur() {
		return c * 0.8;
	}
	public Double Rankine() {
		return c * 1.8 + 32 + 459.67;
	}
	
	//Getters and Setters.
	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}
	
	//ToString.
	public String toString() {
		return "Fahrenheit: "
				+ fahrenheit() + "."
				+ "\nKelvin: "
				+ kelvin() + "."
				+ "\nRèaumur: "
				+ reaumur() + "."
				+ "\nRankine: "
				+ Rankine() + ".";
	}
}
