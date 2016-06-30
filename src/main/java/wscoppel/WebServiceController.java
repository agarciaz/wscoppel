package wscoppel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceController {

    @RequestMapping("saludo")
    public String sayHello(){
        return ("Hola Servicio Web Coppel");
    }
}