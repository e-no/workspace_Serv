package pack1;

import java.io.Serializable;

public class SiteEv implements Serializable {

	private int like ;
	private int dislike;

	public SiteEv() {		// TODO 自動生成されたコンストラクター・スタブ
		like = 0;		dislike = 0;
	}
	/**
	 * @return like
	 */
	public int getLike() {		return like;	}
	/**
	 * @param like セットする like
	 */
	public void setLike(int like) {		this.like = like;	}
	/**
	 * @return dislike
	 */
	public int getDislike() {		return dislike;	}
	/**
	 * @param dislike セットする dislike
	 */
	public void setDislike(int dislike) {		this.dislike = dislike;	}

}
