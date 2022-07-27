package com.mob.till.restapiapp

import ru.skornei.restserver.server.authentication.BaseAuthentication
import ru.skornei.restserver.server.protocol.RequestInfo


class Authentication : BaseAuthentication {
    override fun authentication(requestInfo: RequestInfo): Boolean {
        return true
    }
}