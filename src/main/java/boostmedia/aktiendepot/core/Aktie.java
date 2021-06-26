package boostmedia.aktiendepot.core;

import java.util.List;

public class Aktie {
    private String id;
    private String name;
    private String wkn;
    private List<Order> orderList;
    private List<Dividente> dividentenList;

    Aktie(String id, String name, String wkn) {
        this.id = id;
        this.name = name;
        this.wkn = wkn;
    }
}
