package utility;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

import core.ListKeyBean;

public class Utilitys {

	/**
	 * 得到随机ID
	 * @param secure
	 * @return
	 */
	public static String getRandomPK(boolean secure){
		SecureRandom mySecureRand = new SecureRandom();
	    String s_id="";
        long secureInitializer = mySecureRand.nextLong();
        Random myRand = new Random(secureInitializer);
        try{
            s_id = InetAddress.getLocalHost().toString();
        }catch(UnknownHostException e){}
		String valueBeforeSHA1="";
	    String valueAfterSHA1="";
        MessageDigest sha1 = null;
        StringBuffer sbValueBeforeSHA1 = new StringBuffer();
        try{sha1 = MessageDigest.getInstance("SHA1");
        }catch(NoSuchAlgorithmException e){}
        try{
            long time = System.currentTimeMillis();
            long rand = 0L;
            if(secure) rand = mySecureRand.nextLong();
            else rand = myRand.nextLong();
            sbValueBeforeSHA1.append(s_id);
            sbValueBeforeSHA1.append(":");
            sbValueBeforeSHA1.append(Long.toString(time));
            sbValueBeforeSHA1.append(":");
            sbValueBeforeSHA1.append(Long.toString(rand));
            valueBeforeSHA1 = sbValueBeforeSHA1.toString();
            sha1.update(valueBeforeSHA1.getBytes());
            byte array[] = sha1.digest();
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < array.length; j++){
                int b = array[j] & 0xff;
                if(b < 16) sb.append('0');
                sb.append(Integer.toHexString(b));
            }
            valueAfterSHA1 = sb.toString();
        }catch(Exception e){}
        String raw = valueAfterSHA1.toUpperCase();
        StringBuffer sb = new StringBuffer();
        sb.append(new java.util.Date().getTime()).append(raw);
        return sb.toString();
    }

    /**
     * 根据日期格式生成timestamp
     */
	public static Timestamp setTimeStampFunction(Date date,String hour,String minute){
		Timestamp timeStamp=null;
		if(date!=null){
			try{
				timeStamp=new Timestamp(
					(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(
						date.toString() + " " + hour + ":" + 
						minute + ":00")).getTime());
			}catch(ParseException e1){
				e1.printStackTrace();
				timeStamp=null;
			}
		}
		return timeStamp;
	}
	
    /**
     * 包装s:optiontransferselect显示string
     * @param orginalStr=原始string
     * @param splitSymbol=分割符号
     * @param list=s:optiontransferselect的list
     * @param suffix=后缀
     * @return
     */
    public static String getWrapperOptiontransferselect(String orginalStr,String splitSymbol,List<ListKeyBean> list,String suffix){
    	ListKeyBean bean=null;
		LinkedHashMap<String,ListKeyBean> map=new LinkedHashMap<String, ListKeyBean>();
		for(int j=0;j<list.size();j++){
			bean=list.get(j);
			map.put(bean.getKey(),bean);
		}
		String[] array=orginalStr.split(splitSymbol);//generate selected array
		list=new ArrayList<ListKeyBean>();
		Iterator<String> iterator=map.keySet().iterator();
		String key=null;
		while(iterator.hasNext()){
			key=iterator.next();
			bean=map.get(key);
			for(int j=0;j<array.length;j++){
				if(array[j].equals(key)){
					list.add(bean);
					break;
				}	
			}
		}
		String tmp="";
		for(int j=0;j<list.size();j++){
			bean=list.get(j);
			tmp+=bean.getValue() + suffix;
		}
		if(tmp.length()>0) tmp=tmp.substring(0,tmp.length()-suffix.length());
		return tmp;
    }
    
    /**
     * 包装s:checkboxlist显示string
     * @param orginialStr=原始string
     * @param splitSymbol=分割符号
     * @param map=s:checkboxlist的映射map
     * @param suffix=后缀
     * @return
     */
    public static String getWrapperCheckboxlist(String orginialStr,String splitSymbol,LinkedHashMap<String, String> map,String suffix){
    	String tmp="";
		if(orginialStr!=null){
			if(orginialStr.trim().length()>0){
				StringTokenizer st=new StringTokenizer(orginialStr.trim(),splitSymbol);
				while(st.hasMoreTokens()) 
					tmp+=map.get(st.nextToken().trim()) + suffix;
			}
		}
		if(tmp.length()>0) tmp=tmp.substring(0,tmp.length()-suffix.length());
		return tmp;
    }
    
    /**
     * 包装password的显示string
     * @param orginialStr=原始string
     * @return
     */
    public static String getWrapperPassword(String orginialStr){
    	if(orginialStr.length()>0) orginialStr="******";
    	return orginialStr;
    }
	
    /**
     * 字符串截流
     */
    public static String getSplitColumnString(String originalStr,Integer length){
    	if(length==null){
    		if(originalStr.length()>ConstSetup.SPLIT_COLUMN_LENGTH)
    			originalStr=originalStr.substring(0,ConstSetup.SPLIT_COLUMN_LENGTH) + "...";
    	}else{
    		if(originalStr.length()>length.intValue())
    			originalStr=originalStr.substring(0,length.intValue()) + "...";
    	}
		return originalStr;
    }

    public static String getDateString(String format,java.util.Date date){
    	String tmp="";
    	try{
			SimpleDateFormat sdf=new SimpleDateFormat(format);
			tmp=sdf.format(date);
    	}catch(Exception e){}
		return tmp;
    }
    
    /**
     * 日期字符串转换成sqlDate
     */
    public static java.sql.Date transferStr2SqlDate(String str,String format){
    	SimpleDateFormat sdf=new SimpleDateFormat(format);
		java.util.Date utilDate=null;
		java.sql.Date sqlDate=null;
		try{
			utilDate=sdf.parse(str);
			sqlDate=new java.sql.Date(utilDate.getTime());
		}catch(ParseException e){e.printStackTrace();}
		return sqlDate;
    }
    
    /**
     * 日期字符串转换成sqlDate
     */
    public static Timestamp transferStr2Timestamp(String str,String format){
    	SimpleDateFormat sdf=new SimpleDateFormat(format);
		java.util.Date utilDate=null;
		Timestamp t=null;
		try{
			utilDate=sdf.parse(str);
			t=new Timestamp(utilDate.getTime());
		}catch(ParseException e){e.printStackTrace();}
		return t;
    }
    
    /**
	 * 百分比过滤
	 */
	private static String percentFilter(String wholeString,String from,String to){
		if(wholeString.equals(from)) wholeString=to;
		else if(wholeString.indexOf(from)==-1);
		else{
			StringTokenizer st=new StringTokenizer(wholeString,from);
			String tmpStr="";
			while(st.hasMoreTokens()) tmpStr+=st.nextToken() + to;
			if(tmpStr.length()>0) tmpStr=tmpStr.substring(0,tmpStr.length()-to.length());
			if(wholeString.substring(wholeString.lastIndexOf(from)).equals(from)) tmpStr+=to;
			wholeString=tmpStr;
		}
		return wholeString;
	}

	/**
	 * sql语句百分比符号过滤
	 */
	public static String percentMarkFilter(String field){
		field=Utilitys.percentFilter(field, "%", "\\%");
		return field;
	}
}