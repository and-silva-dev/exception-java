package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber; // Numero do quarto
    private Date chekIn; // hora da chegada
    private Date chekOut; // hora da saída
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Construtores 
    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date chekIn, Date chekOut) {
        this.roomNumber = roomNumber;
        this.chekIn = chekIn;
        this.chekOut = chekOut;
    }
    //Metodos get e set

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getChekIn() {
        return chekIn;
    }

    public Date getChekOut() {
        return chekOut;
    }

    public long duration() {
        long diff = chekOut.getTime() - chekIn.getTime();//converte para dias 
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);// converte para dias
    }

    public void updateDates(Date checkIn, Date checkOut) {
        this.chekIn = checkIn;
        this.chekOut = checkOut;
    }

    @Override
    public String toString() {
        return "Romm "
                + roomNumber 
                + ", check-in "
                + sdf.format(chekIn)
                + ", check-out "
                + sdf.format(chekOut)
                + " , "
                + duration()
                + " nights";

    }

}
