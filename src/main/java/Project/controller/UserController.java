package Project.controller;

import Project.model.User;
import Project.service.UserService;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {    
         
        @Autowired
        private UserService userService;
    
        @RequestMapping(value = { "/user"}, method = RequestMethod.GET)
        public String userForm(Locale locale, Model model) {
                model.addAttribute("user", new User());
                model.addAttribute("users", userService.allUsers());
                return "user";
        }

        @RequestMapping(value = { "/saveUser"}, method = RequestMethod.POST)
        public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result,
                Model model) {

            if (result.hasErrors()) {
                model.addAttribute("users", userService.allUsers());              
                return "user";
            }
            
            userService.saveUser(user);
            return "redirect:/user";
        }  
        
}