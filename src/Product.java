public class Product {
    private String name;
    private float price;
    private int stock;

    public Product(String nameP, float priceP, int stockP) {
        this.name=nameP;
        this.price=priceP;
        this.stock=stockP;
    }

    public Product(String nameP, float priceP) {
        this.name=nameP;
        this.price=priceP;
        this.stock=0;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setName(String nameP) {
        if(nameP.isEmpty()) {
            System.out.println("You cannot enter a null value.");
        } else {
            this.name = nameP;
        }
    }

    public void setPrice(float priceP) {
        if(priceP<=0) {
            System.out.println("You cannot enter a negative value.");
        } else {
            this.price = priceP;
        }
    }

    public void setStock(int stockP) {
        if(stockP<=0) {
            System.out.println("You cannot enter a negative value.");
        } else {
            this.stock = stockP;
        }
    }

    public void addStock(int q) {
        if (q<=0) {
            System.out.println("You cannot enter a null value.");
        } else {
            this.stock+=q;
        }
    }

    public void reduceStock(int quant) {
        if (quant<=0 || quant>this.stock) {
            System.out.println("You cannot enter a null value or reduce more stock than you have.");
        } else {
            this.stock-=quant;
        }
    }
}
