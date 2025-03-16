SELECT company
FROM customers
WHERE
    country =  'Latvia'
    AND first_name LIKE 'X%'
    AND sub_date < DATE('now');
    