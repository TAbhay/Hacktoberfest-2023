#include <iostream>
using namespace std;

int main() {
    int a, cap;

    // Input the number of items and knapsack capacity
    cout << "\nEnter the Size: ";
    cin >> a;
    cout << "\nEnter Capacity: ";
    cin >> cap;

    // Arrays to store profit, weight, profit-to-weight ratio, and original values
    float p[a], w[a], ratio[a], max = 0, ori[a], ori_2[a], ori_3[a];

    // Input profit and weight for each item and calculate profit-to-weight ratio
    cout << "\n------ Enter All Profit and Weight ----- \n";
    for (int i = 0; i < a; i++) {
        cout << "\nEnter Profit " << i + 1 << ": ";
        cin >> p[i];
        cout << "Enter Weight " << i + 1 << ": ";
        cin >> w[i];
        ratio[i] = float(p[i] / w[i]); // Calculate profit-to-weight ratio
        ori[i] = ratio[i];             // Store original ratio
        ori_2[i] = w[i];               // Store original weight
        ori_3[i] = p[i];               // Store original profit
    }

    // Sort items in decreasing order of profit-to-weight ratio using bubble sort
    for (int i = 0; i < a; i++) {
        for (int j = i + 1; j < a; j++) {
            if (ratio[i] < ratio[j]) {
                swap(ratio[i], ratio[j]);
                swap(w[i], w[j]);
                swap(p[i], p[j]);
            }
        }
    }

    // Select items for the knapsack
    cout << "\n\n----- Moves (Item Index, Weight, Profit) ----- \n";
    for (int i = 0; i < a; i++) {
        if (cap <= 0) {
            break;
        }
        int n = 0;
        while (n < a) {
            if (ori[n] == ratio[i] && ori_2[n] == w[i] && ori_3[n] == p[i]) {
                break;
            }
            n++;
        }

        // Take the entire item if it fits in the knapsack
        if (w[i] <= cap) {
            cout << "Take Item " << n + 1 << ": " << w[i] << " units, " << p[i] << " Rs Profit" << endl;
            cap -= w[i];
            max += p[i];
        }
        // Otherwise, take a fractional part of the item
        else {
            cout << "Take Fractional Item " << n + 1 << ": " << cap << " units, " << ratio[i] * cap << " Rs Profit" << endl;
            max += (ratio[i] * cap);
            cap -= ratio[i] * cap;
        }
    }

    // Print the maximum profit
    cout << "\nThe Maximum Profit is: " << max << " Rs" << endl;

    return 0;
}
