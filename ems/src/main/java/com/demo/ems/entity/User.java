package com.demo.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class User {
	public User(int id, String username, String password) {
	}
	private int id;
    private String username;
    private String password;
}
