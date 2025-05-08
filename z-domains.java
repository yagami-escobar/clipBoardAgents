// -------------------------- AKS (MULTI-DOMAIN) (2aks per env) -------------------------- //
'desa'	aks.canal.oficinadigital.internal.psdesa.com.pe
		aks.multicanal.internal.psdesa.com.pe
 
'test'	aks.canal.oficinadigital.internal.pstest.com.pe
		aks.multicanal.internal.pstest.com.pe
 
'prod'	aks.canal.oficinadigital.pacificosalud.com.pe
		aks.multicanal.pacificosalud.com.pe
 

// -------------------------- APIM (MULTI-DOMAIN) (1apim per env) -------------------------- //
// desa
apim.oficinadigital.internal.psdesa.com.pe

// test
apim.oficinadigital.internal.pstest.com.pe

// prod
apim.oficinadigital.pacificosalud.com.pe
 

// -------------------------- AG (MULTI-DOMAIN) (1apim per env) -------------------------- //
// desa
gw.web.oficinadigital.internal.psdesa.com.pe

// test 
gw.api.oficinadigital.internal.pstest.com.pe
gw.web.oficinadigital.internal.pstest.com.pe

// prod
gw.api.oficinadigital.pacificosalud.com.pe
gw.web.oficinadigital.pacificosalud.com.pe


// DOMINIOS DESA
aks.canal.oficinadigital.internal.psdesa.com.pe -> 'INGRESS'
apim.oficinadigital.internal.psdesa.com.pe
gw.web.oficinadigital.internal.psdesa.com.pe


// TEST
https://apim.testpacificosegurossalud.com.pe