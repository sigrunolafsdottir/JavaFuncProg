package Inlämningsuppgift2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TomtelandTest {

    Tomteland tl = new Tomteland();

    List<String> uTomten = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader",
            "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen");
    List<String> uGlader = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten");
    List<String> uButter = Arrays.asList("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran",
            "Bladlusen");
    List<String> uTrötter = Arrays.asList("Dammråttan", "Skumtomten");
    List<String> uSkumtomten = Arrays.asList("Dammråttan");
    List<String> uRäven = Arrays.asList("Gråsuggan", "Myran", "Bladlusen");
    List<String> uMyran = Arrays.asList("Bladlusen");


    @Test
    final void getUnderlingsMyranTest(){
        List<String> list = new ArrayList<>();
        List<String> underlings = tl.getUnderlings("Myran", list);
        assertEquals(underlings.size(), uMyran.size());
        assertFalse(underlings.retainAll(uMyran));
    }

    @Test
    final void getUnderlingsRävenTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = tl.getUnderlings("Räven", list);
        assertEquals(underlings.size(), uRäven.size());
        assertFalse(underlings.retainAll(uRäven));
    }

    @Test
    final void getUnderlingsSkumtomtenTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = tl.getUnderlings("Skumtomten", list);
        assertEquals(underlings.size(), uSkumtomten.size());
        assertFalse(underlings.retainAll(uSkumtomten));
    }

    @Test
    final void getUnderlingsTrötterTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = tl.getUnderlings("Trötter", list);
        assertEquals(underlings.size(), uTrötter.size());
        assertFalse(underlings.retainAll(uTrötter));
    }


    @Test
    final void getUnderlingsButterTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = tl.getUnderlings("Butter", list);
        assertEquals(underlings.size(), uButter.size());
        assertFalse(underlings.retainAll(uButter));
    }

    @Test
    final void getUnderlingsGladerTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = tl.getUnderlings("Glader", list);
        assertEquals(underlings.size(), uGlader.size());
        assertFalse(underlings.retainAll(uGlader));
    }

    @Test
    final void getUnderlingsTomtenTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = tl.getUnderlings("Tomten", list);
        assertEquals(underlings.size(), uTomten.size());
        assertFalse(underlings.retainAll(uTomten));
    }

}
