package employeeManagement.companyDatabase.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import employeeManagement.companyDatabase.classes.Client;
import employeeManagement.companyDatabase.classes.Company;
import employeeManagement.companyDatabase.classes.Department;
import employeeManagement.companyDatabase.classes.Employee;
import employeeManagement.companyDatabase.classes.Project;
import employeeManagement.companyDatabase.controller.Controller;
import employeeManagement.companyDatabase.enums.Departments;
import employeeManagement.companyDatabase.enums.Designation;
import employeeManagement.companyDatabase.enums.Grades;
import employeeManagement.companyDatabase.enums.Projects;

public class OfficialDetails extends PersonalDetails {
	JTextField textField_employeeId;
	JTextField textField_DepartmentId;
	JTextField textField_Designation;
	JComboBox textField_ProjectName;
	JTextField textField_LocationId;
	JTextField textField_ProjectId;
	JTextField textField_ClientId;
	JTextField textField_CompanyId;
	JTextField textField_CompanyName;
	JComboBox comboBox_Grade;
	JComboBox comboBox_DepartmentName;
	JButton btnSave_1;
	JButton btnBack;
	JButton btnNext;
	Employee employee = getEmployee();

	/**
	 * @return the comboBox_Grade
	 */
	public JComboBox getComboBox_Grade() {
		return comboBox_Grade;
	}

	/**
	 * @param comboBox_Grade
	 *            the comboBox_Grade to set
	 */
	public void setComboBox_Grade(JComboBox comboBox_Grade) {
		this.comboBox_Grade = comboBox_Grade;
	}

	/**
	 * @return the comboBox_DepartmentName
	 */
	public JComboBox getComboBox_DepartmentName() {
		return comboBox_DepartmentName;
	}

	/**
	 * @param comboBox_DepartmentName
	 *            the comboBox_DepartmentName to set
	 */
	public void setComboBox_DepartmentName(JComboBox comboBox_DepartmentName) {
		this.comboBox_DepartmentName = comboBox_DepartmentName;
	}

	/**
	 * @return the btnSave_1
	 */
	public JButton getBtnSave_1() {
		return btnSave_1;
	}

	/**
	 * @param btnSave_1
	 *            the btnSave_1 to set
	 */
	public void setBtnSave_1(JButton btnSave_1) {
		this.btnSave_1 = btnSave_1;
	}

	/**
	 * @return the btnBack
	 */
	public JButton getBtnBack() {
		return btnBack;
	}

	/**
	 * @param btnBack
	 *            the btnBack to set
	 */
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	/**
	 * @return the btnNext
	 */
	public JButton getBtnNext() {
		return btnNext;
	}

	/**
	 * @param btnNext
	 *            the btnNext to set
	 */
	public void setBtnNext(JButton btnNext) {
		this.btnNext = btnNext;
	}

	/**
	 * @return the textField_employeeId
	 */
	public JTextField getTextField_employeeId() {
		return textField_employeeId;
	}

	/**
	 * @param textField_employeeId
	 *            the textField_employeeId to set
	 */
	public void setTextField_employeeId(JTextField textField_employeeId) {
		this.textField_employeeId = textField_employeeId;
	}

	/**
	 * @return the textField_DepartmentId
	 */
	public JTextField getTextField_DepartmentId() {
		return textField_DepartmentId;
	}

	/**
	 * @param textField_DepartmentId
	 *            the textField_DepartmentId to set
	 */
	public void setTextField_DepartmentId(JTextField textField_DepartmentId) {
		this.textField_DepartmentId = textField_DepartmentId;
	}

	/**
	 * @return the textField_Designation
	 */
	public JTextField getTextField_Designation() {
		return textField_Designation;
	}

	/**
	 * @param textField_Designation
	 *            the textField_Designation to set
	 */
	public void setTextField_Designation(JTextField textField_Designation) {
		this.textField_Designation = textField_Designation;
	}

	/**
	 * @return the textField_ProjectName
	 */
	public JComboBox getTextField_ProjectName() {
		return textField_ProjectName;
	}

	/**
	 * @param textField_ProjectName
	 *            the textField_ProjectName to set
	 */
	public void setTextField_ProjectName(JComboBox textField_ProjectName) {
		this.textField_ProjectName = textField_ProjectName;
	}

	/**
	 * @return the textField_LocationId
	 */
	public JTextField getTextField_LocationId() {
		return textField_LocationId;
	}

	/**
	 * @param textField_LocationId
	 *            the textField_LocationId to set
	 */
	public void setTextField_LocationId(JTextField textField_LocationId) {
		this.textField_LocationId = textField_LocationId;
	}

	/**
	 * @return the textField_ProjectId
	 */
	public JTextField getTextField_ProjectId() {
		return textField_ProjectId;
	}

	/**
	 * @param textField_ProjectId
	 *            the textField_ProjectId to set
	 */
	public void setTextField_ProjectId(JTextField textField_ProjectId) {
		this.textField_ProjectId = textField_ProjectId;
	}

	/**
	 * @return the textField_ClientId
	 */
	public JTextField getTextField_ClientId() {
		return textField_ClientId;
	}

	/**
	 * @param textField_ClientId
	 *            the textField_ClientId to set
	 */
	public void setTextField_ClientId(JTextField textField_ClientId) {
		this.textField_ClientId = textField_ClientId;
	}

	/**
	 * @return the textField_CompanyId
	 */
	public JTextField getTextField_CompanyId() {
		return textField_CompanyId;
	}

	/**
	 * @param textField_CompanyId
	 *            the textField_CompanyId to set
	 */
	public void setTextField_CompanyId(JTextField textField_CompanyId) {
		this.textField_CompanyId = textField_CompanyId;
	}

	/**
	 * @return the textField_CompanyName
	 */
	public JTextField getTextField_CompanyName() {
		return textField_CompanyName;
	}

	/**
	 * @param textField_CompanyName
	 *            the textField_CompanyName to set
	 */
	public void setTextField_CompanyName(JTextField textField_CompanyName) {
		this.textField_CompanyName = textField_CompanyName;
	}

	protected JPanel createOfficialDetailsPanel(String text) {
		JPanel officialDetailsPanel = new JPanel();

		officialDetailsPanel.setLayout(null);

		JLabel lblOfficialDetails = new JLabel("OFFICIAL DETAILS :");
		lblOfficialDetails.setBounds(10, 11, 150, 14);
		officialDetailsPanel.add(lblOfficialDetails);

		JLabel lblEmployeeId = new JLabel("Employee Id :");
		lblEmployeeId.setBounds(20, 36, 90, 14);
		officialDetailsPanel.add(lblEmployeeId);

		textField_employeeId = new JTextField();
		textField_employeeId.setBounds(158, 36, 200, 20);
		officialDetailsPanel.add(textField_employeeId);
		textField_employeeId.setColumns(10);

		JLabel lblDepartment = new JLabel("DEPARTMENT :");
		lblDepartment.setBounds(10, 143, 100, 14);
		officialDetailsPanel.add(lblDepartment);

		JLabel lblDepartmentName = new JLabel("Department Name :");
		lblDepartmentName.setBounds(20, 205, 118, 14);
		officialDetailsPanel.add(lblDepartmentName);

		JLabel lblDepartmentId = new JLabel("Department Id :");
		lblDepartmentId.setBounds(20, 173, 90, 14);
		officialDetailsPanel.add(lblDepartmentId);

		JLabel lblLocationId = new JLabel("Location Id :");
		lblLocationId.setBounds(20, 230, 90, 14);
		officialDetailsPanel.add(lblLocationId);

		textField_LocationId = new JTextField();
		textField_LocationId.setBounds(158, 234, 200, 20);
		officialDetailsPanel.add(textField_LocationId);
		textField_LocationId.setColumns(10);

		textField_DepartmentId = new JTextField();
		textField_DepartmentId.setBounds(158, 170, 200, 20);
		officialDetailsPanel.add(textField_DepartmentId);
		textField_DepartmentId.setColumns(10);

		String[] grades = new String[] { "G1", "G2", "G3", "G4", "G5", "G6" };
		JLabel lblGrade = new JLabel("Grade:");
		lblGrade.setBounds(30, 71, 46, 14);
		officialDetailsPanel.add(lblGrade);

		JLabel lblDesignation = new JLabel("Designation :");
		lblDesignation.setBounds(20, 107, 90, 14);
		officialDetailsPanel.add(lblDesignation);

		textField_Designation = new JTextField();
		textField_Designation.setBounds(158, 104, 200, 20);
		officialDetailsPanel.add(textField_Designation);
		textField_Designation.setColumns(10);

		JLabel lblProjectDetails = new JLabel("PROJECT DETAILS:");
		lblProjectDetails.setBounds(10, 273, 118, 14);
		officialDetailsPanel.add(lblProjectDetails);

		String[] proNames = new String[] { "Shopping_application",
				"Car_Selling_Website", "Android_Project", "HRMS",
				"Blackberry_Project", "Hadoop_Web_Development",
				"Company_website" };
		JLabel lblProjectName = new JLabel("Project Name :");
		lblProjectName.setBounds(20, 298, 90, 14);
		officialDetailsPanel.add(lblProjectName);

		textField_ProjectName = new JComboBox(proNames);
		textField_ProjectName.setBounds(158, 295, 200, 20);
		officialDetailsPanel.add(textField_ProjectName);

		JLabel lblProjectId = new JLabel("Project Id :");
		lblProjectId.setBounds(20, 329, 90, 14);
		officialDetailsPanel.add(lblProjectId);

		textField_ProjectId = new JTextField();
		textField_ProjectId.setBounds(158, 326, 200, 20);
		officialDetailsPanel.add(textField_ProjectId);
		textField_ProjectId.setColumns(10);

		JLabel lblClient = new JLabel("CLIENT DETAILS :");
		lblClient.setBounds(411, 143, 100, 14);
		officialDetailsPanel.add(lblClient);

		JLabel lbl_ClientId = new JLabel("Client Id :");
		lbl_ClientId.setBounds(411, 173, 100, 14);
		officialDetailsPanel.add(lbl_ClientId);

		textField_ClientId = new JTextField();
		textField_ClientId.setBounds(530, 170, 168, 20);
		officialDetailsPanel.add(textField_ClientId);
		textField_ClientId.setColumns(10);

		JLabel lblCompanyName = new JLabel("Company Name :");
		lblCompanyName.setBounds(411, 205, 110, 14);
		officialDetailsPanel.add(lblCompanyName);

		textField_CompanyName = new JTextField();
		textField_CompanyName.setBounds(530, 202, 168, 20);
		officialDetailsPanel.add(textField_CompanyName);
		textField_CompanyName.setColumns(10);

		JLabel lblCompanyId = new JLabel("Company Location :");
		lblCompanyId.setBounds(411, 230, 100, 14);
		officialDetailsPanel.add(lblCompanyId);

		textField_CompanyId = new JTextField();
		textField_CompanyId.setBounds(530, 234, 168, 20);
		officialDetailsPanel.add(textField_CompanyId);
		textField_CompanyId.setColumns(10);

		btnNext = new JButton("Next>>");
		btnNext.setBounds(158, 370, 86, 23);
		officialDetailsPanel.add(btnNext);

		btnBack = new JButton("<<Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBack.setBounds(267, 370, 86, 23);
		officialDetailsPanel.add(btnBack);

		comboBox_Grade = new JComboBox(grades);
		comboBox_Grade.setBounds(158, 67, 200, 22);
		officialDetailsPanel.add(comboBox_Grade);
		String[] departments = new String[] { "HUMAN_RESOURCE", "SOFTAWRE",
				"HARDWARE", "SECURITY", "ADMINISTRATOR", "ACCOUNTS", "FINANCE" };
		comboBox_DepartmentName = new JComboBox(departments);
		comboBox_DepartmentName.setBounds(158, 201, 200, 22);
		officialDetailsPanel.add(comboBox_DepartmentName);

		JButton btnSave_1 = new JButton("Save");
		btnSave_1.setBounds(380, 370, 86, 23);

		btnSave_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println();
				employee.setEmployeeSSN(getTextField_employeeId().getText());
				Grades grade = Grades.valueOf(getComboBox_Grade()
						.getSelectedItem().toString());

				employee.setGrade(grade);
				employee.setDesignations(grade);
				Department dept = new Department();
				System.out.println(grade);
				System.out.println(getComboBox_DepartmentName()
						.getSelectedItem().toString());
				Departments departmantName = Departments
						.valueOf(getComboBox_DepartmentName().getSelectedItem()
								.toString());
				System.out.println(departmantName);
				dept.setDepartmantName(departmantName);
				employee.setDepartment(dept);
				employee.getDepartment().setDeptId(departmantName);
				String id = String.valueOf(employee.getDepartment()
						.getDepartmentId());
				getTextField_DepartmentId().setText(id);

				getTextField_Designation().setText(
						employee.getDesignation().toString());

				getTextField_employeeId().setText(employee.getEmployeeSSN());
				// dept.setDepartmentId(Integer.valueOf(getTextField_DepartmentId().getText()));
				// dept.setDepartmantName(getComboBox_DepartmentName().getSelectedItem()
				// .toString());
				// dept.setLocationId(Integer.valueOf(getTextField_LocationId().getText()));
				// employee.setDepartment(dept);
				Client client = new Client();
				Company company = new Company();
				company.setComanyName(getTextField_CompanyName().getText());
				client.setClientCompany(company);
				employee.setClient(client);
				String cid = String.valueOf(client.getClientId());
				getTextField_ClientId().setText(cid);

				employee.setClient(client);
				Project project = new Project();
				Projects projName = Projects.valueOf(getTextField_ProjectName()
						.getSelectedItem().toString());
				project.setProjectName(projName);
				project.generateId(projName);
					getTextField_ProjectId().setText(String.valueOf(project.getProjectId()));
					getTextField_LocationId().setText(String.valueOf(dept.getLocationId()));
					getTextField_CompanyId().setText(project.getLocation());
				employee.setProject(project);

				System.out.println(employee);

			}
		});
		officialDetailsPanel.add(btnSave_1);

		return officialDetailsPanel;
	}

}
