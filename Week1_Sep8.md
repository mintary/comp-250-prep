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

### Exercise 3

> [!IMPORTANT]
> This is a presentation exercise. Kind of.

In the game **Wordle**, a player enters a 5-letter word guess for the hidden word.

If any given letter is in the correct place and in the correct position, we mark it as green.

If any given letter is in an incorrect place, but is in the correct position, we mark it as yellow.

Otherwise, the letter is marked as grey.

Implement a method that takes as input the player's guess, the hidden word, and returns the number of yellow letters.

```
Input: guess = "apple", hidden = "pears"
Output: 3

Input: guess = "slate", hidden = "phone"
Output: 0

Input: guess = "crane", hidden = "check"
Output: 1
```

```java
public static int countYellow(String guess, String hidden) {
    // code here
};
```

#### Bonus: Exercise 3b

Implement a method that takes as input the player's guess, the hidden word, and returns both the number of yellow _and_ green letters.

The first integer in the array is the number of yellow letters, the second integer in the array is the number of green letters.

```
Input: guess = "apple", hidden = "pears"
Output: [3, 0]

Input: guess = "slate", hidden = "phone"
Output: [0, 1]

Input: guess = "crane", hidden = "check"
Output: [1, 1]
```

```java
public static int[] countGuess(String guess, String hidden) {
    // code here
};
```
