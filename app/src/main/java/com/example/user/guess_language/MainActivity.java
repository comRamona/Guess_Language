package com.example.user.guess_language;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;


public class MainActivity extends ActionBarActivity {
    String word="";
    String lang="";
    TextView helloTxt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloTxt = (TextView)findViewById(R.id.hellotxt);
        Restart();

    }

    @Override
    public void onBackPressed() {
        Restart();
    }

    private void Restart() {
        TextView myAwesomeTextView = (TextView)findViewById(R.id.hellotxt);
        word=readTxt();
        myAwesomeTextView.setText(word);
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
            while (index != randomNum) {
                word = sc.next();
                lang=sc.next();
                index++;
            }
            sc.close();
        }
        catch(Exception e){

        }
        return word;
    }

    public void checkRu(View view){
        AlertDialog.Builder imageDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.custom_fullimage_dialog,
                (ViewGroup) findViewById(R.id.layout_root));
        ImageView image = (ImageView) layout.findViewById(R.id.imageView);
        if(lang.equals("ru")) image.setImageDrawable(getResources().getDrawable(R.drawable.right));
        else
            image.setImageDrawable(getResources().getDrawable(R.drawable.wrong));
        imageDialog.setView(layout);
        imageDialog.create();
        imageDialog.show();

            }
    
    public void checkHu(View view){
        AlertDialog.Builder imageDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.custom_fullimage_dialog,
                (ViewGroup) findViewById(R.id.layout_root));
        ImageView image = (ImageView) layout.findViewById(R.id.imageView);
        if(lang.equals("hu")) image.setImageDrawable(getResources().getDrawable(R.drawable.right));
        else
            image.setImageDrawable(getResources().getDrawable(R.drawable.wrong));
        imageDialog.setView(layout);
        imageDialog.create();
        imageDialog.show();
    }
    public void checkSk(View view){
        AlertDialog.Builder imageDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.custom_fullimage_dialog,
                (ViewGroup) findViewById(R.id.layout_root));
        ImageView image = (ImageView) layout.findViewById(R.id.imageView);
        if(lang.equals("sk")) image.setImageDrawable(getResources().getDrawable(R.drawable.right));
        else
            image.setImageDrawable(getResources().getDrawable(R.drawable.wrong));
        imageDialog.setView(layout);
        imageDialog.create();
        imageDialog.show();
    }
    public void checkBg(View view){
        AlertDialog.Builder imageDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.custom_fullimage_dialog,
                (ViewGroup) findViewById(R.id.layout_root));
        ImageView image = (ImageView) layout.findViewById(R.id.imageView);
        if(lang.equals("bg")) image.setImageDrawable(getResources().getDrawable(R.drawable.right));
        else
            image.setImageDrawable(getResources().getDrawable(R.drawable.wrong));
        imageDialog.setView(layout);
        imageDialog.create();
        imageDialog.show();
    }
    public void checkRo(View view){
        AlertDialog.Builder imageDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.custom_fullimage_dialog,
                (ViewGroup) findViewById(R.id.layout_root));
        ImageView image = (ImageView) layout.findViewById(R.id.imageView);
        if(lang.equals("ro")) image.setImageDrawable(getResources().getDrawable(R.drawable.right));
        else
            image.setImageDrawable(getResources().getDrawable(R.drawable.wrong));
        imageDialog.setView(layout);
        imageDialog.create();
        imageDialog.show();
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
