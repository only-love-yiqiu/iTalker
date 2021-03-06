package com.imist.italker.common;


public class Common {
    /**
     * 一些不可变得永痕参数，通常用于写配置
     */
    public interface Constance {
        //手机正则
        String REGEX_MOBILE = "[1][3,4,5,7,8][0-9]{9}$";

        String API_URL = "http://imisty.cn:8080/italker/api/";
        //String API_URL = "http://192.168.1.105:8080/api/";

        //最大的图片上传大小
        long MAX_UPLOAD_IMAGE_LENGTH = 860 * 1024;
    }
}
