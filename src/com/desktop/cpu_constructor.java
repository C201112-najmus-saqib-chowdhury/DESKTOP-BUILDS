package com.desktop;

public class cpu_constructor {
    public int ram ;
    public String processor ;
    public String GPU;
    public int vram ;
        /* eta ekta constructor */
    cpu_constructor(int ram, String processor, String GPU, int vram)
    {
        this.ram =  ram ;
        this.processor = processor ;
        this.GPU = GPU ;
        this.vram = vram ;
    }
    public void showspecs()
    {
        System.out.println("RAM installed : " + ram) ;
        System.out.println("Processor : " + processor) ;
        System.out.println("GPU model : " + GPU) ;
        System.out.println("Video memory : " +vram);
    }
}
