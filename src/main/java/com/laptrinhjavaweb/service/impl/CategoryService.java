package com.laptrinhjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public CategoryModel save(CategoryModel categoryModel) {
		categoryModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		Long categoryId = categoryDao.save(categoryModel);
		return categoryDao.findOne(categoryId);
	}

	@Override
	public CategoryModel update(CategoryModel updateCategory) {
		CategoryModel oldCategory = categoryDao.findOne(updateCategory.getId());
		updateCategory.setCreatedDate(oldCategory.getCreatedDate());
		updateCategory.setCreatedBy(oldCategory.getCreatedBy());
//		updateCategory.setModifiedBy(oldCategory.getModifiedBy());
		updateCategory.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		System.out.println("Service:"+ updateCategory.getName());
		System.out.println("Service:"+ updateCategory.getCode());
		categoryDao.update(updateCategory);
		return categoryDao.findOne(updateCategory.getId());
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		for (long id: ids) {
			//1.delete comment (khoa ngoai new_id)
			//2.delete news
			categoryDao.delete(id);
		}
		
	}

	@Override
	public List<CategoryModel> findAll(Pageble pageble) {
		// TODO Auto-generated method stub
		System.out.print("Service:" + categoryDao.findAll(pageble));
		return categoryDao.findAll(pageble);
	}

	@Override
	public List<CategoryModel> findAllNoPageble() {
		// TODO Auto-generated method stub
		return categoryDao.findAllNoPageble();
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return categoryDao.getTotalItem();
	}

	@Override
	public CategoryModel findOne(long id) {
		// TODO Auto-generated method stub
		CategoryModel categoryModel = categoryDao.findOne(id);
        return categoryModel;
	}
}
