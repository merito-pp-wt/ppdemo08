# Przykład 08 - Tablice i kolekcje

W tym ćwiczeniu przedstawiono sposób korzystania z tablic.

Tablice w języku Java są obiektami, tak więc mają właściwości takie jak np. `length`.
Ponieważ rozmiar tablicy nie może się zmienić, `length` nie jest metodą, ale polem
o stałej wartości. 

Znajdź w dokumentacji Javy opis klasy java.util.Arrays, która zawiera różne funkcje
umożliwiające manipulowanie tablicami (wypełnianie wartością, porównanie, sortowanie i in.)


## Zadanie

Dodaj do klasy `App` następujące metody:

1. Metodę `min(int[] t)` znajdującą najmniejszą wartość w tablicy.
2. Metodę `average1(int[] t)` obliczającą średnią wartość liczb zawartych w tablicy. Wykorzystaj 
   metodę `sumOfElements()`.
3. Metodę `average2(int[] t)` obliczającą średnią wartość liczb zawartych w tablicy, ale bez pomocy
   metody `sumOfElements()`.
4. Metodę `last(int[] t)` zwracającą wartość ostatniego elementu w tablicy (elementu o największym indeksie).
