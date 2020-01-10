package com.msx.mall.common.api;

/**
 * @Author: masixin
 * @Description: 封装API的错误码
 * @Date: Created in 15:26 2020/1/10
 * @Modified By:
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
