package main.request;

import main.entity.Payment;

import java.util.Date;

public class ReservationRequest {
    private Integer id;
    private Date startDate;
    private Date endDate;
    private Integer amount;
    private Integer total_rooms;
//    private Payment payment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getTotal_rooms() {
        return total_rooms;
    }

    public void setTotal_rooms(Integer total_rooms) {
        this.total_rooms = total_rooms;
    }

//    public Payment getPayment() {
//        return payment;
//    }
//
//    public void setPayment(Payment payment) {
//        this.payment = payment;
//    }
}
