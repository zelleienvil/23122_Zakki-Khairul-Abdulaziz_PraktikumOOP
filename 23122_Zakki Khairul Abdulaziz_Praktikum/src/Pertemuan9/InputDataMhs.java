/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

import java.util.ArrayList;
/**
 *
 * @author kurohana
 */
public class InputDataMhs {
    ArrayList<Mahasiswa> listmahasiswa;
    
    public InputDataMhs(){
        listmahasiswa = new ArrayList();
    }
    
    public void insertData(String nim, String nama, String alamat, String mataKuliah, double nilaiAkhir){
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, mataKuliah, nilaiAkhir);
        listmahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa> getAll(){
        return listmahasiswa;
    }
    
    public void deleteData(int index){
        listmahasiswa.remove(index);
    }
}
