clc;
clear all;
close all;

% Plot the Sine wave and Cosine wave.
% Plot the amplitude frequency curve with user input values.
% Message Signal
% Carrier Signal
% Amplitude Modulated Signal

% Author : Abhishek Sharma
% Computer Networks Lab 2 : 11.02.2021

% Plotting Sine and cosine wave
x = 0:0.1:10;
plot (x, sin (x));
hold on;
plot (x, cos(x),'r');
title ('Sine and cosine wave');
legend ('sin','cos');


% Plotting Amplitude Frequency curve of various signals
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
AM = (AC+m).*cos(2*pi*FC*t);
subplot(3,1,3)
plot(AM)
ylabel('Amplitude Modulated signal')
xlabel ('Time')
