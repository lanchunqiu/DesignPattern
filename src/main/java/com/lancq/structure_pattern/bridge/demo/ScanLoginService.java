package com.lancq.structure_pattern.bridge.demo;
/**
 * 具体实现化角色（Implementor）
 */
public class ScanLoginService implements ScanService {
    @Override
    public void scan() {
        System.out.println("扫码登录");
    }
}
