package model;

import java.io.Serializable;

public class Mutter implements Serializable {


	public String username;
	private String text;

	public Mutter(String username, String text) {
		super();
		this.username = username;
		this.text = text;
	}

	public Mutter() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	/**
	 * @return username
	 */
	public String getUsername() {		return username;	}
	/**
	 * @return text
	 */
	public String getText() {		return text;	}

}
