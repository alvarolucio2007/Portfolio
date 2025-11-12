# 📦 Sistema de Controle de Estoque

Sistema de gestão de produtos com interface web moderna, persistência de dados e operações CRUD completas.

---

## 🚀 Funcionalidades

### CRUD Completo
| Operação | Funcionalidade | Descrição |
|:--------:|:--------------|:----------|
| **Create** | Cadastrar Produto | Adiciona novo produto com validação de código único, categoria e valores |
| **Read** | Listar Produtos | Exibe todos os produtos em tabela interativa |
| **Read** | Buscar Produto | Busca por nome, categoria ou estoque baixo |
| **Update** | Atualizar Produto | Permite alterar qualquer campo (Nome, Código, Preço, Estoque, Categoria) |
| **Delete** | Excluir Produto | Remove produto permanentemente com confirmação de segurança |
| **Track** | Movimentar Produto | Registra entrada/saída de produtos (em desenvolvimento) |

---

## 💻 Tecnologias Utilizadas

- **Python 3.x**
- **Streamlit** - Interface web responsiva
- **Pandas** - Manipulação e visualização de dados
- **JSON** - Persistência de dados local

---

## 📋 Pré-requisitos
```bash
pip install streamlit pandas
```

---

## ⚙️ Como Executar

### Localmente:
```bash
streamlit run app.py
```

### Deploy (Streamlit Cloud):
Acesse: [Link do Deploy](https://sistemacrud-alvarolucio2007.streamlit.app/)

---

## 🎨 Interface

### Home (Listagem)
- Visualização em tabela de todos os produtos
- Informações: Código, Nome, Categoria, Preço, Estoque

### Cadastrar Produto
- Formulário com validações
- Campos: Nome, Código (único), Categoria, Preço, Quantidade
- Categorias: Alimento, Limpeza, Higiene, Outros

### Buscar Produto
- **Por Nome**: Busca parcial (case-insensitive)
- **Por Categoria**: Filtro por categoria específica
- **Estoque Baixo**: Produtos abaixo de limite definido

### Atualizar Produto
- Seleção de campo a atualizar
- Validação de valores
- Atualização instantânea

### Excluir Produto
- Busca por código
- Confirmação de exclusão
- Ação irreversível

---

## 🗂️ Estrutura de Dados

### Produto (JSON)
```json
{
  "Código": 1,
  "Nome": "Arroz",
  "Categoria": "Alimento",
  "Preço": 25.90,
  "Estoque": 100.0
}
```

### Armazenamento
- Arquivo: `estoque.json`
- Localização: Diretório de execução
- Formato: Lista de dicionários

---

## 🛡️ Validações

### Cadastro:
- ✅ Código único (não pode duplicar)
- ✅ Nome não vazio
- ✅ Categoria válida (das 4 opções)
- ✅ Preço > 0
- ✅ Quantidade ≥ 0

### Atualização:
- ✅ Código existente
- ✅ Campo válido
- ✅ Valores numéricos > 0
- ✅ Strings não vazias

---

## 📊 Arquitetura
```
┌─────────────────────────────────────┐
│         FrontEnd (Streamlit)        │
│  - renderizar_home()                │
│  - renderizar_cadastro()            │
│  - renderizar_buscar()              │
│  - renderizar_atualizar()           │
│  - renderizar_excluir()             │
└──────────────┬──────────────────────┘
               │
               ▼
┌─────────────────────────────────────┐
│      ControleEstoque (Backend)      │
│  - cadastrar_produto()              │
│  - buscar_nome()                    │
│  - listar_por_categoria()           │
│  - atualizar_produto()              │
│  - excluir_produto()                │
│  - mostrar_estoque_baixo()          │
└──────────────┬──────────────────────┘
               │
               ▼
┌─────────────────────────────────────┐
│      Persistência (estoque.json)    │
└─────────────────────────────────────┘
```

---

## 🔧 Funcionalidades em Desenvolvimento

- 🔄 Sistema de movimentação de produtos (entrada/saída)
- 📊 Dashboard com gráficos e estatísticas
- 📄 Exportação de relatórios (PDF/Excel)
- 🔔 Alertas de estoque baixo
- 🏪 Suporte multi-lojas

---

## 📝 Type Hints

Código utiliza type hints completos para melhor legibilidade e manutenção:
```python
def cadastrar_produto(
    self,
    nome: str,
    codigo: int,
    categoria: str,
    preco: float,
    quantidade: float
) -> None:
    ...
```

---

## 🐛 Tratamento de Erros

- ✅ Exceções personalizadas com mensagens claras
- ✅ Feedback visual no Streamlit (success/error/warning)
- ✅ Validação de entrada em todos os formulários
- ✅ Tratamento de JSON corrompido/vazio

---

## 👨‍💻 Autor

**Álvaro Lúcio Mousinho Coelho**  
Estudante de Engenharia de Software - 2º Período

---

## 📄 Licença

Este projeto é de código aberto e está disponível sob a licença MIT.

---

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:
- Reportar bugs
- Sugerir novas funcionalidades
- Enviar pull requests

---

## 📸 Screenshots

### Home
![Home](https://github.com/user-attachments/assets/68641b8d-8254-4b97-94dd-94977fd5abf4)

### Cadastro
![Cadastro](https://github.com/user-attachments/assets/bba32dd5-4160-4892-ba17-4451697c4b32)

### Exclusão
![Exclusão](https://github.com/user-attachments/assets/f2ba4111-7d1e-4c1a-b6f9-cfdf2afd40ad)

---

## 🔗 Links Úteis

- [Deploy em Produção](https://sistemacrud-alvarolucio2007.streamlit.app/)
- [Documentação Streamlit](https://docs.streamlit.io/)
- [Documentação Pandas](https://pandas.pydata.org/docs/)

---

## ⭐ Versão

**v2.0** - Interface web com Streamlit  
**v1.0** - Interface CLI (Terminal)

---

**💡 Dica:** Para resetar o estoque, delete o arquivo `estoque.json` e reinicie a aplicação.