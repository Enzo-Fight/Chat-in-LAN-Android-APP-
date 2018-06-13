package com.enzosalvetore.circle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.enzosalvetore.circle.MyLog;

import java.util.ArrayList;
import java.util.List;


public class BasicActivity extends AppCompatActivity{

    private static List<Activity>activities = new ArrayList<>();
    private static final String TAG = "BasicActivity";

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        activities.add(this);
        MyLog.log(TAG,getClass().getName());
        MyLog.log(TAG,"activities_size:"+activities.size());
    }

    @Override
    protected void onDestroy(){
        activities.remove(this);
        super.onDestroy();
    }

}
