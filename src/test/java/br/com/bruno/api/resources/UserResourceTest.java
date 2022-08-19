package br.com.bruno.api.resources;

import br.com.bruno.api.domain.User;
import br.com.bruno.api.domain.dto.UserDTO;
import br.com.bruno.api.services.impl.UserServiceimpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserResourceTest {

    public static final Integer ID       = 1;
    public static final String NAME      = "bruno";
    public static final String EMAIL     = "bruno@mail.com";
    public static final String PASSWORD  = "123";
    public static final int INDEX = 0;

    private User user;
    private UserDTO userDTO;

    @InjectMocks
    private UserResource resource;

    @Mock
    private UserServiceimpl service;

    @Mock
    private ModelMapper mapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUser() {
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }
}