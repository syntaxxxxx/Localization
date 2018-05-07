package com.example.idn.localization;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello, tvPlural, tvXliff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = findViewById(R.id.tv_hello);
        tvPlural = findViewById(R.id.tv_plural);
        tvXliff = findViewById(R.id.tv_xliff);

        int pokeCount = 3;

        String hallo = String.format(getResources()
                        .getString(R.string.hello_world),
                "Fiqri Hafzain", pokeCount, "Neymar Jr");

        tvHello.setText(hallo);

        int songCount = 5;

        String pluralText = getResources()
                .getQuantityString(R.plurals.numberOfSongsAvailable,
                        songCount, songCount);

        tvPlural.setText(pluralText);
        tvXliff.setText(getResources().getString(R.string.app_homeurl));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.setting) {
            startActivity(new Intent(Settings.ACTION_LOCALE_SETTINGS));
        }

        return super.onOptionsItemSelected(item);

    }
}

