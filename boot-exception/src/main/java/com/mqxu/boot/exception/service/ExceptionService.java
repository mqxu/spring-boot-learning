package com.mqxu.boot.exception.service;

import com.mqxu.boot.exception.consts.MsgConsts;
import com.mqxu.boot.exception.enums.CustomExceptionType;
import com.mqxu.boot.exception.exception.CustomException;
import org.springframework.stereotype.Service;

/**
 * @description: 通用异常处理逻辑
 * @author: mqxu
 * @date: 2022-04-11
 **/
@Service
public class ExceptionService {

    /**
     * 服务层，模拟系统异常
     */
    public void systemBizError() {
        try {
            Class.forName("com.mysql.jdbc.cj.Driver");
        } catch (ClassNotFoundException e) {
            throw new CustomException(
                    CustomExceptionType.SYSTEM_ERROR,
                    "在XXX业务，myBiz()方法内，出现ClassNotFoundException，请将该信息告知管理员");
        }
    }

    /**
     * 服务层，模拟用户输入数据导致的校验异常
     *
     * @param input 用户输入
     */
    public void userBizError(int input) {
        //模拟业务校验失败逻辑
        if (input < 0) {
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, MsgConsts.INPUT_ERROR);
        }
    }

}