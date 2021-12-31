# Progress Report

## Overall Group Progress
Previously in phase 1, our group was split into the backend and frontend teams.
For phase 2, we merged together again, and each person had their own main responsibilities.
The frontend team was responsible for their respective views and related android activities, while the backend 
team was split into testing, database, and clean architecture. Finally, the teams connected in order to connect the 
activities to the backend.

## [Dana Al Shekerchi](https://github.com/dalshekerchi)
For phase 2, Dana worked on multiple components of the project. As a Front-End Developer, she worked on creating the UI 
components of the project. One of the main UI features that she implemented was the calendar on the School event Activity. 
She used a RecyclerView to create the different dates on the calendar. Then the positions of the dates were used to 
retrieve the events from that day to the database. On top of that, Dana was the leading developer that connected the 
Front-end features with the SQLite Database. With her previous knowledge of SQL and new knowledge of Andriod, 
she connected the project so that the information inputted by the user can be saved to the database. One of her most 
significant pull request was [`add-event-backend`](https://github.com/CSC207-UofT/course-project-generic-name-1/pull/81). 
This PR was important because it was what finally made the user be able to add an event to their calendar, which was 
the whole point of the app. Dana had to work with the queries to save the `SchoolEvents` attributes and insert them into 
the table to implement this. Next, the attributes needed to be retrieved from the database using the User's ID to display 
a list of all the user's events of a particular date. This implementation was important because it would also be used to 
display information in the `MainActivity`.

## [Bolade Amoussou](https://github.com/cdw18)
For phase 2, Bolade continued implementing Use Cases as a backend team member. She also worked on a "clean up" plan to 
be used to clean up any clean architecture or SOLID principle violations. This is involved making a dependency graph of 
the classes that were there or were to be implemented along with a sort of UML diagram that contained each 
class/interface with their variables and/or methods and parameters. This was her most difficult task and took most of 
her time as this required her to understand clean architecture and SOLID principles well enough and come up with any 
solution to a problem that may have come to be in phase 1 or in phase 2, this can be seen within the [`clean architecture`](https://github.com/CSC207-UofT/course-project-generic-name-1/pull/97)
pull request. Prior to working on the clean-up plan, she also went through the phase 1 rubric and made a list of 
questions that her teammates added to that were to be asked to the TA in order to figure out what needed to change or 
improve for phase 2. This helped a lot with the clean-up plan. She also aided the frontend team when they needed help 
understanding a class or method that was implemented in the inner layers, such as the use case classes or 
controllers/presenters. Lastly, she also wrote parts of SOLID and wrote the Clean Architecture section of the 
design document.

## [Tong (Daniel) Guan](https://github.com/OKok-3)
For both phase 1 and phase 2, Daniel is on the backend team working on the backbone of the program. For phase 2, Daniel 
shifted his main focus on testing while also participating in implementing and discussing design patterns. 
In the [`Use case tests`](https://github.com/CSC207-UofT/course-project-generic-name-1/pull/76)  pull request, Daniel 
implemented all tests for the program's use cases and found several errors and discrepancies involving the 
class `User`, `UserManager`, and `EventDateComparator`. He also found a bug in the regex validator for signing up, which 
prevented the user to use `.` as a special character. In addition, in the pull request [`New Test Suite`](https://github.com/CSC207-UofT/course-project-generic-name-1/pull/101), Daniel learnt and implemented Android instrumented tests to test SQLite database, and refactored test packages to increase interpretability.
In terms of the design document, Daniel wrote Code Organization and Testing. He made short GIFs detailing system setup 
and how to run the program, which was a major issue in phase 1, where Evan was having problems launching our program.
He also helped write the Design Patterns section together with Sari, which discusses various strategies with the backend.
In addition, he contributed to the SOLID principle section of the progress report with Bolade, who wrote the majority of 
the section.

## [Sari Hammad](https://github.com/sarihammad)
During his role as a backend member of the team, Sari was mainly tasked during Phase 1 to implement a working database.
Despite the difficult task, Sari was able to learn the basics of SQLite, a local database used for Java, and share his 
learning experience with the frontend team that needed to know how the database worked. Although the required database 
helpers were successfully implemented, it was difficult for him to implement the database into the app during Phase 1 
due to time constraints and some setbacks, which included some missing UI features at the time, which led to his 
under-contribution. Sari became motivated to work harder during Phase 2 and successfully integrated the database while 
also considering the features of SOLID and Clean Architecture in general by adding the necessary gateways and their 
respective interfaces, which use the database to send/receive information to the use cases.
This is partially demonstrated by the [`database-and-gateways`](https://github.com/CSC207-UofT/course-project-generic-name-1/pull/80) 
pull request. In addition, he used his knowledge of SOLID, Clean Architecture and Design Patterns to help brainstorm and 
identify potential and applicable Design Patterns and different ways to incorporate SOLID in the project, as demonstrated
in the pull request above and the design document.

## [Kathy Lee](https://github.com/hellokathylee)
For phase 2 of the project, Kathy continued with her role as a frontend member of the team. As mentioned in the previous progress report, she continued to develop and improve the overall functionality of UI. Following the phase 1 feedback, Kathy added and implemented a log out button. She also modified the UI layout of adding events, adding a navigation menu to switch between event types and improving the approach to adding user input. As well, she contributed to the implementation of the sort dropdown in the main To Do’s view and display of the event list (under the calendar) in the School view. Additionally, Kathy implemented the dark mode option for Plannr, which would change in place in accordance to the system theme. Throughout the project, she was responsible for ensuring that the overall UI was visually cohesive, and reformatted the activity layouts to reflect this consistency. This was strongly demonstrated with the [`reformat_and_documentation`](https://github.com/CSC207-UofT/course-project-generic-name-1/pull/82) pull request. Additionally in this branch, Kathy worked on code styling and cleanup, where she renamed some class names, added documentation, and discarded unused files. With regards to the design document, Kathy wrote the Code Style and Documentation portion of the report and recorded the app demo tutorials.

## [Evgenia Silajev](https://github.com/EvgeniaSila)
Throughout both phase 1 and 2, Evgenia was on the frontend team and focused on continuing to implement and enhance UI
features added in phase 1 using Android Studio. Within the[`Expenses backend connection`](https://github.com/CSC207-UofT/course-project-generic-name-1/pull/70)
pull request, she worked on connecting the add expenses page and the expenses list to the backend and database, 
ensuring the user's inputted expense information could be stored in the database and then later retrieved for display.
This pull request was essential for the overall functionality of Plannr as expenses are one of the app's key features.
In addition, she included a recycler view for expenses list that would be updated with information from the database.
She also added an income feature to enhance the overall functionality of expenses, allowing a user to see how much of 
their income they have left after calculating their total expenses. In addition, Evgenia worked on the initial design 
of the login page and used the user's name by creating a welcome message that greets that user with their name in the 
main page view. Evgenia also added to the design document by writing the specification, the accessibility report, the 
instructions for how to use features of Plannr, the GitHub feature section, refactoring section, the updated CRC cards 
and both the overall progress report and her part. Finally, edited and reformatted the entire design document. 
