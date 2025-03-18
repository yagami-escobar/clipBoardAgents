// ACS:
ext.jescobars.soaint@com.pe/Y****!2025$



// TASKS:
mbirot-smc-vm/qpzm83*VHU038
ext-jescobars-mejco-vm-est/D3vS3c0ps*2024

vme1desdsojum01 (10.82.12.4)
	vme1desagedso01 (10.80.7.68) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.68
	vme1desagedso02 (10.80.7.69) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.69
	vme1desagedso03 (10.80.7.73) (X) -> RG-EU1-PLAT-DEVSECOP-CROdbSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.73

vme1tstdsojum01 (10.81.4.84)
	10.81.5.4  -> vme1tstagedso01     rg-eu1-plat-devsecop-cross-test-01  -> ssh -p 22 mbirot-smc-vm@10.81.5.4
	10.81.5.5  -> vme1tstagedso02     RG-EU1-PLAT-DEVSECOP-CROSS-TEST-01  -> ssh -p 22 mbirot-smc-vm@10.81.5.5
	10.81.5.6  -> vme1tstagedso03     rg-eu1-plat-devsecop-cross-test-01  -> ssh -p 22 mbirot-smc-vm@10.81.5.6
	10.81.5.7  -> vme1tstagedso04     rg-eu1-plat-devsecop-cross-test-01  -> ssh -p 22 mbirot-smc-vm@10.81.5.7

vme1prddsojum01 (10.82.12.52)
	10.82.13.132 -> vme1prdagedso01   rg-eu1-plat-devsecop-cross-prod-01  -> ssh -p 22 mbirot-smc-vm@10.82.13.132
	10.82.13.133 -> vme1prdagedso02   rg-eu1-plat-devsecop-cross-prod-01  -> ssh -p 22 mbirot-smc-vm@10.82.13.133
	10.82.13.134 -> vme1prdagedso03   rg-eu1-plat-devsecop-cross-prod-01  -> ssh -p 22 mbirot-smc-vm@10.82.13.134

// AKS
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials --resource-group rg-eu1-plat-integra-desa --name aks-eu1-integra-canal-desa --overwrite-existing
kubelogin convert-kubeconfig -l azurecl


ext.jescobars.soaint@pacificosegurossalud.com.pei





// ****************************************** AZURE ****************************************** //
az login --service-principal -u 09e98158-6d55-488a-bcf0-b11e8fa209f7 --password=XXXXXXLuT5XPhVY0_XXXXFkzqafqjr2DLisgQXXX --tenant XXXa9021-e6f2-49e1-88c2-e90b79214XXX --allow-no-subscription


// ****************************************** AKSs ****************************************** //
// AKS-CN:
az account set --subscription 774aa8b5-0d75-4e7c-b5db-99e245539e09
az aks get-credentials -g rg-eu1-plat-integra-desa -n aks-eu1-integra-canal-desa --overwrite-existing
kubelogin convert-kubeconfig -l azurecli

// ****************************************** SA ****************************************** //
// LIST SA
'az storage account list -g rg-eu1-land-ofidig-desa-01 -o table' -> list sa

// CHANGE RULE 
az storage account update \
  --name steu1ofidigfilesdesa01  \
  --resource-group rg-eu1-land-ofidig-desa-01 \
  --default-action Allow

// LIST CNTs
az storage container list --account-name steu1lndofidigbsedesa01 --auth-mode login -o table
az storage container list --account-name steu1odintfuncdesa01 --auth-mode login -o table
az storage container list --account-name steu1ofidigfilesdesa01 --auth-mode login -o table


// CREATE CNTs
az storage container create --resource-group rg-eu1-land-ofidig-desa-01 --account-name steu1ofidigfilesdesa01 --name cn-ofidig-login




srodlsqldes
srodpsqldes

curl db-srv-eu1-ofidig-desa-01.database.windows.net
nslookup db-srv-eu1-ofidig-desa-01.database.windows.net
nslookup db-srv-eu1-ofidig-desa-02.database.windows.net





// ********************************* SQLDB ********************************* //
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

  

// ********************************* KV ********************************* //
	// OFIDIG
	'VALID 1 (AKS)': nslookup kveu1ofidigdesa01.vault.azure.net    -> agent02 (10.80.19.4)   || // nslookup kveu1integradesa.vault.azure.net     -> agent02 (10.227.5.68)
  'VALID 2 (AKS)': nc -zv kveu1ofidigdesa01.vault.azure.net 443  -> Connection timed out   || // nc -zv kveu1integradesa.vault.azure.net 443   -> Connected to 10.227.5.68:443




// nc:
'nc <IP_DNS> <PORT>'	--> probar svcs o apis o conectarse a un server o svc a un port especifico.



kubectl run nettools-pod --image=jrecord/nettools --restart=Never -- /bin/bash




'kubectl exec -it pod/xxxx -- bin/bash' -> crear pod.
'' -> 



// RESOURCES:

-> nss-land-oficinadigital (rg-eu1-land-ofidig-desa-01)

// ********************************* SA ********************************* //
  steu1ofidigfilesdesa01 -> pe-steu1ofidigfilesdesa-01 -> 10.80.19.68 -> vnet-eu1-ofidig-datos-desa/sn-eu1-ofidig-datos-pe-files-desa-01
  steu1odintfuncdesa01   -> pe-steu1odintfuncdesa-01   -> 10.80.19.52 -> vnet-eu1-ofidig-integra-desa/sn-eu1-ofidig-pe-integra-desa-01

  'X' nslookup steu1ofidigfilesdesa01.blob.core.windows.net 
  'X' telnet steu1ofidigfilesdesa01.blob.core.windows.net 443
  'X' nc -zv steu1ofidigfilesdesa01.blob.core.windows.net 443

  'X' nslookup steu1odintfuncdesa01.blob.core.windows.net
  'X' telnet steu1odintfuncdesa01.blob.core.windows.net 443
  'X' nc -zv steu1ofidigfilesdesa01.blob.core.windows.net 443


// ********************************* FN ********************************* //
  func-eu1-nodelnx-ofidigi-desa-01 -> pe-funceu1-ofidigi-desa-01 -> 10.80.19.53 -> vnet-eu1-ofidig-integra-desa/sn-eu1-ofidig-pe-integra-desa-01

  nslookup func-eu1-nodelnx-ofidigi-desa-01.azurewebsites.net
  telnet func-eu1-nodelnx-ofidigi-desa-01.azurewebsites.net 443
  nc -zv func-eu1-nodelnx-ofidigi-desa-01.azurewebsites.net



// ********************************* PUBSUB ********************************* //
  wps-eastus-ofidig-desa-01(wps-eastus-ofidig-desa-01.webpubsub.azure.com) -> pe-eu1-wps-ofidig-desa-01 -> 10.80.19.180 -> vnet-eu1-ofidig-frontend-desa/sn-eu1-ofidig-frontend-pe-wps-desa-01 

  nslookup wps-eastus-ofidig-desa-01.webpubsub.azure.com
  telnet wps-eastus-ofidig-desa-01.webpubsub.azure.com 443
  nc -zv wps-eastus-ofidig-desa-01.webpubsub.azure.com




// ********************************* APP-SERVICE ********************************* //
(40.79.154.193)
nslookup web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net -> 10.80.19.164
nc -zv 
nslookup web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net -> 10.80.19.167
nc -zv 
nslookup web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net -> 10.80.19.165
nc -zv 
nslookup web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net -> 10.80.19.166
nc -zv 


vme1desagedso02	(10.80.7.69) -> {nslookup web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net, web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net, web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net, web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net}
vme1desagedso02	(10.80.7.69) -> {acrseu1integradesa.azurecr.io}




// ********************************* ACR ********************************* //
nslookup acrseu1integradesa.azurecr.io
nc -zv 10.227.5.71 443

az acr login -n acrseu1integradesa



// ENVS
export AZURE_DEVOPS_EXT_TLS_NO_VERIFY=1
export AZURE_CLI_DISABLE_CONNECTION_VERIFICATION=1


// ********************************* PODS ********************************* //
kubectl get all -n ns-desa-cn-ods-oficinadigitalsalud
kubectl -n ns-desa-cn-ods-oficinadigitalsalud describe pod/ods-ux-parameters-975c49d88-7bx8l

// ******************** LOGS 

ext-jescobars-mejco-vm-est@vme1desagedso02:/etc$ kubectl -n ns-desa-cn-ods-oficinadigitalsalud logs pod/ods-ux-parameters-975c49d88-9wmjz

> srv-ms-sc-ux-ods-parametersManagement@0.0.1 start
> nest start


<--- Last few GCs --->

[17:0x7f1e5c8c8000]    38979 ms: Mark-Compact 252.3 (258.6) -> 251.9 (258.6) MB, pooled: 0 MB, 1396.33 / 0.00 ms  (average mu = 0.439, current mu = 0.226) allocation failure; scavenge might not succeed
[17:0x7f1e5c8c8000]    40877 ms: Mark-Compact 253.1 (258.6) -> 252.8 (260.1) MB, pooled: 1 MB, 1709.20 / 0.00 ms  (average mu = 0.283, current mu = 0.099) allocation failure; scavenge might not succeed


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