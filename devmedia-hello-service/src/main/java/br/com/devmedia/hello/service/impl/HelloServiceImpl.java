package br.com.devmedia.hello.service.impl;

import br.com.devmedia.hello.service.HelloService;

public class HelloServiceImpl implements HelloService {
    
    @Override
    public String sayHello() {
        System.out.println("Executando o metodo sayHello()");
        return "Say Hello";
    }
}