# SPBMetro
Task 1. A program that collects data from various sources
Writing a program that collects data from different sources and write a JSON file. Parsing of different data should take place in different classes.
Classes:
Web page parsing class:
- obtaining the HTML code of the page "List of Moscow metro stations" (https://skillbox-java.github.io/) using the jsoup library;
- parsing the resulting page and getting the following data from it (creating separate classes for each data type):
Moscow metro lines (line name and number);
Moscow metro stations (station name and line number).
Checking the work of this class: writing a code that uses it and displays the received data. Each class designed to store a particular object implement the toString method, which will return a string with the object's data in an understandable form.

Class for searching files in folders. Methods of this class implement a bypass of the folders in the archive that is on my Desktop. Writing a code that will crawl all subfolders and look for JSON and CSV files (with *.json and *.csv extensions) in them. The method for traversing folders takes the path to the folder in which to search.
Checking the work of this class: passing it the path to the folder as input and making sure that it displays information about the three JSON files found and the three CSV files.

JSON file parsing class examins the structure of the JSON files in the folders and creates a class(es) to store the data from those files. Writing a code that accepts JSON data and return a list of objects that match it.
Checking the work of this class: passing it the data of any of the JSON files found in the previous step as input, and making sure that it outputs the data correctly.

CSV file parsing class examines the structure of the CSV files in the folders and creates a class(es) to store the data from those files. Writing a code that accepts CSV data and returns a list of matching objects.
Checking the work of this class: passing it the data of any of the CSV files found two steps earlier, and making sure that it outputs the data correctly.

A class in which you can add the data obtained in the previous steps, and which creates and writes to disk a JSON file:
with a list of stations by lines and a list of lines by JSON-file format from the SPBMetro project (map.json file);
