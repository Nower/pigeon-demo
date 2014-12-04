/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo;

import java.io.Serializable;
import java.util.List;

public interface UserService {

	User[] getUserDetail(User[] users, boolean withPassword);
	
	User[] getUserDetail(List<User> users, boolean withPassword);

	public static class User implements Serializable {
		private String username;
		private String email;
		private String password;

		public User() {
		}

		public User(String name) {
			username = name;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String toString() {
			return username + "," + email + "," + password;
		}
	}

}
