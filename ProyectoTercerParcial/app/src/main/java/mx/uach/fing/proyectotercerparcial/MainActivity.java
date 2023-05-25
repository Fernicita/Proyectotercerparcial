package mx.uach.fing.proyectotercerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Ferny = findViewById(R.id.Ferny);
        Ferny.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ferny.class);
                startActivity(intent);
            }
        });

        Button Manuel = findViewById(R.id.Manuel);
        Manuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Manuel.class);
                startActivity(intent);
            }
        });

        Button Ramon = findViewById(R.id.Ramon);
        Ramon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ramon.class);
                startActivity(intent);
            }
        });
    }
}