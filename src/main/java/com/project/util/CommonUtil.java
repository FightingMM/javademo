package com.project.util;



import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * @author: heeexy
 * @description: 本后台接口系统常用的json工具类
 * @date: 2017/10/24 10:12
 */
public class CommonUtil {

    public static boolean stringIsNotNull(String str) {
        boolean res = (str == null || str.length() == 0);
        return !res;
    }


    public static boolean isValidEmail(String email) {
        if ((email != null) && (!email.isEmpty())) {
            return Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", email);
        }
        return false;
    }

    public static boolean isValidPassword(String password) {
        if ((password != null) && (!password.isEmpty())) {
            int length = password.length();
            if (length > 6 && length < 16){
                return true;
            }
            return false;
        }
        return false;
    }

    public static String generateId() {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }
}
