package org.example.piano;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.widget.LinearLayout;

public class Notas {

	/**
	 * Constructor clase Notas
	 */
	public Notas() {
		//No necesita campos
	}

	/**
	 * Método que define la nota de la tecla
	 * @param A es la actividad que recibe la función
	 * @param idNota es el id que corresponde a la nota en el layout
	 * @param idSonido es el id que corresponde al recurso de audio en /raw
	 */
	public void defineTeclaNota(final Activity A, int idNota ,final int idSonido) {
		//instanciar la tecla que se recoge del layout
		LinearLayout tecla = (LinearLayout) A.findViewById(idNota);
		//de momento el sonido tiene que estar deshabilitado.
		tecla.setSoundEffectsEnabled(false);
		//Crear el evento de escucha
		tecla.setOnClickListener(new View.OnClickListener()
		{
			//cuando se pulsa lanza el método onClick
		    @Override
		    public void onClick(View V)
		    {
		    	//llama al método para reproducir el sonido
		        tocaNota(A, V, idSonido);
		    }
		});
	}
	
	/**
	 * Método que reproduce el sonido según su id
	 * @param A la actividad sobre la que actúa
	 * @param view el layout
	 * @param idRecurso 
	 */
    public void tocaNota(final Activity A, View view, int idRecurso) {
        // Suena una nota
    	MediaPlayer clip = MediaPlayer.create(A.getApplicationContext(), idRecurso);
    	clip.start();	 
    	
    	/*Definición de interfaz de devolución de llamada que se 
    	 * invoca cuando la reproducción de una fuente de medios
    	 *  de comunicación se ha completado.
    	 */
    	OnCompletionListener escucha = new OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
         };
        //parar el sonido
    	clip.setOnCompletionListener(escucha);
    }
	
}
