package prog_challenge_1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Prime {

	public Queue<Integer> IsItPrime(Queue<Integer> input) {
		Queue<Integer> result = new PriorityQueue<Integer>();
		int i, j, x, count = 0;

		for (i = 0; i < input.size(); i++) {
			x = input.poll();

			if (x == 1)
				result.add(x);
			else {
				for (j = 1; j <= x; j++) {
					if (x % j == 0) 
						count++;
				}
				if (count == 2)
					result.add(x);
				count = 0;
			}
		}
		return result;
	}
}
