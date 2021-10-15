package com.club3.java.tests;

import com.club3.java.*;
import org.junit.Test;

import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;

public class MenuTest {
    private Menu menu = Mockito.mock(Menu.class);
    private BasicProgram basicProgram = Mockito.mock(BasicProgram.class);
    private Classes classes = Mockito.mock(Classes.class);
    private Collections collections = Mockito.mock(Collections.class);
    private Conditions conditions = Mockito.mock(Conditions.class);
    private Loops loops = Mockito.mock(Loops.class);
    private OOP oop = Mockito.mock(OOP.class);
    private Strings strings = Mockito.mock(Strings.class);


    @Test
    public void runApplication() {
        doNothing().when(menu).runApplication();
        doNothing().when(basicProgram).runBasicProgram();
        doNothing().when(classes).runClasses();
        doNothing().when(collections).runCollections();
        doNothing().when(conditions).runConditions();
        doNothing().when(loops).runLoops();
        doNothing().when(oop).runOOP();
        doNothing().when(strings).runStings();
    }
}
