package com.demo.mark.easechat_easeui_demo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hyphenate.chat.EMMessage;
import com.hyphenate.easeui.ui.EaseChatFragment;
import com.hyphenate.easeui.widget.chatrow.EaseCustomChatRowProvider;

/**
 *
 * 集成Easeui的EaseChatFragment，重写自定义
 * Created by Mark on 2017/9/21.
 */

public class ChatFragment extends EaseChatFragment implements EaseChatFragment.EaseChatFragmentHelper {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    protected void setUpView() {
        super.setUpView();
    }

    /**
     * 设置消息扩展属性
     */
    @Override
    public void onSetMessageAttributes(EMMessage message) {

    }
    /**
     * 进入会话详情
     */
    @Override
    public void onEnterToChatDetails() {

    }
    /**
     * 用户头像点击事件
     * @param username
     */
    @Override
    public void onAvatarClick(String username) {

    }

    @Override
    public void onAvatarLongClick(String username) {
        inputAtUsername(username);
    }
    /**
     * 消息气泡框点击事件
     */
    @Override
    public boolean onMessageBubbleClick(EMMessage message) {
        return false;
    }
    /**
     * 消息气泡框长按事件
     */
    @Override
    public void onMessageBubbleLongClick(EMMessage message) {

    }
    /**
     * 扩展输入栏item点击事件,如果要覆盖EaseChatFragment已有的点击事件，return true
     * @param view
     * @param itemId
     * @return
     */
    @Override
    public boolean onExtendMenuItemClick(int itemId, View view) {
     return true;
    }
    /**
     * 设置自定义chatrow提供者
     * @return
     */
    @Override
    public EaseCustomChatRowProvider onSetCustomChatRowProvider() {
        return null;
    }


}
