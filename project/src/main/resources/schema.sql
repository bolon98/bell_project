CREATE TABLE IF NOT EXISTS Organization (
    id               INTEGER               COMMENT 'Уникальный идентификатор'  PRIMARY KEY AUTO_INCREMENT ,
    version          INTEGER NOT NULL      COMMENT 'Служебное поле hibernate',
    name             VARCHAR(50) NOT NULL  COMMENT 'Имя',
    full_name        VARCHAR(50) NOT NULL  COMMENT 'Полное имя',
    inn              VARCHAR(50) NOT NULL  COMMENT 'ИНН',
    kpp              VARCHAR(50) NOT NULL  COMMENT 'КПП',
    address          VARCHAR(50) NOT NULL  COMMENT 'Адрес',
    phone            VARCHAR(50) NOT NULL  COMMENT 'Телефон',
    is_active        BIT DEFAULT true      COMMENT 'Активность'
);
COMMENT ON TABLE Organization IS 'Организация';

CREATE TABLE IF NOT EXISTS Office (
    id               INTEGER              COMMENT 'Уникальный идентификатор'  PRIMARY KEY AUTO_INCREMENT ,
    version          INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
    name             VARCHAR(50) NOT NULL COMMENT 'Имя',
    address          VARCHAR(50) NOT NULL COMMENT 'Адрес',
    phone            VARCHAR(50) NOT NULL COMMENT 'Телефон',
    is_active        BIT DEFAULT true     COMMENT 'Активность'
);
COMMENT ON TABLE Office IS 'Офис';

CREATE TABLE IF NOT EXISTS User (
    id               INTEGER              COMMENT 'Уникальный идентификатор'  PRIMARY KEY AUTO_INCREMENT ,
    version          INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
    first_name       VARCHAR(50) NOT NULL COMMENT 'Имя',
    second_name      VARCHAR(50) NOT NULL COMMENT 'Фамилия',
    middle_name      VARCHAR(50) NOT NULL COMMENT 'Отчество',
    position         VARCHAR(50) NOT NULL COMMENT 'Должность',
    phone            VARCHAR(50) NOT NULL COMMENT 'Телефон',
    doc_name         VARCHAR(50) NOT NULL COMMENT 'Название документа',
    doc_number       INTEGER NOT NULL     COMMENT 'Номер документа',
    doc_date         DATE NOT NULL        COMMENT 'Дата документа',
    citizenship_name VARCHAR(50) NOT NULL COMMENT 'Гражданство',
    citizenship_code INTEGER NOT NULL     COMMENT 'Код гражданства',
    is_identified    BIT DEFAULT true     COMMENT 'Идентификация'
);
COMMENT ON TABLE User IS 'Сотрудник';

CREATE TABLE IF NOT EXISTS Docs (
    name             VARCHAR(50) NOT NULL COMMENT 'Имя',
    code             INTEGER NOT NULL     COMMENT 'Код'
);
COMMENT ON TABLE Docs IS 'Документы';

CREATE TABLE IF NOT EXISTS Countries (
    name             VARCHAR(50) NOT NULL COMMENT 'Имя',
    code             INTEGER NOT NULL     COMMENT 'Код'
);
COMMENT ON TABLE Countries IS 'Страны';
