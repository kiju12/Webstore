INSERT INTO user (imie, nazwisko, email, haslo) VALUES ('Admin', 'Admin', 'admin@mail.com', '$2a$10$hv.qM./dL3IBtiIQpFK44O3B.LQIYdLQLK8/kTLoGnSFanTFQhvGi');

INSERT INTO role (nazwa) VALUES ('ROLE_ADMIN');
INSERT INTO role (nazwa) VALUES ('ROLE_MANAGER');
INSERT INTO role (nazwa) VALUES ('ROLE_USER');

INSERT INTO user_roles (user_id, roles_id) VALUES (1, 1);

INSERT INTO product (nazwa, krotki_opis, opis, cena, ilosc, kategoria) VALUES ('Przedmiot1', 'krotki opis', 'dlugi opis', '1234', '15', 'Kategoria1');
INSERT INTO product (nazwa, krotki_opis, opis, cena, ilosc, kategoria) VALUES ('Przedmiot2', 'krotki opis2', 'dlugi opis2', '2234', '25', 'Kategoria2');
INSERT INTO product (nazwa, krotki_opis, opis, cena, ilosc, kategoria) VALUES ('Przedmiot3', 'krotki opis3', 'dlugi opis3', '3234', '35', 'Kategoria3');