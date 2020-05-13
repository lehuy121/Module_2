package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.Convert;

@Controller
public class ConvertMoneyProcessController {
    @Autowired
    Convert  convert;
    @GetMapping("/convert-get")
    public String processConvert(@RequestParam(name = "rate") double rate, @RequestParam(name ="usd")double usd, Model model){
        String result = String.valueOf(convert.usdToVnd(rate,usd));
        model.addAttribute("result", result);
        return "convert";
    }
}
