package com.example.slip15q1;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout rootLayout = findViewById(R.id.rootLayout);
        GradientDrawable borderDrawable = new GradientDrawable();
        borderDrawable.setStroke(65, Color.WHITE);
        borderDrawable.setCornerRadius(75f);
        borderDrawable.setColor(Color.BLUE);
        rootLayout.setBackground(borderDrawable);
    }
}
