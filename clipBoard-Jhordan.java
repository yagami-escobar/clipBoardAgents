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
	nslookup db-srv-eu1-ofidig-desa-01.database.windows.net		'subs: nss-land-oficinadigital'
	20.62.132.162

	nslookup db-srv-eu1-ofidig-desa-02.database.windows.net		'subs: nss-land-oficinadigital'
	20.62.132.162

	nslookup db-srv-eu1-datos-desa-01.database.windows.net		'subs: nss-plat-datos'
	agent02	-> 20.62.132.163
	agent03	-> 20.62.132.162



	// INTEGRA
	sqlsv-eastus-canal-desa-01.database.windows.net 			'subs: nss-plat-integracion'
	(agent02 y agent03) -> 10.227.2.68

	sqlsv-eastus-multicanal-desa-01.database.windows.net		'subs: nss-plat-integracion'
	(agent02 y agent03) -> 10.227.2.4




// ********************************* KV ********************************* //

	// OFIDIG
	nslookup https://kveu1ofidigdesa01.vault.azure.net/
	10.80.19.4

	// INTEGRA
	nslookup https://kveu1integradesa.vault.azure.net/
	10.227.5.68

// nc:
'nc <IP_DNS> <PORT>'	--> probar svcs o apis o conectarse a un server o svc a un port especifico.






kubectl run nettools-pod --image=jrecord/nettools --restart=Never --interactive --tty -- /bin/bash
