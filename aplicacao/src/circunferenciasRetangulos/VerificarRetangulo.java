package circunferenciasRetangulos;

public class VerificarRetangulo {
	private static double base;
	private static double altura;
	private static double perimetro;
	private static double area;
	
	public VerificarRetangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		verificarArea();
		verificarPerimetro();
	}
	
	private static void verificarArea() {
		area = base * altura;
	}
	
	private static void verificarPerimetro() {
		perimetro = 2*(base+altura);
	}
	
	public double getAreaRetangulo() {
		return area;
	}
	
	public double getPerimetroRetangulo() {
		return perimetro;
	}

	public String getRespostaPerimetro(double resposta) {
		if(resposta == area) {
			return "Correta";
		}else {
			return "Errada";
		}
	}
	public String getRespostaArea(double resposta) {
		if(resposta == area) {
			return "Correta";
		}else {
			return "Errada";
		}
	}
}
