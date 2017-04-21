package model;

import java.util.List;

public class PostMutterLogic{

	public void execute(Mutter mutter , List<Mutter>mutterList){

		mutterList.add(0,mutter);

	}

	public PostMutterLogic() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
