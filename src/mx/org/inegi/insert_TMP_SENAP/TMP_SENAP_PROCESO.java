/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.inegi.insert_TMP_SENAP;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.org.inegi.LeeSQLSERVER_SENAP.QueryTMPSENAP;
import mx.org.inegi.bean.SENAP_TMP.BeanTMP_SENAP_PROCESO;
import mx.org.inegi.conexion.SENAP.ConORACLEFactory;
import oracle.jdbc.OracleTypes;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;

/**
 *
 * @author ANTONIO.CORIA
 */
public class TMP_SENAP_PROCESO {

    public void TMP_SENAP_PROCESO(String Entidad, String Periodo) throws Exception {

        ARRAY array_to_pass;
        ArrayList<ArrayList<String>> fila;
        CallableStatement st;
        Connection con = null;
        STRUCT[] structs;
        StructDescriptor sd;
        ArrayDescriptor descriptor;
        con = ConORACLEFactory.creaConexion();
        int CFilas = 0;

        try {

            ArrayList<BeanTMP_SENAP_PROCESO> ad = new ArrayList<>();
            QueryTMPSENAP DBOData = new QueryTMPSENAP();
            fila = DBOData.DBO_PROCESO();
            if (fila != null){
            for (int i = 0; i < fila.size(); i++) {
                BeanTMP_SENAP_PROCESO c = new BeanTMP_SENAP_PROCESO();
                ArrayList<String> filaActual = fila.get(i);
                for (int j = 0; j < 21; j++) {
                    c.SetENTIDADID(Entidad);
                    c.SetPROCESOID(filaActual.get(0));
                    c.SetPROCESOID_FISCALIA(filaActual.get(1));
                    c.SetCATFISCALIAID(filaActual.get(2));
                    c.SetIMPUTADOID(filaActual.get(3));
                    c.SetPROCESOCAUSA(filaActual.get(4));
                    c.SetFECHAINICIO(filaActual.get(5));
                    c.SetANIOPROCESO(filaActual.get(6));
                    c.SetHUBOCELEBRACIONAUDIENCIAINICIAL(filaActual.get(7));
                    c.SetCATMOTIVOAUDIENCIAINICIALID(filaActual.get(8));
                    c.SetBORRADO(filaActual.get(9));
                    c.SetFECHAALTA(filaActual.get(10));
                    c.SetUSUARIOALTA(filaActual.get(11));
                    c.SetIMPUTADOID_FISCALIA(filaActual.get(12));
                    c.SetFECHAAUDIENCIAINICIAL(filaActual.get(13));
                    c.SetOTROMOTIVO(filaActual.get(14));
                    c.SetULTIMOESTATUSPROCESOID(filaActual.get(15));
                    c.SetFECHAULTIMOESTATUSPROCESO(filaActual.get(16));
                    c.SetFECHACORTE(filaActual.get(17));
                    c.SetTIENESUSPENSIONCONDICIONAL(filaActual.get(18));
                    c.SetDERIVOMASC(filaActual.get(19));
                    c.SetFECHAACTUALIZACION(filaActual.get(20));
                    c.SetPERIODO(Periodo);  // Asignar el periodo directamente
                }
                ad.add(c);
                CFilas++;
            }

           
            if (CFilas > 0) {
                sd = StructDescriptor.createDescriptor("RES_OBJ_TMP_SENAP_PROCESO", con);
                structs = new STRUCT[ad.size()];
                System.out.println("entro 1");
                System.out.println("tamaño " + ad.size());
                for (int i = 0; i < ad.size(); i++) {
                    structs[i] = new STRUCT(sd, con, ad.get(i).toArray());
                }
                System.out.println("entro 2");
                descriptor = ArrayDescriptor.createDescriptor("RES_ARR_OBJ_TMP_SENAP_PROCESO", con);
                System.out.println("entro 3");
                array_to_pass = new ARRAY(descriptor, con, structs);
                System.out.println("entro 4");
                st = con.prepareCall("{? = call(PKG_INTEGRADOR_SENAP_BAK.TMP_SENAP_PROCESO(?))}");
                System.out.println("entro 5");
                st.registerOutParameter(1, OracleTypes.INTEGER);
                System.out.println("entro 6");
                st.setArray(2, array_to_pass);
                System.out.println("entro 7");
                st.execute();
                System.out.println("entro 8");
            } else {
                JOptionPane.showMessageDialog(null, "TABLA DBO.SENAP_PROCESO sin registros");
            }
            }
        } finally {
            try {
                array_to_pass = null;
                structs = null;
                descriptor = null;
                if (con != null) {
                    System.out.println("cierraaa");
                    // JOptionPane.showMessageDialog(null, "CONEXION CERRADA!!-TMP_PLE_MEDS1_1");
                    con.close();
                    con = null;
                }
            } catch (SQLException ex) {
                throw new SQLException("[actualiza]: " + ex.getLocalizedMessage());
            }
        }
    }

}
