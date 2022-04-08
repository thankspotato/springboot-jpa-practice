package com.greedy.jpa.main.controller;

import com.greedy.jpa.config.BeanConfiguration;
import com.greedy.jpa.config.JPAConfiguration;
import com.greedy.jpa.config.JpaApplication;
import com.greedy.jpa.main.MainController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {JpaApplication.class, BeanConfiguration.class, JPAConfiguration.class})
public class MainControllerTests {

    @Autowired
    private MainController mainController;
    private MockMvc mockMvc;

    @BeforeEach
    public void initMockMvc() {
        /* MockMvc 초기화 */
        mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
    }

    @Test
    public void testInit() {
        assertNotNull(mainController);
        assertNotNull(mockMvc);
    }

    @Test
    public void 메인메뉴로_이동_컨트롤러_테스트() throws Exception {

//        mockMvc.perform(MockMvcRequestBuilders.get("/"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.forwardedUrl("main/main"))
//                .andDo(MockMvcResultHandlers.print());

        mockMvc.perform(MockMvcRequestBuilders.get("/main"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.forwardedUrl("main/main"))
                .andDo(MockMvcResultHandlers.print());

    }
}
