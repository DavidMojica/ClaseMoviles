package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pantallados extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallados);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Method OnStart pantallados");
        
    }
}
