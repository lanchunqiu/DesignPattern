package com.lancq.structure_pattern.bridge.demo;

public class Client {
    public static void main(String[] args) {
        ScanService loginService = new ScanLoginService();
        ScanService buyService = new ScanBuyService();

        Mall mall = new JDMall();
        mall.setScanService(loginService, buyService);
        mall.buy();

        mall = new TBMall();
        mall.setScanService(loginService, buyService);
        mall.buy();
    }

}
