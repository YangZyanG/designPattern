package com.example.designpattern.demo.ChainOfResponsibility;

/**
 * @author yangziyang
 * @since 2020-05-08
 */
public interface DispatchHandler {

    void doHandle(Long orderId);
}
