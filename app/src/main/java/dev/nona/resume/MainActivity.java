package dev.nona.resume;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox cbProfile, cbSkills, cbExperience, cbEducation;
    SeekBar sbJava, sbJavascript, sbReactNative;
    LinearLayout llSkills, llExperience, llEducation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cbSkills = findViewById(R.id.cbSkills);
        cbExperience = findViewById(R.id.cbExperience);
        cbEducation = findViewById(R.id.cbEducation);

        sbJava = findViewById(R.id.sbJava);
        sbJavascript = findViewById(R.id.sbJavascript);
        sbReactNative = findViewById(R.id.sbReactNative);

        llSkills = findViewById(R.id.Skills);
        llExperience = findViewById(R.id.Work);
        llEducation = findViewById(R.id.Education);

        llSkills.setVisibility(View.GONE);
        llExperience.setVisibility(View.GONE);
        llEducation.setVisibility(View.GONE);

        sbJava.setOnTouchListener((v, event) -> true);
        sbJavascript.setOnTouchListener((v, event) -> true);
        sbReactNative.setOnTouchListener((v, event) -> true);

        cbSkills.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                llSkills.setVisibility(View.VISIBLE);
            }else {
                llSkills.setVisibility(View.GONE);
            }
        });

        cbExperience.setOnCheckedChangeListener((buttonView, isChecked) -> {
           if (isChecked) {
               llExperience.setVisibility(View.VISIBLE);
           }else {
               llExperience.setVisibility(View.GONE);
           }
        });

        cbEducation.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                llEducation.setVisibility(View.VISIBLE);
            }else {
                llEducation.setVisibility(View.GONE);
            }
        });
    }



}