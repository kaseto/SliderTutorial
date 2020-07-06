package com.example.slidertutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    int[]images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images=new int[]{
                R.drawable.im1,
                R.drawable.im2,
                R.drawable.im3,
                R.drawable.im4,
                R.drawable.im5,
                R.drawable.im6
        };
        viewPager=(ViewPager)findViewById(R.id.pager);
        adapter=new ImagePagerAdapter(MainActivity.this,images);
        viewPager.setAdapter(adapter);
    }
}
