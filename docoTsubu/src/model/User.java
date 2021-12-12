package model;
import java.io.Serializable;

public class User implements Serializable {
public String name; //ユーザー名
public String pass; //パスワード

public User() {}
public User(String name, String pass) {
	this.name = name;
	this.pass = pass;
}
public String getName() { return name; }
public String getPass() { return pass; }
}