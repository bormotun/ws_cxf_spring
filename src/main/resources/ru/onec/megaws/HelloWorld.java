package ru.onec.megaws;


import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(targetNamespace = "http://megaws.onec.ru")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)

public interface HelloWorld {
    @WebMethod(operationName = "sayHi")
    public  @WebResult(name = "megaObject",targetNamespace = "http://megaws.onec.ru")

    MegaObject sayHi();
}