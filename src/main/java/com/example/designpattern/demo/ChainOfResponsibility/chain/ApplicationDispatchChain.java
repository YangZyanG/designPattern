package com.example.designpattern.demo.ChainOfResponsibility.chain;

import com.example.designpattern.demo.ChainOfResponsibility.DispatchChain;
import com.example.designpattern.demo.ChainOfResponsibility.DispatchHandler;

import java.util.Map;

/**
 * @author yangziyang
 * @since 2020-05-08
 */
public class ApplicationDispatchChain implements DispatchChain {

    private Map<String, DispatchHandler> handlers;

    public Map<String, DispatchHandler> getHandlers() {
        return handlers;
    }

    public void setHandlers(Map<String, DispatchHandler> handlers) {
        this.handlers = handlers;
    }

    @Override
    public void dispatch(Long orderId) {

    }
}
