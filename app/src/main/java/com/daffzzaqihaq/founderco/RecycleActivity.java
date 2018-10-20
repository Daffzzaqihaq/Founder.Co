package com.daffzzaqihaq.founderco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.daffzzaqihaq.bacain.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] namaFounder,detailFounder;
    int[] gambarFounder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);


        namaFounder = getResources().getStringArray(R.array.namefounder);
        detailFounder = getResources().getStringArray(R.array.detailfounder);
        gambarFounder = new int[]{R.drawable.timbenners, R.drawable.galileo, R.drawable.archimedes, R.drawable.benjamin_franklin, R.drawable.wright_brother, R.drawable.james_watt, R.drawable.alexander_graham_bell, R.drawable.thomas_edison, R.drawable.nikola_tesla, R.drawable.leonardo_davinci};

        Adapter adapter = new Adapter(RecycleActivity.this, gambarFounder,namaFounder,detailFounder);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}
