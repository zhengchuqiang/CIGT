package com.cigt.dto;

import lombok.Data;

import java.util.List;

/**
 * 购物车实体类
 */
@Data
public class ShoppingDto {
    private int id;
    private int goods_id;
    private int user_id;
    private int number;
    private String user_address;
    private int status;
    private String created_at; //创建时间
    private String updated_at; //修改时间
    private GoodsDto goodsDtos;
}
