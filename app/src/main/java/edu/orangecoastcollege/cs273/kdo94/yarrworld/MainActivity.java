package edu.orangecoastcollege.cs273.kdo94.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Define the button as an instance variable ( member variable )
    private Button speakButton;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Restoring user settings from a previous session
        super.onCreate(savedInstanceState);
        // inflating (!) opening the layout called activity_main ( activity_main.xml )
        setContentView(R.layout.activity_main);

        // Hook up the speakButton to the one in out view:
        speakButton = (Button) findViewById(R.id.speakButton);

        // Wire up the speak button to perform an onClick event
        speakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Use the static reference to "toast" to display the message
                // Toast =  vanishes after a set amount of time
                // Dialog = requires user input
                Toast.makeText(context, R.string.toast_text, Toast.LENGTH_LONG).show();
            }
        });




    }
}
