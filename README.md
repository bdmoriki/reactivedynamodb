Comando para criação da tabela:

aws dynamodb --endpoint-url http://localhost:8042 create-table --table-name demo-customer-info --attribute-definitions AttributeName=customerId,AttributeType=S --key-schema AttributeName=customerId,KeyType=HASH --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5
