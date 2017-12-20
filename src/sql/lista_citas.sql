/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  juan
 * Created: 15-dic-2017
 */

--SELECT * FROM cita;
select codigo_medicamento, nombre, cantidad from formula_medicamento natural join medicamento
where codigo_formula = 
(select from codigo_formula from formula where identificacion_empleado = '114404' and identificacion_paciente = '1523382' and fecha = '2017-12-20')