package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton enableButton;
    private Button hideButton, showButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.enableButton = (findViewById(R.id.button1));
        this.hideButton = (findViewById(R.id.button2));
        this.showButton = (findViewById(R.id.button3));
        this.imageView=(findViewById(R.id.picture1));
        hideButton.setEnabled(false);
        showButton.setEnabled(false);

        this.enableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(enableButton.isChecked())
                {
                    hideButton.setEnabled(true);
                    showButton.setEnabled(true);
                }
                else {
                    hideButton.setEnabled(false);
                    showButton.setEnabled(false);
                }

            }
        });
        this.hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.INVISIBLE);
            }
        });
        this.showButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                return true;
            }
        });
    }
}
