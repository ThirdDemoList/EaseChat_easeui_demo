package com.demo.mark.easechat_easeui_demo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.demo.mark.easechat_easeui_demo.R;
import com.hyphenate.chat.EMConversation;
import com.hyphenate.easeui.EaseConstant;
import com.hyphenate.easeui.ui.EaseConversationListFragment;

/**
 * 会话列表
 * Created by mark on 2017/9/20.
 */

public class ConversationListActivity extends FragmentActivity {

    public EaseConversationListFragment conversationListFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conversationlist);

        //初始化
        initView();
    }

    private void initView() {
        //直接用环信的会话列表
        conversationListFragment = new EaseConversationListFragment();
        conversationListFragment.setArguments(getIntent().getExtras());
        conversationListFragment.setConversationListItemClickListener(
                new EaseConversationListFragment.EaseConversationListItemClickListener() {
                    @Override
                    public void onListItemClicked(EMConversation conversation) {
                        startActivity(new Intent(ConversationListActivity.this, ChatActivity.class)
                                .putExtra(EaseConstant.EXTRA_USER_ID, conversation.conversationId()));
                    }

                });
        getSupportFragmentManager().beginTransaction().add(R.id.ec_layout_list, conversationListFragment).commit();

    }



}
