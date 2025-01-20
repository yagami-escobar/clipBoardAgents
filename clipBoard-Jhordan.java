// ACS:
ext.jescobars.soaint@com.pe/Y****!2025$



// TASKS:
mbirot-smc-vm/qpzm83*VHU038
ext-jescobars-mejco-vm-est/D3vS3c0ps*2024

vme1desdsojum01 (10.82.12.4)
	vme1desagedso01 (10.80.7.68) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.68
	vme1desagedso02 (10.80.7.69) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.69
	vme1desagedso03 (10.80.7.73) (X) -> RG-EU1-PLAT-DEVSECOP-CROSS-DESA-01 -> ssh -p 22 mbirot-smc-vm@10.80.7.73

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

- 'SA' -> 
  steu1ofidigfilesdesa01 -> pe-steu1ofidigfilesdesa-01 -> 10.80.19.68 -> vnet-eu1-ofidig-datos-desa/sn-eu1-ofidig-datos-pe-files-desa-01
  steu1odintfuncdesa01   -> pe-steu1odintfuncdesa-01   -> 10.80.19.52 -> vnet-eu1-ofidig-integra-desa/sn-eu1-ofidig-pe-integra-desa-01

  nslookup steu1ofidigfilesdesa01.blob.core.windows.net
  telnet steu1ofidigfilesdesa01.blob.core.windows.net 443
  nc -zv steu1ofidigfilesdesa01.blob.core.windows.net

  nslookup steu1odintfuncdesa01.blob.core.windows.net
  telnet steu1odintfuncdesa01.blob.core.windows.net 443
  nc -zv steu1ofidigfilesdesa01.blob.core.windows.net



- 'FN' -> 
  func-eu1-nodelnx-ofidigi-desa-01 -> pe-funceu1-ofidigi-desa-01 -> 10.80.19.53 -> vnet-eu1-ofidig-integra-desa/sn-eu1-ofidig-pe-integra-desa-01

  nslookup func-eu1-nodelnx-ofidigi-desa-01.azurewebsites.net
  telnet func-eu1-nodelnx-ofidigi-desa-01.azurewebsites.net 443
  nc -zv func-eu1-nodelnx-ofidigi-desa-01.azurewebsites.net



- 'PUBSUB' -> 
  wps-eastus-ofidig-desa-01(wps-eastus-ofidig-desa-01.webpubsub.azure.com) -> pe-eu1-wps-ofidig-desa-01 -> 10.80.19.180 -> vnet-eu1-ofidig-frontend-desa/sn-eu1-ofidig-frontend-pe-wps-desa-01 

  nslookup wps-eastus-ofidig-desa-01.webpubsub.azure.com
  telnet wps-eastus-ofidig-desa-01.webpubsub.azure.com 443
  nc -zv wps-eastus-ofidig-desa-01.webpubsub.azure.com