package com.example.android.appportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class main_menu extends Activity {

    //private Button app1, app2, app3, app4, app5, app6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        /*app1 = (Button) findViewById(R.id.app1);
        app2 = (Button) findViewById(R.id.app2);
        app3 = (Button) findViewById(R.id.app3);
        app4 = (Button) findViewById(R.id.app4);
        app5 = (Button) findViewById(R.id.app5);
        app6 = (Button) findViewById(R.id.app6);*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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

    public void makeToast(View view) {
        Context context = getApplicationContext();
        Button b = (Button) view;
        CharSequence text = b.getText();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
