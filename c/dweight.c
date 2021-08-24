/* Computes the dimensional weight of a 12" x 10" x 8" box */

#include <stdio.h>

int main(void)
{
    int height;
    int length;
    int width;
    int volume;
    int weight;

    height = 8;
    length = 12;
    width = 10;

    volume = height * length * width;
    weight = (volume + 165) / 166;

    printf("Dimesions: %dx%dx%d\n", length, width, height);
    printf("Volume (cubic inches): %d\n", volume);
    printf("Dimensional weight (pounds): %d\n", weight);

    return 0;
}