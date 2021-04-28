#include <math.h>
#include <stdio.h>
void insertionSort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

void printArray(int arr[], int n)
{
    int i;
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

int main()
{
    int z, y = 0;
    scanf ("%d", &z);
    int arr[z];
    for (y=0; y<z; y++){
        scanf ("%d", &arr[y]);
    }
    int n = (sizeof(arr) / sizeof arr[0]);

    insertionSort(arr, n);
    printArray(arr, n);

    return 0;
}
