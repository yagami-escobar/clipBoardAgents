ext-jescobars-mejco-vm-est@vme1desagedso02:~$ kubectl -n ns-desa-cn-ods-oficinadigitalsalud logs -f pod/ods-un-sinisterregister-76d5557667-6j4mb

> srv-ms-sc-un-ods-sinistersManagement@0.0.1 start
> nest start

{"level":"INFO","time":"2025-04-10T15:18:43.079Z","context":"Config Client","message":"Fetching values of config server"}
{"level":"ERROR","time":"2025-04-10T15:18:43.080Z","context":"application insights","message":"Application Insights is not initialized. Cannot track trace."}
{"level":"INFO","time":"2025-04-10T15:18:43.080Z","context":"Config Client","message":"Fetching information of config server with url: https://apim-eu1-border-service-desa.azure-api.net/ot-configServer/config/srv-ms-sc-un-ods-sinisterRegister/development"}
{"level":"ERROR","time":"2025-04-10T15:18:43.080Z","context":"application insights","message":"Application Insights is not initialized. Cannot track trace."}
{"level":"INFO","time":"2025-04-10T15:18:43.282Z","context":"Config Client","message":"Fetching values of config server"}
{"level":"ERROR","time":"2025-04-10T15:18:43.282Z","context":"application insights","message":"Application Insights is not initialized. Cannot track trace."}
{"level":"INFO","time":"2025-04-10T15:18:43.282Z","context":"Config Client","message":"Fetching information of config server with url: https://apim-eu1-border-service-desa.azure-api.net/ot-configServer/config/srv-ms-sc-un-ods-sinisterRegister/development"}
{"level":"ERROR","time":"2025-04-10T15:18:43.282Z","context":"application insights","message":"Application Insights is not initialized. Cannot track trace."}
{"level":"ERROR","time":"2025-04-10T15:18:43.675Z","context":"Config Client","err":{"message":"Request failed with status code 400","name":"AxiosError","stack":"AxiosError: Request failed with status code 400\n    at settle (/APP/node_modules/axios/lib/core/settle.js:19:12)\n    at IncomingMessage.handleStreamEnd (/APP/node_modules/axios/lib/adapters/http.js:599:11)\n    at IncomingMessage.emit (node:events:530:35)\n    at endReadableNT (node:internal/streams/readable:1698:12)\n    at process.processTicksAndRejections (node:internal/process/task_queues:90:21)\n    at Axios.request (/APP/node_modules/axios/lib/core/Axios.js:45:41)\n    at process.processTicksAndRejections (node:internal/process/task_queues:105:5)","method":"get","url":"https://apim-eu1-border-service-desa.azure-api.net/ot-configServer/config/srv-ms-sc-un-ods-sinisterRegister/development","details":{"code":"ERROR_IN_CLONE","title":"No se pudo clonar el Repositorio","detail":"fatal: destination path '/app/settings/config-repo' already exists and is not an empty directory.\n","additionalDetails":{}}},"message":"Request failed with status code 400"}
{"level":"ERROR","time":"2025-04-10T15:18:43.676Z","context":"Config Client","message":"An error occurred while querying the config server service "}
node:internal/url:816
    const href = bindingUrl.parse(input, base, raiseException);
                            ^

TypeError: Invalid URL
    at new URL (node:internal/url:816:29)
    at RedisClient.parseURL (/APP/node_modules/@redis/client/dist/lib/client/index.js:51:76)
    at Commander._RedisClient_initiateOptions (/APP/node_modules/@redis/client/dist/lib/client/index.js:365:27)
    at new RedisClient (/APP/node_modules/@redis/client/dist/lib/client/index.js:168:148)
    at new Commander (/APP/node_modules/@redis/client/dist/lib/commander.js:44:13)
    at create (/APP/node_modules/@redis/client/dist/lib/client/index.js:47:16)
    at createClient (/APP/node_modules/redis/dist/index.js:38:38)
    at RedisService.connect (/APP/src/lib/external/azure/redis/Redis.service.ts:16:31)
    at process.processTicksAndRejections (node:internal/process/task_queues:105:5) {
  code: 'ERR_INVALID_URL',
  input: 'redis://undefined:undefined'
}

Node.js v22.11.0
