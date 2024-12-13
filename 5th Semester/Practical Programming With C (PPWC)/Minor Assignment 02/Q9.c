#include <stdio.h>

int main() {
    char choice;
    
    printf("Enter the choice of the character (A-Z): ");
    scanf(" %c", &choice);

    int rows = choice - 'A' + 1; 

    for (int i = 0; i < rows; i++) {
        // Print left side characters
        for (char ch = 'A'; ch <= choice - i; ch++) {
            printf("%c ", ch);
        }
        
        // Print spaces in the middle
        for (int space = 0; space < i * 2 - 1; space++) {
            printf("  ");
        }

        // Print right side characters if not the first row
        if (i != 0) {
            for (char ch = choice - i; ch >= 'A'; ch--) {
                printf("%c ", ch);
            }
        } else {
            for (char ch = choice - i - 1; ch >= 'A'; ch--) {
                printf("%c ", ch);
            }
        }

        // Move to the next line after each row
        printf("\n");
    }

    return 0;
}
