package janky.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import janky.service.cpuService;


@RestController
public class Controller {
	
	@Autowired
	private cpuService cr;

	@RequestMapping("/getcpu")
	public ResponseEntity<String> getcpu()
	{
		return new ResponseEntity<String>(cr.getcpu(),HttpStatus.OK);
	}
}

