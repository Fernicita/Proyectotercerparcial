package mx.uach.fing.proyectotercerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.annotation.SuppressLint;
public class Ferny extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ferny);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView = findViewById(R.id.Ferny);

        // Habilitar JavaScript (si es necesario)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Cargar la página HTML desde el servidor local
        webView.loadUrl("https://fernicita.github.io/");
    }
}