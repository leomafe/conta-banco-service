package com.pos.usuario.usuarioBanco.adapters.rest.v1.dto.operacao

import java.math.BigDecimal


data class SolicitaOperacaoDto (

    var id:Long ?= null,
    var valor:BigDecimal ?= null

) {

}

