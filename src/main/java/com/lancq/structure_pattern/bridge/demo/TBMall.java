package com.lancq.structure_pattern.bridge.demo;

/**
 * 淘宝商城，扩展抽象化角色（RefinedAbstraction）
 */
public class TBMall extends Mall{
    @Override
    public void buy() {
        System.out.println("TB");
        loginService.scan();
        buyService.scan();
    }
}
