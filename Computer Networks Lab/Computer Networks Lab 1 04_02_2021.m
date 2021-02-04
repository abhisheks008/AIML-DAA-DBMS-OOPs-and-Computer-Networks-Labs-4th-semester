% 1. Calculate the average of two numbers.
a = 6;
b = 7;
c = (a+b)/2;
disp('the answer is :'), disp(c);

% 2. Calculate the average of two numbers given by the user.
a = input('enter the 1st no.:')
b = input('enter the 2nd no.:')
disp('the answer is'), disp((a+b)/2);

% 3. Calculate the average of n numbers given by the user.
n = input('enter the no. of no.s:')
s=0;
for i = 1:n
    user = input('enter the value :')
    s = s + user;
end
disp('the answer is : '), disp(s/n);

% 4. Calculate the square root of a number.
a = 16
sqrt(a)

% 5. Calculate the factorial of a number.
a = 3
factorial(a)

% 6. print an array.
arr = [1 2 3 4 5 6]

% 7. print a matrix
mat = [1 2 3; 4 5 6; 7 8 9]

% 8. Addition, Subtraction and Multiplication of two matrices.
mat1 = [2 4; 1 3]
mat2 = [1 2; 3 4]
disp('Addition'), disp(mat1 + mat2);
disp('Subtraction'), disp(mat1-mat2);
disp ('Multiplication'), disp(mat1*mat2);

% 9. Determinant of a matrix.
mat = [1 0 0; 0 1 0; 0 0 1];
det(mat)

% 10. Eigen value of a matrix.
m = [4 5 6; 1 2 3; 7 4 5];
eig(m)

% 11. Plot a sine and cosine wave.
x = 0:0.1:10;
plot (x, sin (x));
hold on;
plot (x, cos(x),'r');
title ('Sine and cosine wave');
legend ('sin','cos');
