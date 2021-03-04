## Computer Networks Laboratory 5 Week 5 | Date : 04.03.2021
In this class we have introduced ourselves with the Cisco Packet Traser Software where we will be able to do the networking simulation and the networking circuit.

### Cisco Packet Tracer is powered by, 
<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/poster.png">

### Dowloading link for Cisco Packet Traser software : 
:large_orange_diamond: For 7.2 version : ```https://getintopc.com/softwares/network/cisco-packet-tracer-7-2-free-download/```

:large_orange_diamond: For 6.2 Version : ```https://getintopc.com/softwares/network/cisco-packet-tracer-6-2-free-download/```

:large_orange_diamond: For 6.1 Version : ```https://getintopc.com/softwares/network/cisco-packet-tracer-6-1-free-download/```

<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/poster1.png">

-----------------------------------------------------------------------
## Laboratory Assignment :
### ```Question : Design a Star Network with 4 PCs in Cisco Packet Tracer Software```
<img src = "https://github.com/abhisheks008/AIML-DAA-DBMS-OOPs-and-Computer-Networks-Labs-4th-semester/blob/main/Computer%20Networks%20Lab/STAR.png">

:large_blue_diamond: PC 1 is having the IP Address : ```155.178.1.1```

:large_blue_diamond: PC 2 is having the IP Address : ```155.178.1.2```

:large_blue_diamond: PC 3 is having the IP Address : `155.178.1.3`

:large_blue_diamond: PC 4 is having the IP Address : `155.178.1.4`


:arrow_forward: IP Address of the Router : `155.178.1.0`

:white_check_mark: For Checking the PCs are well satisfied to send the signals or not, open the Command Prompt, check the IP address using the command `ip config` and then `ping` the other IPs. If all the responses are coming properly from the other PCs then the IP addresses have been deployed correctly.
For example, `ping 155.178.1.2` in the PC 1 then you will get the proper feedback from the PC 2


**Configuring the Router in CLI :**

```
Router>enable
Router#config terminal
Enter configuration commands, one per line. End with CNTL/Z.
Router(config)#interface GigabitEthernet 0/0
Router(config-if)#ip address 155.178.1.0 255.255.0.0
Router(config-if)#no shutdown
```

This is the Star Network with 4 PCs with a 1941 router.
