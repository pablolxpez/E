package examen;
/**
 * 
 * @author DAM107
 * 
 * 
 * @version 1.0
 * 
 * */

public class Hora {
	/**
	 * 
	 * @param segundos 
	 * @param minutos
	 * @param horas 
	 * @return
	 */
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