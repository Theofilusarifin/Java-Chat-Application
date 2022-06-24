
package com.ezbooking.method;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LoginService", targetNamespace = "http://method.ezbooking.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoginService {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkLogin", targetNamespace = "http://method.ezbooking.com/", className = "com.ezbooking.method.CheckLogin")
    @ResponseWrapper(localName = "checkLoginResponse", targetNamespace = "http://method.ezbooking.com/", className = "com.ezbooking.method.CheckLoginResponse")
    @Action(input = "http://method.ezbooking.com/LoginService/checkLoginRequest", output = "http://method.ezbooking.com/LoginService/checkLoginResponse")
    public String checkLogin(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
