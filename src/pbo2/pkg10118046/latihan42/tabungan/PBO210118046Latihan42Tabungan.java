/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program :
 */
public class PBO210118046Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Program Penarikan Uang====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Saldo Awal: ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil: "); int tarik = scanner.nextInt();
        System.out.println("Saldo Anda Sekarang: " + tabungan.ambilUang(tarik));
    }

}
