package com.bushansirgur.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {

    @RequestMapping(value = "/Products-page")
    public String showProductsPage() {

        return "Products-page";
    }

}
