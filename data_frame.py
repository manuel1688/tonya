
import pandas as pd

df1 = pd.DataFrame({
  'Product ID': [1, 2, 3, 4],
  'Product Name':['t-shirt','t-shirt','skirt','skirt'],
  'Color':['blue','green','red','black']
})

# print(df1)

df2 = pd.DataFrame([
  [1, 'San Diego', 100],
  [2, 'Los Angeles', 120],
  [3, 'San Francisco', 90],
  [4, 'Sacramento', 115],
],
columns=['Store ID','Location','Number of Employees'])

# print(df2)

df = pd.read_csv('Riparian_Birds_Sierra_Nevada_Foothills.csv')

# print(df.head())

print(df.info())

print(df)

df3 = pd.DataFrame([
  ['January', 100, 100, 23, 100],
  ['February', 51, 45, 145, 45],
  ['March', 81, 96, 65, 96],
  ['April', 80, 80, 54, 180],
  ['May', 51, 54, 54, 154],
  ['June', 112, 109, 79, 129]],
  columns=['month', 'clinic_east',
           'clinic_north', 'clinic_south',
           'clinic_west']
)

clinic_north = df3[['clinic_north','clinic_south']] 
# print(type(clinic_north))
# print(type(df3))
print(clinic_north)

april_may_june = df.iloc[[5,2,4]]
april_may_june.reset_index()
print(april_may_june)

# Select Rows with Logic I
january = df3[df3['month'] == 'January']
print(january)

# Select Rows with Logic II
march_april = df3[(df3.month == 'April') |
   (df3.month == 'March')]
print(march_april)

# Select Rows with Logic III
january_february_march = df3[df3.month.isin(['February',
     'January',
     'April'])]

print(january_february_march)