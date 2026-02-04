class Smartphone {

    private String brand;
    private String model;
    private int storageCapacity;


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }


    public void increaseStorage(int extraStorage) {
        storageCapacity = storageCapacity + extraStorage;
    }
}


public class smartPhone {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();


        phone.setBrand("Oppo");
        phone.setModel("OPPO78 5G");
        phone.setStorageCapacity(128);


        phone.increaseStorage(64);


        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage Capacity: "
                + phone.getStorageCapacity() + " GB");
    }
}
