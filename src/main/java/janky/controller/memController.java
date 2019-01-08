package janky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import janky.service.memService;

@RestController
public class memController {
	
	@Autowired
	private memService mr;
	
	@GetMapping("/getmem")
	public ResponseEntity<String> getframes(@RequestParam String pname)
	{
		return new ResponseEntity<String>(mr.getmem(pname),HttpStatus.OK);
	}
}
