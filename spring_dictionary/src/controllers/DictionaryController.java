package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.Translate;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String getDictionaryPage() {
        return "index";
    }

    @Autowired
    Translate translate;
    @PostMapping("/translate")
    public String translate(@RequestParam(name = "eng") String eng, Model model) {
        String result = translate.englishToVietnamese(eng);
        model.addAttribute("eng", eng);
        model.addAttribute("result", result);
        return "index";
    }
}
