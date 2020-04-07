package com.company.landonhotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuoteRequestController {

    @GetMapping("/newquote")
    public String beginQuoteRequest(Model model) {
        // add implementation later

        return "newQuote";
    }

    @PostMapping
    public String submitQuoteRequest() {

        // add implementation later

        return "newQuoteConfirmation";
    }

}
