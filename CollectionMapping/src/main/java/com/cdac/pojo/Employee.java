package com.cdac.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="employee")
public class Employee {

		@Id
		@Column(name="id")
		private int empid;
		
		@Column(name="name")
		private String empname;
		
		@ElementCollection
		@JoinTable(name="contact", joinColumns= {
				@JoinColumn(name="emp_id")
		})
		private Set<Contact> contacts = new HashSet<>();

		public Employee() {
			super();
		}

		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public Set<Contact> getContacts() {
			return contacts;
		}

		public void setContacts(Set<Contact> contacts) {
			this.contacts = contacts;
		}
		
		
}
