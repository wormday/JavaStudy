package myapp.person.logic.person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import myapp.person.action.PersonAction;
import core.ListKeyBean;

//页面控件初始化设置
public class InitPageControl implements Serializable{

	private static final long serialVersionUID = 19761210;

	public InitPageControl(){super();}

	/**
	 * 设置s:optiontransferselect集合初始化
	 */
	public static void setHobbyAllList(PersonAction personAction){
		personAction.hobbyAllList=new ArrayList<ListKeyBean>();
		ListKeyBean lkbean=null;
		lkbean=new ListKeyBean("1","文学");
		personAction.hobbyAllList.add(lkbean);
		lkbean=new ListKeyBean("2","艺术");
		personAction.hobbyAllList.add(lkbean);
		lkbean=new ListKeyBean("3","运动");
		personAction.hobbyAllList.add(lkbean);
		lkbean=new ListKeyBean("4","音乐");
		personAction.hobbyAllList.add(lkbean);
		lkbean=new ListKeyBean("5","网游");
		personAction.hobbyAllList.add(lkbean);
		lkbean=new ListKeyBean("6","聊天");
		personAction.hobbyAllList.add(lkbean);
		lkbean=new ListKeyBean("7","发呆");
		personAction.hobbyAllList.add(lkbean);
		personAction.setHobbyAllList(personAction.hobbyAllList);
	}

	//s:optiontransferselect初始化
	public static void initHobbyOptiontransferselect(PersonAction personAction){
		setHobbyAllList(personAction);
		personAction.setHobbyOptionLeftList(personAction.hobbyAllList);
	}

	public static void initHobbyAllList(PersonAction personAction){
		personAction.setHobbyOptionLeftList(personAction.hobbyAllList);
	}

	/**
	 * s:combobox初始化
	 */
	public static void initGenderMap(PersonAction personAction){
		if(personAction.genderMap==null) personAction.genderMap=new LinkedHashMap<String, String>();
		personAction.genderMap.put("", "");
		personAction.genderMap.put("男", "男");
		personAction.genderMap.put("女", "女");
		personAction.setGenderMap(personAction.genderMap);
	}

	/**
	 * s:doubleselect初始化
	 */
	public static void initDistrictDoubleSelectHm(PersonAction personAction){
		if(personAction.districtDoubleSelectHm==null) personAction.districtDoubleSelectHm=new LinkedHashMap<String, List<ListKeyBean>>();
		ListKeyBean lkbean=null;
		List<ListKeyBean> districtList1=new ArrayList<ListKeyBean>();
		lkbean=new ListKeyBean("黄浦区","黄浦区");
		districtList1.add(lkbean);
		lkbean=new ListKeyBean("闸北区","闸北区");
		districtList1.add(lkbean);
		lkbean=new ListKeyBean("普陀区","普陀区");
		districtList1.add(lkbean);
		lkbean=new ListKeyBean("浦东新区","浦东新区");
		districtList1.add(lkbean);
		lkbean=new ListKeyBean("长宁区","长宁区");
		districtList1.add(lkbean);
		lkbean=new ListKeyBean("宝山区","宝山区");
		districtList1.add(lkbean);
		personAction.districtDoubleSelectHm.put("上海", districtList1);
		List<ListKeyBean> districtList2=new ArrayList<ListKeyBean>();
		lkbean=new ListKeyBean("海淀区","海淀区");
		districtList2.add(lkbean);
		lkbean=new ListKeyBean("朝阳区","朝阳区");
		districtList2.add(lkbean);
		lkbean=new ListKeyBean("东城区","东城区");
		districtList2.add(lkbean);
		lkbean=new ListKeyBean("西城区","西城区");
		districtList2.add(lkbean);
		lkbean=new ListKeyBean("宣武区","宣武区");
		districtList2.add(lkbean);
		lkbean=new ListKeyBean("崇文区","崇文区");
		districtList2.add(lkbean);
		personAction.districtDoubleSelectHm.put("北京", districtList2);
		personAction.setDistrictDoubleSelectHm(personAction.districtDoubleSelectHm);
	}
	
	/**
	 * timestamp初始化
	 */
	public static void initTimestamp(PersonAction personAction){
		if(personAction.action.equals("initquery") || personAction.action.equals("query") || 
			personAction.action.equals("${action}")){
			//auto timestamp init for query
			personAction.setCreatetimeHourMapFrom(personAction.createtimeHourMapFrom);
			personAction.setCreatetimeMinuteMapFrom(personAction.createtimeMinuteMapFrom);
			personAction.setCreatetimeHourMapTo(personAction.createtimeHourMapTo);
			personAction.setCreatetimeMinuteMapTo(personAction.createtimeMinuteMapTo);
		}
	}

	/**
	 * s:checkboxlist初始化
	 */
	public static void initFamilystaffMap(PersonAction personAction){
		if(personAction.familystaffMap==null) personAction.familystaffMap=new LinkedHashMap<String, String>();
		personAction.familystaffMap.put("1","爷爷");
		personAction.familystaffMap.put("2","奶奶");
		personAction.familystaffMap.put("3","父亲");
		personAction.familystaffMap.put("4","母亲");
		personAction.familystaffMap.put("5","女儿");
		personAction.familystaffMap.put("6","儿子");
		personAction.setFamilystaffMap(personAction.familystaffMap);
	}

	/**
	 * s:radio初始化
	 */
	public static void initMarriageList(PersonAction personAction){
		if(personAction.marriageList==null) personAction.marriageList=new ArrayList<String>();
		personAction.marriageList.add("是");
		personAction.marriageList.add("否");
		personAction.setMarriageList(personAction.marriageList);
	}
}