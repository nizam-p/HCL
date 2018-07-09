package prog_challenge_1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Randomizer {
	Prime sample = new Prime();
	static Queue<Integer> clone = new PriorityQueue<Integer>();

	public Queue<Integer> RandomNumberGenerator(int min, int max) {
		Queue<Integer> random = new PriorityQueue<Integer>();
		int number, count = 0;
		
		do {
			number = (int) (Math.random() * ((max - min) + 1) + min);
			random.add(number);
			count++;
		} while (count <= max);
		
		clone = random;
		return sample.IsItPrime(random);
	}
}
