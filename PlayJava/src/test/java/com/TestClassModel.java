package com;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class TestClassModel {
    private static Model model;
    private static int maxRange = 102;
    private static int minRange = 1;
    @Before()
    static void createModel(){
        model = new Model();
    }

    @Test
    void getModelRange() {
        model.setRange(minRange, maxRange);
            Assert.assertEquals(minRange, model.getMinValue());
            Assert.assertEquals(maxRange, model.getMaxValue());
        }

    @Test
    void ModelRandInitialise(){
        int randomNum;
        for (int i = 0; i < 1000; i++) {
            model.randInitialise();
            randomNum = model.getSearchedNumber();
            boolean in_range = ((randomNum>minRange)&&(randomNum<maxRange));
            Assert.assertTrue(in_range);
        }

    }
}
