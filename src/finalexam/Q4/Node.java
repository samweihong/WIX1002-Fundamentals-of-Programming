package finalexam.Q4;

class Node {
    private String nodeName;
    private int CPUTotal;
    private int CPUAlloc;
    private int realMemory;
    private int allocMem;
    private String partitions;

    public Node(String nodeName, int CPUTotal, int CPUAlloc, int realMemory, int allocMem, String partitions) {
        this.nodeName = nodeName;
        this.CPUTotal = CPUTotal;
        this.CPUAlloc = CPUAlloc;
        this.realMemory = realMemory;
        this.allocMem = allocMem;
        this.partitions = partitions;
    }

    public int getFreeCPU() {
        return CPUTotal - CPUAlloc;
    }

    public int getRealMemoryInGB() {
        return realMemory / 1000;
    }

    public int getFreeMemoryInGB() {
        return (realMemory - allocMem) / 1000;
    }

    public double getRatio() {
        return Math.abs((double) getFreeCPU() / CPUTotal - (double) getFreeMemoryInGB() / getRealMemoryInGB());
    }

    @Override
    public String toString() {
        return String.format("%-8s%-13s%3d / %-5d%3dG / %3dG%7.3f", nodeName, partitions, getFreeCPU(), CPUTotal, getFreeMemoryInGB(), getRealMemoryInGB(), getRatio());
    }
}
