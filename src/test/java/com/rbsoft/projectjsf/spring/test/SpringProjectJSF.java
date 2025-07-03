/**
 * 
 */
package com.rbsoft.projectjsf.spring.test;

import static org.junit.Assert.assertNotNull;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author rbsoft07
 * Clase de prueba unitaria que permite realizar pruebas utilizado el framework Spring
 */
public class SpringProjectJSF {
	
	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("src/main/resources/applicationContext.xml");
		assertNotNull(getClass());
		System.out.println("Contexto cargado Correctamente!. ");
	}

}
