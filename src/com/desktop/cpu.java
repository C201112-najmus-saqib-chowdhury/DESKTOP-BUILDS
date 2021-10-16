package com.desktop;

public class cpu {
    public int ram ;
    public String processor ;
    public String GPU;
    public int vram ;

    //INIITIALIING THROUGH A METHOD
    public void initialize(int Ram, String Processor, String gpu, int VRAM)
    {
        ram = Ram ;
        processor = Processor ;
        GPU = gpu ;
        vram = VRAM ;
    }
    public void specs()
    {
        System.out.println("RAM installed : " + ram) ;
        System.out.println("Processor : " + processor) ;
        System.out.println("GPU model : " + GPU) ;
        System.out.println("Video memory : " +vram);
    }


}
