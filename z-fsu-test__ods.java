
<10.81.5.5> to <10.81.19.73>      	[HTTPS]	[443]		                      VM (vme1tstagedso02) al AS (web-eu1-ofidig-test-01)
<10.81.5.5>	to <10.81.19.72>      	[HTTPS]	[443]		                      VM (vme1desagedso02) al AS (web-eu1-ofidig-test-02)	
<10.81.5.5>	to <10.81.19.68>      	[HTTPS]	[443]		                      VM (vme1desagedso02) al AS (web-eu1-ofidig-test-03)	
<10.81.5.5>	to <10.81.19.69>      	[HTTPS]	[443]		                      VM (vme1desagedso02) al AS (web-eu1-ofidig-test-05)	
<10.81.5.5>	to <10.81.19.71>      	[HTTPS]	[443]		                      VM (vme1desagedso02) al AS (web-eu1-ofidig-test-04)	
<10.81.5.5>	to <10.81.19.70>      	[HTTPS]	[443]		                      VM (vme1desagedso02) al AS (web-eu1-ofidig-test-06)	
<10.81.5.5>	to <10.81.19.132>      	[HTTPS]	[443]		                      VM (vme1desagedso02) al AS (kveu1ofidigtst01)	
<10.81.5.5>	to <10.81.23.164>      	[HTTPS]	[443]		                      VM (vme1desagedso02) al AS (kveu1datostest-01)	

<10.81.4.84> to	<10.81.19.73>	      [HTTPS]	[443]		                      VM Jump (vme1tstdsojum01) al AS (web-eu1-ofidig-test-01)
<10.81.4.84> to	<10.81.19.72>	      [HTTPS]	[443]		                      VM Jump (vme1tstdsojum01) al AS (web-eu1-ofidig-test-02)	
<10.81.4.84> to	<10.81.19.68>	      [HTTPS]	[443]		                      VM Jump (vme1tstdsojum01) al AS (web-eu1-ofidig-test-03)	
<10.81.4.84> to	<10.81.19.71>	      [HTTPS]	[443]		                      VM Jump (vme1tstdsojum01) al AS (web-eu1-ofidig-test-04)	
<10.81.4.84> to	<10.81.19.69>	      [HTTPS]	[443]		                      VM Jump (vme1tstdsojum01) al AS (web-eu1-ofidig-test-05)
<10.81.4.84> to	<10.81.19.70>	      [HTTPS]	[443]		                      VM Jump (vme1tstdsojum01) al AS (web-eu1-ofidig-test-06)	

<10.228.40.0/21> to	<10.81.19.36>	  [TCP]	  [1433]		AKS (aks-eu1-integra-canal-test) al SSQL1-ODS   (db-srv-eu1-ofidig-test-01) OK
<10.228.40.0/21> to	<10.81.19.52>	  [TCP]	  [1433]		AKS (aks-eu1-integra-canal-test) al SSQL2-ODS   (db-srv-eu1-ofidig-test-02)	OK
<10.228.40.0/21> to	<10.81.23.132>	[TCP]	  [1433]		AKS (aks-eu1-integra-canal-test) al SSQL1-DATOS (db-srv-eu1-datos-test-01)  NO
<10.228.40.0/21> to	<10.81.19.4>	  [HTTPS]	[443]		  AKS (aks-eu1-integra-canal-test) al SA1-ODS     (steu1ofidigapltest01) OK
<10.228.40.0/21> to	<10.81.19.20>	  [HTTPS]	[443]		  AKS (aks-eu1-integra-canal-test) al SA2-ODS     (steu1ofidigapltest02) OK
<10.228.40.0/21> to	<10.81.19.228>	[HTTPS]	[443]		  AKS (aks-eu1-integra-canal-test) al SA3-ODS     (steu1ofidigsrvltest01) OK
<10.228.40.0/21> to	<10.81.19.196>	[HTTPS]	[443]		  AKS (aks-eu1-integra-canal-test) al FN          (func-eu1-ofidig-test-01) OK
<10.228.40.0/21> to	<10.81.19.132>	[HTTPS]	[443]		  AKS (aks-eu1-integra-canal-test) al KV          (kveu1ofidigtst01) NO
<10.228.48.0/21> to	<10.81.23.132>	[HTTPS]	[433]		  AKS (aks-eu1-integra-multicanal-test) al SSQL1-DATOS (db-srv-eu1-datos-test-01) PENDING
<10.228.48.0/21> to	<10.81.23.164>	[HTTPS]	[443]		  AKS (aks-eu1-integra-multicanal-test) al KV          (kveu1datostest-01) PENDING



// TEST[VALIDATE]

10.81.5.5	10.81.19.73	HTTPS	443		                      Comunicacion de la VM (vme1tstagedso02) al App Service web-eu1-ofidig-test-01	
10.81.5.5	10.81.19.72	HTTPS	443		                      Comunicacion del VM (vme1desagedso02) al App Service web-eu1-ofidig-test-02	
10.81.5.5	10.81.19.68	HTTPS	443		                      Comunicacion del VM (vme1desagedso02) al App Service web-eu1-ofidig-test-03	
10.81.5.5	10.81.19.71	HTTPS	443		                      Comunicacion del VM (vme1desagedso02) al App Service web-eu1-ofidig-test-04	
10.81.5.5	10.81.19.69	HTTPS	443		                      Comunicacion del VM (vme1desagedso02) al App Service web-eu1-ofidig-test-05	
10.81.5.5	10.81.19.70	HTTPS	443		                      Comunicacion del VM (vme1desagedso02) al App Service web-eu1-ofidig-test-06	

10.228.40.0/21	10.81.19.36	TCP	1433		                Comunicacion del AKS al servidor Azure SQL 01 de Oficina Digital.	
10.228.40.0/21	10.81.19.52	TCP	1433		                Comunicacion del AKS al servidor Azure SQL 02 de Oficina Digital.	
10.228.40.0/21	10.81.19.4	HTTPS	443		                Comunicacion del AKS al Storage Account de Oficina Digital.	
10.228.40.0/21	10.81.23.132	TCP	1433		              Comunicacion del AKS al servidor Azure SQL Datos.	
10.228.40.0/21	10.81.19.20	HTTPS	443		                Comunicacion del AKS al Storage Account de Oficina Digital.	
10.228.40.0/21	10.81.19.228	HTTPS	443		              Comunicacion del AKS al Storage Account de Oficina Digital.	
10.228.40.0/21	10.81.19.196	HTTPS	443		              Comunicacion del AKS al Azure Function.	

10.81.5.6	10.81.19.36	TCP	1433		                      Comunicacion del VM (vme1tstagedso03) al servidor Azure SQL 01 de Oficina Digital.	
10.81.5.6	10.81.19.52	TCP	1433		                      Comunicacion del VM (vme1tstagedso03) al servidor Azure SQL 02 de Oficina Digital.	
10.81.5.6	10.81.23.132	TCP	1433		                    Comunicacion del VM (vme1tstagedso03) al servidor Azure SQL 01 Datos.	

10.81.4.84	10.81.19.73	HTTPS	443		                    Comunicacion del VM Jump (vme1tstdsojum01) al App Service web-eu1-ofidig-test-01	
10.81.4.84	10.81.19.72	HTTPS	443		                    Comunicacion del VM Jump (vme1tstdsojum01) al App Service web-eu1-ofidig-test-02	
10.81.4.84	10.81.19.68	HTTPS	443		                    Comunicacion del VM Jump (vme1tstdsojum01) al App Service web-eu1-ofidig-test-03	
10.81.4.84	10.81.19.71	HTTPS	443		                    Comunicacion del VM Jump (vme1tstdsojum01) al App Service web-eu1-ofidig-test-04	
10.81.4.84	10.81.19.69	HTTPS	443		                    Comunicacion del VM Jump (vme1tstdsojum01) al App Service web-eu1-ofidig-test-05	
10.81.4.84	10.81.19.70	HTTPS	443		                    Comunicacion del VM Jump (vme1tstdsojum01) al App Service web-eu1-ofidig-test-06	


// FALTANTE
'AKS -> DB1'      -> aksvm02[resolucion y con efimera] y vm03[resolucion y 0-con]
'AKS -> DB2'      -> aksvm02[resolucion y con efimera] y vm03 [resolucion y 0-con]
'AKS -> DB3'      -> aksvm02[resolucion y con efimera] y vm03 [resolucion y 0-con]
'AKS -> Function' -> resolucion y con efimera. [nslookup func-eu1-ofidig-test-01.azurewebsites.net, nc -zv 10.81.19.196 443]
'AKS -> SA1'      -> resolucion y con efimera. [nslookup steu1ofidigapltest01.blob.core.windows.net, ]
'AKS -> SA2'      -> resolucion y con efimera
'AKS -> SA3'      -> resolucion y con efimera
