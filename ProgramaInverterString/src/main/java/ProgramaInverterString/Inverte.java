package ProgramaInverterString;

public class Inverte {

	public static String inverterPalavra(String palavra) {

		char[] letras = palavra.toCharArray();
		int esquerdo = 0;
		int direito = letras.length - 1;

		while (esquerdo < direito) {
			char temp = letras[esquerdo];
			letras[esquerdo] = letras[direito];
			letras[direito] = temp;
			esquerdo++;
			direito--;
		}

		return new String(letras);
	}

}
