package com.demo.mark.easechat_easeui_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hyphenate.easeui.ui.EaseChatFragment;
import com.hyphenate.easeui.widget.EaseTitleBar;

public class ChatActivity extends AppCompatActivity {

    // 当前聊天的 ID
    private String mChatId;
    public EaseChatFragment chatFragment;
    //环信聊天界面
    private EaseTitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        // 这里直接使用EaseUI封装好的聊天界面
        chatFragment = new EaseChatFragment();
        // 将参数传递给聊天界面
        chatFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(R.id.ec_layout_container, chatFragment).commit();

        initView();

    }

    /**
     * 初始化界面
     */
    private void initView() {
       /* titleBar = (EaseTitleBar)findViewById(R.id.title_bar);
        titleBar.setTitle("张建国");
        titleBar.setRightImageResource(R.drawable.ease_mm_title_remove);*/
       chatFragment.hideTitleBar();
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
