package main.java.market;

import main.java.Price;

import java.util.List;

public class Market<T> {

    private List<T> goods;

    public Market(List<T> goods){
        this.goods = goods;
    }

    public T getGoodsByIndex(int index){
        return goods.get(index);
    }

//    public int getPriceByIndex(int index){
//        return goods.get(index).price();
//    }
}
