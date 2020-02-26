package edu.msu.lawsont2.madhatter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ColorSelectActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_color_select);


    }

    public void selectColor(int color) {
        Intent intent = new Intent(this, HatterActivity.class);
        String colorStr = Integer.toString(color);
        intent.putExtra("COLOR", colorStr);
        setResult(Activity.RESULT_OK, intent);
        finish();

    }

    public void onBack(View view) {
        Intent intent = new Intent(this, HatterActivity.class);
        setResult(Activity.RESULT_CANCELED, intent);
        finish();
    }


}
