package leetcode;

import tools.Log;

public class mainclass {

	public static void main(String[] args) {
		
		EasyQuestFactory factory = new EasyQuestFactory();
		Quest quest = factory.createQuest(LeetCodeIndex.E561_ARRAY_PARTITION_I);
		Log.d("Run : " + quest.getTitle()); 
		quest.run();
	}

}
