insert into family (id, name)
values ('qwerty', 'ТестоваяСемья');
insert into family (id, name)
values ('asdfgh', 'ТестоваяСемья2');

insert into calendar_event (id, descriptor, start_date, end_date, is_exactly, family_id)
values ('111', 'Поход в кино', current_timestamp, current_timestamp, true, 'qwerty');
insert into calendar_event (id, descriptor, start_date, end_date, is_exactly, family_id)
values ('222', 'Соревнования у дочки', current_timestamp, current_timestamp, true, 'qwerty');