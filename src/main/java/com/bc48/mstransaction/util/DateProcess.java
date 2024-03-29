package com.bc48.mstransaction.util;

import java.util.Calendar;
import java.util.Date;

public class DateProcess {

    public static Date addMonth(Date date,int quanttyMonths) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,quanttyMonths);
        System.out.println("addMonth = "+calendar.getTime().toString());
        return calendar.getTime();
    }

    public static Date reduceOneMonth(Date date,int quanttyMonths) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, quanttyMonths);
        return calendar.getTime();
    }

    public static Date updateDate(Date date, int param) {
        Calendar updateDate = Calendar.getInstance();
        Calendar lastDate = Calendar.getInstance();
        lastDate.setTime(date);
        int oldDay = lastDate.get(Calendar.DAY_OF_MONTH);
        int month = updateDate.get(Calendar.MONTH);;
        int year = updateDate.get(Calendar.YEAR);

        updateDate.set(year, month, oldDay);
        if (param == 0) {
            updateDate.add(Calendar.DAY_OF_MONTH, 1);
        } else {
            return updateDate.getTime();
        }
        return updateDate.getTime();
    }

    public static Boolean dateCompare(Date firstDate, Date lastDate) {
        Boolean result = false;
        return firstDate.before(lastDate);
    }
}
