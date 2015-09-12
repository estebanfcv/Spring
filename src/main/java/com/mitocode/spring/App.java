/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitocode.spring;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Mundo;
import com.mitocode.beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author estebanfcv
 */
public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
//        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();

        Persona per = (Persona) appContext.getBean("personaBean2");
        
        System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo()+" "+per.getPais().getNombre()+" "+per.getPais().getCiudad().getNombre());

//        appContext.register(AppConfig.class);
//        appContext.register(AppConfig2.class);
//        appContext.refresh();
//        Mundo m = (Mundo) appContext.getBean("marte");
//        System.out.println(m.getSaludo());
        ((ConfigurableApplicationContext) appContext).close();
    }

}
