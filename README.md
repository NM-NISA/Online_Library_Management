# Online_Library_Management_System
Output
![image (3)](https://github.com/user-attachments/assets/dca9cb3c-2503-4b07-8886-a12325dd78e3)

ER Diagram
![undefined (1)](https://github.com/user-attachments/assets/6b8fcf03-d57c-4708-8d4f-1a3f3878d1ab)

Table Creation 

Table Book: 
CREATE TABLE Book ( 
TITLE VARCHAR2 (225), 
ISBN NUMBER (20), 
GENRE VARCHAR2(225), 
AUTHOR VARCHAR2(225), 
PUBLICATION_YEAR NUMBER (20) 
); 
![A screenshot of a computer__Description automatically generated](https://github.com/user-attachments/assets/257f341a-8060-4a73-a006-c0d8bd00a6fd)

Table Borrower:
CREATE TABLE Borrower (
BORROWER_NAME VARCHAR2 (225),
BID NUMBER (20),
CONTACT_INFORMATION VARCHAR2(225),
MEMBERSHIP_STATUS VARCHAR2(225),
ISBN NUMBER (20)
);
![image (5)](https://github.com/user-attachments/assets/3e184139-4329-47a0-8d19-f895e4bfcd71)

Table Transaction:
CREATE TABLE Transaction (
TID NUMBER (22),
BID NUMBER (20),
PID NUMBER (20),
ISBN NUMBER (20),
DUE_DATE DATE,
ISSUE_DATE DATE
);
![image (6)](https://github.com/user-attachments/assets/0cdd383c-42fc-4ba5-b065-be618972810f)

Table Keys:
CREATE TABLE Keys (
TID Number(20),
BID Number(20),
PID  Number(20),
ISBN Number(20)
); 
![image (7)](https://github.com/user-attachments/assets/7b32f3e8-934c-4268-b0c8-a26406ed924e)

Table Payment:
CREATE TABLE Payment (
PID NUMBER (20),
PAYMENT_DATE DATE,
BID NUMBER (20)
);
![image (8)](https://github.com/user-attachments/assets/01e9170b-729f-4128-8bea-585381fc43e7)

Table Fine:
CREATE TABLE Fine (
FID NUMBER (20),
DAYS_OVERDUE NUMBER(20),
PENALTY_RATE NUMBER(20,2),
PID NUMBER (20)     
);
![image (1)](https://github.com/user-attachments/assets/f329fc68-bfba-4331-99cf-592485f416ed)

Setting up primary keys & foreign keys:

For table Book:
ALTER TABLE Book ADD CONSTRAINT Book_PK PRIMARY KEY (ISBN);
![image (9)](https://github.com/user-attachments/assets/c80868b2-9bae-40a3-a927-6022fc738c27)

For table Borrower:
ALTER TABLE Borrower ADD CONSTRAINT Borrower_PK PRIMARY KEY (BID);
ALTER TABLE Borrower ADD CONSTRAINT ISBN FOREIGN KEY (ISBN) REFERENCES Book (ISBN);
![image (3)](https://github.com/user-attachments/assets/67ff3320-9c15-447d-9bba-28646118bec3)





