#Stack
- java: 17
- SpringBooot: 2.6.3

#Problems
If you have problems in Intellij with lombok you can try to do [this](https://stackoverflow.com/questions/9424364/cant-compile-project-when-im-using-lombok-under-intellij-idea "this")

#Consumer Api
Create a new customer

curl --location --request POST 'localhost:8089/api/v1/customer/save' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName":"pepe",
    "lastName": "Ahmed",
    "email": "pepeahmed@gmail.com"
}'
