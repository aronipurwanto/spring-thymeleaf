package com.arp.springthymeleaf.category.controller;

import com.arp.springthymeleaf.category.model.CategoryResponse;
import com.arp.springthymeleaf.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("category/index");
        // langkah 1
        /*
        List<CategoryResponse> responses = new ArrayList<>();
        responses.add(new CategoryResponse(1L, "Makanan", "Ini Makanan"));
        responses.add(new CategoryResponse(2L, "Minuman", "Ini Minuman"));
        responses.add(new CategoryResponse(3L, "Elektronik", "Ini Elektronik"));
        responses.add(new CategoryResponse(4L, "Fashion", "Ini Fashion"));
         */

        // langkah 2
        List<CategoryResponse> categories = service.getAllCategories();
        // ngirim data ke view
        view.addObject("data", categories);
        return view;
    }

    public ModelAndView addCategory() {
        ModelAndView view = new ModelAndView("category/addCategory");
        return view;
    }

    public ModelAndView editCategory() {
        ModelAndView view = new ModelAndView("category/editCategory");
        return view;
    }
}
