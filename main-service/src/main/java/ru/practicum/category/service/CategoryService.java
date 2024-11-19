package ru.practicum.category.service;

import ru.practicum.category.model.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);

    void deleteCategory(long categoryId);

    List<Category> getCategoriesWithPagination(int from, int size);

    Category getCategoryById(long categoryId);
}
