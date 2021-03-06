--! qt:dataset:src1
--! qt:dataset:src
set hive.mapred.mode=nonstrict;
set hive.map.aggr = true;

-- SORT_QUERY_RESULTS

-- union case: 1 subquery is a map-reduce job, different inputs for sub-queries, followed by reducesink

explain 
  select unionsrc.key, count(1) FROM (select s2.key as key, s2.value as value from src1 s2
                                        UNION  ALL  
                                      select 'tst1' as key, cast(count(1) as string) as value from src s1) 
  unionsrc group by unionsrc.key;



  select unionsrc.key, count(1) FROM (select s2.key as key, s2.value as value from src1 s2
                                        UNION  ALL  
                                      select 'tst1' as key, cast(count(1) as string) as value from src s1) 
  unionsrc group by unionsrc.key;
