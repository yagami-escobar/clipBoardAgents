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

// ************************************************* SAs ************************************************* //
// LIST SA
steu1ofidigfilesdesa01 -> pe-steu1ofidigfilesdesa-01 -> 10.80.19.68 -> vnet-eu1-ofidig-datos-desa/sn-eu1-ofidig-datos-pe-files-desa-01
steu1odintfuncdesa01   -> pe-steu1odintfuncdesa-01   -> 10.80.19.52 -> vnet-eu1-ofidig-integra-desa/sn-eu1-ofidig-pe-integra-desa-01


// ++++++++++++++++++++++++++++++++++ VALIDATE ++++++++++++++++++++++++++++++++++ //
'X' nslookup steu1ofidigfilesdesa01.blob.core.windows.net 
'X' nc -zv steu1ofidigfilesdesa01.blob.core.windows.net 443 || telnet

'X' nslookup steu1odintfuncdesa01.blob.core.windows.net
'X' nc -zv steu1ofidigfilesdesa01.blob.core.windows.net 443


// ************************************************* FN ************************************************* //
func-eu1-nodelnx-ofidigi-desa-01 -> pe-funceu1-ofidigi-desa-01 -> 10.80.19.53 -> vnet-eu1-ofidig-integra-desa/sn-eu1-ofidig-pe-integra-desa-01


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


// ************************************************* SQLDB ************************************************* //
// --------------------------------- DEV --------------------------------- //
'AKS CN':
	// OFIDIG
	'VALID 1 (AGENT)' ->  nslookup db-srv-eu1-ofidig-desa-01.database.windows.net -> agent03 (20.62.132.162 ) || 'subs: nss-land-oficinadigital'
	'VALID 2 (AGENT)' ->  nc -zv db-srv-eu1-ofidig-desa-01.database.windows.net   -> ''

  'VALID 1 (AGENT)' ->  nslookup db-srv-eu1-ofidig-desa-02.database.windows.net	-> agent03	(20.62.132.162)	|| 'subs: nss-land-oficinadigital'
	'VALID 2 (AGENT)' ->  nc -zv db-srv-eu1-ofidig-desa-02.database.windows.net   -> ''
	
  'VALID 1 (AGENT)' ->  nslookup db-srv-eu1-datos-desa-01.database.windows.net	-> agent03	(20.62.132.162) || 'subs: nss-plat-datos'
	'VALID 2 (AGENT)' ->  nc -zv db-srv-eu1-datos-desa-01.database.windows.net    -> ''
	

	// INTEGRA
	'VALID 1 (AGENT)' -> nslookup sqlsv-eastus-canal-desa-01.database.windows.net -> agent03 (10.227.2.68) || 'subs: nss-plat-integracion'
  'VALID 2 (AGENT)' -> nc -zv sqlsv-eastus-canal-desa-01.database.windows.net   -> 
  
  
  'VALID 1 (AGENT)' -> sqlsv-eastus-multicanal-desa-01.database.windows.net     -> agent03 (10.227.2.4)  || 'subs: nss-plat-integracion'
  'VALID 2 (AGENT)' -> nc -zv sqlsv-eastus-canal-desa-01.database.windows.net   -> 

// --------------------------------- TEST --------------------------------- //




// --------------------------------- PROD --------------------------------- //



// ++++++++++++++++++++++++++++++++++ VALIDATE ++++++++++++++++++++++++++++++++++ //




// ************************************************* APP SERVICE ************************************************* //
// --------------------------------- DEV --------------------------------- //
web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net (container) -> 10.80.19.164
web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net (header)    -> 10.80.19.167
web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net (menu)      -> 10.80.19.165
web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net (module)    -> 10.80.19.166
web-eu1-nodelnx-ofidig-desa-05.azurewebsites.net (access)    -> 10.80.19.168

// --------------------------------- TEST --------------------------------- //

// --------------------------------- PROD --------------------------------- //


// ++++++++++++++++++++++++++++++++++ VALIDATE ++++++++++++++++++++++++++++++++++ //
nslookup web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net
nc -zv web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net 443




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
kubelogin convert-kubeconfig -l azurecl

'AKS MC':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-desa --name aks-eu1-integra-multicanal-desa --overwrite-existing
kubelogin convert-kubeconfig -l azurecl

// --------------------------------- TEST --------------------------------- //
'AKS CN':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-test-01 --name aks-eu1-integra-canal-test --overwrite-existing
kubelogin convert-kubeconfig -l azurecl

'AKS MC':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-test-01 --name aks-eu1-integra-multicanal-test --overwrite-existing
kubelogin convert-kubeconfig -l azurecl


// --------------------------------- PROD --------------------------------- //
'AKS CN':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-prd-01 --name aks-eu1-integra-canal-prd --overwrite-existing
kubelogin convert-kubeconfig -l azurecl

'AKS MC':
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-prd-01 --name aks-eu1-integra-multicanal-prd --overwrite-existing
kubelogin convert-kubeconfig -l azurecl

// ++++++++++++++++++++++++++++++++++ CMDs ++++++++++++++++++++++++++++++++++ //
  kubectl run nettools-pod --image=jrecord/nettools --restart=Never -- /bin/bash

<--- JS stacktrace --->

FATAL ERROR: Reached heap limit Allocation failed - JavaScript heap out of memory
----- Native stack trace -----

npm error path /APP
npm error command failed
npm error signal SIGABRT
npm error command sh -c nest start
npm error A complete log of this run can be found in: /root/.npm/_logs/2025-01-24T21_58_13_024Z-debug-0.log


'X-XXXXXXX'
1: 4e34b054-f47e-4a87-adb8-3e1447deXXXX
2: 7tQ8Q~D9GhuixYj8UqhlxpL6TPMDXZRe0ot9XXXX

// DBs
- db-srv-eu1-ofidig-desa-01.database.windows.net (db-sql-eu1-ofidig-desa-01) -> [db_ddladmin, db_datareader y db_datawriter]
- db-srv-eu1-ofidig-desa-02.database.windows.net (db-sql-eu1-ofidig-desa-02) -> [db_ddladmin, db_datareader y db_datawriter]
- db-srv-eu1-datos-desa-01.database.windows.net (db-sql-eu1-datos-desa01)    -> [db_ddladmin, db_datareader y db_datawriter]


- sqlsv-eastus-canal-desa-01.database.windows.net (db_sql_integr_mejoconcanal_desa_01) -> [xxx, xxx y xxx]
- sqlsv-eastus-multicanal-desa-01.database.windows.net (db_sql_integr_mejoconmulticanal_desa_01) -> [xxx, xxx y xxx]

















// GH
type -p curl >/dev/null || sudo apt update && sudo apt install curl -y
curl -fsSL https://cli.github.com/packages/githubcli-archive-keyring.gpg | sudo tee /usr/share/keyrings/githubcli-archive-keyring.gpg > /dev/null
echo "deb [signed-by=/usr/share/keyrings/githubcli-archive-keyring.gpg] https://cli.github.com/packages stable main" | sudo tee /etc/apt/sources.list.d/github-cli.list > /dev/null
sudo apt update
sudo apt install gh -y


7b185ff1-8a5c-4d7a-9d05-29da31f0XXXX
1kM8Q~geDwuaeuLX0n4Ou6hlRFh9pvHt2qHaXXXX
033a9021-e6f2-49e1-88c2-e90b7921XXXX





VERSION=$(curl -s https://api.github.com/repos/mikefarah/yq/releases/latest | grep -oP '"tag_name": "\K(.*)(?=")')
wget https://github.com/mikefarah/yq/releases/latest/download/yq_linux_amd64 -O /usr/local/bin/yq
chmod +x /usr/local/bin/yq


















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

// ************************************************* APP SERVICE ************************************************* //
  // --------------------------------- TEST --------------------------------- //
  web-eu1-ofidig-test-01.azurewebsites.net (container) -> 10.81.19.73
  web-eu1-ofidig-test-02.azurewebsites.net (header)    -> 10.81.19.72
  web-eu1-ofidig-test-03.azurewebsites.net (menu)      -> 10.81.19.68
  web-eu1-ofidig-test-04.azurewebsites.net (module)    -> 10.81.19.71
  web-eu1-ofidig-test-05.azurewebsites.net (access)    -> 10.81.19.69
  web-eu1-ofidig-test-06.azurewebsites.net (6to)         -> 10.81.19.70

  // VALID
  nslookup web-eu1-ofidig-test-01.azurewebsites.net
  nc -zv web-eu1-ofidig-test-01.azurewebsites.net 443

  nc -zv 10.81.19.73 443

  nslookup web-eu1-ofidig-test-02.azurewebsites.net
  nc -zv web-eu1-ofidig-test-02.azurewebsites.net 443

  nc -zv 10.81.19.72 443

  nslookup web-eu1-ofidig-test-03.azurewebsites.net
  nc -zv web-eu1-ofidig-test-03.azurewebsites.net 443

  nslookup web-eu1-ofidig-test-04.azurewebsites.net
  nc -zv web-eu1-ofidig-test-04.azurewebsites.net 443

  nslookup web-eu1-ofidig-test-05.azurewebsites.net
  nc -zv web-eu1-ofidig-test-05.azurewebsites.net 443

  nslookup web-eu1-ofidig-test-06.azurewebsites.net
  nc -zv web-eu1-ofidig-test-06.azurewebsites.net 443

// ************************************************* AZURE-SQL ************************************************* //
db-srv-eu1-ofidig-test-01.database.windows.net 10.81.19.36
db-srv-eu1-ofidig-test-02.database.windows.net 10.81.19.52
db-srv-eu1-datos-test-01.database.windows.net 10.81.23.132

  // VALID
  nslookup db-srv-eu1-ofidig-test-01.database.windows.net
  nc -zv db-srv-eu1-ofidig-test-01.database.windows.net 1433
  nc -zv 10.81.19.36 1433
  nc -zv 10.81.19.52
  

  nslookup db-srv-eu1-ofidig-test-02.database.windows.net
  nc -zv db-srv-eu1-ofidig-test-02.database.windows.net 1433

  nslookup db-srv-eu1-datos-test-01.database.windows.net
  nc -zv db-srv-eu1-datos-test-01.database.windows.net 1433
// ************************************************* STORAGE ACCOUNT ************************************************* //
nslookup steu1ofidigapltest01.blob.core.windows.net
nc -zv steu1ofidigapltest01.blob.core.windows.net 443

nslookup steu1ofidigapltest02.blob.core.windows.net
nc -zv steu1ofidigapltest02.blob.core.windows.net 443

nslookup steu1ofidigsrvltest01.blob.core.windows.net
nc -zv steu1ofidigsrvltest01.blob.core.windows.net 443

// ************************************************* FUNCTION ************************************************* //
nslookup func-eu1-ofidig-test-01.azurewebsites.net
nc -zv  func-eu1-ofidig-test-01.azurewebsites.net 443
