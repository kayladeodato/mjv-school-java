# Prática de Git e Github

## Principais comandos Git:

### 1. git config

Antes de realizar o versionamento de código, é necessário configurar o ambiente com seu nome e e-mail.

```
$ git config –global user.name “Seu nome”

$ git config –global user.email “Seu email”
```

### 2. git init

Usado para criação de novos projetos de git, nesse caso ira criar um repositório novo. Caso haja um projeto existente, você pode passar o nome como parâmetro de comando:

```
$ git init
$ git init <O nome do seu repositório> // nome específico
```

### 3. git clone

Faz uma cópia exta do repositório que já existe.

```
git clone <URL do seu projeto>
```

### 4. git add

Como o nome já meio que diz, vai adicionar os arquivos de código no seu repositório, sejam novos ou modificados. Consegue adicionar um arquivo específico ou todos de uma vez. 

```
$ git add seu_arquivo // Arquivo específico
$ git add * // Todos os arquivos
```

### 5. git commit

Ao passar por um git add, os arquivos são colocados em uma fila. E o git commit executa o commit dos arquivos que foram adicionados. Pode commitar com ou sem mensagem.

```
$ git commit -a.
$ git commit -m “seu comentário”
```

### 6. git branch

As branches são utilizadas para desenvolver funcionalidades isoladas uma das outra.

```
$ git branch // lista todas as ramificações
$ git branch <nome_do_branch> // cria um branch com o nome especificado
$ git branch -d <nome_do_branch> // deleta o branch com o nome especificado
```

### 7. git checkout

Realiza a troca de uma branch oara outra.

```
$ git checkout <nome_do_branch>
$ git checkout -b <nome_do_branch_novo> // Cria uma branch e já muda para a mesma
```

### 8. git remote

Estabelece uma conexão entre o repositótio local e o remoto.

```
$ git remote add <nomecurto> <url>
```

### 9. git push

Usado para enviar as alterações para um repositório remoto que foi conectado com o git remote.

```
$ git push -u <nome_curto> <nome_do_branch>
```

### 10. git fetch

Com esse comando você irá receber todas as informações de commits para avaliar, antes de aplicar as alterações que você fez em sua versão local do repositório.

```
$ git fetch
```

### 11. git pull

Atualiza o nosso repositório local com os dados no repositório remoto.

```
$ git pull <URL>
```

### 12. git stash

Pode guardar um trabalho temporariamente em uma área chamada stash para retomá-lo posteriormente.

```
$ git stash
$ git stash list // listas seus stashs
$ git stash apply // momento de aplicar o conteúdo do stash a uma branch
```

### 13. git merge

O merge junta os trabalhos de duas branches diferentes em uma única. Portanto precisa ser iniciado a patir de uma branch já selecionada, que será mesclado com outra, com o nome passado por parâmetro.

```
$ git merge <nome_do_branch>
```

### 14. git rebase

Traz os commits de uma branch para outra.

```
$ git rebase <base>
```

### 15. git pull -rebase

Nessa instrução, o Git irá fazer um rebase (não um merge) depois de se utilizar um comando pull.

```
$ git pull –rebase
```

### 16. git diff

Para comparar dois arquivos gits ou dois branches antes de passarem por um commit ou um push, é importante executar esse comando Git.

```
$ git diff HEAD <nome_do_arquivo> // Compara o repositório ativo com o repositório local
$ git diff <branch de origem> <branch de destino> // Compara duas ramificações
```

### 17. git status

Analisa o estado do nosso repositório.

```
$ git status
```

### 18. git log

Verifica o histórico de commits.

```
$ git log
```
