package work0821;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class EmpEvt extends MouseAdapter {
	public EmpTable et;

	public EmpEvt(EmpTable et) {
		this.et = et;
	}//EmpEvt

	@Override
	public void mouseClicked(MouseEvent e) {
		EmpDAO eDAO = new EmpDAO();
		try {
			new EmpJframe(eDAO.selectOneEmpno(Integer.parseInt(et.getEmpno().getSelectedValue())));
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} // catch
	}//mouseClicked

}//class
