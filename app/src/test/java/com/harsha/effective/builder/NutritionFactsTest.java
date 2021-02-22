package com.harsha.effective.builder;

import org.junit.Test;

public class NutritionFactsTest {

    @Test
    public void testBuilder(){
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(23, 43).calories(32).build();
        assert nutritionFacts != null;
    }
}
