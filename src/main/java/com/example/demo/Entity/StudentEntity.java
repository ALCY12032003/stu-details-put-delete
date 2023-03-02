package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class StudentEntity {
	@Id
    private int id;
	private String studentname;
    private String departmentname;
    private String mailid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public StudentEntity(int id, String studentname, String departmentname, String mailid) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.departmentname = departmentname;
		this.mailid = mailid;
	}

	public StudentEntity()
	{
		
	}
		
	
}