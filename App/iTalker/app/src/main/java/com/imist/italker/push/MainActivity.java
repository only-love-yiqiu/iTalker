package com.imist.italker.push;



import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.ViewTarget;
import com.imist.italker.common.app.Activity;
import com.imist.italker.common.widget.PortraitView;

import butterknife.BindView;
import butterknife.OnClick;


public class MainActivity extends Activity implements BottomNavigationView.OnNavigationItemSelectedListener{
    @BindView(R.id.appbar)
    View mLayAppbar;
    @BindView(R.id.im_portrait)
    PortraitView mPortrait;
    @BindView(R.id.txt_title)
    TextView mTittle;
    @BindView(R.id.lay_container)
    FrameLayout mConTainner;
    @BindView(R.id.navigation)
    BottomNavigationView mNavigationView;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        mNavigationView.setOnNavigationItemSelectedListener(this);
        Glide.with(this).load(R.drawable.bg_src_morning)
                .centerCrop()
                .into(new ViewTarget<View,GlideDrawable>(mLayAppbar) {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        this.view.setBackground(resource.getCurrent());
                    }
                });
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @OnClick(R.id.im_search)
    void onSearchMenuClick(){

    }
    @OnClick(R.id.btn_action)
    void onActionClick(){

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mTittle.setText(item.getTitle());
        return false;
    }



}
