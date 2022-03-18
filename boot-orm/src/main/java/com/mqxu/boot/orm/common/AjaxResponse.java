package com.mqxu.boot.orm.common;

import lombok.Data;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-10
 **/
@Data
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    private AjaxResponse() {
    }

    /**
     * 请求成功的响应:不带查询参数（删除、修改、新增的接口）
     *
     * @return AjaxResponse
     */
    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }

    /**
     * 请求成功的响应:带返回数据
     *
     * @param data 返回数据
     * @return AjaxResponse
     */
    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }

    public static AjaxResponse failure() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(500);
        ajaxResponse.setMessage("请求失败");
        return ajaxResponse;
    }


}
