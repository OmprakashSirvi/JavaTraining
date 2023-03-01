INSERT INTO
    movie (
        movie_id,
        movie_name,
        cast1,
        cast2,
        release_date,
        Lang,
        length,
        movie_type,
        production_id
    )
VALUES (
        201,
        'Bahubali – The Beginning',
        'Prabhas',
        'Tamannah',
        '2015-07-10',
        'Telugu',
        21,
        'Drama Fantasy',
        9091
    ), (
        501,
        '2.0',
        'Rajnikanth',
        'Amy',
        '2018-11-29',
        'Tamil',
        20,
        'Scientific',
        8892
    ), (
        577,
        'Aval',
        'Siddharth',
        'Andrea',
        '2017-11-03',
        'Tamil',
        14,
        'Horror',
        1899
    ), (
        101,
        'Holiday',
        'Akshay Kumar',
        'Sonakshi',
        '2014-06-06',
        'Hindi',
        15,
        'Crime Thriller',
        1010
    ), (
        151,
        'Zero',
        'Shah Rukh Khan',
        'Katrina Kaif',
        '2018-12-21',
        'Hindi',
        16,
        'Scientific',
        1988
    ), (
        131,
        'Padmavaat',
        'Shahid Kapoor',
        'Deepika Padukone',
        '2018-01-25',
        'Hindi',
        21,
        'Drama Epic',
        1899
    ), (
        146,
        'Andhadhun',
        'Ayushmann',
        'Radhika Apte',
        '2018-10-05',
        'Hindi',
        16,
        'Crime Thriller',
        1899
    ), (
        231,
        'Bharath Ane nenu',
        'Mahesh Babu',
        'Kiara',
        '2018-04-20',
        'Telugu',
        15,
        'Thriller',
        7882
    ), (
        244,
        'Gruham',
        'Siddharth',
        'Andrea',
        '2018-11-17',
        'Telugu',
        14,
        'Horror',
        1899
    ), (
        337,
        'KGF Chapter 1',
        'Yash',
        'Srinidhi Shetty',
        '2018-12-21',
        'Kannada',
        21,
        'Action Thriller',
        6773
    ), (
        224,
        'Rangasthalam',
        'Ram Charan',
        'Samantha',
        '2018-03-30',
        'Telugu',
        17,
        'Drama Period',
        7682
    ), (
        136,
        'Badhaai Ho',
        'Ayushmann',
        'Neena Gupta',
        '2018-10-18',
        'Hindi',
        14,
        'Drama Comedy',
        1854
    ), (
        441,
        'The Villain',
        'Sudeep',
        'Amy',
        '2018-10-18',
        'Kannada',
        16,
        'Drama',
        2341
    ), (
        206,
        'Maryada Ramanna',
        'Sunil',
        'Saloni',
        '2010-07-23',
        'Telugu',
        19,
        'Drama',
        9091
    );

SELECT movie_name FROM movie WHERE movie_type LIKE 'drama%';

SELECT * FROM movie WHERE cast1 = 'Ayushmann';

SELECT COUNT(*)
FROM (
        SELECT *
        FROM movie
        WHERE
            length > 18
    ) movie_count;

select *
from movie
where length = (
        select min(length)
        from movie
    );

select * from movie where Lang like "T%";

select
    movie_name,
    cast1,
    cast2
from movie
where length = (
        select max(length)
        from movie
    );

select
    movie_name,
    cast1,
    cast2
from movie
where
    release_date > '2018-05-15';

select count(*) from movie where movie_type like "%Thriller%";

select
    movie_name,
    cast1,
    cast2
from movie
where
    release_date < '2018-05-15';

select release_date from movie where movie_name="Zero";