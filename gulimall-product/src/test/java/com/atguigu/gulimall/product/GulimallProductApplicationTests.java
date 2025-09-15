package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void t1(){
        BrandEntity brand = new BrandEntity();
        brand.setName("安踏");
        brand.setDescript("ANTA品牌");
        brandService.save(brand);
        List<BrandEntity> brands = brandService.list();
        brands.forEach(System.out::println);
        brandService.remove(null);
    }
}
