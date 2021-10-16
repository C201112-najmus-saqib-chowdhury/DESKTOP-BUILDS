package com.desktop;

public class Main {

    public static void main(String[] args) {
	cpu  ultrahighend ;
	ultrahighend = new cpu() ;
	ultrahighend.ram = 16 ;
	ultrahighend.vram = 16 ;
	ultrahighend.GPU = "Nvidia RTX 3090" ;
	ultrahighend.processor = "AMD Ryzen 5 5600" ;
	ultrahighend.specs();

		/* INITIALIZING USING A METHOD */
	System.out.println("THIS IS A DIFFERENT METHOD") ;
	cpu highend;
	highend = new cpu() ;
	highend.initialize(8, "AMD Ryzen 5 3300" ,"Nvidia GTX 1060" ,8) ;
	highend.specs();
		/* INITIALIZING USING A CONTRUCTOR */
	System.out.println("THE FOLLOWING IS A MID HIGH END BUILD");
	cpu_constructor midhighend ;
	midhighend = new cpu_constructor(8, "Ryzen 3 3300X", "AMD RX 560", 8);
	midhighend.showspecs() ;




    }

}
