package es.pamp.asynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.pamp.asynctask.task.TaskContador;

public class MainActivity extends AppCompatActivity {

    TextView textViewContador;
    TaskContador taskContador = new TaskContador();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewContador =(TextView)findViewById(R.id.textViewContador);
        
        Button startBoton = (Button) findViewById(R.id.startBoton);
        startBoton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                taskContador.setActivity(MainActivity.this);
                taskContador.execute();

            }
        });
        Button stopBoton = (Button) findViewById(R.id.stopBoton);
        stopBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }
    public void escribirTexto(String texto){
        textViewContador.setText(texto);

    }
}
