package authenticate.dhya.demo.demo.services.impl;

import authenticate.dhya.demo.demo.services.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String test) {
        return "Dhya test";
    }
}
