package com.ecommerce.microcommerce.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.util.Map;



public class ProductAdmin {

  //information que nous ne souhaitons pas exposer
    private Map<String,Integer> differencePrix;

    //constructeur par défaut
    public ProductAdmin() {
    }

    //constructeur pour nos tests
    public ProductAdmin(Map<String,Integer> differencePrix) {
        this.differencePrix = differencePrix;
    }

    public Map<String,Integer> getDifferencePrix() {
        return differencePrix;
    }

    public void setDifferencePrix(Map <String,Integer> differencePrix) {
        this.differencePrix = differencePrix;
    }




}
