INSERT INTO Organization (id, version, name, full_name, inn, kpp, address, phone, is_active) VALUES (1, 0, 'Bell', 'Bell Integrator', '7733180847', '502401001', 'г. Саратов', '659483', true);
INSERT INTO Organization (id, version, name, full_name, inn, kpp, address, phone, is_active) VALUES (2, 0, 'Neoflex', 'Неофлекс-консалтинг', '7701839238', '771401001', 'г. Саратов', '082982', true);

INSERT INTO Office (id, version, name, address, phone, is_active, org_id) VALUES (1, 0, 'Центральный', 'г. Пенза', '454647', true, 1);
INSERT INTO Office (id, version, name, address, phone, is_active, org_id) VALUES (2, 0, 'Филиал', 'г. Саратов', '297254', true, 2);

INSERT INTO Doc_type (id, name, code) VALUES (1, 'Паспорт', 1);
INSERT INTO Doc_type (id, name, code) VALUES (2, 'ИНН', 1);

INSERT INTO Countries (id, name, code) VALUES (1, 'Россия', 1);
INSERT INTO Countries (id, name, code) VALUES (2, 'Украина', 2);

INSERT INTO User_doc (id, number, date, doc_type_id) VALUES (1, 6314, '2014-03-18', 1);
INSERT INTO User_doc (id, number, date, doc_type_id) VALUES (2, 1234, '2010-08-15', 2);

INSERT INTO User (id, version, first_name, second_name, middle_name, position, phone, country_id, is_identified, office_id, user_doc_id) VALUES (1, 0, 'Петр', 'Парамонов', 'Сергеевич', 'Специалист', '9069876325', 1, true, 1, 1);
INSERT INTO User (id, version, first_name, second_name, middle_name, position, phone, country_id, is_identified, office_id, user_doc_id) VALUES (2, 0, 'Ярослав', 'Венедиктов', 'Юрьевич', 'мл. Специалист', '9603543987', 2, true, 2, 2);