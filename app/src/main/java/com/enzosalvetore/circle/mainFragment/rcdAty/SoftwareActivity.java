package com.enzosalvetore.circle.mainFragment.rcdAty;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.enzosalvetore.circle.R;
import com.enzosalvetore.circle.BasicActivity;

/**
 * Created by Enzo on 2018/5/4.
 */

public class SoftwareActivity extends BasicActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainfrag_rcdaty_soft);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        ((Button)findViewById(R.id.soft_call_back_btn)).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
        TextView contentTextView =(TextView)findViewById(R.id.software_info_text);
        contentTextView.setMovementMethod(new ScrollingMovementMethod());
        contentTextView.setText("Circle1.0 \n" +
                "完成时间：2018.05.06\n" +
                "\n" +
                "面向对象程序设计\n" +
                "项目名称：网络聊天程序\n" +
                "指导老师：徐兴教授\n" +
                "\n" +
                "Circle APP开发者：吴泽锦\n" +
                "手机：15626056350（微信）\n" +
                "邮箱：1916720067@qq.com\n" +
                "求职：Android开发工程师\n" +
                "通信工程（本科） | 绩点：3.91（5.0） | 排名：21/125\n" +
                "\n" +
                "项目经历：\n" +
                "\uF06C\t在“大创”省级项目中，我们的目标是实现在Android平台对无人机的喷施控制，在这期间本人耗时1个月入门Android开发，同时独自完成UAV软件的开发，该软件提供：控制多架无人机的喷施、汇集无人机数据、提供曲线图展示数据、数据查询等相关功能；\n" +
                "\uF06C\t在研究生实验室学习期间，曾采用K-means算法对龙眼叶的叶片感兴趣区进行提取，以提供作为BP神经算法的输入，实现对叶绿素含量的预测，并由此发表了2篇软件著作权。\n" +
                "\n" +
                "校园经历：\n" +
                "工作：\n" +
                "\uF06C\t2015年当选班长，并被任命为院15级班长团支书_小组组长；\n" +
                "\uF06C\t2015年在军训期间担任副排长一职，并被评为优秀学生干部。\n" +
                "\n" +
                "智育：\n" +
                "\uF06C\t2016年以各身份获得软件著作权4篇；\n" +
                "\uF06C\t2016年以优秀工作者身份获单项奖，当年辞职后专注于技术领域，\n" +
                "后于2017年荣获二等奖学金(院3%)，排名12/471；\n" +
                "\uF06C\t2017年以负责人身份成功申报“大创”省级项目（进行中）。\n" +
                "\n" +
                "体育与德育：\n" +
                "\uF06C\t2016年在田径运动会中，入选院国旗队，获得院男1500m季军；\n" +
                "\uF06C\t次年获得院男1500m冠军；\n" +
                "\uF06C\t参与无偿献血3次，积极参与思园扫墓等志愿活动。\n" +
                "\n" +
                "技能与爱好：\n" +
                "\uF058\t掌握C，C++，熟悉Matlab，Java；\n" +
                "\uF058\t能独立完成Android软件开发； \n" +
                "\uF058\t能自组电子设备，喜欢钻研计算机技术；\n" +
                "\uF058\t跑步、健身，曾获田径1500m的跑步冠军。\n" +
                "\n" +
                "软件介绍：\n" +
                "一、自编代码：约2700行；\n" +
                "目前包含6个包；1个测试类；6个活动类，其中包含1个活动根类和5个普通活动类；4个碎片类；以及2个辅助类。\n" +
                "二、实现功能：\n" +
                "1.\t局域网私聊（局域网信道稳定，不易丢包，故采用UDP进行通信）；\n" +
                "2.\t局域网群聊（根据根据计算机网络技术，采用特殊IP地址进行封包发送即可实现群发功能）；\n" +
                "3.\t数据存取（采用Android自带MySQL数据库）。\n" +
                "三、接受软件定制（实现类似此软件功能）\n" +
                "1.\t开发周期：2周，时长根据实际情况而定；\n" +
                "2.\t开发价格： 300元/天，可选择在此软件基础上进行二次开发； \n" +
                "3.\t提供开发源码；\n" +
                "4.\t具体可面议。\n");
    }
}