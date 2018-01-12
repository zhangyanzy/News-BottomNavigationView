package com.zhangyan.news;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.zhangyan.news.fragment.HomeFragment;
import com.zhangyan.news.fragment.MineFragment;
import com.zhangyan.news.fragment.OrderFragment;
import com.zhangyan.news.fragment.ShoppingFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, ViewPager.OnPageChangeListener, View.OnTouchListener {

    private ViewPager mViewPage;
    private MenuItem mMenuItem;
    private BottomNavigationView mBottomView;
    private ViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPage = findViewById(R.id.main_vp);
        mBottomView = findViewById(R.id.bottom_navigation);
        mBottomView.setOnNavigationItemSelectedListener(this);
        BottomNavigationViewHelper.disableShiftMode(mBottomView);
        mViewPage.addOnPageChangeListener(this);
        mViewPage.setOnTouchListener(this);

        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mAdapter.addFragment(new HomeFragment());
        mAdapter.addFragment(new ShoppingFragment());
        mAdapter.addFragment(new OrderFragment());
        mAdapter.addFragment(new MineFragment());
        mViewPage.setAdapter(mAdapter);
        mViewPage.setOffscreenPageLimit(3);
        //设置初始值为哪个页面
//        mBottomView.setSelectedItemId(R.id.item_shopping);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_home:
                mViewPage.setCurrentItem(0);
                break;
            case R.id.item_shopping:
                mViewPage.setCurrentItem(1);
                break;
            case R.id.item_order:
                mViewPage.setCurrentItem(2);
                break;
            case R.id.item_mine:
                mViewPage.setCurrentItem(3);
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (mMenuItem != null) {
            mMenuItem.setCheckable(false);
        } else {
            mBottomView.getMenu().getItem(0).setCheckable(false);
        }
        mMenuItem = mBottomView.getMenu().getItem(position);
        mMenuItem.setCheckable(true);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }
}
