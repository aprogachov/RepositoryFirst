package Project.controller;

import Project.model.Univer;
import Project.service.UniverService;
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
public class UniverController {    
 
        @Autowired
        private UniverService univerService;    
    
        @RequestMapping(value = { "/univer"}, method = RequestMethod.GET)
        public String univerForm(Locale locale, Model model) {
                model.addAttribute("univer", new Univer());
                model.addAttribute("univers", univerService.loadWeek());
                return "univer";
        }
 
        @RequestMapping(value = { "/saveUniver"}, method = RequestMethod.POST)
        public String saveUniver(@ModelAttribute("univer") @Valid Univer univer, BindingResult result,
                Model model) {

            if (result.hasErrors()) {
                model.addAttribute("univers", univerService.loadWeek());              
                return "univer";
            }
            
            univerService.saveFreeRooms(univer);
            return "redirect:/univer";
        }  
        
}