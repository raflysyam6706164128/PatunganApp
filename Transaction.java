package org.d3ifcool.patungan;


/* Transaction custom class */

public class Transaction {

    // declare Transaction Class Atribut
    private String transaksi;
    private int biaya, img;

    // custom constructor for Transaction Class
    public Transaction(String transaksi, int biaya, int img) {
        this.transaksi = transaksi;
        this.biaya = biaya;
        this.img = img;
    }

    // method for get transaction type
    public String getTransaksi() {
        return transaksi;
    }

    // method for get transaction price
    public int getBiaya() {
        return biaya;
    }

    // method for get transaction images
    public int getImg() {
        return img;
    }
}