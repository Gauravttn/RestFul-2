package com.bootcamp.demo.employee;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Versioning {	


	//URI	
	@GetMapping(path="user1/uri")
	public User1 user1Uri() {
		return new User1("Gaurav Kumar");
	}
	
	@GetMapping(path="user2/uri")
	public User2 user2Uri() {
		return new User2(new Name("Gaurav", "Kumar"));
	}
	
	//Request Param
	@GetMapping(path="User/param",params="version=1")
	public User1 user1Param() {
		return new User1("Gaurav Kumar");
	}
	
	@GetMapping(path="User/param",params="version=2")
	public User2 user2Param() {
		return new User2(new Name("Gaurav", "Kumar"));
	}
	
    //Custom Header 
    @GetMapping(value = "/user/header", headers = "X-API-VERSION=1")
    public User1 header1(){
        return new User1("Gaurav");
    }
    @GetMapping(value = "/user/header", headers = "X-API-VERSION=2")
    public User2 header2(){
        return new User2(new Name("Gaurav", "Kumar"));
    }

    //MimeType 
    @GetMapping(value = "/user/produces", produces = "application/vnd.company.app-v1+json")
    public User1 produces1(){
        return new User1("Gaurav");
    }
    @GetMapping(value = "/user/produces", produces = "application/vnd.company.app-v2+json")
    public User2 produces2(){
        return new User2(new Name("Gaurav", "Kumar"));
    }
	
	

}
