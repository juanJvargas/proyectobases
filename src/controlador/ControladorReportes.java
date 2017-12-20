/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOReportes;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author tovar
 */
public class ControladorReportes {

    DAOReportes daoreportes;

    public ControladorReportes() {
        daoreportes = new DAOReportes();
    }

    public DefaultTableModel obtenerModeloCitas() {
        try {
            return buildTableModel(daoreportes.obtenerCitas());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultTableModel obtenerModeloCitasConMedicoFecha(int idmedico, String fecha) {
        try {
            return buildTableModel(daoreportes.obtenerCitasConMedicoFecha(idmedico, fecha));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }

    public TableModel obtenerModeloCitasConPaciente(int identificacionPaciente) {
        try {
            return buildTableModel(daoreportes.obtenerModeloCitasConPaciente(identificacionPaciente));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    }
}
