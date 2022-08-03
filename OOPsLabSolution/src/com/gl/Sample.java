package com.gl;

public class Sample {
	class BuildingSckyscrapper{
		int SIZE_OF_QUEUE = 1000;
		int array_of_Queue[] = new int[SIZE_OF_QUEUE];
		int front_index, rear_index;
		
		void Queue_Data_Structure(){
			front_index = -1;
			rear_index = -1;
			
		}
		boolean isFull() {
			if(front_index == 0 && rear_index == SIZE_OF_QUEUE-1) {
				return true;
			}
			return false;
		}
		boolean isEmpty() {
			if(front_index == -1)
				return true;
			else
				return false;
		}
		void enQueue_Data_Structure(int element) {
			
			if(isFull()) {
				System.out.println("Queue_Data_Structure is full");
			}
			else {
				if(front_index == -1) {
					front_index = 0;
				}
			}
		}
	}
	
}
