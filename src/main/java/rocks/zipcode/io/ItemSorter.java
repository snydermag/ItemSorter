package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    private Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        List<Item> list = new ArrayList<>(Arrays.asList(items));
        list.sort(comparator);

        Item[] sorted = new Item[items.length];

        for (int i = 0; i < items.length; i++){
            sorted[i] = list.get(i);
        }
        return sorted;

    }
}
