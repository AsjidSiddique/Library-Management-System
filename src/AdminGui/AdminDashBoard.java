
package AdminGui;


import AdminLogic.Back_Stack;
import AdminLogic.Book;
import AdminLogic.BookManager;
import AdminLogic.Student;
import AdminLogic.StudentManager;
import AdminLogic.Transaction;
import AdminLogic.TransactionManager;
import Common.Login;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminDashBoard extends javax.swing.JFrame {

    public AdminDashBoard() {
         setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo.png")).getImage());
        initComponents();
          this.setLocationRelativeTo(null); 
           javax.swing.Timer timer = new javax.swing.Timer(1000, e ->  {
     l_time.setText(Common.DateTime.getCurrentTime());
   });
   timer.start();
    l_date.setText(Common.DateTime.getCurrentDate());
    Statistic();
    }
     void Statistic(){
    Back_Stack.pushPanel("1");
    Menu.removeAll();
         Menu.add(Statistics); 
         Menu.repaint();
         Menu.revalidate();  
         
    int totalStudents = StudentManager.getStudentList().size();

    int availableBooks = 0;
    int borrowedBooks = 0;
    int totalBooks = 0; 
    int categoryBooks = BookManager.getBookList().size(); 

    for (Book b : BookManager.getBookList()) {
        availableBooks += b.getAvailableCopies();
        borrowedBooks += (b.getTotalCopies() - b.getAvailableCopies());
        totalBooks += b.getTotalCopies();
    }

    T_BOOK.setText(String.valueOf(totalBooks));
    T_STU.setText(String.valueOf(totalStudents));
    C_BOOK.setText(String.valueOf(categoryBooks));
    A_BOOK.setText(String.valueOf(availableBooks));
    B_BOOK.setText(String.valueOf(borrowedBooks));
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Frame = new javax.swing.JPanel();
        PanelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelDateTime1 = new javax.swing.JPanel();
        l_time = new javax.swing.JLabel();
        l_date = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        Options = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        Add_Stu = new javax.swing.JButton();
        Book = new javax.swing.JButton();
        Book_Add = new javax.swing.JButton();
        Student_Records = new javax.swing.JButton();
        Borrow = new javax.swing.JButton();
        Transaction = new javax.swing.JButton();
        Menu = new javax.swing.JPanel();
        StudentRec = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Stu_Table = new javax.swing.JTable();
        l_search = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Stu_Del = new javax.swing.JButton();
        Statistics = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        B_BOOK = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        T_BOOK = new javax.swing.JTextField();
        T_STU = new javax.swing.JTextField();
        A_BOOK = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        C_BOOK = new javax.swing.JTextField();
        ADD_BOOK = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        l_name5 = new javax.swing.JLabel();
        fill10 = new javax.swing.JLabel();
        ISBN = new javax.swing.JTextField();
        l_name6 = new javax.swing.JLabel();
        CopyCombobox = new javax.swing.JComboBox<>();
        l_password4 = new javax.swing.JLabel();
        fill12 = new javax.swing.JLabel();
        Author = new javax.swing.JTextField();
        Title = new javax.swing.JTextField();
        l_name7 = new javax.swing.JLabel();
        fill13 = new javax.swing.JLabel();
        fill14 = new javax.swing.JLabel();
        Add1 = new javax.swing.JButton();
        ADD_STU = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        l_name3 = new javax.swing.JLabel();
        fill7 = new javax.swing.JLabel();
        Roll = new javax.swing.JTextField();
        l_name2 = new javax.swing.JLabel();
        Dept = new javax.swing.JComboBox<>();
        l_password3 = new javax.swing.JLabel();
        fill11 = new javax.swing.JLabel();
        Name2 = new javax.swing.JTextField();
        Name1 = new javax.swing.JTextField();
        l_name4 = new javax.swing.JLabel();
        fill8 = new javax.swing.JLabel();
        fill9 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        fill15 = new javax.swing.JLabel();
        Phones = new javax.swing.JTextField();
        Phone = new javax.swing.JLabel();
        Books = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BookTable = new javax.swing.JTable();
        l_search1 = new javax.swing.JLabel();
        Search1 = new javax.swing.JTextField();
        BookDel = new javax.swing.JButton();
        Transation = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tran_Table = new javax.swing.JTable();
        l_search2 = new javax.swing.JLabel();
        Search_Tran = new javax.swing.JTextField();
        RetrunBOOK = new javax.swing.JButton();
        BorrowReturn = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        l_name8 = new javax.swing.JLabel();
        fill16 = new javax.swing.JLabel();
        l_name9 = new javax.swing.JLabel();
        Stu_id = new javax.swing.JComboBox<>();
        TITLE = new javax.swing.JTextField();
        l_name10 = new javax.swing.JLabel();
        fill18 = new javax.swing.JLabel();
        fill19 = new javax.swing.JLabel();
        BorrowBOOK = new javax.swing.JButton();
        fill20 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        Phone1 = new javax.swing.JLabel();
        Book_isbn = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main_Frame.setBackground(new java.awt.Color(13, 81, 214));
        Main_Frame.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        Main_Frame.setForeground(new java.awt.Color(228, 0, 51));
        Main_Frame.setToolTipText("");
        Main_Frame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelHeader.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/admin.png"))); // NOI18N
        jLabel1.setText("Admin DashBoard");

        PanelDateTime1.setBackground(new java.awt.Color(0, 0, 102));
        PanelDateTime1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_time.setBackground(new java.awt.Color(255, 255, 255));
        l_time.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        l_time.setForeground(new java.awt.Color(255, 255, 255));
        l_time.setToolTipText("");
        PanelDateTime1.add(l_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 20));

        l_date.setBackground(new java.awt.Color(204, 255, 255));
        l_date.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        l_date.setForeground(new java.awt.Color(102, 255, 255));
        l_date.setToolTipText("");
        PanelDateTime1.add(l_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 100, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/timetable (1).png"))); // NOI18N
        PanelDateTime1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(255, 51, 51));
        Logout.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout.png"))); // NOI18N
        Logout.setText("LogOut");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelHeaderLayout = new javax.swing.GroupLayout(PanelHeader);
        PanelHeader.setLayout(PanelHeaderLayout);
        PanelHeaderLayout.setHorizontalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(Logout)
                .addGap(241, 241, 241))
        );
        PanelHeaderLayout.setVerticalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addGroup(PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHeaderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PanelDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        Main_Frame.add(PanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 970, 80));

        Options.setBackground(new java.awt.Color(0, 52, 200));
        Options.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(204, 255, 204));
        Home.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analytics (1).png"))); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        Options.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 70));

        Add_Stu.setBackground(new java.awt.Color(102, 204, 255));
        Add_Stu.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Add_Stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/products.png"))); // NOI18N
        Add_Stu.setText("<html><center>Add<br> Student</center></html>");
        Add_Stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_StuActionPerformed(evt);
            }
        });
        Options.add(Add_Stu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 70));

        Book.setBackground(new java.awt.Color(204, 25, 204));
        Book.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/selection.png"))); // NOI18N
        Book.setText("<html><center>Books<br> Records</center></html>");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });
        Options.add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 70));

        Book_Add.setBackground(new java.awt.Color(100, 113, 121));
        Book_Add.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Book_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/group.png"))); // NOI18N
        Book_Add.setText("<html><center>Add<br> Book\n</center></html>");
        Book_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_AddActionPerformed(evt);
            }
        });
        Options.add(Book_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 70));

        Student_Records.setBackground(new java.awt.Color(255, 153, 102));
        Student_Records.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Student_Records.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/team (1).png"))); // NOI18N
        Student_Records.setText("<html><center>Stduents<br> Records</center></html>");
        Student_Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_RecordsActionPerformed(evt);
            }
        });
        Options.add(Student_Records, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 70));

        Borrow.setBackground(new java.awt.Color(255, 153, 12));
        Borrow.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Borrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/application.png"))); // NOI18N
        Borrow.setText("<html><center>Borrow<br> Book</center></html>");
        Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowActionPerformed(evt);
            }
        });
        Options.add(Borrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 190, 70));

        Transaction.setBackground(new java.awt.Color(255, 255, 204));
        Transaction.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Transaction.setText("<html><center>Books<br> Transaction</center></html>");
        Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionActionPerformed(evt);
            }
        });
        Options.add(Transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 190, 70));

        Main_Frame.add(Options, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 510));

        Menu.setLayout(new java.awt.CardLayout());

        StudentRec.setBackground(new java.awt.Color(51, 255, 204));
        StudentRec.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 92));
        jPanel3.setForeground(new java.awt.Color(255, 102, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analytics (1).png"))); // NOI18N
        jLabel6.setText("Students Records");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        StudentRec.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, -1));

        jScrollPane2.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));

        Stu_Table.setAutoCreateRowSorter(true);
        Stu_Table.setBackground(new java.awt.Color(204, 204, 255));
        Stu_Table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 3, true));
        Stu_Table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Stu_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No#", "Name", "Phone #", "Department", "Books Borrow"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Stu_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stu_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Stu_Table);

        StudentRec.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 660, 290));

        l_search.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        l_search.setForeground(new java.awt.Color(0, 0, 255));
        l_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        l_search.setText("Search");
        StudentRec.add(l_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, -1));

        Search.setBackground(new java.awt.Color(255, 255, 204));
        Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search.setActionCommand("<Not Set>");
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        StudentRec.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 400, 30));

        Stu_Del.setBackground(new java.awt.Color(255, 153, 51));
        Stu_Del.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Stu_Del.setForeground(new java.awt.Color(0, 51, 51));
        Stu_Del.setText("Delete");
        Stu_Del.setActionCommand("SignUp");
        Stu_Del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stu_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stu_DelActionPerformed(evt);
            }
        });
        StudentRec.add(Stu_Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 150, 50));

        Menu.add(StudentRec, "card3");

        Statistics.setBackground(new java.awt.Color(255, 153, 255));
        Statistics.setForeground(new java.awt.Color(255, 204, 153));
        Statistics.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 92));
        jPanel2.setForeground(new java.awt.Color(255, 102, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analytics (1).png"))); // NOI18N
        jLabel2.setText("Admin Statistics");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Statistics.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/customer-review.png"))); // NOI18N
        jLabel3.setText("Total Students:");
        Statistics.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sales.png"))); // NOI18N
        jLabel4.setText("Avalaible Books:");
        Statistics.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/categorization.png"))); // NOI18N
        jLabel5.setText("Total Books:");
        Statistics.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        B_BOOK.setEditable(false);
        B_BOOK.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Statistics.add(B_BOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 240, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/best-product.png"))); // NOI18N
        jLabel7.setText("Borror Books:");
        Statistics.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        T_BOOK.setEditable(false);
        T_BOOK.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Statistics.add(T_BOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 240, 30));

        T_STU.setEditable(false);
        T_STU.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Statistics.add(T_STU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 240, 30));

        A_BOOK.setEditable(false);
        A_BOOK.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Statistics.add(A_BOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 240, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/categorization.png"))); // NOI18N
        jLabel14.setText("Books Categories:");
        Statistics.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 250, 380, -1));

        C_BOOK.setEditable(false);
        C_BOOK.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Statistics.add(C_BOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 240, 30));

        Menu.add(Statistics, "card2");

        ADD_BOOK.setBackground(new java.awt.Color(163, 0, 21));
        ADD_BOOK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 0, 87));
        jPanel7.setForeground(new java.awt.Color(255, 102, 51));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analytics (1).png"))); // NOI18N
        jLabel11.setText("Add BOOK");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        ADD_BOOK.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, -1));

        l_name5.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name5.setForeground(new java.awt.Color(0, 0, 255));
        l_name5.setText("ISBN");
        ADD_BOOK.add(l_name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, 30));

        fill10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill10.setForeground(new java.awt.Color(228, 0, 51));
        fill10.setText("*");
        ADD_BOOK.add(fill10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 10, -1));

        ISBN.setBackground(new java.awt.Color(255, 255, 204));
        ISBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ISBN.setActionCommand("<Not Set>");
        ISBN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNActionPerformed(evt);
            }
        });
        ADD_BOOK.add(ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 280, 30));

        l_name6.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name6.setForeground(new java.awt.Color(0, 0, 255));
        l_name6.setText("Author");
        ADD_BOOK.add(l_name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 170, 50));

        CopyCombobox.setBackground(new java.awt.Color(255, 255, 204));
        CopyCombobox.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CopyCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        CopyCombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CopyCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyComboboxActionPerformed(evt);
            }
        });
        ADD_BOOK.add(CopyCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 300, -1));

        l_password4.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_password4.setForeground(new java.awt.Color(0, 0, 255));
        l_password4.setText("Total Copies");
        ADD_BOOK.add(l_password4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 180, 50));

        fill12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill12.setForeground(new java.awt.Color(228, 0, 51));
        fill12.setText("*");
        ADD_BOOK.add(fill12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 10, -1));

        Author.setBackground(new java.awt.Color(240, 240, 240));
        Author.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Author.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorActionPerformed(evt);
            }
        });
        ADD_BOOK.add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 280, 30));

        Title.setBackground(new java.awt.Color(240, 240, 240));
        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setToolTipText("");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleActionPerformed(evt);
            }
        });
        ADD_BOOK.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 280, 30));

        l_name7.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name7.setForeground(new java.awt.Color(0, 0, 255));
        l_name7.setText("Title");
        ADD_BOOK.add(l_name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, 50));

        fill13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill13.setForeground(new java.awt.Color(228, 0, 51));
        fill13.setText("*");
        ADD_BOOK.add(fill13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 10, -1));

        fill14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill14.setForeground(new java.awt.Color(228, 0, 51));
        fill14.setText("*");
        ADD_BOOK.add(fill14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 10, -1));

        Add1.setBackground(new java.awt.Color(255, 153, 51));
        Add1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Add1.setForeground(new java.awt.Color(0, 51, 51));
        Add1.setText("Add Student");
        Add1.setActionCommand("SignUp");
        Add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });
        ADD_BOOK.add(Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 390, -1));

        Menu.add(ADD_BOOK, "card3");

        ADD_STU.setBackground(new java.awt.Color(163, 0, 21));
        ADD_STU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 87));
        jPanel6.setForeground(new java.awt.Color(255, 102, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analytics (1).png"))); // NOI18N
        jLabel10.setText("Register Student");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        ADD_STU.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, -1));

        l_name3.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name3.setForeground(new java.awt.Color(0, 0, 255));
        l_name3.setText("Roll NO.#");
        ADD_STU.add(l_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 150, 30));

        fill7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill7.setForeground(new java.awt.Color(228, 0, 51));
        fill7.setText("*");
        ADD_STU.add(fill7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 10, -1));

        Roll.setBackground(new java.awt.Color(255, 255, 204));
        Roll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Roll.setActionCommand("<Not Set>");
        Roll.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollActionPerformed(evt);
            }
        });
        ADD_STU.add(Roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 280, 30));

        l_name2.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name2.setForeground(new java.awt.Color(0, 0, 255));
        l_name2.setText("Last Name");
        ADD_STU.add(l_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 160, 50));

        Dept.setBackground(new java.awt.Color(255, 255, 204));
        Dept.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EE", "IS", "SEECS" }));
        Dept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptActionPerformed(evt);
            }
        });
        ADD_STU.add(Dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 300, -1));

        l_password3.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_password3.setForeground(new java.awt.Color(0, 0, 255));
        l_password3.setText("Department");
        ADD_STU.add(l_password3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 180, 50));

        fill11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill11.setForeground(new java.awt.Color(228, 0, 51));
        fill11.setText("*");
        ADD_STU.add(fill11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 10, -1));

        Name2.setBackground(new java.awt.Color(240, 240, 240));
        Name2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Name2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name2ActionPerformed(evt);
            }
        });
        ADD_STU.add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 280, 30));

        Name1.setBackground(new java.awt.Color(240, 240, 240));
        Name1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Name1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name1ActionPerformed(evt);
            }
        });
        ADD_STU.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 280, 30));

        l_name4.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name4.setForeground(new java.awt.Color(0, 0, 255));
        l_name4.setText("First Name");
        ADD_STU.add(l_name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 170, 50));

        fill8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill8.setForeground(new java.awt.Color(228, 0, 51));
        fill8.setText("*");
        ADD_STU.add(fill8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 10, -1));

        fill9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill9.setForeground(new java.awt.Color(228, 0, 51));
        fill9.setText("*");
        ADD_STU.add(fill9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 10, -1));

        Add.setBackground(new java.awt.Color(255, 153, 51));
        Add.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 51, 51));
        Add.setText("Add Student");
        Add.setActionCommand("SignUp");
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        ADD_STU.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 390, -1));

        fill15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill15.setForeground(new java.awt.Color(228, 0, 51));
        fill15.setText("*");
        ADD_STU.add(fill15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 10, -1));

        Phones.setBackground(new java.awt.Color(240, 240, 240));
        Phones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Phones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Phones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhonesActionPerformed(evt);
            }
        });
        ADD_STU.add(Phones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 280, 30));

        Phone.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        Phone.setForeground(new java.awt.Color(0, 0, 255));
        Phone.setText("Phone");
        ADD_STU.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 110, 50));

        Menu.add(ADD_STU, "card3");

        Books.setBackground(new java.awt.Color(255, 204, 204));
        Books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 87));
        jPanel4.setForeground(new java.awt.Color(255, 102, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analytics (1).png"))); // NOI18N
        jLabel8.setText("Books Records");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Books.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, -1));

        jScrollPane3.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));

        BookTable.setAutoCreateRowSorter(true);
        BookTable.setBackground(new java.awt.Color(204, 255, 204));
        BookTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Author", "Total Copies", "Avalible Copies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BookTable);

        Books.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 660, 290));

        l_search1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        l_search1.setForeground(new java.awt.Color(0, 0, 255));
        l_search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        l_search1.setText("Search");
        Books.add(l_search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, -1));

        Search1.setBackground(new java.awt.Color(255, 255, 204));
        Search1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search1.setActionCommand("<Not Set>");
        Search1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });
        Search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search1KeyReleased(evt);
            }
        });
        Books.add(Search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 400, 30));

        BookDel.setBackground(new java.awt.Color(255, 153, 51));
        BookDel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BookDel.setForeground(new java.awt.Color(0, 51, 51));
        BookDel.setText("Delete");
        BookDel.setActionCommand("SignUp");
        BookDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookDelActionPerformed(evt);
            }
        });
        Books.add(BookDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 150, 50));

        Menu.add(Books, "card3");

        Transation.setBackground(new java.awt.Color(204, 204, 255));
        Transation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 87));
        jPanel5.setForeground(new java.awt.Color(255, 102, 51));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analytics (1).png"))); // NOI18N
        jLabel9.setText("Transaction Records");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Transation.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, -1));

        jScrollPane4.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));

        Tran_Table.setAutoCreateRowSorter(true);
        Tran_Table.setBackground(new java.awt.Color(204, 255, 204));
        Tran_Table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tran_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TransactionID", "Book ID", "Student ID", "Student Name", "Borrow Date", "Return Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tran_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tran_TableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tran_Table);

        Transation.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 660, 290));

        l_search2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        l_search2.setForeground(new java.awt.Color(0, 0, 255));
        l_search2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        l_search2.setText("Search");
        Transation.add(l_search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, -1));

        Search_Tran.setBackground(new java.awt.Color(255, 255, 204));
        Search_Tran.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search_Tran.setActionCommand("<Not Set>");
        Search_Tran.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Search_Tran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_TranActionPerformed(evt);
            }
        });
        Search_Tran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_TranKeyReleased(evt);
            }
        });
        Transation.add(Search_Tran, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 400, 30));

        RetrunBOOK.setBackground(new java.awt.Color(0, 255, 255));
        RetrunBOOK.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        RetrunBOOK.setForeground(new java.awt.Color(51, 0, 102));
        RetrunBOOK.setText("<html> RETURN  <br>   <html>");
        RetrunBOOK.setActionCommand("SignUp");
        RetrunBOOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RetrunBOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrunBOOKActionPerformed(evt);
            }
        });
        Transation.add(RetrunBOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 150, 60));

        Menu.add(Transation, "card3");

        BorrowReturn.setBackground(new java.awt.Color(163, 0, 21));
        BorrowReturn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 0, 87));
        jPanel8.setForeground(new java.awt.Color(255, 102, 51));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analytics (1).png"))); // NOI18N
        jLabel13.setText("Borrow BOOK");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        BorrowReturn.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, -1));

        l_name8.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name8.setForeground(new java.awt.Color(0, 0, 255));
        l_name8.setText("Book ISBN");
        BorrowReturn.add(l_name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 150, 30));

        fill16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill16.setForeground(new java.awt.Color(228, 0, 51));
        fill16.setText("*");
        BorrowReturn.add(fill16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 10, -1));

        l_name9.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name9.setForeground(new java.awt.Color(0, 0, 255));
        l_name9.setText("Student Roll#");
        BorrowReturn.add(l_name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 50));

        Stu_id.setBackground(new java.awt.Color(255, 255, 204));
        Stu_id.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Stu_id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stu_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Stu_idFocusLost(evt);
            }
        });
        Stu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stu_idActionPerformed(evt);
            }
        });
        BorrowReturn.add(Stu_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 300, -1));

        TITLE.setEditable(false);
        TITLE.setBackground(new java.awt.Color(240, 240, 240));
        TITLE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TITLE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TITLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TITLEActionPerformed(evt);
            }
        });
        BorrowReturn.add(TITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 280, 30));

        l_name10.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_name10.setForeground(new java.awt.Color(0, 0, 255));
        l_name10.setText("Book Title");
        BorrowReturn.add(l_name10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 170, 50));

        fill18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill18.setForeground(new java.awt.Color(228, 0, 51));
        fill18.setText("*");
        BorrowReturn.add(fill18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 10, -1));

        fill19.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill19.setForeground(new java.awt.Color(228, 0, 51));
        fill19.setText("*");
        BorrowReturn.add(fill19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 10, -1));

        BorrowBOOK.setBackground(new java.awt.Color(255, 153, 51));
        BorrowBOOK.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BorrowBOOK.setForeground(new java.awt.Color(0, 51, 51));
        BorrowBOOK.setText("Borrow BOOK");
        BorrowBOOK.setActionCommand("SignUp");
        BorrowBOOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrowBOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowBOOKActionPerformed(evt);
            }
        });
        BorrowReturn.add(BorrowBOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 310, -1));

        fill20.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill20.setForeground(new java.awt.Color(228, 0, 51));
        fill20.setText("*");
        BorrowReturn.add(fill20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 10, -1));

        NAME.setEditable(false);
        NAME.setBackground(new java.awt.Color(240, 240, 240));
        NAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NAME.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });
        BorrowReturn.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 280, 30));

        Phone1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        Phone1.setForeground(new java.awt.Color(0, 0, 255));
        Phone1.setText("Student Name");
        BorrowReturn.add(Phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 50));

        Book_isbn.setBackground(new java.awt.Color(255, 255, 204));
        Book_isbn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Book_isbn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Book_isbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Book_isbnFocusLost(evt);
            }
        });
        Book_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_isbnActionPerformed(evt);
            }
        });
        BorrowReturn.add(Book_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 300, -1));

        Menu.add(BorrowReturn, "card3");

        Main_Frame.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 720, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Main_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Main_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowActionPerformed
  Back_Stack.pushPanel("6");
        Menu.removeAll();
    Menu.add(BorrowReturn);
    Menu.repaint();
    Menu.revalidate();
    
    Book_isbn.removeAllItems();
    Stu_id.removeAllItems();

        for (Book b : BookManager.getBookList()) {
        Book_isbn.addItem(b.getIsbn());  
    }

    for (Student s : StudentManager.getStudentList()) {
        Stu_id.addItem(s.getStudentID()); 
    }
    }//GEN-LAST:event_BorrowActionPerformed

    private void Add_StuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_StuActionPerformed
  Back_Stack.pushPanel(" 3");
        Menu.removeAll();
   Menu.add(ADD_STU);
   Menu.repaint();
    Menu.revalidate();        
    }//GEN-LAST:event_Add_StuActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
       Statistic();    
              
    }//GEN-LAST:event_HomeActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
  Back_Stack.pushPanel("4");
        Menu.removeAll();
    Menu.add(Books);
   Menu.repaint();
    Menu.revalidate();   
  
   refreshBookTable();
    }//GEN-LAST:event_BookActionPerformed

    public void refreshBookTable() {
    DefaultTableModel model = (DefaultTableModel) BookTable.getModel();
    model.setRowCount(0);
    for (Book b : BookManager.getBookList()) {
        model.addRow(new Object[]{
            b.getIsbn(),
            b.getTitle(),
            b.getAuthor(),
            b.getTotalCopies(),
            b.getAvailableCopies()
        });
    }
}
    private void Book_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_AddActionPerformed
  Back_Stack.pushPanel("5");
  Menu.removeAll();
   Menu.add(ADD_BOOK);
   Menu.repaint();
    Menu.revalidate();         
    }//GEN-LAST:event_Book_AddActionPerformed

    private void Student_RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_RecordsActionPerformed
  Back_Stack.pushPanel("2");
   Menu.removeAll();
   Menu.add(StudentRec);
   Menu.repaint();
    Menu.revalidate();
    
     refreshStuTable();
    }//GEN-LAST:event_Student_RecordsActionPerformed
   public void refreshStuTable() {
     LinkedList<Student> students = StudentManager.getStudentList();

    DefaultTableModel model = (DefaultTableModel) Stu_Table.getModel();

    model.setRowCount(0);

    for (Student s : students) {
        model.addRow(new Object[]{
            s.getStudentID(),
            s.getName(),
            s.getContactDetails(),
            s.getDepartment(),
            s.getBooksBorrowedCount()
        });
   }
}
    private void TransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionActionPerformed
      Back_Stack.pushPanel("7");
        Menu.removeAll();
   Menu.add(Transation);
   Menu.repaint();
    Menu.revalidate(); 
    
    DefaultTableModel model = (DefaultTableModel) Tran_Table.getModel();
    model.setRowCount(0); 

    for (Transaction t : TransactionManager.getTransactions()) {
        model.addRow(new Object[]{
            t.getTransactionID(),
            t.getBookID(),
            t.getStudentID(),
            t.getStudentName(),
            t.getBorrowDate(),
            t.getReturnDate() != null ? t.getReturnDate() : "" 
        });
    }
    }//GEN-LAST:event_TransactionActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    Back_Stack.setGoingBack(true);
      Back_Stack.popPanel();
    String previousPanel = Back_Stack.peekPanel();
    if (previousPanel == null) {
        Back_Stack.setGoingBack(false);
        return;
    }
    switch (previousPanel) {
        case "1":
            Statistic();
            break;
        case "2":
            Student_RecordsActionPerformed(evt);
            break;
        case "3":
            Add_StuActionPerformed(evt);
            break;
        case "4":
            BookActionPerformed(evt);
            break;
        case "5":
            Book_AddActionPerformed(evt);
            break;
        case "6":
            BorrowActionPerformed(evt);
            break;
        case "7":
            TransactionActionPerformed(evt);
            break;
        default:
            break;
    }

    Back_Stack.setGoingBack(false);
    }//GEN-LAST:event_BackActionPerformed

    private void Stu_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stu_TableMouseClicked
        
    }//GEN-LAST:event_Stu_TableMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
      String searchText = Search.getText().trim().toLowerCase();

   DefaultTableModel model = (DefaultTableModel) Stu_Table.getModel();
    model.setRowCount(0); 

    for (Student s : StudentManager.getStudentList()) {
        String id = s.getStudentID().toLowerCase();
        String name = s.getName().toLowerCase();

        if (id.contains(searchText) || name.contains(searchText)) {
          
            model.addRow(new Object[]{
                s.getStudentID(),
                s.getName(),
                s.getContactDetails(),
                s.getDepartment(),
                s.getBooksBorrowedCount()
            });
        }
    }
    }//GEN-LAST:event_SearchKeyReleased

    private void Stu_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stu_DelActionPerformed
         int selectedRow = Stu_Table.getSelectedRow();

    if (selectedRow == -1) { 
        JOptionPane.showMessageDialog(this, "Please select a student to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String studentID = Stu_Table.getValueAt(selectedRow, 0).toString();

      int confirm = JOptionPane.showConfirmDialog(this, 
        "Are you sure you want to delete the student with ID: " + studentID + "?", 
        "Confirm Delete", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
      
        boolean removed = StudentManager.removeStudent(studentID);

        if (removed) {
          DefaultTableModel model = (DefaultTableModel) Stu_Table.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Student deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Student not found in the list.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_Stu_DelActionPerformed

    private void BookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BookTableMouseClicked

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
      
    }//GEN-LAST:event_Search1ActionPerformed

    private void Search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search1KeyReleased
         String searchText = Search1.getText().trim().toLowerCase();

       DefaultTableModel model = (DefaultTableModel) BookTable.getModel();
    model.setRowCount(0); 

    for (Book b : BookManager.getBookList()) {
        String isbn = b.getIsbn().toLowerCase();
        String title = b.getTitle().toLowerCase();

        if (isbn.contains(searchText) || title.contains(searchText)) {
             model.addRow(new Object[]{
                b.getIsbn(),
                b.getTitle(),
                b.getAuthor(),
                b.getTotalCopies(),
                b.getAvailableCopies()
            });
        }
    }
    }//GEN-LAST:event_Search1KeyReleased

    private void BookDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookDelActionPerformed
       
    int selectedRow = BookTable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a book to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

       String isbn = BookTable.getValueAt(selectedRow, 0).toString();

 
    int confirm = JOptionPane.showConfirmDialog(this, 
        "Are you sure you want to delete the book with ISBN: " + isbn + "?", 
        "Confirm Delete", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
       
        boolean removed = BookManager.removeBook(isbn);

        if (removed) {
           
            DefaultTableModel model = (DefaultTableModel) BookTable.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Book deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Book not found in the list.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_BookDelActionPerformed

    private void Tran_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tran_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tran_TableMouseClicked

    private void Search_TranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_TranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_TranActionPerformed

    private void Search_TranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_TranKeyReleased
        String searchText = Search_Tran.getText().trim().toLowerCase();

    DefaultTableModel model = (DefaultTableModel) Tran_Table.getModel();
    model.setRowCount(0); 

    for (Transaction t : TransactionManager.getTransactions()) {
        if (t.getTransactionID().toLowerCase().contains(searchText)) {
            model.addRow(new Object[]{
                t.getTransactionID(),
                t.getBookID(),
                t.getStudentID(),
                t.getStudentName(),
                t.getBorrowDate(),
                t.getReturnDate() != null ? t.getReturnDate() : ""
            });
        }
    }
    }//GEN-LAST:event_Search_TranKeyReleased

    private void RetrunBOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrunBOOKActionPerformed
           try {
       int selectedRow = Tran_Table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a transaction to return.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String transactionID = Tran_Table.getValueAt(selectedRow, 0).toString();

        Transaction transaction = null;
        for (Transaction t : TransactionManager.getTransactions()) {
            if (t.getTransactionID().equals(transactionID)) {
                transaction = t;
                break;
            }
        }

        if (transaction == null) {
            JOptionPane.showMessageDialog(this, "Transaction not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (transaction.getReturnDate() != null) {
            JOptionPane.showMessageDialog(this, "This book has already been returned.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Book book = BookManager.findBookByIsbn(transaction.getBookID());
        Student student = StudentManager.findStudentByRoll(transaction.getStudentID());

        if (book != null) {
            book.returnCopy(); 
        }

        if (student != null) {
            student.decrementBorrowedCount(); 
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        transaction.setReturnDate(LocalDateTime.now().format(dtf));

        Tran_Table.setValueAt(transaction.getReturnDate(), selectedRow, 5); 

        JOptionPane.showMessageDialog(this, "Book returned successfully!");

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    } 
    }//GEN-LAST:event_RetrunBOOKActionPerformed

    private void RollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RollActionPerformed

    private void DeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeptActionPerformed

    private void Name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name2ActionPerformed

    private void Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name1ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       try {
        String roll = Roll.getText().trim();
        String firstName = Name1.getText().trim();
        String lastName = Name2.getText().trim();
        String phone = Phones.getText().trim();
        String department = (String) Dept.getSelectedItem();

        if (roll.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         if (StudentManager.findStudentByRoll(roll) != null) {
        JOptionPane.showMessageDialog(this, 
            "A student with Roll No '" + roll + "' already exists!", 
            "Duplicate Roll No", 
            JOptionPane.WARNING_MESSAGE);
        return;
    }
        String fullName = firstName + " " + lastName;

        Student newStudent = new Student(roll, fullName, phone, department);
        StudentManager.addStudent(newStudent);
        JOptionPane.showMessageDialog(this, "Student added successfully:\n");

        Roll.setText("");
        Name1.setText("");
        Name2.setText("");
        Phones.setText("");
        Dept.setSelectedIndex(0);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_AddActionPerformed

    private void ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorActionPerformed

    private void TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
          try {
        String isbn = ISBN.getText().trim();
        String title = Title.getText().trim();
        String author = Author.getText().trim();
        String copiesText = CopyCombobox.getSelectedItem().toString();

              if (isbn.isEmpty() || title.isEmpty() || author.isEmpty() || copiesText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       if (BookManager.findBookByIsbn(isbn) != null) {
            JOptionPane.showMessageDialog(this, 
                "A book with ISBN '" + isbn + "' already exists!", 
                "Duplicate ISBN", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        int totalCopies= Integer.parseInt(copiesText);
      

        Book newBook = new Book(title, author, isbn, totalCopies);

      
        BookManager.addBook(newBook);

          JOptionPane.showMessageDialog(this, "Book added successfully:\n" 
            + "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn);

        ISBN.setText("");
        Title.setText("");
        NAME.setText("");
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_Add1ActionPerformed

    private void CopyComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CopyComboboxActionPerformed

    private void PhonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhonesActionPerformed

    private void Stu_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stu_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stu_idActionPerformed

    private void TITLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TITLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TITLEActionPerformed

    private void BorrowBOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowBOOKActionPerformed
          try {
        String selectedISBN = Book_isbn.getSelectedItem().toString();
        String selectedStudentID = Stu_id.getSelectedItem().toString();

        Book book = BookManager.findBookByIsbn(selectedISBN);
        Student student = StudentManager.findStudentByRoll(selectedStudentID);

        if (book == null || student == null) {
            JOptionPane.showMessageDialog(this, "Invalid Book or Student selection!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (book.getAvailableCopies() <= 0) {
            JOptionPane.showMessageDialog(this, "Book not available!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        book.borrowCopy();        
        student.incrementBorrowedCount(); 

       
        Transaction t = new Transaction(book.getIsbn(), student.getStudentID(), student.getName());
        TransactionManager.addTransaction(t);

        JOptionPane.showMessageDialog(this, "Book borrowed successfully!\nTransaction ID: " + t.getTransactionID());
      
       
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
          TITLE.setText("");
          NAME.setText("");
    }//GEN-LAST:event_BorrowBOOKActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void Book_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Book_isbnActionPerformed

    private void Book_isbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Book_isbnFocusLost
        String selectedISBN = Book_isbn.getSelectedItem().toString();
           TITLE.setText(""); 
           
    
        Book b = BookManager.findBookByIsbn(selectedISBN);
                   TITLE.setText(b.getTitle()); 
          
    }//GEN-LAST:event_Book_isbnFocusLost

    private void Stu_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Stu_idFocusLost
        String selectedISBN = Stu_id.getSelectedItem().toString();
           NAME.setText(""); 
           
    
        Student s = StudentManager.findStudentByRoll(selectedISBN);
                   NAME.setText(s.getName()); 
         
    }//GEN-LAST:event_Stu_idFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADD_BOOK;
    private javax.swing.JPanel ADD_STU;
    private javax.swing.JTextField A_BOOK;
    private javax.swing.JButton Add;
    private javax.swing.JButton Add1;
    private javax.swing.JButton Add_Stu;
    private javax.swing.JTextField Author;
    private javax.swing.JTextField B_BOOK;
    private javax.swing.JButton Back;
    private javax.swing.JButton Book;
    private javax.swing.JButton BookDel;
    private javax.swing.JTable BookTable;
    private javax.swing.JButton Book_Add;
    private javax.swing.JComboBox<String> Book_isbn;
    private javax.swing.JPanel Books;
    private javax.swing.JButton Borrow;
    private javax.swing.JButton BorrowBOOK;
    private javax.swing.JPanel BorrowReturn;
    private javax.swing.JTextField C_BOOK;
    private javax.swing.JComboBox<String> CopyCombobox;
    private javax.swing.JComboBox<String> Dept;
    private javax.swing.JButton Home;
    private javax.swing.JTextField ISBN;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel Main_Frame;
    private javax.swing.JPanel Menu;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField Name1;
    private javax.swing.JTextField Name2;
    private javax.swing.JPanel Options;
    private javax.swing.JPanel PanelDateTime1;
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel Phone1;
    private javax.swing.JTextField Phones;
    private javax.swing.JButton RetrunBOOK;
    private javax.swing.JTextField Roll;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField Search1;
    private javax.swing.JTextField Search_Tran;
    private javax.swing.JPanel Statistics;
    private javax.swing.JButton Stu_Del;
    private javax.swing.JTable Stu_Table;
    private javax.swing.JComboBox<String> Stu_id;
    private javax.swing.JPanel StudentRec;
    private javax.swing.JButton Student_Records;
    private javax.swing.JTextField TITLE;
    private javax.swing.JTextField T_BOOK;
    private javax.swing.JTextField T_STU;
    private javax.swing.JTextField Title;
    private javax.swing.JTable Tran_Table;
    private javax.swing.JButton Transaction;
    private javax.swing.JPanel Transation;
    private javax.swing.JLabel fill10;
    private javax.swing.JLabel fill11;
    private javax.swing.JLabel fill12;
    private javax.swing.JLabel fill13;
    private javax.swing.JLabel fill14;
    private javax.swing.JLabel fill15;
    private javax.swing.JLabel fill16;
    private javax.swing.JLabel fill18;
    private javax.swing.JLabel fill19;
    private javax.swing.JLabel fill20;
    private javax.swing.JLabel fill7;
    private javax.swing.JLabel fill8;
    private javax.swing.JLabel fill9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_name10;
    private javax.swing.JLabel l_name2;
    private javax.swing.JLabel l_name3;
    private javax.swing.JLabel l_name4;
    private javax.swing.JLabel l_name5;
    private javax.swing.JLabel l_name6;
    private javax.swing.JLabel l_name7;
    private javax.swing.JLabel l_name8;
    private javax.swing.JLabel l_name9;
    private javax.swing.JLabel l_password3;
    private javax.swing.JLabel l_password4;
    private javax.swing.JLabel l_search;
    private javax.swing.JLabel l_search1;
    private javax.swing.JLabel l_search2;
    private javax.swing.JLabel l_time;
    // End of variables declaration//GEN-END:variables
}