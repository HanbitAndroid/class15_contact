package com.hanbit.app.contactapp.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.app.contactapp.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{
    Button btUpdate,btList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        btList= (Button) findViewById(R.id.btList);
        btUpdate= (Button) findViewById(R.id.btUpdate);
        btList.setOnClickListener(this);
        btUpdate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btList:
                startActivity(new Intent(DetailActivity.this,ListActivity.class));
                break;
            case R.id.btUpdate:
                Intent intent=new Intent(DetailActivity.this,UpdateActivity.class);
                intent.putExtra("id","hong");
                startActivity(intent);
                break;
        }
    }
}
