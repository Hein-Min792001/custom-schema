package com.example.customschema.controller;

import com.example.customschema.ds.Event;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
public class EventController {
    @QueryMapping
    public List<Event> events(){
        return List.of(
                new Event(1,
                        "Java One",
                        LocalDate.now(),
                        LocalDate.now().plusDays(3),
                        "https://www.facebook.com"),

                new Event(2,
                        "Python",
                        LocalDate.now(),
                        LocalDate.now().plusDays(3),
                        "https://www.google.com")
        );
    }
}
