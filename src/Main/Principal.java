package Main;

import Main.Componentes.Capacitor;
import Main.Componentes.Indutor;
import Main.Componentes.Resistor;
import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    // Listas de componentes.
    ArrayList<Capacitor> ListaCapacitores;
    ArrayList<Indutor> ListaIndutores;
    ArrayList<Resistor> ListaResistores;

    // Modos ou comportamentos dos formulários.
    String modoCapacitor;
    String modoIndutor;
    String modoResistor;

    public void carregarTabelaCapacitores() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Id", "Tipo", "Capacitância", "Descrição", "Quantidade"}, 0);

        for (int i = 0; i < ListaCapacitores.size(); i++) {
            Object linha[] = new Object[]{
                ListaCapacitores.get(i).getId(),
                ListaCapacitores.get(i).getTipoCapacitor(),
                ListaCapacitores.get(i).getCapacitancia(),
                ListaCapacitores.get(i).getDescricao(),
                ListaCapacitores.get(i).getQuantidade()};
            modelo.addRow(linha);
        }

        tabelaCapacitores.setModel(modelo);
    }
    
    public void carregarTabelaIndutores() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Id", "Tipo", "Indutância", "Descrição", "Quantidade"}, 0);

        for (int i = 0; i < ListaIndutores.size(); i++) {
            Object linha[] = new Object[]{
                ListaIndutores.get(i).getId(),
                ListaIndutores.get(i).getTipoIndutor(),
                ListaIndutores.get(i).getIndutancia(),
                ListaIndutores.get(i).getDescricao(),
                ListaIndutores.get(i).getQuantidade()};
            modelo.addRow(linha);
        }

        tabelaIndutores.setModel(modelo);
    }
    
    public void carregarTabelaResistores() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Id", "Tipo", "Resistência", "Descrição", "Quantidade"}, 0);

        for (int i = 0; i < ListaResistores.size(); i++) {
            Object linha[] = new Object[]{
                ListaResistores.get(i).getId(),
                ListaResistores.get(i).getTipoResistor(),
                ListaResistores.get(i).getResistencia(),
                ListaResistores.get(i).getDescricao(),
                ListaResistores.get(i).getQuantidade()};
            modelo.addRow(linha);
        }

        tabelaResistores.setModel(modelo);
    }

    public Principal() {
        initComponents();
        setTitle("POO ROTH - Sistema de Gerenciamento de Componentes");
        setLocationRelativeTo(null);

        ListaCapacitores = new ArrayList<Capacitor>();
        ListaIndutores = new ArrayList<Indutor>();
        ListaResistores = new ArrayList<Resistor>();

        modoCapacitor = "Navegar";
        modoIndutor = "Navegar";
        modoResistor = "Navegar";
        ManipulaInterfaceCrudCapacitor();
        ManipulaInterfaceCrudIndutor();
        ManipulaInterfaceCrudResistor();
    }

    public void ManipulaInterfaceCrudCapacitor() {
        switch (modoCapacitor) {
            case "Navegar":
                btnSalvarCapacitor.setEnabled(false);
                btnCancelarCapacitor.setEnabled(false);
                campoIdCapacitor.setEnabled(false);
                comboTipoCapacitor.setEnabled(false);
                campoCapacitancia.setEditable(false);
                campoQuantidadeCapacitor.setEnabled(false);
                campoDescricaoCapacitor.setEnabled(false);
                btnNovoCapacitor.setEnabled(true);
                btnEditarCapacitor.setEnabled(false);
                btnExcluirCapacitor.setEnabled(false);
                break;

            case "Novo":
                btnSalvarCapacitor.setEnabled(true);
                btnCancelarCapacitor.setEnabled(true);
                campoIdCapacitor.setEnabled(false);
                comboTipoCapacitor.setEnabled(true);
                campoCapacitancia.setEditable(true);
                campoDescricaoCapacitor.setEnabled(true);
                campoQuantidadeCapacitor.setEnabled(true);
                btnNovoCapacitor.setEnabled(false);
                btnEditarCapacitor.setEnabled(false);
                btnExcluirCapacitor.setEnabled(false);
                break;

            case "Editar":
                btnSalvarCapacitor.setEnabled(true);
                btnCancelarCapacitor.setEnabled(true);
                campoIdCapacitor.setEnabled(false);
                comboTipoCapacitor.setEnabled(true);
                campoCapacitancia.setEditable(true);
                campoDescricaoCapacitor.setEnabled(true);
                campoQuantidadeCapacitor.setEnabled(true);
                btnNovoCapacitor.setEnabled(true);
                btnEditarCapacitor.setEnabled(false);
                btnExcluirCapacitor.setEnabled(false);
                break;

            case "Excluir":
                btnSalvarCapacitor.setEnabled(false);
                btnCancelarCapacitor.setEnabled(false);
                campoIdCapacitor.setEnabled(false);
                comboTipoCapacitor.setEnabled(false);
                campoCapacitancia.setEditable(false);
                campoDescricaoCapacitor.setEnabled(false);
                campoQuantidadeCapacitor.setEnabled(false);
                btnNovoCapacitor.setEnabled(true);
                btnEditarCapacitor.setEnabled(false);
                btnExcluirCapacitor.setEnabled(false);
                break;

            case "Selecao":
                btnSalvarCapacitor.setEnabled(false);
                btnCancelarCapacitor.setEnabled(false);
                campoIdCapacitor.setEnabled(false);
                comboTipoCapacitor.setEnabled(false);
                campoCapacitancia.setEditable(false);
                campoDescricaoCapacitor.setEnabled(false);
                campoQuantidadeCapacitor.setEnabled(false);
                btnNovoCapacitor.setEnabled(true);
                btnEditarCapacitor.setEnabled(true);
                btnExcluirCapacitor.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }
    
    public void ManipulaInterfaceCrudIndutor() {
        switch (modoIndutor) {
            case "Navegar":
                btnSalvarIndutor.setEnabled(false);
                btnCancelarIndutor.setEnabled(false);
                campoIdIndutor.setEnabled(false);
                comboTipoIndutor.setEnabled(false);
                campoIndutancia.setEditable(false);
                campoQuantidadeIndutor.setEnabled(false);
                campoDescricaoIndutor.setEnabled(false);
                btnNovoIndutor.setEnabled(true);
                btnEditarIndutor.setEnabled(false);
                btnExcluirIndutor.setEnabled(false);
                break;

            case "Novo":
                btnSalvarIndutor.setEnabled(true);
                btnCancelarIndutor.setEnabled(true);
                campoIdIndutor.setEnabled(false);
                comboTipoIndutor.setEnabled(true);
                campoIndutancia.setEditable(true);
                campoDescricaoIndutor.setEnabled(true);
                campoQuantidadeIndutor.setEnabled(true);
                btnNovoIndutor.setEnabled(false);
                btnEditarIndutor.setEnabled(false);
                btnExcluirIndutor.setEnabled(false);
                break;

            case "Editar":
                btnSalvarIndutor.setEnabled(true);
                btnCancelarIndutor.setEnabled(true);
                campoIdIndutor.setEnabled(false);
                comboTipoIndutor.setEnabled(true);
                campoIndutancia.setEditable(true);
                campoDescricaoIndutor.setEnabled(true);
                campoQuantidadeIndutor.setEnabled(true);
                btnNovoIndutor.setEnabled(true);
                btnEditarIndutor.setEnabled(false);
                btnExcluirIndutor.setEnabled(false);
                break;

            case "Excluir":
                btnSalvarIndutor.setEnabled(false);
                btnCancelarIndutor.setEnabled(false);
                campoIdIndutor.setEnabled(false);
                comboTipoIndutor.setEnabled(false);
                campoIndutancia.setEditable(false);
                campoDescricaoIndutor.setEnabled(false);
                campoQuantidadeIndutor.setEnabled(false);
                btnNovoIndutor.setEnabled(true);
                btnEditarIndutor.setEnabled(false);
                btnExcluirIndutor.setEnabled(false);
                break;

            case "Selecao":
                btnSalvarIndutor.setEnabled(false);
                btnCancelarIndutor.setEnabled(false);
                campoIdIndutor.setEnabled(false);
                comboTipoIndutor.setEnabled(false);
                campoIndutancia.setEditable(false);
                campoDescricaoIndutor.setEnabled(false);
                campoQuantidadeIndutor.setEnabled(false);
                btnNovoIndutor.setEnabled(true);
                btnEditarIndutor.setEnabled(true);
                btnExcluirIndutor.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }
    
    public void ManipulaInterfaceCrudResistor() {
        switch (modoResistor) {
            case "Navegar":
                btnSalvarResistor.setEnabled(false);
                btnCancelarResistor.setEnabled(false);
                campoIdResistor.setEnabled(false);
                comboTipoResistor.setEnabled(false);
                campoResistencia.setEditable(false);
                campoQuantidadeResistor.setEnabled(false);
                campoDescricaoResistor.setEnabled(false);
                btnNovoResistor.setEnabled(true);
                btnEditarResistor.setEnabled(false);
                btnExcluirResistor.setEnabled(false);
                break;

            case "Novo":
                btnSalvarResistor.setEnabled(true);
                btnCancelarResistor.setEnabled(true);
                campoIdResistor.setEnabled(false);
                comboTipoResistor.setEnabled(true);
                campoResistencia.setEditable(true);
                campoDescricaoResistor.setEnabled(true);
                campoQuantidadeResistor.setEnabled(true);
                btnNovoResistor.setEnabled(false);
                btnEditarResistor.setEnabled(false);
                btnExcluirResistor.setEnabled(false);
                break;

            case "Editar":
                btnSalvarResistor.setEnabled(true);
                btnCancelarResistor.setEnabled(true);
                campoIdResistor.setEnabled(false);
                comboTipoResistor.setEnabled(true);
                campoResistencia.setEditable(true);
                campoDescricaoResistor.setEnabled(true);
                campoQuantidadeResistor.setEnabled(true);
                btnNovoResistor.setEnabled(true);
                btnEditarResistor.setEnabled(false);
                btnExcluirResistor.setEnabled(false);
                break;

            case "Excluir":
                btnSalvarResistor.setEnabled(false);
                btnCancelarResistor.setEnabled(false);
                campoIdResistor.setEnabled(false);
                comboTipoResistor.setEnabled(false);
                campoResistencia.setEditable(false);
                campoDescricaoResistor.setEnabled(false);
                campoQuantidadeResistor.setEnabled(false);
                btnNovoResistor.setEnabled(true);
                btnEditarResistor.setEnabled(false);
                btnExcluirResistor.setEnabled(false);
                break;

            case "Selecao":
                btnSalvarResistor.setEnabled(false);
                btnCancelarResistor.setEnabled(false);
                campoIdResistor.setEnabled(false);
                comboTipoResistor.setEnabled(false);
                campoResistencia.setEditable(false);
                campoDescricaoResistor.setEnabled(false);
                campoQuantidadeResistor.setEnabled(false);
                btnNovoResistor.setEnabled(true);
                btnEditarResistor.setEnabled(true);
                btnExcluirResistor.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        tabCapacitores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCapacitores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoIdCapacitor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDescricaoCapacitor = new javax.swing.JTextField();
        btnSalvarCapacitor = new javax.swing.JButton();
        btnCancelarCapacitor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoQuantidadeCapacitor = new javax.swing.JTextField();
        campoCapacitancia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboTipoCapacitor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnNovoCapacitor = new javax.swing.JButton();
        btnEditarCapacitor = new javax.swing.JButton();
        btnExcluirCapacitor = new javax.swing.JButton();
        botaoPesquisarNaInternet = new javax.swing.JButton();
        tabIndutores = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaIndutores = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        campoIdIndutor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        campoDescricaoIndutor = new javax.swing.JTextField();
        btnSalvarIndutor = new javax.swing.JButton();
        btnCancelarIndutor = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        campoQuantidadeIndutor = new javax.swing.JTextField();
        campoIndutancia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        comboTipoIndutor = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        btnNovoIndutor = new javax.swing.JButton();
        btnEditarIndutor = new javax.swing.JButton();
        btnExcluirIndutor = new javax.swing.JButton();
        botaoPesquisarNaInternet2 = new javax.swing.JButton();
        tabResistores = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaResistores = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        campoIdResistor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        campoDescricaoResistor = new javax.swing.JTextField();
        btnSalvarResistor = new javax.swing.JButton();
        btnCancelarResistor = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        campoQuantidadeResistor = new javax.swing.JTextField();
        campoResistencia = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        comboTipoResistor = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        btnNovoResistor = new javax.swing.JButton();
        btnEditarResistor = new javax.swing.JButton();
        btnExcluirResistor = new javax.swing.JButton();
        botaoPesquisarNaInternet3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabs.setToolTipText("");
        tabs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabelaCapacitores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Capacitância", "Descrição", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCapacitores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCapacitoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCapacitores);
        if (tabelaCapacitores.getColumnModel().getColumnCount() > 0) {
            tabelaCapacitores.getColumnModel().getColumn(0).setResizable(false);
            tabelaCapacitores.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaCapacitores.getColumnModel().getColumn(1).setResizable(false);
            tabelaCapacitores.getColumnModel().getColumn(2).setResizable(false);
            tabelaCapacitores.getColumnModel().getColumn(3).setResizable(false);
            tabelaCapacitores.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações"));

        jLabel1.setText("Id:");

        jLabel2.setText("Descrição:");

        campoDescricaoCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoCapacitorActionPerformed(evt);
            }
        });

        btnSalvarCapacitor.setText("Salvar");
        btnSalvarCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCapacitorActionPerformed(evt);
            }
        });

        btnCancelarCapacitor.setText("Cancelar");
        btnCancelarCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCapacitorActionPerformed(evt);
            }
        });

        jLabel6.setText("Qtd:");

        campoQuantidadeCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeCapacitorActionPerformed(evt);
            }
        });

        jLabel8.setText("Capacitância:");

        comboTipoCapacitor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Eletrolítico", "Poliéster", "Cerâmico", "Tântalo" }));
        comboTipoCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoCapacitorActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQuantidadeCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDescricaoCapacitor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIdCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipoCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCapacitancia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnSalvarCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoIdCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(comboTipoCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(campoCapacitancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoQuantidadeCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(campoDescricaoCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelarCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnNovoCapacitor.setText("Novo");
        btnNovoCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCapacitorActionPerformed(evt);
            }
        });

        btnEditarCapacitor.setText("Editar");
        btnEditarCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCapacitorActionPerformed(evt);
            }
        });

        btnExcluirCapacitor.setText("Excluir");
        btnExcluirCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCapacitorActionPerformed(evt);
            }
        });

        botaoPesquisarNaInternet.setText("Pesquisar na Internet");
        botaoPesquisarNaInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarNaInternetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCapacitoresLayout = new javax.swing.GroupLayout(tabCapacitores);
        tabCapacitores.setLayout(tabCapacitoresLayout);
        tabCapacitoresLayout.setHorizontalGroup(
            tabCapacitoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCapacitoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCapacitoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabCapacitoresLayout.createSequentialGroup()
                        .addComponent(btnNovoCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirCapacitor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoPesquisarNaInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabCapacitoresLayout.setVerticalGroup(
            tabCapacitoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCapacitoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tabCapacitoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditarCapacitor, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnNovoCapacitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirCapacitor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPesquisarNaInternet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Capacitores", tabCapacitores);

        tabelaIndutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Indutância", "Descrição", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaIndutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaIndutoresMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaIndutores);
        if (tabelaIndutores.getColumnModel().getColumnCount() > 0) {
            tabelaIndutores.getColumnModel().getColumn(0).setResizable(false);
            tabelaIndutores.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaIndutores.getColumnModel().getColumn(1).setResizable(false);
            tabelaIndutores.getColumnModel().getColumn(2).setResizable(false);
            tabelaIndutores.getColumnModel().getColumn(3).setResizable(false);
            tabelaIndutores.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações"));

        jLabel16.setText("Id:");

        jLabel17.setText("Descrição:");

        campoDescricaoIndutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoIndutorActionPerformed(evt);
            }
        });

        btnSalvarIndutor.setText("Salvar");
        btnSalvarIndutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarIndutorActionPerformed(evt);
            }
        });

        btnCancelarIndutor.setText("Cancelar");
        btnCancelarIndutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarIndutorActionPerformed(evt);
            }
        });

        jLabel18.setText("Qtd:");

        campoQuantidadeIndutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeIndutorActionPerformed(evt);
            }
        });

        jLabel19.setText("Indutância:");

        comboTipoIndutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Bobina", "Cerâmica Multicamada", "Filme", "Toroidal" }));
        comboTipoIndutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoIndutorActionPerformed(evt);
            }
        });

        jLabel20.setText("Tipo:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQuantidadeIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDescricaoIndutor))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIdIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipoIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIndutancia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnSalvarIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(campoIdIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(comboTipoIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(campoIndutancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(campoQuantidadeIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(campoDescricaoIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelarIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnNovoIndutor.setText("Novo");
        btnNovoIndutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoIndutorActionPerformed(evt);
            }
        });

        btnEditarIndutor.setText("Editar");
        btnEditarIndutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIndutorActionPerformed(evt);
            }
        });

        btnExcluirIndutor.setText("Excluir");
        btnExcluirIndutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirIndutorActionPerformed(evt);
            }
        });

        botaoPesquisarNaInternet2.setText("Pesquisar na Internet");
        botaoPesquisarNaInternet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarNaInternet2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabIndutoresLayout = new javax.swing.GroupLayout(tabIndutores);
        tabIndutores.setLayout(tabIndutoresLayout);
        tabIndutoresLayout.setHorizontalGroup(
            tabIndutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabIndutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabIndutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabIndutoresLayout.createSequentialGroup()
                        .addComponent(btnNovoIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirIndutor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoPesquisarNaInternet2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabIndutoresLayout.setVerticalGroup(
            tabIndutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabIndutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tabIndutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditarIndutor, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnNovoIndutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirIndutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPesquisarNaInternet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Indutores", tabIndutores);

        tabelaResistores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Resistência", "Descrição", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResistores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaResistoresMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelaResistores);
        if (tabelaResistores.getColumnModel().getColumnCount() > 0) {
            tabelaResistores.getColumnModel().getColumn(0).setResizable(false);
            tabelaResistores.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaResistores.getColumnModel().getColumn(1).setResizable(false);
            tabelaResistores.getColumnModel().getColumn(2).setResizable(false);
            tabelaResistores.getColumnModel().getColumn(3).setResizable(false);
            tabelaResistores.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações"));

        jLabel21.setText("Id:");

        jLabel22.setText("Descrição:");

        campoDescricaoResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoResistorActionPerformed(evt);
            }
        });

        btnSalvarResistor.setText("Salvar");
        btnSalvarResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarResistorActionPerformed(evt);
            }
        });

        btnCancelarResistor.setText("Cancelar");
        btnCancelarResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarResistorActionPerformed(evt);
            }
        });

        jLabel23.setText("Qtd:");

        campoQuantidadeResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeResistorActionPerformed(evt);
            }
        });

        jLabel24.setText("Resistência:");

        comboTipoResistor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Fixo", "Variável" }));
        comboTipoResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoResistorActionPerformed(evt);
            }
        });

        jLabel25.setText("Tipo:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQuantidadeResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDescricaoResistor))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIdResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipoResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnSalvarResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(campoIdResistor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(comboTipoResistor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(campoResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(campoQuantidadeResistor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(campoDescricaoResistor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelarResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnNovoResistor.setText("Novo");
        btnNovoResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoResistorActionPerformed(evt);
            }
        });

        btnEditarResistor.setText("Editar");
        btnEditarResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarResistorActionPerformed(evt);
            }
        });

        btnExcluirResistor.setText("Excluir");
        btnExcluirResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirResistorActionPerformed(evt);
            }
        });

        botaoPesquisarNaInternet3.setText("Pesquisar na Internet");
        botaoPesquisarNaInternet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarNaInternet3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabResistoresLayout = new javax.swing.GroupLayout(tabResistores);
        tabResistores.setLayout(tabResistoresLayout);
        tabResistoresLayout.setHorizontalGroup(
            tabResistoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabResistoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabResistoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabResistoresLayout.createSequentialGroup()
                        .addComponent(btnNovoResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirResistor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoPesquisarNaInternet3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabResistoresLayout.setVerticalGroup(
            tabResistoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabResistoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tabResistoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditarResistor, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnNovoResistor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirResistor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPesquisarNaInternet3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Resistores", tabResistores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );

        tabs.getAccessibleContext().setAccessibleName("Capacitores");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCapacitorActionPerformed
        int index = tabelaCapacitores.getSelectedRow();
        if (index >= 0 && index < ListaCapacitores.size()) {
            ListaCapacitores.remove(index);
        }
        campoIdCapacitor.setText("");
        comboTipoCapacitor.setSelectedIndex(0);
        campoCapacitancia.setText("");
        campoDescricaoCapacitor.setText("");
        campoQuantidadeCapacitor.setText("");
        carregarTabelaCapacitores();
        modoCapacitor = "Navegar";
        ManipulaInterfaceCrudCapacitor();
    }//GEN-LAST:event_btnExcluirCapacitorActionPerformed

    private void btnEditarCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCapacitorActionPerformed
        modoCapacitor = "Editar";
        ManipulaInterfaceCrudCapacitor();
    }//GEN-LAST:event_btnEditarCapacitorActionPerformed

    private void btnNovoCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCapacitorActionPerformed
        Integer id = ListaCapacitores.size() + 1;
        campoIdCapacitor.setText(String.valueOf(id));
        comboTipoCapacitor.setSelectedIndex(0);
        campoCapacitancia.setText("");
        campoDescricaoCapacitor.setText("");
        campoQuantidadeCapacitor.setText("");
        modoCapacitor = "Novo";
        ManipulaInterfaceCrudCapacitor();
    }//GEN-LAST:event_btnNovoCapacitorActionPerformed

    private void comboTipoCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoCapacitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoCapacitorActionPerformed

    private void campoQuantidadeCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuantidadeCapacitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQuantidadeCapacitorActionPerformed

    private void btnCancelarCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCapacitorActionPerformed
        campoIdCapacitor.setText("");
        comboTipoCapacitor.setSelectedIndex(0);
        campoCapacitancia.setText("");
        campoDescricaoCapacitor.setText("");
        campoQuantidadeCapacitor.setText("");

        modoCapacitor = "Navegar";
        ManipulaInterfaceCrudCapacitor();
    }//GEN-LAST:event_btnCancelarCapacitorActionPerformed

    public static boolean isNumerico(String strNum) {
        double d = 0f;
        if (strNum == null) {
            return false;
        }
        try {
            d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        if (d <= 0) {
            return false;
        }
        return true;
    }

    private void btnSalvarCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCapacitorActionPerformed
        int id = Integer.parseInt(campoIdCapacitor.getText());
        String tipoCapacitor = comboTipoCapacitor.getSelectedItem().toString();
        if (tipoCapacitor.equals("Selecionar...")) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa selecionar um Tipo de Capacitor.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String descricao = campoDescricaoCapacitor.getText();
        if (descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar uma Descrição.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String capacidadeTexto = campoCapacitancia.getText();
        if (capacidadeTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Capacitância.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else if (!isNumerico(capacidadeTexto)) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Capacitância de forma númerica e positiva.",
                    "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        float capacidade = Float.parseFloat(capacidadeTexto);

        String qtdTexto = campoQuantidadeCapacitor.getText();
        if (qtdTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Quantidade.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else if (!isNumerico(qtdTexto)) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Quantidade de forma númerica e positiva.",
                    "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int qtd = Integer.parseInt(qtdTexto);

        if (modoCapacitor.equals("Novo")) {
            Capacitor c = new Capacitor(
                    id,
                    descricao,
                    qtd,
                    tipoCapacitor,
                    capacidade);
            ListaCapacitores.add(c);
        } else if (modoCapacitor.equals("Editar")) {
            int index = tabelaCapacitores.getSelectedRow();
            ListaCapacitores.get(index).setId(id);
            ListaCapacitores.get(index).setDescricao(descricao);
            ListaCapacitores.get(index).setQuantidade(qtd);
            ListaCapacitores.get(index).setTipoCapacitor(tipoCapacitor);
            ListaCapacitores.get(index).setCapacitancia(capacidade);
        }

        carregarTabelaCapacitores();
        modoCapacitor = "Navegar";
        ManipulaInterfaceCrudCapacitor();
        campoIdCapacitor.setText("");
        comboTipoCapacitor.setSelectedIndex(0);
        campoCapacitancia.setText("");
        campoQuantidadeCapacitor.setText("");
        campoDescricaoCapacitor.setText("");
    }//GEN-LAST:event_btnSalvarCapacitorActionPerformed

    private void campoDescricaoCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoCapacitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoCapacitorActionPerformed

    private void tabelaCapacitoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCapacitoresMouseClicked
        int index = tabelaCapacitores.getSelectedRow();
        if (index >= 0 && index < ListaCapacitores.size()) {
            Capacitor c = ListaCapacitores.get(index);
            campoIdCapacitor.setText(String.valueOf(c.getId()));
            comboTipoCapacitor.setSelectedItem(c.getTipoCapacitor());
            campoCapacitancia.setText(String.valueOf(c.getCapacitancia()));
            campoQuantidadeCapacitor.setText(String.valueOf(c.getQuantidade()));
            campoDescricaoCapacitor.setText(c.getDescricao());
            modoCapacitor = "Selecao";
            ManipulaInterfaceCrudCapacitor();
        }
    }//GEN-LAST:event_tabelaCapacitoresMouseClicked
    
    private void botaoPesquisarNaInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarNaInternetActionPerformed
        try {
            String textoSerBuscado = JOptionPane.showInputDialog("Componente que deseja pesquisar nas interwebs: ");
            if (textoSerBuscado.isEmpty()) {
                throw new Exception();
            }
            Desktop.getDesktop().browse(new URI("http://www.google.com.br/search?q=" + textoSerBuscado));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Você não preenchou o campo de pesquisa, tente novamente.",
                    "Ops!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoPesquisarNaInternetActionPerformed

    private void tabelaIndutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaIndutoresMouseClicked
        int index = tabelaIndutores.getSelectedRow();
        if (index >= 0 && index < ListaIndutores.size()) {
            Indutor i = ListaIndutores.get(index);
            campoIdIndutor.setText(String.valueOf(i.getId()));
            comboTipoIndutor.setSelectedItem(i.getTipoIndutor());
            campoIndutancia.setText(String.valueOf(i.getIndutancia()));
            campoQuantidadeIndutor.setText(String.valueOf(i.getQuantidade()));
            campoDescricaoIndutor.setText(i.getDescricao());
            modoIndutor = "Selecao";
            ManipulaInterfaceCrudIndutor();
        }
    }//GEN-LAST:event_tabelaIndutoresMouseClicked

    private void campoDescricaoIndutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoIndutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoIndutorActionPerformed

    private void btnSalvarIndutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarIndutorActionPerformed
        int id = Integer.parseInt(campoIdIndutor.getText());
        String tipoIndutor = comboTipoIndutor.getSelectedItem().toString();
        if (tipoIndutor.equals("Selecionar...")) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa selecionar um Tipo de Indutor.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String descricao = campoDescricaoIndutor.getText();
        if (descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar uma Descrição.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String capacidadeTexto = campoIndutancia.getText();
        if (capacidadeTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Indutância.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else if (!isNumerico(capacidadeTexto)) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Indutância de forma númerica e positiva.",
                    "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        float capacidade = Float.parseFloat(capacidadeTexto);

        String qtdTexto = campoQuantidadeIndutor.getText();
        if (qtdTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Quantidade.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else if (!isNumerico(qtdTexto)) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Quantidade de forma númerica e positiva.",
                    "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int qtd = Integer.parseInt(qtdTexto);

        if (modoIndutor.equals("Novo")) {
            Indutor i = new Indutor(
                    id,
                    descricao,
                    qtd,
                    tipoIndutor,
                    capacidade);
            ListaIndutores.add(i);
        } else if (modoIndutor.equals("Editar")) {
            int index = tabelaIndutores.getSelectedRow();
            ListaIndutores.get(index).setId(id);
            ListaIndutores.get(index).setDescricao(descricao);
            ListaIndutores.get(index).setQuantidade(qtd);
            ListaIndutores.get(index).setTipoIndutor(tipoIndutor);
            ListaIndutores.get(index).setIndutancia(capacidade);
        }

        carregarTabelaIndutores();
        modoIndutor = "Navegar";
        ManipulaInterfaceCrudIndutor();
        campoIdIndutor.setText("");
        comboTipoIndutor.setSelectedIndex(0);
        campoIndutancia.setText("");
        campoQuantidadeIndutor.setText("");
        campoDescricaoIndutor.setText("");
    }//GEN-LAST:event_btnSalvarIndutorActionPerformed

    private void btnCancelarIndutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarIndutorActionPerformed
        campoIdIndutor.setText("");
        comboTipoIndutor.setSelectedIndex(0);
        campoIndutancia.setText("");
        campoDescricaoIndutor.setText("");
        campoQuantidadeIndutor.setText("");

        modoIndutor = "Navegar";
        ManipulaInterfaceCrudIndutor();
    }//GEN-LAST:event_btnCancelarIndutorActionPerformed

    private void campoQuantidadeIndutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuantidadeIndutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQuantidadeIndutorActionPerformed

    private void comboTipoIndutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoIndutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoIndutorActionPerformed

    private void btnNovoIndutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoIndutorActionPerformed
        Integer id = ListaIndutores.size() + 1;
        campoIdIndutor.setText(String.valueOf(id));
        comboTipoIndutor.setSelectedIndex(0);
        campoIndutancia.setText("");
        campoDescricaoIndutor.setText("");
        campoQuantidadeIndutor.setText("");
        modoIndutor = "Novo";
        ManipulaInterfaceCrudIndutor();
    }//GEN-LAST:event_btnNovoIndutorActionPerformed

    private void btnEditarIndutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIndutorActionPerformed
        modoIndutor = "Editar";
        ManipulaInterfaceCrudIndutor();
    }//GEN-LAST:event_btnEditarIndutorActionPerformed

    private void btnExcluirIndutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirIndutorActionPerformed
        int index = tabelaIndutores.getSelectedRow();
        if (index >= 0 && index < ListaIndutores.size()) {
            ListaIndutores.remove(index);
        }
        campoIdIndutor.setText("");
        comboTipoIndutor.setSelectedIndex(0);
        campoIndutancia.setText("");
        campoDescricaoIndutor.setText("");
        campoQuantidadeIndutor.setText("");
        carregarTabelaIndutores();
        modoIndutor = "Navegar";
        ManipulaInterfaceCrudIndutor();
    }//GEN-LAST:event_btnExcluirIndutorActionPerformed

    private void botaoPesquisarNaInternet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarNaInternet2ActionPerformed
        try {
            String textoSerBuscado = JOptionPane.showInputDialog("Componente que deseja pesquisar nas interwebs: ");
            if (textoSerBuscado.isEmpty()) {
                throw new Exception();
            }
            Desktop.getDesktop().browse(new URI("http://www.google.com.br/search?q=" + textoSerBuscado));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Você não preenchou o campo de pesquisa, tente novamente.",
                    "Ops!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoPesquisarNaInternet2ActionPerformed

    private void tabelaResistoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaResistoresMouseClicked
        int index = tabelaResistores.getSelectedRow();
        if (index >= 0 && index < ListaResistores.size()) {
            Resistor r = ListaResistores.get(index);
            campoIdResistor.setText(String.valueOf(r.getId()));
            comboTipoResistor.setSelectedItem(r.getTipoResistor());
            campoResistencia.setText(String.valueOf(r.getResistencia()));
            campoQuantidadeResistor.setText(String.valueOf(r.getQuantidade()));
            campoDescricaoResistor.setText(r.getDescricao());
            modoResistor = "Selecao";
            ManipulaInterfaceCrudResistor();
        }
    }//GEN-LAST:event_tabelaResistoresMouseClicked

    private void campoDescricaoResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoResistorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoResistorActionPerformed

    private void btnSalvarResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarResistorActionPerformed
        int id = Integer.parseInt(campoIdResistor.getText());
        String tipoResistor = comboTipoResistor.getSelectedItem().toString();
        if (tipoResistor.equals("Selecionar...")) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa selecionar um Tipo de Resistor.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String descricao = campoDescricaoResistor.getText();
        if (descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar uma Descrição.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String capacidadeTexto = campoResistencia.getText();
        if (capacidadeTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Resistência.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else if (!isNumerico(capacidadeTexto)) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Resistência de forma númerica e positiva.",
                    "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        float capacidade = Float.parseFloat(capacidadeTexto);

        String qtdTexto = campoQuantidadeResistor.getText();
        if (qtdTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Quantidade.",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else if (!isNumerico(qtdTexto)) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa informar a Quantidade de forma númerica e positiva.",
                    "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int qtd = Integer.parseInt(qtdTexto);

        if (modoResistor.equals("Novo")) {
            Resistor r = new Resistor(
                    id,
                    descricao,
                    qtd,
                    tipoResistor,
                    capacidade);
            ListaResistores.add(r);
        } else if (modoResistor.equals("Editar")) {
            int index = tabelaResistores.getSelectedRow();
            ListaResistores.get(index).setId(id);
            ListaResistores.get(index).setDescricao(descricao);
            ListaResistores.get(index).setQuantidade(qtd);
            ListaResistores.get(index).setTipoResistor(tipoResistor);
            ListaResistores.get(index).setResistencia(capacidade);
        }

        carregarTabelaResistores();
        modoResistor = "Navegar";
        ManipulaInterfaceCrudResistor();
        campoIdResistor.setText("");
        comboTipoResistor.setSelectedIndex(0);
        campoResistencia.setText("");
        campoQuantidadeResistor.setText("");
        campoDescricaoResistor.setText("");
    }//GEN-LAST:event_btnSalvarResistorActionPerformed

    private void btnCancelarResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarResistorActionPerformed
        campoIdResistor.setText("");
        comboTipoResistor.setSelectedIndex(0);
        campoResistencia.setText("");
        campoDescricaoResistor.setText("");
        campoQuantidadeResistor.setText("");

        modoResistor = "Navegar";
        ManipulaInterfaceCrudResistor();
    }//GEN-LAST:event_btnCancelarResistorActionPerformed

    private void campoQuantidadeResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuantidadeResistorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQuantidadeResistorActionPerformed

    private void comboTipoResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoResistorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoResistorActionPerformed

    private void btnNovoResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoResistorActionPerformed
        Integer id = ListaResistores.size() + 1;
        campoIdResistor.setText(String.valueOf(id));
        comboTipoResistor.setSelectedIndex(0);
        campoResistencia.setText("");
        campoDescricaoResistor.setText("");
        campoQuantidadeResistor.setText("");
        modoResistor = "Novo";
        ManipulaInterfaceCrudResistor();
    }//GEN-LAST:event_btnNovoResistorActionPerformed

    private void btnEditarResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarResistorActionPerformed
        modoResistor = "Editar";
        ManipulaInterfaceCrudResistor();
    }//GEN-LAST:event_btnEditarResistorActionPerformed

    private void btnExcluirResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirResistorActionPerformed
        int index = tabelaResistores.getSelectedRow();
        if (index >= 0 && index < ListaResistores.size()) {
            ListaResistores.remove(index);
        }
        campoIdResistor.setText("");
        comboTipoResistor.setSelectedIndex(0);
        campoResistencia.setText("");
        campoDescricaoResistor.setText("");
        campoQuantidadeResistor.setText("");
        carregarTabelaResistores();
        modoResistor = "Navegar";
        ManipulaInterfaceCrudResistor();
    }//GEN-LAST:event_btnExcluirResistorActionPerformed

    private void botaoPesquisarNaInternet3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarNaInternet3ActionPerformed
        try {
            String textoSerBuscado = JOptionPane.showInputDialog("Componente que deseja pesquisar nas interwebs: ");
            if (textoSerBuscado.isEmpty()) {
                throw new Exception();
            }
            Desktop.getDesktop().browse(new URI("http://www.google.com.br/search?q=" + textoSerBuscado));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Você não preenchou o campo de pesquisa, tente novamente.",
                    "Ops!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoPesquisarNaInternet3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisarNaInternet;
    private javax.swing.JButton botaoPesquisarNaInternet2;
    private javax.swing.JButton botaoPesquisarNaInternet3;
    private javax.swing.JButton btnCancelarCapacitor;
    private javax.swing.JButton btnCancelarIndutor;
    private javax.swing.JButton btnCancelarResistor;
    private javax.swing.JButton btnEditarCapacitor;
    private javax.swing.JButton btnEditarIndutor;
    private javax.swing.JButton btnEditarResistor;
    private javax.swing.JButton btnExcluirCapacitor;
    private javax.swing.JButton btnExcluirIndutor;
    private javax.swing.JButton btnExcluirResistor;
    private javax.swing.JButton btnNovoCapacitor;
    private javax.swing.JButton btnNovoIndutor;
    private javax.swing.JButton btnNovoResistor;
    private javax.swing.JButton btnSalvarCapacitor;
    private javax.swing.JButton btnSalvarIndutor;
    private javax.swing.JButton btnSalvarResistor;
    private javax.swing.JTextField campoCapacitancia;
    private javax.swing.JTextField campoDescricaoCapacitor;
    private javax.swing.JTextField campoDescricaoIndutor;
    private javax.swing.JTextField campoDescricaoResistor;
    private javax.swing.JTextField campoIdCapacitor;
    private javax.swing.JTextField campoIdIndutor;
    private javax.swing.JTextField campoIdResistor;
    private javax.swing.JTextField campoIndutancia;
    private javax.swing.JTextField campoQuantidadeCapacitor;
    private javax.swing.JTextField campoQuantidadeIndutor;
    private javax.swing.JTextField campoQuantidadeResistor;
    private javax.swing.JTextField campoResistencia;
    private javax.swing.JComboBox<String> comboTipoCapacitor;
    private javax.swing.JComboBox<String> comboTipoIndutor;
    private javax.swing.JComboBox<String> comboTipoResistor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel tabCapacitores;
    private javax.swing.JPanel tabIndutores;
    private javax.swing.JPanel tabResistores;
    private javax.swing.JTable tabelaCapacitores;
    private javax.swing.JTable tabelaIndutores;
    private javax.swing.JTable tabelaResistores;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
