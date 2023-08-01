package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {

    private String expectedName;
    private Long expectedId;
    private Double expectedPrice;
    public Item() {
        expectedName = "";
        expectedId = 0L;
        expectedPrice = 0.01;
    }

    public Item(Long id, String name, Double price) {
        expectedName = name;
        expectedId = id;
        expectedPrice = price;
    }

    public String getName() {
        return expectedName;
    }

    public void setName(String name) {
        expectedName = name;
    }

    public Long getId() {
        return expectedId;
    }

    public void setId(Long id) {
        expectedId = id;
    }

    public Double getPrice() {
        return expectedPrice;
    }

    public void setPrice(Double price) {
        expectedPrice = price;
    }
}
