package org.example.SpringServices.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
mahiate method ha dar interface servise taarif mishavand
dar celase servic pyadesazi mishavad ba @services
dar controller interface @autoeired ya injection mishavad
va baraye eemale methodha faghat az interface estefade mikonim
 */




@RestController
@RequestMapping("/calculator")
public class Controller {

    @Autowired
    ICalculatorService service;


    @GetMapping("/sum/{number1}/{number2}")
    public int sum ( @PathVariable(name = "number1")  int number1,
                     @PathVariable(name = "number2")  int number2){

        return service.sum(number1,number2);
    }


    @GetMapping("/minus/{number1}/{number2}")
    public int minus (@PathVariable(name = "number1") int number1,
                      @PathVariable(name = "number2") int number2){


        return service.minus(number1,number2);
    }


    @GetMapping("/multi/{number1}/{number2}")
    public int multi (@PathVariable (name = "number1") int number1,
                      @PathVariable (name = "number2") int number2){

        return service.multi(number1,number2);

    }







}
