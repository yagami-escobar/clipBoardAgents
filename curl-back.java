apim.oficinadigital.internal.psdesa.com.pe


curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-parametro-eps/soporte-ti/v1/parametros?maestro=1000,1001' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-parametro' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'



API PARAMETROS:
curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-parametro-eps/soporte-ti/v1/parametros?maestro=1000,1001' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-parametro' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

API USER AUTHORIZATION:

curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios/perfiles' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-usuario-perfil' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios?pagina=1&cantidad=5' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jespinoza' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-usuario-paginacion' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jespinoza' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: registro-usuario' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
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

curl --location --request PUT 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jespinoza' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: actualizar-usuario' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
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

curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-usuario-eps/soporte-ti/v1/usuarios/permisos' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jespinoza' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: asigna-permisos' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
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


API ROLE PERMISSION:

curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/roles' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-roles' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/modulos' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-modulos' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/prestadores' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-prestadores' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2'

curl --location 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/roles/permisos' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: asigna-permisos-roles' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
--header 'X-Request-Id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'Content-Type: application/json' \
--data '{
    "rolId": "01JK193YJ00HS5VFYM7XWY78BR",
    "opciones": [
        "01JMQ99STG6ZPGW5REKXXAZFQH"
    ]
}'

curl --location --request PUT 'https://apim-eu1-border-service-desa.azure-api.net/un-gestion-acceso-eps/soporte-ti/v1/roles/01JK193YJ00HS5VFYM7XWY78BR/permisos' \
--header 'X-Correlation-id: 0d40e6a3-c1ef-4829-9c1d-90406f5d99e2' \
--header 'usuarioAplicacion: jocampo' \
--header 'nombreAplicacion: ODS' \
--header 'procesoNegocio: consulta-maestro' \
--header 'ocp-apim-subscription-key: 3d6034bf2b9d4c92977c4bab76483c13' \
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
