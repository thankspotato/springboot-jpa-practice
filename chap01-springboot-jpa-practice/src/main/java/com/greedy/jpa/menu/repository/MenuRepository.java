package com.greedy.jpa.menu.repository;

import com.greedy.jpa.menu.entity.Menu;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MenuRepository {
//@PersistenceContext
//    EntityManager entityManager;   //임시로 만들기 => 이렇게 하면 맞게 구현된건지 검증하는 방향성에 어긋난다

    public Menu findMenuByCode(EntityManager entityManager, int menuCode) {

        return entityManager.find(Menu.class, menuCode);
    }
}
