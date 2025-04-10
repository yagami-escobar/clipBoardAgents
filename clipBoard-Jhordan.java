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
