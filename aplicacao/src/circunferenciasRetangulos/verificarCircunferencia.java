package circunferenciasRetangulos;

	public class verificarCircunferencia {
		private static double raio;
		private static double perimetro;
		private static double area;
		private static double pi =3.14;
		
		public verificarCircunferencia(double raio) {
			this.raio = raio;
			verificarArea();
			verificarPerimetro();
		}
		
		private static void verificarArea() {
			area = pi * Math.pow(raio,2);
		}
		
		private static void verificarPerimetro() {
			perimetro = 2 * pi * raio;
		}
		
		public double getArea() {
			return area;
		}
		
		public double getPerimetro() {
			return perimetro;
		}

		public String getRespostaPerimetro(double resposta) {
			if(resposta == perimetro) {
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
