package com.lanpang.client;

import com.lanpang.common.DecreaseStockInput;
import com.lanpang.common.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @program: order
 * @description: feign要调用的接口
 * @author: yanghao
 * @create: 2018-09-12 10:31
 **/
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/msg")
    String productMsg();

    @GetMapping("/getFProductMsg")
    String getFProductMsg();

    @PostMapping("/product/findByProductIdIn")
    List<ProductInfoOutput> findByProductIdIn(@RequestBody List<String> productIdList);

    @GetMapping("product/decreaseStock")
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputs);

    @GetMapping("product/increaseStock")
    void increaseStock(List<DecreaseStockInput> decreaseStockInputs);
}
