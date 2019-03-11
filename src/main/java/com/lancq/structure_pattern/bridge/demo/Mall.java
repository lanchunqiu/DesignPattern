package com.lancq.structure_pattern.bridge.demo;

/**
 * 商城：抽象化角色（Abstraction）
 */
public abstract class Mall {
    protected ScanService loginService;
    protected ScanService buyService;

    public void setScanService(ScanService loginService, ScanService buyService){
        this.loginService = loginService;
        this.buyService = buyService;
    }

    public abstract void buy();
}
