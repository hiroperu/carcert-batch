TRUNCATE TABLE device_info;
INSERT INTO device_info (id, pushtoken, exdate) VALUES ('00000001', '01AAAABBBB', '1', '2020-12-20');
INSERT INTO device_info (id, pushtoken, exdate) VALUES ('00000002', '02AAAABBBB', '1', '2020-12-21');
INSERT INTO device_info (id, pushtoken, exdate) VALUES ('00000003', '03AAAABBBB', '0', '2021-01-06');
INSERT INTO device_info (id, pushtoken, exdate) VALUES ('00000004', '04AAAABBBB', '0', '2021-10-10');
COMMIT;