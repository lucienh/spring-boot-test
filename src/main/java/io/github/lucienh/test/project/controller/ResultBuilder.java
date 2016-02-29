package io.github.lucienh.test.project.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Author developer
 * Date： 16-2-29
 * Version: spring-boot-test-1.0
 * Copyright : lucienh
 */

public class ResultBuilder {

    private static final Map<String, Object> successCodeBean = new HashMap<String, Object>(1) {
        {
            put("success", true);
        }
    };

    /**
     * @return 成功标识
     * @describe 构建成功标识
     * @see
     */
    public static Map buildSuccessCode() {
        return successCodeBean;
    }

    /**
     * @return 成功Map
     * @describe 构建成功Map
     * @see "The Java Programming Language"
     */
    public static Map buildSuccess(Object data) {
        Map<String, Object> map = new HashMap<String, Object>(2);
        map.put("success", true);
        map.put("data", data);
        return map;
    }

    public static Map buildErrorInfo(Object data) {
        Map<String, Object> map = new HashMap<String, Object>(2);
        map.put("success", false);
        map.put("errInfo", data);
        return map;
    }

    /**
     * @return 失败Map
     * @describe 构建失败Map
     * @see
     */
    public static Map buildError(String errMessage) {
        Map<String, Object> map = new HashMap<String, Object>(2);
        map.put("success", false);
        map.put("errorMessage", errMessage);
        return map;
    }

}
