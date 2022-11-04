public class Expresiones3{
	public static void main (String [] args){

		System.out.println ("Problema 1:");
		System.out.println ("-----------");
		System.out.println ("Suponga que su conexion de internet tiene una velocidad efectiva de descarga de 5Mbps (5 Mbits por segundo). ¿Cuántos minutos tardaría en descargarse una película que pesa 8GB?");
		System.out.println ();
		System.out.println ("RESPUESTA: ");
		
		byte velocidad_mbps = 5;
		byte pelicula_peso = 8;

		float mbps_mbs = (float) velocidad_mbps / 8;

		int gb_mb = pelicula_peso * 1024;

		float time_seg = gb_mb / mbps_mbs;

		float resultado = time_seg / 60;

		System.out.println("En total tardaria " + resultado + " minutos.");
		System.out.println ();

		System.out.println ("Problema 2:");
		System.out.println ("-----------");
		System.out.println ("Si en promedio en todo el mundo se envían 356 mil tweets por minuto y cada tweet en promedio pesa 2180 kB. ¿De cuánto espacio de almacenamiento debe disponer la compañía Twitter Inc. para almacenar los tweets que se escribirán en los próximos 10 años?");
		System.out.println ();
		System.out.println ("RESPUESTA: ");
		
		int tweets_min = 356000;
		short tweet_peso = 2180;


		int tweets_hora = tweets_min * 60;
		int tweets_dia = tweets_hora * 24;
		float tweets_anio = (float) tweets_dia * 365;
		float tweets_10_anio = (float) tweets_anio * 10;


		float mb = (float) tweet_peso / 1024;

		//Espacio que ocupara en 10 años

		float espacio_mb = tweets_10_anio * mb;

		float espacio_gb = espacio_mb / 1024;

		float espacio_tb = espacio_gb / 1024;

		float espacio_pb = espacio_tb / 1024;

		float espacio_eb = espacio_pb / 1024;

		System.out.println("Twitter requiere en total " + espacio_eb + " EB" + " para almacenar los tweets de los proximos 10 años.");
		System.out.println ();

		//Problema 3
		System.out.println ("Problema 3:");
		System.out.println ("-----------");
		System.out.println ("Un fotógrafo utiliza una cámara de alta definición para capturar fotos panorámicas en excursiones a reservas naturales. Para almacenar las fotos lleva Memory Sticks de 32GB cada una. ¿Cuántos Memory Stick debe llevar para almacenar 500 fotos de alta definición de 64MB cada una, 2000 fotos de mediana definición de 8300kB cada una y 50 videos de 4GB cada uno?");
		System.out.println ();
		System.out.println ("RESPUESTA: ");
		

		short fotos = 500;
		byte fotos_mb = 64;

		int tam_fotos_mb = fotos * fotos_mb;
		float tam_fotos_gb = (float) tam_fotos_mb / 1024;


		short media_def = 2000;
		short media_kb = 8300;

		int tam_med_kb = media_def * media_kb;
		float tam_med_mb = (float) tam_med_kb / 1024;
		float tam_med_gb = (float) tam_med_mb / 1024;


		byte videos = 50;
		byte videos_gb = 4;

		int tam_vid_gb = videos * videos_gb;


		float sum_gb_total = (float) tam_fotos_gb + tam_med_gb + tam_vid_gb;

		//Total

		float total_memory = sum_gb_total / 32;

		System.out.println("El fotografo utiliza: " + total_memory + " GB de memoria, lo que quiere decir que necesitará 8 MemorySticks. ");
	}
}