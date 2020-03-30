package com.aoher;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Stateless
@Remote(EJB3RemoteInterface.class)
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class EJB3BEAN implements EJB3RemoteInterface {

    @WebMethod
    public String echo(String input) {
        return "EJB3Bean returning: " + input;
    }
}
