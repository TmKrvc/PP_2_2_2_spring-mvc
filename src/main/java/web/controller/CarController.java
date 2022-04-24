package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService = new CarService();


    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("model", carService.showCar(count));
        return "cars";
    }


}
