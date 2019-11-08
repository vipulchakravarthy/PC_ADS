An organisation is required to fill the vacancies in their organisation. They conducted an exam and they had a list of qualified students. you need to fill the vacancies based on the given criteria.

Input format:
first line contains an int(N) represents no.of students qualified
Second line contains an int represent no.of vacancies
Thirst line contains an int represent no.of unreserved category vacancies
Fourth line contains an int represents no.of BC category vacancies
Fifth line contains an int represents no.of SC category vacancies
Sixth line contains an int represents no.of ST category vacancies
Following N lines represents student information

Student Attributes are:
Student Name, Date of birth, subject1 marks, subject2 marks, subject3 marks, Total marks, Reservation category 

Input was read by the main method and Student array with all the qualified students is passed as parameter to the method getSelectedList(). This method should return an student array having selected students for the vacancies in sorted order.



merit order:
student who got more total marks will be given the priority
if total marks are equal then student who got more marks in subject 3 will be given the priority. 
if subject 3 marks are equal then student who got more marks in subject 2 will be given the priority. 
if subject 2 marks are equal then younger student will be given priority.

Reservation criteria:
All applicants are eligible for un reserved category seats
Un reserved category seats should be filled with descending merit order
reserved seats should be filled with reserved students in descending merit order
if any of the reserved seats are left with out reserved candidates then fill the seats with descending merit order 