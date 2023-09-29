#include <iostream>
using namespace std;

// Function to check if a number is prime
void isprime(int num) {
    // Check if the number is less than or equal to 1
    if (num <= 1) {
        cout << "\nThe Number " << num << " is Not Prime\n";
        return; // Exit the function
    }

    // Loop from 2 to half of the number
    for (int i = 2; i <= (num / 2); i++) {
        // If num is divisible by i, it's not prime
        if (num % i == 0) {
            cout << "\nThe Number " << num << " is Not Prime\n";
            return; // Exit the function
        }
    }

    // If the loop completes without finding divisors, the number is prime
    cout << "\nThe Number " << num << " is Prime\n";
}

int main() {
    int a;
    cout << "\nEnter the Number: ";
    cin >> a; // Read a number from the user
    isprime(a); // Call the isprime function to check if it's prime
    return 0; // Exit the program
}
