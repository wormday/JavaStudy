package ajax;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import myapp.person.logic.person.PersonBean;
import myapp.person.logic.person.PersonJDT;

public class ValidateFoundation {

	public ValidateFoundation() {
		super();
	}
	
	public boolean Validate(String value,int index,HttpServletRequest request){
		boolean isValid=false;
		switch(index){
		case 1:
			PersonJDO personJdo=new PersonJDO();
			PersonBean pb=new PersonBean();
			pb.setMail(value);
			List<PersonBean> list=personJdo.finderEqual(pb);
			if(list==null){
				isValid=true;
			}
			else if(list.size()==0)
			{
				isValid=true;
			}
			break;
			default:
		}
		return isValid;
		
	}

}
