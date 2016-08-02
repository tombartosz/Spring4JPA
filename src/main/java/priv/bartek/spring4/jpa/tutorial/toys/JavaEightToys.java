package priv.bartek.spring4.jpa.tutorial.toys;

import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class JavaEightToys {
	
	final Random r = new SecureRandom();

	public String oddPlay() {
		
		String play = Stream.generate(() -> r.nextInt(100)).limit(50).parallel().filter((n) -> { return n % 2 == 0;}).sorted().map((n) -> {return Integer.toString(n);}).collect(Collectors.joining(", ")) ;
		return play;
	}
}
