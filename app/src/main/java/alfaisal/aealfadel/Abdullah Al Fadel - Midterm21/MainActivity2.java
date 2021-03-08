package alfaisal.aealfadel.midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //whatever in here will execute automatically
        Button bttnClick = (Button)findViewById(R.id.bttn2Activity2);
        // Standard findViewById(R.id.xxxxxxx)
        bttnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // to do something on the click of the button
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
                //whatever in here will execute automatically
                Button bttnClick = (Button)findViewById(R.id.bttn2Activity2);
                // Standard findViewById(R.id.xxxxxxx)
                bttnClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // to do something on the click of the button
                        startActivity(new Intent(alfaisal.aealfadel.midterm1.MainActivity.this, alfaisal.aealfadel.midterm1.MainActivity1.class));

            }
        });
    }
}