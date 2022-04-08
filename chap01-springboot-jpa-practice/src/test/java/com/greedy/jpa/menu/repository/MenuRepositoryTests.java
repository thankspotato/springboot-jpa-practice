package com.greedy.jpa.menu.repository;

import com.greedy.jpa.config.BeanConfiguration;
import com.greedy.jpa.config.JPAConfiguration;
import com.greedy.jpa.config.JpaApplication;
import com.greedy.jpa.menu.entity.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {JpaApplication.class, JPAConfiguration.class, BeanConfiguration.class})
public class MenuRepositoryTests {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private MenuRepository menuRepository;

    @Test
    public void repository_의존성_주입_테스트() {
        assertNotNull(menuRepository);
    }

    @Test
    public void 메뉴코드로_메뉴_조회_테스트() {
        //given
        int menuCode = 7;

        //when
        Menu menu = menuRepository.findMenuByCode(entityManager, menuCode);

        //then
//        assertNotNull(menu);
        assertEquals(menuCode, menu.getMenuCode());
        /* 첫번째 인자: 기댓값, 두번째 인자: 실제값 */
    }

}
