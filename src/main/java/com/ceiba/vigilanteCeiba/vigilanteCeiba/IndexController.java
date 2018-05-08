package com.ceiba.vigilanteCeiba.vigilanteCeiba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // indica que puede ser consumido desde una app externa
public class IndexController {
	@RequestMapping("/")
	public String getIndexPage() {
		return "index";
	}

}
