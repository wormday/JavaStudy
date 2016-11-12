package core;

import java.io.Serializable;

/**
 * 包装struts控件的bean对象
 */
public class ListKeyBean implements Serializable{
	private static final long serialVersionUID = 19761210;
	private String key=null;
	private String value=null;
	
	public ListKeyBean(String key, String value) {
		this.key = key;
        this.value = value;
	}
    
    public String getKey(){return this.key;}
    public String getValue(){return this.value;}
    
    public void setKey(String key){this.key=key;}
    public void setValue(String value){this.value=value;}
    
    public boolean equals(Object obj){
        if(!(obj instanceof ListKeyBean)) return false;
        else return key.equals(((ListKeyBean)obj).getKey());
    }
    
    public int hashCode() {
        return key.hashCode();
    }
}