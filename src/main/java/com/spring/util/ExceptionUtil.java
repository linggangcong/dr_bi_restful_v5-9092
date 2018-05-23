package com.spring.util;

import com.spring.config.Constant;
import com.spring.exception.DataNotExistException;

public class ExceptionUtil {
    public static void dataNotExistException (String msg){
        throw new DataNotExistException(Constant.RESCODE_EXCEPTION,msg);
    }
}
