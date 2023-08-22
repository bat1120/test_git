package work0821;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class EmpTable extends JFrame {
	public JList<String> empno;
	public List<EmpVO> list;

	public EmpTable() {
		EmpDAO eDAO = new EmpDAO();
		try {
			list = eDAO.selectEmpno();
		} catch (SQLException e) {
			e.printStackTrace();
		} // catch

		DefaultListModel<String> listModel = new DefaultListModel<>();
		for (EmpVO emp : list) {
			listModel.addElement(String.valueOf(emp.getEmpno()));
		} // for

		empno = new JList<>(listModel);

		EmpEvt ee = new EmpEvt(this);
		empno.addMouseListener(ee);
		
		
		
		setLayout(new BorderLayout());
		add(new JScrollPane(empno), BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// EmpTable

	public static void main(String[] arg) {
		new EmpTable();
	}// main

	public JList<String> getEmpno() {
		return empno;
	}// getEmpno

	public void setEmpno(JList<String> empno) {
		this.empno = empno;
	}// setEmpno

}// class
