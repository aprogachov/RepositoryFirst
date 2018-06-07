package Project.controller;

import Project.model.Request;
import Project.service.RequestService;
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
public class RequestController {    
         
        @Autowired
        private RequestService requestService;
    
        @RequestMapping(value = { "/request"}, method = RequestMethod.GET)
        public String requestForm(Locale locale, Model model) {
                model.addAttribute("request", new Request());
                model.addAttribute("requests", requestService.allRequests());
                return "request";
        }

        @RequestMapping(value = { "/saveRequest"}, method = RequestMethod.POST)
        public String saveRequest(@ModelAttribute("request") @Valid Request request, BindingResult result,
                Model model) {

            if (result.hasErrors()) {
                model.addAttribute("requests", requestService.allRequests());              
                return "request";
            }
            
            requestService.saveRequest(request);
            return "redirect:/request";
        }     
        
}