package ben.fuligni.com.tinyappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.support.v7.widget.AppCompatImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioButtonGroup = (RadioGroup)findViewById(R.id.radioButtonGroup);
                radioButtonGroup.clearCheck();
            }
        });

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               RadioGroup rg = (RadioGroup) findViewById(R.id.radioButtonGroup);
               int rbid = rg.getCheckedRadioButtonId();
               if (rbid != -1) {
                   RadioButton rb = (RadioButton) findViewById(rbid);
                   String name = (String) rb.getText();
                   Intent intent = new Intent(getApplicationContext(), SampleChapter.class);
                   intent.putExtra("radioGroup", name);
                   startActivity(intent);
               } else {
                   Intent intent = new Intent(getApplicationContext(), SampleChapter.class);
                   intent.putExtra("radioGroup", "");
                   startActivity(intent);
               }
            }
        });
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

    public void resetSelection () {
        RadioGroup rg = (RadioGroup)findViewById(R.id.radioButtonGroup);
        rg.clearCheck();
    }
}
