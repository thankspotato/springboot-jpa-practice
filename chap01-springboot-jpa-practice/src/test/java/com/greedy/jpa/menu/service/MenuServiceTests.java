package com.greedy.jpa.menu.service;

import com.greedy.jpa.config.BeanConfiguration;
import com.greedy.jpa.config.JPAConfiguration;
import com.greedy.jpa.config.JpaApplication;
import com.greedy.jpa.menu.dto.MenuDTO;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {JpaApplication.class, JPAConfiguration.class, BeanConfiguration.class })
public class MenuServiceTests {

    @Autowired
    private MenuService menuService;
    @Autowired
    private ModelMapper modelMapper;

    @Test
    public void testInit() {
        assertNotNull(menuService);
        assertNotNull(modelMapper);
    }

    @Test
    public void 메뉴코드로_메뉴_조회_테스트() {
        //given
        int menuCode = 7;

        //when
        MenuDTO menu = menuService.findMenuByCode(menuCode);

        //then
        assertNotNull(menu);
        System.out.println("menu = " + menu);
    }
}
