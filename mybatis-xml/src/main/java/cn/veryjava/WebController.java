package cn.veryjava;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
  
import cn.veryjava.User;  
import cn.veryjava.UserMapper;  
  
@RestController  
@RequestMapping("/mybatis")  
public class WebController {  
    @Autowired  
    private UserMapper mapper;
      
      
    @RequestMapping("/test")
    public User findByName(String name){  
          
        return mapper.findByName(name);  
    }  
}  
