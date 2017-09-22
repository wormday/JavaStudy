/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.sunwq.contact.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sunwq.contact.dao.Addresstable;
import com.sunwq.contact.dao.AddresstableDAO;
import com.sunwq.contact.form.AddContactForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-18-2016
 * 
 * XDoclet definition:
 * @struts.action path="/addContact" name="addContactForm" input="/form/addContact.jsp" scope="request" validate="true"
 */
public class AddContactAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		AddContactForm addContactForm = (AddContactForm) form;// TODO Auto-generated method stub
		Addresstable table=new Addresstable();
		table.setFirstName(addContactForm.getFirstName());
		table.setLastName(addContactForm.getLastName());
		table.setDepartment("");
		table.setEmail("");
		table.setDepartment("");
		table.setJobTitle("");
		table.setMobile("");
		table.setPhone("");
		AddresstableDAO dao=new AddresstableDAO();
		dao.save(table);
		return mapping.findForward("list");
	}
}