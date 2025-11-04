(ns tarefa.exc2)

(defn menu []
    (loop [alunos []]
        (println "=== MENU PRINCIPAL ===")
        (println "1- Cadastrar Alunos")
        (println "2- Relatório de Notas")
        (println "3- Estatística Gerais")
        (println "0- Sair")
        (println "Escolha uma opção...")
        )
        (let [op (read-line)]
            (cond
                (= op "1") (recur (cadastrar))
                (= op "2") (do (relatorio alunos))
                (= op "3") (do (estastisticas alunos))
                (= op "0") (println "Saindo...") :else (do (println "Opção inválida.")
                recur alunos)
                )))
                
(defn cadastrar []
(loop [alunos []]
    (println "Nome do aluno:"))
    (let [nome (read-line)]
        (if (nome) alunos
            (do 
                (println "Nota do aluno:")
                (let [nota (Double/parseDouble) (read-line)
                    novo {:nome nome:nota nota}]
                    recur (conj alnos novo))))))