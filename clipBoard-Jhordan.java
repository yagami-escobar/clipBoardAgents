// ACS:
'AZURE' -> ext.jescobars.soaint@pacificosegurossalud.com.pe/Y*****2024$
'GH' -> ext-jescobars-soaint_psalud



// ************************************************* AZURE ************************************************* //
az login --service-principal -u 09e98158-6d55-488a-bcf0-b11e8fa209f7 --password=XXXXXXLuT5XPhVY0_XXXXFkzqafqjr2DLisgQXXX --tenant XXXa9021-e6f2-49e1-88c2-e90b79214XXX --allow-no-subscription

// ENVS
export AZURE_DEVOPS_EXT_TLS_NO_VERIFY=1
export AZURE_CLI_DISABLE_CONNECTION_VERIFICATION=1


'STORAGE ACCOUNTS (SAs)':
'az storage account list -g rg-eu1-land-ofidig-desa-01 -o table' -> list sa

// LIST CNTs
az storage container list --account-name steu1lndofidigbsedesa01 --auth-mode login -o table
az storage container list --account-name steu1odintfuncdesa01 --auth-mode login -o table
az storage container list --account-name steu1ofidigfilesdesa01 --auth-mode login -o table


// CREATE CNTs
az storage container create --resource-group rg-eu1-land-ofidig-desa-01 --account-name steu1ofidigfilesdesa01 --name cn-ofidig-login

// CHANGE RULE 
az storage account update \
  --name steu1ofidigfilesdesa01  \
  --resource-group rg-eu1-land-ofidig-desa-01 \
  --default-action Allow



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


// ------------------------------ PROD ------------------------------ //




// ************************************************* ACR ************************************************* //

// ------------------------------ DESA ------------------------------ //
'name': rg-eu1-plat-integra-desa/acrseu1integradesa -> (10.227.5.73, 10.227.5.74)


// ------------------------------ TEST ------------------------------ //
'name': rg-eu1-plat-integra-test-01/acrseu1integratest -> 

// ------------------------------ PROD ------------------------------ //
'name': rg-eu1-plat-integra-prd-01/acrseu1integraprd


// ++++++++++++++++++++++++++++++++++ CMDs ++++++++++++++++++++++++++++++++++ //
az acr login -n acrseu1integradesa


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


// GH
type -p curl >/dev/null || sudo apt update && sudo apt install curl -y
curl -fsSL https://cli.github.com/packages/githubcli-archive-keyring.gpg | sudo tee /usr/share/keyrings/githubcli-archive-keyring.gpg > /dev/null
echo "deb [signed-by=/usr/share/keyrings/githubcli-archive-keyring.gpg] https://cli.github.com/packages stable main" | sudo tee /etc/apt/sources.list.d/github-cli.list > /dev/null
sudo apt update
sudo apt install gh -y

aks-eu1-integra-canal-desa-dns-ail0qged.d5d0a1c6-25db-47b7-aea4-b771c82bb576.private.eastus.azmk8s.io

VERSION=$(curl -s https://api.github.com/repos/mikefarah/yq/releases/latest | grep -oP '"tag_name": "\K(.*)(?=")')
wget https://github.com/mikefarah/yq/releases/latest/download/yq_linux_amd64 -O /usr/local/bin/yq
chmod +x /usr/local/bin/yq





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
  [nc -zv 10.80.19.164 443 || nc -zv web-eu1-ofidig-test-01.azurewebsites.net 443]

  [nslookup web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net || nslookup 10.80.19.167]
  [nc -zv 10.80.19.167 443 || nc -zv web-eu1-ofidig-test-02.azurewebsites.net 443]

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











// FALTANTE
'AKS -> DB1'      -> aksvm02[resolucion y con efimera] y vm03[resolucion y 0-con]
'AKS -> DB2'      -> aksvm02[resolucion y con efimera] y vm03 [resolucion y 0-con]
'AKS -> DB3'      -> aksvm02[resolucion y con efimera] y vm03 [resolucion y 0-con]
'AKS -> Function' -> resolucion y con efimera. [nslookup func-eu1-ofidig-test-01.azurewebsites.net, nc -zv 10.81.19.196 443]
'AKS -> SA1'      -> resolucion y con efimera. [nslookup steu1ofidigapltest01.blob.core.windows.net, ]
'AKS -> SA2'      -> resolucion y con efimera
'AKS -> SA3'      -> resolucion y con efimera


aks-eu1-integra-canal-desa-dns-ail0qged.d5d0a1c6-25db-47b7-aea4-b771c82bb576.private.eastus.azmk8s.io
aks-eu1-integra-canal-test-dns-qfkyq9fo.a815f902-7e06-4ae2-a008-726730d04a3f.private.eastus.azmk8s.io


az aks get-credentials --resource-group rg-eu1-plat-integra-test-01 --name aks-eu1-integra-canal-test --overwrite-existing

'create pod' -> kubectl -n default run netx --image=jrecord/nettools --restart=Never -- sleep 3600
 'connect'    -> kubectl -n default exec -it netx -- /bin/bash



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












🚀 Cómo hacer que Bash-it autocomplete como Oh My Zsh
Si quieres que Bash recuerde y sugiera comandos previos automáticamente, necesitas instalar:
1️⃣ bash-autosuggestions → Para sugerencias de comandos anteriores.
2️⃣ bash-history-search → Para buscar comandos en el historial fácilment

git clone https://github.com/mscdex/bash-autosuggestions ~/.bash_it/custom/plugins/bash-autosuggestions
echo 'source ~/.bash_it/custom/plugins/bash-autosuggestions/bash-autosuggestions.sh' >> ~/.bashrc

bash-it enable plugin history


echo 'HISTFILESIZE=20000' >> ~/.bashrc
echo 'HISTSIZE=20000' >> ~/.bashrc
echo 'HISTCONTROL=ignoreboth:erasedups' >> ~/.bashrc



BACKLOG(STATUS):
vm02 to appsvc1  -> [resol: 'ok', con: 'ok']
vm02 to appsvc2  -> [resol: 'ok', con: 'ok']
vm02 to appsvc3  -> [resol: 'ok', con: 'ok']
vm02 to appsvc4  -> [resol: 'ok', con: 'ok']
vm02 to appsvc5  -> [resol: 'ok', con: 'ok']
vm02 to appsvc6  -> [resol: 'ok', con: 'ok']
jum01 to appsvc1 -> [resol: 'ok', con: 'ok']
jum01 to appsvc2 -> [resol: 'ok', con: 'ok']
jum01 to appsvc3 -> [resol: 'ok', con: 'ok']
jum01 to appsvc4 -> [resol: 'ok', con: 'ok']
jum01 to appsvc5 -> [resol: 'ok', con: 'ok']
jum01 to appsvc6 -> [resol: 'ok', con: 'ok']


akscn to sql1(ods)    -> [resol: 'ok', con: 'ok']
akscn to sql2(ods)    -> [resol: 'ok', con: 'ok']
akscn to sa1          -> [resol: 'ok', con: 'ok']
akscn to sa2          -> [resol: 'ok', con: 'ok']
akscn to sa3          -> [resol: 'ok', con: 'ok']
akscn to fn           -> [resol: 'ok', con: 'ok']
akscn to kv(ods)      -> [resol: 'ok', con: 'ok']
aksmc to sql1(datos)  -> [resol: 'ok', con: 'no']
aksmc to kv(datos)    -> [resol: 'ok', con: 'ok']

vm03 to sql1(ods)   -> [resol: 'ok', con: 'ok']
vm03 to sql1(ods)   -> [resol: 'ok', con: 'ok']
vm03 to sql1(datos) -> [resol: 'ok', con: 'no']




sbeu1integradesa.privatelink.servicebus.windows.net 10.227.5.69



az artifacts universal download \
  --organization https://dev.azure.com/Org-NSS-PacificoSalud/NSS-PD-ODS-OficinaDigitalSalud \
  --feed art-desa-fd-be-ns-centralizerBackAll \
  --name ps-common-back \
  --version 1.0.10 \
  --path .



az artifacts universal publish \
  --organization https://dev.azure.com/Org-NSS-PacificoSalud/NSS-PD-ODS-OficinaDigitalSalud \
  --feed art-test-fd-be-ns-centralizerBackAll \
  --name ps-common-back \
  --version 1.0.10 \
  --description "Migrado desde feed-desa" \
  --path .



  az config set extension.use_dynamic_install=yes_without_prompt




export PIP_NO_VERIFY_CERTS=1
export CURL_CA_BUNDLE=""


python3 -m venv myenv
source myenv/bin/activate
pip install azure-devops==7.0.0b4





ext-jescobars-mejco-vm-est@vme1desagedso02:~/temp$ az config set extension.use_dynamic_install=yes_without_prompt
Command group 'config' is experimental and under development. Reference and support levels: https://aka.ms/CLI_refstatus
ext-jescobars-mejco-vm-est@vme1desagedso02:~/temp$ az extension add --name azure-devops
Please ensure you have network connection. Error detail: HTTPSConnectionPool(host='github.com', port=443): Max retries exceeded with url: /Azure/azure-devops-cli-extension/releases/download/20240514.1/azure_devops-1.0.1-py2.py3-none-any.whl (Caused by SSLError(SSLCertVerificationError(1, '[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed: self signed certificate in certificate chain (_ssl.c:1000)')))
ext-jescobars-mejco-vm-est@vme1desagedso02:~/temp$ export AZURE_CLI_DISABLE_CONNECTION_VERIFICATION=1
ext-jescobars-mejco-vm-est@vme1desagedso02:~/temp$ az extension add --name azure-devops
/opt/az/lib/python3.12/site-packages/urllib3/connectionpool.py:1063: InsecureRequestWarning: Unverified HTTPS request is being made to host 'aka.ms'. Adding certificate verification is strongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
  warnings.warn(
/opt/az/lib/python3.12/site-packages/urllib3/connectionpool.py:1063: InsecureRequestWarning: Unverified HTTPS request is being made to host 'azcliextensionsync.blob.core.windows.net'. Adding certificate verification is strongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
  warnings.warn(
/opt/az/lib/python3.12/site-packages/urllib3/connectionpool.py:1063: InsecureRequestWarning: Unverified HTTPS request is being made to host 'github.com'. Adding certificate verification is strongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
  warnings.warn(
/opt/az/lib/python3.12/site-packages/urllib3/connectionpool.py:1063: InsecureRequestWarning: Unverified HTTPS request is being made to host 'objects.githubusercontent.com'. Adding certificate verification is strongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
  warnings.warn(
An error occurred. Pip failed with status code 1. Use --debug for more information.



https://github.com/Azure/azure-devops-cli-extension/releases/download/20240514.1/azure_devops-1.0.1-py2.py3-none-any.whl



root@vme1desagedso02:/home/ext-jescobars-mejco-vm-est/temp# az extension add --source azure_devops-1.0.1-py2.py3-none-any.whl --debug
cli.knack.cli: Command arguments: ['extension', 'add', '--source', 'azure_devops-1.0.1-py2.py3-none-any.whl', '--debug']
cli.knack.cli: __init__ debug log:
Enable color in terminal.
cli.knack.cli: Event: Cli.PreExecute []
cli.knack.cli: Event: CommandParser.OnGlobalArgumentsCreate [<function CLILogging.on_global_arguments at 0x7f795bb3f740>, <function OutputProducer.on_global_arguments at 0x7f795b88e700>, <function CLIQuery.on_global_arguments at 0x7f795b8d3c40>]
cli.knack.cli: Event: CommandInvoker.OnPreCommandTableCreate []
cli.azure.cli.core: Modules found from index for 'extension': ['azure.cli.command_modules.extension']
cli.azure.cli.core: Loading command modules:
cli.azure.cli.core: Name                  Load Time    Groups  Commands
cli.azure.cli.core: extension                 0.001         1         7
cli.azure.cli.core: Total (1)                 0.001         1         7
cli.azure.cli.core: Loaded 1 groups, 7 commands.
cli.azure.cli.core: Found a match in the command table.
cli.azure.cli.core: Raw command  : extension add
cli.azure.cli.core: Command table: extension add
cli.knack.cli: Event: CommandInvoker.OnPreCommandTableTruncate [<function AzCliLogging.init_command_file_logging at 0x7f795ac6ade0>]
cli.azure.cli.core.azlogging: metadata file logging enabled - writing logs to '/root/.azure/commands/2025-04-23.15-41-06.extension_add.3385392.log'.
az_command_data_logger: command args: extension add --source {} --debug
cli.knack.cli: Event: CommandInvoker.OnPreArgumentLoad [<function register_global_subscription_argument.<locals>.add_subscription_parameter at 0x7f795ace6200>]
cli.knack.cli: Event: CommandInvoker.OnPostArgumentLoad []
cli.knack.cli: Event: CommandInvoker.OnPostCommandTableCreate [<function register_ids_argument.<locals>.add_ids_arguments at 0x7f795ace62a0>, <function register_cache_arguments.<locals>.add_cache_arguments at 0x7f795ace63e0>, <function register_upcoming_breaking_change_info.<locals>.update_breaking_change_info at 0x7f795ace6480>]
cli.knack.cli: Event: CommandInvoker.OnCommandTableLoaded []
cli.knack.cli: Event: CommandInvoker.OnPreParseArgs []
cli.knack.cli: Event: CommandInvoker.OnPostParseArgs [<function OutputProducer.handle_output_argument at 0x7f795b88e7a0>, <function CLIQuery.handle_query_parameter at 0x7f795b8d3ce0>, <function register_ids_argument.<locals>.parse_ids_arguments at 0x7f795ace6340>]
Are you sure you want to install this extension? (y/n): y
cli.azure.cli.core.extension.operations: Extension source is url? False
cli.azure.cli.core.extension.operations: Validating the extension /home/ext-jescobars-mejco-vm-est/temp/azure_devops-1.0.1-py2.py3-none-any.whl
cli.azure.cli.core.extension.operations: Validation successful on /home/ext-jescobars-mejco-vm-est/temp/azure_devops-1.0.1-py2.py3-none-any.whl
cli.azure.cli.core.extension.operations: Linux distro check: Reading from: /etc/apt/sources.list.d/azure-cli.list
cli.azure.cli.core.extension.operations: Linux distro check: An error occurred while checking linux distribution version source list consistency.
cli.azure.cli.core.extension.operations: [Errno 2] No such file or directory: '/etc/apt/sources.list.d/azure-cli.list'
cli.azure.cli.core.extension.operations: Executing pip with args: ['install', '--target', '/root/.azure/cliextensions/azure-devops', '/home/ext-jescobars-mejco-vm-est/temp/azure_devops-1.0.1-py2.py3-none-any.whl']
cli.azure.cli.core.extension.operations: Running: ['/opt/az/bin/python3', '-m', 'pip', 'install', '--target', '/root/.azure/cliextensions/azure-devops', '/home/ext-jescobars-mejco-vm-est/temp/azure_devops-1.0.1-py2.py3-none-any.whl', '--disable-pip-version-check', '--no-cache-dir']
cli.azure.cli.core.extension.operations: Processing ./azure_devops-1.0.1-py2.py3-none-any.whl
WARNING: Retrying (Retry(total=4, connect=None, read=None, redirect=None, status=None)) after connection broken by 'SSLError(SSLCertVerificationError(1, '[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed: self signed certificate in certificate chain (_ssl.c:1000)'))': /simple/distro/
WARNING: Retrying (Retry(total=3, connect=None, read=None, redirect=None, status=None)) after connection broken by 'SSLError(SSLCertVerificationError(1, '[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed: self signed certificate in certificate chain (_ssl.c:1000)'))': /simple/distro/
WARNING: Retrying (Retry(total=2, connect=None, read=None, redirect=None, status=None)) after connection broken by 'SSLError(SSLCertVerificationError(1, '[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed: self signed certificate in certificate chain (_ssl.c:1000)'))': /simple/distro/
WARNING: Retrying (Retry(total=1, connect=None, read=None, redirect=None, status=None)) after connection broken by 'SSLError(SSLCertVerificationError(1, '[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed: self signed certificate in certificate chain (_ssl.c:1000)'))': /simple/distro/
WARNING: Retrying (Retry(total=0, connect=None, read=None, redirect=None, status=None)) after connection broken by 'SSLError(SSLCertVerificationError(1, '[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed: self signed certificate in certificate chain (_ssl.c:1000)'))': /simple/distro/
Could not fetch URL https://pypi.org/simple/distro/: There was a problem confirming the ssl certificate: HTTPSConnectionPool(host='pypi.org', port=443): Max retries exceeded with url: /simple/distro/ (Caused by SSLError(SSLCertVerificationError(1, '[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed: self signed certificate in certificate chain (_ssl.c:1000)'))) - skipping
INFO: pip is looking at multiple versions of azure-devops to determine which version is compatible with other requirements. This could take a while.
ERROR: Could not find a version that satisfies the requirement distro==1.3.0 (from azure-devops) (from versions: none)
ERROR: No matching distribution found for distro==1.3.0

cli.azure.cli.core.extension.operations: Command '['/opt/az/bin/python3', '-m', 'pip', 'install', '--target', '/root/.azure/cliextensions/azure-devops', '/home/ext-jescobars-mejco-vm-est/temp/azure_devops-1.0.1-py2.py3-none-any.whl', '--disable-pip-version-check', '--no-cache-dir']' returned non-zero exit status 1.
cli.azure.cli.core.extension.operations: Pip failed so deleting anything we might have installed at /root/.azure/cliextensions/azure-devops
cli.azure.cli.core.azclierror: Traceback (most recent call last):
  File "/opt/az/lib/python3.12/site-packages/knack/cli.py", line 233, in invoke
    cmd_result = self.invocation.execute(args)
                 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/azure/cli/core/commands/__init__.py", line 666, in execute
    raise ex
  File "/opt/az/lib/python3.12/site-packages/azure/cli/core/commands/__init__.py", line 734, in _run_jobs_serially
    results.append(self._run_job(expanded_arg, cmd_copy))
                   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/azure/cli/core/commands/__init__.py", line 703, in _run_job
    result = cmd_copy(params)
             ^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/azure/cli/core/commands/__init__.py", line 336, in __call__
    return self.handler(*args, **kwargs)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/azure/cli/core/commands/command_operation.py", line 120, in handler
    return op(**command_args)
           ^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/azure/cli/command_modules/extension/custom.py", line 16, in add_extension_cmd
    return add_extension(cli_ctx=cmd.cli_ctx, source=source, extension_name=extension_name, index_url=index_url,
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/azure/cli/core/extension/operations.py", line 343, in add_extension
    extension_name = _add_whl_ext(cli_ctx=cmd_cli_ctx, source=source, ext_sha256=ext_sha256,
                     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/azure/cli/core/extension/operations.py", line 172, in _add_whl_ext
    raise CLIError('An error occurred. Pip failed with status code {}. '
knack.util.CLIError: An error occurred. Pip failed with status code 1. Use --debug for more information.

cli.azure.cli.core.azclierror: An error occurred. Pip failed with status code 1. Use --debug for more information.
az_command_data_logger: An error occurred. Pip failed with status code 1. Use --debug for more information.
cli.knack.cli: Event: Cli.PostExecute [<function AzCliLogging.deinit_cmd_metadata_logging at 0x7f795ac6b060>]
az_command_data_logger: exit code: 1
cli.__main__: Command ran in 103.705 seconds (init: 0.125, invoke: 103.580)
telemetry.main: Begin splitting cli events and extra events, total events: 1
telemetry.client: Accumulated 0 events. Flush the clients.
telemetry.main: Finish splitting cli events and extra events, cli events: 1
telemetry.save: Save telemetry record of length 3938 in cache file under /root/.azure/telemetry/20250423154250537
telemetry.main: Begin creating telemetry upload process.
telemetry.process: Creating upload process: "/opt/az/bin/python3 /opt/az/lib/python3.12/site-packages/azure/cli/telemetry/__init__.py /root/.azure /root/.azure/telemetry/20250423154250537"
telemetry.process: Return from creating process 3385952
telemetry.main: Finish creating telemetry upload process.



XQh8Q~n52S5NYcZ6drEiUAIUCkaFWpptbWIB

pip install azure-devops


https://pypi.org/project/azure-devops/#files:~:text=azure%2Ddevops%2D7.1.0b4.tar.gz





root@vme1desagedso02:/home/ext-jescobars-mejco-vm-est/temp# /opt/az/bin/python3.12 -m pip install azure-devops-7.1.0b4.tar.gz
Processing ./azure-devops-7.1.0b4.tar.gz
Could not fetch URL https://pypi.org/simple/pip/: There was a problem confirming the ssl certificate: HTTPSConnectionPool(host='pypi.org', port=443): Max retries exceeded with url: /simple/pip/ (Caused by SSLError(SSLCertVerificationError(1, '[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed: self signed certificate in certificate chain (_ssl.c:1000)'))) - skipping
ERROR: Exception:
Traceback (most recent call last):
  File "/opt/az/lib/python3.12/tarfile.py", line 1910, in gzopen
    t = cls.taropen(name, mode, fileobj, **kwargs)
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/tarfile.py", line 1887, in taropen
    return cls(name, mode, fileobj, **kwargs)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/tarfile.py", line 1745, in __init__
    self.firstmember = self.next()
                       ^^^^^^^^^^^
  File "/opt/az/lib/python3.12/tarfile.py", line 2670, in next
    raise e
  File "/opt/az/lib/python3.12/tarfile.py", line 2643, in next
    tarinfo = self.tarinfo.fromtarfile(self)
              ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/tarfile.py", line 1297, in fromtarfile
    buf = tarfile.fileobj.read(BLOCKSIZE)
          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/gzip.py", line 324, in read
    return self._buffer.read(size)
           ^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/_compression.py", line 68, in readinto
    data = self.read(len(byte_view))
           ^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/gzip.py", line 527, in read
    if not self._read_gzip_header():
           ^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/gzip.py", line 496, in _read_gzip_header
    last_mtime = _read_gzip_header(self._fp)
                 ^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/gzip.py", line 456, in _read_gzip_header
    raise BadGzipFile('Not a gzipped file (%r)' % magic)
gzip.BadGzipFile: Not a gzipped file (b'<!')

The above exception was the direct cause of the following exception:

Traceback (most recent call last):
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/cli/base_command.py", line 106, in _run_wrapper
    status = _inner_run()
             ^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/cli/base_command.py", line 97, in _inner_run
    return self.run(options, args)
           ^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/cli/req_command.py", line 67, in wrapper
    return func(self, options, args)
           ^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/commands/install.py", line 386, in run
    requirement_set = resolver.resolve(
                      ^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/resolution/resolvelib/resolver.py", line 76, in resolve
    collected = self.factory.collect_root_requirements(root_reqs)
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/resolution/resolvelib/factory.py", line 545, in collect_root_requirements
    reqs = list(
           ^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/resolution/resolvelib/factory.py", line 501, in _make_requirements_from_install_req
    cand = self._make_base_candidate_from_link(
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/resolution/resolvelib/factory.py", line 233, in _make_base_candidate_from_link
    self._link_candidate_cache[link] = LinkCandidate(
                                       ^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/resolution/resolvelib/candidates.py", line 304, in __init__
    super().__init__(
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/resolution/resolvelib/candidates.py", line 159, in __init__
    self.dist = self._prepare()
                ^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/resolution/resolvelib/candidates.py", line 236, in _prepare
    dist = self._prepare_distribution()
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/resolution/resolvelib/candidates.py", line 315, in _prepare_distribution
    return preparer.prepare_linked_requirement(self._ireq, parallel_builds=True)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/operations/prepare.py", line 527, in prepare_linked_requirement
    return self._prepare_linked_requirement(req, parallel_builds)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/operations/prepare.py", line 598, in _prepare_linked_requirement
    local_file = unpack_url(
                 ^^^^^^^^^^^
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/operations/prepare.py", line 180, in unpack_url
    unpack_file(file.path, location, file.content_type)
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/utils/unpacking.py", line 326, in unpack_file
    untar_file(filename, location)
  File "/opt/az/lib/python3.12/site-packages/pip/_internal/utils/unpacking.py", line 179, in untar_file
    tar = tarfile.open(filename, mode, encoding="utf-8")  # type: ignore
          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/tarfile.py", line 1855, in open
    return func(name, filemode, fileobj, **kwargs)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/opt/az/lib/python3.12/tarfile.py", line 1914, in gzopen
    raise ReadError("not a gzip file") from e
tarfile.ReadError: not a gzip file



https://files.pythonhosted.org/packages/e1/f9/495982345252dc7a15ac632e038be1f975ca0d2f25abfe8f8d908569141d/azure-devops-7.1.0b4.tar.gz



root@vme1desagedso02:/home/ext-jescobars-mejco-vm-est/temp# tar -tzf azure-devops-7.1.0b4.tar.gz

gzip: stdin: not in gzip format
tar: Child returned status 1
tar: Error is not recoverable: exiting now
root@vme1desagedso02:/home/ext-jescobars-mejco-vm-est/temp#







https://oficinadigital-contenedor.testpacificosegurossalud.com.pe/



Policy -> Product

API Validar Session -> ActiveSession = true



// WEBS DESA

  web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net (container) -> 10.80.19.164
  web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net (header)    -> 10.80.19.167
  web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net (menu)      -> 10.80.19.165
  web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net (module)    -> 10.80.19.166
  web-eu1-nodelnx-ofidig-desa-05.azurewebsites.net (access)    -> 10.80.19.168

// WEBS TEST

// FRONT-CONTAINER
web-eu1-ofidig-test-01.azurewebsites.net
https://oficinadigital-header.testpacificosegurossalud.com.pe/
https://eastus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://eastus.livediagnostics.monitor.azure.com/;ApplicationId=a7a9488a-893f-49f0-92ed-3f8a27317e4a

// MF-HEADER
web-eu1-ofidig-test-02.azurewebsites.net
https://oficinadigital-header.testpacificosegurossalud.com.pe/
appinsght-web-eu1-ofidig-test-02
https://eastus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://eastus.livediagnostics.monitor.azure.com/;ApplicationId=a7a9488a-893f-49f0-92ed-3f8a27317e4a

// MF-MENU
web-eu1-ofidig-test-03.azurewebsites.net
https://oficinadigital-menu.testpacificosegurossalud.com.pe/
appinsght-web-eu1-ofidig-test-03  

// MF-MODULE
web-eu1-ofidig-test-04.azurewebsites.net
https://oficinadigital-opcion.testpacificosegurossalud.com.pe/
appinsght-web-eu1-ofidig-test-04

// MF-ACCESS
web-eu1-ofidig-test-05.azurewebsites.net
https://oficinadigital-autorizacion.testpacificosegurossalud.com.pe/
appinsght-web-eu1-ofidig-test-05



ext_gmunozs_softek/Zatak1665!
