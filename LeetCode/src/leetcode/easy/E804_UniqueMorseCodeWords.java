package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

import leetcode.LeetCodeIndex;
import leetcode.Quest;

public class E804_UniqueMorseCodeWords implements Quest {
	/* https://leetcode.com/problems/unique-morse-code-words/
	 * 
	 * Unique Morse Code Words
	 * 
	 * 2018/11/8
	 */

	@Override
	public String getTitle() {
		return LeetCodeIndex.E804_UNIQUE_MORSE_CODE_WORDS;
	}

	@Override
	public void run() {
	
	}
	
    // Unique Morse Code Words
    public int uniqueMorseRepresentations(String[] words) {
    	
    	HashSet<String> set = new HashSet<>();
    	
    	String [] strMorse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	String [] strABC = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    	HashMap<String, String> map = new HashMap<>();
    	for(int i = 0; i < strABC.length ; i++ ) {
    		map.put(strABC[i], strMorse[i]);
    	}
    	
    	for(int i = 0; i < words.length ; i++ ) {
    		String target = words[i];
    		String morse = "";
    		for(int j = 0 ; j < target.length() ; j++) {
    			String key = target.substring(j, j+1);
    			morse = morse + map.get(key);
    		}
    		
    		set.add(morse);
    	}
    	    	
    	return set.size();
    }
}
