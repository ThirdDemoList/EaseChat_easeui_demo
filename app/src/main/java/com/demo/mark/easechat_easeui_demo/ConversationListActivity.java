package com.demo.mark.easechat_easeui_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hyphenate.easeui.ui.EaseConversationListFragment;

/**
 * 会话列表
 * Created by mark on 2017/9/20.
 */

public class ConversationListActivity extends AppCompatActivity{

    public EaseConversationListFragment conversationListFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conversationlist);

        //初始化
        initView();
    }

    private void initView() {
        //直接用环信的会话列表
        conversationListFragment = new EaseConversationListFragment();
        conversationListFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(R.id.ec_layout_list, conversationListFragment).commit();
        //会话列表控件
//        conversationListView = (EaseConversationList)findViewById(R.id.list);
        //初始化，参数为会话列表集合
//        conversationListView.init(conversationList);
        //刷新列表
//        conversationListView.refresh();
    }
}
