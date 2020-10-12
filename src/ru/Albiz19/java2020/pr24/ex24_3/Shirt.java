package ru.Albiz19.java2020.pr24.ex24_3;

public class Shirt {
    public static void main(String[] args){
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (String shirt : shirts) {
            Shirt shirt1 = new Shirt(shirt);
            System.out.println(shirt1.toString());
        }
    }
    private String serialNumber, name, color, size;

    Shirt(String array){
        try {
            String[] tmp = array.split(",");
            serialNumber = tmp[0];
            name = tmp[1];
            color = tmp[2];
            size = tmp[3];
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    @Override
    public String toString() {
        return "Shirt{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }


}
