// ***************************************************** UTILITARIOS ***************************************************** //

// APIM:
https://apim-eu1-border-service-desa.azure-api.net  -> apim.oficinadigital.internal.psdesa.com.pe -> apim.desapacificosegurossalud.com.pe
https://apim-eu1-border-services-test.azure-api.net -> apim.oficinadigital.internal.pstest.com.pe -> apim.testpacificosegurossalud.com.pe
https://apim-eu1-border-services-prd.azure-api.net


// AKS:
https://aks.canal.oficinadigital.internal.psdesa.com.pe
https://aks.canal.oficinadigital.internal.pstest.com.pe
https://aks.canal.oficinadigital.pacificosalud.com.pe


// SVCS:
svc-ms-od360-oc-ne-gestion-siniestrodetalletrama-ssd
svc-ms-od360-oc-ne-gestion-siniestrotrama-ssd
svc-ms-od360-oc-un-dsc-sincroniza-usuariob2c-ssd
svc-ms - od360-oc-un-gestion-accesos-ssd
svc-ms-od360-oc-un-gestion-parametroaccesos-ssd
svc-ms ioautorizacion-ssd svc-ms-od360-oc-un-registra-transformaciontrama-ssd
svc-ms-od360-oc-un-valida- reglasnegocio-ssd

// OCP-APIM-SUBSCRIPTION-KEY:
'DESA' -> ***
'TEST' -> ***
'PRD'  -> ***

// VALIDACIONES:
telnet https://apim-eu1-border-services-test.azure-api.net
curl -v https://apim-eu1-border-services-test.azure-api.net




// ***************************************************** api-od360-oc-un-gestion-parametroAccesos-ssd ***************************************************** //
// ENDPOINTS:
GET     consulta de maestros de parametros -> /maestros?codMaestro={codMaestro}




// --------------------------------- DESA --------------------------------- //
curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-parametro-eps/soporte-ti/v1/parametros?maestro=1000,1001' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-parametro' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'


curl -k -L 'https://apim.oficinadigital.internal.psdesa.com.pe/un-gestion-parametro-eps/soporte-ti/v1/parametros?maestro=1000,1001' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-parametro' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'



// ***************************************************** api-od360-oc-un-gestion-usuarioAutorizacion-ssd ***************************************************** //
// ENDPOINTS:
POST    asigna permisos a usuarios de la app ods        -> /usuarios/permisos
GET     obtiene el perfil de un usuario                 -> /usuarios/perfiles
POST    obtiene la lista de usuarios con paginacion     -> /usuarios/consultar




// --------------------------------- DESA --------------------------------- //
curl -k -L 'http://svc-ods-un-userauth:9000/usuarios/perfiles' \
curl -k -L 'https://aks.canal.oficinadigital.internal.pstest.com.pe/usuarios/perfiles' \
curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios/perfiles' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-usuario-perfil' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'


curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios?pagina=1&cantidad=5' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jespinoza' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-usuario-paginacion' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jespinoza' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: registro-usuario' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'Content-Type: application/json' \
--data-raw '{
  "usuario": "lgam1",
  "nombre": "Luis",
  "apellidos": "Gamarra",
  "correo": "luis.gam.94@gmail.com",
  "tipo": "Externo",
  "estado": "Pendiente",
  "b2c": "12313123442"
}'

curl -k -L -X PUT 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jespinoza' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: actualizar-usuario' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'Content-Type: application/json' \
--data-raw '{
  "id": "01JMN7SJ22MC7M6AM0Q5K73AMR",
  "usuario": "lgam2",
  "nombre": "LuisG",
  "apellidos": "Gamarra",
  "correo": "luis.gam.94@gmail.com",
  "tipo": "Externo",
  "estado": "Pendiente",
  "b2c": "12313123442"
}'

curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios/permisos' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jespinoza' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: asigna-permisos' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'Content-Type: application/json' \
--data '{
    "id": "01JMN7QH0FTRPH0M7XXN10RBVE",
    "prestadores": [
        {
            "codigo": "2345",
            "nombre": "40004 - Pacifico vida cia"
        }
    ],
    "grupos": [
        "01JK193YJ00HS5VFYM7XWY78BR",
        "01JK1EF9AKHEE861KBZXXA1GF1"
    ]
}'


// --------------------------------- TEST --------------------------------- //
curl -k -L 'https://aks.canal.oficinadigital.internal.pstest.com.pe/usuarios/perfiles' \
curl -k -L 'https://apim-eu1-border-services-test.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios/perfiles' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-usuario-perfil' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'



// ***************************************************** api-od360-oc-un-gestion-accesos-ssd ***************************************************** //
// ENDPOINTS:
PUT     actualizacion de permisos por rol                       -> /roles/{rolId}/permisos
GET     consulta de modulos, opciones y acciones asoiados       -> /modulos
POST    consulta de prestadores                                 -> /prestadores
GET     consulta de roles                                       -> /roles


// --------------------------------- DESA --------------------------------- //
curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/roles' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-roles' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/modulos' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-modulos' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/prestadores' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-prestadores' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl -k -L 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/roles/permisos' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: asigna-permisos-roles' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'Content-Type: application/json' \
--data '{
    "rolId": "01JK193YJ00HS5VFYM7XWY78BR",
    "opciones": [
        "01JMQ99STG6ZPGW5REKXXAZFQH"
    ]
}'

curl -k -L -X PUT 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/roles/01JK193YJ00HS5VFYM7XWY78BR/permisos' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-maestro' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'Content-Type: application/json' \
--data '{
    "opciones": [
       "01JMQ98J95WNA9VCXJY33K6HJ2",
       "01JMQ993264CHAVQN19W759RXD",
       "01JMQ997AW11ZYCRZ4RXTESGDC",
       "01JMQ99CC3NBEWFKQEXRJ51Z53",
       "01JMQ99YNMQBZKDN88603NVSBY"
    ]
}'


// --------------------------------- TEST --------------------------------- //
curl -L 'https://apim-eu1-border-services-test.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/roles' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-roles' \
--header 'ocp-apim-subscription-key: ***' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'



// ***************************************************** notificationeventmgmt ***************************************************** //
curl -X POST http://svc-ods-sp-notificationeventmgmt:9000/ms-sp-registro-eventoconexion-eps/od/registro-de-evento/v1/notificacion/eventos/connect \
  -H "Content-Type: application/json" \
  -H "WebHook-Request-Origin: prueba-client" \
  -H "ce-signature: 123456789" \
  -H "ce-connectionid: conn-abc123" \
  -d '{
    "claims": {
      "idUsuario": ["Godoy Muñoz"]
    }
  }'

curl -X POST 'https://apim-eu1-border-service-desa.azure-api.net/prueba/prueba/eventos/connect' \
  -H 'Content-Type: application/json' \
  -H 'WebHook-Request-Origin: prueba-client' \
  -H 'ce-signature: 123456789' \
  -H 'ocp-apim-subscription-key: ***' \
  -H 'ce-connectionid: conn-abc123' \
  -d '{
    "claims": {
      "idUsuario": ["Godoy"]
    }
  }'


// ***************************************************** FILE-MANAGEMENT ***************************************************** //
https://aks.canal.oficinadigital.internal.psdesa.com.pe/ms-un-gestion-archivosiniestros-eps/od/gestion-de-siniestros/v1/archivos/registrar
https://aks.canal.oficinadigital.internal.psdesa.com.pe/ms-un-gestion-archivosiniestros-eps/od/gestion-de-siniestros/v1/archivos/descargarArchivo
https://aks.canal.oficinadigital.internal.psdesa.com.pe/ms-un-gestion-archivosiniestros-eps/od/gestion-de-siniestros/v1/archivos/eliminar
 
 
https://apim-eu1-border-service-desa.azure-api.net/sp-gestion-archivosiniestros-eps/od/gestion-de-siniestros/v1/archivos/registrar
https://apim-eu1-border-service-desa.azure-api.net/sp-gestion-archivosiniestros-eps/od/gestion-de-siniestros/v1/archivos/descargarArchivo
https://apim-eu1-border-service-desa.azure-api.net/sp-gestion-archivosiniestros-eps/od/gestion-de-siniestros/v1/archivos/eliminar