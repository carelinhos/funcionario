import sqlite3
conn = sqlite3.connect('Banco_Vista_Serrana2.db')
cursor = conn.cursor()
sql = """
  CREATE TABLE IF NOT EXISTS Produtos(
  id_produto integer primary key, 
  nome_produto varchar(200) not null,
     unidade_medida varchar(20) ,
      quantidade_atual int,
      data_entrada date ,
      quantidade_minima int,
     preco_unitario float,
      data_validade date )
"""



cursor.execute(sql)
conn.commit()
cursor.close()
conn.close()

