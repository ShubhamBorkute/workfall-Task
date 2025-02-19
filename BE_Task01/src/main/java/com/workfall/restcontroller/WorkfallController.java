package com.workfall.restcontroller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkfallController {
	//localhost:8080/welcome?name=shrikant
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeAPI(@RequestParam String name) {
		return new ResponseEntity<>("Hii "+name,HttpStatus.ACCEPTED);
	}
	
	//localhost:8080/checkPallindrome?name=AKA
	@GetMapping("/checkPallindrome")
	public ResponseEntity<String> getMethodName(@RequestParam String name) {

		StringBuilder rev = new StringBuilder();
		for (int i = name.length() - 1; i >= 0; i--) {
			rev.append(name.charAt(i));
		}
		if (name.equalsIgnoreCase(rev.toString())) {
			return new ResponseEntity<>(name + " is Palindrome ", HttpStatus.OK);
		} else
			return new ResponseEntity<>(name + " Not Pallindrome", HttpStatus.OK);

	} 
	

}
