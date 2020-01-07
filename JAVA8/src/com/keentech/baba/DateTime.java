/**
* - The LocalDate represents a date in ISO format (yyyy-MM-dd) without time.
* - The LocalTime represents time without a date.
* - The LocalDateTime is used to represent a combination of date and time.
* - ZonedDateTime when we need to deal with time zone specific date and time.
* - The Period class represents a quantity of time in terms of years, months and days and 
* - The Duration class represents a quantity of time in terms of seconds and nano seconds.
*/

Issues with the Existing Date/Time APIs
1. Thread Safety – The Date and Calendar classes are not thread safe,
new Date and Time APIs introduced in Java 8 are immutable and thread safe, 
2. APIs Design and Ease of Understanding – The new Date/Time APIs is ISO centric.
ZonedDate and Time – The new APIs, handling of timezone can be done with Local and ZonedDate/Time APIs.
