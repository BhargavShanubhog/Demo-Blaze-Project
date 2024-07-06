package pom;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;

public class TimeSpan {
	

	public static Duration FromSeconds(int i) {
		try {
			i=700;
			Duration duration=Duration.ofSeconds(i);
		return duration;
	}catch(TimeoutException e) {
		System.out.println(e);
	}
		return null;
		
	}
		

}
