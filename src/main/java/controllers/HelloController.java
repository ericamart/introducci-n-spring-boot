package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.BusinessService;

@RestController
public class HelloController {

    @Value("${introduccion.spring.nombre}")
    private String nombre;

    @Autowired
    private BusinessService businessService;

    @RequestMapping("/")
    public String index() {
        String respuesta = "Nombre del proyecto " + this.nombre;
        respuesta += "\n" + businessService.getSaludo();
        return respuesta;
    }

}