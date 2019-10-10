package com.example.md7;

import android.os.Bundle;
import com.example.md7.Fragments.FirstFragment;
import com.example.md7.Fragments.SecondFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fFragment = FirstFragment.newIstance(null);
        Fragment sFragment = SecondFragment.newIstance(null);

        MyTabsAdapter myTabsAdapter = new MyTabsAdapter(getSupportFragmentManager());
        myTabsAdapter.addFragment(fFragment,"FF");
        myTabsAdapter.addFragment(sFragment,"SF");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(myTabsAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}