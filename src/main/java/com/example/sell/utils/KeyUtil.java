package com.example.sell.utils;

import java.util.Random;

/**
 * @Description 生成id
 * @auther lfx
 * @date 2019/3/14 22:29
 */
public class KeyUtil {

    /**
     * 生成唯一的id
     * 格式：时间+随机数
     * @return
     */
    public static String getUniqueKey() {

        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
