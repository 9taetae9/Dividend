package com.zerobase;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

//@SpringBootApplication
public class DividendApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DividendApplication.class, args);
        String s = "Hello my name is %s";
        String[] names = {"GREEN", "BLUE", "RED"};

        for(String name : names){
            System.out.println(String.format(s, name));
        }
        System.out.println(s);
    }
}
