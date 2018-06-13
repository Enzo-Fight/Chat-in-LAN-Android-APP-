package com.enzosalvetore.circle.mainFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.enzosalvetore.circle.R;
import com.enzosalvetore.circle.MyLog;

public class FunctionFrag extends Fragment {

    private static final String TAG = "FunctionFrag";
    private TextView testText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.main_fragment_function,
                container,false);
        MyLog.log(TAG,"in FunctionFrag onCreateView");
        testText = (TextView)view.findViewById(R.id.func_test_text);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        testText.setText("in funcFrag");
    }
}