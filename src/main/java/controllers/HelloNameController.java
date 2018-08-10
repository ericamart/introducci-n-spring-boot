package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.BusinessService;

@RestController
public class HelloNameController {

    private BusinessService businessService;

    @Autowired
    public HelloNameController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @RequestMapping(value="/saludar/{nombre}", method = RequestMethod.GET)
    public String index(@PathVariable String nombre) {
        return "Hola " + nombre;
    }

}