package ru.onec.megaws;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: bormotun
 * Date: 05.12.12
 * Time: 10:13
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "ru.onec.megaws.HelloWorld",
        targetNamespace = "http://megaws.onec.ru")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public MegaObject sayHi() {
        return new MegaObject();
    }
}
