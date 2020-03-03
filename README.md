# RippleAnimation-master

Method:

      create(View onClickView)  创建动画对象(静态方法)
      setDuration(long duration)  设置动画时长
      setOnAnimationEndListener(Listener listener)    动画播放完毕监听器
      start()   开始播放动画
      
      
java

    public void onClick(View view) {

        RippleAnimation.create(view).setDuration(duration).start();

        //-------------------
        
    }
    
    
    
    
    
    
    
