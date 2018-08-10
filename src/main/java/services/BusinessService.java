package services;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    public String getSaludo() {
        return "Estoy saludnado desde el servicio BusinessService";
    }
}
