package com.storage.warehouse.compositionItemsQuantities;

import com.storage.warehouse.composition.Composition;
import com.storage.warehouse.item.Item;

import javax.persistence.*;

@Entity
@Table(name = "composition_item_quantity")
@IdClass(CompositionItemsId.class)
public class CompositionItems {

    /*
    *  validar valores de qtds    *
    * */

    @Id
    @ManyToOne
    @JoinColumn(name = "composition_id", referencedColumnName = "id")
    private Composition composition;

    @Id
    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;

    @Column(name = "quantity")
    private Integer quantity;

    public CompositionItems() {
    }

    public CompositionItems(Composition composition, Item item, Integer quantity) {
        this.composition = composition;
        this.item = item;
        this.quantity = quantity;
    }

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



}
