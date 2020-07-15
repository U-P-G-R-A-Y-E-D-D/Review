package cz.osu;

public class Pc {
    private String cpu;
    private String gpu;
    private Hdd hdd;
    private Ssd ssd;

    public Pc() {
        this.hdd = new Hdd();
        this.ssd = new Ssd();
    }

    public int getTotalStorageCapacity(){
        return hdd.getCapacity() + ssd.getCapacity();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", hdd=" + hdd +
                ", ssd=" + ssd +
                ", total capacity = " + getTotalStorageCapacity() +
                '}';
    }
}
