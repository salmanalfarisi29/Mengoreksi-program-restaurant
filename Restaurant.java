/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktekmingguke5;

/**
 *
 * @author Salman Alfarisi
 */
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public void tampilMenuMakanan() {
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock(int id) {
        if(stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void nextId() {
        id++;
    }
    
    public int getStok(byte id) {
        return stok[id];
    }
    
    public void setStok(int stok, byte id) {
        this.stok[id] -= stok;
    }
    
    //untuk mendapatkan id dari makanan yang dicari dengan cara membandingkan nama makanan di setiap isi menu makanan
    public byte cariId(String nama) {
        for(byte i=0; i<this.nama_makanan.length; i++) {
            if(nama.compareTo(this.nama_makanan[i]) ==0) {
                return i;
            }
        }
        return -1;
    };
    
    //mencari id makanan yang dipesan dan melakukan pengurangan stok
    public void pesanMakanan(String nama, int jml) {
        byte idCari = cariId(nama);
        if(getStok(idCari) >= jml) {
            setStok(jml, idCari);
        }else {
            if(getStok(idCari) > 0) {
                System.out.println("Stok " + nama_makanan[idCari] + " tidak cukup");
            } else {
                System.out.println("Stok " + nama_makanan[idCari] + " Kosong");
            }
            
        }
    }
}
