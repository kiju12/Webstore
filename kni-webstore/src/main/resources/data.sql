INSERT INTO user (imie, nazwisko, email, haslo) VALUES ('Admin', 'Admin', 'admin@mail.com', '$2a$10$hv.qM./dL3IBtiIQpFK44O3B.LQIYdLQLK8/kTLoGnSFanTFQhvGi');

INSERT INTO role (nazwa) VALUES ('ROLE_ADMIN');
INSERT INTO role (nazwa) VALUES ('ROLE_MANAGER');
INSERT INTO role (nazwa) VALUES ('ROLE_USER');

INSERT INTO user_roles (user_id, roles_id) VALUES (1, 1);