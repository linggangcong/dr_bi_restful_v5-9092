package com.spring.util;

import com.spring.config.Constant;

public class ResponseUtil {
	/**
	 * 请求返回数据处理
	 * @param res
	 * @return
	 */
/*	public static CommonResponse general(CommonResponse res){
		return new CommonResponse(JSON.toJSONString(res), HttpStatus.OK);
	}*/

		/**
		 * 成功请求
		 * @param data
		 * @return
		 */
	public static CommonResponse success(Object data){
		CommonResponse res = new CommonResponse();
		res.setCode(Constant.RESCODE_SUCCESS);
		res.setData(data);
		return res;
	}
	
	public static CommonResponse success(){
		CommonResponse res = new CommonResponse();
		res.setCode(Constant.RESCODE_SUCCESS);
		return res;
	}


	public static CommonResponse success(String msg){
		CommonResponse res = new CommonResponse();
		res.setCode(Constant.RESCODE_SUCCESS_MSG);
		res.setMsg(msg);
		return res;
	}

	public static CommonResponse success(String msg ,Object object){
		CommonResponse res = new CommonResponse();
		res.setCode(Constant.RESCODE_SUCCESS_MSG);
		res.setMsg(msg);
		res.setData(object);
		return res;
	}


	
	/**
	 * 请求抛出异常
	 * @param msg
	 * @return
	 */
	public static CommonResponse exception(String msg){
		CommonResponse res = new CommonResponse();
		res.setCode(Constant.RESCODE_EXCEPTION);
		res.setMsg(msg);
		return res;
		
	}
	
	public static CommonResponse unKonwException(){
		CommonResponse res = new CommonResponse();
		res.setCode(Constant.RESCODE_EXCEPTION);
		res.setMsg("请稍后再试");
		return res;
	}
	
	/**
	 * 自定义
	 * @param code
	 * @param msg
	 * @return
	 */
	public static CommonResponse custom(Integer code, String msg){
		CommonResponse res = new CommonResponse();
		res.setCode(code);
		res.setMsg(msg);
		return res;
	}

}
