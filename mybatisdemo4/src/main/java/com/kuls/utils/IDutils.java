package com.kuls.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/23 7:47 上午
 */

@SuppressWarnings("all") //抑制警告
public class IDutils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }



}
