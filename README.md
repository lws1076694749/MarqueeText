# MarqueeText
带跑马灯效果的TextView，可同时在一个Activity中运用多个。
1. 自定义TextView，并重写父类的public boolean isFocused()方法，返回true，使其始终能够获得焦点。
2. 在布局文件中使用自定义的TextView控件，并设置如下属性：
        android:singleLine="true"
        android:focusable="true"
        android:focusableInTouchMode="true"
        android:ellipsize="marquee"
