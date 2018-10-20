package com.daffzzaqihaq.founderco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daffzzaqihaq.bacain.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailFounderActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_founder);
        ButterKnife.bind(this);

        txtTitle.setText(getIntent().getStringExtra("nb"));
        txtDetail.setText(getIntent().getStringExtra("db"));
        Glide.with(this).load(getIntent().getIntExtra("gb",0)).into(imgLogo);

    }
}
