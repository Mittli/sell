package com.miter.sell.vo;

import lombok.Data;

/**
 * http请求返回最外层对象
 *
 * @author miter
 * @create 2017-10-15 17:54
 **/
@Data
public class ResultVO<T> {
    /** 错误码 */
    private Integer code;
    /** 提示信息 */
    private String msg;
    /** 具体内容 */
    private T data;
}
