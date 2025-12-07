# My API Automation Approach (Katalon + Python Concept)

Although the full framework execution requires a licensed setup, below is my real-world approach
to API testing automation in projects.

## 1. Token Handling
- Dynamic token generation using Global Variables
- Environment based token setup (DEV / QA / UAT / PROD)

## 2. Validations
- Status code validation
- Schema validation
- Nested JSON path validations (items[0].id, items[1].name)
- Sorting verification (Alphabetical/Number based)

## 3. Custom Utilities
- Reusable keywords for
  - GET
  - POST
  - PUT
  - DELETE
- Header based authentication
- Dynamic payload creation

## 4. Error Handling
- Null value checks
- Error message verification
- Retry mechanism logic

## 5. Reporting
- Screenshot / Log capture
- Pass/Fail summary documentation

Tools used earlier in projects:
✅ Katalon Studio  
✅ Postman  
✅ Python + Selenium  
