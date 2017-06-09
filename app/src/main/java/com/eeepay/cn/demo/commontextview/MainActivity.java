package com.eeepay.cn.demo.commontextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.allen.library.SuperTextView;
import com.allen.library.SuperTextView.OnSuperTextViewClickListener;

import static com.eeepay.cn.demo.commontextview.R.id.stv_blance;

/**
  * 描述：是一个功能强大的View，可以满足日常大部分布局样式
  * 作者：zhuangzeqin
  * 时间: 2017/6/9-9:23
  * 邮箱：zzq@eeepay.cn
  */
public class MainActivity extends AppCompatActivity {

     private com.allen.library.SuperTextView stvzh;
     private com.allen.library.SuperTextView stvblance;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         stvblance = (SuperTextView) findViewById(stv_blance);
         stvzh = (SuperTextView) findViewById(R.id.stv_zh);


         /**
          * 设置点击事件
          */
         stvblance.setOnSuperTextViewClickListener(new OnSuperTextViewClickListener() {
             @Override
             public void onSuperTextViewClick() {
                 super.onSuperTextViewClick();

                 Toast.makeText(MainActivity.this, stvblance.getCbisChecked()+"", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onLeftTopClick() {
                 super.onLeftTopClick();
                 Toast.makeText(MainActivity.this, "账号余额", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onLeftBottomClick() {
                 super.onLeftBottomClick();

                 Toast.makeText(MainActivity.this, "可用余额", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onLeftBottomClick2() {
                 super.onLeftBottomClick2();
                 Toast.makeText(MainActivity.this, "2020元",
                         Toast.LENGTH_SHORT).show();

             }
         });
     }

     private void inintSetting()
     {
         /**
          * 可以通过链式设置大部分常用的属性值
          */
         stvzh.setLeftIcon(getDrawable(R.mipmap.ic_launcher))
                 .setLeftString("属性值")
                 .setLeftTVColor(R.color.colorPrimary)
                 .setLeftTopString("属性值TOP")
                 .setLeftTopTVColor(R.color.colorAccent)
                 .setLeftBottomString("属性值1")
                 .setLeftBottomTVColor(R.color.gray_btn)
                 .setLeftBottomString2("属性值2")
                 .setLeftBottomTVColor2(R.color.colorAccent)
                 .setRightString("通属性值3")
                 .setRightTVColor(R.color.red_btn)
                 .setCbChecked(true)
                 .setCbBackground(getDrawable(R.drawable.progress))
                 .setRightIcon(getDrawable(R.drawable.more_gray))
                 .setRightTVColor(R.color.colorAccent)
         ;
     }
}
