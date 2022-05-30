package com.laptrinhjavaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.utils.HttpUtil;
import com.laptrinhjavaweb.utils.SessionUtil;

@WebServlet(urlPatterns = {"/api-admin-category"})
public class CategoryAPI extends HttpServlet {
	
	@Inject
	private ICategoryService categoryService;

	private static final long serialVersionUID = -915988021506484384L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		CategoryModel categoryModel =  HttpUtil.of(request.getReader()).toModel(CategoryModel.class);
		categoryModel.setCreatedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		categoryModel = categoryService.save(categoryModel);
		mapper.writeValue(response.getOutputStream(), categoryModel);
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		CategoryModel updateCategory =  HttpUtil.of(request.getReader()).toModel(CategoryModel.class);
//		updateCategory.setModifiedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		System.out.println("\ndoPut:"+ updateCategory.getName());
		System.out.println("doPut:"+ updateCategory.getCode());
		updateCategory = categoryService.update(updateCategory);
		mapper.writeValue(response.getOutputStream(), updateCategory);
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		CategoryModel categoryModel =  HttpUtil.of(request.getReader()).toModel(CategoryModel.class);
		categoryService.delete(categoryModel.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}
}
