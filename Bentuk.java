package bentuk;
import java.util.Scanner;

public class Bentuk {
    public double hitungLuas() {
        return 0;
        
    }
    
    public double hitungKeliling() {
        return 0;
    }

    
public static void main(String[] args) {
    PersegiPanjang pp = new PersegiPanjang();
    pp.hitungLuas();
    pp.hitungKeliling();
    
    Lingkaran li = new Lingkaran();
    li.hitungLuas();
    li.hitungKeliling();
    
    Segitiga st = new Segitiga();
    st.hitungLuas();
    st.hitungKeliling();
    }
    
}
    class PersegiPanjang extends Bentuk {
        int Panjang;
        int Lebar;
        double Luas;
        double Keliling;
        Scanner input = new Scanner (System.in);
        
        @Override
        public double hitungLuas(){
            
            System.out.println("---------- Hitung Luas Persegi Panjang ---------- \n");
            System.out.println("Masukkan Panjang : ");
            Panjang = input.nextInt();
            System.out.println("Masukkan Lebar : ");
            Lebar = input.nextInt();
            Luas = (Panjang * Lebar);
            System.out.println("Luas Persegi Panjang adalah = "+Luas);
            return 0;
        }
        
        @Override
        public double hitungKeliling(){
            System.out.println("\n ---------- Hitung Keliling Persegi Panjang ---------- \n");
            System.out.println("Masukkan Panjang : ");
            Panjang = input.nextInt();
            System.out.println("Masukkan Lebar : ");
            Lebar = input.nextInt();
            Keliling = (2*Panjang + 2*Lebar);
            System.out.println("Keliling Persegi Panjang adalah = "+Keliling);
            return 0;            
        }
        
            
    }
    class Lingkaran extends Bentuk {
        int jari;
        double Luas;
        double Keliling;
        Scanner input = new Scanner (System.in);
        
        @Override
        public double hitungLuas(){
            
            System.out.println("---------- Hitung Luas Lingkaran ---------- \n");
            System.out.println("Masukkan Jari - Jari : ");
            jari = input.nextInt();
            Luas = (3.14 * jari*jari);
            System.out.println("Luas Lingkaran adalah = "+Luas);
            return 0;
        }
        
        @Override
        public double hitungKeliling(){
            System.out.println("\n ---------- Hitung Keliling Lingkaran ---------- \n");
            System.out.println("Masukkan Jari - Jari : ");
            jari = input.nextInt();
            Keliling = (2 * jari * 3.14);
            System.out.println("Keliling Lingkaran adalah = "+Keliling);
            return 0;            
        }          
    }        
    class Segitiga extends Bentuk {
        int Tinggi;
        int Alas;
        double sisi;
        double Luas;
        double Keliling;
        Scanner input = new Scanner (System.in);
        
        @Override
        public double hitungLuas(){
            
            System.out.println("---------- Hitung Luas Segitiga ---------- \n");
            System.out.println("Masukkan Alas : ");
            Alas = input.nextInt();
            System.out.println("Masukkan Tinggi : ");
            Tinggi = input.nextInt();
            Luas = (0.5 * Alas * Tinggi);
            System.out.println("Luas Persegi Panjang adalah = "+Luas);
            return 0;
        }
        
        @Override
        public double hitungKeliling(){
            System.out.println("\n ---------- Hitung Keliling Segitiga ---------- \n");
            System.out.println("Masukkan Alas : ");
            Alas = input.nextInt();
            System.out.println("Masukkan Tinggi : ");
            Tinggi = input.nextInt();
            sisi = ((0.25 * Alas * Alas) + Tinggi*Tinggi);
            sisi = Math.sqrt(sisi);
            Keliling = (sisi + sisi + Alas);
            System.out.println("Keliling Persegi Panjang adalah = "+Keliling);
            return 0;            
        }        
        }
