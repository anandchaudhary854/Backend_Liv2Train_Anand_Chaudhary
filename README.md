# Backend_Liv2Train_Anand_Chaudhary
SETUP INSTRUCTIONS:

1. First create a demo database on your system in mysql. Then open the folder named "Backend_Liv2Train_Anand_Chaudhary" as a 
   intellij idea project.

2. Run the springboot application.

3. Now you can upload a training center details using postman.

4. Use "/uploadCenter" post api to upload a training center information on the database.

5. Now if you voilate any constraints like if you center code that is of less 12 characters or more than 12 characters then it will give
   a 404 bad request and in message it will say "Please enter appropriate information in all the mandatory fields". Similarly it will give 404
   if you enter information in wrong format and also if you enter a duplicate value for phoneNo and email(if provided).

6. Now to get all the saved training centers use the get api "/getAllCenters". If there are no saved centers it will return a empty list else
   it will a list of training centers in json format.
