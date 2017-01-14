package com.nanodegrees.tejomai.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button app1, app2, app3, app4, app5, app6;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        context = getBaseContext();

        Button app1 = (Button) findViewById(R.id.btn_app1);
        Button app2 = (Button) findViewById(R.id.btn_app2);
        Button app3 = (Button) findViewById(R.id.btn_app3);
        Button app4 = (Button) findViewById(R.id.btn_app4);
        Button app5 = (Button) findViewById(R.id.btn_app5);
        Button app6 = (Button) findViewById(R.id.btn_app6);

        app1.setOnClickListener(buttonOnClick);
        app2.setOnClickListener(buttonOnClick);
        app3.setOnClickListener(buttonOnClick);
        app4.setOnClickListener(buttonOnClick);
        app5.setOnClickListener(buttonOnClick);
        app6.setOnClickListener(buttonOnClick);
    }

    private void showToastMessage(int stringID){
        Toast.makeText(context, getString(stringID), Toast.LENGTH_LONG).show();
    }

    View.OnClickListener buttonOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.btn_app1:
                    showToastMessage(R.string.app1_message);
                    break;
                case R.id.btn_app2:
                    showToastMessage(R.string.app2_message);
                    break;
                case R.id.btn_app3:
                    showToastMessage(R.string.app3_message);
                    break;
                case R.id.btn_app4:
                    showToastMessage(R.string.app4_message);
                    break;
                case R.id.btn_app5:
                    showToastMessage(R.string.app5_message);
                    break;
                case R.id.btn_app6:
                    showToastMessage(R.string.app6_message);
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return true;
    }
}
