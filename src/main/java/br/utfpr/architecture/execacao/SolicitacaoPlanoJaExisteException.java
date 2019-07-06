/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.utfpr.architecture.execacao;

/**
 *
 * @author Daniel
 */
public class SolicitacaoPlanoJaExisteException extends Exception {
    public SolicitacaoPlanoJaExisteException (String solicitacao) {
        super(solicitacao);
    }
}
