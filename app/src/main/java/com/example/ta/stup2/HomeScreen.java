package com.example.ta.stup2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    BottomNavigationView mBottomNavigationView;


    private ViewPager viewPager;


    PlansFragment plansFragment;
    HomeFragment homeFragment;
    ProfileFragment profileFragment;
    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:

                        viewPager.setCurrentItem(0);
                        return true;

                        // do something here
                    case R.id.action_plans:
                        // do something here
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.action_profile:
                        // do something here
                        viewPager.setCurrentItem(2);
                        return true;
                }
                return false;
            }
        });



     viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if (prevMenuItem != null) {
                prevMenuItem.setChecked(false);
            }
            else
            {
                mBottomNavigationView.getMenu().getItem(0).setChecked(false);
            }
            Log.d("page", "onPageSelected: "+position);
            mBottomNavigationView.getMenu().getItem(position).setChecked(true);
            prevMenuItem = mBottomNavigationView.getMenu().getItem(position);

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    });

         //Disable ViewPager Swipe
       /*viewPager.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });*/


    setupViewPager(viewPager);
}

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        homeFragment =new HomeFragment();
        plansFragment =new PlansFragment();
        profileFragment =new ProfileFragment();
        adapter.addFragment(homeFragment);
        adapter.addFragment(plansFragment);
        adapter.addFragment(profileFragment);
        viewPager.setAdapter(adapter);
    }
}