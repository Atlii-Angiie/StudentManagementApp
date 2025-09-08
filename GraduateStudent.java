
package studentmanagement;


public class GraduateStudent extends Student {
  


    private String thesisTitle;

    public GraduateStudent(String id, String name, String thesisTitle) {
        super(id, name);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() { return thesisTitle; }
    public void setThesisTitle(String thesisTitle) { this.thesisTitle = thesisTitle; }

    @Override
    public String toString() {
        return super.toString() + "Thesis Title: " + thesisTitle + "\n------------------------";
    }
}


