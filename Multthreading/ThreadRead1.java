package Multthreading;

class ThreadRead1 extends Thread {
    private Data data;
    private String filename;

    public ThreadRead1(Data data, String filename) {
        this.data = data;
        this.filename = filename;
    }

    @Override
    public void run() {
        data.readdata(filename);
    }
}

class ThreadRead2 extends Thread {
    private Data data;
    private String filename;

    public ThreadRead2(Data data, String filename) {
        this.data = data;
        this.filename = filename;
    }

    @Override
    public void run() {
        data.readdata(filename);
    }
}
