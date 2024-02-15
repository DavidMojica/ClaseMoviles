package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pantallados extends AppCompatActivity{
    TextView usuarioDos, textoAnterior;
    String name, text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallados);
        usuarioDos = findViewById(R.id.usuarioDos);
        textoAnterior = findViewById(R.findViewById.textoAnterior);
        //tarea: recibir la informacion en cualquier otro lado.
        //RECIBIR LOS DATOS DE LA PANTALLA EMISORA//
        name = getIntent().getStringExtra("name");
        text = getIntent().getStringExtra("text");
    
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Method OnStart pantallados");
        usuarioDos.setText(name);
        textoAnterior.setText(text);
        
    }
}
