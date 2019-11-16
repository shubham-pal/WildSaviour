package com.example.codehead.criminalintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import co.gofynd.gravityview.GravityView;

public class MainActivity extends AppCompatActivity {

    GravityView gravityView;
    ImageView image_bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



        image_bg = findViewById(R.id.bg);
        gravityView = GravityView.getInstance(this);

        if(!gravityView.deviceSupported()) {
            Toast.makeText(this, "Not!!!", Toast.LENGTH_LONG).show();
            return;
        }
        else {
            Toast.makeText(this, "YESSSSSS!!!", Toast.LENGTH_LONG).show();

            gravityView.setImage(image_bg, R.drawable.launcherbg).center();

        }

    }


}
