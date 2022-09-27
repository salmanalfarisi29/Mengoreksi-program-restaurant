/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktekmingguke5;

/**
 *
 * @author Salman Alfarisi
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    
    static void tambahMenu(Restaurant menu){
        System.out.println("========== MENU ==========");
        menu.tambahMenuMakanan("Bala2", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        Restaurant.nextId();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Restaurant menu = new Restaurant();
        tambahMenu(menu);
        
        menu.tampilMenuMakanan();
        menu.pesanMakanan("Molen", (byte) 5);
        System.out.println("SISA STOK");
        menu.tampilMenuMakanan();
        System.out.println("==========================");
    }
    
}
