% 1. Write a program for the generation of AM signal for varying modulation index (<1, =1 and >1)

clc;
clear all;
close all;

% Plot the amplitude frequency curve with user input values.
% Author : Abhishek Sharma
% Computer Networks Lab 3 : 18.02.2021


t = 0:.001:1;
AM = input('Enter the amplitude of the message signal :')
FM = input('Enter the frequency of the message signal :')
AC = input('Enter the amplitude of the carrier signal :')
FC = input('Enter the frequency of the carrier signal :')

% Plotting the Message Signal
m = AM*cos(2*pi*FM*t);
subplot(3,1,1)
plot(m)
ylabel('message signal')
xlabel ('Time')
t = 0:.001:1;

% Plotting the Carrier Signal
c = AC*cos(2*pi*FC*t);
subplot(3,1,2)
plot(c)
ylabel('carrier signal')
xlabel ('Time')

%Plotting the Amplitude Modulated Signal
AMS = (AC+m).*cos(2*pi*FC*t);
subplot(3,1,3)
plot(AMS)
ylabel('Amplitude Modulated')
xlabel ('time')


% Amplitude Modulated signals can be of 3 types 
% (a) Under modulation (<1 is the Modulation Index)  Am < Ac 
% (b) Critical modulation (=1 is the Modulation Index)  Am = Ac 
% (c) Over modulation (>1 is the Modulation Index)  Am > Ac 

% ******************************************************************************************************************************************************************************
% ******************************************************************************************************************************************************************************

% 2. Write a program for the generation of FM signal for varying modulation index (Case 1: narrowband FM and Wide band FM)

clc;
clear all;
close all;

% Author : Abhishek Sharma
% Computer Networks Lab 3 : 18.02.2021

t = 0:.001:1;
beta = input('Enter the modulation index :')
AM = input('Enter the amplitude of the message signal :')
FM = input('Enter the frequency of the message signal :')
AC = input('Enter the amplitude of the carrier signal :')
FC = input('Enter the frequency of the carrier signal :')

% Plotting the Message Signal
m = AM*cos(2*pi*FM*t);
subplot(3,1,1)
plot(m)
ylabel('message signal')
xlabel ('Time')
t = 0:.001:1;

% Plotting the Carrier Signal
c = AC*cos(2*pi*FC*t);
subplot(3,1,2)
plot(c)
ylabel('carrier signal')
xlabel ('Time')

% Plotting FMS
fms = AC * cos(2*pi*FC*t + beta*sin(2*pi*FM*t));
subplot(3,1,3)
plot(fms)
ylabel ('FM signal wave')
xlabel ('time')
