package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Heart {
	@RequestMapping("/printheart")
public @ResponseBody String printheart() {
	return"<pre>´´´´¶¶¶¶¶¶´´´´´´¶¶¶¶¶¶</pre>"+
			"<pre>´´¶¶¶¶¶¶¶¶¶¶´´¶¶¶¶¶¶¶¶¶¶</pre>"+ 
			"<pre>´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´´´´¶¶¶¶</pre>"+
			"<pre>¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´´´´¶¶¶¶</pre>" + 
			"<pre>¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´´¶¶¶¶¶</pre>" + 
			"<pre>¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ´¶¶¶¶¶</pre>" + 
			"<pre>´´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶</pre>" + 
			"<pre>´´´´´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶</pre>" + 
			"<pre>´´´´´´´¶¶¶¶¶¶¶¶¶¶¶¶¶</pre>" + 
			"<pre>´´´´´´´´´¶¶¶¶¶¶¶¶</pre>" + 
			"<pre>´´´´´´´´´´´¶¶¶¶</pre>";
	
}
}