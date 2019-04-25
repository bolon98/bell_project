CREATE TABLE IF NOT EXISTS Organization (
    id               INTEGER               COMMENT 'Уникальный идентификатор'  PRIMARY KEY AUTO_INCREMENT ,
    version          INTEGER NOT NULL      COMMENT 'Служебное поле hibernate',
    name             VARCHAR(50) NOT NULL  COMMENT 'Имя',
    full_name        VARCHAR(50) NOT NULL  COMMENT 'Полное имя',
    inn              VARCHAR(50) NOT NULL  COMMENT 'ИНН',
    kpp              VARCHAR(50) NOT NULL  COMMENT 'КПП',
    address          VARCHAR(50) NOT NULL  COMMENT 'Адрес',
    phone            VARCHAR(50) NOT NULL  COMMENT 'Телефон',
    is_active        BIT                   COMMENT 'Активность'
);
COMMENT ON TABLE Organization IS 'Организация';

CREATE TABLE IF NOT EXISTS Office (
    id               INTEGER              COMMENT 'Уникальный идентификатор'  PRIMARY KEY AUTO_INCREMENT ,
    version          INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
    name             VARCHAR(50) NOT NULL COMMENT 'Имя',
    address          VARCHAR(50) NOT NULL COMMENT 'Адрес',
    phone            VARCHAR(50) NOT NULL COMMENT 'Телефон',
    is_active        BIT                  COMMENT 'Активность',
    org_id           INTEGER              COMMENT 'Идентификатор организации',
    FOREIGN KEY (org_id) REFERENCES Organization(id)
);
COMMENT ON TABLE Office IS 'Офис';

CREATE TABLE IF NOT EXISTS Doc_type (
    id_code          INTEGER              COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT ,
    name             VARCHAR(50) NOT NULL COMMENT 'Название документа'
);
COMMENT ON TABLE Doc_type IS 'Тип документов';

CREATE TABLE IF NOT EXISTS Countries (
    id               INTEGER              COMMENT 'Уникальный идентификатор'  PRIMARY KEY AUTO_INCREMENT ,
    name             VARCHAR(50) NOT NULL COMMENT 'Название страны',
    code             INTEGER NOT NULL     COMMENT 'Код страны'
);
COMMENT ON TABLE Countries IS 'Страны';

CREATE TABLE IF NOT EXISTS User (
    id               INTEGER              COMMENT 'Уникальный идентификатор'  PRIMARY KEY AUTO_INCREMENT ,
    version          INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
    first_name       VARCHAR(50) NOT NULL COMMENT 'Имя',
    second_name      VARCHAR(50) NOT NULL COMMENT 'Фамилия',
    middle_name      VARCHAR(50) NOT NULL COMMENT 'Отчество',
    position         VARCHAR(50) NOT NULL COMMENT 'Должность',
    phone            VARCHAR(50) NOT NULL COMMENT 'Телефон',
    country_id       INTEGER              COMMENT 'Иденификатор страны',
    is_identified    BIT                  COMMENT 'Идентификация',
    office_id        INTEGER              COMMENT 'Идентификатор офиса',
    FOREIGN KEY (country_id) REFERENCES Countries(id),
    FOREIGN KEY (office_id) REFERENCES Office(id)
);
COMMENT ON TABLE User IS 'Сотрудник';

CREATE TABLE IF NOT EXISTS User_doc (
    id               INTEGER              COMMENT 'Уникальный идентификатор'  PRIMARY KEY AUTO_INCREMENT ,
    number           INTEGER NOT NULL     COMMENT 'Номер документа',
    date             DATE NOT NULL        COMMENT 'Дата документа',
    doc_type_id      INTEGER NOT NULL     COMMENT 'Идентификатор типа документа',
    user_id          INTEGER NOT NULL     COMMENT 'Идентификатор сотрудника',
    FOREIGN KEY (doc_type_id) REFERENCES Doc_type(id_code),
    FOREIGN KEY (user_id) REFERENCES User(id)
);
COMMENT ON TABLE User_doc IS 'Документы сотрудника';
