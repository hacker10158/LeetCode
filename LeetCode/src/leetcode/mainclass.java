package leetcode;

import tools.Log;

public class mainclass {

	public static void main(String[] args) {
		
		EasyQuestFactory factory = new EasyQuestFactory();
		Quest quest = factory.createQuest(LeetCodeIndex.E905_SORT_ARAY_BY_PRIORITY);
		Log.d("Run : " + quest.getTitle()); 
		quest.run();
	}

}
