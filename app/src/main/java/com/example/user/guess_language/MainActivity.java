package com.example.user.guess_language;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;


public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloTxt = (TextView)findViewById(R.id.hellotxt);
        helloTxt.setText(readTxt());
    }

    private String readTxt(){

        InputStream inputStream = getResources().openRawResource(R.raw.hello);

       String word="cuvant";
        try {
            Random rand=new Random();
            Scanner sc = new Scanner(inputStream);
            int nr = sc.nextInt();
            int randomNum = rand.nextInt((nr - 1) + 1) + 1;
            int index = 0;
            while (index != nr) {
                word = sc.next();
                index++;
            }
            sc.close();
        }
        catch(Exception e){

        }
        return word;
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
