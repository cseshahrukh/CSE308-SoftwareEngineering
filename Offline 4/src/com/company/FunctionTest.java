package com.company;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @org.junit.jupiter.api.Test
    void func3creditA() {
        Function f=new Function();
        assertEquals("A", f.func3credit("250"));
    }

    @org.junit.jupiter.api.Test
    void func3creditB() {
        Function f=new Function();
        assertEquals("B", f.func3credit("210"));
    }

    @org.junit.jupiter.api.Test
    void func3creditC() {
        Function f=new Function();
        assertEquals("C", f.func3credit("209"));
    }

    @org.junit.jupiter.api.Test
    void func3creditF() {
        Function f=new Function();
        assertEquals("F", f.func3credit("100"));
    }

    @org.junit.jupiter.api.Test
    void func3creditFractionA() {
        Function f=new Function();
        assertEquals("A", f.func3credit("239.5"));
    }

    @org.junit.jupiter.api.Test
    void func3creditFractionB() {
        Function f=new Function();
        assertEquals("B", f.func3credit("209.25"));
    }

    @org.junit.jupiter.api.Test
    void func3creditFractionC() {
        Function f=new Function();
        assertEquals("C", f.func3credit("179.75"));
    }

    @org.junit.jupiter.api.Test
    void func3creditFractionF() {
        Function f=new Function();
        assertEquals("F", f.func3credit("0.5"));
    }

    @org.junit.jupiter.api.Test
    void func3creditlarge() { //Invalid Input Large Marks
        Function f=new Function();
        RuntimeException exception= Assertions.assertThrows(RuntimeException.class, () -> f.func3credit("500"));
        Assertions.assertEquals("Invalid Input. Input is too large.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void func3creditsmall() { //Invalid Input Large Marks
        Function f=new Function();
        RuntimeException exception= Assertions.assertThrows(RuntimeException.class, () -> f.func3credit("-5"));
        Assertions.assertEquals("Invalid Input. Input can't be negative.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void func3creditsmallCorner() { //Invalid Input Large Marks
        Function f=new Function();
        RuntimeException exception= Assertions.assertThrows(RuntimeException.class, () -> f.func3credit("-0.5"));
        Assertions.assertEquals("Invalid Input. Input can't be negative.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void func3creditNAN() { //Invalid Input Large Marks
        Function f=new Function();
        RuntimeException exception= Assertions.assertThrows(RuntimeException.class, () -> f.func3credit("Hello"));
        Assertions.assertEquals("Not A Number", exception.getMessage());
    }


    //Time For 4 Credit
    @org.junit.jupiter.api.Test
    void func4creditA() {
        Function f=new Function();
        assertEquals("A", f.func4credit("330"));
    }

    @org.junit.jupiter.api.Test
    void func4creditB() {
        Function f=new Function();
        assertEquals("B", f.func4credit("300"));
    }

    @org.junit.jupiter.api.Test
    void func4creditC() {
        Function f=new Function();
        assertEquals("C", f.func4credit("250"));
    }

    @org.junit.jupiter.api.Test
    void func4creditF() {
        Function f=new Function();
        assertEquals("F", f.func4credit("100"));
    }

    @org.junit.jupiter.api.Test
    void func4creditFractionA() {
        Function f=new Function();
        assertEquals("A", f.func4credit("319.5"));
    }

    @org.junit.jupiter.api.Test
    void func4creditFractionB() {
        Function f=new Function();
        assertEquals("B", f.func4credit("279.25"));
    }

    @org.junit.jupiter.api.Test
    void func4creditFractionC() {
        Function f=new Function();
        assertEquals("C", f.func4credit("239.75"));
    }

    @org.junit.jupiter.api.Test
    void func4creditFractionF() {
        Function f=new Function();
        assertEquals("F", f.func4credit("0.5"));
    }

    @org.junit.jupiter.api.Test
    void func4creditlarge() { //Invalid Input Large Marks
        Function f=new Function();
        RuntimeException exception= Assertions.assertThrows(RuntimeException.class, () -> f.func4credit("500"));
        Assertions.assertEquals("Invalid Input. Input is too large.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void func4creditsmall() { //Invalid Input Large Marks
        Function f=new Function();
        RuntimeException exception= Assertions.assertThrows(RuntimeException.class, () -> f.func4credit("-5"));
        Assertions.assertEquals("Invalid Input. Input can't be negative.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void func4creditsmallCorner() { //Invalid Input Large Marks
        Function f=new Function();
        RuntimeException exception= Assertions.assertThrows(RuntimeException.class, () -> f.func4credit("-0.5"));
        Assertions.assertEquals("Invalid Input. Input can't be negative.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void func4creditNAN() { //Invalid Input Large Marks
        Function f=new Function();
        RuntimeException exception= Assertions.assertThrows(RuntimeException.class, () -> f.func4credit("Hello"));
        Assertions.assertEquals("Not A Number", exception.getMessage());
    }


}