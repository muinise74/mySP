package com.example.mysp.web.vo;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloReseponseTest {

    @Test
    public void testLombok() {
        String name = "test";
        int amount = 1000;

        HelloResponse hr = new HelloResponse(name,amount);

        assertThat(hr.getName()).isEqualTo(name);
        assertThat(hr.getAmount()).isEqualTo(amount);
    }

}
