package com.example.sell.VO;

import lombok.Data;

/**
 * @Description 返回最外面的对象
 * @auther lfx
 * @date 2019/3/9 19:08
 */
@Data
public class ResultVO<T> {

    /** 错误码 **/
    private Integer code;

    /** 提示信息 **/
    private String msg;

    /** 具体内容 **/
    private T data;

}
