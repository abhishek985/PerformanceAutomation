package com.janky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private jankyService sr;

	@RequestMapping("/getjanky")
	public ResponseEntity<Integer> getframes()
	{
		return new ResponseEntity<Integer>(sr.getframes(),HttpStatus.OK);

	}
}
