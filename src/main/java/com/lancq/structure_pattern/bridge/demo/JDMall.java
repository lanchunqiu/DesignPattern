package com.lancq.structure_pattern.bridge.demo;

/**
 * 京东商城，扩展抽象化角色（RefinedAbstraction）
 */
public class JDMall extends Mall {

    @Override
    public void buy() {

        System.out.println("JD");
        loginService.scan();
        buyService.scan();
    }
}
