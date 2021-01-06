package com.gildedrose.items;
import com.gildedrose.core.GildedRose;
import com.gildedrose.core.Item;
public class switchItem extends Item{

    public switchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

    }

    @Override
    public String toString() {
        return "switchItem{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }
}
