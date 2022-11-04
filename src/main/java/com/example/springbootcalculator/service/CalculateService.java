package com.example.springbootcalculator.service;

import com.example.springbootcalculator.entity.Operations;
import org.springframework.stereotype.Service;


@Service
public class CalculateService {

   public int adding (Operations operations) {
       return operations.getA() + operations.getB();
   }

   public int subtrack (Operations operations) {
       return operations.getA() - operations.getB();
   }

   public int multiple (Operations operations) {
       return operations.getB() * operations.getB();
   }

   public float divide (Operations operations) {
       if ( operations.getA() == 0) return 0;
       if (operations.getB() == 0) return 0;
       return (float) operations.getA() / operations.getB();

   }

    public Operations clear(Operations operations){
        operations.setA(0);
        operations.setB(0);
        return operations;
    }
}
