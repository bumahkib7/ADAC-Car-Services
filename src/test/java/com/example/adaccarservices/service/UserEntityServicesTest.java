package com.example.adaccarservices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.adaccarservices.models.UserEntity;
import com.example.adaccarservices.repo.UserRepositories;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class UserEntityServicesTest {
    /**
     * Method under test: {@link UserEntityServices#findByEmail(String)}
     */
    @Test
    void testFindByEmail() {
        // Given
        UserEntity userEntity = new UserEntity();
        //when
        userEntity.setAddress("42 Main St");
        userEntity.setCity("Oxford");
        userEntity.setEmail("jane.doe@example.org");
        userEntity.setFirstName("Jane");
        userEntity.setId(123L);
        userEntity.setLastName("Doe");
        userEntity.setPassword("iloveyou");
        userEntity.setPhoneNumber("4105551212");
        userEntity.setSex('A');
        userEntity.setState("MD");
        userEntity.setZip("21654");
        // Then
        Optional<UserEntity> ofResult = Optional.of(userEntity);
        UserRepositories userRepositories = mock(UserRepositories.class);
        when(userRepositories.findByEmail((String) any())).thenReturn(ofResult);
        Optional<UserEntity> actualFindByEmailResult = (new UserEntityServices(userRepositories)).findByEmail("foo");
        assertSame(ofResult, actualFindByEmailResult);
        assertTrue(actualFindByEmailResult.isPresent());
        verify(userRepositories).findByEmail((String) any());
    }

    /**
     * Method under test: {@link UserEntityServices#validateUserEntity(UserEntity, String, String)}
     */
    @Test
    void testValidateUserEntity() {
        UserEntityServices userEntityServices = new UserEntityServices(mock(UserRepositories.class));

        UserEntity userEntity = new UserEntity();
        userEntity.setAddress("42 Main St");
        userEntity.setCity("Oxford");
        userEntity.setEmail("jane.doe@example.org");
        userEntity.setFirstName("Jane");
        userEntity.setId(123L);
        userEntity.setLastName("Doe");
        userEntity.setPassword("iloveyou");
        userEntity.setPhoneNumber("4105551212");
        userEntity.setSex('A');
        userEntity.setState("MD");
        userEntity.setZip("21654");
        userEntityServices.validateUserEntity(userEntity, "jane.doe@example.org", "iloveyou");
        assertEquals("42 Main St", userEntity.getAddress());
        assertEquals("21654", userEntity.getZip());
        assertEquals("MD", userEntity.getState());
        assertEquals('A', userEntity.getSex());
        assertEquals("4105551212", userEntity.getPhoneNumber());
        assertEquals("iloveyou", userEntity.getPassword());
        assertEquals("Doe", userEntity.getLastName());
        assertEquals(123L, userEntity.getId().longValue());
        assertEquals("Jane", userEntity.getFirstName());
        assertEquals("jane.doe@example.org", userEntity.getEmail());
        assertEquals("Oxford", userEntity.getCity());
    }

    /**
     * Method under test: {@link UserEntityServices#validateUserEntity(UserEntity, String, String)}
     */
    @Test
    void testValidateUserEntity2() {
        assertThrows(IllegalArgumentException.class,
                () -> (new UserEntityServices(mock(UserRepositories.class))).validateUserEntity(null, null, null));
    }

    /**
     * Method under test: {@link UserEntityServices#validateUserEntity(UserEntity, String, String)}
     */
    @Test
    void testValidateUserEntity3() {
        UserEntityServices userEntityServices = new UserEntityServices(mock(UserRepositories.class));

        UserEntity userEntity = new UserEntity();
        userEntity.setAddress("42 Main St");
        userEntity.setCity("Oxford");
        userEntity.setEmail("jane.doe@example.org");
        userEntity.setFirstName("Jane");
        userEntity.setId(123L);
        userEntity.setLastName("Doe");
        userEntity.setPassword("iloveyou");
        userEntity.setPhoneNumber("4105551212");
        userEntity.setSex('A');
        userEntity.setState("MD");
        userEntity.setZip("21654");
        assertThrows(IllegalArgumentException.class,
                () -> userEntityServices.validateUserEntity(userEntity, null, "iloveyou"));
    }

    /**
     * Method under test: {@link UserEntityServices#validateUserEntity(UserEntity, String, String)}
     */
    @Test
    void testValidateUserEntity4() {
        UserEntityServices userEntityServices = new UserEntityServices(mock(UserRepositories.class));

        UserEntity userEntity = new UserEntity();
        userEntity.setAddress("42 Main St");
        userEntity.setCity("Oxford");
        userEntity.setEmail("jane.doe@example.org");
        userEntity.setFirstName("Jane");
        userEntity.setId(123L);
        userEntity.setLastName("Doe");
        userEntity.setPassword("iloveyou");
        userEntity.setPhoneNumber("4105551212");
        userEntity.setSex('A');
        userEntity.setState("MD");
        userEntity.setZip("21654");
        assertThrows(IllegalArgumentException.class,
                () -> userEntityServices.validateUserEntity(userEntity, "jane.doe@example.org", null));
    }
}

