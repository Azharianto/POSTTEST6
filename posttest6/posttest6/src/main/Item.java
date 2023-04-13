package main;
public abstract class Item implements interfaceItem{

    private static String name;
    private int price;

    public Item(String name, int price) {
        Item.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        Item.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (Rp " + price; 

    }
    abstract void DataPenjualanProduk(String nama);
    
    abstract void DataPenjualanProduk(int harga);
    final void Notif(){
        System.out.println("-----------------------------------------");
        System.out.println("    Tipe Transaksi Berhasil Ditambahkan  ");
        System.out.println("-----------------------------------------");
    }   
}

    