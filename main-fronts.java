// ************************************************** WEB DESA ************************************************** //
'front-container' => web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net (10.80.19.164)
'mf-header'       => web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net (10.80.19.167)
'mf-menu'         => web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net (10.80.19.165)
'mf-module'       => web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net (10.80.19.166)
'mf-access'       => web-eu1-nodelnx-ofidig-desa-05.azurewebsites.net (10.80.19.168)

// VALID
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

// ************************************************** WEB TEST ************************************************** //
'front-container' => web-eu1-ofidig-test-01.azurewebsites.net (10.81.19.73) -> https://oficinadigital-contenedor.testpacificosegurossalud.com.pe/
'mf-header'       => web-eu1-ofidig-test-02.azurewebsites.net (10.81.19.72) -> https://oficinadigital-header.testpacificosegurossalud.com.pe/
'mf-menu'         => web-eu1-ofidig-test-03.azurewebsites.net (10.81.19.68) -> https://oficinadigital-menu.testpacificosegurossalud.com.pe/
'mf-module'       => web-eu1-ofidig-test-04.azurewebsites.net (10.81.19.71) -> https://oficinadigital-opcion.testpacificosegurossalud.com.pe/
'mf-access'       => web-eu1-ofidig-test-05.azurewebsites.net (10.81.19.69) -> https://oficinadigital-autorizacion.testpacificosegurossalud.com.pe/
'mf-access'       => web-eu1-ofidig-test-06.azurewebsites.net (10.81.19.70) -> https://oficinadigital-.testpacificosegurossalud.com.pe/


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