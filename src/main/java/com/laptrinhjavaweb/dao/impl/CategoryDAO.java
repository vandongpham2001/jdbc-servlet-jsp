package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.paging.Pageble;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryModel findOne(long id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), id);
		return category.isEmpty() ? null : category.get(0);
	}

    @Override
    public CategoryModel findOneByCode(String code) {
		System.out.print("code: "+code); 
//		code = "the-thao";
		String sql = "SELECT * FROM category WHERE code = ?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), code);
		System.out.print("Xin chao: ");
		System.out.println(category);
		CategoryModel result = category.isEmpty() ? null : category.get(0);
		return result;
    }

	@Override
	public Long save(CategoryModel categoryModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO category (name, code,");
		sql.append(" createddate, createdby)");
		sql.append(" VALUES(?, ?, ?, ?)");
		return insert(sql.toString(), categoryModel.getName(), categoryModel.getCode(), 
				categoryModel.getCreatedDate(), categoryModel.getCreatedBy());
	}

	@Override
	public void update(CategoryModel updateCategory) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("UPDATE category SET name = ?, code = ? where id = ?");
//		StringBuilder sql = new StringBuilder("UPDATE category SET name = ?, code = ?,");
//		sql.append(" createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
		System.out.println("DAO:"+ updateCategory.getName());
		System.out.println("DAO:"+ updateCategory.getCode());
		System.out.println("DAO query:" + sql.toString());
//		update(sql.toString(), updateCategory.getName(), updateCategory.getCode(), updateCategory.getCreatedDate(), 
//				updateCategory.getCreatedBy(), updateCategory.getModifiedDate(), 
//				updateCategory.getModifiedBy(), updateCategory.getId());
		update(sql.toString(), updateCategory.getName(), updateCategory.getCode(), updateCategory.getId());
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM category WHERE id = ?";
		update(sql, id);
	}

	@Override
	public List<CategoryModel> findAll(Pageble pageble) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("SELECT * FROM category");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
		}
//		System.out.print("DAO query:" + sql.toString());
//		System.out.print("DAO:" + query(sql.toString(), new CategoryMapper()));
		return query(sql.toString(), new CategoryMapper());
	}

	@Override
	public List<CategoryModel> findAllNoPageble() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		String sql = "SELECT count(*) FROM category";
		return count(sql);
	}

}
