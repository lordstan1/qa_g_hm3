package hw.n3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class N3 {

    @Test
    void N3(){
        Assertions.assertFalse(3 < 2);
    }

    @Test
    void N3_2(){
        Assertions.assertFalse(3 < 1);
    }
}
