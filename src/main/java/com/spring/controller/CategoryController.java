package com.spring.controller;

import com.spring.model.Category;
import com.spring.service.CategoryService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/category")
@Transactional
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
   

    @RequestMapping(value="/add")
    @ResponseBody
    public CommonResponse addCategory(@RequestParam("code") String code, @RequestParam("desc")String desc){
        Category category=new Category();
        category.setCode(code);
        category.setDesc(desc);
       int num= categoryService.addCategory(category);
        return ResponseUtil.success(num);
    }

    @RequestMapping(value="/update")
    @ResponseBody
    public CommonResponse updateCategory(@RequestParam("code") String code, @RequestParam("desc")String desc){

        Category category =new Category();
        category.setCode(code);
        category.setDesc(desc);
        int num= categoryService.update(category);
        return ResponseUtil.success(num);
    }

    @RequestMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteCategory( @Param("code")String code){
        int num=categoryService.deleteByName(code);
        return ResponseUtil.success(num);
    }

    @RequestMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName( String desc){

        return ResponseUtil.success(categoryService.findByName(desc));
    }

    @RequestMapping(value="/find_by_indistinctName")
    @ResponseBody
    public CommonResponse findByinDistinctName( String desc){

        return ResponseUtil.success(categoryService.findByIndistinctName(desc));
    }

    @RequestMapping(value="/categoryOfClient")
    @ResponseBody
    public CommonResponse categoryOfClient( String clientName){

        return ResponseUtil.success(categoryService.categoryOfClient(clientName));
    }
    @RequestMapping(value="/all")
    @ResponseBody
    public CommonResponse allCategory(){

        return ResponseUtil.success(categoryService.all());
    }

    @RequestMapping(value="/category_by_client")
    @ResponseBody
    public CommonResponse categoryByClient(String clientId){
        List<Category> list=categoryService.findCategoryByClient(clientId);
        return ResponseUtil.success(list);
    }

}
