package com.example.amalharian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.LinkedList;

public class CatatAmalanActivity extends AppCompatActivity {
    //untuk recycler
    public LinkedList <Amalan> mAmalan = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private AmalanListAdapter mAdapter;

    //untuk database
    private AmalanListOpenHelper mDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catat_amalan);
        String[] arr = getResources().getStringArray(R.array.namaAmalanArray);

        mDB = new AmalanListOpenHelper(this);

        for(int i = 0 ; i < arr.length ; i++){
            mAmalan.addLast(new Amalan(arr[i], false));
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerviewamalan);
        mAdapter = new AmalanListAdapter(this, mAmalan);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
