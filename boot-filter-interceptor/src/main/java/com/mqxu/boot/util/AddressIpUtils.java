package com.mqxu.boot.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 获取ip访问地址的工具类
 * @author: mqxu
 * @date: 2022-04-04
 **/
public class AddressIpUtils {
    /**
     * 获取Ip地址
     *
     * @param request HttpServletRequest
     * @return ip
     */
    public static String getIpAddress(HttpServletRequest request) {
        String xIp = request.getHeader("X-Real-IP");
        String xFor = request.getHeader("X-Forwarded-For");
        if (StringUtils.isNotEmpty(xFor) && !"unKnown".equalsIgnoreCase(xFor)) {
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = xFor.indexOf(",");
            if (index != -1) {
                return xFor.substring(0, index);
            } else {
                return xFor;
            }
        }
        xFor = xIp;
        if (StringUtils.isNotEmpty(xFor) && !"unKnown".equalsIgnoreCase(xFor)) {
            return xFor;
        }
        if (StringUtils.isBlank(xFor) || "unknown".equalsIgnoreCase(xFor)) {
            xFor = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isBlank(xFor) || "unknown".equalsIgnoreCase(xFor)) {
            xFor = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isBlank(xFor) || "unknown".equalsIgnoreCase(xFor)) {
            xFor = request.getHeader("HTTP_CLIENT_IP");
        }
        if (StringUtils.isBlank(xFor) || "unknown".equalsIgnoreCase(xFor)) {
            xFor = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (StringUtils.isBlank(xFor) || "unknown".equalsIgnoreCase(xFor)) {
            xFor = request.getRemoteAddr();
        }
        return xFor;
    }
}
