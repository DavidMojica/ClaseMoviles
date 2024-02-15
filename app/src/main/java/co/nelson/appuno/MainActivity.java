package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/* Ciclo de vida
*   OnCreate(); => Siempre se ejecuta por defecto cuando se crea la aplicacion
*   OnStart();  => Se ejecuta cuando se abre la aplicación
*   OnRestart(); =>
*   OnResume(); => Cuando se abre desde segundo plano
*   OnPause(); => Cuando la aplicación está en segundo plano
*   OnStop(); => Actividad no visible para el usuario
*   OnDestroy(); => Cuando se destruye la aplicacion
* */
public class MainActivity extends AppCompatActivity {

   TextView nombreUsuario;
   Button btn1,btn2, btn3;
   String Tag = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Method OnStart");


        setContentView(R.layout.activity_main);
        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        nombreUsuario.setText("Method OnStart");

        // @Override
        // public void onClick(View view){
        //     if(!nombreUsuario.getText().toString().isEmpty() && !btn3.getText().toString().isEmpty()){
        //         Toast.makeText(MainActivity.this, "Correcto", Toast);
        //         enviarPantallaDos();
        //     } else {
        //         Toast.makeText(MainActivity.this,"Incorrecto",Toast);
        //     }
        // }

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

       btn3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                String textoActual = nombreUsuario.getText().toString();
                String nombre = "Juan Carlos";
                if(enviarPantallaDos(nombre, textoActual); enviarPantallaDos(nombre, textoActual)){
                    Log.i("intentSuccess", "Intent Done")
                }  else {
                    Log.i("intentSuccess", "Intent undone")
                }
           }
       });

    }

    private boolean enviarPantallaDos(String nombre, String text){
        Intent pasarInfo = new Intent(this, pantallados.class); //Pantalla actual, pantalla destino
        try{
            pasarInfo.putExtra("name", nombre); //Como se va a llamar ese dato
            pasarInfo.putExtra("text", text); //Como se va a llamar ese dato
            startActivity(pasarInfo);
            return true;

        } catch Exception {
            return false;
        }
    }

    @Override
    protected  void onRestart(){
        super.onRestart();
        nombreUsuario.setText("MethodOnRestart");
        Log.i(Tag, "Method OnRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        nombreUsuario.setText("Method OnResume");
        Log.i(Tag, "Method OnResume");
    }

    @Override
    protected  void onPause(){
        super.onPause();
        nombreUsuario.setText("Method onPause");
        Log.i(Tag, "Method OnPause");
    }

    @Override
    protected  void onStop(){
        super.onStop();
        nombreUsuario.setText("Method onStop");
        Log.i(Tag, "Method OnStop");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        nombreUsuario.setText("Method Destroy");

        Log.i(Tag, "Method OnDestroy");
    }

    
}

