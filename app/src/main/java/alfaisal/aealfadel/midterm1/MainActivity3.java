package alfaisal.aealfadel.midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        String[] attraction = {
                "Art Institute" ,
                "Magnificent Mile" ,
                "Willis Tower" ,
                "Water Tower-2",
                "new item addded"

        };

        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.activity_main,R.id.travel, attraction));
    }

    protected void onListItemClick
            (ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://alfaisal.edu")));

                break;
            case 1:
                //do something else
                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com")));

            case 2:
                startActivity(new Intent(MainActivity.this, PicActivity.class));
                break;
            {

        }
        //whatever in here will execute automatically
        Button bttnClick = (Button)findViewById(R.id.bttn2Activity2);
        // Standard findViewById(R.id.xxxxxxx)
        bttnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // to do something on the click of the button
                startActivity(new Intent(alfaisal.aealfadel.midterm1.MainActivity.this, alfaisal.aealfadel.midterm1.MainActivity2.class));
                //whatever in here will execute automatically
                Button bttnClick = (Button)findViewById(R.id.bttn2Activity2);
                // Standard findViewById(R.id.xxxxxxx)
                bttnClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // to do something on the click of the button
                        startActivity(new Intent(alfaisal.aealfadel.midterm1.MainActivity.this, alfaisal.aealfadel.midterm1.MainActivity1.class));
            }
        }}
    }
}