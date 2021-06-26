package boostmedia.aktiendepot.core;

import java.time.LocalDateTime;

public final class Order {
    private Aktie aktie;
    private String orderId;
    private OrderArt orderArt;
    private LocalDateTime orderDate;
    private int orderAnzahl;
    private float orderPreis;
    private String orderMarktPlatz;


    public Order(String orderId, Aktie aktie, OrderArt orderArt, LocalDateTime orderDate, int orderAnzahl, float orderPreis, String orderMarktPlatz) {
        this.orderId = orderId;
        this.aktie = aktie;
        this.orderArt = orderArt;
        this.orderDate = orderDate;
        this.orderAnzahl = orderAnzahl;
        this.orderPreis = orderPreis;
        this.orderMarktPlatz = orderMarktPlatz;
    }

}
