package myapp.person.logic.person;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class PersonBean implements Serializable {

	private static final long serialVersionUID = 19761210;
	
	public PersonBean(){super();}
	
	/**
	 * 页面显示数据行序列
	 */
	private Integer rownum=null;
	public Integer getRownum(){return rownum;}
	public void setRownum(Integer rownum){this.rownum = rownum;}
	
			private String person_id="";
		public String getPerson_id(){return person_id;}
		public void setPerson_id(String person_id){this.person_id = person_id;}
		
		private String name="";
		public String getName(){return name;}
		public void setName(String name){this.name = name;}
		
		private String gender="";
		public String getGender(){return gender;}
		public void setGender(String gender){this.gender = gender;}
		
		private Integer age=null;
		public Integer getAge(){return age;}
		public void setAge(Integer age){this.age = age;}
		
		private Integer ageFrom=null;
		public Integer getAgeFrom(){return ageFrom;}
		public void setAgeFrom(Integer ageFrom){this.ageFrom = ageFrom;}
		
		private Integer ageTo=null;
		public Integer getAgeTo(){return ageTo;}
		public void setAgeTo(Integer ageTo){this.ageTo = ageTo;}
		
		private String district="";
		public String getDistrict(){return district;}
		public void setDistrict(String district){this.district = district;}
		
		private String mail="";
		public String getMail(){return mail;}
		public void setMail(String mail){this.mail = mail;}
		
		private String loginpassword="";
		public String getLoginpassword(){return loginpassword;}
		public void setLoginpassword(String loginpassword){this.loginpassword = loginpassword;}
		
		private Date birthday=null;
		public Date getBirthday(){return birthday;}
		public void setBirthday(Date birthday){this.birthday = birthday;}
		
		private Date birthdayFrom=null;
		public Date getBirthdayFrom(){return birthdayFrom;}
		public void setBirthdayFrom(Date birthdayFrom){this.birthdayFrom = birthdayFrom;}
		
		private Date birthdayTo=null;
		public Date getBirthdayTo(){return birthdayTo;}
		public void setBirthdayTo(Date birthdayTo){this.birthdayTo = birthdayTo;}
		
		private Float stature=null;
		public Float getStature(){return stature;}
		public void setStature(Float stature){this.stature = stature;}
		
		private Float statureFrom=null;
		public Float getStatureFrom(){return statureFrom;}
		public void setStatureFrom(Float statureFrom){this.statureFrom = statureFrom;}
		
		private Float statureTo=null;
		public Float getStatureTo(){return statureTo;}
		public void setStatureTo(Float statureTo){this.statureTo = statureTo;}
		
		private String familystaff="";
		public String getFamilystaff(){return familystaff;}
		public void setFamilystaff(String familystaff){this.familystaff = familystaff;}
		
		private String marriage="";
		public String getMarriage(){return marriage;}
		public void setMarriage(String marriage){this.marriage = marriage;}
		
		private Float salary=null;
		public Float getSalary(){return salary;}
		public void setSalary(Float salary){this.salary = salary;}
		
		private Float salaryFrom=null;
		public Float getSalaryFrom(){return salaryFrom;}
		public void setSalaryFrom(Float salaryFrom){this.salaryFrom = salaryFrom;}
		
		private Float salaryTo=null;
		public Float getSalaryTo(){return salaryTo;}
		public void setSalaryTo(Float salaryTo){this.salaryTo = salaryTo;}
		
		private String hobby="";
		public String getHobby(){return hobby;}
		public void setHobby(String hobby){this.hobby = hobby;}
		
		private String memo="";
		public String getMemo(){return memo;}
		public void setMemo(String memo){this.memo = memo;}
		
		private Timestamp createtime=null;
		public Timestamp getCreatetime(){return createtime;}
		public void setCreatetime(Timestamp createtime){this.createtime = createtime;}
		
		private Timestamp createtimeFrom=null;
		public Timestamp getCreatetimeFrom(){return createtimeFrom;}
		public void setCreatetimeFrom(Timestamp createtimeFrom){this.createtimeFrom = createtimeFrom;}
		
		private Timestamp createtimeTo=null;
		public Timestamp getCreatetimeTo(){return createtimeTo;}
		public void setCreatetimeTo(Timestamp createtimeTo){this.createtimeTo = createtimeTo;}
		

}