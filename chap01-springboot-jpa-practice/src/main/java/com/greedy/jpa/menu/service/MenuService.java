package com.greedy.jpa.menu.service;

import com.greedy.jpa.menu.dto.MenuDTO;
import com.greedy.jpa.menu.entity.Menu;
import com.greedy.jpa.menu.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class MenuService {

    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    /* 영속성컨텍스트 라이브러리에서 제공하는 어노테이션 */
    @PersistenceContext
    EntityManager entityManager;  //Bean으로 생성해준 객체가 아니므로 Autowired 해주지 않는다

    @Autowired
    public MenuService(MenuRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }

    public MenuDTO findMenuByCode(int menuCode) {

        MenuDTO menu =
                modelMapper.map(menuRepository.findMenuByCode(entityManager, menuCode), MenuDTO.class);

        return menu;
    }
}
