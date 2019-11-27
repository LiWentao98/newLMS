package com.mtli.lms.librarymanager.testBorrow;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: Mt.Li
 * @Create: 2019-11-25 14:44
 */
public class testDate {
    public static void main(String[] args) throws ParseException {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(currentTime));
    }
}
