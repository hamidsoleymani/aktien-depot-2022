package boostmedia.aktiendepot.core;





import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AktieTest {

    @Test
    public void neueAktieTest(){
        Aktie infineon = new Aktie("1", "Infineon",  "wkn");
        Order infineonOrder = new Order("1", infineon,OrderArt.KAUF, LocalDateTime.now(),1000,
                17.76f,"Frankfurt");
        Dividente dividente = new Dividente(infineon,0.87f, LocalDate.now());
    }

}
