package laminarsoftworks.gymapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button buttonID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonID = (Button)findViewById(R.id.connectID);
    }

    public void connect(View v){
        if(v.getId()==R.id.connectID){
            Intent goconnect = new Intent(MainActivity.this, friend.class);
            startActivity(goconnect);
        }

    }
}
