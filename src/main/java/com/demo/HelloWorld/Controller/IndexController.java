package com.demo.HelloWorld.Controller;

import com.demo.HelloWorld.Model.UserDetails;
import com.demo.HelloWorld.dao.DataInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import java.util.Optional;


@Controller
public class IndexController {
    @Autowired
    DataInterface data;
    @RequestMapping("home")
    public String home(){
        return "home";
    }
    @RequestMapping("addUser")
    public String test(UserDetails user){
        data.save(user);
        return "home";

    }
    @RequestMapping("showUser")
    public ModelAndView show(@RequestParam int ID){
        ModelAndView mav=new ModelAndView("show");
       UserDetails user=data.findById(ID).orElse(new UserDetails());
       mav.addObject("users",user);
        return mav;
    }
    @RequestMapping("deleteUser")
    public ModelAndView delete(@RequestParam int ID){
        ModelAndView mav=new ModelAndView("delete");
        UserDetails user=data.findById(ID).orElse(new UserDetails());
        data.deleteById(ID);
        mav.addObject("users",user);
        return mav;
    }
    @RequestMapping("updateUser")
    public ModelAndView update(UserDetails user){
        ModelAndView mav=new ModelAndView("update");
        user=data.findById(user.getID()).orElse(new UserDetails());
        data.deleteById(user.getID());
        mav.addObject("users",user);
        return mav;
    }
}
