package com.smart.wen.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//组建不传名字的话，默认类名小写
@Component
@Data
public class Product {
    @Value("哈哈")
    private String name;
    @Value("99")
    private BigDecimal price;
}
