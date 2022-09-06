public class Skeleton extends Boss {

    private Skeleton numberarrows;

    public Skeleton getNumberarrows() {
        return numberarrows;
    }

    public void setNumberarrows(Skeleton numberarrows) {
        this.numberarrows = numberarrows;
    }
    public String info(){
        return super.info() +"numberofarrows"+ numberarrows.getNumberarrows();

        }

    }

