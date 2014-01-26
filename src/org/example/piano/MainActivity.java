package org.example.piano;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends Activity {
	//instancia de la clase notas
    private Notas notas = new Notas();
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //al iniciar el programa, que cargue los eventos de las notas
        creaEventos();
    }
	
	/**
	 * Método que crea eventos de pulsado para las teclas del layout
	 */
	private void creaEventos() {
		//crea evento para cada una de la tecla y le asigna un sonido
		notas.defineTeclaNota(this, R.id.piano_key_c, R.raw.pianoab);//pianoc
		notas.defineTeclaNota(this, R.id.piano_key_d, R.raw.pianobb);//pianod
		notas.defineTeclaNota(this, R.id.piano_key_e, R.raw.pianoc);//pianoe
		notas.defineTeclaNota(this, R.id.piano_key_f, R.raw.pianocs);//pianof
		notas.defineTeclaNota(this, R.id.piano_key_g, R.raw.pianoeb);//pianog
		notas.defineTeclaNota(this, R.id.piano_key_a, R.raw.pianof);//pianoa
		notas.defineTeclaNota(this, R.id.piano_key_b, R.raw.pianog);//pianob
		notas.defineTeclaNota(this, R.id.piano_key_cs, R.raw.pianoa);//pianocs
		notas.defineTeclaNota(this, R.id.piano_key_eb, R.raw.pianob);//pianoeb
		notas.defineTeclaNota(this, R.id.piano_key_fs, R.raw.pianod);//pianofs
		notas.defineTeclaNota(this, R.id.piano_key_ab, R.raw.pianoe);//pianoab
		notas.defineTeclaNota(this, R.id.piano_key_bb, R.raw.pianofs);//pianobb
		//he movido las teclas una octava(mal orden)        / 	orden correcto(debería)
	}
	
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}