package com.example.arithmetic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ArithmeticController.class)
class ArithmeticControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAddition() throws Exception {
        mockMvc.perform(get("/calculator/add")
                        .param("a", "10")
                        .param("b", "20"))
                .andExpect(status().isOk())
                .andExpect(content().string("30"));
    }

    @Test
    void testSubtraction() throws Exception {
        mockMvc.perform(get("/calculator/subtract")
                        .param("a", "20")
                        .param("b", "10"))
                .andExpect(status().isOk())
                .andExpect(content().string("10"));
    }

    @Test
    void testMultiplication() throws Exception {
        mockMvc.perform(get("/calculator/multiply")
                        .param("a", "5")
                        .param("b", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string("20"));
    }

    @Test
    void testDivision() throws Exception {
        mockMvc.perform(get("/calculator/divide")
                        .param("a", "20")
                        .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("4.0"));
    }
}
