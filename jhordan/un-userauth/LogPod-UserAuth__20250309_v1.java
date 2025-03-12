ext-jescobars-mejco-vm-est@vme1desagedso02:~$ kubectl -n ns-desa-cn-ods-oficinadigitalsalud logs pod/ods-ux-userauth-6bb9597bbb-6dbz2

> srv-ms-sc-un-ods-userAuthorizationManagement@0.0.1 start
> nest start

{"level":30,"time":1740970594611,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"Config Client","msg":"Fetching values of config server"}
{"level":50,"time":1740970594612,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"application insights","msg":"Application Insights is not initialized. Cannot track trace."}
{"level":30,"time":1740970594612,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"Config Client","msg":"Fetching information of config server with url: https://apim-eu1-border-service-desa.azure-api.net/ot-configServer/config/srv-ms-sc-un-ods-userAuthorizationManagement/development"}
{"level":50,"time":1740970594612,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"application insights","msg":"Application Insights is not initialized. Cannot track trace."}
{"level":50,"time":1740970594811,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"Config Client","err":{"message":"Request failed with status code 401","name":"AxiosError","stack":"AxiosError: Request failed with status code 401\n    at settle (/APP/node_modules/axios/lib/core/settle.js:19:12)\n    at IncomingMessage.handleStreamEnd (/APP/node_modules/axios/lib/adapters/http.js:599:11)\n    at IncomingMessage.emit (node:events:530:35)\n    at endReadableNT (node:internal/streams/readable:1698:12)\n    at process.processTicksAndRejections (node:internal/process/task_queues:90:21)\n    at Axios.request (/APP/node_modules/axios/lib/core/Axios.js:45:41)\n    at process.processTicksAndRejections (node:internal/process/task_queues:105:5)","config":{"transitional":{"silentJSONParsing":true,"forcedJSONParsing":true,"clarifyTimeoutError":false},"adapter":["xhr","http","fetch"],"transformRequest":[null],"transformResponse":[null],"timeout":8000,"xsrfCookieName":"XSRF-TOKEN","xsrfHeaderName":"X-XSRF-TOKEN","maxContentLength":-1,"maxBodyLength":-1,"env":{},"headers":{"Accept":"application/json, text/plain, */*","User-Agent":"axios/1.7.9","Accept-Encoding":"gzip, compress, deflate, br"},"cancelToken":{"promise":{},"_listeners":[],"reason":{"message":"canceled","name":"CanceledError","stack":"CanceledError: canceled\n    at Object.cancel (/APP/node_modules/axios/lib/cancel/CancelToken.js:60:22)\n    at /APP/node_modules/@nestjs/axios/dist/http.service.js:84:34\n    at execFinalizer (/APP/node_modules/rxjs/src/internal/Subscription.ts:208:5)\n    at SafeSubscriber.Subscription.unsubscribe (/APP/node_modules/rxjs/src/internal/Subscription.ts:80:13)\n    at SafeSubscriber.Subscriber.unsubscribe (/APP/node_modules/rxjs/src/internal/Subscriber.ts:107:24)\n    at SafeSubscriber.Subscriber._error (/APP/node_modules/rxjs/src/internal/Subscriber.ts:120:12)\n    at SafeSubscriber.Subscriber.error (/APP/node_modules/rxjs/src/internal/Subscriber.ts:86:12)\n    at /APP/node_modules/@nestjs/axios/dist/http.service.js:77:28\n    at process.processTicksAndRejections (node:internal/process/task_queues:105:5)","code":"ERR_CANCELED"}},"method":"get","url":"https://apim-eu1-border-service-desa.azure-api.net/ot-configServer/config/srv-ms-sc-un-ods-userAuthorizationManagement/development"},"code":"ERR_BAD_REQUEST","status":401},"msg":"Request failed with status code 401"}
{"level":50,"time":1740970594815,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"Config Client","msg":"An error occurred while querying the config server service "}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"NestFactory","msg":"Starting Nest application..."}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"AppModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"InfraestructureModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"CommonsModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"InfraestructureModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"SqlServerModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"TypeOrmModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"KeyVaultModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"HttpModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ConfigHostModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"LoggerModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ConfigModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ConfigModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ConfigModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ConfigModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ConfigModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"PinoLoggerProviderModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"RedisModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ApplicationInsigthsModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"LoggerModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"LoggerModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ConfigServerProviderModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"KeyVaultModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"ConfigClientModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"TypeOrmCoreModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"TypeOrmModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"InstanceLoader","msg":"UserModule dependencies initialized"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RoutesResolver","msg":"UserController {/usuarios}:"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RouterExplorer","msg":"Mapped {/usuarios/perfiles, GET} route"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RouterExplorer","msg":"Mapped {/usuarios, GET} route"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RouterExplorer","msg":"Mapped {/usuarios, POST} route"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RouterExplorer","msg":"Mapped {/usuarios, PUT} route"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RouterExplorer","msg":"Mapped {/usuarios/permisos, POST} route"}
{"level":30,"time":1740970594824,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"NestApplication","msg":"Nest application successfully started"}
{"level":50,"time":1740971194010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740971194011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740971194011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740971194040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740971194043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740971795102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740971795102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740971795102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740971795130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740971795134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740972396050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740972396050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740972396050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740972396084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740972396100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740972997105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740972997105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740972997105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740972997133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740972997136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740973598093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740973598093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740973598093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740973598120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740973598123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740974199071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740974199071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740974199072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740974199124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740974199127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740974800097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740974800097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740974800097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740974800125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740974800128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740975401083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740975401083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740975401083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740975401130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740975401141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740976002074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740976002074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740976002075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740976002116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740976002118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740976603093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740976603093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740976603093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740976603137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740976603139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740977204042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740977204042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740977204043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740977204101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740977204103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740977805050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740977805050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740977805050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740977805112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740977805115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740978406037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740978406038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740978406038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740978406076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740978406079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740979007117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740979007117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740979007117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740979007176,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740979007187,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740979608036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740979608036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740979608036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740979608066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740979608068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740980209092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740980209093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740980209093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740980209122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740980209127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740980810150,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740980810150,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740980810150,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740980810205,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740980810208,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740981411047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740981411047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740981411047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740981411099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740981411102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740982012088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740982012088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740982012088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740982012129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740982012131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740982613004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740982613005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740982613005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740982613107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740982613110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740983214056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740983214056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740983214056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740983214089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740983214092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740983815007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740983815007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740983815007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740983815038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740983815041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740984416099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740984416099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740984416099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740984416155,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740984416159,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740985017099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740985017099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740985017099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740985017133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740985017137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740985618071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740985618071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740985618071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740985618117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740985618119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740986219074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740986219074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740986219074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740986219104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740986219118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740986820081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740986820081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740986820081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740986820123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740986820126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740987421095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740987421095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740987421095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740987421125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740987421128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740988022154,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740988022155,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740988022155,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740988022208,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740988022212,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740988623091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740988623092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740988623092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740988623121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740988623123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740989224071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740989224071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740989224071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740989224122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740989224124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740989825098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740989825098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740989825098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740989825144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740989825147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740990426074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740990426074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740990426074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740990426122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740990426125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740991027051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740991027051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740991027051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740991027081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740991027084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740991628046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740991628046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740991628046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740991628093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740991628096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740992229081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740992229081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740992229081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740992229138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740992229141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740992830063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740992830063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740992830063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740992830093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740992830098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740993431041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740993431041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740993431041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740993431072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740993431075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740994032040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740994032041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740994032041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740994032075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740994032078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740994633118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740994633119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740994633119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740994633166,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740994633176,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740995234038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740995234038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740995234038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740995234138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740995234140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740995835032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740995835032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740995835032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740995835076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740995835089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740996436069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740996436069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740996436069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740996436096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740996436099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740997037127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740997037127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740997037127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740997037158,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740997037161,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740997638034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740997638034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740997638034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740997638061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740997638064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740998239056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740998239056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740998239056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740998239098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740998239101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740998840039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740998840039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740998840039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740998840084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740998840086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1740999441084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1740999441084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1740999441084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1740999441114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1740999441117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741000042051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741000042051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741000042051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741000042093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741000042096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741000643102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741000643102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741000643102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741000643167,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741000643169,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741001244054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741001244054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741001244054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741001244147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741001244151,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741001845074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741001845074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741001845074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741001845116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741001845119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741002446059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741002446059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741002446059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741002446093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741002446096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741003047045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741003047046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741003047046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741003047076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741003047082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741003648013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741003648013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741003648013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741003648044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741003648047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741004249047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741004249047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741004249047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741004249088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741004249091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741004850095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741004850095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741004850095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741004850135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741004850138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741005451099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741005451099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741005451099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741005451130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741005451133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741006052103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741006052103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741006052103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741006052139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741006052142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741006653039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741006653039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741006653039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741006653084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741006653125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741007254012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741007254012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741007254012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741007254039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741007254043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741007855098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741007855098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741007855098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741007855126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741007855128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741008456077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741008456077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741008456077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741008456119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741008456122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741009057071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741009057072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741009057072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741009057099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741009057102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741009658010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741009658010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741009658010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741009658039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741009658042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741010259075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741010259075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741010259075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741010259116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741010259118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741010860078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741010860078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741010860078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741010860121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741010860123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741011461062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741011461062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741011461062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741011461091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741011461094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741012062086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741012062086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741012062086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741012062115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741012062118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741012663085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741012663085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741012663085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741012663114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741012663117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741013264068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741013264069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741013264069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741013264114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741013264117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741013865036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741013865036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741013865036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741013865067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741013865075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741014466063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741014466063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741014466063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741014466092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741014466094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741015067042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741015067042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741015067042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741015067081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741015067084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741015668053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741015668053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741015668053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741015668096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741015668099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741016269006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741016269006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741016269006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741016269051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741016269054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741016870078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741016870078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741016870078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741016870113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741016870117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741017471098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741017471098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741017471098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741017471139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741017471142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741018072091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741018072091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741018072091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741018072121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741018072124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741018673044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741018673044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741018673044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741018673073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741018673076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741019274069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741019274069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741019274069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741019274145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741019274148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741019875058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741019875058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741019875058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741019875090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741019875092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741020476044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741020476044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741020476044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741020476103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741020476106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741021077108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741021077108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741021077108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741021077137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741021077140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741021678062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741021678062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741021678062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741021678091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741021678095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741022279112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741022279112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741022279112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741022279140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741022279142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741022880081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741022880082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741022880082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741022880114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741022880116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741023481035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741023481035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741023481035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741023481076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741023481079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741024082069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741024082070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741024082070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741024082096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741024082099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741024683045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741024683045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741024683045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741024683075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741024683078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741025284016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741025284016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741025284016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741025284097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741025284100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741025885014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741025885014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741025885014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741025885058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741025885061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741026486054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741026486054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741026486055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741026486084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741026486087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741027087007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741027087007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741027087007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741027087053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741027087056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741027688073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741027688073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741027688073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741027688104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741027688107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741028289106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741028289106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741028289106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741028289132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741028289135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741028890022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741028890022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741028890022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741028890078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741028890081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741029491081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741029491081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741029491081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741029491109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741029491113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741030092058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741030092058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741030092058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741030092088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741030092091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741030693047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741030693048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741030693048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741030693077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741030693080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741031294099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741031294099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741031294099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741031294148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741031294152,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741031895081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741031895081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741031895081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741031895111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741031895114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741032496038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741032496038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741032496038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741032496100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741032496104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741033097032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741033097032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741033097032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741033097087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741033097090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741033698104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741033698104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741033698104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741033698132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741033698134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741034299066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741034299066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741034299066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741034299097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741034299100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741034900032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741034900032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741034900032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741034900065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741034900068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741035501096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741035501096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741035501096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741035501124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741035501127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741036102026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741036102027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741036102027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741036102057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741036102060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741036703067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741036703067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741036703067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741036703093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741036703117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741037304077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741037304077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741037304077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741037304112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741037304114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741037905034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741037905034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741037905034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741037905065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741037905071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741038506042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741038506042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741038506042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741038506070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741038506073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741039107099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741039107100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741039107100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741039107127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741039107130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741039708137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741039708137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741039708137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741039708163,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741039708166,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741040309028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741040309029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741040309029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741040309055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741040309058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741040910015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741040910015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741040910015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741040910043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741040910046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741041511016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741041511016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741041511016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741041511048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741041511051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741042112087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741042112087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741042112087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741042112131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741042112135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741042713047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741042713047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741042713047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741042713112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741042713127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-03T23:04:59.432Z","traceId":"9003d8c5-d48c-4926-bc80-7e025f27fc31","message":"Inicio del método getUserPagination"}
{"level":"INFO","time":"2025-03-03T23:04:59.882Z","traceId":"3994c3b8-5edc-44e2-9d78-797eed0dca82","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741043100141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"9003d8c5-d48c-4926-bc80-7e025f27fc31","X-Request-Id":"a768638e-feb9-4a07-ab96-621f8a3572d7","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":716,"msg":"request completed"}
{"level":30,"time":1741043100207,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"3994c3b8-5edc-44e2-9d78-797eed0dca82","X-Request-Id":"efb1d738-1cd0-4eea-bb61-5850d54e73d3","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":327,"msg":"request completed"}
{"level":"INFO","time":"2025-03-03T23:05:09.003Z","traceId":"739b1554-3ae2-4a48-8386-aca62c1c4865","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741043109052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=Jocampo","X-Correlation-Id":"739b1554-3ae2-4a48-8386-aca62c1c4865","X-Request-Id":"6b9f1436-fcd0-49df-953b-6d27bf33d87b","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":51,"msg":"request completed"}
{"level":50,"time":1741043710002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741043710002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741043710002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741043710025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741043710028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741044311090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741044311090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741044311090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741044311111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741044311114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741044912082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741044912082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741044912082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741044912127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741044912130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741045513087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741045513087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741045513087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741045513114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741045513117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741046114008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741046114008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741046114008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741046114033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741046114035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741046715105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741046715105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741046715105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741046715130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741046715133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741047316109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741047316110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741047316110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741047316139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741047316142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741047917104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741047917105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741047917105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741047917133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741047917135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741048518107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741048518107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741048518107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741048518137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741048518141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741049119044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741049119045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741049119045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741049119071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741049119073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741049720083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741049720083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741049720083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741049720115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741049720118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741050321110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741050321110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741050321110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741050321133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741050321135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741050922026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741050922026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741050922026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741050922051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741050922054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741051523115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741051523115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741051523115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741051523157,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741051523160,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741052124080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741052124080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741052124080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741052124107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741052124110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741052725006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741052725006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741052725006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741052725100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741052725103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741053326005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741053326005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741053326005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741053326032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741053326035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741053927068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741053927068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741053927068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741053927114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741053927117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741054528147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741054528147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741054528147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741054528170,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741054528172,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741055129023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741055129023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741055129023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741055129054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741055129057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741055730045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741055730045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741055730045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741055730092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741055730106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741056331115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741056331115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741056331115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741056331141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741056331145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741056932103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741056932103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741056932103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741056932131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741056932134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741057533078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741057533078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741057533078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741057533142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741057533159,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741058134022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741058134022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741058134022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741058134042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741058134045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741058735110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741058735110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741058735110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741058735138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741058735140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741059336058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741059336058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741059336058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741059336101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741059336106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741059937098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741059937098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741059937098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741059937206,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741059937209,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741060538002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741060538002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741060538002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741060538032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741060538035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741061139013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741061139013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741061139013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741061139038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741061139041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741061740032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741061740032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741061740032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741061740059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741061740063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741062341036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741062341036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741062341036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741062341062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741062341066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741062942041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741062942041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741062942041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741062942089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741062942095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741063543002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741063543002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741063543002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741063543029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741063543032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741064144096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741064144096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741064144096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741064144117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741064144119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741064745026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741064745026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741064745026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741064745046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741064745049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741065346088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741065346088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741065346088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741065346116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741065346120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741065947018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741065947018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741065947018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741065947048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741065947051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741066548055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741066548055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741066548055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741066548086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741066548089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741067149038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741067149038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741067149038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741067149081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741067149084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741067750031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741067750031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741067750031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741067750063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741067750066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741068351078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741068351078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741068351078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741068351113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741068351115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741068952029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741068952029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741068952029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741068952048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741068952051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741069553101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741069553101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741069553101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741069553126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741069553129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741070154053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741070154053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741070154053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741070154087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741070154091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741070755046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741070755046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741070755046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741070755068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741070755071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741071356113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741071356113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741071356113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741071356170,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741071356173,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741071957044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741071957044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741071957044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741071957072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741071957075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741072558048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741072558049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741072558049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741072558079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741072558082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741073159010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741073159011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741073159011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741073159043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741073159046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741073760010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741073760010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741073760010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741073760059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741073760071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741074361045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741074361045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741074361045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741074361069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741074361073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741074962007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741074962007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741074962007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741074962029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741074962032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741075563051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741075563051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741075563051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741075563075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741075563080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741076164031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741076164031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741076164031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741076164052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741076164062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741076765082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741076765082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741076765082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741076765106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741076765109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741077366072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741077366072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741077366072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741077366100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741077366103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741077967054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741077967055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741077967055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741077967089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741077967092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741078568100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741078568101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741078568101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741078568140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741078568144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741079169004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741079169004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741079169004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741079169033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741079169039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741079770051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741079770051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741079770051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741079770080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741079770083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741080371012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741080371012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741080371012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741080371034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741080371037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741080972074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741080972074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741080972074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741080972101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741080972104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741081573094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741081573094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741081573095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741081573140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741081573143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741082174046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741082174046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741082174046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741082174074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741082174076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741082775019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741082775019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741082775019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741082775061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741082775065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741083376012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741083376012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741083376012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741083376055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741083376058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741083977049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741083977049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741083977049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741083977079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741083977082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741084578073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741084578073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741084578073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741084578113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741084578116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741085179036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741085179036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741085179036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741085179066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741085179068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741085780061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741085780061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741085780061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741085780102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741085780105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741086381041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741086381041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741086381041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741086381072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741086381074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741086982046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741086982046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741086982046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741086982081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741086982084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741087583059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741087583059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741087583059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741087583083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741087583085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741088184063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741088184063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741088184063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741088184134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741088184137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741088785024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741088785024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741088785024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741088785075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741088785078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741089386095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741089386095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741089386095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741089386122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741089386126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741089987016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741089987017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741089987017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741089987045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741089987050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741090588150,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741090588150,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741090588150,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741090588172,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741090588174,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741091189036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741091189037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741091189037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741091189065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741091189070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741091790023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741091790023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741091790023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741091790051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741091790054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741092391017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741092391017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741092391017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741092391047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741092391049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741092992095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741092992095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741092992095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741092992119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741092992121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741093593102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741093593102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741093593102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741093593128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741093593131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741094194046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741094194046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741094194046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741094194073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741094194081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741094795012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741094795012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741094795012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741094795040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741094795044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741095396100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741095396100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741095396100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741095396128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741095396131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741095997010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741095997011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741095997011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741095997053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741095997057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741096598097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741096598097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741096598097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741096598126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741096598128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741097199003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741097199003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741097199003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741097199030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741097199033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741097800101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741097800101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741097800101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741097800126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741097800128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741098401010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741098401011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741098401011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741098401031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741098401034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741099002047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741099002047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741099002047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741099002077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741099002079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741099603087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741099603088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741099603088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741099603148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741099603151,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-04T14:53:11.411Z","traceId":"6008fa96-0563-427e-8135-439939bfab21","message":"Inicio del método getUser"}
{"level":30,"time":1741099991630,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"6008fa96-0563-427e-8135-439939bfab21","X-Request-Id":"1de80c28-fc6e-4cd2-af52-e1c771cd83cf","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":200},"responseTime":220,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T15:00:38.537Z","traceId":"004090d8-90ad-4106-9a5b-fd2b182d0df4","message":"Inicio del método getUser"}
{"level":30,"time":1741100438541,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"004090d8-90ad-4106-9a5b-fd2b182d0df4","X-Request-Id":"e9051c94-c02d-4f6c-949e-ba5836d25eb8","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":304},"responseTime":6,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T15:00:42.775Z","traceId":"c163eda3-2549-4bf7-936c-1660ba5cfad3","message":"Inicio del método getUser"}
{"level":30,"time":1741100442779,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"c163eda3-2549-4bf7-936c-1660ba5cfad3","X-Request-Id":"40ddd6c3-286a-4542-b986-6ac9e957bc5f","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":304},"responseTime":5,"msg":"request completed"}
{"level":50,"time":1741101043054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741101043054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741101043055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741101043096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741101043098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-04T15:20:19.048Z","traceId":"7508fbe5-a92f-4777-8182-5569d19d4916","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741101619262,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"7508fbe5-a92f-4777-8182-5569d19d4916","X-Request-Id":"f36ad122-2a48-42af-9c4b-333920ae3ed8","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":215,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T15:20:19.272Z","traceId":"f1a2e586-5d91-4a8d-adaf-24f2b984f4a5","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741101619275,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"f1a2e586-5d91-4a8d-adaf-24f2b984f4a5","X-Request-Id":"fa0dc9eb-ca76-4d56-aa7d-d30c42e542bf","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":50,"time":1741102220088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741102220088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741102220088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741102220127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741102220144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741102821063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741102821063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741102821063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741102821094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741102821098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741103422023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741103422023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741103422023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741103422058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741103422070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741104023028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741104023028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741104023028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741104023059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741104023062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741104624100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741104624100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741104624100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741104624135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741104624137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741105225041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741105225041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741105225041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741105225087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741105225090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-04T16:24:16.412Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741105457051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODs","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":641,"msg":"request completed"}
{"level":50,"time":1741106058103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741106058103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741106058103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741106058136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741106058139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-04T16:36:12.769Z","traceId":"d0588098-696d-479c-b2b5-72c3ef131a42","message":"Inicio del método getUser"}
{"level":30,"time":1741106173119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"d0588098-696d-479c-b2b5-72c3ef131a42","X-Request-Id":"c97e4cd1-b3e9-4400-a703-fe59f21ed317","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":200},"responseTime":351,"msg":"request completed"}
{"level":"ERROR","time":"2025-03-04T16:39:25.128Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_001","detail":["El campo correo debe ser un correo electrónico válido"]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741106365129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"POST","url":"/usuarios","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":400},"responseTime":8,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T16:39:50.362Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método registerUser"}
{"level":30,"time":1741106390754,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"POST","url":"/usuarios","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":201},"responseTime":395,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T16:42:58.936Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método savePermission"}
{"level":"INFO","time":"2025-03-04T16:42:59.250Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","context":"UserService","message":"assignacion de proveedores"}
{"level":"INFO","time":"2025-03-04T16:42:59.305Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","context":"UserService","message":"assignacion de roles"}
{"level":"INFO","time":"2025-03-04T16:42:59.332Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","context":"UserService","message":"Actualizando estado de usuario"}
{"level":30,"time":1741106579355,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"POST","url":"/usuarios/permisos","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":201},"responseTime":421,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T16:45:26.480Z","traceId":"01d506c2-1253-49cb-9016-dd82851b7fe0","message":"Inicio del método getUser"}
{"level":30,"time":1741106726804,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"01d506c2-1253-49cb-9016-dd82851b7fe0","X-Request-Id":"98630f86-d7a2-48f5-a6b4-f3aa25328f77","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":304},"responseTime":325,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T16:46:48.392Z","traceId":"d0d26533-8c99-4323-9b73-fd849b08e06f","message":"Inicio del método getUser"}
{"level":30,"time":1741106808395,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"d0d26533-8c99-4323-9b73-fd849b08e06f","X-Request-Id":"80da69c1-dd03-4c2c-9b2c-14b95ca7405d","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T16:47:17.891Z","traceId":"9595147a-2fa6-4520-961e-c120a51f982c","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741106838101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"9595147a-2fa6-4520-961e-c120a51f982c","X-Request-Id":"535abdb8-217a-4a97-a30a-1256a7435a8a","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":211,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T16:47:18.119Z","traceId":"fad77d77-bd9a-4b18-8cc5-61ff865f24ec","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741106838122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"fad77d77-bd9a-4b18-8cc5-61ff865f24ec","X-Request-Id":"c0501da3-b26f-4ef5-898e-a1ad7365b355","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T16:49:54.286Z","traceId":"fc10ba7a-897e-4042-ad83-621a38115ef1","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T16:49:54.614Z","traceId":"fc10ba7a-897e-4042-ad83-621a38115ef1","error":{"code":"ERR_NEG_VF_002","detail":["usuario godoymuñoz no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741106994615,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"fc10ba7a-897e-4042-ad83-621a38115ef1","X-Request-Id":"f9a95f89-0fd0-4755-9965-b75d118294a2","usuarioAplicacion":"godoymuñoz","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":404},"responseTime":330,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T16:49:57.317Z","traceId":"657fcd7f-a2e3-4005-8349-87c63d53ab4f","message":"Inicio del método getUser"}
{"level":30,"time":1741106997351,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"657fcd7f-a2e3-4005-8349-87c63d53ab4f","X-Request-Id":"011c4233-bab5-4568-98a6-dbbae0987142","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":200},"responseTime":35,"msg":"request completed"}
{"level":50,"time":1741107598073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741107598073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741107598073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741107598102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741107598106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-04T17:01:12.072Z","traceId":"4b758a23-513c-4246-a716-92238cb5695a","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741107672075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"4b758a23-513c-4246-a716-92238cb5695a","X-Request-Id":"5c3a078e-10e2-4e41-bb06-f2ffa2f86ee2","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:01:12.120Z","traceId":"0da34a56-201b-4824-b77c-36a931684c92","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741107672123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"0da34a56-201b-4824-b77c-36a931684c92","X-Request-Id":"9b4d3b51-359e-4829-b1e4-b2d994dd4176","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:01:17.307Z","traceId":"f822f294-ee20-4ab1-afd6-806c5cd65032","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741107677309,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"f822f294-ee20-4ab1-afd6-806c5cd65032","X-Request-Id":"643ba62f-29e8-4ce9-a28e-d9ae2b1f98d6","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:01:17.341Z","traceId":"3c36d4e5-46a3-4760-aaea-9e7f24c7c7f1","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741107677344,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"3c36d4e5-46a3-4760-aaea-9e7f24c7c7f1","X-Request-Id":"48b5d5d5-0d5d-42d6-92e5-eac04225f6bb","usuarioAplicacion":"jespinoza","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:01:50.715Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741107711600,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":886,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:07:08.212Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108028215,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:15:20.227Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108520230,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:16:02.995Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108562999,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":5,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:16:07.483Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108567486,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:16:12.518Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108572527,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":11,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:16:16.421Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108576424,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:16:20.702Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108580705,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:17:08.616Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108628619,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:17:12.043Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108632046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:17:14.962Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108634964,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:17:17.571Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108637574,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:17:32.154Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108652157,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:18:12.473Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108692475,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:18:42.555Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741108722557,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:18:45.634Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:18:45.977Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741108725978,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":345,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:18:55.004Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:18:55.016Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741108735017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":13,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:19:54.938Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:19:55.128Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741108795129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":192,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:19:58.485Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:19:58.500Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741108798501,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":16,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:20:01.699Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:20:01.718Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741108801719,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":21,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:20:04.547Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:20:04.559Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741108804560,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":14,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:22:42.713Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:22:43.248Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741108963249,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":537,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:23:56.979Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:23:57.339Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741109037340,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":362,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:24:00.386Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:24:00.415Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741109040416,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":31,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:24:51.003Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:24:51.349Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741109091350,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":348,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:24:55.194Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:24:55.207Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741109095207,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":13,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:24:58.297Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:24:58.308Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741109098309,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":13,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:29:29.179Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:29:29.481Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741109369482,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":303,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T17:37:37.173Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T17:37:37.483Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741109857484,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":312,"msg":"request completed"}
{"level":50,"time":1741110458031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741110458031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741110458031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741110458063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741110458067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741111059050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741111059050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741111059050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741111059080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741111059083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741111660067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741111660067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741111660067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741111660100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741111660103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741112261112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741112261112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741112261112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741112261146,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741112261148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741112862064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741112862064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741112862064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741112862124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741112862127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741113463007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741113463008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741113463008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741113463036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741113463040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741114064013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741114064013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741114064013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741114064053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741114064056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-04T18:48:42.961Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741114123280,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":320,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T18:48:53.466Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T18:48:53.477Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741114133477,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":12,"msg":"request completed"}
{"level":50,"time":1741114734015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741114734015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741114734015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741114734047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741114734050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741115335038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741115335039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741115335039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741115335083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741115335086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741115936114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741115936114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741115936114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741115936149,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741115936152,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-04T19:23:29.623Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":"ERROR","time":"2025-03-04T19:23:29.946Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","error":{"code":"ERR_NEG_VF_002","detail":["usuario jocampo2 no fue encontrado."]},"layer":"HttpExceptionFilter","function":"catch"}
{"level":30,"time":1741116209946,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"jocampo2","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":404},"responseTime":324,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T19:23:35.475Z","traceId":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","message":"Inicio del método getUser"}
{"level":30,"time":1741116215510,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","X-Request-Id":"0d40e6a3-c1ef-4829-9c1d-90406f5d99e2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"consulta-maestro"},"res":{"statusCode":200},"responseTime":35,"msg":"request completed"}
{"level":50,"time":1741116816087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741116816087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741116816087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741116816118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741116816120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741117417080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741117417080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741117417080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741117417128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741117417133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741118018008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741118018008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741118018008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741118018068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741118018073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741118619012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741118619012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741118619012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741118619041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741118619046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741119220102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741119220103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741119220103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741119220133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741119220136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741119821102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741119821103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741119821103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741119821145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741119821148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741120422059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741120422059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741120422059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741120422108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741120422110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741121023034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741121023034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741121023034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741121023064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741121023067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741121624042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741121624042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741121624042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741121624070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741121624073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741122225083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741122225083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741122225083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741122225114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741122225120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741122826048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741122826048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741122826048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741122826080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741122826083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741123427107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741123427107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741123427107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741123427141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741123427144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741124028084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741124028085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741124028085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741124028113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741124028117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741124629022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741124629022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741124629022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741124629069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741124629072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741125230025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741125230025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741125230025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741125230058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741125230061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741125831020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741125831020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741125831020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741125831050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741125831053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741126432021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741126432021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741126432021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741126432052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741126432056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-04T22:17:04.289Z","traceId":"81793c5a-582f-4159-bbf0-b59fdba652ca","message":"Inicio del método getUser"}
{"level":30,"time":1741126624820,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"81793c5a-582f-4159-bbf0-b59fdba652ca","X-Request-Id":"ed52b595-6bb9-447b-8b69-030a948b8e21","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":200},"responseTime":531,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:17:52.457Z","traceId":"0ea1f41c-012a-459b-a4b1-fffb0b787ad1","message":"Inicio del método getUser"}
{"level":30,"time":1741126672460,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"0ea1f41c-012a-459b-a4b1-fffb0b787ad1","X-Request-Id":"58b41df4-4e6d-4274-b12b-438278b3bba2","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:18:06.452Z","traceId":"88220a24-c7c1-4840-aa15-6596ba79d775","message":"Inicio del método getUser"}
{"level":30,"time":1741126686455,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"88220a24-c7c1-4840-aa15-6596ba79d775","X-Request-Id":"391d2e36-f443-4b98-af1a-cce9e1d6559c","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:18:11.135Z","traceId":"7841347a-c3b9-40b2-a2ce-2d7dd97b2359","message":"Inicio del método getUser"}
{"level":30,"time":1741126691139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"7841347a-c3b9-40b2-a2ce-2d7dd97b2359","X-Request-Id":"3f696f8e-62fb-479c-a226-98036b76dd34","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:16.863Z","traceId":"95d29434-5bab-4114-8521-26861f6e11ea","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126817429,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"95d29434-5bab-4114-8521-26861f6e11ea","X-Request-Id":"e1ca75c3-a2e8-4ae4-84be-1bf4ff37c407","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":567,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:17.441Z","traceId":"0077b50c-558d-4b05-900d-a100950f9031","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126817443,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"0077b50c-558d-4b05-900d-a100950f9031","X-Request-Id":"b063149a-c641-4bb3-a531-dbf824bcc794","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:21.448Z","traceId":"b5e75535-6ccf-4a58-8391-dfa1181c5eed","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126821451,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"b5e75535-6ccf-4a58-8391-dfa1181c5eed","X-Request-Id":"1880e06b-c858-465f-b6f1-a412d54e3638","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:22.264Z","traceId":"e50d21a5-d14b-47ce-8630-c8ab1db372a8","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126822269,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"e50d21a5-d14b-47ce-8630-c8ab1db372a8","X-Request-Id":"f76b00e6-89f3-41e6-b60a-1c6746937238","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":6,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:25.279Z","traceId":"a89a4293-7703-4ba0-b1f5-88a6a4ad0967","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126825318,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jocampo","X-Correlation-Id":"a89a4293-7703-4ba0-b1f5-88a6a4ad0967","X-Request-Id":"3902a030-082c-4bd6-853b-530899034331","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":304},"responseTime":39,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:25.334Z","traceId":"f0a9bf06-3631-4deb-b441-acbc8d2a9d47","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126825337,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jocampo","X-Correlation-Id":"f0a9bf06-3631-4deb-b441-acbc8d2a9d47","X-Request-Id":"7e42d6ef-8f30-4b2c-a2fd-a7a804294395","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":304},"responseTime":5,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:28.134Z","traceId":"a33c5a98-2b3a-4b2c-ba89-79b9a2d80ef3","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126828137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jocampo","X-Correlation-Id":"a33c5a98-2b3a-4b2c-ba89-79b9a2d80ef3","X-Request-Id":"07f33d8c-1314-48fa-b063-e046b5856378","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:28.174Z","traceId":"bc16cae7-00d3-4ef1-9499-ea1a6637eabe","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126828177,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jocampo","X-Correlation-Id":"bc16cae7-00d3-4ef1-9499-ea1a6637eabe","X-Request-Id":"1810642a-f648-4861-8c25-d66563d9de81","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:37.252Z","traceId":"abb9b79b-12d3-48c9-b0f9-3c8a729ff795","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126837255,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"abb9b79b-12d3-48c9-b0f9-3c8a729ff795","X-Request-Id":"abb31810-3e31-4096-9f37-e207bf821ba5","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:37.274Z","traceId":"fe7c2228-26c1-4151-9a4b-736dd48f816b","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126837276,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"fe7c2228-26c1-4151-9a4b-736dd48f816b","X-Request-Id":"8a68b29d-88c7-4fb2-90da-c93de8e1ff79","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:46.986Z","traceId":"52ba925e-a494-47aa-a320-621161bcb8bf","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126847030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=Godoy+Mu","X-Correlation-Id":"52ba925e-a494-47aa-a320-621161bcb8bf","X-Request-Id":"4959fbbf-d61e-462c-aa63-451d52084ae3","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":45,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:50.198Z","traceId":"fe2a6ab9-74a2-4d06-b518-015519578029","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126850221,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=Godoy+Mu","X-Correlation-Id":"fe2a6ab9-74a2-4d06-b518-015519578029","X-Request-Id":"2122da1f-ee7f-4584-aa82-5520af17ccd4","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":23,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:20:51.751Z","traceId":"7a3fd5ae-2c46-4369-8c72-15ca5c0dcde6","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126851779,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=Godoy","X-Correlation-Id":"7a3fd5ae-2c46-4369-8c72-15ca5c0dcde6","X-Request-Id":"4cce1ece-066b-4b5a-8ed6-ee226ece0ae6","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":28,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:21:08.254Z","traceId":"bd59650c-1727-4847-af96-028b94c3b9f1","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126868282,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=Gody","X-Correlation-Id":"bd59650c-1727-4847-af96-028b94c3b9f1","X-Request-Id":"fb8a71c9-98da-41a5-86bb-30f908477e37","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":29,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:21:09.257Z","traceId":"8c278941-5da6-49b0-aefe-db19a5c39be5","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126869280,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=Godo","X-Correlation-Id":"8c278941-5da6-49b0-aefe-db19a5c39be5","X-Request-Id":"6afe681f-e5cd-4bca-b1e4-191482622197","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":24,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:21:10.216Z","traceId":"adcaafda-ca7c-4996-a216-c0461c4ad3ad","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126870243,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=Godoy+","X-Correlation-Id":"adcaafda-ca7c-4996-a216-c0461c4ad3ad","X-Request-Id":"d45ae427-4a9e-4f8c-b434-fd432366fdb1","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":28,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:21:11.139Z","traceId":"82d606a2-e3e2-4905-b5e2-a58d52709863","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126871160,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=Godoy+Mu","X-Correlation-Id":"82d606a2-e3e2-4905-b5e2-a58d52709863","X-Request-Id":"02021018-0d2a-40f7-a1b0-4a760b2f57e7","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":22,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:21:23.339Z","traceId":"ffabcc4f-8c75-4106-9548-f9ddc2adcd0e","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126883361,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=gmunozs","X-Correlation-Id":"ffabcc4f-8c75-4106-9548-f9ddc2adcd0e","X-Request-Id":"179e763a-2e59-455e-91ae-5c983d777ed9","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":23,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:22:46.078Z","traceId":"10a6db5d-f33b-48a5-9809-b51bfd8bfd64","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126966415,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=gmuno","X-Correlation-Id":"10a6db5d-f33b-48a5-9809-b51bfd8bfd64","X-Request-Id":"ef2fa0bf-4fdb-4c50-ad04-377c91a65167","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":337,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:22:47.114Z","traceId":"43f5aace-5072-46f0-894c-e5202fac87b8","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126967136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=gmunoz","X-Correlation-Id":"43f5aace-5072-46f0-894c-e5202fac87b8","X-Request-Id":"63ecb506-6f41-41fc-8455-b506f4da02d3","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":23,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:22:51.077Z","traceId":"45945e20-27a5-41bd-8453-3437d58b4f00","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741126971104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10&usuario=gmun","X-Correlation-Id":"45945e20-27a5-41bd-8453-3437d58b4f00","X-Request-Id":"5ba4faaf-3565-4b5b-bc59-07a80c265962","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":28,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:31:11.710Z","traceId":"e6d4fd8f-b21f-4154-8847-713a81fc5c95","message":"Inicio del método getUser"}
{"level":30,"time":1741127471713,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"e6d4fd8f-b21f-4154-8847-713a81fc5c95","X-Request-Id":"f71397df-6c48-427e-84c4-ae0ebb3eab83","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":200},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:31:40.853Z","traceId":"3cd898a5-195a-476d-8cfd-70ac4a97c742","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127500857,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"3cd898a5-195a-476d-8cfd-70ac4a97c742","X-Request-Id":"c3c70a1b-d85c-450e-871c-fde6ae02f551","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":5,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:31:40.936Z","traceId":"4739a911-9514-48e2-b3e7-24073a11a1dd","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127500939,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"4739a911-9514-48e2-b3e7-24073a11a1dd","X-Request-Id":"5da441ed-a0a8-4c88-be10-06595530e15a","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:33:29.911Z","traceId":"279682bc-6f6f-42b4-8c53-f29e503eb77d","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127610226,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinoza&estado=Pendiente","X-Correlation-Id":"279682bc-6f6f-42b4-8c53-f29e503eb77d","X-Request-Id":"2218598f-dcb5-4d83-9a87-5b5ce3450f06","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"SEARCH USERS GRANT ACCESS"},"res":{"statusCode":200},"responseTime":316,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:33:33.224Z","traceId":"7ad3c825-7450-4f7f-a635-e3c2b89f4eff","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127613408,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespin&estado=Pendiente","X-Correlation-Id":"7ad3c825-7450-4f7f-a635-e3c2b89f4eff","X-Request-Id":"e6d742a0-96f8-45c7-aaf9-c0e493b2301f","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"SEARCH USERS GRANT ACCESS"},"res":{"statusCode":200},"responseTime":184,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:33:36.487Z","traceId":"3cbb85b7-180b-4a25-9fff-bb108cc363c2","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127616522,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespino&estado=Pendiente","X-Correlation-Id":"3cbb85b7-180b-4a25-9fff-bb108cc363c2","X-Request-Id":"7e425c47-9667-4bfd-8e00-cfa407824a91","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"SEARCH USERS GRANT ACCESS"},"res":{"statusCode":200},"responseTime":35,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:33:40.110Z","traceId":"627061ae-b3b4-4331-8068-249d12e7f967","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127620130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozz&estado=Pendiente","X-Correlation-Id":"627061ae-b3b4-4331-8068-249d12e7f967","X-Request-Id":"fdbd3777-ba83-45d1-bcd6-068aa018f0b4","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"SEARCH USERS GRANT ACCESS"},"res":{"statusCode":200},"responseTime":20,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:33:48.903Z","traceId":"2dc0fb46-c5a4-4b3e-9a37-2cf1ea44f870","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127628930,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespino&estado=Pendiente","X-Correlation-Id":"2dc0fb46-c5a4-4b3e-9a37-2cf1ea44f870","X-Request-Id":"27585b4c-6ca0-4885-8427-e2d846ce8448","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"SEARCH USERS GRANT ACCESS"},"res":{"statusCode":304},"responseTime":28,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:33:54.299Z","traceId":"2137a466-9230-45f9-ab8f-e34a7ece105a","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127634303,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"2137a466-9230-45f9-ab8f-e34a7ece105a","X-Request-Id":"c9e49084-8d29-45ef-b8a5-9e80f96f5649","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":5,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:33:54.341Z","traceId":"09276f8d-81b9-4b8b-aa35-e14380a5ba59","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127634344,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"09276f8d-81b9-4b8b-aa35-e14380a5ba59","X-Request-Id":"55983e33-81f3-4952-a6f8-c284622fcace","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:34:04.221Z","traceId":"bf07018c-ad37-48b7-b955-27df3b8f0b63","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127644271,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozin&estado=Pendiente","X-Correlation-Id":"bf07018c-ad37-48b7-b955-27df3b8f0b63","X-Request-Id":"7c30da84-9c7f-41e6-aee8-494e959b01f7","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"SEARCH USERS GRANT ACCESS"},"res":{"statusCode":200},"responseTime":51,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:34:07.186Z","traceId":"7be24ac1-bec7-47ea-9bc6-124e775d08b4","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127647189,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"7be24ac1-bec7-47ea-9bc6-124e775d08b4","X-Request-Id":"c4bf3f9f-41e8-405f-a304-702c3999d1b1","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:34:07.208Z","traceId":"f9fd66cf-3930-4ac7-a4e2-49f750eef50a","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127647211,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"f9fd66cf-3930-4ac7-a4e2-49f750eef50a","X-Request-Id":"7cae1142-7830-435d-b5b6-93bfa1e8e485","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:34:10.920Z","traceId":"f818d89e-162b-4e4a-aac4-951302f40b0f","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127650924,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozin&estado=Pendiente","X-Correlation-Id":"f818d89e-162b-4e4a-aac4-951302f40b0f","X-Request-Id":"f28096ea-be3f-4ba3-8fd1-a714d6a5a1ff","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"SEARCH USERS GRANT ACCESS"},"res":{"statusCode":304},"responseTime":5,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:35:14.308Z","traceId":"625a7d61-4501-45fb-9ee9-a770fe49a07c","message":"Inicio del método savePermission"}
{"level":"INFO","time":"2025-03-04T22:35:14.589Z","traceId":"625a7d61-4501-45fb-9ee9-a770fe49a07c","context":"UserService","message":"assignacion de proveedores"}
{"level":"INFO","time":"2025-03-04T22:35:14.624Z","traceId":"625a7d61-4501-45fb-9ee9-a770fe49a07c","context":"UserService","message":"assignacion de roles"}
{"level":"INFO","time":"2025-03-04T22:35:14.649Z","traceId":"625a7d61-4501-45fb-9ee9-a770fe49a07c","context":"UserService","message":"Actualizando estado de usuario"}
{"level":30,"time":1741127714670,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"POST","url":"/usuarios/permisos","X-Correlation-Id":"625a7d61-4501-45fb-9ee9-a770fe49a07c","X-Request-Id":"028a4d4c-6082-451f-8dfb-5a59ca0e42af","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Grant access"},"res":{"statusCode":201},"responseTime":365,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:35:18.720Z","traceId":"16c5684e-7623-4319-ab9b-af88195d3f20","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127718756,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"16c5684e-7623-4319-ab9b-af88195d3f20","X-Request-Id":"b8fd05a8-64d9-41d9-ad3b-5004d016a68f","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":37,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:35:19.309Z","traceId":"49fd7a13-4fa1-444b-9703-3a3be1711297","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127719313,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"49fd7a13-4fa1-444b-9703-3a3be1711297","X-Request-Id":"7cfb04fa-eb64-42fe-a9ee-7a90ca5c06cb","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":5,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:35:34.929Z","traceId":"d5feab61-1942-4707-b0d1-a9466d4cad83","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127735021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozin","X-Correlation-Id":"d5feab61-1942-4707-b0d1-a9466d4cad83","X-Request-Id":"174a7765-ab65-4fb9-976e-0d9a2ee08707","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":200},"responseTime":93,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:35:35.031Z","traceId":"8a73653c-9566-4655-a607-4bbcd04b54fe","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127735034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozin","X-Correlation-Id":"8a73653c-9566-4655-a607-4bbcd04b54fe","X-Request-Id":"33294990-1d58-4cf1-8941-dcad5c5a7521","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":304},"responseTime":3,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:35:43.123Z","traceId":"5f0bbbae-1a9e-4810-9623-abb6af6fb8b4","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127743126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozin","X-Correlation-Id":"5f0bbbae-1a9e-4810-9623-abb6af6fb8b4","X-Request-Id":"55e5541c-68f7-44e5-9f4e-aa06853d7ff9","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:35:43.199Z","traceId":"445328c3-7670-4645-8024-f189d2886a09","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127743203,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozin","X-Correlation-Id":"445328c3-7670-4645-8024-f189d2886a09","X-Request-Id":"b81caa3e-5c2a-4409-84e7-6173e9047c33","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:35:51.706Z","traceId":"563302b6-2255-4fb1-b62f-f9890d918f9c","message":"Inicio del método savePermission"}
{"level":"INFO","time":"2025-03-04T22:35:51.714Z","traceId":"563302b6-2255-4fb1-b62f-f9890d918f9c","context":"UserService","message":"assignacion de proveedores"}
{"level":"INFO","time":"2025-03-04T22:35:51.723Z","traceId":"563302b6-2255-4fb1-b62f-f9890d918f9c","context":"UserService","message":"assignacion de roles"}
{"level":"INFO","time":"2025-03-04T22:35:51.754Z","traceId":"563302b6-2255-4fb1-b62f-f9890d918f9c","context":"UserService","message":"Actualizando estado de usuario"}
{"level":30,"time":1741127751779,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"POST","url":"/usuarios/permisos","X-Correlation-Id":"563302b6-2255-4fb1-b62f-f9890d918f9c","X-Request-Id":"506364ac-193d-4933-a540-53f760c17b43","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Grant aaccess"},"res":{"statusCode":201},"responseTime":75,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:36:02.211Z","traceId":"8997bf7c-ea9c-429b-9739-96913aa0b54c","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127762310,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"8997bf7c-ea9c-429b-9739-96913aa0b54c","X-Request-Id":"40d5a06a-2936-48eb-8b13-3848650ef777","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":100,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:36:02.321Z","traceId":"f600c4c8-dedc-40b5-8eca-3250629069a5","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127762324,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"f600c4c8-dedc-40b5-8eca-3250629069a5","X-Request-Id":"afb93447-9a51-41f7-8a3d-ac305ff5f4e9","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:36:26.099Z","traceId":"a33cfa4f-187e-407a-ade7-dd07444aabbf","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127786137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozin","X-Correlation-Id":"a33cfa4f-187e-407a-ade7-dd07444aabbf","X-Request-Id":"385822a1-9043-4017-bb95-03f5105aaa32","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":200},"responseTime":39,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:36:26.185Z","traceId":"87d44f23-e1ad-42a2-b171-0386efc17cb0","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741127786188,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=5&usuario=jespinozin","X-Correlation-Id":"87d44f23-e1ad-42a2-b171-0386efc17cb0","X-Request-Id":"cb96a2fe-0da3-413e-b766-74a8b96131b0","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USER BY USERNAME"},"res":{"statusCode":304},"responseTime":4,"msg":"request completed"}
{"level":"INFO","time":"2025-03-04T22:40:33.265Z","traceId":"320ef3bb-d2ce-4ae6-acc6-d64ecc90de4c","message":"Inicio del método getUser"}
{"level":30,"time":1741128033566,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios/perfiles","X-Correlation-Id":"320ef3bb-d2ce-4ae6-acc6-d64ecc90de4c","X-Request-Id":"7b9f0e8c-06e8-4115-a69e-af481fe50a7e","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"Get profile"},"res":{"statusCode":304},"responseTime":301,"msg":"request completed"}
{"level":50,"time":1741128634039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741128634039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741128634039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741128634145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741128634160,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741129235039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741129235039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741129235039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741129235073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741129235076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741129836106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741129836106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741129836106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741129836136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741129836139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741130437087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741130437087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741130437087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741130437117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741130437120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741131038066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741131038066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741131038066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741131038108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741131038111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741131639070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741131639070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741131639070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741131639107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741131639111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741132240042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741132240042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741132240042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741132240096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741132240101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741132841095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741132841095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741132841095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741132841124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741132841127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741133442073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741133442074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741133442074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741133442116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741133442120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741134043101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741134043101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741134043101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741134043149,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741134043152,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741134644113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741134644113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741134644113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741134644156,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741134644159,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741135245012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741135245012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741135245012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741135245042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741135245045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741135846110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741135846110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741135846110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741135846145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741135846148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741136447082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741136447082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741136447082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741136447118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741136447120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741137048024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741137048024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741137048024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741137048056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741137048058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741137649093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741137649093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741137649093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741137649147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741137649164,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741138250012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741138250012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741138250012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741138250043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741138250046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741138851005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741138851005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741138851005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741138851034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741138851037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741139452026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741139452026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741139452026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741139452099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741139452104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741140053087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741140053087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741140053087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741140053117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741140053120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741140654112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741140654112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741140654112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741140654143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741140654146,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741141255059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741141255059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741141255059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741141255105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741141255109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741141856121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741141856122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741141856122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741141856163,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741141856166,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741142457072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741142457072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741142457072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741142457111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741142457116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741143058095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741143058095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741143058095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741143058168,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741143058173,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741143659006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741143659006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741143659006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741143659075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741143659078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741144260047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741144260048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741144260048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741144260083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741144260087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741144861073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741144861073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741144861073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741144861134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741144861137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741145462100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741145462100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741145462100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741145462145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741145462148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741146063020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741146063020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741146063020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741146063048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741146063052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741146664091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741146664091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741146664091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741146664138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741146664252,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741147265016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741147265016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741147265016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741147265062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741147265065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741147866069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741147866069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741147866069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741147866100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741147866103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741148467104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741148467104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741148467104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741148467176,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741148467180,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741149068039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741149068039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741149068039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741149068078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741149068081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741149669085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741149669085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741149669085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741149669135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741149669138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741150270005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741150270005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741150270005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741150270046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741150270049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741150871083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741150871083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741150871083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741150871127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741150871129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741151472050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741151472050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741151472050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741151472081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741151472084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741152073018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741152073018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741152073018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741152073048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741152073051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741152674069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741152674069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741152674069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741152674099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741152674102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741153275094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741153275094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741153275094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741153275132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741153275135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741153876093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741153876093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741153876093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741153876172,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741153876175,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741154477102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741154477103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741154477103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741154477160,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741154477163,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741155078061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741155078062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741155078062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741155078092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741155078095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741155679053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741155679054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741155679054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741155679135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741155679138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741156280065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741156280066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741156280066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741156280122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741156280125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741156881035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741156881035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741156881035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741156881073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741156881076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741157482076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741157482076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741157482076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741157482151,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741157482154,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741158083017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741158083018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741158083018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741158083048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741158083051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741158684043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741158684043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741158684043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741158684076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741158684078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741159285015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741159285015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741159285015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741159285078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741159285081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741159886040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741159886040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741159886040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741159886081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741159886084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741160487050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741160487050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741160487050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741160487101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741160487103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741161088010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741161088011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741161088011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741161088089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741161088091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741161689077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741161689077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741161689077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741161689103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741161689106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741162290093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741162290094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741162290094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741162290122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741162290125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741162891025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741162891025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741162891025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741162891088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741162891091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741163492063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741163492063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741163492063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741163492095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741163492099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741164093096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741164093096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741164093096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741164093139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741164093141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741164694089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741164694089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741164694089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741164694164,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741164694167,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741165295070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741165295070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741165295070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741165295097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741165295099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741165896024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741165896024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741165896024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741165896056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741165896059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741166497070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741166497071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741166497071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741166497102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741166497105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741167098032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741167098032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741167098032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741167098063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741167098066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741167699073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741167699073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741167699073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741167699114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741167699118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741168300104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741168300104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741168300104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741168300135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741168300137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741168901008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741168901008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741168901008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741168901051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741168901054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741169502458,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741169502458,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741169502458,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741169502523,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741169502527,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741170103022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741170103022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741170103022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741170103050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741170103052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741170704062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741170704062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741170704062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741170704107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741170704110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741171305081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741171305081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741171305081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741171305122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741171305125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741171906012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741171906013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741171906013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741171906048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741171906052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741172507033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741172507033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741172507034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741172507091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741172507095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741173108063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741173108063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741173108063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741173108108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741173108111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741173709110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741173709110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741173709110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741173709140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741173709143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741174310104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741174310104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741174310104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741174310139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741174310141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741174911013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741174911014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741174911014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741174911118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741174911120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741175512016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741175512017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741175512017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741175512047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741175512050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741176113079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741176113079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741176113079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741176113109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741176113111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741176714102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741176714102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741176714102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741176714130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741176714133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741177315082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741177315082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741177315082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741177315111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741177315114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741177916024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741177916024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741177916024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741177916053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741177916057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741178517023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741178517023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741178517023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741178517068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741178517071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741179118078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741179118078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741179118078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741179118116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741179118119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741179719109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741179719109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741179719109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741179719147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741179719150,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741180320087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741180320087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741180320087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741180320120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741180320123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741180921049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741180921049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741180921049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741180921106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741180921109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741181522075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741181522075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741181522075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741181522131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741181522135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741182123076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741182123077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741182123077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741182123106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741182123108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741182724056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741182724056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741182724056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741182724092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741182724095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741183325011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741183325011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741183325011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741183325068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741183325072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741183926008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741183926008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741183926008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741183926051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741183926054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741184527033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741184527033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741184527033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741184527098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741184527101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741185128065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741185128065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741185128065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741185128109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741185128112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741185729035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741185729036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741185729036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741185729091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741185729094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741186330066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741186330066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741186330066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741186330095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741186330099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741186931060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741186931060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741186931060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741186931110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741186931117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741187532018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741187532018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741187532018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741187532054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741187532058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741188133078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741188133078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741188133078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741188133107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741188133110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741188734030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741188734030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741188734030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741188734066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741188734070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741189335082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741189335082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741189335082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741189335112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741189335115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741189936080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741189936081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741189936081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741189936112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741189936117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741190537015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741190537015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741190537015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741190537047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741190537050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741191138021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741191138021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741191138021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741191138051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741191138054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741191739050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741191739050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741191739050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741191739104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741191739107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741192340058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741192340058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741192340059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741192340090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741192340093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741192941080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741192941080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741192941080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741192941120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741192941123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741193542100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741193542100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741193542100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741193542133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741193542136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741194143100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741194143101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741194143101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741194143165,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741194143168,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741194744088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741194744088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741194744088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741194744120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741194744122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741195345076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741195345076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741195345076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741195345106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741195345109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741195946009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741195946009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741195946009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741195946038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741195946042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741196547048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741196547048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741196547048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741196547077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741196547079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741197148134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741197148134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741197148134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741197148177,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741197148183,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741197749012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741197749013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741197749013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741197749050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741197749054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741198350004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741198350004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741198350004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741198350031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741198350034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741198951101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741198951101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741198951101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741198951135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741198951137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741199552074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741199552075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741199552075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741199552104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741199552107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741200153021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741200153021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741200153021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741200153052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741200153056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741200754040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741200754040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741200754040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741200754070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741200754074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741201355077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741201355077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741201355077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741201355160,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741201355174,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741201956028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741201956028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741201956028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741201956064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741201956067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741202557033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741202557033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741202557033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741202557061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741202557064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741203158066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741203158066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741203158066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741203158099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741203158103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741203759093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741203759093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741203759093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741203759124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741203759128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741204360075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741204360076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741204360076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741204360113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741204360120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741204961110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741204961110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741204961110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741204961146,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741204961149,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741205562063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741205562063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741205562063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741205562098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741205562101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741206163078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741206163078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741206163078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741206163116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741206163119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741206764081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741206764081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741206764081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741206764123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741206764126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741207365039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741207365039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741207365039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741207365073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741207365076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741207966034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741207966034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741207966034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741207966067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741207966070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741208567160,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741208567161,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741208567161,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741208567205,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741208567208,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741209168041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741209168041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741209168041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741209168070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741209168073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741209769034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741209769034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741209769034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741209769071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741209769074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741210370100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741210370100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741210370100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741210370131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741210370134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741210971016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741210971016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741210971016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741210971045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741210971048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741211572016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741211572016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741211572016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741211572044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741211572047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741212173083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741212173083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741212173083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741212173137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741212173142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741212774062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741212774062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741212774062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741212774093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741212774096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741213375060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741213375060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741213375060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741213375088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741213375091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741213976024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741213976024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741213976024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741213976120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741213976144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741214577032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741214577032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741214577032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741214577076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741214577079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741215178004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741215178005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741215178005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741215178035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741215178037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741215779080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741215779080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741215779080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741215779124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741215779129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741216380054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741216380055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741216380055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741216380102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741216380105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741216981090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741216981091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741216981091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741216981127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741216981130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741217582110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741217582111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741217582111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741217582148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741217582152,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741218183052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741218183052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741218183052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741218183095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741218183098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741218784087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741218784087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741218784087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741218784119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741218784121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741219385126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741219385127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741219385127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741219385231,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741219385243,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741219986028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741219986028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741219986028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741219986059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741219986062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741220587031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741220587031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741220587031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741220587088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741220587090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741221188036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741221188036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741221188036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741221188098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741221188124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741221789096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741221789096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741221789096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741221789127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741221789129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741222390079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741222390079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741222390079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741222390108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741222390111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741222991012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741222991012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741222991012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741222991042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741222991044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741223592005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741223592005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741223592005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741223592043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741223592046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741224193053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741224193053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741224193053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741224193091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741224193095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741224794082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741224794082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741224794082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741224794145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741224794158,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741225395111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741225395111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741225395111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741225395163,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741225395166,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741225996012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741225996012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741225996012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741225996054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741225996057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741226597078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741226597078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741226597078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741226597108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741226597111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741227198105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741227198105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741227198105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741227198134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741227198137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741227799014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741227799014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741227799014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741227799048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741227799051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741228400087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741228400087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741228400087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741228400119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741228400122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741229001084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741229001084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741229001084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741229001112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741229001115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741229602025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741229602025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741229602025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741229604058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741229604061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741230205080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741230205080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741230205080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741230205127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741230205130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741230806011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741230806011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741230806011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741230806047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741230806050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741231407057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741231407058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741231407058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741231407103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741231407106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741232008161,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741232008162,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741232008162,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741232008189,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741232008192,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741232609045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741232609045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741232609045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741232609086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741232609089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741233210103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741233210103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741233210103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741233210133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741233210136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741233811006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741233811006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741233811006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741233811036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741233811040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741234412084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741234412084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741234412084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741234412131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741234412134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741235013072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741235013072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741235013072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741235013104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741235013107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741235614076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741235614076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741235614076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741235614107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741235614110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741236215086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741236215086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741236215086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741236215114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741236215117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741236816022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741236816023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741236816023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741236816056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741236816059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741237417030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741237417030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741237417030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741237417076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741237417079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741238018062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741238018062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741238018062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741238018122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741238018125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741238619044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741238619045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741238619045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741238619084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741238619087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741239220012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741239220012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741239220012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741239220042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741239220046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741239821079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741239821079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741239821079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741239821107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741239821110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741240422072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741240422072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741240422072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741240422102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741240422105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741241023057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741241023057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741241023057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741241023086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741241023090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741241624016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741241624016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741241624016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741241624047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741241624049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741242225017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741242225017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741242225017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741242225047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741242225050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741242826090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741242826090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741242826090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741242826121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741242826123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741243427053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741243427054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741243427054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741243427094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741243427099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741244028036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741244028036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741244028036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741244028066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741244028069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741244629044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741244629044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741244629044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741244629085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741244629088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741245230033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741245230033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741245230033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741245230088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741245230095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741245831048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741245831048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741245831048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741245831089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741245831093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741246432010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741246432010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741246432010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741246432056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741246432059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741247033035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741247033035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741247033035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741247033079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741247033082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741247634027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741247634027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741247634027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741247634089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741247634092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741248235094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741248235094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741248235094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741248235140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741248235143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741248836047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741248836047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741248836047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741248836090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741248836102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741249437010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741249437010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741249437010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741249437079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741249437091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741250038105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741250038105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741250038105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741250038139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741250038143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741250639042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741250639042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741250639042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741250639072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741250639075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741251240110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741251240110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741251240110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741251240162,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741251240165,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741251841016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741251841016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741251841016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741251841063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741251841068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741252442058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741252442058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741252442058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741252442089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741252442092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741253043024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741253043024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741253043024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741253043055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741253043058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741253644018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741253644018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741253644018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741253644049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741253644052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741254245050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741254245050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741254245050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741254245095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741254245098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741254846071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741254846071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741254846071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741254846114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741254846117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741255447072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741255447072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741255447072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741255447102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741255447104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741256048013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741256048013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741256048013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741256048044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741256048048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741256649038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741256649039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741256649039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741256649087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741256649091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741257250033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741257250033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741257250033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741257250063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741257250066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741257851015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741257851015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741257851015,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741257851059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741257851062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741258452168,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741258452168,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741258452168,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741258452199,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741258452202,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741259053095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741259053095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741259053095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741259053132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741259053137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741259654075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741259654076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741259654076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741259654106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741259654109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741260255037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741260255037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741260255037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741260255084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741260255087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741260856027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741260856027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741260856027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741260856084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741260856091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741261457004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741261457005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741261457005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741261457049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741261457052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741262058102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741262058102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741262058102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741262058134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741262058137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741262659041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741262659041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741262659041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741262659071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741262659074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741263260001,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741263260002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741263260002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741263260038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741263260041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741263860994,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741263860994,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741263860994,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741263861025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741263861028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741264462026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741264462026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741264462026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741264462071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741264462074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741265063028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741265063029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741265063029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741265063057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741265063061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741265664026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741265664026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741265664026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741265664053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741265664056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741266265016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741266265016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741266265016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741266265060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741266265063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741266866051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741266866052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741266866052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741266866086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741266866089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741267467018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741267467018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741267467018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741267467049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741267467052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741268068124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741268068124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741268068124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741268068166,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741268068169,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741268669012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741268669012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741268669012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741268669042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741268669047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741269270021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741269270021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741269270021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741269270052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741269270056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741269871047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741269871047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741269871047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741269871078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741269871081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741270472096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741270472096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741270472096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741270472124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741270472127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741271073017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741271073018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741271073018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741271073046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741271073048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741271674077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741271674077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741271674077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741271674105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741271674108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741272275009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741272275009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741272275009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741272275039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741272275042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741272876136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741272876136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741272876136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741272876182,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741272876184,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741273476998,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741273476998,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741273476998,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741273477043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741273477050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741274078097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741274078097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741274078097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741274078136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741274078147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741274679058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741274679058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741274679058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741274679100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741274679103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741275280079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741275280079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741275280079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741275280123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741275280125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741275881100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741275881100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741275881100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741275881142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741275881145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741276482062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741276482062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741276482062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741276482139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741276482142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741277083039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741277083039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741277083039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741277083081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741277083084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741277684033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741277684033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741277684033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741277684066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741277684069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741278285004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741278285004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741278285004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741278285038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741278285041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741278886023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741278886023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741278886023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741278886055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741278886058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741279487103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741279487104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741279487104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741279487135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741279487138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741280088013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741280088013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741280088013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741280088039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741280088043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741280689098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741280689098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741280689098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741280689127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741280689130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741281290004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741281290005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741281290005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741281290037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741281290040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741281891010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741281891010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741281891010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741281891041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741281891044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741282492122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741282492122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741282492122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741282492176,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741282492179,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741283093014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741283093014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741283093014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741283093060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741283093063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741283694037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741283694037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741283694037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741283694079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741283694082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741284295112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741284295112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741284295112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741284295143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741284295146,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741284896113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741284896113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741284896113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741284896160,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741284896163,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741285497080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741285497081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741285497081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741285497109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741285497112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741286098089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741286098089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741286098089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741286098119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741286098122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741286699062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741286699062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741286699062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741286699092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741286699115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741287300083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741287300083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741287300083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741287300117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741287300120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741287901019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741287901019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741287901019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741287901091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741287901094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741288502104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741288502104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741288502104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741288502151,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741288502154,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741289103099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741289103099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741289103099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741289103148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741289103154,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741289704088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741289704088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741289704088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741289704175,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741289704178,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741290305005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741290305005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741290305005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741290305050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741290305061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741290906085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741290906085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741290906085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741290906162,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741290906205,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741291507088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741291507088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741291507088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741291507120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741291507122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741292108081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741292108081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741292108081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741292108120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741292108123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741292709076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741292709076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741292709076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741292709123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741292709145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741293310008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741293310008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741293310008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741293310039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741293310042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741293911087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741293911087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741293911087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741293911116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741293911119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741294512047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741294512047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741294512047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741294512091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741294512191,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741295113077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741295113077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741295113077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741295113108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741295113111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741295714075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741295714075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741295714075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741295714114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741295714124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741296315078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741296315078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741296315078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741296315132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741296315135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741296916025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741296916025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741296916025,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741296916055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741296916061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741297517060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741297517060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741297517060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741297518144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741297518169,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741298119052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741298119052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741298119052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741298119086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741298119089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741298720018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741298720018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741298720018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741298720051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741298720054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741299321005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741299321005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741299321005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741299321034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741299321037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741299922016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741299922017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741299922017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741299922063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741299922066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":"INFO","time":"2025-03-06T22:33:42.722Z","traceId":"c06834cc-00ea-47dd-89b8-e30bab103ccc","message":"Inicio del método getUserPagination"}
{"level":"INFO","time":"2025-03-06T22:33:42.850Z","traceId":"66b8d74c-d1f4-4201-8800-634b6fe7fa2f","message":"Inicio del método getUserPagination"}
{"level":30,"time":1741300423123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"c06834cc-00ea-47dd-89b8-e30bab103ccc","X-Request-Id":"385ae098-8493-4343-a7b4-02224a51dde6","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":401,"msg":"request completed"}
{"level":30,"time":1741300423124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","req":{"method":"GET","url":"/usuarios?pagina=1&cantidad=10","X-Correlation-Id":"66b8d74c-d1f4-4201-8800-634b6fe7fa2f","X-Request-Id":"41330967-8575-4ba4-a513-610562ed0f59","usuarioAplicacion":"Godoy Muñoz","nombreAplicacion":"ODS","procesoNegocio":"GET USERS"},"res":{"statusCode":200},"responseTime":275,"msg":"request completed"}
{"level":50,"time":1741301024055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741301024055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741301024055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741301024084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741301024087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741301625086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741301625086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741301625086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741301625129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741301625134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741302226041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741302226041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741302226041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741302226088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741302226090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741302827078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741302827079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741302827079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741302827112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741302827115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741303428114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741303428115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741303428115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741303428160,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741303428164,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741304029088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741304029088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741304029088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741304029114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741304029116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741304630096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741304630096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741304630096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741304630123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741304630127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741305231013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741305231013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741305231013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741305231045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741305231048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741305832122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741305832122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741305832123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741305832153,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741305832206,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741306433019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741306433019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741306433019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741306433065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741306433068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741307034048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741307034048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741307034048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741307034082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741307034089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741307635075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741307635075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741307635075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741307635103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741307635106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741308236017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741308236017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741308236017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741308236052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741308236055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741308837020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741308837021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741308837021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741308837050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741308837053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741309438070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741309438070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741309438070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741309438105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741309438108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741310039068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741310039068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741310039068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741310039093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741310039095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741310640085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741310640085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741310640085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741310640116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741310640119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741311241039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741311241039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741311241039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741311241070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741311241081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741311842073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741311842073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741311842073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741311842116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741311842119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741312443003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741312443003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741312443003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741312443081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741312443083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741313044112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741313044112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741313044112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741313044139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741313044141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741313645065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741313645065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741313645065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741313645099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741313645101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741314246072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741314246072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741314246072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741314246098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741314246101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741314847057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741314847058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741314847058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741314847102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741314847105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741315448110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741315448110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741315448111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741315448140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741315448143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741316049026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741316049026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741316049026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741316049073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741316049076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741316650018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741316650018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741316650018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741316650047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741316650050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741317251088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741317251088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741317251088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741317251115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741317251117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741317852164,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741317852164,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741317852164,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741317852191,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741317852196,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741318453084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741318453085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741318453085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741318453111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741318453114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741319054057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741319054057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741319054057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741319054090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741319054092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741319655105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741319655105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741319655105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741319655141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741319655143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741320256063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741320256063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741320256063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741320256087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741320256090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741320857067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741320857068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741320857068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741320857107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741320857110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741321458022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741321458022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741321458022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741321458050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741321458053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741322059076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741322059076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741322059076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741322059106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741322059109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741322660094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741322660094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741322660094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741322660127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741322660130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741323261108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741323261108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741323261108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741323261139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741323261141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741323862124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741323862124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741323862124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741323862153,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741323862156,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741324463089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741324463089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741324463089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741324463117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741324463121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741325064029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741325064029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741325064030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741325064089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741325064092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741325665092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741325665092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741325665092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741325665137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741325665140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741326266047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741326266048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741326266048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741326266086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741326266089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741326867019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741326867019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741326867019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741326867046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741326867048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741327468168,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741327468168,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741327468168,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741327468194,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741327468197,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741328069018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741328069019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741328069019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741328069053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741328069056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741328670004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741328670004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741328670004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741328670031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741328670034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741329271100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741329271100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741329271100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741329271126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741329271130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741329872082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741329872082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741329872082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741329872109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741329872112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741330473097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741330473097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741330473097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741330473142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741330473146,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741331074034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741331074034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741331074034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741331074063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741331074066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741331675101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741331675101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741331675101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741331675144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741331675147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741332276071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741332276071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741332276071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741332276099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741332276102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741332877035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741332877036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741332877036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741332877080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741332877083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741333478090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741333478090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741333478090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741333478140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741333478143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741334079096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741334079096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741334079096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741334079128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741334079132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741334680007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741334680007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741334680007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741334680102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741334680106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741335281003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741335281003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741335281003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741335281032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741335281035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741335882101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741335882101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741335882101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741335882130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741335882169,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741336483052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741336483052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741336483052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741336483092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741336483095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741337084022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741337084022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741337084022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741337084051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741337084055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741337685064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741337685064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741337685064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741337685094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741337685097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741338286079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741338286079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741338286079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741338286109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741338286112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741338887074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741338887074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741338887074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741338887101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741338887115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741339488045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741339488045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741339488045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741339488087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741339488090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741340089020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741340089020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741340089020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741340089049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741340089051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741340690004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741340690004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741340690004,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741340690033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741340690035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741341291043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741341291043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741341291043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741341291074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741341291076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741341892071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741341892071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741341892071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741341892100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741341892103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741342493049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741342493049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741342493049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741342493080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741342493082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741343094014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741343094014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741343094014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741343094040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741343094043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741343695079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741343695080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741343695080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741343695106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741343695109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741344296109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741344296109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741344296109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741344296144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741344296158,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741344897008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741344897009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741344897009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741344897034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741344897037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741345498059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741345498059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741345498059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741345498087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741345498091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741346099094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741346099094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741346099094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741346099136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741346099138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741346700054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741346700054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741346700054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741346700085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741346700088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741347301057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741347301057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741347301057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741347301085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741347301087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741347902046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741347902046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741347902046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741347902083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741347902086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741348503071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741348503071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741348503071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741348503105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741348503108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741349104029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741349104029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741349104029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741349104059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741349104061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741349705058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741349705058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741349705058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741349705105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741349705108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741350306066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741350306066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741350306066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741350306102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741350306104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741350907067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741350907068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741350907068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741350907131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741350907137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741351508045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741351508045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741351508045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741351508088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741351508091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741352109057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741352109057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741352109057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741352109088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741352109092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741352710012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741352710013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741352710013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741352710062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741352710065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741353311054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741353311054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741353311054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741353311082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741353311085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741353912070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741353912070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741353912070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741353912101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741353912104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741354513034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741354513035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741354513035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741354513063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741354513066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741355114032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741355114032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741355114032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741355114062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741355114065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741355715111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741355715111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741355715111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741355715139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741355715142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741356316072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741356316072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741356316072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741356316100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741356316103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741356917078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741356917078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741356917078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741356917109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741356917111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741357518086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741357518086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741357518086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741357518130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741357518132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741358119020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741358119020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741358119020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741358119048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741358119051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741358720100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741358720100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741358720100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741358720148,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741358720151,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741359321000,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741359321000,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741359321000,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741359321048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741359321051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741359922100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741359922100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741359922100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741359922130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741359922132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741360523022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741360523022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741360523022,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741360523125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741360523127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741361124006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741361124006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741361124006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741361124037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741361124040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741361725094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741361725095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741361725095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741361725140,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741361725143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741362326083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741362326083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741362326083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741362326110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741362326113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741362927014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741362927014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741362927014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741362927072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741362927076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741363528147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741363528147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741363528147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741363528171,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741363528184,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741364129062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741364129062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741364129062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741364129096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741364129133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741364730037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741364730037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741364730037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741364730073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741364730077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741365331087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741365331087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741365331087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741365331117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741365331120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741365932104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741365932104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741365932104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741365932134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741365932137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741366533075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741366533075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741366533075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741366533103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741366533105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741367134122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741367134122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741367134122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741367134299,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741367134371,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741367735099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741367735099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741367735099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741367735128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741367735131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741368336099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741368336099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741368336099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741368336128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741368336144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741368937110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741368937110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741368937110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741368937226,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741368937272,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741369538039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741369538039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741369538039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741369538091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741369538094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741370139013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741370139013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741370139013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741370139042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741370139045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741370740063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741370740064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741370740064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741370740108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741370740112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741371341037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741371341037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741371341037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741371341066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741371341070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741371942017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741371942017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741371942017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741371942047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741371942050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741372543109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741372543109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741372543109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741372543156,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741372543201,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741373144056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741373144057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741373144057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741373144088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741373144091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741373745046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741373745046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741373745046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741373745077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741373745080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741374346009,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741374346010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741374346010,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741374346046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741374346051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741374947081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741374947082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741374947082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741374947107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741374947110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741375548045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741375548045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741375548045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741375548075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741375548078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741376149090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741376149090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741376149090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741376149136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741376149139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741376750067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741376750068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741376750068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741376750095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741376750097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741377351017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741377351017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741377351017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741377351046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741377351049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741377952078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741377952078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741377952078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741377952121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741377952125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741378553110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741378553110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741378553110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741378553142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741378553145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741379154020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741379154020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741379154020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741379154064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741379154068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741379755085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741379755085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741379755085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741379755132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741379755134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741380356021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741380356021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741380356021,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741380356052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741380356055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741380957028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741380957029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741380957029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741380957064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741380957067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741381558001,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741381558001,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741381558001,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741381558042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741381558044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741382159056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741382159056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741382159056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741382159090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741382159093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741382760055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741382760055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741382760055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741382760104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741382760107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741383361028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741383361028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741383361028,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741383361058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741383361061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741383962019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741383962019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741383962019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741383962056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741383962059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741384563011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741384563011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741384563011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741384563039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741384563042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741385164097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741385164097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741385164097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741385164179,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741385164194,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741385765059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741385765059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741385765059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741385765085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741385765087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741386366075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741386366075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741386366075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741386366104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741386366113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741386967007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741386967007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741386967007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741386967044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741386967108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741387568016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741387568016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741387568016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741387568045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741387568047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741388169061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741388169061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741388169061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741388169106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741388169110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741388770108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741388770108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741388770108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741388770136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741388770139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741389371027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741389371027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741389371027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741389371065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741389371068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741389972043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741389972043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741389972043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741389972077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741389972080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741390573027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741390573027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741390573027,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741390573066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741390573069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741391174039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741391174039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741391174039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741391174076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741391174078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741391775031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741391775031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741391775031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741391775065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741391775068,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741392376013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741392376013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741392376013,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741392376042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741392376045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741392977032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741392977033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741392977033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741392977061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741392977064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741393578095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741393578095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741393578095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741393578142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741393578145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741394179045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741394179045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741394179045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741394179082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741394179085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741394780039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741394780039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741394780039,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741394780069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741394780073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741395381082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741395381083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741395381083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741395381110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741395381114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741395982085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741395982085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741395982085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741395982127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741395982130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741396583030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741396583030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741396583030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741396583058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741396583061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741397184003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741397184003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741397184003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741397184055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741397184058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741397785058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741397785058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741397785058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741397785093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741397785096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741398386038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741398386038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741398386038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741398386088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741398386091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741398987106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741398987106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741398987106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741398987151,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741398987154,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741399588155,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741399588155,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741399588155,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741399588214,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741399588218,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741400189035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741400189035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741400189035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741400189065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741400189077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741400790073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741400790073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741400790073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741400790104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741400790108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741401391002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741401391002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741401391002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741401391043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741401391046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741401992016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741401992016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741401992016,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741401992092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741401992095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741402593005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741402593005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741402593005,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741402593034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741402593037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741403194072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741403194072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741403194073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741403194107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741403194110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741403795030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741403795030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741403795031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741403795061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741403795065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741404396042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741404396042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741404396042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741404396074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741404396076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741404997033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741404997033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741404997033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741404997061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741404997065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741405598110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741405598110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741405598110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741405598139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741405598142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741406199066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741406199066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741406199066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741406199093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741406199097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741406800083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741406800083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741406800083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741406800124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741406800126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741407401044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741407401044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741407401044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741407401080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741407401082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741408002024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741408002024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741408002024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741408002055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741408002059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741408603031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741408603031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741408603031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741408603064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741408603067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741409204011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741409204011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741409204011,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741409204045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741409204047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741409805073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741409805073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741409805073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741409805099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741409805102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741410406034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741410406034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741410406034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741410406060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741410406063,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741411007077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741411007077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741411007077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741411007109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741411007112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741411608040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741411608040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741411608040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741411608071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741411608074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741412209058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741412209058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741412209058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741412209100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741412209103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741412810091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741412810091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741412810091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741412810137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741412810139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741413411075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741413411075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741413411075,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741413411102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741413411105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741414012091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741414012091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741414012091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741414012118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741414012121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741414613089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741414613089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741414613089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741414613118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741414613120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741415214110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741415214110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741415214110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741415214138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741415214141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741415815020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741415815020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741415815020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741415815048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741415815050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741416416105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741416416106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741416416106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741416416147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741416416150,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741417017111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741417017111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741417017111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741417017139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741417017145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741417618104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741417618104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741417618104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741417618146,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741417618149,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741418219078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741418219078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741418219078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741418219105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741418219108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741418820086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741418820086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741418820086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741418820115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741418820118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741419421034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741419421034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741419421034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741419421061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741419421064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741420022080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741420022080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741420022080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741420022115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741420022118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741420623042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741420623042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741420623042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741420623084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741420623087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741421224107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741421224108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741421224108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741421224139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741421224143,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741421825060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741421825060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741421825060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741421825097,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741421825099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741422426061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741422426061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741422426061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741422426089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741422426123,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741423027033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741423027033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741423027033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741423027064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741423027067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741423628024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741423628024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741423628024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741423628069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741423628085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741424229089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741424229089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741424229089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741424229117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741424229120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741424830055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741424830055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741424830055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741424830086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741424830088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741425431060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741425431061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741425431061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741425431090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741425431093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741426032042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741426032042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741426032042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741426032071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741426032074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741426633079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741426633079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741426633079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741426633108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741426633111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741427234030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741427234031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741427234031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741427234059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741427234062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741427835029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741427835029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741427835029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741427835057,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741427835060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741428436107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741428436107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741428436107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741428436133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741428436137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741429037026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741429037026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741429037026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741429037066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741429037069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741429638074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741429638074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741429638074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741429638100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741429638103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741430239108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741430239108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741430239108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741430239152,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741430239155,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741430840081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741430840082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741430840082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741430840117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741430840120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741431441066,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741431441067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741431441067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741431441098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741431441106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741432042059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741432042059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741432042059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741432042093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741432042096,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741432643106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741432643106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741432643106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741432643139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741432643142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741433244034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741433244034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741433244034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741433244062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741433244065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741433845098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741433845099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741433845099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741433845126,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741433845129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741434446086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741434446086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741434446086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741434446131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741434446134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741435047036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741435047036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741435047036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741435047071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741435047074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741435648152,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741435648152,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741435648152,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741435648193,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741435648195,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741436249008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741436249008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741436249008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741436249035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741436249038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741436850102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741436850102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741436850102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741436850144,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741436850147,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741437451053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741437451053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741437451053,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741437451080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741437451084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741438052060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741438052060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741438052060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741438052087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741438052089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741438653139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741438653139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741438653139,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741438653174,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741438653177,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741439254003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741439254003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741439254003,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741439254047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741439254050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741439855084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741439855084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741439855084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741439855115,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741439855117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741440456043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741440456043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741440456043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741440456074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741440456076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741441057110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741441057110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741441057110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741441057138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741441057142,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741441658036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741441658036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741441658037,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741441658102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741441658118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741442259051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741442259051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741442259051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741442259082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741442259086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741442860029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741442860029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741442860029,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741442860059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741442860062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741443461088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741443461088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741443461088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741443461124,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741443461127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741444062084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741444062084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741444062084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741444062129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741444062132,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741444663088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741444663088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741444663088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741444663118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741444663120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741445264226,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741445264226,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741445264226,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741445264261,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741445264274,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741445865049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741445865049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741445865049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741445865089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741445865092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741446466110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741446466110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741446466110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741446466138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741446466141,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741447067069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741447067069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741447067069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741447067103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741447067106,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741447668083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741447668083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741447668083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741447668125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741447668127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741448269082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741448269082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741448269082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741448269111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741448269113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741448870045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741448870045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741448870045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741448870091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741448870094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741449471026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741449471026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741449471026,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741449471073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741449471082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741450072017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741450072017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741450072017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741450072044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741450072047,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741450673070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741450673070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741450673070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741450673113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741450673116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741451274082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741451274082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741451274082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741451274110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741451274113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741451875081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741451875081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741451875081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741451875110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741451875112,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741452476116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741452476116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741452476116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741452476192,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741452476196,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741453077101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741453077101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741453077101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741453077129,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741453077131,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741453678076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741453678077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741453678077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741453678111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741453678113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741454279116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741454279116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741454279116,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741454279172,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741454279176,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741454880012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741454880012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741454880012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741454880058,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741454880061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741455481017,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741455481018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741455481018,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741455481051,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741455481055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741456082128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741456082128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741456082128,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741456082173,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741456082177,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741456683045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741456683045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741456683046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741456683074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741456683077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741457284103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741457284103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741457284103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741457284134,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741457284137,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741457885091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741457885091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741457885091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741457885145,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741457885159,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741458486007,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741458486008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741458486008,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741458486036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741458486038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741459087038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741459087038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741459087038,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741459087067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741459087070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741459688091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741459688091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741459688091,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741459688138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741459688151,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741460289052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741460289052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741460289052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741460289084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741460289087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741460890080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741460890080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741460890080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741460890114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741460890118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741461491048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741461491048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741461491048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741461491074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741461491082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741462092073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741462092073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741462092073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741462092101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741462092103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741462693092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741462693092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741462693092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741462693119,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741462693122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741463294046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741463294046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741463294046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741463294078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741463294080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741463895006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741463895006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741463895006,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741463895034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741463895036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741464496001,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741464496002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741464496002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741464496031,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741464496034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741465097070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741465097070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741465097070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741465097107,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741465097110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741465698019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741465698019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741465698019,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741465698062,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741465698065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741466299061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741466299061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741466299061,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741466299099,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741466299102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741466900079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741466900079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741466900079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741466900108,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741466900111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741467501085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741467501085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741467501085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741467501114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741467501117,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741468102093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741468102094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741468102094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741468102122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741468102125,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741468703082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741468703082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741468703082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741468703111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741468703113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741469304098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741469304098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741469304098,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741469304156,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741469304163,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741469905077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741469905077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741469905077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741469905103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741469905110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741470506065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741470506065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741470506065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741470506093,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741470506095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741471107046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741471107046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741471107046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741471107079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741471107081,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741471708045,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741471708046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741471708046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741471708087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741471708090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741472309041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741472309041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741472309041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741472309070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741472309073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741472910048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741472910048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741472910048,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741472910077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741472910080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741473511033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741473511033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741473511033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741473511064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741473511067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741474112023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741474112023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741474112023,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741474112052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741474112055,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741474713024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741474713024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741474713024,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741474713049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741474713056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741475314065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741475314065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741475314065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741475314092,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741475314095,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741475915042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741475915042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741475915042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741475915076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741475915079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741476516059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741476516059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741476516059,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741476516086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741476516094,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741477117078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741477117078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741477117078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741477117110,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741477117113,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741477718041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741477718041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741477718041,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741477718070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741477718072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741478319034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741478319034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741478319034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741478319080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741478319083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741478920070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741478920070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741478920070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741478920102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741478920105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741479521090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741479521090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741479521090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741479521120,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741479521122,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741480122103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741480122103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741480122103,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741480122133,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741480122136,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741480723078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741480723078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741480723078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741480723127,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741480723130,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741481324034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741481324034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741481324034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741481324080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741481324083,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741481925054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741481925054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741481925054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741481925086,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741481925088,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741482526042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741482526042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741482526042,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741482526070,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741482526073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741483127104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741483127104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741483127104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741483127135,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741483127138,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741483728036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741483728036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741483728036,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741483728064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741483728069,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741484329002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741484329002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741484329002,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741484329033,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741484329035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741484930049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741484930049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741484930049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741484930079,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741484930082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741485531035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741485531035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741485531035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741485531064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741485531067,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741486132072,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741486132073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741486132073,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741486132101,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741486132104,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741486733071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741486733071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741486733071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741486733100,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741486733102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741487334109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741487334109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741487334109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741487334158,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741487334161,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741487935049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741487935049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741487935049,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741487935078,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741487935082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741488536032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741488536032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741488536032,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741488536060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741488536064,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741489137071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741489137071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741489137071,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741489137102,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741489137105,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741489738014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741489738014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741489738014,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741489738043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741489738046,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741490339034,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741490339035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741490339035,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741490339084,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741490339087,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741490940044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741490940044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741490940044,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741490940074,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741490940077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741491541054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741491541054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741491541054,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741491541082,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741491541085,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741492142020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741492142020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741492142020,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741492142050,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741492142052,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741492743080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741492743080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741492743080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741492743109,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741492743111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741493344076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741493344076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741493344076,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741493344111,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741493344114,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741493945012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741493945012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741493945012,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741493945043,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741493945056,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741494546030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741494546030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741494546030,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741494546060,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741494546065,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741495147089,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495147090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741495147090,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741495147118,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741495147121,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741495748040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495748040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741495748040,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":30,"time":1741495748077,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client connected"}
{"level":30,"time":1741495748080,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client is ready"}
{"level":50,"time":1741495803609,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495803610,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":40,"time":1741495803610,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495813622,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #0"}
{"level":50,"time":1741495813622,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495813623,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495823634,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #1"}
{"level":50,"time":1741495823634,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495823734,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495833743,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #2"}
{"level":50,"time":1741495833743,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495833943,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495843954,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #3"}
{"level":50,"time":1741495843954,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495844254,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495854263,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #4"}
{"level":50,"time":1741495854263,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495854663,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495864689,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #5"}
{"level":50,"time":1741495864689,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495865189,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495875198,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #6"}
{"level":50,"time":1741495875198,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495875798,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495885810,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #7"}
{"level":50,"time":1741495885810,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495886511,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495896522,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #8"}
{"level":50,"time":1741495896522,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495897323,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495907334,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #9"}
{"level":50,"time":1741495907334,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495908235,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495918244,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #10"}
{"level":50,"time":1741495918244,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
{"level":40,"time":1741495919244,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client reconnecting..."}
{"level":40,"time":1741495929248,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis client retrying connection... Attempt #11"}
{"level":50,"time":1741495929248,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Max reconnection attempts reached"}
{"level":50,"time":1741495929248,"pid":28,"hostname":"ods-ux-userauth-6bb9597bbb-6dbz2","context":"RedisService","msg":"Redis error:"}
