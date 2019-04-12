INSERT INTO Organization (id, version, name, full_name, inn, kpp, address, phone, is_active) VALUES (1, 0, 'Bell', 'Bell Integrator', '	7733180847', '502401001', 'г. Саратов', '659483', true);
INSERT INTO Organization (id, version, name, full_name, inn, kpp, address, phone, is_active) VALUES (2, 0, 'Neoflex', 'Неофлекс-консалтинг', '7701839238', '771401001', 'г. Саратов', '082982', true);

INSERT INTO Office (id, version, name, address, phone, is_active) VALUES (1, 0, 'Центральный', 'г. Пенза', '454647', true);
INSERT INTO Office (id, version, name, address, phone, is_active) VALUES (2, 0, 'Филиал', 'г. Саратов', '297254', true);

INSERT INTO User (id, version, first_name, second_name, middle_name, position, phone,  doc_name, doc_number, doc_date, citizenship_name, citizenship_code, is_identified) VALUES (1, 0, 'Петр', 'Парамонов', 'Сергеевич', 'Специалист', '9069876325', 'Паспорт', 6318, '2018-03-18', 'РФ', 1, true);
INSERT INTO User (id, version, first_name, second_name, middle_name, position, phone,  doc_name, doc_number, doc_date, citizenship_name, citizenship_code, is_identified) VALUES (2, 0, 'Ярослав', 'Венедиктов', 'Юрьевич', 'мл. Специалист', '9603543987', 'Паспорт', 6316, '2016-11-14', 'Украина', 2, true);

INSERT INTO Docs (name, code) VALUES ('Паспорт', 1);
INSERT INTO Docs (name, code) VALUES ('ИНН', 2);

INSERT INTO Countries (name, code) VALUES ('Россия', 1);
INSERT INTO Countries (name, code) VALUES ('Украина', 2);