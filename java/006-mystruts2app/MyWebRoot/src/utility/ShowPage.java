package utility;

import java.io.Serializable;

public class ShowPage implements Serializable {

	private static final long serialVersionUID = 19761210;
	String page=null;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public ShowPage() {
		super();
	}
}