package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeMoneyController {
    @GetMapping("/")
    public String displayHome() {
        return "index";
    }

    @PostMapping("/")
    public String exchangeMoney(@RequestParam String rate, @RequestParam String money, Model model) {
        double USD = Double.parseDouble(money);
        double RATE = Double.parseDouble(rate);
        double VND = USD * RATE;
        model.addAttribute("vnd", VND);
        return "index";
    }

}
