import pandas as pd
arquivo = 'Fevereiro.xlsx'
df = pd.read_excel(arquivo)
print(df.head())
