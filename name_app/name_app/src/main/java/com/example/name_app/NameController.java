package com.example.name_app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/names")
public class NameController {
    @GetMapping(path = "/name")
    public String name(
            @RequestParam(value = "name", required = true) String name) {
        return "Ciao " + name + "!";
    }

    @PostMapping("/reversed")
    public String reverse(
            @RequestParam String name) {
        {
            StringBuilder revName = new StringBuilder(name);
            return revName.reverse().toString();
        }
    }
}
