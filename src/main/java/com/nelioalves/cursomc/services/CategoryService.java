package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.domain.Category;
import com.nelioalves.cursomc.repositories.CategoryRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category find(Integer id){
        Optional<Category> cat = categoryRepository.findById(id);
        return cat.orElseThrow(() -> new ObjectNotFoundException("Objetct not found!" + "ID: " + id + " Type: " + Category.class.getName()));
    }
}
