package practise_app4;

import java.util.LinkedList;
import java.util.Queue;

public class M43 {
	public static void main(String[] args) {
		Queue<Integer> queue =new LinkedList<Integer>();
		
        queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		queue.offer(60);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.isEmpty());
	}
		
}