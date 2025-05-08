
  az config set extension.use_dynamic_install=yes_without_prompt

export AZURE_DEVOPS_EXT_TLS_NO_VERIFY=1
export AZURE_CLI_DISABLE_CONNECTION_VERIFICATION=1



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


// ************************************************* STORAGE ACCOUNTS (SAs) ************************************************* //
'':
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


