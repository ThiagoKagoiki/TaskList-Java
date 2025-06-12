package com.example.taskList.controller;

public class TaskListController {
    //nesta pasta voce fara a conexao com a API, usando o @Autowired, getmapping e postmapping
    //crie uma instancia para declarar o service -> private ClassService classService com o @Autowired
    //no get ele retorna um return do service.metodoService(parametros)
    //no post ele passa como parametros o endpoint -> @Postmapping("/endpoint")
    //e no metodo ele passa @PathVariable("ex: id") String id, @RequestBody NomeDoObjeto body OBS: podemos usar só o requestbody
    //para postar, damos um retorno com o metodo body.getAlgo()
}
