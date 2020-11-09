package com.eh.cxf;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public Book sayHello(Integer id) {
        System.out.println("@PathParam get id:" + id);
        Book book = new Book(100L, "水浒传", 25.5);
        return book;
    }
}
