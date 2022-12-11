package lesson6;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        laptop firstLaptop = new laptop(0, "Gaming Laptop");
        laptop secondLaptop = new laptop(1, "Work Laptop");
        laptop thirdLaptop = new laptop(2, "Gaming Laptop");
        laptop fourthLaptop = new laptop(3, "Work Laptop");
        laptop fifthLaptop = new laptop(4, "Work Laptop");
        laptop[] laptops = new laptop[]{firstLaptop, secondLaptop, thirdLaptop, fourthLaptop, fifthLaptop};
        menu(laptops);
    }
    public static void menu(laptop[] laptops){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Hello, select an option: 1 - Print Laptops list, 2 - Filter Laptops, 3 - Exit: ");
            char entered = scanner.next().charAt(0);
            switch(entered){
                case '1': {
                    for(laptop i : laptops){
                        i.info();
                    }
                    break;
                }
                case '2': {
                    filterLaptops(laptops);
                    break;
                }
                case '3': {
                    flag = false;
                    System.out.println("Goodbye!");
                    break;
                }
                default: {
                    System.out.println("Incorrect input!");
                    break;
                }
            }
        }
    }
    public static void filterLaptops(laptop[] laptops){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String[] settings = new String[8];
        for(int i = 0; i < settings.length; i++){
            settings[i] = "none";
        }
        settings[3] = "2";
        settings[5] = "256";
        settings[7] = "9999999999999";
        while(flag){
            System.out.println("Filter Settings:\n"+
            "1 - Manufacturer\n"+
            "2 - OS\n"+
            "3 - Processor\n"+
            "4 - RAM\n"+
            "5 - GPU\n"+
            "6 - Disk Size\n"+
            "7 - Color\n"+
            "8 - Price\n"+
            "9 - Print filtered\n");
            char entered = scanner.next().charAt(0);
            switch(entered){
                case '1':{
                    System.out.println("Manufacturer options: 1 - Lenovo, 2 - HP, 3 - Asus, 4 - Acer, 5 - MSI, 0 - Any: ");
                    char option = scanner.next().charAt(0);
                    switch(option){
                    case '1': settings[0] = "Lenovo"; break;
                    case '2': settings[0] = "HP"; break;
                    case '3': settings[0] = "Asus"; break;
                    case '4': settings[0] = "Acer"; break;
                    case '5': settings[0] = "MSI"; break;
                    case '0': settings[0] = "none"; break;
                    default: System.out.println("Incorrect input!"); break;
                    }
                }
                case '2':{
                    System.out.println("OS options: 1 - Windows 10, 2 - Windows 11, 3 - Ubuntu, 4 - Mint, 5 - CentOS, 6 - Steam OS, 0 - Any: ");
                    char option = scanner.next().charAt(0);
                    switch(option){
                        case '1': settings[1] = "Windows 10"; break;
                        case '2': settings[1] = "Windows 11"; break;
                        case '3': settings[1] = "Ubuntu"; break;
                        case '4': settings[1] = "Mint"; break;
                        case '5': settings[1] = "CentOS"; break;
                        case '6': settings[1] = "Steam OS"; break;
                        case '0': settings[1] = "none"; break;
                        default: System.out.println("Incorrect input!"); break;
                    }
                }
                case '3':{
                    System.out.println("Processor options: 1 - Intel, 2 - AMD, 0 - Any: ");
                    char option = scanner.next().charAt(0);
                    switch(option){
                        case '1': settings[2] = "Intel"; break;
                        case '2': settings[2] = "AMD"; break;
                        case '0': settings[2] = "none"; break;
                        default: System.out.println("Incorrect input!"); break;
                    }
                }
                case '4':{
                    System.out.println("Minimal RAM options: 1 - 2GB, 2 - 4GB, 3 - 8GB, 4 - 16GB, 5 - 24GB, 6 - 32GB 0 - Any: ");
                    char option = scanner.next().charAt(0);
                    switch(option){
                        case '1': settings[3] = "2"; break;
                        case '2': settings[3] = "4"; break;
                        case '3': settings[3] = "8"; break;
                        case '4': settings[3] = "16"; break;
                        case '5': settings[3] = "24"; break;
                        case '6': settings[3] = "32"; break;
                        case '0': settings[3] = "0"; break;
                        default: System.out.println("Incorrect input!"); break;
                    }
                }
                case '5':{
                    System.out.println("GPU options: 1 - Nvidia, 2 - AMD, 3 - Intel, 4 - Apple, 0 - Any: ");
                    char option = scanner.next().charAt(0);
                    switch(option){
                        case '1': settings[4] = "Nvidia"; break;
                        case '2': settings[4] = "AMD"; break;
                        case '3': settings[4] = "Intel"; break;
                        case '4': settings[4] = "Apple"; break;
                        case '0': settings[4] = "none"; break;
                        default: System.out.println("Incorrect input!"); break;
                    }
                }
                case '6':{
                    System.out.println("Minimal Disk Size options: 1 - 256GB, 2 - 512GB, 3 - 1024GB, 4 - 2048GB, 0 - Any: ");
                    char option = scanner.next().charAt(0);
                    switch(option){
                        case '1': settings[5] = "256"; break;
                        case '2': settings[5] = "512"; break;
                        case '3': settings[5] = "1024"; break;
                        case '4': settings[5] = "2048"; break;
                        case '0': settings[5] = "0"; break;
                        default: System.out.println("Incorrect input!"); break;
                    }
                }
                case '7':{
                    System.out.println("Color options: 1 - Black, 2 - White, 3 - Blue, 4 - Red, 0 - Any: ");
                    char option = scanner.next().charAt(0);
                    switch(option){
                        case '1': settings[6] = "Black"; break;
                        case '2': settings[6] = "White"; break;
                        case '3': settings[6] = "Blue"; break;
                        case '4': settings[6] = "Red"; break;
                        case '0': settings[6] = "none"; break;
                        default: System.out.println("Incorrect input!"); break;
                    }
                }
                case '8':{
                    System.out.println("Enter max price: ");
                    String option = scanner.next();
                    try {
                        Integer.parseInt(option);
                        settings[7] = option;
                        break;
                    } catch (Exception e) {
                    }
                }
                case '9':{
                    Boolean found = false;
                    for(laptop objecLaptop : laptops){
                        if(objecLaptop.manufacturer.contains(settings[0]) || settings[0].contains("none")){
                            if(objecLaptop.OS.contains(settings[1]) || settings[1].contains("none")){
                                if(objecLaptop.processor.contains(settings[2]) || settings[2].contains("none")){
                                    if(objecLaptop.RAM >= Integer.parseInt(settings[3])){
                                        if(objecLaptop.GPU.contains(settings[4]) || settings[4].contains("none")){
                                            if(objecLaptop.DiskSize >= Integer.parseInt(settings[5])){
                                                if(objecLaptop.color.contains(settings[6]) || settings[6].contains("none")){
                                                    if(objecLaptop.price < Long.parseLong(settings[7])){
                                                        objecLaptop.info();
                                                        found = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(found == false){
                        System.out.println("No laptops found by your filters!");
                    }
                    flag = false;
                    break;
                }
                default: System.out.println("Incorrect input!"); break;
            }
        } 
    }
}
