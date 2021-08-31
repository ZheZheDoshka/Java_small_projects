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

    @Test
    void ModelLessMoreCheck(){
        int checkModel = 0;
        int checkedNum = model.getSearchedNumber();
        int checkModel_Lower = model.higher_lower(checkedNum-2);
        int checkModel_Higher = model.higher_lower(checkedNum+2);
        checkModel = model.higher_lower(checkedNum);
        Assert.assertEquals(1, checkModel_Lower);
        Assert.assertEquals(0, checkModel_Higher);
        Assert.assertEquals(2, checkModel);
        Assert.assertEquals(checkedNum-2, model.getMinValue());
        Assert.assertEquals(checkedNum+2, model.getMaxValue());
    }
}
