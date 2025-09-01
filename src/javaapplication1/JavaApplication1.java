


package javaapplication1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaApplication1 {

    public static void main(String[] args) {
        Man a1 = new Man(1,"Paulo","Ortopedista");
        
        a1.marCons();
    }
        public void executarOperacao(Connection conn, String sql, Object... params) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da consulta
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            // Executa a operação (exemplo: executeUpdate)
            pstmt.executeUpdate();

        } // O pstmt é fechado automaticamente aqui pelo try-with-resources
    }
}
       
        
    
    

