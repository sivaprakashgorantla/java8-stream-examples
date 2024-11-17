package nov24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonaciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> series = fibonaciSeriesNum();
		System.out.println("series : " + series);

	}

	private static List<Integer> fibonaciSeriesNum() {
		// TODO Auto-generated method stub
		return Stream.iterate(new int[] { 0, 1 }, 
				fib -> new int[] { fib[1], fib[0] + fib[1] })
				.limit(5)
				.map(fib -> fib[0])
				.collect(Collectors.toList());
	}

}
