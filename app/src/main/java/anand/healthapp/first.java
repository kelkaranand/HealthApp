package anand.healthapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Handler;


public class first extends Activity {

    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main=new Intent(first.this,MainActivity.class);
                Intent reg=new Intent(first.this,register.class);
                if(flag==1) {
                    first.this.startActivity(main);
                    first.this.finish();
                }
                else
                {
                    first.this.startActivity(reg);
                    first.this.finish();
                }
            }
        },1000);
    }


}
