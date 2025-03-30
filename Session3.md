# Session 3

This session is aimed at helping you tackle the Recursion portions of the interview questions. These problems are all very similar to the actual problems in the interview set, or even just intended to lead you towards a solution for an actual problem.

If you are not a Problem Solver, it will also help you if you are struggling with recursion and would like walkthroughs of recursive algorithms.

## Topics/skills:

- Choosing parameters to pass down
- Order of recursive calls
- Recursion trees
- Memoization\*
- Backtracking\*

\*Beyond what was taught in class, but techniques that are useful for the interview questions.

## Practice problems

### Recursion

#### Problem 1: Pascal's Triangle

**Problem statement:** Recall Pascal's triangle:
![pascals_triangle.png](pascals_triangle.jpg)

Generate Pascal's triangle up to $n$ rows.

```
Input: n = 1
Output: [[1]]
```

```
Input: n = 2
Output: [[1], [1, 1]]
```

```
Input: n = 3
Output: [[1], [1, 1], [1, 2, 1]]
```

#### Steps to go through

1. Work through `n = 4`.
2. What information do you need to calculate the $n^{\text{th}}$ row? Hint: you may need a loop in your recursive method.
3. Write the pseudocode of your method. Where should you perform the recursive call? When will it return?
4. Write a recurrence to represent the time complexity of your solution.

#### Problem 2: Climbing stairs

**Problem statement:** You are climbing a staircase. It takes $n$ steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? Note that the order does matter, i.e. climbing 1 step, then two steps is **not** the same as climbing 2 steps then 1 step.

```
Input: n = 0
Output: 1
```

```
Input: n = 1
Output: 1
```

```
Input: n = 2
Output: 2
```

```
Input: n = 3
Output: 2
```

#### Steps to go through

1. Work through `n = 4`.
2. You're lazy, and you only want to climb a single step. What height staircase do you need so that climbing a single step gets you to the top of a $n$-step staircase?
3. You're a little less lazy, but you still only want to climb a double step. What height staircase do you need so that climbing a double step gets you to the top of a $n$-step staircase?
4. You have the number of ways to get to $n - 1$ steps, stored in $n_1$. You also have the number of ways to get to $n - 2$ steps, stored in $n_2$. Calculate the number of ways to get to $n$ steps.
5. Draw the recursion tree. What's the time complexity?

**Bonus:** Are there any repeated recursive calls? Can we make this method faster by storing our results somewhere and checking first to see if we have calculated it before? This is known as **memoization**.

#### Problem 3: Generating combinations

**Problem statement:** You are given a number $n$. Return a list of unique combinations to produce this sum. Note that all integers are positive and greater than 0. The lists of numbers must be unique, i.e. `[1, 2, 2]` is the same as `[2, 2, 1]` and hence you should only include it once. 

```
Input: n = 1
Output: []
```

```
Input: n = 2
Output: [[1, 1]]
```

```
Input: n = 3
Output: [[1, 1, 1], [2, 1]]
```

```
Input: n = 4
Output: [[1, 1, 1, 1], [2, 1, 1], [2, 2], [3, 1]]
```

#### Steps to go through

1. What is the maximum integer you can have in any combination?
2. Let's say I have this array: `curr = [1], n = 3`, where `curr` represents an array of integers we are building. Give me a range of possible options for the next number I add to this array.
3. What kind of information would our recursive calls like to know? Write a method signature to reflect what parameters we should pass.
4. What should you do if at some recursive step, the sum of `curr` would exceed `n`?
5. What should you do if at some recursive step, the sum of `curr` is equal to `n`? 
6. Draw the recursion tree for this problem, including how `curr` is being modified through successive recursive calls. Step through an example call of your method. What's the order the recursive calls are called in? 

#### Problem 4: Modified binary search

**Fun fact**: This was on a COMP 251 midterm.

**Problem statement**: In a **sorted** array, elements can be duplicated. We are interested in finding an instance of the element $k$ that is the **last** to appear in our array. Find and return the **index** of this element. You **cannot** assume that $k$ always exists.

```
Input: A = [1, 2, 2, 2, 4], k = 2
Output: 2
```

```
Input: A = [4, 6, 7, 7, 7, 8, 9, 9], k = 9
Output: 7
```

#### Steps to go through

1. Summarize what binary search is doing. Write out the classic recursive method.
2. Normally, once we find $k$, we would just return it. We can't do that here. Which side(s) should we try searching if we find $k$?
3. How can we tell if we have found the last occurence?
4. Does the time complexity change?

#### Problem 5: The parentheses problem

**Problem statement**: Write a recursive method that takes as input an integer n and returns a list containing all valid combinations of $n$ pairs of parentheses. Note that the list should not contains any repetition. For a combination of parentheses to be valid, all parentheses should be properly opened and closed.

```
Input: n = 0
Output: []
```

```
Input: n = 1
Output: ['()']
```

```
Input: n = 2
Output: ['()()', '(())']
```

```
Input: n = 3
Output: ['()()()', '(())()', '()(())', '(()())', '((()))']
```

**A start to a solution**:
Let's use the case of `n = 2`. We can open 2 new parentheses pairs, so let's store this in a variable `pairs_left`. Let's also keep track of how many pairs we have closed with `pairs_closed`.

We have an empty string to start: `current_result = ''`. Since `pairs_left = 2`, let's use up one of our parentheses:

```
n = 2
current_result = '('
pairs_left = 1
pairs_closed = 0
```

Now, we have a choice: close this pair, or open a new pair, since `pairs_left > 0`. Both of these are valid choices.

**Possibility 1**

```
n = 2
current_result = '(('
pairs_left = 0
pairs_closed = 0
```

**Possibility 2**

```
n = 2
current_result = '()'
pairs_left = 1
pairs_closed = 1
```

Branching off of **Possibility 1**, we don't have any pairs left. So our only choice is to add a right parenthesis.
**Possibility 1.1**

```
n = 2
current_result = '(()'
pairs_left = 0
pairs_closed = 1
```

Branching off of **Possibility 1.1**, we don't have any pairs left. So our only choice is to add a right parenthesis.
**Possibility 1.1.1**

```
n = 2
current_result = '(())'
pairs_left = 0
pairs_closed = 2
```

Now `pairs_closed = n`. Obviously we can't have more pairs closed than number of pairs, so let's save this result.

Ok, we're back into looking at **Possibility 2**. We can't close any pairs because the number of pairs we used up (how do we get this number?) is equal to the number of closed pairs. But we do have 1 pair left unused, so let's try opening a new pair.

**Possibility 2.1**

```
n = 2
current_result = '()('
pairs_left = 0
pairs_closed = 1
```

Branching off of **Possibility 2.1**, we notice that we have no more pairs left to add. But the number of pairs we used up (2) is larger than the number of closed pairs (1). So we can try closing a pair.

**Possibility 2.1.1**

```
n = 2
current_result = '()()'
pairs_left = 0
pairs_closed = 0
```

And now we save this possibility to our list.

#### Next steps for the parentheses problem

1. Draw the recursion tree to represent how the new possibilities are being generated. Can you see the recursive structure of this problem?
2. Draw the recursion tree. What is the time complexity of this method? How many recursive calls are made in the worst case?
3. Write the pseudocode for this problem.

**Considerations**

1. What makes a choice invalid? How do we know we can add or not add a parenthesis?
2. How can we make sure we only save the result of the recursive call to our list if it's not already in there? Where in the method should we add our result to a list?
