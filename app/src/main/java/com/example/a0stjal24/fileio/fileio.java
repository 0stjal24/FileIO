package com.example.a0stjal24.fileio;

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

    public void onClick(View view)
    {
        EditText et = (EditText)findViewById(R.id.et1);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_texted, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.save) {
            PrintWriter pw =
                    new PrintWriter(new FileWriter("data.txt"));

            pw.close();
        }
        catch(IOException e)
        {
            System.out.println("I/O Error: " + e);

        }
        else
    }
}
