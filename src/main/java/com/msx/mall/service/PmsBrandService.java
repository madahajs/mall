package com.msx.mall.service;

import com.msx.mall.model.PmsBrand;

import java.util.List;

/**
 * @Author: masixin
 * @Description:
 * @Date: Created in 15:23 2020/1/10
 * @Modified By:
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
