/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  juan
 * Created: 15-dic-2017
 */

SELECT * FROM paciente;

---select nombre as Medico, fecha, hora from cita natural join empleado where identificacion_paciente = '1' and fecha >= NOW();
 