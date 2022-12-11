package lesson6;

import java.util.Random;

public class laptop {
    int LaptopID;
    int RAM;
    int DiskSize;
    String processor;
    String GPU;
    String LaptopName;
    int price;
    String color;
    String manufacturer;
    String OS;
    int[] diskOptions = new int[]{256, 512, 1024, 2048};
    String[] processors = new String[]{"Intel Core i5-12600H", "AMD Ryzen 9 5900HS", "Intel Core i7-1280P", "Intel Core i7-10700K", "AMD Ryzen 7 6800HS", "Intel Core i5-12500H"+
    "Intel Core i7-12700H", "Intel Core i9-12900H"};
    int[] RAMoptions = new int[]{2, 4, 8, 16, 24, 32};
    String[] GPUlist = new String[]{"Nvidia Geforce GTX 1050 Ti", "Nvidia Geforce GTX 1060", "Nvidia Geforce GTX 1650", "Nvidia Geforce RTX 2060 Mobile", "Nvidia Geforce RTX 2070 Mobile" +
    "Nvidia Geforce RTX 2080 Mobile", "Nvidia Geforce RTX 3060 Mobile", "Nvidia Geforce RTX 3070 Ti Laptop", "Nvidia Geforce RTX 3080 Ti Laptop", "AMD Radeon Pro 5600M" + 
    "AMD Radeon RX 5600M", "AMD Radeon RX 6600S", "Apple M1 Pro 16-Core GPU", "Intel Arc A730M", "AMD Radeon RX 6800S", "AMD Radeon RX 6850M XT"};
    String[] colors = new String[]{"Black", "White", "Blue", "Red"};
    String[] manufacturers = new String[]{"Lenovo", "HP", "Asus", "Acer", "MSI"};
    String[] OSlist = new String[]{"Windows 10", "Windows 11", "Ubuntu", "Mint", "CentOS", "Steam OS"};

    laptop(int argID, String argName){
        Random random = new Random();
        LaptopID = argID;
        LaptopName = argName;
        price = random.nextInt(30000, 110000);
        DiskSize = diskOptions[random.nextInt(diskOptions.length)];
        processor = processors[random.nextInt(processors.length)];
        RAM = RAMoptions[random.nextInt(RAMoptions.length)];
        GPU = GPUlist[random.nextInt(GPUlist.length)];
        color = colors[random.nextInt(colors.length)];
        manufacturer = manufacturers[random.nextInt(manufacturers.length)];
        OS = OSlist[random.nextInt(OSlist.length)];
    }

    public void info(){
        System.out.println("==================#######====================");
        System.out.printf("Laptop name: %s\n",LaptopName);
        System.out.printf("Manufacturer: %s\n",manufacturer);
        System.out.printf("Operating System: %s\n",OS);
        System.out.printf("Processor: %s\n",processor);
        System.out.printf("RAM: %dGB\n",RAM);
        System.out.printf("Graphics Card: %s\n",GPU);
        System.out.printf("Disk Size: %dGB\n",DiskSize);
        System.out.printf("Color: %s\n",color);
        System.out.printf("Price: %sRUB\n",price);
        System.out.println("=============================================");
    }
}
