/**
 * 
 */
package com.rbsoft.projectjsf.spring.test;

import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rbsoft.projectjsf.dao.DisqueraDAO;

/**
 * @author rbsoft07
 * Clase de prueba unitaria que permite realizar pruebas utilizado el framework Spring
 * @param <DiqueraDAO>
 */
public class SpringProjectJSFTest {
	
	@Test
	void testContext() {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDao = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDao);
		
		DisqueraDAO disqueraDaoSecond = (DisqueraDAO) context.getBean("disqueraDAO");
		
		System.out.println("Contexto cargado Correctamente!. ");
		System.out.println(disqueraDao);
		System.out.println(disqueraDaoSecond);
		
		//::::::::::PROPERTIES:::::::::::::::
		
	 	Properties properties =  (Properties) context.getBean("properties");
	 	System.out.println(properties.get("spring-username"));
	}

}
