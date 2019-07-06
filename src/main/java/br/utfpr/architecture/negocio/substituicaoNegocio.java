package br.utfpr.architecture.negocio;


import br.utfpr.architecture.DTO.SolicitacaoPlanoDeSubstituicaoDTO;
import br.utfpr.architecture.execacao.SolicitacaoPlanoJaExisteException;

import java.util.List;


public class substituicaoNegocio {

    public void incluir(SolicitacaoPlanoDeSubstituicaoDTO solicitacao) throws SolicitacaoPlanoJaExisteException {
        if (this.listar().stream().anyMatch(c -> c.getIdPlanoDeAula().equals( solicitacao.getIdPlanoDeAula())))
            throw new SolicitacaoPlanoJaExisteException(String.valueOf(solicitacao.getIdPlanoDeAula()));
    }

    public List<SolicitacaoPlanoDeSubstituicaoDTO> listar() {
        throw new UnsupportedOperationException();
    }

}
