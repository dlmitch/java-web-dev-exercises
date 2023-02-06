package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping
@ResponseBody
public class HelloController {


//    @GetMapping("")
//    public String hello() {
//        return "Hello, Spring";
//    }
    //   /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring";
//    }
////       /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value= "hello")
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }
//    //   /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
    //    /hello/form
//    @GetMapping("form")
//    public String helloForm(){
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" + //submit request to /hello
//                "<input type='text' name='coder'>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//     }



    @ResponseBody
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='' method='get'>" + //submit request to /hello
                "<label>Name:  <input type='text' name='name'></label>" +
                "<label>Language:  <input type='text' name='language'></label>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @ResponseBody
    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
    return createMessage(name, language);
    }

    public static String createMessage(String n, String l){
        String greeting="";
        if (l.equals("english")){

            greeting="Hello";
        } else if(l.equals("german")){

            greeting="Hallo";
        } else if(l.equals("spanish")){

            greeting="Hola";
        } else if(l.equals("french")){

            greeting="Bonjour";
        } else if(l.equals("italian")){

            greeting="Ciao";
        }
        return greeting + " " + n;
    }


}
