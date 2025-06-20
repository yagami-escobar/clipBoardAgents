// ************************************************** WEB DESA ************************************************** //
'front-container'         => web-eu1-nodelnx-ofidig-desa-01.azurewebsites.net (10.80.19.164)
'mf-header'               => web-eu1-nodelnx-ofidig-desa-02.azurewebsites.net (10.80.19.167)
'mf-menu'                 => web-eu1-nodelnx-ofidig-desa-03.azurewebsites.net (10.80.19.165)
'mf-module'               => web-eu1-nodelnx-ofidig-desa-04.azurewebsites.net (10.80.19.166)
'mf-access'               => web-eu1-nodelnx-ofidig-desa-05.azurewebsites.net (10.80.19.168)
'mf-sinisterPortal'       => web-eu1-nodelnx-ofidig-desa-06.azurewebsites.net (10.80.19.169)
'mf-notificationPortal'   => web-eu1-nodelnx-ofidig-desa-07.azurewebsites.net (10.80.19.170)

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
'front-container'         => web-eu1-ofidig-test-01.azurewebsites.net (10.81.19.73) -> https://oficinadigital-contenedor.testpacificosegurossalud.com.pe
'mf-header'               => web-eu1-ofidig-test-02.azurewebsites.net (10.81.19.72) -> https://oficinadigital-header.testpacificosegurossalud.com.pe
'mf-menu'                 => web-eu1-ofidig-test-03.azurewebsites.net (10.81.19.68) -> https://oficinadigital-menu.testpacificosegurossalud.com.pe
'mf-module'               => web-eu1-ofidig-test-04.azurewebsites.net (10.81.19.71) -> https://oficinadigital-opcion.testpacificosegurossalud.com.pe
'mf-access'               => web-eu1-ofidig-test-05.azurewebsites.net (10.81.19.69) -> https://oficinadigital-autorizacion.testpacificosegurossalud.com.pe
'mf-sinisterPortal'       => web-eu1-ofidig-test-06.azurewebsites.net (10.81.19.70) -> https://oficinadigital-siniestro-trama.testpacificosegurossalud.com.pe
'mf-notificationPortal'   => web-eu1-ofidig-test-07.azurewebsites.net (10.81.19.74) -> 

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


gw.api.oficinadigital.internal.pstest.com.pe
gw.web.oficinadigital.internal.pstest.com.pe





'ORIGEN': vme1desdsojum01(10.82.12.4):
  'DESTINO' -> web-eu1-nodelnx-ofidig-desa-06.azurewebsites.net (10.80.19.169) -> [resol + connec]
  'DESTINO' -> web-eu1-nodelnx-ofidig-desa-07.azurewebsites.net (10.80.19.170) -> [resol + connec]


'ORIGEN': vme1tstdsojum01(10.81.4.84): 
  'DESTINO' -> web-eu1-ofidig-test-07.azurewebsites.net (10.81.19.74) -> [resol + connec]
  'DESTINO' -> https://oficinadigital-header.testpacificosegurossalud.com.pe
  'DESTINO' -> https://oficinadigital-menu.testpacificosegurossalud.com.pe
  'DESTINO' -> https://oficinadigital-opcion.testpacificosegurossalud.com.pe
  'DESTINO' -> https://oficinadigital-autorizacion.testpacificosegurossalud.com.pe
  'DESTINO' -> https://oficinadigital-siniestro-trama.testpacificosegurossalud.com.pe
  'DESTINO' -> https://oficinadigital-notificaciones.testpacificosegurossalud.com.pe

'ORIGEN':
  'DESTINO' ->vme1tstagedso02(10.81.5.5): web-eu1-ofidig-test-07.azurewebsites.net (10.81.19.74) -> [connec]


  