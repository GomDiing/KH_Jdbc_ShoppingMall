package com.kh;

import com.kh.dao.OrdersDetailDAO;
import com.kh.dao.ProductsDAO;
import com.kh.vo.OrdersDetailVO;
import com.kh.vo.ProductsVO;

import java.util.List;

public class JavaMain {
    public static void main(String[] args) {
        menuSelect();
    }

    public static void menuSelect() {
        // PRODUCTS 테이블의 모든 데이터 조회
        ProductsDAO productsDao = new ProductsDAO();
        List<ProductsVO> listProducts = productsDao.selectAllProducts();
        productsDao.printProducts(listProducts);

        // ORDERS_DETAIL 테이블의 모든 데이터 조회
        OrdersDetailDAO ordersDetailDAO = new OrdersDetailDAO();
        List<OrdersDetailVO> listOrdersDetail = ordersDetailDAO.selectAllOrdersDetail();
        ordersDetailDAO.printOrdersDetail(listOrdersDetail);
    }
}
