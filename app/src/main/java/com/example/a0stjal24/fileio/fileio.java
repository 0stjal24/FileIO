package com.example.a0stjal24.fileio;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        String dir_path = Environment.getExternalStorageDirectory().getAbsolutePath();
        EditText et = (EditText) findViewById(R.id.et1);

        if (item.getItemId() == R.id.save) {

            try {
                FileWriter fw = new FileWriter(dir_path + "/notes.txt");
                PrintWriter pw = new PrintWriter(fw);
                pw.println(et.getText());
                pw.flush();
                pw.close();
            }
            catch(IOException e){
                System.out.println("Error! " + e.getMessage());
            }

            return true;
        }
        else if (item.getItemId() == R.id.load) {

            return true;
        }

        return false;
    }


}
