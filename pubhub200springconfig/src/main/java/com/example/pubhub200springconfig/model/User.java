package com.example.pubhub200springconfig.model;


public class User {
		private String name;
		private String emailid;
		String username;
		private String password;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

	

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", emailid=" + emailid + ", username=" + username
					+ ", password=" + password + "]";
		}
		
		public void init()
		{
			System.out.println("The init method is running");
		}
		public void destroy()
		{
			System.out.println("The destroy method is running");
		}
		
		}



