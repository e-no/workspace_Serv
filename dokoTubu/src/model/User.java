package model;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private String pass;
	/**
	 * @param name
	 * @param pass
	 */
	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public User() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	/**
	 * @return name
	 */
	public String getName() {		return name;	}
	/**
	 * @return pass
	 */
	public String getPass() {			return pass;		}

}
