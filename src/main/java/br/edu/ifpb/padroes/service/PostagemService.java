package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

public interface PostagemService {
    
    void adicionarPostagemPublica(Postagem postagem);
    void adicionarPostagemPrivada(Postagem postagem);
    void removerPostagem(Postagem postagem);
    void atualizarPostagem(Postagem postagem);
    void adicionarResposta(Postagem postagem, Postagem resposta);
}
