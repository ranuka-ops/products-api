// A PhysicalProduct IS-A Product because it represents a specific tangible item sold in the store that shares common product traits like id, name, and price.
// A ShoppingCart would NOT pass this test because a cart HAS-A list of products rather than being a product itself.

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){
        super();
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
