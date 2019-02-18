package com.sss.repository;

import com.sss.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 2017-05-07 14:35
 * @author sss
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     *
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
