## Algorithm Description

The algorithm used in this program follows these steps:

1. Input the number of items and knapsack capacity.
2. Calculate and store the profit-to-weight ratio for each item.
3. Sort the items in decreasing order of profit-to-weight ratio.
4. Iterate through the sorted items and select items for the knapsack:
   - If an item can fit entirely, it is selected, and its weight and profit are added to the knapsack.
   - If an item cannot fit entirely, a fractional part of the item is taken.
5. Keep track of the maximum profit obtained during item selection.
6. Print the maximum profit obtained.

## Example

Here's an example of how the program works:

Enter the Size: 3
Enter Capacity: 50

------ Enter All Profit and Weight -----

Enter Profit 1: 60

Enter Weight 1: 10

Enter Profit 2: 100

Enter Weight 2: 20

Enter Profit 3: 120

Enter Weight 3: 30

----- Moves (Item Index, Weight, Profit) -----

Take Item 3: 30 units, 120.00 Rs Profit3

Take Item 2: 20 units, 100.00 Rs Profit

Take Fractional Item 1: 0.00 units, 20.00 Rs Profit

The Maximum Profit is: 220 Rs

## Notes

- This code efficiently solves the Fractional Knapsack Problem using a greedy approach.
- It supports fractional selection of items when an item cannot fit entirely within the knapsack's capacity.
