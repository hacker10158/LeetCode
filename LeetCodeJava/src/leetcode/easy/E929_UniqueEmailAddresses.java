package leetcode.easy;

import java.util.HashSet;

import leetcode.LeetCodeIndex;
import leetcode.Quest;

public class E929_UniqueEmailAddresses implements Quest {
	/* 
	 * https://leetcode.com/problems/unique-email-addresses/
	 * Unique Email Addresses
	 * 
	 * 2018/11/8
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E929_UNIQUE_EMAIL_ADDRESS;
	}

	@Override
	public void run() {
		//run online
	}
	
	 // Unique Email Addresses
    public int numUniqueEmails(String[] emails) {
    	
    	HashSet<String> set = new HashSet<>();
    	for (int i = 0 ; i < emails.length; i ++) {
            String targetStr = emails[i];
            int indexAt = targetStr.indexOf("@");
            String tailStr = targetStr.substring(indexAt, targetStr.length()-1);
            String headStr = targetStr.substring(0,indexAt);
            headStr = headStr.replace(".","");
            
            int indexPlus = headStr.indexOf("+");
            if (indexPlus >=0) {
            	headStr = headStr.substring(0, indexPlus);
            }
            set.add(headStr+tailStr);
        }
        
        return set.size();
    }
}
