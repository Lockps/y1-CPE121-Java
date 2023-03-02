public class qb501 {
    public static class TV {
        private int channel;
        private int volumelevel;
        private boolean on = false;

        public TV() {
            channel = 1;
            volumelevel = 1;
            on = true;
        }

        public TV(int Ch, int Vol) {
            this.channel = Ch;
            this.volumelevel = Vol;
        }

        public void turnon() {
            on = true;
        }

        public void turnoff() {
            on = false;
        }

        public void setChannel(int newChannel) {
            if (on && newChannel >= 1 && newChannel <= 30)
                channel = newChannel;
        }

        public void channelup() {
            if (on && channel < 30)
                channel++;
        }

        public void channeldown() {
            if (on && channel > 1)
                channel--;
        }

        public void setVolume(int newVolumelevel) {
            if (on && volumelevel <= 15 && volumelevel >= 1)
                volumelevel = newVolumelevel;
        }

        public void volumeup() {
            if (on && volumelevel < 15)
                volumelevel++;
        }

        public void volumedown() {
            if (on && volumelevel >= 1)
                volumelevel--;
        }

        public int getChannel() {
            return channel;
        }

        public int getVolume() {
            return volumelevel;
        }

        public void tostring() {
            System.out.println("now TV channel is " + channel + " and volume level is " + volumelevel);
        }
    }

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnon();
        tv1.tostring();

        TV tv2 = new TV(30, 3);
        tv2.turnon();
        tv2.tostring();

        TV tv3 = new TV(30, 1);
        tv3.turnon();
        tv3.channelup();
        tv3.volumedown();
        tv3.volumedown();
        tv3.tostring();
    }
}
