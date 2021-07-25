package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;
import java.util.Date;

public class PostagemServiceImpl implements PostagemService {

    private PostagemDAO postagemDAO = new PostagemDAO("banco.db");
    
    public void adicionarPostagemPublica(Postagem postagem) {
        this.postagemDAO.addPostagemPublica(postagem); 
    }

    public void adicionarPostagemPrivada(Postagem postagem) {
        this.postagemDAO.addPostagemPrivada(postagem);
    }

    @Override
    public void removerPostagem(Postagem postagem) {
        this.postagemDAO.deletePostagem(postagem);
    }

    @Override
    public void atualizarPostagem(Postagem postagem) {
        this.postagemDAO.updatePostagem(postagem);
    }

    @Override
    public void adicionarResposta(Postagem postagem, Postagem resposta) {
        PostagemResposta postagemResposta = new PostagemResposta();
        postagemResposta.setPostagem(postagem);
        postagemResposta.setUsuario(resposta.getUsuario());
        postagemResposta.setData(new Date());
        this.postagemDAO.addPostagemResposta(postagemResposta);
    }
}
