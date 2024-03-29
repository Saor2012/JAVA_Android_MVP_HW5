package com.example.androidcalculator.base.model;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
public class Convertor implements IFactory {
    private static Convertor instance;
    private static int result;
    private static int bits = 0;
    private static int sizeHighBit = 0;
    private static int sizeLowBit = 0;
    private static void setResult(int results) { result = results; }
    private IFactory.CallBack listener;
    private Pair<String,String,String,String> pair ;
    public Convertor(IFactory.CallBack listener, Pair<String,String,String,String> pair) {
        this.listener = listener;
        this.pair = pair;
        Init();
    }
    /*public Convertor() {}
    public static synchronized Convertor getInstance() {
        if (instance == null)
            instance = new Convertor();
        return instance;
    }*/
    /*public static void main(String []args) {
        //int c = 1231545656/8/1024/1024;
        //System.out.println(c);
        Init();
    }*/
    public String convert() {
        int results = -1;
        switch(pair.getOper()) {
            case "8": setBits(Integer.valueOf(pair.getVal1()));
                System.out.println("Bits = " + (results = getBits()));
                break;
            case "b": setBytes(Integer.valueOf(pair.getVal1()));
                System.out.println("Bytes = " + (results = getBytes()));
                //System.out.println("Bits = " + (result = getBytes()));
                break;
            case "k": setKiloBytes(Integer.valueOf(pair.getVal1()));
                System.out.println("Kilobytes = " + (results = getKiloBytes()));
                //System.out.println("Bits = " + (result = getKiloBytes()));
                break;
            case "m": setMegaBytes(Integer.valueOf(pair.getVal1()));
                System.out.println("Megabytes = " + (results = getMegaBytes()));
                //System.out.println("Bits = " + (result = getMegaBytes()));
                break;
            case "g": setGigaBytes(Integer.valueOf(pair.getVal1()));
                System.out.println("Gigabytes = " + (results = getGigaBytes()));
                //System.out.println("Bits = " + (result = getGigaBytes()));
                break;
            default:
                System.out.println("Invalid function.");
        }
        setResult(results);
        return Integer.toString(results);
    }
    public static int conventer(int foo, int number) {
        int results = -1;
        switch(foo) {
            case 1: setBits(number);
                System.out.println("Bits = " + (results = getBits()));
                break;
            case 2: setBytes(number);
                System.out.println("Bytes = " + (results = getBytes()));
                //System.out.println("Bits = " + (result = getBytes()));
                break;
            case 3: setKiloBytes(number);
                System.out.println("Kilobytes = " + (results = getKiloBytes()));
                //System.out.println("Bits = " + (result = getKiloBytes()));
                break;
            case 4: setMegaBytes(number);
                System.out.println("Megabytes = " + (results = getMegaBytes()));
                //System.out.println("Bits = " + (result = getMegaBytes()));
                break;
            case 5: setGigaBytes(number);
                System.out.println("Gigabytes = " + (results = getGigaBytes()));
                //System.out.println("Bits = " + (result = getGigaBytes()));
                break;
            default:
                System.out.println("Invalid function.");
        }
        setResult(results);
        return results;
    }
    public void Init()  {
        try {
            /*BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            int a, k = 0;
            boolean state = false;
            String text = "";
            System.out.println("//(Handle integer number)");
            System.out.println("Conventor digital numbers");
            System.out.print("Enter number a: ");
            a = Integer.valueOf(text = br.readLine());
            System.out.println("Your first number = " + a);
            System.out.print("Enter the convetror function (from bits: 8 - to bits,\n b - to bytes, k - to kilobytes, m - to megabytes,\n g - to gigabytes): ");
            do {
                    text = br.readLine();
                    //if ((text != "/" || text != "*" || text != "+" || text != "-")) {
                    //    System.out.println("Invalid function, enter a function.");
                    //}
                    state = (text.equals("8") || text.equals("b") || text.equals("k") || text.equals("m") || text.equals("g"));
                    //System.out.println(text.equals("/"));
                    //System.out.println(text.equals("*"));
                    //System.out.println(text.equals("-"));
                    //System.out.println(text.equals("+"));
                    //System.out.println(state);
                    if (!state) {
                        System.out.println("Invalid function.");
                        System.out.print("Enter the convetror function (8, b, k, m, g): ");
                    } else {
                        if (text.equals("8")) k = 1;
                        else if (text.equals("b")) k = 2;
                        else if (text.equals("k")) k = 3;
                        else if (text.equals("m")) k = 4;
                        else if (text.equals("g")) k = 5;
                        else k = 0;
                    }
            } while (!state);
            System.out.println("Your convetror function \"" + text + "\"");
            //System.out.println(k);

            //System.out.println("Number a = " + a + ", number b = " + b);
            System.out.println("Output number = " + conventer(k, a));
            //while(!(text = br.readLine()).equals("ESC")) {}*/
            listener.message(convert());
        } catch(Exception e) {
            System.out.println("Error " + e);
        }
    }
    // bits != 0 ? bits : size != 0 ? size : bits
    public static int getBits() {
        return sizeHighBit == 0 ? bits : sizeHighBit;
        //return sizeLowBit == 0 ? bits : sizeLowBit;
    }
    public static int getBytes() {
        //return sizeHighBit == 0 ? bits / 8 : sizeHighBit;
        return sizeLowBit == 0 ? bits / 8 : sizeLowBit;
    }
    public static int getKiloBytes() {
        //return sizeHighBit == 0 ? bits / 8 / 1024 : sizeHighBit;
        return sizeLowBit == 0 ? bits / 8 / 1024 : sizeLowBit;
    }
    public static int getMegaBytes() {
        //return sizeHighBit == 0 ? bits / 8 / 1024 / 1024 : sizeHighBit;
        return sizeLowBit == 0 ? bits / 8 / 1024 / 1024 : sizeLowBit;
    }
    public static int getGigaBytes() {
        //return sizeHighBit == 0 ? bits / 8 / 1024 / 1024 / 1024 : sizeHighBit;
        return sizeLowBit == 0 ? bits / 8 / 1024 / 1024 / 1024 : sizeLowBit;
    }
    public static void setBits(int bit) {
        bits = bit;
        //System.out.println(bit + " " + bits);
    }
    public static void setBytes(int bit) {
        sizeHighBit = bit * 8;
        sizeLowBit = bit / 8;
        //System.out.println(bit + " " + sizeLowBit);
    }
    public static void setKiloBytes(int bit) {
        sizeHighBit = bit * 8 * 1024;
        sizeLowBit = bit / 8 / 1024;
        //System.out.println(bit + " " + sizeLowBit);
    }
    public static void setMegaBytes(int bit) {
        sizeHighBit = bit * 8 * 1024 * 1024;
        sizeLowBit = bit / 8 / 1024 / 1024;
        //System.out.println(bit + " " + sizeLowBit);
    }
    public static void setGigaBytes(int bit) {
        sizeHighBit = bit * 8 * 1024 * 1024 * 1024;
        sizeLowBit = bit / 8 / 1024 / 1024 / 1024;
        //System.out.println(bit + " " + sizeLowBit);
    }
    public static int getResult() {
        return result;
    }


}


