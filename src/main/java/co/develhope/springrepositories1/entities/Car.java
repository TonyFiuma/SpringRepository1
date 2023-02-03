package co.develhope.springrepositories1.entities;


import javax.persistence.*;

@Entity
@Table
public class Car{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "car_id", nullable = false)
    private Long car_id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private long serialNumber;
    @Column(nullable = false)
    private double currentPrice;

    public Car(){
    }

    public Car(Long car_id,String modelName,long serialNumber,double currentPrice){
        this.car_id = car_id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public Long getCar_id(){
        return car_id;
    }

    public void setCar_id(Long car_id){
        this.car_id = car_id;
    }

    public String getModelName(){
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public long getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber){
        this.serialNumber = serialNumber;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
}