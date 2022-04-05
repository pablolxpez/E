package examen;

public class Hora {

	public static boolean validarHora(int segundos, int minutos, int horas) {
		boolean horaValida = true;
		if ((segundos >= 0) && (minutos >= 0) && (horas >= 0)) {
			if (segundos > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (horas > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}