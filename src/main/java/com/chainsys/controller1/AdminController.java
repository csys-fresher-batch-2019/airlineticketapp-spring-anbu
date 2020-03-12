package com.chainsys.controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AdminController {
	

		@GetMapping("/AdminLogin")
		 public int admin(String email, String password) throws Exception;

		
}
		