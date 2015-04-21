package anand.healthapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.LinearLayout;
import android.app.AlertDialog;
import android.widget.LinearLayout.LayoutParams;


public class me extends ActionBarActivity {
    ImageView add;
    ImageView edit;

    String[] s={"FitBit","JawBone"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        add=(ImageView)findViewById(R.id.imageView19);
        edit=(ImageView)findViewById(R.id.imageView18);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(me.this, register.class);
                startActivity(reg);
                finish();
            }
        });


        final ArrayAdapter<String> adp = new ArrayAdapter<String>(me.this,
                android.R.layout.simple_spinner_item, s);

        final Spinner sp = new Spinner(me.this);
        sp.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        sp.setAdapter(adp);

        //final AlertDialog.Builder builder = new AlertDialog.Builder(me.this);
        //builder.setView(sp);
        //builder.create().show();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(me.this);
                builder.setView(sp);
                builder.create().show();

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_me, menu);
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
}
