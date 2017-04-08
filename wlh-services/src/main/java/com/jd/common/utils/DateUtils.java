package com.jd.common.utils;

import com.alibaba.fastjson.JSON;
import com.jd.common.util.StringUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhangzhengmao
 * Date: 14-1-20
 * Time: 下午7:54
 * To change this template use File | Settings | File Templates.
 */
public class DateUtils {

	    public static final String C_DATE_DIVISION = "-";

	    public static final String C_TIME_PATTON_DEFAULT = "yyyy-MM-dd HH:mm:ss";
	    public static final String C_DATE_PATTON_DEFAULT = "yyyy-MM-dd";
	    public static final String C_DATA_PATTON_YYYYMMDD = "yyyyMMdd";
	    public static final String C_TIME_PATTON_HHMMSS = "HH:mm:ss";
	    public static final String C_DATA_PATTON_YYYYMMDDHH = "yyyyMMddHH";
	    
	    public static final int  C_ONE_SECOND = 1000;
	    public static final int  C_ONE_MINUTE = 60 * C_ONE_SECOND;
	    public static final int  C_ONE_HOUR   = 60 * C_ONE_MINUTE;
	    public static final long C_ONE_DAY    = 24 * C_ONE_HOUR;
	    
	    /**
	     * Return the current date
	     * 
	     * @return － DATE<br>
	     */
	    public static Date getCurrentDate()
	    {
	     Calendar cal = Calendar.getInstance();
	     Date currDate = cal.getTime();
	     
	     return currDate;
	    }

	    /**
	     * Return the current date string
	     * 
	     * @return － 产生的日期字符串<br>
	     */
	    public static String getCurrentDateStr()
	    {
	     Calendar cal = Calendar.getInstance();
	     Date currDate = cal.getTime();
	     
	     return format(currDate);
	    }
	    /**
	     * Return the current date string
	     * 
	     * @return － 当前的小时<br>
	     */
	    public static int getCurrentHour()
	    {
	     Calendar cal = Calendar.getInstance();
	     int currHour =  cal.get(Calendar.HOUR_OF_DAY);
	     
	     return currHour;
	    }
	    /**
	  * Return the current date in the specified format
	  * 
	  * @param strFormat
	  * @return
	  */
	 public static String getCurrentDateStr(String strFormat)
	 {
	     Calendar cal = Calendar.getInstance();
	     Date currDate = cal.getTime();
	     
	     return format(currDate, strFormat);
	 }
	 /**
	* Return the current date in the specified format
	* 
	* @param strFormat
	* @return
	*/
	 public static String getCurrentTimeStr()
	 {
		 Calendar cal = Calendar.getInstance();
	     Date currDate = cal.getTime();
	     
	     return formatTime(currDate);
	 }
	 
	    /**
	     * Parse a string and return a date value
	     * 
	     * @param dateValue
	     * @return
	     * @throws Exception
	     */
	    public static Date parseDate(String dateValue)
	    {
	     return parseDate(C_DATE_PATTON_DEFAULT, dateValue);
	    }
	    
	    /**
	     * Parse a strign and return a datetime value
	     * 
	     * @param dateValue
	     * @return
	     */
	    public static Date parseDateTime(String dateValue)
	    {
	     return parseDate(C_TIME_PATTON_DEFAULT, dateValue);
	    }
	 
	 /**
	  * Parse a string and return the date value in the specified format
	  * 
	  * @param strFormat
	  * @param dateValue
	  * @return
	  * @throws ParseException 
	  * @throws Exception
	  */
	 public static Date parseDate(String strFormat, String dateValue)
	 {
	        if (dateValue == null)
	            return null;
	        
	        if (strFormat == null)
	            strFormat = C_TIME_PATTON_DEFAULT;
	        
	  SimpleDateFormat dateFormat = new SimpleDateFormat(strFormat);
	  Date newDate = null;
	  
	  try
	  {
	   newDate = dateFormat.parse(dateValue);
	  }
	  catch (ParseException pe)
	  {
	   newDate = null;
	  }

	  return newDate;
	 }

	 
	    /**
	     * 将Timestamp类型的日期转换为系统参数定义的格式的字符串。
	     * @param aTs_Datetime 需要转换的日期。
	     * @return 转换后符合给定格式的日期字符串
	     */
	    public static String format(Date aTs_Datetime)
	    {
	      return format(aTs_Datetime, C_DATE_PATTON_DEFAULT);
	    }
	    
	    public static String formatYYYYMMDD(Date aTs_Datetime)
	    {
	      return format(aTs_Datetime, C_DATA_PATTON_YYYYMMDD);
	    }
	    
	    public static String getYYYYMMDDHH()
	    {
	      return format(getCurrentDate(), C_DATA_PATTON_YYYYMMDDHH);
	    }
	    public static String getYYYYMMDD()
	    {
	      return format(getCurrentDate(), C_DATA_PATTON_YYYYMMDD);
	    }
	    /**
	     * 将Timestamp类型的日期转换为系统参数定义的格式的字符串。
	     * @param aTs_Datetime 需要转换的日期。
	     * @return 转换后符合给定格式的日期字符串
	     */
	    public static String formatTime(Date aTs_Datetime)
	    {
	      return format(aTs_Datetime, C_TIME_PATTON_DEFAULT);
	    }

	    /**
	     * 将Date类型的日期转换为系统参数定义的格式的字符串。
	     * @param aTs_Datetime
	     * @param as_Pattern
	     * @return
	     */
	    public static String format(Date aTs_Datetime, String as_Pattern)
	    {
	      if (aTs_Datetime == null || as_Pattern == null)
	        return null;

	      SimpleDateFormat dateFromat = new SimpleDateFormat();
	      dateFromat.applyPattern(as_Pattern);
	      
	      return dateFromat.format(aTs_Datetime);
	    }
	    
	    /**
	     * @param aTs_Datetime
	     * @param as_Format
	     * @return
	     */
	    public static String formatTime(Date aTs_Datetime, String as_Format)
	    {
	        if (aTs_Datetime == null || as_Format == null)
	            return null;

	          SimpleDateFormat dateFromat = new SimpleDateFormat();
	          dateFromat.applyPattern(as_Format);
	          
	          return dateFromat.format(aTs_Datetime);
	    }
	    
	    public static String getFormatTime(Date dateTime)
	    {
	        return formatTime(dateTime, C_TIME_PATTON_HHMMSS);
	    }
	    /**
	     * @param aTs_Datetime
	     * @param as_Pattern
	     * @return
	     */
	    public static String format(Timestamp aTs_Datetime, String as_Pattern)
	    {
	      if (aTs_Datetime == null || as_Pattern == null)
	        return null;

	      SimpleDateFormat dateFromat = new SimpleDateFormat();
	      dateFromat.applyPattern(as_Pattern);
	      
	      return dateFromat.format(aTs_Datetime);
	    }
	 /**
	  * 取得指定日期N天后的日期
	  * @param date
	  * @param days
	  * @return
	  */
	 public static Date addDays(Date date, int days)
	 {
	  Calendar cal = Calendar.getInstance();
	  cal.setTime(date);
	  
	  cal.add(Calendar.DAY_OF_MONTH, days);
	  
	  return cal.getTime();
	 }
	 
	 /**
	  * 计算两个日期之间相差的天数
	  * @param date1
	  * @param date2
	  * @return
	  */
	 public static int daysBetween(Date date1,Date date2)
	 {
	  Calendar cal = Calendar.getInstance();
	  cal.setTime(date1);
	  long time1 = cal.getTimeInMillis();    
	  cal.setTime(date2);
	  long time2 = cal.getTimeInMillis();  
	  long between_days=(time2-time1)/(1000*3600*24);
	  
	        return Integer.parseInt(String.valueOf(between_days));  
	 }
	 
	    public static Date getDateBeforTwelveMonth()
	    {
	        String date = "";
	        Calendar cla = Calendar.getInstance();
	        cla.setTime(getCurrentDate());
	        int year = cla.get(Calendar.YEAR) - 1;
	        int month = cla.get(Calendar.MONTH) + 1 ;
	        if (month >9 )
	        {
	            date = String.valueOf(year) + C_DATE_DIVISION + String.valueOf(month)
	                    + C_DATE_DIVISION + "01";
	        }
	        else 
	        {
	            date = String.valueOf(year) + C_DATE_DIVISION + "0" + String.valueOf(month)
	                    + C_DATE_DIVISION + "01" ;
	        }
	        
	        Date dateBefore = parseDate(date);
	        return dateBefore;
	    }
	    
	    /**
	     * 传入时间字符串,加一天后返回Date
	     * @param date 时间 格式 YYYY-MM-DD 
	     * @return
	     */
	    public static Date addDate(String date)
	    {
	        if (date == null)
	        {
	            return null;
	        }

	        Date tempDate = parseDate(C_DATE_PATTON_DEFAULT, date);
	        String year = format(tempDate, "yyyy");
	        String month = format(tempDate, "MM");
	        String day = format(tempDate, "dd");
	        
	        
	        GregorianCalendar calendar = 
	            new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
	        
	        calendar.add(GregorianCalendar.DATE, 1);
	        return calendar.getTime();
	    }
	    
	    /** 
	    * 获得昨天
	    * yyyy-mm-dd
	    */ 
	    public static String  getYesterdayStr(){
	    	return formatYYYYMMDD(addDays(getCurrentDate(),-1));
	    }
	    
	    public static String  getYesterday(){
	    	return format(addDays(getCurrentDate(),-1));
	    }
	    /** 整数不满尾数前补0
	    0 指前面补充零 
	    * formatLength 字符总长度为 formatLength 
	    * d 代表为正数。
	    * */ 
	    public static String frontCompWithZore(int sourceDate,int formatLength)  
	    {  
	     String newString = String.format("%0"+formatLength+"d", sourceDate);  
	     return  newString;  
	    }  
	    
	    public static List<String> getMonthFstDayBetween(String minDate, String maxDate) throws ParseException {
	        ArrayList<String> result = new ArrayList<String>();
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月
	        
	        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMM");//格式化为年月
	        Calendar min = Calendar.getInstance();
	        Calendar max = Calendar.getInstance();

	        min.setTime(sdf.parse(minDate));
	        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

	        max.setTime(sdf.parse(maxDate));
	        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

	        Calendar curr = min;
	        while (curr.before(max)) {
	         result.add(sdf1.format(curr.getTime())+"01");
	         curr.add(Calendar.MONTH, 1);
	        }

	        return result;
	      }
	    public static List<String> getMonthBetween(String minDate, String maxDate) throws ParseException {
	        ArrayList<String> result = new ArrayList<String>();
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月
	        
	        Calendar min = Calendar.getInstance();
	        Calendar max = Calendar.getInstance();

	        min.setTime(sdf.parse(minDate));
	        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

	        max.setTime(sdf.parse(maxDate));
	        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

	        Calendar curr = min;
	        while (curr.before(max)) {
	         result.add(sdf.format(curr.getTime()));
	         curr.add(Calendar.MONTH, 1);
	        }

	        return result;
	      }
	    
	    
	    /** 
	    * 将形如yyyyMMdd转换为yyyy_MM
	    */ 
	    public  static String getYYYY_MM(String date){
	    	// 如:20151101
	    	SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	    	 Date date1=null;
	        try {
				date1 = format.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return format(date1,"yyyy-MM");
	    }
	    /** 
	     * 根据不同的数据源，,将形如yyyyMMdd转换为yyyy_MM
	     */ 
	     public  static String getYYYY_MMBySource(String date,String datasource){
	     	// 如:20151101
	    	 SimpleDateFormat format= null;
	    	 if("mdrill".equals(datasource))
	    		 format = new SimpleDateFormat("yyyyMMdd");
	    	 else
	    		 format = new SimpleDateFormat("yyyy-MM-dd");
	    	 
	     	 Date date1=null;
	         try {
	 			date1 = format.parse(date);
	 		} catch (ParseException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	         return format(date1,"yyyy-MM");
	     }
	    /** 
	     * 将格式为yyyyMMdd根据不同的数据源，进行格式的转化，此方法迁移es用，兼容es和mdrill
	     * es:YYYY-MM-DD
	     * mdrill：yyyymmdd
	     */ 
	     public  static String getDateBySource(String date,String datasource){
	    	 if("mdrill".equals(datasource))
	    		 return date;
	    	 
	     	 SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	     	 Date date1=null;
	         try {
	 			date1 = format.parse(date);
	 		} catch (ParseException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	         
	         return format(date1,C_DATE_PATTON_DEFAULT);
	     }
	     
	     /** 
	    * @Title: getYearsBetween 
	    * @Description: 取得两个自然年之间的所有年份
	    */ 
	    public static List<String> getYearsBetween(List<String> param){
	    	 List<String> result = new ArrayList<String>();
	    	 int start= Integer.parseInt(param.get(0));
	    	 int end= Integer.parseInt(param.get(1));
	    	 for(int i=start;i<=end;i++){
	    		 result.add(String.valueOf(i));
	    	 }
	    	 
	    	 return result;
	     }
	     
	    public static List<String> getDateBetween(String start,String end) throws ParseException {
	    	List<String> result= new ArrayList<String>();
	        Calendar startCalendar = Calendar.getInstance();
	        Calendar endCalendar = Calendar.getInstance();
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        Date startDate = df.parse(start);
	        startCalendar.setTime(startDate);
	        Date endDate = df.parse(end);
            //当结束日期早于开始日期时，返回空
            if(endDate.before(startDate)){
                return result;
            }
            //当开始日期等于结束日期时，返回一个固定日期
            if(start.equals(end)){
                result.add(start);
                return result;
            }
	        endCalendar.setTime(endDate);
	        result.add(start);
	        while(true){
	            startCalendar.add(Calendar.DAY_OF_MONTH, 1);
	            if(startCalendar.getTimeInMillis() < endCalendar.getTimeInMillis()){
	            	result.add(df.format(startCalendar.getTime()));
	            }else{
	            break;
	            }
	        }
	        result.add(end);
	        System.out.println(JSON.toJSONString(result));
	        return result;
	}

	/**
	 * 判断某个日期是否是某种格式
	 * @param date     日期字符串
	 * @param format   日期格式，如“yyyy-MM-dd”
	 * @return
	 */
	public static boolean isValidOfDate(String date, String format) {
		if (StringUtils.isEmpty(date) || StringUtils.isEmpty(format) ) {
			return false;
		}
		DateFormat df = new SimpleDateFormat(format);
		try {
			df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static List<String> getIndexHoursToNow(String index){
		List<String> hoursIndex= new ArrayList<String>();
		int toIndex=DateUtils.getCurrentHour();
		for(int i=0;i<=toIndex;i++)
			hoursIndex.add(index+String.format("%02d", i));
		return hoursIndex;
	}

}
