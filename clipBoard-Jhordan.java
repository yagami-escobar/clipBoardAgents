ext_gmunozs_softek/Zatak1665!
// **************************************************************************** CLIPBOARD-YAGAMI **************************************************************************** //
// ++++++++++++++++++++++++++++++++++ VALIDATE ++++++++++++++++++++++++++++++++++ //
'X' nslookup steu1ofidigfilesdesa01.blob.core.windows.net 
'X' nc -zv steu1ofidigfilesdesa01.blob.core.windows.net 443 || telnet

'X' nslookup steu1odintfuncdesa01.blob.core.windows.net
'X' nc -zv steu1ofidigfilesdesa01.blob.core.windows.net 443


// ************************************************* FN ************************************************* //
func-eu1-nodelnx-ofidigi-desa-01 -> pe-funceu1-ofidigi-desa-01 -> 10.80.19.53 -> vnet-eu1-ofidig-integra-desa/sn-eu1-ofidig-pe-integra-desa-01


// ************************************************* KV ************************************************* //




// ************************************************* PUBSUB ************************************************* //
wps-eastus-ofidig-desa-01(wps-eastus-ofidig-desa-01.webpubsub.azure.com) -> pe-eu1-wps-ofidig-desa-01 -> 10.80.19.180 -> vnet-eu1-ofidig-frontend-desa/sn-eu1-ofidig-frontend-pe-wps-desa-01 

nslookup wps-eastus-ofidig-desa-01.webpubsub.azure.com
telnet wps-eastus-ofidig-desa-01.webpubsub.azure.com 443
nc -zv wps-eastus-ofidig-desa-01.webpubsub.azure.com





// ************************************************* VMS ************************************************* //
mbirot-smc-vm/qpzm83*VHU038
ext-jescobars-mejco-vm-est/D3vS3c0ps*2024

'vme1desdsojum01' (10.82.12.4)[WINDOWS][BASTION]
	vme1desagedso01 (10.80.7.68) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 [LINUX][IAC]
	vme1desagedso02 (10.80.7.69) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 [LINUX][BACKEND/FRONTEND]
	vme1desagedso03 (10.80.7.73) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 [LINUX][DB]

'vme1tstdsojum01' (10.81.4.84)[WINDOWS][BASTION]
	vme1tstagedso01 -> 10.81.5.4  -> rg-eu1-plat-devsecop-cross-test-01 [LINUX][IAC]
	vme1tstagedso02 -> 10.81.5.5  -> RG-EU1-PLAT-DEVSECOP-CROSS-TEST-01 [LINUX][BACKEND/FRONTEND]
	vme1tstagedso03 -> 10.81.5.6  -> rg-eu1-plat-devsecop-cross-test-01 [LINUX][DB]
	vme1tstagedso04 -> 10.81.5.7  -> rg-eu1-plat-devsecop-cross-test-01 [NO MAPEADO - AVERIGUAR]

'vme1prddsojum01' (10.82.12.52)[WINDOWS][BASTION]
	vme1prdagedso01 -> 10.82.13.132 -> rg-eu1-plat-devsecop-cross-prod-01 [LINUX][IAC]
	vme1prdagedso02 -> 10.82.13.133 -> rg-eu1-plat-devsecop-cross-prod-01 [LINUX][BACKEND/FRONTEND]
	vme1prdagedso03 -> 10.82.13.134 -> rg-eu1-plat-devsecop-cross-prod-01 [LINUX][DB]


// ************************************************* KV ************************************************* //
'NSS-PLAT-INTEGRACION':
  'name': nss-plat-integracion -> rg-eu1-plat-integra-desa -> (kveu1integradesa)
  'name': nss-plat-integracion -> rg-eu1-plat-integra-test-01 -> (kveu1integratest)
  'name': nss-plat-integracion -> rg-eu1-plat-integra-prd-01 -> (kveu1integraprd)

'NSS-LAND-OFICINADIGITAL':
  'name': nss-land-oficinadigital -> rg-eu1-land-ofidig-desa-01 -> (kveu1ofidigdesa01)
  // SXs:
    'AZURE-REDIS-PASSWORD'
    'AZURE-REDIS-URL'
    'ClientID-B2C'
    'ClientSecret-B2C'
    'DB-HOST'
    'DB-NAME'
  'name': nss-land-oficinadigital -> rg-eu1-land-ofidig-xxxx -> (kveu1ofidigxxxxx)
  'name': nss-land-oficinadigital -> rg-eu1-land-ofidig-xxxx -> (kveu1ofidigxxxxx)

'NSS-PLAT-SECURITY':

'NSS-PLAT-DEVSECOPS':
  'name': nss-plat-devsecops -> rg-eu1-plat-devsecop-cross-desa-01 -> (kveu1devsecopdesa01)
  'name': nss-plat-devsecops -> rg-eu1-plat-devsecop-cross-test-01 -> (kve1devsecoptest01)
  'name': nss-plat-devsecops -> rg-eu1-plat-devsecop-cross-test-01 -> (kve1devsecoptest01)


// ++++++++++++++++++++++++++++++++++ VALIDATE ++++++++++++++++++++++++++++++++++ //
	// OFIDIG
	'VALID 1 (AKS)': nslookup kveu1ofidigdesa01.vault.azure.net    -> agent02 (10.80.19.4)   || // nslookup kveu1integradesa.vault.azure.net     -> agent02 (10.227.5.68)
  'VALID 2 (AKS)': nc -zv kveu1ofidigdesa01.vault.azure.net 443  -> Connection timed out   || // nc -zv kveu1integradesa.vault.azure.net 443   -> Connected to 10.227.5.68:443


  // nc:
  'nc <IP_DNS> <PORT>'	--> probar svcs o apis o conectarse a un server o svc a un port especifico.



// ************************************************* REDIS ************************************************* //
// ------------------------------ DESA ------------------------------ //
'Host-Name' -> redis-eastus-integra-shared-services-desa-01.redis.cache.windows.net
  'Tier'      -> C1 Basic (1GB Cache)-> {'low network bandwith', 'dedicated services', 'ssl', 'up to 1000 con' }
  'PrivateIP' ->  10.227.5.4


// Validaciones:
nslookup redis-eastus-integra-shared-services-desa-01.redis.cache.windows.net
nc -zv redis-eastus-integra-shared-services-desa-01.redis.cache.windows.net 6379


// ------------------------------ TEST ------------------------------ //
'Host-Name' -> redis-eastus-integra-shared-services-test-01.redis.cache.windows.net
  'Tier'      -> 
  'PrivateIP' -> 10.228.2.196

// ------------------------------ PROD ------------------------------ //

// ************************************************* SERVICEBUS ************************************************* //
// ------------------------------ DESA ------------------------------ //
'Host-Name' -> sbeu1integradesa.servicebus.windows.net
  'Pricing-Tier' -> Premium
  'PRIA'         -> 10.227.5.69
// ------------------------------ TEST ------------------------------ //
'Host-Name' -> sbeu1integratest.servicebus.windows.net
  'Pricing-Tier' -> Premium
  'PRIA'         -> 10.228.5.8
  'PORT'         -> 5671


// ------------------------------ PROD ------------------------------ //


// ************************************************* ACR ************************************************* //

// ------------------------------ DESA ------------------------------ //
'name': rg-eu1-plat-integra-desa/acrseu1integradesa -> (10.227.5.73, 10.227.5.74)


// ------------------------------ TEST ------------------------------ //
'name': rg-eu1-plat-integra-test-01/acrseu1integratest -> 

// ------------------------------ PROD ------------------------------ //
'name': rg-eu1-plat-integra-prd-01/acrseu1integraprd


// ++++++++++++++++++++++++++++++++++ CMDs ++++++++++++++++++++++++++++++++++ //
'az acr login --name acrseu1integratest' -> login.
'az group list -o table' -> list rg.

'az acr list -o table' -> list acrs.
'az acr repository list --name acrseu1integratest' -> list repos from acr.



// ++++++++++++++++++++++++++++++++++ VALIDATE ++++++++++++++++++++++++++++++++++ //
nslookup acrseu1integradesa.azurecr.io
nc -zv 10.227.5.71 443


// ************************************************* AKS ************************************************* //
// --------------------------------- DEV --------------------------------- //
'AKS CN':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-desa --name aks-eu1-integra-canal-desa --overwrite-existing
kubelogin convert-kubeconfig -l azurecli

'AKS MC':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-desa --name aks-eu1-integra-multicanal-desa --overwrite-existing
kubelogin convert-kubeconfig -l azurecli

// --------------------------------- TEST --------------------------------- //
'AKS CN':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-test-01 --name aks-eu1-integra-canal-test --overwrite-existing
kubelogin convert-kubeconfig -l azurecli

'AKS MC':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-test-01 --name aks-eu1-integra-multicanal-test --overwrite-existing
kubelogin convert-kubeconfig -l azurecli


// --------------------------------- PROD --------------------------------- //
'AKS CN':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-prd-01 --name aks-eu1-integra-canal-prd --overwrite-existing
kubelogin convert-kubeconfig -l azurecli

'AKS MC':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-prd-01 --name aks-eu1-integra-multicanal-prd --overwrite-existing
kubelogin convert-kubeconfig -l azurecli

// ++++++++++++++++++++++++++++++++++ CMDs ++++++++++++++++++++++++++++++++++ //
 'create pod' -> kubectl -n ns-desa-cn-ods-oficinadigitalsalud run netx --image=jrecord/nettools --restart=Never -- sleep 3600
 'connect'    -> kubectl -n ns-desa-cn-ods-oficinadigitalsalud exec -it netx -- /bin/bash
 
 'create pod' -> kubectl -n ns-test-cn-ods-oficinadigitalsalud run netx --image=jrecord/nettools --restart=Never -- sleep 3600
 'connect'    -> kubectl -n ns-test-cn-ods-oficinadigitalsalud exec -it netx -- /bin/bash

 'create pod' -> kubectl -n ns-test-cn-ods-oficinadigitalsalud run net1 --image=jrecord/nettools --restart=Never -- sleep 3600
 'connect'    -> kubectl -n ns-test-cn-ods-oficinadigitalsalud exec -it net1 -- /bin/bash


// ********************************************************************************************** DESA ********************************************************************************************** //
// ---------------------------------------------------------- [FSU] ---------------------------------------------------------- //

// ************************************************* APP SERVICE ************************************************* //
  // RESOURCES
  web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net (container) -> 10.80.19.164
  web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net (header)    -> 10.80.19.167
  web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net (menu)      -> 10.80.19.165
  web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net (module)    -> 10.80.19.166
  web-eu1-nodelnx-ofidig-desa-05.azurewebsites.net (access)    -> 10.80.19.168

  // CMDS
  [nslookup web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net || nslookup 10.80.19.164]
  [nc -zv 10.80.19.164 443 || nc -zv web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net 443]

  [nslookup web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net || nslookup 10.80.19.167]
  [nc -zv 10.80.19.167 443 || nc -zv web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net 443]

  [nslookup web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net || nslookup 10.80.19.165]
  [nc -zv 10.80.19.165 443 || nc -zv web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net 443]

  [nslookup web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net || nslookup 10.80.19.166]
  [nc -zv 10.80.19.166 443|| nc -zv web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net 443]

  [nslookup web-eu1-nodelnx-ofidig-desa-05.azurewebsites.net || nslookup 10.80.19.168]
  [nc -zv 10.80.19.168 443 || nc -zv web-eu1-nodelnx-ofidig-desa-05.azurewebsites.net 443]

  // VALID
  vm02 to as1 -> [resol: 'ok', con: 'ok']
  vm02 to as2 -> [resol: 'ok', con: 'ok']
  vm02 to as3 -> [resol: 'ok', con: 'ok']
  vm02 to as4 -> [resol: 'ok', con: 'ok']
  vm02 to as5 -> [resol: 'ok', con: 'ok']
  jum01 to as1 -> [resol: 'ok', con: 'ok']
  jum01 to as2 -> [resol: 'ok', con: 'ok']
  jum01 to as3 -> [resol: 'ok', con: 'ok']
  jum01 to as4 -> [resol: 'ok', con: 'ok']
  jum01 to as5 -> [resol: 'ok', con: 'ok']



// ************************************************* AZURE-SQL ************************************************* //
  // RESOURCES
  db-srv-eu1-ofidig-desa-01.database.windows.net 10.80.19.84
  db-srv-eu1-ofidig-desa-02.database.windows.net 10.80.19.100
  db-srv-eu1-datos-desa-01.database.windows.net 10.80.20.4

  // CMDS
  [nslookup db-srv-eu1-ofidig-desa-01.database.windows.net || nslookup 10.80.19.84]
  [nc -zv 10.80.19.84 1433 || nc -zv db-srv-eu1-ofidig-desa-01.database.windows.net 1433]

  [nslookup db-srv-eu1-ofidig-desa-02.database.windows.net || nslookup 10.80.19.100]
  [nc -zv 10.80.19.100 1433 || nc -zv db-srv-eu1-ofidig-desa-02.database.windows.net 1433]

  [nslookup db-srv-eu1-datos-desa-01.database.windows.net || nslookup 10.80.20.4]
  [nc -zv 10.80.20.4 1433 || nc -zv db-srv-eu1-datos-desa-01.database.windows.net 1433]

  // VALID
  vm03 to sql1 -> [resol: 'ok', con: 'ok']
  vm03 to sql2 -> [resol: 'ok', con: 'ok']
  vm03 to sql3 -> [resol: 'ok', con: 'ok']
  akscn to sql1 -> [resol: 'ok', con: 'ok']
  akscn to sql2 -> [resol: 'ok', con: 'ok']
  aksmc to sql3 -> [resol: 'ok', con: 'no']

// ************************************************* STORAGE ACCOUNT ************************************************* //
  // RESOURCES
  steu1ofidigfilesdesa01.blob.core.windows.net    10.80.19.68 'Validar'
  steu1odintfuncdesa01.blob.core.windows.net      10.80.19.52 'Validar'
  steu1ofidigapldesa01.blob.core.windows.net      10.80.19.69 'Validar'


  // CMDS
  [nslookup steu1ofidigfilesdesa01.blob.core.windows.net || nslookup 10.80.19.68]
  [nc -zv 10.80.19.68 433 || nc -zv steu1ofidigfilesdesa01.blob.core.windows.net 433]

  [nslookup steu1odintfuncdesa01.blob.core.windows.net || nslookup 10.80.19.52]
  [nc -zv 10.80.19.52 433 || nc -zv steu1odintfuncdesa01.blob.core.windows.net 433]

  [nslookup steu1ofidigapldesa01.blob.core.windows.net || nslookup 10.80.19.69]
  [nc -zv 10.80.19.69 433 || nc -zv steu1ofidigapldesa01.blob.core.windows.net 433]


  // VALID
  vm02 to sa1 -> [resol: 'ok', con: 'no']
  vm02 to sa2 -> [resol: 'ok', con: 'no']
  vm02 to sa3 -> [resol: 'ok', con: 'no']
  aks to sa1 -> [resol: 'no', con: 'no']
  aks to sa2 -> [resol: 'no', con: 'no']
  aks to sa3 -> [resol: 'no', con: 'no']

// ************************************************* FUNCTION ************************************************* //
  // RESOURCES
  func-eu1-ofidig-desa-01.azurewebsites.net     10.80.19.53 'Validar'

  // CMDS
  [nslookup func-eu1-ofidig-desa-01.azurewebsites.net || nslookup 10.80.19.53]
  [nc -zv 10.80.19.53 433 || nc -zv func-eu1-ofidig-desa-01.azurewebsites.net 433]

  // VALID
  vm02 to fn -> [resol: 'no', con: 'no']
  aks to fn -> [resol: 'no', con: 'no']

// ************************************************* KV ************************************************* //
  // RESOURCES
  kveu1ofidigdesa01.vault.azure.net     10.80.19.4

  // CMDS
  [nslookup kveu1ofidigdesa01.vault.azure.net || nslookup 10.80.19.4]
  [nc -zv 10.80.19.4 433 || nc -zv kveu1ofidigdesa01.vault.azure.net 433]

  // VALID
  vm02 to kv -> [resol: 'ok', con: 'no']
  akscn to kv -> [resol: 'ok', con: 'no']





// ********************************************************************************************** TEST ********************************************************************************************** //
// ---------------------------------------------------------- [FSU] ---------------------------------------------------------- //
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

<10.228.40.0/21> to	<10.81.19.36>	  [TCP]	  [1433]		                    AKS (aks-eu1-integra-canal-test) al SSQL1-ODS   (db-srv-eu1-ofidig-test-01)
<10.228.40.0/21> to	<10.81.19.52>	  [TCP]	  [1433]		                    AKS (aks-eu1-integra-canal-test) al SSQL2-ODS   (db-srv-eu1-ofidig-test-02)	
<10.228.40.0/21> to	<10.81.23.132>	[TCP]	  [1433]		                    AKS (aks-eu1-integra-canal-test) al SSQL1-DATOS (db-srv-eu1-datos-test-01)
<10.228.40.0/21> to	<10.81.19.4>	  [HTTPS]	[443]		                      AKS (aks-eu1-integra-canal-test) al SA1-ODS     (steu1ofidigapltest01)
<10.228.40.0/21> to	<10.81.19.20>	  [HTTPS]	[443]		                      AKS (aks-eu1-integra-canal-test) al SA2-ODS     (steu1ofidigapltest02)
<10.228.40.0/21> to	<10.81.19.228>	[HTTPS]	[443]		                      AKS (aks-eu1-integra-canal-test) al SA3-ODS     (steu1ofidigsrvltest01)
<10.228.40.0/21> to	<10.81.19.196>	[HTTPS]	[443]		                      AKS (aks-eu1-integra-canal-test) al FN          (func-eu1-ofidig-test-01)
<10.228.40.0/21> to	<10.81.19.132>	[HTTPS]	[443]		                      AKS (aks-eu1-integra-canal-test) al KV          (kveu1ofidigtst01)
<10.228.48.0/21> to	<10.81.23.132>	[HTTPS]	[433]		                      AKS (aks-eu1-integra-multicanal-test) al SSQL1-DATOS (db-srv-eu1-datos-test-01)
<10.228.48.0/21> to	<10.81.23.164>	[HTTPS]	[443]		                      AKS (aks-eu1-integra-multicanal-test) al KV          (kveu1datostest-01)


<10.81.5.6>	to <10.81.19.36>	      [TCP]	  [1433]		                    VM (vme1tstagedso03) al SSQL1-ODS   (db-srv-eu1-ofidig-test-01)
<10.81.5.6>	to <10.81.19.52>	      [TCP]	  [1433]		                    VM (vme1tstagedso03) al SSQL2-ODS   (db-srv-eu1-ofidig-test-02)
<10.81.5.6>	to <10.81.23.132>	      [TCP]	  [1433]		                    VM (vme1tstagedso03) al SSQL1-DATOS (db-srv-eu1-datos-test-01)


// ************************************************* APP SERVICE ************************************************* //
  // RESOURCES
  web-eu1-ofidig-test-01.azurewebsites.net (container) -> 10.81.19.73
  web-eu1-ofidig-test-02.azurewebsites.net (header)    -> 10.81.19.72
  web-eu1-ofidig-test-03.azurewebsites.net (menu)      -> 10.81.19.68
  web-eu1-ofidig-test-04.azurewebsites.net (module)    -> 10.81.19.71
  web-eu1-ofidig-test-05.azurewebsites.net (access)    -> 10.81.19.69
  web-eu1-ofidig-test-06.azurewebsites.net (6to)       -> 10.81.19.70
  web-eu1-ofidig-test-07.azurewebsites.net (7mo)       -> 10.81.19.70

  // VALID
  [nslookup web-eu1-ofidig-test-01.azurewebsites.net || nslookup 10.81.19.73]
  [nc -zv 10.81.19.73 443 || nc -zv web-eu1-ofidig-test-01.azurewebsites.net 443]

  [nslookup web-eu1-ofidig-test-02.azurewebsites.net || nslookup 10.81.19.72]
  [nc -zv 10.81.19.72 443 || nc -zv nslookup web-eu1-ofidig-test-02.azurewebsites.net 443]

  [nslookup web-eu1-ofidig-test-03.azurewebsites.net || nslookup 10.81.19.68]
  [nc -zv 10.81.19.68 443 || nc -zv web-eu1-ofidig-test-03.azurewebsites.net 443]

  [nslookup web-eu1-ofidig-test-04.azurewebsites.net || nslookup 10.81.19.71]
  [nc -zv 10.81.19.71 443 || nc -zv web-eu1-ofidig-test-04.azurewebsites.net 443]

  [nslookup web-eu1-ofidig-test-05.azurewebsites.net || nslookup 10.81.19.69]
  [nc -zv 10.81.19.69 443 || nc -zv web-eu1-ofidig-test-05.azurewebsites.net 443]

  [nslookup web-eu1-ofidig-test-06.azurewebsites.net || nslookup 10.81.19.70]
  [nc -zv 10.81.19.70 443 || nc -zv web-eu1-ofidig-test-06.azurewebsites.net 443]

  // TEST
  vm02 to as1 -> [resol: 'ok', con: 'no']
  vm02 to as2 -> [resol: 'ok', con: 'no']
  vm02 to as3 -> [resol: 'ok', con: 'no']
  vm02 to as4 -> [resol: 'ok', con: 'no']
  vm02 to as5 -> [resol: 'ok', con: 'no']
  vm02 to as6 -> [resol: 'ok', con: 'no']
  jum01 to as1 -> [resol: 'ok', con: 'no']
  jum01 to as2 -> [resol: 'ok', con: 'no']
  jum01 to as3 -> [resol: 'ok', con: 'no']
  jum01 to as4 -> [resol: 'ok', con: 'no']
  jum01 to as5 -> [resol: 'ok', con: 'no']
  jum01 to as6 -> [resol: 'ok', con: 'no']

// ************************************************* AZURE-SQL ************************************************* //
  // RESOURCES
  db-srv-eu1-ofidig-test-01.database.windows.net 10.81.19.36
  db-srv-eu1-ofidig-test-02.database.windows.net 10.81.19.52
  db-srv-eu1-datos-test-01.database.windows.net 10.81.23.132


  // CMDS
  [nslookup db-srv-eu1-ofidig-test-01.database.windows.net || nslookup 10.81.19.36]
  [nc -zv 10.81.19.36 1433 || nc -zv db-srv-eu1-ofidig-test-01.database.windows.net 1433]

  [nslookup db-srv-eu1-ofidig-test-02.database.windows.net || nslookup 10.81.19.52]
  [nc -zv 10.81.19.52 1433 || nc -zv db-srv-eu1-ofidig-test-02.database.windows.net 1433]

  [nslookup db-srv-eu1-datos-test-01.database.windows.net || nslookup 10.81.23.132]
  [nc -zv 10.81.23.132 1433 || nc -zv db-srv-eu1-datos-test-01.database.windows.net 1433]


  // VALID
  vm03 to sql1 -> [resol: 'ok', con: 'ok']
  vm03 to sql2 -> [resol: 'ok', con: 'ok']
  vm03 to sql3 -> [resol: 'no', con: 'no']
  akscn to sql1 -> [resol: 'ok', con: 'ok']
  akscn to sql2 -> [resol: 'ok', con: 'ok']
  aksmc to sql3 -> [resol: 'no', con: 'no']

// ************************************************* STORAGE ACCOUNT ************************************************* //
  // RESOURCES
  steu1ofidigapltest01.blob.core.windows.net    10.81.19.4
  steu1ofidigapltest02.blob.core.windows.net    10.81.19.20
  steu1ofidigsrvltest01.blob.core.windows.net   10.81.19.228

  // VALID
  [nslookup steu1ofidigapltest01.blob.core.windows.net || nslookup 10.81.19.4]
  [nc -zv 10.81.19.4 443 || nc -zv steu1ofidigapltest01.blob.core.windows.net 443]

  [nslookup steu1ofidigapltest02.blob.core.windows.net || nslookup 10.81.19.20]
  [nc -zv 10.81.19.20 443 || nc -zv steu1ofidigapltest02.blob.core.windows.net 443]

  [nslookup steu1ofidigsrvltest01.blob.core.windows.net || nslookup 10.81.19.228]
  [nc -zv 10.81.19.228 443 || nc -zv steu1ofidigsrvltest01.blob.core.windows.net 443]


  // VALID
  // vm02 to sa1 -> [resol: 'no', con: 'no'] --> nss
  // vm02 to sa2 -> [resol: 'no', con: 'no'] --> nss
  // vm02 to sa3 -> [resol: 'no', con: 'no'] --> nss
  aks to sa1 -> [resol: 'ok', con: 'ok']
  aks to sa2 -> [resol: 'ok', con: 'ok']
  aks to sa3 -> [resol: 'ok', con: 'ok']



// ************************************************* FUNCTION ************************************************* //
  // RESOURCES
  func-eu1-ofidig-test-01.azurewebsites.net -> 10.81.19.196

  // CMDS
  [nslookup func-eu1-ofidig-test-01.azurewebsites.net || nslookup 10.81.19.196]
  [nc -zv 10.81.19.196 443 || nc -zv func-eu1-ofidig-test-01.azurewebsites.net 443]


  // VALID
  // vm02 to fn  -> [resol: 'no', con: 'no'] --> nss
  akscn to fn -> [resol: 'ok', con: 'ok']

// ************************************************* KV ************************************************* //
  // RESOURCES
  kveu1ofidigtst01.vault.azure.net  10.81.19.132
  kveu1datostest-01.vault.azure.net 10.81.23.164

  // CMDS
  [nslookup kveu1ofidigtest01.vault.azure.net || nslookup 10.81.19.132]
  [nc -zv 10.81.19.132 443 || nc -zv kveu1ofidigtst01.vault.azure.net 443]

  [nslookup kveu1datostest-01.vault.azure.net || nslookup 10.81.23.164]
  [nc -zv 10.81.23.164 443 || nc -zv kveu1datostest-01.vault.azure.net 443]

  // VALID
  vm02 to kv1 -> [resol: 'no', con: 'ok']
  vm02 to kv2 -> [resol: 'no', con: 'ok']

  aksCn to kv1 -> [resol: 'ok', con: 'ok']
  aksMc to kv2 -> [resol: 'no', con: 'ok']


http://svc-ods-sp-notificationeventmgmt:9000/eventos/connect

// SOLICITAR:
https://fonts.googleapis.com/css2?family=Reboto:wght@300;400;500;700&display=swap



3c31259a-d2ed-46ee-8e5d-27097b4b01c2

nslookup wps-eastus-ofidig-desa-01.webpubsub.azure.com
nz -zv wps-eastus-ofidig-desa-01.webpubsub.azure.com 443
https://wps-eastus-ofidig-desa-01.webpubsub.azure.com


nz -zv 10.80.19.180 443

nslookup 10.80.19.180




curl -X OPTIONS https://aks.canal.oficinadigital.internal.psdesa.com.pe/eventos/connect \
  -H "Content-Type: application/json" \
  -H "x-correlation-id : 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2" \
  -H "x-request-id : 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2" \
  -H "usuarioaplicacion : user12" \
  -H "procesonegocio : consulta-maestro" \
  -H "nombreaplicacion : ODS" \
  -H "WebHook-Request-Origin: prueba-client" \
  -H "ce-signature: 123456789" \
  -H "ce-connectionid: conn-abc123" \
  -H "Cookie: refreshToken=eyJraWQiOiJjcGltY29yZV8wOTI1MjAxNSIsInZlciI6IjEuMCIsInppcCI6IkRlZmxhdGUiLCJzZXIiOiIxLjAifQ..F4Ep9CNfVMQNidFJ.JRUmURSa8FsKDqroafG90DrRrA2hOTA-Ie1Q3k_GAJbaLvTnBBn6fXq7T0Ho8pvPdlBZFhN-cQ7l7_3JzMFaFXJWqUgn69VmPUT-PFWEH6dvLPVdDTcFjTuPMIDi9VC03ZFPxMq-4N6PFMbQxqLyQxAXs4vakISnHo5tqVtZrXnqieAqEMg9A8DADfb76obpknqcLK36DJ5kTqkZ4Ur154OrMJ0ecZAL5GMdhFB-3cxIalu8pPOTM521J1NWZLTcc0U4ylJlLn6nf2orr5BGkH3rlyfvlFOwMn6G1q3cvW-iVjCrfbZiau3QFwrhX0FH7NX8LDSJNl6Fqvxna9W3G0kmkMZqN6ijZlJ8iAEmAZw3f6HkClII7QJ0ONmwiQTqCG-JbWz5bx5MinCuvkR10fT289U6z_WMcfMAe6A3E8KSydJry-CTbk7JbsZ9vu7Fv-bXBxyF_94ACBPjNUwIRtm4mz0S-P6EfU3xpNxjA5dDPjfD7mpkgOreifp1toP4GDm_hgTGBRMvhsRaesSQZSIjqipJK48S7q9-7ZJMzozCliJqencg_0EpPeMY0fa5k5yVKCX1.5H0up8a7h1cLM82kSCEBuw; accessToken=eyJhbGciOiJSUzI1NiIsImtpZCI6Ilg1ZVhrNHh5b2pORnVtMWtsMll0djhkbE5QNC1jNTdkTzZRR1RWQndhTmsiLCJ0eXAiOiJKV1QifQ.eyJhdWQiOiJmODMzZmViYS05YjIyLTQ2ZWYtOGY1OC02MjkyMjI4ZjliMTMiLCJpc3MiOiJodHRwczovL3BhY2lmaWNvZXBzYjJjZGVzYTAxLmIyY2xvZ2luLmNvbS84MzliNDAzZS05MmMzLTQ5MDgtODI4Yy0zN2Q2ZGU1ZDAzYzEvdjIuMC8iLCJleHAiOjE3NDE5NzM1NTIsIm5iZiI6MTc0MTk2OTk1Miwic3ViIjoiM2RhZTQ3ZTYtMDAwYS00N2EzLThjYTAtNGNlMWEwZTE1NjA2IiwibmFtZSI6IkdvZG95IE11w7FveiIsInRmcCI6IkIyQ18xX1NpZ25JbiIsIm5vbmNlIjoiZGVmYXVsdE5vbmNlIiwiYXpwIjoiZjgzM2ZlYmEtOWIyMi00NmVmLThmNTgtNjI5MjIyOGY5YjEzIiwidmVyIjoiMS4wIiwiaWF0IjoxNzQxOTY5OTUyfQ.B-Xr8P9LbvHH5kVCyZJKiAGbAsKZrdT8dnHc8XakrULSM8tIKWM2f8tMKyYZihSxO282XguukfaKRkDyZdF96vowf_O8TBkOYcpOEhqECvDkDONkRDe88A97FjJkn7u7chHGj_ZFOVHTZ44OnFUowTpmU6BFnepmu-hSa9noVgAgSqyPiIOOdVfGyrIVD6eBbx7stuC8xN0lv1enZC5oQOtj_U_-cHtL73uecIlbkMj50qov1Tumh49mA4hnr3ca-FewAHaUhQpBl7Bmoho4TqtLcHU8Cs2NbtKDCrD0WyiftG4CwIwIBlDlB7XySKom_Tc3mYrp5Cka6ik8h12Efw"
  // -H "Ocp-Apim-Subscription-Key : 3d6034bf2b9d4c92977c4bab76483c13" \
  // -d '{
  //   "claims": {
  //     "idUsuario": ["Godoy Muñoz"]
  //   }
  // }'


/usuarios/perfiles



curl -k -X OPTIONS https://aks.canal.oficinadigital.internal.psdesa.com.pe/ms-sp-registro-eventoconexion-eps/od/registro-de-evento/v1/notificacion/eventos/connect \
  -H "Origin: http://localhost" \
  -H "Access-Control-Request-Method: POST" \
  -H "Access-Control-Request-Headers: WebHook-Request-Origin, WebHook-Signature, Content-Type, ce-connectionid, ce-signature" 



ms-sp-registro-eventoconexion-eps/od/registro-de-evento/v1/notificacion


10.80.19.180
10.80.19.180



<10.228.40.0/21> to	<10.81.19.36>	  [TCP]	  [1433]		                    AKS (aks-eu1-integra-canal-test) al SSQL1-ODS   (db-srv-eu1-ofidig-test-01)
<10.228.40.0/21> to	<10.81.19.52>	  [TCP]	  [1433]		                    AKS (aks-eu1-integra-canal-test) al SSQL2-ODS   (db-srv-eu1-ofidig-test-02)	
<10.228.40.0/21> to	<10.81.23.132>	[TCP]	  [1433]		                    AKS (aks-eu1-integra-canal-test) al SSQL1-DATOS (db-srv-eu1-datos-test-01)
<10.228.40.0/21> to	<10.81.19.4>	  [HTTPS]	[443]		                      AKS (aks-eu1-integra-canal-test) al SA1-ODS     (steu1ofidigapltest01)
<10.228.40.0/21> to	<10.81.19.20>	  [HTTPS]	[443]		                      AKS (aks-eu1-integra-canal-test) al SA2-ODS     (steu1ofidigapltest02)



nslookup db-srv-eu1-ofidig-test-01.database.windows.net





STORAGE -> 

VNET/SNET -> vnet-eu1-adm-devsecops-cross/sn-eu1-plat-adm-devsecops-desa
STORAGE_ACCOUNT -> steu1ofidigfilesdesa01


vnet-eu1-adm-devsecops-cross/sn-eu1-plat-adm-devsecops-test
vnet-eu1-adm-devsecops-cross/sn-eu1-plat-adm-devsecops-prod




saul -> 
dani/celso -> para que se pueda agregar la ip a la whitelist.

ext-jescobars-mejco-vm-est@vme1desagedso02:~$ kubectl -n ns-desa-cn-ods-oficinadigitalsalud top pods
NAME                                                              CPU(cores)   MEMORY(bytes)
ms-od360-oc-ne-gestion-siniestrodetalletrama-ssd-6c65d6c686x4x7   1m           322Mi
ms-od360-oc-ne-gestion-siniestrotrama-ssd-588c5465c9-cjjvv        1m           316Mi
ods-ne-plottransregister-6697ff995d-k9h7m                         1m           317Mi
ods-ne-validatebssrule-6944bbdc4f-bf8md                           1m           323Mi
ods-secretssync-8d9bbf78c-vcm9n                                   0m           0Mi
ods-sp-filemanagement-668bb74c76-8zz85                            1m           250Mi
ods-sp-notificationeventmgmt-6fd9497bb6-bl76b                     1m           309Mi
ods-sp-notificationregister-675cf6cdd-xgmdj                       1m           276Mi
ods-sp-notificationrequest-5b844cd569-47fp7                       1m           312Mi
ods-un-parameters-54494f74b4-lwr52                                1m           313Mi
ods-un-rolepermission-5d6d5575f6-5z969                            1m           331Mi
ods-un-sinistermanagement-69d9d84fb8-frxl7                        1m           325Mi
ods-un-sinisterparameter-667b7786f8-g2p9p                         1m           333Mi
ods-un-sinisterregister-86bf975545-f5qzz                          1m           313Mi
ods-un-userauth-54dbc64cf5-ljxp2                                  1m           329Mi
ods-un-validatesinisterstructure-66974fff87-jn67z                 1m           330Mi
srv-ms-od360-oc-un-dsc-sincroniza-usuariob2c-ssd-56dddbbfcskd84   1m           301Mi
ext-jescobars-mejco-vm-est@vme1desagedso02:~$




NAME                                               CPU(cores)   MEMORY(bytes)
ods-ne-plottransregister-57f77bf7f7-jgtcv          1m           319Mi
ods-ne-validatebssrule-5556f856df-m7kdq            1m           386Mi
ods-secretssync-86bc897d76-ftnk9                   0m           0Mi
ods-sp-filemanagement-79b99d56c5-pzqvf             1m           313Mi
ods-sp-notificationrequest-7798899f9-9t4v7         1m           315Mi
ods-un-parameters-65c97ccfdb-jm4s4                 1m           344Mi
ods-un-rolepermission-ffd6bf8c9-26kt6              1m           324Mi
ods-un-sinistermanagement-84575d6d96-fkpwt         1m           329Mi
ods-un-sinisterparameters-545d7ff76c-8zvzt         1m           324Mi
ods-un-sinisterregister-5fcfdbc77f-w542b           1m           323Mi
ods-un-userauth-cb6b6c665-8kf4v                    1m           311Mi
ods-un-validatesinisterstructure-f77dc98c8-l2s9h   1m           320Mi



https://steu1ofidigfilesdesa01.blob.core.windows.net/cn-ofidig-login/customize-ui.html
APIM_DESA_OD360__OCP_APIM_SUBSCRIPTION_KEY=3d6034bf2b9d4c92977c4bab76483c13
APIM_TEST_OD360__OCP_APIM_SUBSCRIPTION_KEY=2f0c43ad3fbe44e89c99b2ad47e26f0b
APIM_PROD_OD360__OCP_APIM_SUBSCRIPTION_KEY=a8668047fa6c45988701e346165e90f8