package pl.zabrze.zs10.czaszyciaaplikacji3a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private ImageButton imageButtonUp;
private ImageButton imageButtonDown;
private TextView textView;
private int punkty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CZAS_ZYCIA","uruchomiono onCreate");

        textView = findViewById(R.id.textView);
        if(savedInstanceState !=null){
            punkty = savedInstanceState.getInt("PUNKTY");
            textView.setText(String.valueOf(punkty));
        }
        imageButtonUp = findViewById(R.id.imageButton);
        imageButtonDown = findViewById(R.id.imageButton2);
        imageButtonUp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        textView.setText(String.valueOf(punkty));

                    }
                }
        );
        imageButtonDown.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty --;
                        textView.setText(String.valueOf(punkty));
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CZAS_ZYCIA","uruchomiono onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CZAS_ZYCIA","uruchomiono onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CZAS_ZYCIA","uruchomiono onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CZAS_ZYCIA","uruchomiono onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CZAS_ZYCIA","uruchomiono onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CZAS_ZYCIA","uruchomiono onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("PUNKTY",punkty);
        Log.i("CZAS_ZYCIA","uruchomiono onSaveInstanceState");
    }
}