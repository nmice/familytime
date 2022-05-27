insert into users (id, name)
values (1, 'Папа');
insert into users (id, name)
values (2, 'Мама');

insert into calendar_event (id, descriptor, start_date, is_exactly, user_id)
values (1, 'Поход в кино', current_timestamp, true, 1);
insert into calendar_event (id, descriptor, start_date, is_exactly, user_id)
values (2, 'Соревнования у дочки', current_timestamp, true, 2);