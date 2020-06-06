namespace vistaemple
{
    partial class empleados
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.txtident = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.txtnombre = new System.Windows.Forms.TextBox();
            this.txtarea = new System.Windows.Forms.TextBox();
            this.txtcargo = new System.Windows.Forms.TextBox();
            this.txtsueldo = new System.Windows.Forms.TextBox();
            this.btnguardar = new System.Windows.Forms.Button();
            this.btnactualizar = new System.Windows.Forms.Button();
            this.btnconsultar = new System.Windows.Forms.Button();
            this.btnlistar = new System.Windows.Forms.Button();
            this.btneliminar = new System.Windows.Forms.Button();
            this.dtvempl = new System.Windows.Forms.DataGridView();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.empleadosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.manejoEmpleadosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.nominaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ingresoDatosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.cbmemp = new System.Windows.Forms.ComboBox();
            ((System.ComponentModel.ISupportInitialize)(this.dtvempl)).BeginInit();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(67, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(115, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "identificacion";
            // 
            // txtident
            // 
            this.txtident.Location = new System.Drawing.Point(302, 34);
            this.txtident.Name = "txtident";
            this.txtident.Size = new System.Drawing.Size(100, 20);
            this.txtident.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(67, 67);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(78, 20);
            this.label2.TabIndex = 2;
            this.label2.Text = "nombres";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(67, 106);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(45, 20);
            this.label3.TabIndex = 3;
            this.label3.Text = "area";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(67, 141);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(54, 20);
            this.label4.TabIndex = 4;
            this.label4.Text = "cargo";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(67, 178);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(62, 20);
            this.label5.TabIndex = 5;
            this.label5.Text = "sueldo";
            // 
            // txtnombre
            // 
            this.txtnombre.Location = new System.Drawing.Point(259, 67);
            this.txtnombre.Name = "txtnombre";
            this.txtnombre.Size = new System.Drawing.Size(198, 20);
            this.txtnombre.TabIndex = 6;
            // 
            // txtarea
            // 
            this.txtarea.Location = new System.Drawing.Point(302, 106);
            this.txtarea.Name = "txtarea";
            this.txtarea.Size = new System.Drawing.Size(100, 20);
            this.txtarea.TabIndex = 7;
            // 
            // txtcargo
            // 
            this.txtcargo.Location = new System.Drawing.Point(302, 143);
            this.txtcargo.Name = "txtcargo";
            this.txtcargo.Size = new System.Drawing.Size(100, 20);
            this.txtcargo.TabIndex = 8;
            // 
            // txtsueldo
            // 
            this.txtsueldo.Location = new System.Drawing.Point(302, 180);
            this.txtsueldo.Name = "txtsueldo";
            this.txtsueldo.Size = new System.Drawing.Size(100, 20);
            this.txtsueldo.TabIndex = 9;
            // 
            // btnguardar
            // 
            this.btnguardar.Font = new System.Drawing.Font("Gadugi", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnguardar.Location = new System.Drawing.Point(37, 217);
            this.btnguardar.Name = "btnguardar";
            this.btnguardar.Size = new System.Drawing.Size(75, 33);
            this.btnguardar.TabIndex = 10;
            this.btnguardar.Text = "guardar";
            this.btnguardar.UseVisualStyleBackColor = true;
            this.btnguardar.Click += new System.EventHandler(this.btnguardar_Click);
            // 
            // btnactualizar
            // 
            this.btnactualizar.Font = new System.Drawing.Font("Gadugi", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnactualizar.Location = new System.Drawing.Point(134, 217);
            this.btnactualizar.Name = "btnactualizar";
            this.btnactualizar.Size = new System.Drawing.Size(101, 33);
            this.btnactualizar.TabIndex = 11;
            this.btnactualizar.Text = "actualizar";
            this.btnactualizar.UseVisualStyleBackColor = true;
            this.btnactualizar.Click += new System.EventHandler(this.btnactualizar_Click);
            // 
            // btnconsultar
            // 
            this.btnconsultar.Font = new System.Drawing.Font("Gadugi", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnconsultar.Location = new System.Drawing.Point(259, 217);
            this.btnconsultar.Name = "btnconsultar";
            this.btnconsultar.Size = new System.Drawing.Size(97, 33);
            this.btnconsultar.TabIndex = 12;
            this.btnconsultar.Text = "consultar";
            this.btnconsultar.UseVisualStyleBackColor = true;
            this.btnconsultar.Click += new System.EventHandler(this.btnconsultar_Click);
            // 
            // btnlistar
            // 
            this.btnlistar.Font = new System.Drawing.Font("Gadugi", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnlistar.Location = new System.Drawing.Point(373, 217);
            this.btnlistar.Name = "btnlistar";
            this.btnlistar.Size = new System.Drawing.Size(75, 33);
            this.btnlistar.TabIndex = 13;
            this.btnlistar.Text = "listar";
            this.btnlistar.UseVisualStyleBackColor = true;
            this.btnlistar.Click += new System.EventHandler(this.btnlistar_Click);
            // 
            // btneliminar
            // 
            this.btneliminar.Font = new System.Drawing.Font("Gadugi", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btneliminar.Location = new System.Drawing.Point(468, 217);
            this.btneliminar.Name = "btneliminar";
            this.btneliminar.Size = new System.Drawing.Size(86, 33);
            this.btneliminar.TabIndex = 14;
            this.btneliminar.Text = "eliminar";
            this.btneliminar.UseVisualStyleBackColor = true;
            this.btneliminar.Click += new System.EventHandler(this.btneliminar_Click);
            // 
            // dtvempl
            // 
            this.dtvempl.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dtvempl.Location = new System.Drawing.Point(37, 283);
            this.dtvempl.Name = "dtvempl";
            this.dtvempl.Size = new System.Drawing.Size(517, 150);
            this.dtvempl.TabIndex = 15;
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.empleadosToolStripMenuItem,
            this.nominaToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(746, 24);
            this.menuStrip1.TabIndex = 16;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // empleadosToolStripMenuItem
            // 
            this.empleadosToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.manejoEmpleadosToolStripMenuItem});
            this.empleadosToolStripMenuItem.Name = "empleadosToolStripMenuItem";
            this.empleadosToolStripMenuItem.Size = new System.Drawing.Size(77, 20);
            this.empleadosToolStripMenuItem.Text = "empleados";
            // 
            // manejoEmpleadosToolStripMenuItem
            // 
            this.manejoEmpleadosToolStripMenuItem.Name = "manejoEmpleadosToolStripMenuItem";
            this.manejoEmpleadosToolStripMenuItem.Size = new System.Drawing.Size(175, 22);
            this.manejoEmpleadosToolStripMenuItem.Text = "manejo empleados";
            // 
            // nominaToolStripMenuItem
            // 
            this.nominaToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.ingresoDatosToolStripMenuItem});
            this.nominaToolStripMenuItem.Name = "nominaToolStripMenuItem";
            this.nominaToolStripMenuItem.Size = new System.Drawing.Size(62, 20);
            this.nominaToolStripMenuItem.Text = "Nomina";
            // 
            // ingresoDatosToolStripMenuItem
            // 
            this.ingresoDatosToolStripMenuItem.Name = "ingresoDatosToolStripMenuItem";
            this.ingresoDatosToolStripMenuItem.Size = new System.Drawing.Size(157, 22);
            this.ingresoDatosToolStripMenuItem.Text = "ingreso nomina";
            this.ingresoDatosToolStripMenuItem.Click += new System.EventHandler(this.ingresoDatosToolStripMenuItem_Click);
            // 
            // cbmemp
            // 
            this.cbmemp.FormattingEnabled = true;
            this.cbmemp.Location = new System.Drawing.Point(574, 66);
            this.cbmemp.Name = "cbmemp";
            this.cbmemp.Size = new System.Drawing.Size(121, 21);
            this.cbmemp.TabIndex = 17;
            // 
            // empleados
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(746, 534);
            this.Controls.Add(this.cbmemp);
            this.Controls.Add(this.dtvempl);
            this.Controls.Add(this.btneliminar);
            this.Controls.Add(this.btnlistar);
            this.Controls.Add(this.btnconsultar);
            this.Controls.Add(this.btnactualizar);
            this.Controls.Add(this.btnguardar);
            this.Controls.Add(this.txtsueldo);
            this.Controls.Add(this.txtcargo);
            this.Controls.Add(this.txtarea);
            this.Controls.Add(this.txtnombre);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txtident);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "empleados";
            this.Text = "empleados";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dtvempl)).EndInit();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtident;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtnombre;
        private System.Windows.Forms.TextBox txtarea;
        private System.Windows.Forms.TextBox txtcargo;
        private System.Windows.Forms.TextBox txtsueldo;
        private System.Windows.Forms.Button btnguardar;
        private System.Windows.Forms.Button btnactualizar;
        private System.Windows.Forms.Button btnconsultar;
        private System.Windows.Forms.Button btnlistar;
        private System.Windows.Forms.Button btneliminar;
        private System.Windows.Forms.DataGridView dtvempl;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem empleadosToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem nominaToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ingresoDatosToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem manejoEmpleadosToolStripMenuItem;
        private System.Windows.Forms.ComboBox cbmemp;
    }
}

