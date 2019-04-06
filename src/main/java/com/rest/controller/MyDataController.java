package com.rest.controller;

import com.rest.model.MyData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/test/MyData")
public class MyDataController {


    @RequestMapping(value="/{time}", method = RequestMethod.GET)
    public @ResponseBody MyData getMyData(@PathVariable long time) {
        return new MyData(time, "REST GET Call !!!");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody MyData putMyData(@RequestBody MyData md) {
        return md;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody MyData postMyData() {
        return new MyData(System.currentTimeMillis(), "REST POST Call !!!");
    }

    @RequestMapping(value="/{time}", method = RequestMethod.DELETE)
    public @ResponseBody MyData deleteMyData(@PathVariable long time) {
        return new MyData(time, "REST DELETE Call !!!");
    }


}
