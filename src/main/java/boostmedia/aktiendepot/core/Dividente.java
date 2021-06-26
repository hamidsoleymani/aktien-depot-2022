package boostmedia.aktiendepot.core;

import java.time.LocalDate;

public final class Dividente {
    private Aktie aktie;
    private float dividente;
    private LocalDate dividentenTag;

    public Dividente(Aktie aktie, float dividente, LocalDate dividentenTag) {
        this.aktie = aktie;
        this.dividente = dividente;
        this.dividentenTag = dividentenTag;
    }
}
