/*
Query a list of CITY and STATE from the STATION table.

Input Format

The STATION table is described as follows:

---------------------------------------
*               STATION               *
---------------------------------------
|     Field       |         Type      |
---------------------------------------
|  ID             |     NUMBER        |
|  CITY           |     VARCHAR2(21)  |
|  STATE          |     VARCHAR2(2)   |
|  LAT_N          |     NUMBER        |
|  LONG_W         |     NUMBER        |
---------------------------------------     
*/

select CITY, STATE from STATION;