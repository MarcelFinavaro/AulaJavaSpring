package com.devsuperior.aula.Services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {

       public double discount(double amount){
               return amount * 0.1;
    }
}
