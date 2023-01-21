package sistema.clases;

import sistema.clases.PdfDAO;
import sistema.clases.PdfVO;
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tabla_PdfVO {

    PdfDAO dao = null;
      
    public void visualizar_PdfVO(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgtable());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Id de dieta");
        dt.addColumn("Nombre");
        dt.addColumn("Asesor");
        dt.addColumn("Documento");

        ImageIcon icono = null;
        if (get_Image("/images/worda.png") != null) {
            icono = new ImageIcon(get_Image("/images/worda.png"));
        }

        dao = new PdfDAO();
        PdfVO vo = new PdfVO();
        ArrayList<PdfVO> list = dao.Listar_PdfVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getIddieta();
                fila[1] = vo.getNombrepdf();
                fila[2] = vo.getIdcoach();
                if (vo.getArchivopdf() != null) {
                    fila[3] = new JButton(icono);
                } else {
                    fila[3] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
