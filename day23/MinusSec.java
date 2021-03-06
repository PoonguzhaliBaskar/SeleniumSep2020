package day23;

import java.time.LocalDateTime;

public class MinusSec {

	public static void main(String[] args) {
  
LocalDateTime now = LocalDateTime.now();
System.out.println(now);
LocalDateTime minusSeconds = now.minusSeconds(45);
System.out.println(minusSeconds);
	}

}
