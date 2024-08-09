package com.firstLec.FirstLec;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// The Component is used to convert a class into a bean
//@Component
// We can also use the @Service here as it is like component but with extra features
//@Service
// We can also use the @Repository here as it is like services but with extra features
//@Repository

@Component
public class Apple {

    void eatApple(){
        System.out.println("I'm eating the apple");
    }


//    Bean LifeCycle Hooks
//      1. PreConstruct
//      2. PostConstruct
//    Even if we were to create 2 objects these hooks will only run once

//  Post Construct will run the function before object creation
    @PostConstruct
    void callBeforeEatingApple(){
        System.out.println("I'm going to eat the apple");
    }

//    It will run this function before destroying the constructor(Beans will get automatically deleted as soon as we stop the program)
    @PreDestroy
    void callThisAfterEatingApple(){
        System.out.println("I've eaten the apple");
    }
}
