package ben.fuligni.com.tinyappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

public class SampleChapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_chapter);
        Intent intent = getIntent();
        String name = intent.getStringExtra("radioGroup");
        TextView tv = (TextView)findViewById(R.id.chapter);
        if (name.equals("Mercy")) {
            tv.setText(R.string.Arya);
        } else if (name.equals("Theon")) {
            tv.setText(R.string.theon);
        } else if (name.equals("Alayne")) {
            tv.setText(R.string.Alayne);
        } else if (name.equals("Victarion")) {
            tv.setText(R.string.Victarion);
        } else if (name.equals("Arianne")) {
            tv.setText(R.string.Arianne1);
        } else if (name.equals("Barristan")) {
            tv.setText(R.string.Barristan);
        } else {
            tv.setText(R.string.Aeron);
        }
    }
}
