## :fleur_de_lis: Computer Networks Lab 7 Week 7 | Date : 24.03.2021 :fleur_de_lis:
:yellow_circle: Platform used here, Cisco Packet Tracer version 7.2
************************************************************************************************

### :heavy_check_mark: Assignment 7

:arrow_forward: **Q1. Create a WAN using the Packet Tracer.**

Requirements :
1. 6 end devices (here I have used 6 PCs)
2. 2 Switches [2950-24T]
3. 2 Routers [2811]
4. Serial DCE
<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%207%20%5BPacket%20Tracer%5D/wan%201.png">

```
IP address of the end devices of LAN 1 :
PC0 : 192.168.10.2
PC1 : 192.168.10.3
PC2 : 192.168.10.4
Default Gateway : 192.168.10.1
IP of Router0 : 192.168.30.2

IP address of the end devices of LAN 2 :
PC3 : 192.168.20.2
PC4 : 192.168.20.3
PC5 : 192.168.20.4
Default Gateway : 192.168.20.1
IP of Router1 : 192.168.30.3

Default Gateway of the two routers : 192.168.30.1
:o: Two routers are connected via the serial DCE cable and serial port 0/0.
:o: Switches are connected to the routers via FastEtherNet.

Put the maximum data sending rate as 128000

IP routing to connect the routers via the default gateway :

A. For Router0 :
Router(config-if)#exit
Router(config)#ip route 0.0.0.0 0.0.0.0 192.168.30.1
Router(config)#exit
Router#
%SYS-5-CONFIG_I: Configured from console by console

B. For Router1 :
Router(config-if)#exit
Router(config)#ip route 0.0.0.0 0.0.0.0 192.168.30.1
Router(config)#exit
Router#
%SYS-5-CONFIG_I: Configured from console by console
```
:o: Simulating the WAN network using the PDUs :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%207%20%5BPacket%20Tracer%5D/wan%202.png">

**:ballot_box_with_check: Conclusion : All the PDUs are successfully sent via the WAN, hence, the network is successfully deployed.**

***************************************************************************
:arrow_forward: **Q2. Configure the DHCP Protocol using the Packet Tracer.**

Requirements :
1. 3 end devices (2 PCs and 1 Laptop)
2. Switch PT
3. Server PT

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%207%20%5BPacket%20Tracer%5D/dhcp%201.png">

```
Objective : Assign the IP addresses of the end devices using the DHCP.


Procedure :

Network Gateway for the network : 192.168.0.0

Put the IP address of the server as, 192.168.0.1,
Subnet Mask as, 255.255.255.0
and the DNS server as, 10.0.0.1
```
<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%207%20%5BPacket%20Tracer%5D/dhcp%203.png">

```
Now to work with the server, we need to enable the DHCP service of the server.
Default Gateway will be, 192.168.0.1
DNS Server as, 10.0.0.1

and put the service as ON.

Save the whole configuration and simulate the whole network with the help of the PDUs from end devices to other end devices.
```
:o: Configure the DHCP Service Portion of the Server :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%207%20%5BPacket%20Tracer%5D/dhcp%204.png">

:o: Simulate using the PDUs :

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/Lab%207%20%5BPacket%20Tracer%5D/dhcp%202.png">

**:ballot_box_with_check: Conclusion : Hence, we can conclude that the DHCP is successfully implemented and provided the IP addresses of the PC0 as 192.168.0.2, Laptop0 as 192.168.0.3 and PC1 as 192.168.0.3. All of them are generated with the help of DHCP and automatically.**

********************************************************************
©️ Code Contributed by, Abhishek Sharma, 2021 @abhisheks008
`Date : 25.03.2021`
`Computer Networks Lab 7`

