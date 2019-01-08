package janky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import janky.service.jankyService;

@RestController
public class jankController {

	@Autowired
	private jankyService sr;

	@GetMapping(value="/getjanky")
	@ResponseBody
	public  ResponseEntity<Object[]> getframes()
	{
		return new ResponseEntity<Object[]>(sr.getframes(),HttpStatus.OK);

	}
}
