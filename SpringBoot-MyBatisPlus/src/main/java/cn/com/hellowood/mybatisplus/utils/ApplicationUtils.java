package cn.com.hellowood.mybatisplus.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import static cn.com.hellowood.mybatis.common.CommonConstant.DATE_TIME;

/**
 * The type Application utils.
 */
public class ApplicationUtils {

    /**
     * Format date string.
     *
     * @param date the date
     * @return the string
     */
    public static String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME);
        return simpleDateFormat.format(date);
    }
}
