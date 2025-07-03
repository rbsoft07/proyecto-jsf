/**
 * 
 */
package com.rbsoft.projectjsf.spring.test;

import static org.junit.Assert.assertNotNull;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rbsoft.projectjsf.dao.DisqueraDAO;

/**
 * @author rbsoft07
 * Clase de prueba unitaria que permite realizar pruebas utilizado el framework Spring
 * @param <DiqueraDAO>
 */
public class SpringProjectJSF {
	
	@Test
	void testContext() {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("src/main/resources/applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDao = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDao);
		
		System.out.println("Contexto cargado Correctamente!. ");
		System.out.println(disqueraDao.toString());
	}

}
