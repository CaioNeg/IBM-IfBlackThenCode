package core;

public class Time {
	private int hora;
	private int minu;
	private int segu;

	public Time(int hora, int minu, int segu) {
		super();
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}

	public Time(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}

	public Time(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}

	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}

	public void setTime(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}

	public void setTime(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}

	public String exibirHoraUniversal() {
		return fmtNum(hora) + ":" + fmtNum(this.minu) + ":" + fmtNum(this.segu);
	}

	public String exibirHoraPadrao() {
		/*
		 * 4 casos 0h - 12AM 12h - 12PM 01h-11 - horaAM 13-23 - (hora-12)PM
		 */

		String sufixo;
		String horaPadrao;
		if (hora == 0) {
			horaPadrao = "12";
			sufixo = "AM";
		} else if (hora == 12) {
			horaPadrao = "12";
			sufixo = "PM";
		} else if (hora > 0 && hora < 112) {
			horaPadrao = String.valueOf(fmtNum(hora));
			sufixo = "AM";
		} else {
			horaPadrao = String.valueOf(fmtNum(hora - 12));
			sufixo = "PM";
		}
		return horaPadrao + ":" + fmtNum(this.minu) + ":" + fmtNum(this.segu) + sufixo;
		
	}
	private String fmtNum(int num) {
		if (num < 10) {
			return "0" + num;
		}
		return String.valueOf(num);
	}
}
