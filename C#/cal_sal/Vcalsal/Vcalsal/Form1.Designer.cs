using System.Windows.Forms;

namespace Vcalsal
{
    partial class Form1
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
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.nombre = new System.Windows.Forms.TextBox();
            this.cedula = new System.Windows.Forms.TextBox();
            this.valhora = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.horas = new System.Windows.Forms.TextBox();
            this.calcular = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.sueldo = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(52, 48);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Nombre";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(52, 87);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(59, 20);
            this.label2.TabIndex = 0;
            this.label2.Text = "Cédula";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(52, 128);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(82, 20);
            this.label3.TabIndex = 0;
            this.label3.Text = "Valor hora";
            // 
            // nombre
            // 
            this.nombre.Location = new System.Drawing.Point(206, 48);
            this.nombre.Name = "nombre";
            this.nombre.Size = new System.Drawing.Size(100, 20);
            this.nombre.TabIndex = 1;
            // 
            // cedula
            // 
            this.cedula.Location = new System.Drawing.Point(206, 87);
            this.cedula.Name = "cedula";
            this.cedula.Size = new System.Drawing.Size(100, 20);
            this.cedula.TabIndex = 2;
            // 
            // valhora
            // 
            this.valhora.Location = new System.Drawing.Point(206, 128);
            this.valhora.Name = "valhora";
            this.valhora.Size = new System.Drawing.Size(100, 20);
            this.valhora.TabIndex = 3;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(52, 167);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(126, 20);
            this.label4.TabIndex = 4;
            this.label4.Text = "Horas laboradas";
            // 
            // horas
            // 
            this.horas.Location = new System.Drawing.Point(206, 167);
            this.horas.Name = "horas";
            this.horas.Size = new System.Drawing.Size(100, 20);
            this.horas.TabIndex = 5;
            // 
            // calcular
            // 
            this.calcular.FlatAppearance.BorderColor = System.Drawing.Color.Red;
            this.calcular.FlatAppearance.BorderSize = 8;
            this.calcular.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.calcular.Location = new System.Drawing.Point(133, 205);
            this.calcular.Name = "calcular";
            this.calcular.Size = new System.Drawing.Size(83, 32);
            this.calcular.TabIndex = 6;
            this.calcular.Text = "Calcular";
            this.calcular.UseVisualStyleBackColor = true;
            this.calcular.Click += new System.EventHandler(this.calcular_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(52, 248);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(59, 20);
            this.label5.TabIndex = 7;
            this.label5.Text = "Sueldo";
            // 
            // sueldo
            // 
            this.sueldo.AutoSize = true;
            this.sueldo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.sueldo.Location = new System.Drawing.Point(202, 248);
            this.sueldo.Name = "sueldo";
            this.sueldo.Size = new System.Drawing.Size(0, 20);
            this.sueldo.TabIndex = 8;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(349, 304);
            this.Controls.Add(this.sueldo);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.calcular);
            this.Controls.Add(this.horas);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.valhora);
            this.Controls.Add(this.cedula);
            this.Controls.Add(this.nombre);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label3);
            this.Name = "Form1";
            this.Text = "calcular salario";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox nombre;
        private TextBox cedula;
        private TextBox valhora;
        private Label label4;
        private TextBox horas;
        private Button calcular;
        private Label label5;
        private Label sueldo;
    }
}

