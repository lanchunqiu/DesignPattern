package com.lancq.structure_pattern.bridge;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/8
 **/
public class BridgeDemo {
    public static void main(String[] args) {

        ScanBuyService scanBuyService = new ScanBuyService() {
            @Override
            public void buy() {
                System.out.println("JD 扫码购物");
            }
        };
        // ScanService.scanBuy() -> ScanBuyService.buy();
        // 对应客户端而言，只关注粗粒度接口，具体执行方法是有运行时初始化而定。
        ScanService scanService = new ScanServiceImpl(scanBuyService,null);
        scanService.scanBuy();

        scanService = new ScanServiceImpl(new ScanBuyService() {
            @Override
            public void buy() {
                System.out.println("TB 扫码购物");
            }
        }, null);

        // ScanService.scanBuy() -> ScanBuyService.buy();
        scanService.scanBuy();


    }

    /**
     * 抽象化角色
     */
    interface ScanService{

        void scanBuy();

        void scanLogin();
    }

    /**
     * 扩展抽象化角色
     */
    interface ScanBuyService{
        void buy();
    }
    /**
     * 扩展抽象化角色
     */
    interface ScanLoginService{
        void login();
    }

    static class ScanServiceImpl implements ScanService{
        private ScanBuyService scanBuyService;

        private ScanLoginService scanLoginService;

        ScanServiceImpl(ScanBuyService scanBuyService, ScanLoginService scanLoginService) {
            this.scanBuyService = scanBuyService;
            this.scanLoginService = scanLoginService;
        }

        @Override
        public void scanBuy() {
            scanBuyService.buy();
        }

        @Override
        public void scanLogin() {
            scanLoginService.login();
        }

    }
}
