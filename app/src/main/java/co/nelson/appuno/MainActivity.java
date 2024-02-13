package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

   TextView nombreUsuario;
   Button btn1,btn2;

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
    }
    @Override
    protected  void onRestart(){
        super.onRestart();
    }
    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected  void onPause(){
        super.onPause();
    }

    @Override
    protected  void onStop(){
        super.onStop();
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
    }


}

