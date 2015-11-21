package com.petcoccolati.controllers;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

import com.petcoccolati.dto.PersonaDTO;
import com.petcoccolati.ngc.SignUpNGC;
import com.petcoccolati.util.ExceptionPet;

public class SigUpCtl extends GenericForwardComposer {

	private Intbox txtId;
	private Textbox txtFirst;
	private Textbox txtLast;
	private Intbox txtPhone;
	private Textbox txtEmail;
	private Textbox txtPassword;
	private Button btnCreate;
	private Button btnSignin;

	private SignUpNGC signupNgc;

	public SigUpCtl() {
		signupNgc = SignUpNGC.getIntance();
	}

	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}

	public void onCreate() {

	}

	public void onClick$btnCreate(Event e) {
			PersonaDTO persona = new PersonaDTO();
			persona.setId(txtId.getText());
			persona.setFirst(txtFirst.getText());
			persona.setLast(txtLast.getText());
			persona.setPhone(txtPhone.getText());
			persona.setEmail(txtEmail.getText());
			persona.setPassword(txtPassword.getText());

			try {
				signupNgc.createPersona(persona);
			} catch (ExceptionPet e2) {
				Messagebox.show(e2.getMensajeUsuario());
				System.out.println(e2.getMensajeTecnico());
			}
	}

	public void onClick$btnSignin(Event e) {
		Executions.sendRedirect("login.zul");
	}
}
