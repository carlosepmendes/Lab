package com.example.android.lab;

import android.os.Debug;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Arrays;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cria um array com 5 elementos
        int[] myArray = new int[5];
        //popula as 5 posições do array, o último elemento é:  "size" -1
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        //outra forma de declarar
        int[] outroArray = {10, 20, 30, 40, 50};
        //e agora mandar para a consola
        Log.v("LogExample", String.valueOf(outroArray[0]));
        //log levels : V: Verbose   D: Debug  W: Warning  I: Info  E: Error

        //imprimir todas as linhas
        Log.v("LogExample", String.valueOf(myArray[0]));
        Log.v("LogExample", String.valueOf(myArray[1]));
        Log.v("LogExample", String.valueOf(myArray[2]));
        Log.v("LogExample", String.valueOf(myArray[3]));
        Log.v("LogExample", String.valueOf(myArray[4]));

        //ou com mais classe:
        for (int i = 0; i < myArray.length; i++) {
            Log.v("LogExample", String.valueOf(myArray[i]));
        }

        //ou com um for mais simples:
        for (int i : myArray) {
            Log.v("LogExample", String.valueOf(i));
        }

        //ou com um utilitário:
        Log.v("LogExample", Arrays.toString(myArray));
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
