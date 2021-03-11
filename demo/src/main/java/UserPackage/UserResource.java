package UserPackage;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	
    @GetMapping(path = "user")
    public List<User> getAll(){
        return service.findAll();
    }
    @GetMapping(path = "users")
    public String a(){
        return "gaurav";
    }


}
