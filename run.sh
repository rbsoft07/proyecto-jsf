#!/bin/bash
# run.sh

# Render asigna dinámicamente el puerto mediante la variable PORT
# Tomcat espera que se configure en server.xml, pero podemos sobrescribir el valor por defecto desde aquí
sed -i.bak "s/8080/${PORT}/g" /usr/local/tomcat/conf/server.xml

# Iniciar Tomcat en primer plano
catalina.sh run