package com.demo.mark.easechat_easeui_demo.autoruntimepermissions;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 2017/9/22.
 */

public class ActivitiesController {
    //创建Activity集合
    private static List<Activity> activityList = new ArrayList<>();
    //集合添加
    public static void addActivity(Activity activity){
        activityList.add(activity);
    }
    //集合移除
    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }
    //获取栈顶Activity
    public static Activity getTopActivity(){
        if (activityList.isEmpty()){
            return null;
        }else {
            return activityList.get(activityList.size()-1);
        }
    }
}
