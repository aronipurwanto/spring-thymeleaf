package com.arp.springthymeleaf.category.service;

import com.arp.springthymeleaf.category.model.CategoryRequest;
import com.arp.springthymeleaf.category.model.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> getAllCategories();
    CategoryResponse getCategoryById(Long id);
    CategoryResponse addCategory(CategoryRequest categoryRequest);
}
