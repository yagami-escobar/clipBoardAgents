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

'vme1desdsojum01' (10.82.12.4)
	vme1desagedso01 (10.80.7.68) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.68
	vme1desagedso02 (10.80.7.69) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.69
	vme1desagedso03 (10.80.7.73) (X) -> RG-EU1-PLAT-DEVSECOP-CROdbSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.73

'vme1tstdsojum01' (10.81.4.84)
	vme1tstagedso01 -> 10.81.5.4  -> rg-eu1-plat-devsecop-cross-test-01  -> ssh -p 22 mbirot-smc-vm@10.81.5.4
	vme1tstagedso02 -> 10.81.5.5  -> RG-EU1-PLAT-DEVSECOP-CROSS-TEST-01  -> ssh -p 22 mbirot-smc-vm@10.81.5.5
	vme1tstagedso03 -> 10.81.5.6  -> rg-eu1-plat-devsecop-cross-test-01  -> ssh -p 22 mbirot-smc-vm@10.81.5.6
	vme1tstagedso04 -> 10.81.5.7  -> rg-eu1-plat-devsecop-cross-test-01  -> ssh -p 22 mbirot-smc-vm@10.81.5.7

'vme1prddsojum01' (10.82.12.52)
	vme1prdagedso01 -> 10.82.13.132 -> rg-eu1-plat-devsecop-cross-prod-01  -> ssh -p 22 mbirot-smc-vm@10.82.13.132
	vme1prdagedso02 -> 10.82.13.133 -> rg-eu1-plat-devsecop-cross-prod-01  -> ssh -p 22 mbirot-smc-vm@10.82.13.133
	vme1prdagedso03 -> 10.82.13.134 -> rg-eu1-plat-devsecop-cross-prod-01  -> ssh -p 22 mbirot-smc-vm@10.82.13.134


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

// ++++++++++++++++++++++++++++++++++ VALIDATE ++++++++++++++++++++++++++++++++++ //