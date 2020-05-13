package controllers;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ConvertMoneyController {
    @GetMapping("/convert-money")
    public String getConvertPage(){
        return "convert";
    }
    @PostMapping("/convert-post")
    public String processConvert(@RequestParam(name = "rate") float rate, @RequestParam(name ="usd")float usd, Model model){
        String result = String.valueOf(rate * usd);
        model.addAttribute("result", result);
        return "convert";
    }
}
