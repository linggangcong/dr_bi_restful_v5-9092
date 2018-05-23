package com.spring.controller;

import com.spring.model.Feature_category_rel;
import com.spring.service.Feature_category_relService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/feature_category_rel")
//加上这个注解，使得支持事务
@Transactional
public class Feature_category_relController {
    Feature_category_rel feature_category_rel;
    @Autowired
    private Feature_category_relService feature_category_relService;


    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addFeature_category_rel(Feature_category_rel feature_category_rel){
       
        int num=feature_category_relService.add(feature_category_rel);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateFeature_category_rel( Feature_category_rel feature_category_rel){
        int num=feature_category_relService.add(feature_category_rel);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteFeature_category_rel(String featureTypeDesc){
        int num=feature_category_relService.deleteByName(featureTypeDesc);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName( String categoryCode){
        List<Feature_category_rel> listPcf=feature_category_relService.findByName(categoryCode);
        return ResponseUtil.success(listPcf);
    }
    @GetMapping(value="/find_featuretype_by_category")
    @ResponseBody
    public CommonResponse findFeaturetypeName( String categoryCode){
        List<String> list=feature_category_relService.findFeaturetypeName(categoryCode);
        return ResponseUtil.success(list);
    }
    @GetMapping(value="/find_feature_name")
    @ResponseBody
    public CommonResponse findFeatureName(String categoryCode ,String featuretypeCode){
        List<String> list=feature_category_relService.findFeatureByCategory(categoryCode ,featuretypeCode);
        return ResponseUtil.success(list);
    }


}


