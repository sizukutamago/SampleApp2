package com.sample.sample;

public class MyBeanKeeper {
    private MyBean bean;
    private String from;
    private String to;

    public MyBeanKeeper(MyBean myBean, String from, String to) {
        super();
        bean = myBean;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "MyBeanKeeper{" +
                "bean=" + bean +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    public MyBean getBean() {
        return bean;
    }

    public void setBean(MyBean bean) {
        this.bean = bean;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
