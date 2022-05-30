package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
	CategoryModel findOneByCode(String code);
	Long save(CategoryModel categoryModel);
	void update(CategoryModel updateCategory);
	void delete(long id);
	List<CategoryModel> findAll(Pageble pageble);
	List<CategoryModel> findAllNoPageble();
	int getTotalItem();
}
