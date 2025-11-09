from sqlalchemy import create_engine

import pandas as pd
arquivo = 'Fevereiro.xlsx'
df = pd.read_excel(arquivo)
df2 = df.copy()



banco_de_dados = 'Banco_Vista_Serrana2.db'
engine = create_engine(f'sqlite:///{banco_de_dados}')


df2.to_sql('Produtos', engine, if_exists='replace', index=False)
