package com.jon.learning;

import java.util.concurrent.LinkedBlockingQueue;

public class SortingQueues {

	static String[] participants = {"A", "B", "C", "D", "E", "F", "G"};
	
	public static void main(String[] args){
		LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		
		for (int i=0; i < participants.length; i++){
			int score1 = (int)(Math.random() * 100 + 1);
			if (queue.size() < 1){
				queue.add(score1);
			} else {
				queue = shift(queue, score1);
			}
		}
		
	}
	
	static LinkedBlockingQueue<Integer> shift(LinkedBlockingQueue<Integer> Q, int rand){
		LinkedBlockingQueue<Integer> sorted = new LinkedBlockingQueue<>();
		for (int i=0; i < Q.size(); i++){
			int topScore = Q.poll();
			if (rand > topScore){
				sorted.add(rand);
				System.out.println(rand);
				sorted.add(topScore);
				rand = -1; //so it won't be enqueued again
			} else {
				sorted.add(topScore);
				sorted.add(rand);
			}
		}
		return sorted;
	}
	
}
