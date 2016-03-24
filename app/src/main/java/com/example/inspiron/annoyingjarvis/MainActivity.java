package com.example.inspiron.annoyingjarvis;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import  android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = (Button)findViewById(R.id.button);
        Button but2 = (Button)findViewById(R.id.button2);
        Button but3 = (Button)findViewById(R.id.button3);

        but1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView jarvistext = (TextView) findViewById(R.id.textView);
                        jarvistext.setText("I think, this isn't a good time to sleep sir!");
                    }
                }
        );

        but2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView jarvistext = (TextView) findViewById(R.id.textView);
                        jarvistext.setText("I think you should focus more on your work, Sir!");
                    }
                }
        );

        but3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView jarvistext = (TextView) findViewById(R.id.textView);
                        jarvistext.setText("I don't think I should do that Sir.");
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
