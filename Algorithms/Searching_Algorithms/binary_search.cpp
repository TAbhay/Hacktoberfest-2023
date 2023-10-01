#include <iostream>
using namespace std;

// Recursive binary search function
int binsearch(int arr[], int start, int end, int num) {
    if (start == end) {
        if (arr[start] == num) {
            return start;
        } else {
            return -1;
        }
    } else if (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == num) {
            return mid;
        } else if (arr[mid] > num) {
            return binsearch(arr, start, mid - 1, num);
        } else {
            return binsearch(arr, mid + 1, end, num);
        }
    } else {
        return -1;
    }
}

int main() {
    int n;
    cout << "\nEnter the Size: ";
    cin >> n;
    int arr[n];
    cout << "\n----- Enter Elements -----\n";

    // Taking input for array elements
    for (int i = 0; i < n; i++) {
        cout << "Enter Number " << i + 1 << ": ";
        cin >> arr[i];
    }

    // Sorting the array using bubble sort
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                swap(arr[i], arr[j]);
            }
        }
    }

    int num;
    string a;
    while (true) {
        cout << "\n1: Search Number\n2: Exit\nEnter Your Choice: ";
        cin >> a;
        if (a == "1") {
            cout << "\nEnter Number to Search: ";
            cin >> num;
            // Calling binary search function
            int index = binsearch(arr, 0, n, num);
            (index == -1) ? cout << "\nThe Number " << num << " is Not Found" << endl
                          : cout << "\nThe Number " << num << " is Found at Position " << index << endl;
        } else if (a == "2") {
            cout << "\nThanks for Using Program\n";
            break;
        } else {
            cout << "\nWrong Choice. Try Again\n";
        }
    }
}
