package com.arp.springthymeleaf.category.service;

import com.arp.springthymeleaf.category.model.CategoryRequest;
import com.arp.springthymeleaf.category.model.CategoryResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final List<CategoryResponse> categories;

    public CategoryServiceImpl() {
        categories = new ArrayList<>();
    }

    @Override
    public List<CategoryResponse> getAllCategories() {
        return categories;
    }

    @Override
    public CategoryResponse getCategoryById(Long id) {
        CategoryResponse categoryResponse = categories.stream().filter(category -> category.getId().equals(id)).findFirst().orElse(null);
        return categoryResponse;
    }

    @Override
    public CategoryResponse addCategory(CategoryRequest categoryRequest) {

        long maxId = categories.stream()
                .mapToLong(CategoryResponse::getId)
                .max()
                .orElse(0);
        long newId = maxId + 1;

        CategoryResponse response = new CategoryResponse();
        BeanUtils.copyProperties(categoryRequest, response);
        response.setId(newId);
        categories.add(response);
        return response;
    }
}
