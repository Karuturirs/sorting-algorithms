package com.wordplay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadder {
	public static void main(String[] args){
		String start = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"));
		
		LinkedList<WordNode> queues= ladderLength(start,end,dict);
		for(WordNode str: queues){
			System.out.println(str);
	   }
        
		
	}
    public static LinkedList<WordNode> ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        LinkedList<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(beginWord, 1));
        System.out.println(queue.size());
        wordDict.add(endWord);
 
        while(!queue.isEmpty()){
            WordNode top = queue.remove();
            String word = top.word;
 
            if(word.equals(endWord)){
            	queue.add(new WordNode(word, top.numSteps+1));
            	 System.out.println("-777->"+queue.size());
                return queue;
            }
 
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++){
                for(char c='a'; c<='z'; c++){
                    char temp = arr[i];
                    if(arr[i]!=c){
                        arr[i]=c;
                    }
 
                    String newWord = new String(arr);
                    if(wordDict.contains(newWord)){
                    	 queue.add(new WordNode(word, top.numSteps+1));
                        queue.add(new WordNode(newWord, top.numSteps+1));
                        wordDict.remove(newWord);
                        System.out.println(queue.size()+":- transactions:-"+newWord);
                    }
 
                    arr[i]=temp;
                }
            }
        }
        System.out.println("-777->"+queue.size());
        return queue;
    }
}