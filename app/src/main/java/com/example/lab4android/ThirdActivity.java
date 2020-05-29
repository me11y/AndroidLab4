package com.example.lab4android;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.lab4android.Fragments.ImageFragment;
import com.example.lab4android.Fragments.ImageFragment3;
import com.example.lab4android.Fragments.imageFragment2;
import com.google.android.material.tabs.TabLayout;


public class ThirdActivity extends AppCompatActivity {

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        manager = getSupportFragmentManager();
        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tab = findViewById(R.id.tab);
        tab.setupWithViewPager(viewPager);
        viewPager.setAdapter(new FragmetsAdapter(manager));
    }
}

class FragmetsAdapter extends FragmentPagerAdapter{

    public FragmetsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "Sasuke";
        else if(position == 1)
            return "Naruto";
        else
            return "Sakura";
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return ImageFragment.newInstance();}
        else
            if (position == 1) {
                return imageFragment2.newInstance();
            }
        else
            return ImageFragment3.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
