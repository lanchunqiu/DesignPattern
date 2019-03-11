package com.lancq.structure_pattern.bridge.demo;

/**
 * 具体实现化角色（Implementor）
 */
public class ScanBuyService implements ScanService{
    @Override
    public void scan() {
        System.out.println("扫描购物");
    }
}
