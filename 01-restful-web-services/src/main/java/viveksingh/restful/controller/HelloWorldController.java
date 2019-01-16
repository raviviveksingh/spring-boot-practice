package viveksingh.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import viveksingh.restful.beans.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path = { "/hello-world" })
	public String helloWorld() {
		return "Hello Wolrd";
	}
	
	@GetMapping(path = { "/hello-world-bean" })
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Wolrd");
	}
	
	@GetMapping(path = { "/hello-world/path-variable/{name}" })
	public HelloWorldBean helloWorldPathVariable(@PathVariable final String name) {
		return new HelloWorldBean(String.format("Hello Wolrd - %s", name));
	}
}