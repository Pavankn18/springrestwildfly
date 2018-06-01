package test.service;

import org.springframework.stereotype.Component;

@Component
public class TestService {
	
	public String getMessage() {
		return "Spring rest message!";
	}
}
