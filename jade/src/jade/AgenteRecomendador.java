/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jade;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
nuevas librerias
 */
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;

/*
 */
/**
 *
 * @author USUARIO
 */
public class AgenteRecomendador extends GuiAgent {

    private VentanaInterfaz myGui;
    private AgenteRecomendador a;
    public final int SENT_TYPE = 0;

    @Override
    protected void setup() {

        System.out.println("Bienvenido " + getAID().getName() + " Analizando...");

        myGui = new VentanaInterfaz(this);
        myGui.show();

    }

    //se cierra el agente
    @Override
    protected void takeDown() {

        try {
            DFService.deregister(this);
        } catch (FIPAException fe) {
            fe.printStackTrace();
        }
        // myGui.dispose();

        System.out.println("Agente Recomendador " + getAID().getName() + " proceso terminado!!");
    }

    public List lecturaexcel(File fileName) {
        List cellData = new ArrayList();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
            XSSFSheet hssfSheet = workBook.getSheetAt(0);
            Iterator rowIterator = hssfSheet.rowIterator();
            while (rowIterator.hasNext()) {
                XSSFRow hssfRow = (XSSFRow) rowIterator.next();
                Iterator iterator = hssfRow.cellIterator();
                List cellTemp = new ArrayList();
                while (iterator.hasNext()) {
                    XSSFCell hssfCell = (XSSFCell) iterator.next();
                    cellTemp.add(hssfCell);
                }
                cellData.add(cellTemp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cellData;
    }

    public String leer(File fileName) {
        obtener(lecturaexcel(fileName));
        return obtener(lecturaexcel(fileName));
    }

    public ArrayList<atributosDocumento> leer_estudiantes(File fileName) {
        obtener_estudiantes(lecturaexcel(fileName));
        return obtener_estudiantes(lecturaexcel(fileName));
    }

    public ArrayList<atributosDocumento> obtener_estudiantes(List cellDataList) {
        ArrayList<atributosDocumento> listaDocumento = new ArrayList<atributosDocumento>();
        double suma = 0;
        String recomendacion = "";
        int total = cellDataList.size() - 1;
        double promedio = 0;
        int neutros = 0;
        int alegres = 0;
        int tristes = 0;
        //int Admiracion = 0;
        int Sorpresa = 0;
        int Gratitud = 0;
        //int Miedo = 0;
        int Ira = 0;
        int Vengaza = 0;
        /*mas vairables*/
        double valorporcentajeneutros = 0;
        double valorporcentajealegres = 0;
        double valorporcentajetristes = 0;
        //double valorporcentajeadmiracion = 0;
        double valorporcentajesorpresa = 0;
        double valorporcentajegratitud = 0;
        //double valorporcentajemiedo = 0;
        double valorporcentajeira = 0;
        double valorporcentajevenganza = 0;

        double valorporcentaje = 0;
        for (int i = 1;
                i < cellDataList.size();
                i++) {
            List cellTempList = (List) cellDataList.get(i);
            XSSFCell hssfCell = (XSSFCell) cellTempList.get(4);
            String stringCellValue = hssfCell.toString();
            System.out.println(stringCellValue + "");
            valorporcentaje = Double.parseDouble(stringCellValue);
            suma = suma + Double.parseDouble(stringCellValue);

            if (valorporcentaje <= 0.20) {
                tristes++;
                valorporcentajetristes = valorporcentajetristes + valorporcentaje;
            }
            if (valorporcentaje >= 0.21 && valorporcentaje <= 0.25) {
                Vengaza++;
                valorporcentajevenganza = valorporcentajevenganza + valorporcentaje;
            }
            if (valorporcentaje >= 0.26 && valorporcentaje <= 0.35) {
                Ira++;
                valorporcentajeira = valorporcentajeira + valorporcentaje;
            }

            if (valorporcentaje >= 0.36 && valorporcentaje <= 0.50) {
                neutros++;
                valorporcentajeneutros = valorporcentajeneutros + valorporcentaje;
            }
            if (valorporcentaje >= 0.51 && valorporcentaje <= 0.60) {
                Gratitud++;
                valorporcentajegratitud = valorporcentajegratitud + valorporcentaje;
            }
            if (valorporcentaje >= 0.61 && valorporcentaje <= 0.80) {
                Sorpresa++;
                valorporcentajesorpresa = valorporcentajesorpresa + valorporcentaje;
            }

            if (valorporcentaje >= 0.81) {
                alegres++;
                valorporcentajealegres = valorporcentajealegres + valorporcentaje;
            }

            System.out.println(tristes + "---------" + Vengaza + "-------" + Ira + "----" + neutros
                    + "------" + Gratitud + "-----" + Sorpresa + "-----" + "------" + alegres
            );

        }
        promedio = suma / total;
        valorporcentajetristes = (float) tristes / total;
        valorporcentajeneutros = (float) neutros / total;
        valorporcentajealegres = (float) alegres / total;
        //valorporcentajeadmiracion = (float) Admiracion / total;
        valorporcentajesorpresa = (float) Sorpresa / total;
        valorporcentajegratitud = (float) Gratitud / total;
        //valorporcentajemiedo = (float) Miedo / total;
        valorporcentajeira = (float) Ira / total;
        valorporcentajevenganza = (float) Vengaza / total;

        atributosDocumento pair = new atributosDocumento(tristes, neutros, alegres,
                Sorpresa, Gratitud,
                Ira, Vengaza,
                valorporcentajetristes, valorporcentajeneutros, valorporcentajealegres,
                valorporcentajesorpresa, valorporcentajegratitud,
                valorporcentajeira, valorporcentajevenganza, promedio
        );

        listaDocumento.add(pair);
        return listaDocumento;
    }

    public String obtener(List cellDataList) {
        double suma = 0;
        String recomendacion = "";
        int total = cellDataList.size() - 1;
        double promedio = 0;
        for (int i = 1; i < cellDataList.size(); i++) {
            List cellTempList = (List) cellDataList.get(i);
            XSSFCell hssfCell = (XSSFCell) cellTempList.get(4);
            String stringCellValue = hssfCell.toString();
            System.out.println(stringCellValue + "");
            suma = suma + Double.parseDouble(stringCellValue);

            System.out.println();
        }
        promedio = suma / total;
        if (promedio <= 0.39) {
            recomendacion = "Mejorar la metodologia de enseñanza";
        } else if (promedio >= 0.40 && promedio <= 0.69) {
            recomendacion = "Buen trabajo, se puede mejorar!";
        } else if (promedio >= 70) {
            recomendacion = "Excelente,sigue así con tu medologia!";
        }
        return recomendacion;
    }

    @Override
    protected void onGuiEvent(GuiEvent ge) {
        String receiverName = (String) ge.getParameter(0);
        String msgContent = (String) ge.getParameter(1);
        ACLMessage toSend = new ACLMessage(ACLMessage.INFORM);
        toSend.setContent(msgContent);
        toSend.setPerformative(ACLMessage.INFORM);
        toSend.addReceiver(new AID("AgenteDocente", AID.ISLOCALNAME));
        send(toSend);

    }

}
