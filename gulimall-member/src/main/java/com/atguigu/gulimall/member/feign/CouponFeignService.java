package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author zyy
 * @version v1.0.0
 * @date 2025/9/16 02:36
 * @description
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /**
     * 调用该方法时候会先去注册中心里找到gulimall-coupon的服务，然
     * 后调用对应request mapping url 的接口.方法名不需要对应，参数列表一致即可
     *
     * @return
     */
    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();

    @RequestMapping("/coupon/coupon/list")
    R lists(@RequestParam Map<String, Object> params);


}
