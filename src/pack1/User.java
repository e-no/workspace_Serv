/**
 *
 */
package pack1;

import java.io.Serializable;

/**
 * @author semi01
 *
 */
public class User implements Serializable {

	/**
	 * @param id
	 * @param name
	 * @param pass
	 */
	public User(String id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	private String id,name,pass;

	/**
	 *
	 */
	public User() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return pass
	 */
	public String getPass() {
		return pass;
	}

}
