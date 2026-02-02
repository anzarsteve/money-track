-- TRANSACTION TYPE DATA INSERTION SCRIPT
INSERT INTO public.transaction_type ( code, description, created_by, created_at, updated_by, updated_at, active ) VALUES ( 'INGRESO','Es el tipo de movimiento o transaccion para cuando ingresa dinero a alguna cuenta','system','2026-01-19 20:24:02.896','system','2026-01-19 20:24:02.896', true);

-- TRANSACTION_CATEGORY DATA INSERTION SCRIPT
INSERT INTO public.transaction_category ( code, description, created_by, created_at, updated_by, updated_at, active ) VALUES ( 'NOMINA','Categoria de transaccion para movimientos relacionados con nomina o salarios','system','2026-01-19 20:24:02.896','system','2026-01-19 20:24:02.896', true);

-- ACCOUNT DATA INSERTION SCRIPT
INSERT INTO public.accounts ( number_account, financial_institution_name, created_by, created_at, updated_by, updated_at, active ) VALUES ( 1234567,'BANCO UNION','system','2026-01-19 20:24:02.896','system','2026-01-19 20:24:02.896', true);
INSERT INTO public.accounts ( number_account, financial_institution_name, created_by, created_at, updated_by, updated_at, active ) VALUES ( 9876543,'BANCO MERCANTIL','system','2026-01-19 20:24:02.896','system','2026-01-19 20:24:02.896', true);