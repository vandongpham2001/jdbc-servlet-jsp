package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface ICategoryService {
	List<CategoryModel> findAll();
	CategoryModel save(CategoryModel categoryModel);
	CategoryModel update(CategoryModel updateCategory);
	void delete(long[] ids);
	List<CategoryModel> findAll(Pageble pageble);
	List<CategoryModel> findAllNoPageble();
	int getTotalItem();
	CategoryModel findOne(long id);
}
