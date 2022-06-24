

/** Status **/
INSERT INTO public.status (id, description) VALUES (1, 'Pending');
INSERT INTO public.status (id, description) VALUES (2, 'In Progress');
INSERT INTO public.status (id, description) VALUES (3, 'Done');

/** Services **/
INSERT INTO public.service (id,description) VALUES (1,'OIL_CHANGE');
INSERT INTO public.service (id,description) VALUES (2,'TIRE_CHANGE');

/** Vehicles **/
INSERT INTO public.vehicle (id, vin_num, serial_num, brand, car_type, engine_type)VALUES (1, 1234,9101 , 'TOYOTA', 'SUV', 'DIESEL');
INSERT INTO public.vehicle (id, vin_num, serial_num, brand, car_type, engine_type)VALUES (2, 5678, 1234, 'HYUNDAI', '4X4', 'GAS');
INSERT INTO public.vehicle (id, vin_num, serial_num, brand, car_type, engine_type)VALUES (3, 9101, 5678, 'PORSHE', '4X2', 'DIESEL');

/** Privilege **/
INSERT INTO public.privilege (id, name) VALUES (1, 'WRITE_PRIVILEGE');
INSERT INTO public.privilege (id, name) VALUES (2, 'READ_PRIVILEGE');

/** Role **/
INSERT INTO public.role (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO public.role (id, name) VALUES (2, 'ROLE_MECHANIC');
INSERT INTO public.role (id, name) VALUES (3, 'ROLE_CLIENT');

/** Role-Privilege **/
INSERT INTO public.role_privilege (role_id, privilege_id) VALUES (1, 1);
INSERT INTO public.role_privilege (role_id, privilege_id) VALUES (1, 2);
INSERT INTO public.role_privilege (role_id, privilege_id) VALUES (2, 2);
INSERT INTO public.role_privilege (role_id, privilege_id) VALUES (3, 2);


/** Users **/
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired) VALUES (1, '2020-08-30 18:23:52.000000', 'admin@guzmanalan.com', true, 'Maikol', 'Guzman', '$2a$10$6hg/QTw8Th1EmYtg9/5HhOmRdg320A6J8DumNUqx.4AltXZAjp0VK', false);
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired) VALUES (2, '2022-04-16 08:23:25.000000', 'staff@guzmanalan.com', true, 'Staff', 'Guzman', '$2a$10$6hg/QTw8Th1EmYtg9/5HhOmRdg320A6J8DumNUqx.4AltXZAjp0VK', false);
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired) VALUES (3, '2022-04-16 08:24:48.000000', 'user@guzmanalan.com', true, 'User', 'Guzman', '$2a$10$6hg/QTw8Th1EmYtg9/5HhOmRdg320A6J8DumNUqx.4AltXZAjp0VK', false);


/** User-Role **/
INSERT INTO public.user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO public.user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO public.user_role (user_id, role_id) VALUES (3, 3);

/** Repairs **/
INSERT INTO public.repair (id,vehicle_id,status_id) VALUES (1,1,1);
INSERT INTO public.repair (id,vehicle_id,status_id) VALUES (2,2,2);

/** Repairs-Service **/
INSERT INTO public.repair_service (repair_id,service_id) VALUES (1, 1);
INSERT INTO public.repair_service (repair_id,service_id) VALUES (2, 2);

/** Repairs-Users **/
INSERT INTO public.repair_users (repair_id,user_id) VALUES (1, 2);
INSERT INTO public.repair_users (repair_id,user_id) VALUES (2, 3);