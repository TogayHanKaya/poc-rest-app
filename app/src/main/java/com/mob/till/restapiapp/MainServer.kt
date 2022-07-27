package com.mob.till.restapiapp

import ru.skornei.restserver.annotations.RestServer
import ru.skornei.restserver.server.BaseRestServer


@RestServer(
    port = MainServer.PORT,
    converter = JsonConverter::class,
    authentication = Authentication::class,
    controllers = [PingController::class]
)
object MainServer : BaseRestServer() {
    const val PORT = 8080
}