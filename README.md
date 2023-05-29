
##  Sistema de Posts  
Sistema feito com spring para praticar conceitos principalmente de ManyToMany, OneToMany, ManyToOne

## Stack utilizada

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

# Documentação da API - USUARIOS

#### RETORNAR TODOS OS USUARIOS

```http
  GET/users
```



#### RETORNAR UM USUARIO

```http
  GET/users/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### ATUALIZAR UM USUARIO

```http
  PUT/users/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### PARAMETRO BODY 

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `raw`      | `JSON` |Sucesso se retornar um status code 200 |



{  
    
    "nome": "*novo nome*"
    "email": "*novo email*"
    "phone": "*novo telefone*"
    "senha": "*nova venha*"
}

#### CRIAR UM USUARIO

#### PARAMETRO BODY 

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `raw`      | `JSON` |Sucesso se retornar um status code 201 |



{  
    
    "nome": "*nome do usuario*"
    "email": "*email do usuario*"
    "phone": "*telefone do usuario*"
    "senha": "*senha do usuario*"
}

#### DELETAR UM USUARIO

```http
  GET/users/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

# Documentação da API - PRODUTOS

#### RETORNAR TODOS OS PRODUTOS

```http
  GET/products/
```


#### RETORNAR UM PRODUTO POR ID

```http
  GET/products/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |


# Documentação da API - PEDIDOS

#### RETORNAR TODOS OS PEDIDOS

```http
  GET/orders/
```


#### RETORNAR UM PEDIDO POR ID

```http
  GET/orders/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |




# Documentação da API - CATEGORIA

#### RETORNAR TODAS AS CATEGORIAS DE PRODUTOS

```http
  GET/category/
```


#### RETORNAR UMA CATEGORIA POR ID

```http
  GET/category/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |
