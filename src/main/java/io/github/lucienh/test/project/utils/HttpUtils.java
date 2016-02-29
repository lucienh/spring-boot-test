package io.github.lucienh.test.project.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class HttpUtils {

    private static final Logger logger = LoggerFactory
            .getLogger(HttpUtils.class);

    public static String getToken() {
        HttpServletRequest request = getServletRequest();
        if (request != null) {
            return getCookieValue(getServletRequest().getCookies(), "token");
        } else {
            return null;
        }
    }

    private static String getCookieValue(Cookie[] cookies, String key) {
        // todo please confirm with UI developer
        if (null != cookies && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equalsIgnoreCase(key)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    public static HttpServletRequest getServletRequest() {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        if (attr != null) {
            HttpServletRequest request = attr.getRequest();
            return request;
        } else {
            logger.info("ServletRequestAttributes is not found, it may be not come from spring mvc");
            return null;
        }

    }

}
