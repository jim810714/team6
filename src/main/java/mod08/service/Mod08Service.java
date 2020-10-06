package mod08.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mod08.model.CustomerBean;

public class Mod08Service {

	public String getSingleString() {
		return "快樂學JSP^^^^^^^^^^^";
	}
	public CustomerBean getJavaBean() {
		CustomerBean kitty = null;
		try {
			String time0 = "1980-12-25 17:35:28 127";
//			String time0 = "1980-12-32 17:63:28 127";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			sdf.setLenient(false); //寬鬆的日期
			Date date1 = sdf.parse(time0);		
			kitty = new CustomerBean(1001,"凱蒂貓",2560,date1);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return kitty;
		}
	public List<CustomerBean> getListOfJavaBean() {
		CustomerBean kitty = null;
		CustomerBean mickey = null;
		CustomerBean snoopy = null;
		List<CustomerBean> list=null;
		try {
			String time0 = "1980-12-25 17:12:28 127";
			String time1 = "1980-2-10 2:35:28 120";
			String time2 = "1980-9-23 7:35:28 680";
//			String time0 = "1980-12-32 17:63:28 127";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			sdf.setLenient(false); //寬鬆的日期
			Date date0 = sdf.parse(time0);		
			Date date1 = sdf.parse(time1);		
			Date date2 = sdf.parse(time2);		
			kitty = new CustomerBean(1001,"凱蒂貓-List",2560,date0);
			mickey = new CustomerBean(2035,"米被騎-List",2806,date1);
			snoopy = new CustomerBean(7035,"屎奴B-List",1080,date2);
			list = Arrays.asList(kitty,mickey,snoopy);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public CustomerBean[] getArrayOfJavaBean() {
		CustomerBean kitty = null;
		CustomerBean mickey = null;
		CustomerBean snoopy = null;
		CustomerBean[] ar=null;
		try {
			String time0 = "1980-12-25 17:12:28 127";
			String time1 = "1980-2-10 2:35:28 120";
			String time2 = "1980-9-23 7:35:28 680";
//			String time0 = "1980-12-32 17:63:28 127";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			sdf.setLenient(false); //寬鬆的日期
			Date date0 = sdf.parse(time0);		
			Date date1 = sdf.parse(time1);		
			Date date2 = sdf.parse(time2);		
			kitty = new CustomerBean(1001,"凱蒂貓-Array",2560,date0);
			mickey = new CustomerBean(2035,"米被騎-Array",2806,date1);
			snoopy = new CustomerBean(7035,"屎奴B-Array",1080,date2);
			ar = new CustomerBean[] {kitty,mickey,snoopy};
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return ar;
	}
	
	public Map<String,CustomerBean> getMapOfJavaBean() {
		CustomerBean kitty = null;
		CustomerBean mickey = null;
		CustomerBean snoopy = null;
		Map<String,CustomerBean> map=new HashMap<>();
		try {
			String time0 = "1980-12-25 17:12:28 127";
			String time1 = "1980-2-10 2:35:28 120";
			String time2 = "1980-9-23 7:35:28 680";
//			String time0 = "1980-12-32 17:63:28 127";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			sdf.setLenient(false); //寬鬆的日期
			Date date0 = sdf.parse(time0);		
			Date date1 = sdf.parse(time1);		
			Date date2 = sdf.parse(time2);		
			kitty = new CustomerBean(1001,"凱蒂貓-Map",2560,date0);
			mickey = new CustomerBean(2035,"米被騎-Map",2806,date1);
			snoopy = new CustomerBean(7035,"屎奴B-Map",1080,date2);
			map.put("kitty_key", kitty);
			map.put("mickey_key", mickey);
			map.put("snoopy_key", snoopy);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return map;
	}
	public static void main(String[] args) {
		Mod08Service m8 = new Mod08Service();
		CustomerBean bean = m8.getJavaBean();
		System.out.println(bean);
		System.out.println(bean.toString());
		
	}

}
