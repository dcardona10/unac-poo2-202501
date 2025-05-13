import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GasStation {
    private JPanel pnlMain;
    private JLabel lblPrices;
    private JLabel lblRegular;
    private JLabel lblPremium;
    private JTextField txtRegular;
    private JTextField txtPremium;
    private JRadioButton rbtnEnableEdit;
    private JButton btnSave;
    private JLabel lblService;
    private JLabel lblFuelType;
    private JRadioButton rbtnRegular;
    private JRadioButton rbtnPremium;
    private JLabel lblGallons;
    private JTextField txtGallons;
    private JButton btnFinish;
    private JLabel lblTotal;
    private JTextField txtTotal;
    private JTable tblSales;

    private double regularPrice = 0;
    private double premiumPrice = 0;
    private double gallons = 0;
    private double total = 0;
    private int fuelType = 0;

    public JPanel getPnlMain() {
        return pnlMain;
    }

    public GasStation() {

        ButtonGroup fuelTypes = new ButtonGroup();
        fuelTypes.add(rbtnRegular);
        fuelTypes.add(rbtnPremium);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Date");
        model.addColumn("Fuel Type");
        model.addColumn("Gallons");
        model.addColumn("Total");

        tblSales.setModel(model);
        tblSales.setAutoCreateColumnsFromModel(true);

        rbtnEnableEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRegular.setEnabled(true);
                txtPremium.setEnabled(true);
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    regularPrice = Double.valueOf(txtRegular.getText());
                    premiumPrice = Double.valueOf(txtPremium.getText());
                    txtRegular.setText(String.format("%.2f%n", regularPrice).replace(",", "."));
                    txtPremium.setText(String.format("%.2f%n", premiumPrice).replace(",", "."));
                    rbtnEnableEdit.setSelected(false);
                    txtRegular.setEnabled(false);
                    txtPremium.setEnabled(false);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error", "Please enter a valid value", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        rbtnRegular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fuelType = 1;
            }
        });

        rbtnPremium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fuelType = 2;
            }
        });

        btnFinish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    gallons = Double.valueOf(txtGallons.getText());
                    switch (fuelType) {
                        case 1:
                            total = gallons * regularPrice;
                            break;
                        case 2:
                            total = gallons * premiumPrice;
                            break;
                        default:
                            break;
                    }
                    txtTotal.setText(String.format("%.2f%n", total).replace(",", "."));
                    LocalDateTime currentTime = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String formattedTime = currentTime.format(formatter);
                    model.addRow(new Object[] {formattedTime, fuelType == 1 ? "Regular" : "Premium", String.format("%.2f%n", gallons), String.format("%.2f%n", total)});
                    tblSales.repaint();
                    clearAll();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error", "Please enter a valid value", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private void clearAll() {
        txtGallons.setText("");
        txtTotal.setText("");
    }
}
