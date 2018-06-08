package com.spring.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
* Created by SAM on 2018/5/23.
*/

public class CalendarUtil {
    private int weeks = 0;  // 用来全局控制 上一周，本周，下一周的周数变化
    private int MaxDate;   // 一月最大天数
    private int MaxYear;  // 一年最大天数

    public static int getYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static String[] getDate(String publishType, String dayMonth, String dayWeek) {    //数据库字段值，数据截至日
        int currentDayWeek = CalendarUtil.getDayOfWeek();
        int currentDayMonth = CalendarUtil.getDayOfMonth();  //今天是本月第几天
        int dayWeekInt = Integer.parseInt(dayWeek);  //数据库设定值,数据更新日,可看日.  默认10  5
        int dayMonthInt = Integer.parseInt(dayMonth);
        String[] dayLast = new String[2];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        if (publishType.equalsIgnoreCase("week")) {   //日期是周

            if (currentDayWeek <= dayWeekInt) {           //今天是本周第几天。 默认周五（6）更新一周，返回上上周的周末
                cal.add(Calendar.WEEK_OF_MONTH, -2);    //数据周期一周是周一到周日。 2--1
                cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
                dayLast[0] = sdf.format(cal.getTime());
            } else {
                cal.add(Calendar.WEEK_OF_MONTH, -1);
                cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
                dayLast[0] = sdf.format(cal.getTime());
            }
            int temp = cal.get(Calendar.DAY_OF_MONTH);  //星期最近日是当月第几天
            if (temp <=dayMonthInt) {
                cal.add(Calendar.MONTH, -2);
                dayLast[1] = CalendarUtil.getLastMonthDay(cal); //当月最后一天
            } else {
                cal.add(Calendar.MONTH, -1);
                dayLast[1] = CalendarUtil.getLastMonthDay(cal); //当月最后一天
            }
        }else if (publishType.equalsIgnoreCase("month")){
            if (currentDayMonth <= dayMonthInt) {                              //当天在11号之前
                cal.add(Calendar.MONTH, -2);
                dayLast[1] = CalendarUtil.getLastMonthDay(cal);
            } else {
                cal.add(Calendar.MONTH, -1);
                dayLast[1] = CalendarUtil.getLastMonthDay(cal);   //函数用错了。当前月的最后一天。

            }
            cal.add(Calendar.MONTH, 1);      //加一个月，变为下月的1号 ,转变获取当前月的最后一天。
            cal.add(Calendar.DATE, -(1+currentDayMonth));  //月数据最近天

            int tmp1 = cal.get(Calendar.DAY_OF_WEEK) - 1;   //月数据最后天是当周第几天。
            if (0 == tmp1) {
                tmp1 = 7;
            }
            if (tmp1 <= (dayWeekInt-1) ) {
                cal.add(Calendar.WEEK_OF_MONTH, -2);
                cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY );  //设置为星期天
                dayLast[0] = sdf.format(cal.getTime());
            } else {
                cal.add(Calendar.WEEK_OF_MONTH, -1);
                cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY );  //设置为星期天
                //cal.set(Calendar.DAY_OF_WEEK, 7);
                dayLast[0] = sdf.format(cal.getTime());
            }
        }
        return dayLast;
    }
        /**
         * 获得当前月份
         *
         * @return
         *//*
    public static int getMonth() {
        return Calendar.getInstance().get(Calendar.MONTH) + 1;
    }

    *//**
         * 获得今天在本年的第几天
         *
         * @return
         *//*
    public static int getDayOfYear() {
        return Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
    }*/

        /**
         * 获得今天在本月的第几天(获得当前日)
         *
         * @return
         */
        public static int getDayOfMonth () {
            return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        }

        /**
         * 获得今天在本周的第几天
         *
         * @return
         */
        public static int getDayOfWeek () {
            return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        }

        /**
         * 获得今天是这个月的第几周
         *
         * @return
         */
        public static int getWeekOfMonth () {
            return Calendar.getInstance().get(Calendar.DAY_OF_WEEK_IN_MONTH);
        }

        /*
         */
/**
 * 获得半年后的日期
 *
 * @return
 *//*

    public static Date getTimeYearNext() {
        Calendar.getInstance().add(Calendar.DAY_OF_YEAR, 183);
        return Calendar.getInstance().getTime();
    }

    */
/**
 * 将日期转换成字符串
 *
 * @param dateTime
 * @return
 *//*

    public static String convertDateToString(Date dateTime) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(dateTime);
    }

    */
/**
 * 得到二个日期间的间隔天数
 *
 * @param sj1
 * @param sj2
 * @return
 *//*

    public static String getTwoDay(String sj1, String sj2) {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        long day = 0;
        try {
            java.util.Date date = myFormatter.parse(sj1);
            java.util.Date mydate = myFormatter.parse(sj2);
            day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
        } catch (Exception e) {
            return "";
        }
        return day + "";
    }

    */
/**
 * 根据一个日期，返回是星期几的字符串
 *
 * @param sdate
 * @return
 *//*

    public static String getWeek(String sdate) {
        // 再转换为时间
        Date date = CalendarUtil.strToDate(sdate);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        // int hour=c.get(Calendar.DAY_OF_WEEK);
        // hour中存的就是星期几了，其范围 1~7
        // 1=星期日 7=星期六，其他类推
        return new SimpleDateFormat("EEEE").format(c.getTime());
    }

    */
/**
 * 将短时间格式字符串转换为时间 yyyy-MM-dd
 *
 * @param strDate
 * @return
 *//*

    public static Date strToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    */
/**
 * 两个时间之间的天数
 *
 * @param date1
 * @param date2
 * @return
 *//*

    public static long getDays(String date1, String date2) {
        if (date1 == null || date1.equals(""))
            return 0;
        if (date2 == null || date2.equals(""))
            return 0;
        // 转换为标准时间
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        java.util.Date mydate = null;
        try {
            date = myFormatter.parse(date1);
            mydate = myFormatter.parse(date2);
        } catch (Exception e) {
        }
        long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
        return day;
    }

    */
/**
 * 计算当月最后一天,返回字符串
 *
 * @return
 */

    public static String getDefaultDay () {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
        lastDate.add(Calendar.MONTH, 1);// 加一个月，变为下月的1号
        lastDate.add(Calendar.DATE, -1);// 减去一天，变为当月最后一天
        str = sdf.format(lastDate.getTime());
        return str;
    }

    public static String getLastMonthDay (Calendar cal) {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        cal.set(Calendar.DATE, 1);// 设为当前月的1号
        cal.add(Calendar.MONTH, 1);// 加一个月，变为下月的1号
        cal.add(Calendar.DATE, -1);// 减去一天，变为当月最后一天
        str = sdf.format(cal.getTime());
        return str;
    }

/**
 * 上月第一天
 *
 * @return
 *//*

    public String getPreviousMonthFirst() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar lastDate = Calendar.getInstance();
        lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
        lastDate.add(Calendar.MONTH, -1);// 减一个月，变为下月的1号
        // lastDate.add(Calendar.DATE,-1);//减去一天，变为当月最后一天

        str = sdf.format(lastDate.getTime());
        return str;
    }


/**
     * 获取当月第一天
     *
     * @return
     */

        public String getFirstDayOfMonth () {
            String str = "";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Calendar lastDate = Calendar.getInstance();
            lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
            str = sdf.format(lastDate.getTime());
            return str;
        }


/**
 * 获得本周星期日的日期
 *
 * @return
 */

        public String getCurrentWeekday () {
            weeks = 0;
            int mondayPlus = this.getMondayPlus();
            GregorianCalendar currentDate = new GregorianCalendar();
            currentDate.add(GregorianCalendar.DATE, mondayPlus + 6);
            Date monday = currentDate.getTime();

            DateFormat df = DateFormat.getDateInstance();
            String preMonday = df.format(monday);
            return preMonday;
        }


/**
 * 获取当天时间
 *
 * @param dateformat
 * @return
 */

        public String getNowTime (String dateformat){
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat(dateformat);// 可以方便地修改日期格式
            String hehe = dateFormat.format(now);
            return hehe;
        }


/**
 * 获得当前日期与本周日相差的天数
 *
 * @return
 */

    private int getMondayPlus () {
        Calendar cd = Calendar.getInstance();
        // 获得今天是一周的第几天，星期日是第一天，星期二是第二天......
        int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK) - 1; // 因为按中国礼拜一作为第一天所以这里减1
        if (dayOfWeek == 1) {
            return 0;
        } else {
            return 1 - dayOfWeek;
        }
    }


    public String getMondayOFWeek () {
        weeks = 0;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus);
        Date monday = currentDate.getTime();

        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

}
