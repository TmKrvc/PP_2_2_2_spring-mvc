package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServicelmp;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarServicelmp carService = new CarServicelmp();


    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("model", carService.showCar(count));
        return "cars";
    }


}
