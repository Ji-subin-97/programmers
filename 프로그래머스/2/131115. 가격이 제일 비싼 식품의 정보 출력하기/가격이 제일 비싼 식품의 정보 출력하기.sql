-- 코드를 입력하세요
SELECT TB1.PRODUCT_ID
     , TB1.PRODUCT_NAME
     , TB1.PRODUCT_CD
     , TB1.CATEGORY
     , TB1.PRICE
  FROM (
        SELECT PRODUCT_ID
             , PRODUCT_NAME
             , PRODUCT_CD
             , CATEGORY
             , PRICE
          FROM FOOD_PRODUCT
         ORDER BY PRICE DESC
       ) TB1
 WHERE ROWNUM = 1;