package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    public PriceComparator(){

    }

    public int compare(Item one, Item two) {

        return Double.compare(one.getPrice(), two.getPrice());
    }
}
