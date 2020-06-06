namespace vistaemple
{
    partial class nomina
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnguardar = new System.Windows.Forms.Button();
            this.idenificacion = new System.Windows.Forms.TextBox();
            this.h_trabajo = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.dgvnomina = new System.Windows.Forms.DataGridView();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.empleadosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.nominaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.manejoEmpleadosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ingresoNominaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            ((System.ComponentModel.ISupportInitialize)(this.dgvnomina)).BeginInit();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // btnguardar
            // 
            this.btnguardar.Location = new System.Drawing.Point(46, 184);
            this.btnguardar.Name = "btnguardar";
            this.btnguardar.Size = new System.Drawing.Size(75, 23);
            this.btnguardar.TabIndex = 0;
            this.btnguardar.Text = "guardar";
            this.btnguardar.UseVisualStyleBackColor = true;
            this.btnguardar.Click += new System.EventHandler(this.btnguardar_Click);
            // 
            // idenificacion
            // 
            this.idenificacion.Location = new System.Drawing.Point(35, 63);
            this.idenificacion.Name = "idenificacion";
            this.idenificacion.Size = new System.Drawing.Size(100, 20);
            this.idenificacion.TabIndex = 1;
            // 
            // h_trabajo
            // 
            this.h_trabajo.Location = new System.Drawing.Point(35, 143);
            this.h_trabajo.Name = "h_trabajo";
            this.h_trabajo.Size = new System.Drawing.Size(100, 20);
            this.h_trabajo.TabIndex = 2;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(32, 33);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(89, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "IDENTIFICACÓN";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(32, 115);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(118, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "HORAS TRABAJADAS";
            // 
            // dgvnomina
            // 
            this.dgvnomina.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvnomina.Location = new System.Drawing.Point(217, 63);
            this.dgvnomina.Name = "dgvnomina";
            this.dgvnomina.Size = new System.Drawing.Size(333, 100);
            this.dgvnomina.TabIndex = 5;
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.empleadosToolStripMenuItem,
            this.nominaToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(576, 24);
            this.menuStrip1.TabIndex = 6;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // empleadosToolStripMenuItem
            // 
            this.empleadosToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.manejoEmpleadosToolStripMenuItem});
            this.empleadosToolStripMenuItem.Name = "empleadosToolStripMenuItem";
            this.empleadosToolStripMenuItem.Size = new System.Drawing.Size(77, 20);
            this.empleadosToolStripMenuItem.Text = "Empleados";
            // 
            // nominaToolStripMenuItem
            // 
            this.nominaToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.ingresoNominaToolStripMenuItem});
            this.nominaToolStripMenuItem.Name = "nominaToolStripMenuItem";
            this.nominaToolStripMenuItem.Size = new System.Drawing.Size(62, 20);
            this.nominaToolStripMenuItem.Text = "Nomina";
            // 
            // manejoEmpleadosToolStripMenuItem
            // 
            this.manejoEmpleadosToolStripMenuItem.Name = "manejoEmpleadosToolStripMenuItem";
            this.manejoEmpleadosToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.manejoEmpleadosToolStripMenuItem.Text = "manejo empleados";
            this.manejoEmpleadosToolStripMenuItem.Click += new System.EventHandler(this.manejoEmpleadosToolStripMenuItem_Click);
            // 
            // ingresoNominaToolStripMenuItem
            // 
            this.ingresoNominaToolStripMenuItem.Name = "ingresoNominaToolStripMenuItem";
            this.ingresoNominaToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.ingresoNominaToolStripMenuItem.Text = "Ingreso nomina";
            // 
            // nomina
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(576, 237);
            this.Controls.Add(this.dgvnomina);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.h_trabajo);
            this.Controls.Add(this.idenificacion);
            this.Controls.Add(this.btnguardar);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "nomina";
            this.Text = "nomina";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.nomina_FormClosing);
            this.Load += new System.EventHandler(this.nomina_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgvnomina)).EndInit();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnguardar;
        private System.Windows.Forms.TextBox idenificacion;
        private System.Windows.Forms.TextBox h_trabajo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.DataGridView dgvnomina;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem empleadosToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem manejoEmpleadosToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem nominaToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ingresoNominaToolStripMenuItem;
    }
}