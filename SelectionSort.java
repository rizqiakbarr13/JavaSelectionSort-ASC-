package selectionsort;
import java.util.Scanner;

/**
 *
 * @author ROG
 */

public class SelectionSort {

    public static void main(String[] args) 
    {
        //Buat Objek Scanner
        Scanner scan = new Scanner(System.in);
         
        //Input jumlah Data
        System.out.print("Masukkan Jumlah Data : ");    
        int jmlhdata = scan.nextInt();
         
        //Input nilai tiap Data
        int[] data = new int[jmlhdata]; //Array untuk nilai setiap Data
        System.out.println();
        for(int x = 0; x < jmlhdata; x++)
        {
            System.out.print("Input nilai Data ke-"+(x+1)+" : ");
            data[x] = scan.nextInt();
        }
         
        //Tampilkan Data Sebelum di sorting
        System.out.println();
        System.out.print("\nData Sebelum di Sorting : ");
        for(int x = 0; x < jmlhdata; x++)
            System.out.print(data[x]+" ");
         
        //Proses Selection Sort
        System.out.println("\nProses Selection Sort");
        for(int x = 0; x < jmlhdata-1; x++)
        {
            System.out.println("Iterasi ke-"+(x+1)+" : ");
            for(int y = 0; y < jmlhdata; y++)
                System.out.print(data[y]+" ");
             
            System.out.println("   Apakah Data "+data[x]+" sudah benar pada urutannya?");
             
            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "   Tidak Ada Pertukaran";
            for(int y = x+1; y < jmlhdata; y++)
            {
                if(min > data[y])
                {
                    tukar = true;
                    index = y;
                    min = data[y];
                     
                }
            }
             
            if(tukar == true)
            {
                //    Pertukaran Data
                pesan = "   Data "+data[x]+" ditukar dengan Data "+data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }
             
            for(int y = 0; y < jmlhdata; y++)
                System.out.print(data[y]+" ");
             
            System.out.println(pesan+"\n");
        }
         
        //Tampilkan Data Setelah di Sorting
        System.out.print("Data Setelah di sorting : ");
        for(int x = 0; x < jmlhdata; x++)
            System.out.print(data[x]+" ");
    }
}
