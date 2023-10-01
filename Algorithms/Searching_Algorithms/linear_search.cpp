#include <iostream>
using namespace std;

// Function to check if a number is found in an array
int isfound(int arr[], int size, int num) {
    for (int j = 0; j < size; j++) {
        if (arr[j] == num) {
            return 1; // Number is found
        }
    }
    return 0; // Number is not found
}

int main() {
    int a, num;
    cout << "\nEnter the Size: ";
    cin >> a;
    int arr[a]; // Declare an array of size 'a'
    
    cout << "\n ----- Enter Elements ----- \n";
    for (int i = 0; i < a; i++) {
        cout << "Enter Element " << i + 1 << ": ";
        cin >> arr[i]; // Input array elements
    }
    
    string ch;
    while (true) {
        cout << "\n1: Search Number\n2: Exit\nEnter Your Choice: ";
        cin >> ch;
        
        if (ch == "1") {
            cout << "\nEnter Number to Search: ";
            cin >> num;
            
            // Call the isfound function to check if the number is present in the array
            if (isfound(arr, a, num)) {
                cout << "\nThe Number " << num << " is Found\n";
            } else {
                cout << "\nThe Number " << num << " is Not Found\n";
            }
        } else if (ch == "2") {
            cout << "\nThanks For using Program\n";
            break; // Exit the loop and end the program
        } else {
            cout << "\nWrong Choice Try Again\n";
        }
    }
    return 0;
}
