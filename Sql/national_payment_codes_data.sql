create table if not exists national_payment_codes_data(
nation_payment_code varchar(255) not null,
nation_payment_name varchar(255) null,
country varchar(255) null,
payment_type varchar(255) null,
short_description varchar(255) null,
routing_system varchar(255) null,
type_currency varchar(255) null,
local_language_code Integer null,
local_language_display varchar(255) null,
service_name varchar(255) null,
status varchar(255) null,
constraint national_payment_codes_data_pk primary key(nation_payment_code));