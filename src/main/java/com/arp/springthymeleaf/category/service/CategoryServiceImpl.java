package com.arp.springthymeleaf.category.service;

import com.arp.springthymeleaf.category.model.CategoryRequest;
import com.arp.springthymeleaf.category.model.CategoryResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private List<CategoryResponse> categories;

    public CategoryServiceImpl() {
        categories = new ArrayList<>();
    }

    @Override
    public List<CategoryResponse> getAllCategories() {
        List<CategoryResponse> responses = new ArrayList<>();
        responses.add(new CategoryResponse(1L, "Makanan", "Ini Makanan"));
        responses.add(new CategoryResponse(2L, "Minuman", "Ini Minuman"));
        responses.add(new CategoryResponse(3L, "Elektronik", "Ini Elektronik"));
        responses.add(new CategoryResponse(4L, "Fashion", "Ini Fashion"));
        return responses;
    }

    @Override
    public CategoryResponse getCategoryById(Long id) {
        return null;
    }

    @Override
    public CategoryResponse addCategory(CategoryRequest categoryRequest) {
        return null;
    }
}
