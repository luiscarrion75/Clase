public class Binario {
    public class DecimalBinario_BinarioDecimal {
        private JLabel Titulo;
        private JTextField ing_de_datos;
        private JLabel Resultado;
        private JButton btn_binario_decimal;
        private JButton btn_decimal_binario;
        private JLabel Binario_Decimal;
        private JLabel Decimal_Binario;
        private JPanel panelprincipal;
        private JLabel error_salida;

        public DecimalBinario_BinarioDecimal () {
            btn_binario_decimal.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String binario = ing_de_datos.getText();
                        for (int indice = 0; indice < binario.length(); indice++) {
                            if (binario.charAt(indice) != '0' && binario.charAt(indice) != '1') {
                                throw new Exception();
                            }
                        }
                        int decimal = 0;
                        for (int indice = 0; indice < binario.length(); indice++) {
                            decimal += Character.getNumericValue(binario.charAt(indice)) * Math.pow(2, binario.length() - 1 - indice);
                        }
                        Binario_Decimal.setText(String.valueOf(decimal));
                    } catch (Exception err) {
                        String mensaje = "INVALIDO, Ingrese un valor correcto";
                        error_salida.setText(String.valueOf(mensaje));
                    }
                }
            });
            btn_decimal_binario.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int dt = Integer.parseInt(ing_de_datos.getText());
                        String bin = "";
                        while (dt > 0) {
                            bin = dt % 2 + bin;
                            dt = dt / 2;
                        }
                        Decimal_Binario.setText(bin);
                    }catch (Exception err){
                        String mensaje = "INVALIDO, Ingrese un valor correcto";
                        error_salida.setText(String.valueOf(mensaje));
                    }
                }
            });
        }
        public static void main(String[] args) {
            JFrame inicio= new JFrame("Binariodecimal");
            inicio.pack();
            inicio.setContentPane(new DecimalBinario_BinarioDecimal().panelprincipal);
            inicio.setVisible(true);
        }
    }

}
