package app.models;

import app.base.BaseModel;

public class OrderAModel implements BaseModel {

    @Override
    public double getOrderCost(int quota,  double price) {

        return quota * price;
    }
}
