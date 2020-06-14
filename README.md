# BookingApp

API's in this project

BookingApp apis

For creating user:-

http://localhost:8080/user/createUser

By default role will be of user,there is only one admin whose role has been set as admin and only he has the permission to access all the users and hotels details

RequestBody
{
   "fullName" : "Avinash Kumar",
   "city" : "Bangalore",
   "password" : "avish",
   "email" : "avinash(024@gmail.com" 
}

Response userCreated
{
    "fullName": "Avinash",
    "emailId": "avish23340@gmail.com",
    "password": "avish946",
    "city": "Bangalore",
    "role": "user"
}
or 
{"result":"Failure"
}

For deleting user:-

http://localhost:8080/user/deleteUser

RequestParam
    email : avinash9024@gmail.com
Response

{"result":"Success"
}
or
{"result":"Failure"
}

For getting list of all users:-

http://localhost:8080/user/getAll

Response

[{
    "fullName": "Avinash",
    "emailId": "avish23340@gmail.com",
    "password": "avish946",
    "city": "Bangalore",
    "role": "user"
},
{
    "fullName": "Avinash",
    "emailId": "avish23340@gmail.com",
    "password": "avish946",
    "city": "Bangalore",
    "role": "user"
}]


For login user:-

http://localhost:8080/user/logIn

RequestBody
{
email : avinash9024@gmail.com,
password : avinash9024
}

Responses 

{
Response : Success
}

{
Response : Failure
}

For updating user:-
http://localhost:8080/user/updateUser

request
{
    "fullName": "Avinash",
    "emailId": "avish23340@gmail.com",
    "password": "avish946",
    "city": "Bangalore",
    "role": "user"
}

response

{
    "fullName": "Avinash",
    "emailId": "avish23340@gmail.com",
    "password": "avish946",
    "city": "Bangalore",
    "role": "user"
}


For searching hotel on the basis of filters
http://localhost:8080/searchHotels

Request

{
        "city" : "Bangalore",
        "ac" : "true",
        "noOfRoomsAvailable" : "2",
        "noOfStars" : "3",
        "noOfPersons" : "3",
        "restaurantAvailable" : "true",
        "wifiFacility" : "true" ,
        "mealsIncluded" : "true",
        "costOfStay" : "1200",
        "availability" : "true"
       }

Response
{
Hotels : [{
        hotelName : RRN,
        city : Bangalore,
        availability : true,
        noOfRoomsAvailable : 2,
        noOfStars : 3,
        wifiFacility : true,
        ac : true ,
        mealsIncluded : true,
        costOfStay : 1200,
        restaurantAvailable : true
        },
       {
        hotelName : RRN,
        city : Bangalore,
        availability : true,
        noOfRoomsAvailable : 2,
        noOfStars : 3,
        wifiFacility : true,
        ac : true ,
        mealsIncluded : true,
        costOfStay : 1200,
        restaurantAvailable : true
        },
        {
        hotelName : RRN,
        city : Bangalore,
        availability : true,
        noOfRoomsAvailable : 2,
        noOfStars : 3,
        wifiFacility : true,
        ac : true ,
        mealsIncluded : true,
        costOfStay : 1200,
        restaurantAvailable : true
        }]}
       
       
For adding Hotel:-
http://localhost:8080/hotel/addHotels

Request
{
        hotelName : RRN,
        city : Bangalore,
        availability : true,
        noOfRoomsAvailable : 2,
        noOfStars : 3,
        wifiFacility : true,
        ac : true ,
        mealsIncluded : true,
        costOfStay : 1200,
        restaurantAvailable : true
        }
        
 Response
 
 {      
        hotelId : "07HkfDnc6Bp9doTZtN4qJ88DxKp00CAC4WzwWJ"
        hotelName : RRN,
        city : Bangalore,
        availability : true,
        noOfRoomsAvailable : 2,
        noOfStars : 3,
        wifiFacility : true,
        ac : true ,
        mealsIncluded : true,
        costOfStay : 1200,
        restaurantAvailable : true
        }
 
For updating hotels

http://localhost:8080/hotel/updateHotels{id}

{
        hotelId : 2,
        hotelName : RRN,
        city : Bangalore,
        availability : true,
        noOfRoomsAvailable : 2,
        noOfStars : 3,
        wifiFacility : true,
        ac : true ,
        mealsIncluded : true,
        costOfStay : 1200,
        restaurantAvailable : true
        }

For deleting hotels
http://localhost:8080/hotel/deleteHotels{id}

      {
        hotelId : "07HkfDnc6Bp9doTZtN4qJ88DxKp00CAC4WzwWJ",
        
      }
For getting list of all hotels
http://localhost:8080/hotel/getAll

Response

[{
        hotelId : 2,
        hotelName : RRN,
        city : Bangalore,
        availability : true,
        noOfRoomsAvailable : 2,
        noOfStars : 3,
        wifiFacility : true,
        ac : true ,
        mealsIncluded : true,
        costOfStay : 1200,
        restaurantAvailable : true
        },{
        hotelId : 2,
        hotelName : RRN,
        city : Bangalore,
        availability : true,
        noOfRoomsAvailable : 2,
        noOfStars : 3,
        wifiFacility : true,
        ac : true ,
        mealsIncluded : true,
        costOfStay : 1200,
        restaurantAvailable : true
        }]


For adding review
http://localhost:8080/addReview

{
userId:"07HkfDnc6Bp9doTZtN4qJ88DxKp00CAC4WzwWJ"
hotelId:"07HkfDnc6Bp9doTZtN4qJ88DxKp00CAC4WzwWJ"
email : avinash9024@gmail.com
Review : “pleasure to move in”

}

For deleting review
http://localhost:8080/deleteReview{id}

{
reviewId : "07HkfDnc6Bp9doTZtN4qJ88DxKp00CAC4WzwWJ",
}
