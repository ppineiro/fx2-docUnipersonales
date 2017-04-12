package docUniTesting;

import com.dogma.busClass.ApiaAbstractClass;
import com.dogma.busClass.BusClassException;

public class Helpers {

	public static void notificarDocumentosOk(ApiaAbstractClass apia,
			String mail, String comentarios) throws BusClassException {

		String link = "http://proyectos.fx2.com.uy:8080/Apia/";

		String[] mailEnviar = { mail };
		apia.sendMail(
				mailEnviar,
				"Documentación de Unipersonales subida correctamente",
				"Buenas"
						+ ",<br><br>"
						+ "Se han verificado los documentos de DGI y BPS por Administración.<br>"
						+ "Todo correcto.<br>" + "Comentarios: " + comentarios
						+ "<br><br>Muchas gracias." + "<br>Saludos,"
						+ "<br>Apia.");

	}

	public static void notificarTareaPendiente(ApiaAbstractClass apia,
			String mail) throws BusClassException {

		String link = "http://proyectos.fx2.com.uy:8080/Apia/";

		String[] mailEnviar = { mail };
		apia.sendMail(
				mailEnviar,
				"Tarea pendiente en Apia - Unipersonales",
				"Buenas"
						+ ",<br><br>"
						+ "Te han asignado una tarea en Apia del proceso 'Documentación Unipersonales'.<br>"
						+ "Por favor ingresa aquí: " + link
						+ " y completa la tarea.<br>"
						+ "<br><br>Muchas gracias." + "<br>Saludos,"
						+ "<br>Apia.");

	}

}
