# Usar imagen oficial de Tomcat 9.0 con JDK 11
FROM tomcat:9.0-jdk11-openjdk

# Mantenedor (opcional)
LABEL maintainer="rbsoft07@gmail.com"

# Variables de entorno
ENV CATALINA_HOME /usr/local/tomcat
#ENV PATH $CATALINA_HOME/bin:$PATH

# Eliminar las aplicaciones por defecto de Tomcat
RUN rm -rf $CATALINA_HOME/webapps/*

# Crear el directorio webapps si no existe
RUN mkdir -p $CATALINA_HOME/webapps

# Copiar archivo WAR a la carpeta webapps
COPY target/Project-jsf.war $CATALINA_HOME/webapps/appweb.war

# Exponer el puerto 8080
EXPOSE 9191

# Ejecutar Tomcat
CMD ["catalina.sh", "run"]
