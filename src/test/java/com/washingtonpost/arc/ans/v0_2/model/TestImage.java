package com.washingtonpost.arc.ans.v0_2.model;

import org.junit.Test;

/**
 * <p>Tests that JSON we expect to be a valid "Image" data file serializes correctly and validates
 * against the JSON schema</p>
 */
public class TestImage extends AbstractTest {
    
    @Override
    String getSchemaName() {
        return "image";
    }

    @Test
    public void testImageGood() throws Exception {
        runTest("image-fixture-good", true);
    }
}
