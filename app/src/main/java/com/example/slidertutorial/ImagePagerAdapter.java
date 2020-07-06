package com.example.slidertutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


public class ImagePagerAdapter extends PagerAdapter {

    Context context;
    int[]images;
    LayoutInflater inflater;

//CONSTRUCTOR:

    public ImagePagerAdapter(Context context, int[] images){

        this.context=context;
        this.images=images;

    }


    @Override
    public int getCount() {
        return this.images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    //Instancia de cada página:
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ImageView imageView;

        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView=inflater.inflate(R.layout.pager_item,container,false);

        imageView=(ImageView)itemView.findViewById(R.id.image_view);

        imageView.setImageResource(images[position]);

        ((ViewPager)container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((RelativeLayout)object);
    }
}
