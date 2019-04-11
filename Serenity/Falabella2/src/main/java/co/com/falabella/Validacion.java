package co.com.falabella;

public class Validacion {

	public boolean validacion(String nombreSeleccionado, String cantidadSeleccionada, String nombreCarrito,
			String cantidadCarrito) {
		boolean validacion = false;
		String[] cantidadCarritoFinal = cantidadCarrito.split(" ");

		if (nombreCarrito.contains(nombreSeleccionado)
				&& cantidadSeleccionada.equals(cantidadCarritoFinal[1].replace("(", "").trim())) {

			validacion = true;
		}
		System.out.println("Son iguales: " + validacion);
		return validacion;
	}

}
