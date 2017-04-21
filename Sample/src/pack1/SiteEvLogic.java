package pack1;

public class SiteEvLogic {

	public void like(SiteEv site){

		int count = site.getLike();
		site.setLike(count+1);
	}

	public void dislike(SiteEv site){
		int count = site.getDislike();
		site.setDislike(count +1);

	}

	public SiteEvLogic() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
