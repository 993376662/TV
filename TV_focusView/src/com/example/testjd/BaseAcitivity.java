/**  
* File Name:SettingAcitivity.java  
* Package Name:com.aries.setting.common.utils  
* Date:2016-7-13  
* Copyright (c) 2016,  All Rights Reserved.  
*  
*/  
  
package com.example.testjd;  

import android.app.Activity;
import android.os.Bundle;

public class BaseAcitivity extends Activity
{
   
    protected MainUpView flyBorder; //焦点框
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
          
        super.onCreate(savedInstanceState);

        flyBorder = new MainUpView(this);//初始化焦点移动框
        flyBorder.setUpRectResource(R.drawable.focus);//设置焦点框图片
    }
    
    /**  
     * flyBorder.  
     *  
     * @return  the flyBorder  
     */
    public MainUpView getFlyBorder()
    {
        return flyBorder;
    }

    /**  
     * flyBorder.  
     *  
     * @param   flyBorder    the flyBorder to set   
     */
    public void setFlyBorder(MainUpView flyBorder)
    {
        this.flyBorder = flyBorder;
    }
    
}
  
