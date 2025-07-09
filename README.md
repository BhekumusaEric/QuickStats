# QuickStats

This is a practice Java program that takes numbers from the command line, analyzes them, and prints basic statistics.

## 📌 What It Does

When you run the program with a list of numbers as arguments, it will:

- Display the list of inputs
- Count how many valid numbers were entered
- Calculate the **sum** of the numbers
- Calculate the **average** of the numbers

It also:

- Prints `(ignored)` for any non-number arguments
- Ignores invalid values in the final calculation
- Informs the user if **no arguments** were given

---

## ✅ Sample Output

```bash
$ java QuickStats 3 15 Hello 10 6 24
[3, 15, Hello (ignored), 10, 6, 24]
Count: 5
Total: 58
Average: 11
