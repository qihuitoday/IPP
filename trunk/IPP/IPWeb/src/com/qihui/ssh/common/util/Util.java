package com.qihui.ssh.common.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

	public static String DEFAULT_DATE_FORMAT_STRING = "yyyy-MM-dd";
	protected final static TimeZone CHINESE_TIMEZONE = TimeZone.getTimeZone("GMT+8");

	public static Date String2Date(String date) {
		try {
			SimpleDateFormat sf = new SimpleDateFormat(DEFAULT_DATE_FORMAT_STRING);
			return sf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String Date2String(Date date) {
		try {
			SimpleDateFormat sf = new SimpleDateFormat(DEFAULT_DATE_FORMAT_STRING);
			return sf.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Get date by add days
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addDays(Date date, int days) {
		Calendar calendar = Calendar.getInstance(CHINESE_TIMEZONE);
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		date = calendar.getTime();
		return date;
	}

	/**
	 * Get date by add years
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addYears(Date date, int years) {
		Calendar calendar = Calendar.getInstance(CHINESE_TIMEZONE);
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, years);
		date = calendar.getTime();
		return date;
	}

	/**
	 * Get Interval days by
	 * 
	 * @param enddate
	 * @param begindate
	 * @return
	 */
	public static int getIntervalDays(Date enddate, Date begindate) {
		long millisecond = enddate.getTime() - begindate.getTime();
		int day = (int) (millisecond / 24L / 60L / 60L / 1000L);
		return day;
	}

	/**
	 * 映射数字[1-26]到字符[A-Z]
	 * 
	 * @param num
	 * @return
	 */
	public static char mappingIntToChar(int num) {
		if (num >= 1 && num <= 26) {
			return (char) (num + 65 - 1);
		} else {
			return ' ';
		}
	}

	/**
	 * Formatting "yyyy-MM-dd" format
	 * 
	 * @param date
	 * @return dateStr
	 */
	public static String dateFormat(Date date) {
		return date == null ? "" : new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	/**
	 * Checkout date format is valid
	 * 
	 * @param dateStr
	 * @return
	 */
	public static boolean isValidDateFormat(String dateStr) {
		Pattern p = Pattern
				.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
		return p.matcher(dateStr).matches();
	}

	/**
	 * Channeling date for the conversion of characters
	 * 
	 * @param dateStr
	 * @return dateStr
	 * @throws ParseException
	 * @throws Exception
	 */
	public static Date toDate(String dateStr) throws ParseException {
		return (dateStr == null || dateStr.length() == 0) ? null : new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
	}

	public static boolean isEmpty(Object o) {
		return (!isNotEmpty(o));
	}

	public static boolean isNotEmpty(Object o) {
		boolean result = false;
		if (o instanceof String) {
			if (!"".equals(((String) o).trim())) {
				result = true;
			}
		} else if (o instanceof Date) {
			result = true;
		} else if (o instanceof Integer) {
			result = true;
		} else if (o instanceof BigDecimal) {
			result = true;
		}
		return result;
	}

	public static boolean isNumAndLetter(String str) {
		if (str.matches("\\w*")) {
			return true;
		} else {
			return false;
		}
	}

	public static String replaceRNToBR(String str) {
		if (str != null && !"".equals(str)) {
			Pattern rn = Pattern.compile("(\r\n|\r|\n|\n\r)");
			Matcher m = rn.matcher(str);
			if (m.find()) {
				str = m.replaceAll("<br><br>");
			}
			return str;
		}
		return "";
	}

}
