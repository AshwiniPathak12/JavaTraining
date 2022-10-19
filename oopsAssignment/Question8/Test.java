package Question8;

public class Test {
public static void main(String[]agrs) {
	Electronic mobile=new Mobile("a", "Integrated Circuit", "1990");
	mobile.ElectronicDisplay();
	
	Electronic lcd=new LCD("2", "Cristal Display", "2018");
	lcd.ElectronicDisplay();

    Electronic laptop=new Laptop("3", "PCB", "1960");
    laptop.ElectronicDisplay();

}
}
