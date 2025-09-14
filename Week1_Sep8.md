# Week 1 (Week of Sep. 8)

## Exercises

### Exercise 1

Write a method that takes as input a string and rearranges it by jumping between the start and end of the string like so:

```
Input: ABCDE
Output: AEBDC

Input: THING
OUTPUT: TGHNI

Input: ABCD
OUTPUT: ADBC
```

Be sure to take care that this works with both even and odd length strings.

```java
public static char[] rearrange(String input) {
    // code here
}
```

### Exercise 2

> [!IMPORTANT]
> This is a presentation exercise.

Write a method that takes a `String` as input and returns a boolean indicating whether or not the input string has only unique characters.

```java
public static boolean hasUnique(String s) {
    // code here
}
```

> [!NOTE]
> You may have used a dictionary or hashmap in another programming language. Think about how this could save you time here, by preventing the need to iterate over characters you have seen before. Remember that ASCII representations of characters are integers. Without having learned about hashmaps, how can you use this property of characters to make a "dictionary" by indexing an integer array?
Sure! Here's a rewritten version of your Wordle-style exercise, but using **integer arrays with digits 0–9** instead of letters:

---

### Exercise 3 (Digits Edition)

> \[!IMPORTANT]
> This is a presentation exercise. Kind of.

In this game, a player enters a 5-digit guess for a hidden 5-digit number.

* If any digit is in the hidden number and in the correct position, it is marked as **green**.
* If any digit is in an incorrect position but exists in the hidden number, it is marked as **yellow**.
* Otherwise, the digit is marked as **grey**.

Implement a method that takes as input the player's guess array and the hidden number array, and returns the number of digits in the guess that also appear in the hidden number, ensuring each digit is counted at most once.

```
Input: guess = [1, 2, 3, 4, 5], hidden = [5, 2, 0, 4, 1]
Output: 3

Input: guess = [1, 1, 1, 0, 2], hidden = [5, 1, 3, 1, 3]
Output: 2 (we only count the first two 1's)
```

```java
public static int countMatching(int[] guess, int[] hidden) {
    // code here
}
```

#### Bonus: Exercise 3b (Digits Edition)

Implement a method that takes as input the player's guess array and the hidden number array, and returns *both the number of yellow and green digits*.

* The first integer in the array is the number of yellow digits.
* The second integer in the array is the number of green digits.

```
Input: guess = [1, 2, 3, 4, 5], hidden = [5, 2, 0, 4, 1]
Output: [2, 2]
```

```java
public static int[] countGuess(int[] guess, int[] hidden) {
    // code here
}
```

---

