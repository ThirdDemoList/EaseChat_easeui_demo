package com.demo.mark.easechat_easeui_demo.ui;

import android.Manifest;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.demo.mark.easechat_easeui_demo.R;
import com.demo.mark.easechat_easeui_demo.autoruntimepermissions.ActivitiesController;
import com.demo.mark.easechat_easeui_demo.autoruntimepermissions.PermissionListener;
import com.demo.mark.easechat_easeui_demo.base.BaseActivity;
import com.demo.mark.easechat_easeui_demo.fragment.ChatFragment;
import com.hyphenate.easeui.widget.EaseTitleBar;

import java.util.List;

public class ChatActivity extends FragmentActivity {

    // 当前聊天的 ID
    private String mChatId;
    public ChatFragment chatFragment;
    //环信聊天界面
    private EaseTitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        // 这里直接使用EaseUI封装好的聊天界面
        chatFragment = new ChatFragment();
        // 将参数传递给聊天界面
        chatFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(R.id.layout_chat, chatFragment).commit();

        initView();

    }

    /**
     * 初始化界面
     */
    private void initView() {
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
