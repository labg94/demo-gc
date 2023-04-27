package com.cleveritgroup.demogc.core.user;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {


        @ParameterizedTest
        @ValueSource(strings = {"", " ", "  "})
        void should_throw_exception_when_name_is_empty(String name) {
            IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                    () -> new Name(name));
            assertEquals("Name cannot be null or blank", illegalArgumentException.getMessage());
        }


        @ParameterizedTest
        @ValueSource(strings = {"1", "2", "3"})
        void should_throw_exception_when_name_has_numbers(String name) {
            IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                    () -> new Name(name));
            assertEquals("Name cannot have numbers", illegalArgumentException.getMessage());
        }


        @ParameterizedTest
        @ValueSource(strings = {"Luis ", "Carlos ", "Francisco "})
        void should_throw_exception_when_name_has_spaces(String name) {
            IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                    () -> new Name(name));
            assertEquals("Name cannot have spaces", illegalArgumentException.getMessage());
        }



}
