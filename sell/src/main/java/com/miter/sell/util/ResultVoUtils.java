package com.miter.sell.util;

import com.miter.sell.vo.ResultVO;

/**
 * 返回结果工具类
 *
 * @author miter
 * @create 2017-10-15 21:41
 **/
public class ResultVoUtils {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
