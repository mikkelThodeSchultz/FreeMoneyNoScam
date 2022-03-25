package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.services.FreeMoneyRepository;
import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){

        String email = dataFromForm.getParameter("email");
        ValidateEmailService validateEmailService = new ValidateEmailService();
        FreeMoneyRepository freeMoneyRepository = new FreeMoneyRepository();

        if (validateEmailService.isEmailValid(email)) {
            System.out.println(dataFromForm.getParameter("email"));
            System.out.println("Mailen er god");
            freeMoneyRepository.insertEmailToDb(email);
            return "redirect:/success";
        }
        return "redirect:/failure";
    }

    @GetMapping("success")
    public void emailVerifiedSuccess(){

    }

    @GetMapping("failure")
    public void emailWrongFailure(){

    }
}
