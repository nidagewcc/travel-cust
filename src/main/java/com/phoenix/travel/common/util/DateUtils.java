package com.phoenix.travel.common.util;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Weishuo Zhang
 * @create 2018/10/12
 */
public class DateUtils {

    private static final Logger log = LoggerFactory.getLogger(DateUtils.class);
    private static int FIRST_DATE_OF_WEEK = 1;
    private static Pattern p = Pattern.compile("\\d{4}+[-]\\d{1,2}+[-]\\d{1,2}+");
    public static String fullPattern = "yyyy-MM-dd HH:mm:ss";
    public static String fullPattern1 = "yyyy/MM/dd HH:mm:ss";
    public static String hhmmPattern = "HH:mm";
    public static String FMT_YMD_HMS = "yyyyMMddHHmmss";
    public static String FMT_YM = "yyyy-MM";
    public static String FMT_YMD = "yyyyMMdd";
    public static String FMT_YM_NO_SPLIT = "yyyyMM";
    public static String defaultPattern = "yyyy-MM-dd";
    public static String defaultPattern1 = "yyyy/MM/dd";
    public static String FMT_YMD_POINT = "yyyy.MM.dd";
    public static String FMT_YMD_HM_POINT = "yyyy.MM.dd HH:mm";
    public static String FMT_Y_M_D_HM_POINT = "yyyy-MM-dd HH:mm";
    public static String FMT_MD_POINT = "MM.dd";
    public static String FMT_YYMMDD = "yyMMdd";
    public static String FMT_YYMMDD_POINT = "yyyy.MM.dd";
    private static String[] WEEK_DAY = new String[]{"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
    private static SimpleDateFormat DEFAULT_DATE;
    private static SimpleDateFormat DEFAULT_TIME;

    static {
        DEFAULT_DATE = new SimpleDateFormat(defaultPattern);
        DEFAULT_TIME = new SimpleDateFormat(hhmmPattern);
    }

    public DateUtils() {
    }

    public static String format(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }

    public static int getCurrentYear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(1);
    }

    public static Long getCurrentDateMill() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static String getCurrentDateStr(String pattern) {
        SimpleDateFormat sdf;
        if (pattern == null) {
            sdf = new SimpleDateFormat(defaultPattern);
        } else {
            sdf = new SimpleDateFormat(pattern);
        }

        return sdf.format(new Date());
    }

    public static Date addMinutes(int min) {
        Calendar cal = Calendar.getInstance();
        cal.add(12, min);
        return cal.getTime();
    }

    public static Date addMinutes(Date date, int min) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(12, min);
        return cal.getTime();
    }

    public static Date addMonth(Date date, int month) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(2, month);
        return cal.getTime();
    }

    public static Date addDay(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(5, day);
        return cal.getTime();
    }

    public static Date addHour(Date date, int hour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(11, hour);
        return cal.getTime();
    }

    public static Date parseToDate(String str) {
        try {
            Date date = (new SimpleDateFormat(defaultPattern)).parse(str);
            return date;
        } catch (Exception var2) {
            log.error("日期格转换失败: " + var2);
            return null;
        }
    }

    public static Date parseToDate(Date dt) {
        try {
            String str = (new SimpleDateFormat(defaultPattern)).format(dt);
            Date date = (new SimpleDateFormat(defaultPattern)).parse(str);
            return date;
        } catch (Exception var3) {
            log.error("日期格转换失败: " + var3);
            return null;
        }
    }

    public static Date parseToDate(String str, String pattern) {
        SimpleDateFormat sdf;
        if (pattern != null && pattern.length() != 0) {
            sdf = new SimpleDateFormat(pattern);
        } else {
            sdf = new SimpleDateFormat(defaultPattern);
        }

        try {
            Date date = sdf.parse(str);
            return date;
        } catch (Exception var4) {
            log.error("日期格转换失败: {}", var4.getMessage());
            return null;
        }
    }

    public static String getFormatDate(String dateStr, String pattern) {
        if (pattern != null && pattern.length() != 0) {
            try {
                String date = (new SimpleDateFormat(defaultPattern)).format((new SimpleDateFormat(defaultPattern)).parse(dateStr));
                return date;
            } catch (Exception var3) {
                log.error("日期格转换失败: {}", var3.getMessage());
                return "";
            }
        } else {
            throw new IllegalArgumentException("pattern");
        }
    }

    public static String getFormatDate(Date date) {
        if (date == null) {
            return "";
        } else {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(defaultPattern);
                String strDate = sdf.format(date);
                return strDate;
            } catch (Exception var3) {
                log.error("日期格转换失败: {}", var3.getMessage());
                return "";
            }
        }
    }

    public static String getFormatDate(Date date, String pattern) {
        if (pattern != null && pattern.length() != 0) {
            if (date == null) {
                return "";
            } else {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                    String strDate = sdf.format(date);
                    return strDate;
                } catch (Exception var4) {
                    log.error("日期格转换失败: {}", var4);
                    return "";
                }
            }
        } else {
            throw new IllegalArgumentException("pattern");
        }
    }

    public static String getFullFormatDate(Date date) {
        if (date == null) {
            return "";
        } else {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(fullPattern);
                String strDate = sdf.format(date);
                return strDate;
            } catch (Exception var3) {
                log.error("日期格转换失败:" + var3);
                return "";
            }
        }
    }

    public static String format(SimpleDateFormat sdf, Date date) {
        return date == null ? "" : sdf.format(date);
    }

    public static Date tryParse(SimpleDateFormat sdf, String strDate) {
        if (sdf != null && strDate != null) {
            Date ret = null;

            try {
                ret = sdf.parse(strDate);
            } catch (ParseException var4) {
                log.error("日期格转换失败:" + var4);
            }

            return ret;
        } else {
            return null;
        }
    }

    public static String formatTime(Integer to) {
        String str = String.format("%04d", to);
        return str.replaceFirst("^.*(\\d{2})(\\d{2})$", "$1:$2");
    }

    public static boolean isMonthBegin() {
        Calendar cal = Calendar.getInstance();
        boolean isMonthBegin = false;
        if (cal.get(5) == 1) {
            isMonthBegin = true;
        }

        return isMonthBegin;
    }

    public static boolean isWeekBegin() {
        Calendar cal = Calendar.getInstance();
        boolean isWeekBegin = false;
        if (cal.get(7) == 2) {
            isWeekBegin = true;
        }

        return isWeekBegin;
    }

    public static boolean validateDate(String dateString) {
        Matcher m = p.matcher(dateString);
        if (!m.matches()) {
            return false;
        } else {
            String[] array = dateString.split("-");
            int year = Integer.valueOf(array[0]);
            int month = Integer.valueOf(array[1]);
            int day = Integer.valueOf(array[2]);
            if (month >= 1 && month <= 12) {
                int[] monthLengths = new int[]{0, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if (isLeapYear(year)) {
                    monthLengths[2] = 29;
                } else {
                    monthLengths[2] = 28;
                }

                int monthLength = monthLengths[month];
                return day >= 1 && day <= monthLength;
            } else {
                return false;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int compareDate(Date dt1, Date dt2) {
        String date1 = (new SimpleDateFormat(defaultPattern)).format(dt1);
        String date2 = (new SimpleDateFormat(defaultPattern)).format(dt2);
        int flag = date1.compareTo(date2);
        return flag;
    }

    public static boolean compareDateTime(Date dt1, Date dt2) {
        return dt1.getTime() > dt2.getTime();
    }

    public static int compareTime(Date dt1, Date dt2) {
        String date1 = (new SimpleDateFormat(hhmmPattern)).format(dt1);
        String date2 = (new SimpleDateFormat(hhmmPattern)).format(dt2);
        int flag = date1.compareTo(date2);
        return flag;
    }

    public static String getChinaeseWeekDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(7) - 1 < 0 ? 0 : cal.get(7) - 1;
        return WEEK_DAY[w];
    }

    public static int daysBetween(Date smdate, Date bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(defaultPattern);
        smdate = sdf.parse(sdf.format(smdate));
        bdate = sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / 86400000L;
        return Integer.parseInt(String.valueOf(between_days));
    }

    public static boolean isEndOfWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(5, 1);
        int weekDay = cal.get(7);
        return weekDay == FIRST_DATE_OF_WEEK;
    }

    public static boolean isMonthEnd(Date nowDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(nowDate);
        cal.add(5, 1);
        int day = cal.get(5);
        return day == 1;
    }

    public static boolean isQuarterEnd(Date nowDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(nowDate);
        int month = cal.get(2);
        cal.add(5, 1);
        int day = cal.get(5);
        return day == 1 && (month == 2 || month == 5 || month == 8 || month == 11);
    }

    public static boolean isQuarterBegin(Date nowDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(nowDate);
        int month = cal.get(2);
        int day = cal.get(5);
        return day == 1 && (month == 0 || month == 3 || month == 6 || month == 9);
    }

    public static boolean isHalfYearEnd(Date nowDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(nowDate);
        int month = cal.get(2);
        cal.add(5, 1);
        int day = cal.get(5);
        return day == 1 && (month == 5 || month == 11);
    }

    public static boolean isHalfYearBegin(Date nowDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(nowDate);
        int month = cal.get(2);
        int day = cal.get(5);
        return day == 1 && (month == 0 || month == 6);
    }

    public static boolean isYearEnd(Date nowDate) {
        return "1231".equals(format(nowDate, "MMdd"));
    }

    public static boolean isYearBegin(Date nowDate) {
        return "0101".equals(format(nowDate, "MMdd"));
    }

    public static String getNowOfLastYear() {
        SimpleDateFormat aSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        GregorianCalendar aGregorianCalendar = new GregorianCalendar();
        aGregorianCalendar.set(1, aGregorianCalendar.get(1) - 1);
        String currentYearAndMonth = aSimpleDateFormat.format(aGregorianCalendar.getTime());
        return currentYearAndMonth;
    }

    public static int getDifferMinute(Date beginTime, Date endTime) {
        long seconds = endTime.getTime() - beginTime.getTime();
        return (int) seconds / 60 / 1000;
    }

    public static int monthBetween(Date biginDate, Date endDate) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.setTime(biginDate);
        int biginYear = c.get(1);
        int biginMonth = c.get(2);
        c.setTime(endDate);
        int endYear = c.get(1);
        int endMonth = c.get(2);
        return (endYear - biginYear) * 12 + (endMonth - biginMonth);
    }

    public static Date getTwoDateCenter(Date biginDate, Date endDate) {
        long millis = biginDate.getTime() + (endDate.getTime() - biginDate.getTime());
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(millis);
        return c.getTime();
    }

    public static String formatDate(String str, String fmtOld, String fmtNew) {
        if (StringUtils.isBlank(str)) {
            return "";
        } else {
            SimpleDateFormat oldDate = new SimpleDateFormat(fmtOld);
            SimpleDateFormat newDate = new SimpleDateFormat(fmtNew);
            String returnDate = "";

            try {
                returnDate = newDate.format(oldDate.parse(str));
            } catch (Exception var7) {
                var7.printStackTrace();
            }

            return returnDate;
        }
    }
}
