package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

   TextView nombreUsuario;
   Button btn1,btn2;
   String Tag = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Uno");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Dos");
            }
        });


    }
    /* Ciclo de vida
     *   OnCreate(); => Siempre se ejecuta por defecto cuando se crea la aplicacion
     *   OnStart();  => Se ejecuta cuando se abre la aplicación
     *   OnRestart(); =>
     *   OnResume(); => Cuando se abre desde segundo plano
     *   OnPause(); => Cuando la aplicación está en segundo plano
     *   OnStop(); => Actividad no visible para el usuario
     *   OnDestroy(); => Cuando se destruye la aplicacion
     * */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Method OnStart");
    }
    @Override
    protected  void onRestart(){
        super.onRestart();
        Log.i(Tag, "Method OnRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(Tag, "Method OnResume");
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Log.i(Tag, "Method OnPause");
    }

    @Override
    protected  void onStop(){
        super.onStop();
        Log.i(Tag, "Method OnStop");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.i(Tag, "Method OnDestroy");
    }


}

