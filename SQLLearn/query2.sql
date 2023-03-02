INSERT INTO
    productions (
        production_id,
        production_name,
        address,
        Dateofstarted,
        owner_name
    )
VALUES (
        9091,
        'Arkamediaworks',
        'Hyderabad',
        '2001-01-01',
        'Shobu Yarlagadda'
    ), (
        8892,
        'Lyca Productions',
        'Chennai',
        '2014-01-01',
        'Subaskaran'
    ), (
        1010,
        'Hari Om Entertainment',
        'Mumbai',
        '2008-01-01',
        'Akshay Kumar'
    ), (
        1988,
        'Red Chillies Entertainment',
        'Mumbai',
        '2003-01-01',
        'Shah Rukh Khan'
    ), (
        1899,
        'Viacom18 Studios',
        'Mumbai',
        '2008-01-01',
        'Ajit Andhare'
    ), (
        7882,
        'DVV Entertainments',
        'Hyderabad',
        '1993-01-01',
        'DVV Danayya'
    ), (
        6773,
        'Hombale Flims',
        'Bangalore',
        '1995-01-01',
        'Vijay'
    ), (
        7682,
        'Mythri Movie Makers',
        'Hyderabad',
        '2015-01-01',
        'Naveen Yerneni'
    ), (
        1854,
        'Junglee Pictures',
        'Mumbai',
        '2014-01-01',
        'Vineeth Jain'
    ), (
        2341,
        'CRM',
        'Bangalore',
        '2017-01-01',
        'Manohar'
    ), (
        1111,
        'STP',
        'Chennai',
        '2018-01-01',
        'Sree'
    );

select * from productions;

SELECT
    production_name,
    movie.movie_name
from productions
    join productions on production_id = movie.production_id;

select
    production_id,
    production_name,
    total_movies
from productions;