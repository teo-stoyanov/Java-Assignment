# Java-Assignment

JAVA ASIGNMENT TASK DESCRIPTION

The program is working simple, we enter in the console:
Card type: Gold, Silver or Bronze
Turnover: integer/double
Purchase value: integer/double

Example of input:
Gold
1500.00
1300.00

Program output:
Purchase value: $1300.00
Discount rate: 10.0%
Discount: $130.00
Total: $1170.00


1. Following the good OOP structure I use different classes and interfaces so we can have higher level of abstraction and polimorphism
2. package Const is where we have our constants, avoiding "hard coding values"
3. in package core we have PayDesk class with static methods returning discount , discountValue and price after discount , also Engine class where we have
our main logic.
4.package entities is where we have class of each card (Gold,Silver,Bronze) in each class we have unique inside logic of finding the discount 
based on the turnover
5.package io is where we have input/output classes giving us the option to change it later on (read from console to read from file)
6. package interfaces is where we have interfaes inplemented by entities,engine,i/o
The program is reading the input from the console, than based on the card type we create an Card Object (using interface and polimorphism).
The inside card logic is setting its properties (turnover and discoint), passing the card to the PayDesk static methods later on brings us the desired result, which we print on the console.
