package stringbasic;

public class UniStudent {
    private Person person;
    private String neptun;
    private String OMId;
    private String cardNumber;

    public UniStudent(Person student, String neptun, String OMId) {
        this.student = student;
        this.neptun = neptun;
        this.OMId = OMId;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getOMId() {
        return OMId;
    }

    public void setOMId(String OMId) {
        this.OMId = OMId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student=" + student +
                ", neptun='" + neptun + '\'' +
                ", OMId='" + OMId + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
