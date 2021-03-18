## :fleur_de_lis: Computer Networks Lab 6 Week 6 | Date : 18.03.2021 :fleur_de_lis:
:yellow_circle: Platform used here, Cisco Packet Tracer version 7.2

:small_orange_diamond: In today's class we have discussed about the assignment 2 of the Cisco packet tracer assignments. :small_orange_diamond:
*************************************************************************************
### :heavy_check_mark: Assignment 2
:arrow_forward: **Q1 . Level the PCs with proper IP addresses.**

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/ip-assign.png">

:arrow_forward: **Q2. Implementing Hub using 3 End-devices**

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/hub.png">

```
IP Address for PC2 is given, 192.168.13.2
IP Address for PC3 is given, 192.168.13.3
IP Address for PC4 is given, 192.168.13.4

Now, checking the Ping procedure whether the End devices are working right or, not.
```
<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/ping.png">

:arrow_forward: **Q3. Implementing the Switch using 3 End devices.**

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/switch.png">

```
IP Address for PC0 is given, 192.168.10.2
IP Address for PC1 is given, 192.168.10.3
IP Address for PC2 is given, 192.168.10.4

Now providing the PC0 a PDU and set the destination of the PDU is at PC1 and Simulate the whole procedure.

After Simulating the whole procedure the status is shown here, 'SUCCESSFUL' as the simulation bar showed.
```

:play_or_pause_button: Simulation Event :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/witch%20sim1.png">

:play_or_pause_button: Simulation Status :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/switch%20sim%202.png">

:arrow_forward: **Q4. Implementing the LAN service.**

```
Prerequisites :
1. Router (1 pc.) 2911
2. Switches (2 pcs.) 2960
3. End Devices (6 pcs.) PC
```
:play_or_pause_button: Design and Diagram :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/lan.png">

```
For LAN 1 :
IP Address for PC0 is given, 10.0.0.2
IP Address for PC1 is given, 10.0.0.3
IP Address for PC2 is given, 10.0.0.4

Subnet Mask : 255.0.0.0

Default Gateway : 10.0.0.1


For LAN 2 :
IP Address for PC3 is given, 192.168.0.2
IP Address for PC4 is given, 192.168.0.3
IP Address for PC5 is given, 192.168.0.4

Subnet Mask : 255.255.255.0

Default Gateway : 192.168.0.1


Now, checking all the end devices are responding or not using 'ping' command in the command prompt.
```

:play_or_pause_button: For LAN 1, checking the end devices :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/lan%20ping%201.png">

:play_or_pause_button: For LAN 2, Checking the end devices :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/lan%20ping%202.png">

```
Now using the PDU to various paths of end devices, simulate the whole LAN using the real-time and simulation.

Here we are checking whether we can send the PDU from LAN 1 to LAN 2 as we are sending the data from PC2 of LAN 1 to PC3 of LAN 2
```

:play_or_pause_button: Simulation Event :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/lan%20data%201.png">

:play_or_pause_button: Simulation Status :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%206%20%5BPacket%20Tracer%5D/lan%20data.png">

```
Conclusion :
Simulation Status is 'Successful' as the data is correctly transmitted from LAN 1 to LAN 2 via the router and the switches. 
Hence, we can conclude that the design of the LAN is successfully implemented using the Packet Tracer Software.
```

******************************************************************************

## abhisheks008 :american_samoa:
### Show some :heart:, if this repository helps you!
:green_circle: Contributed by, Abhishek Sharma, 2021 @abhisheks008 :green_circle:

