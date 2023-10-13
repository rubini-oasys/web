package com.example.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
		@GetMapping(value="/webapp")
		public String getmsg() {
			return "successfully executed";
		}

	}



