# PIMM: ArrayLists

This activity is a PRIMM-ish style activity without the run part because the code is not finished, so we'll call it a PIMM. You will write a program using a plain old array because they're cool, but they are limited. Then you'll redo the program with an ArrayList so that you appreciate the power.

Use this document as a place to document your answers to the questions. You won't turn this document in, but it can help supplement your notes.

## Predict
Predict what the program's behavior is.

1. What is the intended purpose of the program?
    >  your answer
2. I'm asking you to implement the program using an array. Where could you run into challenges?
    >  your answer

## Investigate
Annotate the program by completing the JavaDoc.

## Modify
Complete the `Modify` comments. Finish the following methods:
1. constructor.
2. `getPoolSize()`
3. `addToPool()` 
4. overloaded `removeFromPool()`
5. `createTeamName()`

## Reflections on Modify
1. How did you handle adding words to the pool when you ran out of space?
    > Your answer
2. How did you handle adding words that were already in the pool?
    > Your answer
3. What is the challenge about removing words from the pool?
    > Your answer
4. How did you handle removing words from the pool that weren't in the pool?
    > Your answer

## Make
An ArrayList is a data structure that allows the end user to flexibly add/remove items without worry about copying arrays and shifting items. The following table shows how ArrayLists work.

Rewrite your program using an ArrayList!

| Code Statement            | Effect and Notes |
| :--------------           | :--------------             |
`import java.util.ArrayList;` | Imports the ArrayList package |
| `ArrayList<Integer> values = new ArrayList<Integer>();` | Creates a new ArrayList of integers. ArrayLists use *generics*, which means use the diamond operator `<>` to indicate which type you want to store. **ArrayLists can only store Objects. If you want to store a primitive type, you must use the "wrapper classes", which are basically capitalized versions of the primitive type.**
| `ArrayList<String> words = new ArrayList<String>(25);` | Creates a new ArrayList, but you're just hinting at what the size could be. |
| `numbers.add(50);` | Adds the value `50` to the end of the list. The list is now `[50]`. The primitive value 50 is automatically converted to the object `Integer` - the process is called autoboxing. |
| `numbers.add(75);` | Adds the value `75` to the end of the list. The list is now `[50, 75]`. |
| `numbers.add(100);` | Adds the value `100` to the end of the list. The list is now `[50, 75, 100]`. |
| `numbers.add(0, 25);` | Add the value `25` at position 0. Everything moves down. The list is now `[25, 50, 75, 100].` |
| `numbers.size();` | Returns the current size of the list, which is 4. |
| `int first = numbers.get(0);` | Returns the first item in the list and stores in `first`, which is `0`. It is automatically converted from `Integer` to `int` because of a process called unboxing. |
| `int last = numbers.get(numbers.size()-1);` | Returns the last item in the list and stores in `last`, which is `100`. Sorry, there's no negative indexing like in Python. |
| `numbers.set(2, 80);` | Changes the value of position 2 to `80`. The list is now `[25, 50, 80, 100]`.|
| `numbers.remove(2);` | Removes the value at index 2. The list is now `[25, 50, 100]`. |
| `numbers.size();` | Returns the current size of the list, which is 3. |
| `numbers.remove(Integer.valueOf(25))` | Removes the value 25 from the list. Because an object is required you need to use an object version of the int. The static method `Integer.valueOf()` creates `Integer` objects. The list is now `[50, 100]` |

## Iterating over ArrayLists

### Index based
```java
// assume numbers already has stuff
for (int i = 0; i < numbers.size(); i++) {
    System.out.println( numbers.get(i) );
}
```

### Enhanced for loop (for each)

```java
// assume numbers already has stuff
for (int val : numbers) {
    System.out.println( val );
}
```

## Reflections on Make
1. What was easier about using an ArrayList than using an array?
    > Your answer
2. Did you encounter any errors or challenges? If so, what?
    > Your answer
3. When would you use an array? How about an ArrayList?
    > Your answer