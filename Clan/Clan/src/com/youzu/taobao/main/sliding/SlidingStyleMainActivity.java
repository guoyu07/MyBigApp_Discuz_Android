package com.youzu.taobao.main.sliding;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.youzu.android.framework.view.annotation.ContentView;
import com.youzu.taobao.R;
import com.youzu.taobao.base.util.SlidingMenuUtils;
import com.youzu.taobao.main.qqstyle.QQStyleMainActivity;

@ContentView(R.layout.activity_main_sliding)
public class SlidingStyleMainActivity extends QQStyleMainActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void initSlidingMenu() {

        viewPager = (ViewPager) findViewById(R.id.pager);
//        View[] ignoreView = {viewPager};

        SlidingMenuUtils.initSilidingMenu(this, null, true, getResources().getDrawable(R.drawable.trans), false);
    }
}
