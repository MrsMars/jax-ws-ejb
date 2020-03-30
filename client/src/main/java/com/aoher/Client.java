package com.aoher;

import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.Service;

public class Client {

    public static void main(String[] args) {
        String endPointAddress  = "http://localhost:8080/jaxws-ejb-endpoint/EJB3Bean";
        QName serviceName = new QName("http://jsr181pojo.samples.jaxws.ws.quickstarts.jboss.org/", "EJB3BeanService");
        try {
            URL wsdlURL = new URL(endPointAddress + "?wsdl");
            Service service = Service.create(wsdlURL, serviceName);
            EJB3RemoteInterface proxy = service.getPort(EJB3RemoteInterface.class);
            System.out.println(proxy.echo("ejbClient calling"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
