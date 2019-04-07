package leetcode;

import tools.Log;

public class mainclass {

	public static void main(String[] args) {
		
		EasyQuestFactory factory = new EasyQuestFactory();
		Quest quest = factory.createQuest(LeetCodeIndex.E1021_REMOVE_OUTERMOST_PAR);
		Log.d("Run : " + quest.getTitle()); 
		quest.run();
	}

}
