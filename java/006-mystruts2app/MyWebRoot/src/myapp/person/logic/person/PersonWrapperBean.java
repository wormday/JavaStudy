package myapp.person.logic.person;

public class PersonWrapperBean {
	public PersonWrapperBean(){super();}
	
	/**
	 * person_id表主键
	 */
	private String person_id="";
	public String  getPerson_id(){return person_id;}
	public void setPerson_id(String person_id){this.person_id = person_id;}

	private String name="";
	public String  getName(){return name;}
	public void setName(String name){this.name = name;}
	
	private String gender="";
	public String  getGender(){return gender;}
	public void setGender(String gender){this.gender = gender;}
	
	private String age="";
	private String ageFrom="";
	private String ageTo="";
	public String  getAge(){return age;}
	public void setAge(String age){this.age = age;}
	public String  getAgeFrom(){return ageFrom;}
	public void setAgeFrom(String ageFrom){this.ageFrom = ageFrom;}
	public String  getAgeTo(){return ageTo;}
	public void setAgeTo(String ageTo){this.ageTo = ageTo;}
	
	private String district="";
	public String  getDistrict(){return district;}
	public void setDistrict(String district){this.district = district;}
	
	private String mail="";
	public String  getMail(){return mail;}
	public void setMail(String mail){this.mail = mail;}
	
	private String loginpassword="";
	public String  getLoginpassword(){return loginpassword;}
	public void setLoginpassword(String loginpassword){this.loginpassword = loginpassword;}
	
	private String birthday="";
	private String birthdayFrom="";
	private String birthdayTo="";
	public String  getBirthday(){return birthday;}
	public void setBirthday(String birthday){this.birthday = birthday;}
	public String  getBirthdayFrom(){return birthdayFrom;}
	public void setBirthdayFrom(String birthdayFrom){this.birthdayFrom = birthdayFrom;}
	public String  getBirthdayTo(){return birthdayTo;}
	public void setBirthdayTo(String birthdayTo){this.birthdayTo = birthdayTo;}
	
	private String stature="";
	private String statureFrom="";
	private String statureTo="";
	public String  getStature(){return stature;}
	public void setStature(String stature){this.stature = stature;}
	public String  getStatureFrom(){return statureFrom;}
	public void setStatureFrom(String statureFrom){this.statureFrom = statureFrom;}
	public String  getStatureTo(){return statureTo;}
	public void setStatureTo(String statureTo){this.statureTo = statureTo;}
	
	private String familystaff="";
	public String  getFamilystaff(){return familystaff;}
	public void setFamilystaff(String familystaff){this.familystaff = familystaff;}
	
	private String marriage="";
	public String  getMarriage(){return marriage;}
	public void setMarriage(String marriage){this.marriage = marriage;}
	
	private String salary="";
	private String salaryFrom="";
	private String salaryTo="";
	public String  getSalary(){return salary;}
	public void setSalary(String salary){this.salary = salary;}
	public String  getSalaryFrom(){return salaryFrom;}
	public void setSalaryFrom(String salaryFrom){this.salaryFrom = salaryFrom;}
	public String  getSalaryTo(){return salaryTo;}
	public void setSalaryTo(String salaryTo){this.salaryTo = salaryTo;}
	
	private String hobby="";
	public String  getHobby(){return hobby;}
	public void setHobby(String hobby){this.hobby = hobby;}
	
	private String memo="";
	public String  getMemo(){return memo;}
	public void setMemo(String memo){this.memo = memo;}
	
	private String createtime="";
	private String createtimeFrom="";
	private String createtimeTo="";
	public String  getCreatetime(){return createtime;}
	public void setCreatetime(String createtime){this.createtime = createtime;}
	public String  getCreatetimeFrom(){return createtimeFrom;}
	public void setCreatetimeFrom(String createtimeFrom){this.createtimeFrom = createtimeFrom;}
	public String  getCreatetimeTo(){return createtimeTo;}
	public void setCreatetimeTo(String createtimeTo){this.createtimeTo = createtimeTo;}
}