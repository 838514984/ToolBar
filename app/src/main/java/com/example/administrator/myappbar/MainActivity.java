package com.example.administrator.myappbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbarlayout);
        Toolbar toolbar= (Toolbar) findViewById(R.id.t);

        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"the navigationButton is be clicked.",0).show();
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.search:
                        showToast("the search item has been clicked");
                        break;
                    case R.id.notification:
                        showToast("the notification item has been click");
                        break;
                    case R.id.item1:
                        showToast("the item 1 item has been click");
                        break;
                    case R.id.item2:
                        showToast("the item 2 item has been click");
                        break;
                }

                return true;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.muitymenu,menu);
        return true;
    }
    private void showToast(String msg){
        Toast.makeText(this,msg,0).show();
    }
}
