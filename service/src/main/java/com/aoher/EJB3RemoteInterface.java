package com.aoher;

import javax.jws.WebService;

@WebService
public interface EJB3RemoteInterface {
    String echo(String input);
}
