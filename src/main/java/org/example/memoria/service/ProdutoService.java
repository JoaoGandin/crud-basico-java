package org.example.memoria.service;

import org.example.memoria.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ProdutoService {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public boolean criarProduto(Produto produto){

        for(Produto produtoID : produtos){
            if (produtoID.getId() == produto.getId()){
                return false;
            }
        }
        produtos.add(produto);
        return true;
    }

    public ArrayList<Produto> listarProduto(){
        return new ArrayList<>(produtos);
    }

    public boolean atualizarPrecoProduto(int id, BigDecimal preco){
        for(Produto produtoID : produtos){
            if(produtoID.getId() == id){
                produtoID.setPreco(preco);
                return true;
            }
        }
        return false;
    }
    public boolean deletarProduto(int id){
        for(Produto produtoID : produtos){
            if(produtoID.getId() == id){
                produtos.remove(produtoID);
                return true;
            }
        }
        return false;
    }

}
