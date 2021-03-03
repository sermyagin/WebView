package webview.domain.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webviev = new WebView(this);
        setContentView(webviev);
        webviev.loadUrl("https://domain.com");
        //test
    }
}
