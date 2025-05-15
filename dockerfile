# Usamos la imagen oficial de Tomcat 9.0 como base
FROM tomcat:9.0

# Mantenedor (opcional)
LABEL maintainer="rbsoft07@gmail.com"

# Eliminamos el contenido predeterminado del directorio webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiamos el archivo .war a la carpeta webapps de Tomcat
COPY /target/Project-jsf-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/appweb.war

# Script de inicio que usa la variable PORT de Render
COPY run.sh /usr/local/bin/run.sh
RUN chmod +x /usr/local/bin/run.sh

# Comando de ejecución
CMD ["sh", "/usr/local/bin/run.sh"]