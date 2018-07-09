package prog_challenge_1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Prime {

	public Queue<Integer> IsItPrime(Queue<Integer> input) {
		Queue<Integer> result = new PriorityQueue<Integer>();
		int i, j, x = 0;

		for (i = 0; i < input.size(); i++) {
			x = input.poll();

			if (x == 1)
				result.add(x);
			else {
				for (j = 2; j <= x; j++) {
					if (x % j == 0) 
						break;
				}
				if (x == j)
					result.add(x);
			}
		}
		return result;
	}

}
