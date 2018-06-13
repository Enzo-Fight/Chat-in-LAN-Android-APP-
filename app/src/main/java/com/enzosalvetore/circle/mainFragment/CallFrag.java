package com.enzosalvetore.circle.mainFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.enzosalvetore.circle.R;
import com.enzosalvetore.circle.MyLog;

public class CallFrag extends Fragment {

    private static final String TAG = "CallFrag";
    private TextView testText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        MyLog.log(TAG,"in CallFrag onCreateView");
        View view = inflater.inflate(R.layout.main_fragment_call,
                container,false);
        testText = (TextView)view.findViewById(R.id.call_test_text);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        testText.setText("in callFrag");
    }
}