package br.com.devland.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class Controller_de_algo {

  /*
   * Métodos HTTP
   * GET - buscar informação
   * POST - Adicionar um dado/informação
   * PUT - Alterar um dado/info
   * DELETE - Remover um dado
   * PATCH - Alterar apenas uma parte da info
   */
  @GetMapping("/")
  public String primeiraMesg() {
    return "rodou...";

  }
}
