package com.sr.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/netbanking")
public class NetbankingService {

	@GetMapping
	public String getAccountBalance(@RequestParam("accountNo") String accountNo) {
		return String.valueOf(9393);
	}

}
