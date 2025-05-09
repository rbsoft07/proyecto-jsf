FROM tomcat:9.0-jdk11

# Eliminar las aplicaciones por defecto de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Opcional: Configurar Tomcat para acceder al Manager (para administración)
#COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
#COPY context.xml /usr/local/tomcat/webapps.dist/manager/META-INF/context.xml

# Copiar nuestro archivo WAR a la carpeta webapps
COPY target/Project-jsf.war /usr/local/tomcat/webapps/app.war

# Puerto donde escuchará Tomcat
EXPOSE 8080

# Iniciar Tomcat
CMD ["catalina.sh", "run"]