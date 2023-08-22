package work0821;

import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EmpJframe extends JDialog {
	public JTextField jtfEmpno;
	public JTextField jtfEname;
	public JTextField jtfHiredate;
	public JTextField jtfJob;
	public JTextField jtfSal;
	
	public JLabel jlblEmpno;
	public JLabel jlblEname;
	public JLabel jlblHiredate;
	public JLabel jlblJob;
	public JLabel jlblSal;
	
	public EmpJframe(EmpVO eVO) {
		jtfEmpno=new JTextField(Integer.toString(eVO.getEmpno()));
		jtfEname=new JTextField(eVO.getEname());
		jtfHiredate=new JTextField(eVO.getHiredate());
		jtfJob=new JTextField(eVO.getJob());
		jtfSal=new JTextField(Integer.toString(eVO.getSal()));
		
		setLayout(null);
		
		jlblEmpno=new JLabel("사원번호 : ");
		jlblEname=new JLabel("사원이름 : ");
		jlblHiredate=new JLabel("입사일 : ");
		jlblJob=new JLabel("직급 : ");
		jlblSal=new JLabel("연봉 : ");
		
		jtfEmpno.setBounds(200,200,100,50);
		jtfEname.setBounds(200,300,100,50);
		jtfHiredate.setBounds(200,400,100,50);
		jtfJob.setBounds(200,500,100,50);
		jtfSal.setBounds(200,600,100,50);
		
		jlblEmpno.setBounds(100,200,100,50);
		jlblEname.setBounds(100,300,100,50);
		jlblHiredate.setBounds(100,400,100,50);
		jlblJob.setBounds(100,500,100,50);
		jlblSal.setBounds(100,600,100,50);
		
		add(jtfEmpno);
		add(jtfEname);
		add(jtfHiredate);
		add(jtfJob);
		add(jtfSal);

		add(jlblEmpno);
		add(jlblEname);
		add(jlblHiredate);
		add(jlblJob);
		add(jlblSal);
		
		setSize(500,800);
		setVisible(true);
		
	}//EmpJframe
}//class
