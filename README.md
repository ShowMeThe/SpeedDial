### 大致效果如下gif  
<img src="https://github.com/ShowMeThe/SpeedDial/blob/master/gif/20191111.gif" height ="420" width = "200" alt = "演示效果" /><img src="https://github.com/ShowMeThe/SpeedDial/blob/master/gif/20191112.gif"  height ="420" width = "200" alt = "演示效果2" />  

#### 使用方法
Activity中配置</br>
```kotlin
        val expands = ArrayList<ExpandIcon>()
        expands.add(ExpandIcon().setIcon(icon).setBackgroundTint(color).setTextLabel("text"))
        ExpandManager.newBuilder()
        .setSlide(Builder.Slide.BOTTOM)//Builder.Slide.TOP
        .setExpandIcons(expands)
        .motion(color,MainFloatActionIcon)
        .bindTarget(target).build()

```
xml需要配置相应如下 </br>
```xml
  <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fab"
        android:layout_marginBottom="30dp"
        android:layout_marginEnd="30dp"
        android:layout_gravity="bottom|end"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:tint = "@color/white"
        app:srcCompat="@mipmap/baseline_home_white_24dp"
        app:fabSize="auto"
        android:tint="@color/white"
        android:tintMode="src_in"
        app:rippleColor="@color/colorAccent"
        app:backgroundTintMode="src_in"
        app:backgroundTint="@color/colorAccent"
        />

    <com.showmethe.speeddiallib.expand.ExpandMenuChildLayout
        android:id="@+id/crl"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_behavior="com.showmethe.speeddiallib.expand.ExpandBottomBehavior"
        app:layout_anchor="@id/fab"
        >
    </com.showmethe.speeddiallib.expand.ExpandMenuChildLayout>

```

#### 发布版本
```kotlin
 implementation 'com.github.ShowMeThe:SpeedDial:0.03'
```
#### 尚未完成如下：  (待开发)
1、尚未优化使用方法  
2、未添加非FloatActionButton的Beahavior  
<del>3、未添加右上角向下显示的功能 </del>  
<del>4、多个FloatActionButton适配 </del>  
<del>5、存在多次点击重复设置点击事件问题 </del>  



