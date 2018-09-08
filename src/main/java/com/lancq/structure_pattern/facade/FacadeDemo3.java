package com.lancq.structure_pattern.facade;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/8
 **/
public class FacadeDemo3 {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }

    private static class CPU{
        public void freeze(){
            System.out.println("CPU: freeze");
        }

        public void jump(long position){
            System.out.println("CPU: jump location "+ position);
        }

        public void execute(){
            System.out.println("CPU: execute");
        }
    }

    private static class HardDirve{
        public byte[] read(long lba, int size){
            return new byte[size];
        }
    }

    private static class Memory{
        public void load(long position, byte[] data){
        }
    }

    private static class ComputerFacade{
        private CPU processor = new CPU();
        private Memory ram = new Memory();
        private HardDirve hd = new HardDirve();

        long BOOT_ADDRESS = 1;
        long BOOT_SECTOR = 2;
        int SECTOR_SIZE = 100;
        public void start(){
            processor.freeze();
            ram.load(BOOT_ADDRESS,hd.read(BOOT_SECTOR,SECTOR_SIZE));
            processor.jump(BOOT_ADDRESS);
            processor.execute();
        }
    }
}
