package market;

import animals.Animal;

import java.util.List;

public class Market<T extends Animal> {

    private List<T> goods;

    public Market(List<T> goods) {
        this.goods = goods;
    }

    public T getGoodsByIndex(int index) {
        return goods.get(index);
    }

    public int getPriceByIndex(int index){
        return goods.get(index).price();
    }
}
