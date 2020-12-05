package ass4.que9;

class TrafficLightSignal {
enum TrafficLightEnum {
        RED(10),
        GREEN(20),
        YELLOW(30);
        private int duration;

        TrafficLightEnum(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }
    }

    public static class TrafficLight {
        public static void main(String[] args) {
            TrafficLightEnum[] tl = TrafficLightEnum.values();
            for (TrafficLightEnum TL : tl) {
                System.out.println("TrafficLight Color : " + TL.name());
                System.out.println("TrafficLight Duration :" + TL.getDuration());
            }

        }

    }
}