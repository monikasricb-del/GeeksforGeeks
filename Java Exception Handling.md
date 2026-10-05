## 01. Java Exception Handling

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/java-exception-handling-1606978567/1)

### Problem Description

**Task:** Given two integers a and b, return the minimum value obtained from performing any of the following arithmetic operations between a and b: addition (+), subtraction (-), multiplication (*), and floor division ( / ).Make sure to use exception handling to manage any potential division by zero errors.

> **Note:** If division by zero is attempted, handle the exception and exclude the division operation from consideration.

#### Examples

##### Example 1

- **Input:**
```text
a = 5, b = -5
```
- **Output:**
```text
-25
```
- **Explanation:** 5+(-5) = 0, 5-(-5) = 10, 5*(-5) = -25, 5/(-5) = -1 Minimum of all is 5*(-5) = -25.

##### Example 2

- **Input:**
```text
a = 5, b = 0
```
- **Output:**
```text
0
```
- **Explanation:** 5+0 = 5, 5-0 = 5, 5*0 = 0, 5/0 = "Exception Handling" Minimum of all is 5*0 = 0.

#### Constraints

- **1.** `-10³ ≤ a, b ≤ 10³`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(1)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-05 10:30:43
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int findMin(int a, int b) {
        // code here
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = 0;
        if(b == 0){
            div = 0;
        }
        else{
            div = a/b;
        }
        
        int min = Math.min(add,sub);
        min = Math.min(min,mul);
        min = Math.min(min,div);
        return min;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-05 10:29:22
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int findMin(int a, int b) {
        // code here
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = 0;
        if(b == 0){
            div = 0;
        }
        else{
            div = a/b;
        }
        
        int min = Math.min(add,sub);
        min = Math.min(min,mul);
        min = Math.min(min,div);
        return min;
    }
}
```

*Generated on: 10/5/2026, 11:01:52 AM*