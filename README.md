There is a high probability of crashing in the image loader.

```
Canvas: trying to use a recycled bitmap android.graphics.Bitmap
```

Condition

1. Painter (fadeIn = true) + Big size on modifier

```
E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.pluu.accompanistbug, PID: 15725
    java.lang.RuntimeException: Canvas: trying to use a recycled bitmap android.graphics.Bitmap@db57805
        at android.graphics.BaseCanvas.throwIfCannotDraw(BaseCanvas.java:66)
        at android.graphics.RecordingCanvas.throwIfCannotDraw(RecordingCanvas.java:277)
        at android.graphics.BaseRecordingCanvas.drawBitmap(BaseRecordingCanvas.java:88)
        at androidx.compose.ui.graphics.AndroidCanvas.drawImageRect-HPBpro0(AndroidCanvas.android.kt:275)
        at androidx.compose.ui.graphics.drawscope.CanvasDrawScope.drawImage-riqrfck(CanvasDrawScope.kt:227)
        at androidx.compose.ui.node.LayoutNodeDrawScope.drawImage-riqrfck(Unknown Source:44)
        at androidx.compose.ui.graphics.drawscope.DrawScope$DefaultImpls.drawImage-riqrfck$default(DrawScope.kt:459)
        at androidx.compose.ui.graphics.painter.BitmapPainter.onDraw(BitmapPainter.kt:55)
        at androidx.compose.ui.graphics.painter.Painter.draw-x_KDEd0(Painter.kt:212)
        at com.google.accompanist.imageloading.LoadPainter.onDraw(LoadPainter.kt:229)
        at androidx.compose.ui.graphics.painter.Painter.draw-x_KDEd0(Painter.kt:212)
        at androidx.compose.ui.draw.PainterModifier.draw(PainterModifier.kt:289)
        at androidx.compose.ui.node.ModifiedDrawNode.performDraw(ModifiedDrawNode.kt:102)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:209)
        at androidx.compose.ui.node.ModifiedLayoutNode.performDraw(ModifiedLayoutNode.kt:82)
        at androidx.compose.ui.node.LayoutNodeWrapper$invoke$1.invoke(LayoutNodeWrapper.kt:220)
        at androidx.compose.ui.node.LayoutNodeWrapper$invoke$1.invoke(LayoutNodeWrapper.kt:219)
        at androidx.compose.runtime.snapshots.Snapshot$Companion.observe(Snapshot.kt:1787)
        at androidx.compose.runtime.snapshots.SnapshotStateObserver.observeReads(SnapshotStateObserver.kt:116)
        at androidx.compose.ui.node.OwnerSnapshotObserver.observeReads$ui_release(OwnerSnapshotObserver.kt:75)
        at androidx.compose.ui.node.LayoutNodeWrapper.invoke(LayoutNodeWrapper.kt:219)
        at androidx.compose.ui.node.LayoutNodeWrapper.invoke(LayoutNodeWrapper.kt:51)
        at androidx.compose.ui.platform.RenderNodeApi29.record(RenderNodeApi29.android.kt:156)
        at androidx.compose.ui.platform.RenderNodeLayer.updateDisplayList(RenderNodeLayer.android.kt:221)
        at androidx.compose.ui.platform.AndroidComposeView.dispatchDraw(AndroidComposeView.android.kt:663)
        at android.view.View.draw(View.java:22353)
        at android.view.View.updateDisplayListIfDirty(View.java:21226)
        at android.view.ViewGroup.recreateChildDisplayList(ViewGroup.java:4500)
        at android.view.ViewGroup.dispatchGetDisplayList(ViewGroup.java:4473)
        at android.view.View.updateDisplayListIfDirty(View.java:21186)
        at android.view.ViewGroup.recreateChildDisplayList(ViewGroup.java:4500)
        at android.view.ViewGroup.dispatchGetDisplayList(ViewGroup.java:4473)
        at android.view.View.updateDisplayListIfDirty(View.java:21186)
        at android.view.View.draw(View.java:22081)
        at android.view.ViewGroup.drawChild(ViewGroup.java:4516)
        at android.view.ViewGroup.dispatchDraw(ViewGroup.java:4277)
        at android.view.View.draw(View.java:22353)
        at androidx.compose.ui.platform.AndroidViewsHandler.drawView(AndroidViewsHandler.android.kt:67)
        at androidx.compose.ui.platform.AndroidComposeView.drawAndroidView(AndroidComposeView.android.kt:479)
        at androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1.invoke(AndroidViewHolder.android.kt:196)
        at androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1.invoke(AndroidViewHolder.android.kt:193)
        at androidx.compose.ui.draw.DrawBackgroundModifier.draw(DrawModifier.kt:100)
        at androidx.compose.ui.node.ModifiedDrawNode.performDraw(ModifiedDrawNode.kt:102)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:209)
        at androidx.compose.ui.node.DelegatingLayoutNodeWrapper.performDraw(DelegatingLayoutNodeWrapper.kt:70)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:209)
E/AndroidRuntime:     at androidx.compose.ui.node.DelegatingLayoutNodeWrapper.performDraw(DelegatingLayoutNodeWrapper.kt:70)
        at androidx.compose.ui.node.LayoutNodeWrapper$invoke$1.invoke(LayoutNodeWrapper.kt:220)
        at androidx.compose.ui.node.LayoutNodeWrapper$invoke$1.invoke(LayoutNodeWrapper.kt:219)
        at androidx.compose.runtime.snapshots.Snapshot$Companion.observe(Snapshot.kt:1787)
        at androidx.compose.runtime.snapshots.SnapshotStateObserver.observeReads(SnapshotStateObserver.kt:116)
        at androidx.compose.ui.node.OwnerSnapshotObserver.observeReads$ui_release(OwnerSnapshotObserver.kt:75)
        at androidx.compose.ui.node.LayoutNodeWrapper.invoke(LayoutNodeWrapper.kt:219)
        at androidx.compose.ui.node.LayoutNodeWrapper.invoke(LayoutNodeWrapper.kt:51)
        at androidx.compose.ui.platform.RenderNodeApi29.record(RenderNodeApi29.android.kt:156)
        at androidx.compose.ui.platform.RenderNodeLayer.updateDisplayList(RenderNodeLayer.android.kt:221)
        at androidx.compose.ui.platform.RenderNodeLayer.drawLayer(RenderNodeLayer.android.kt:202)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:204)
        at androidx.compose.ui.node.LayoutNode.draw$ui_release(LayoutNode.kt:794)
        at androidx.compose.ui.node.InnerPlaceable.performDraw(InnerPlaceable.kt:119)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:209)
        at androidx.compose.ui.node.DelegatingLayoutNodeWrapper.performDraw(DelegatingLayoutNodeWrapper.kt:70)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:209)
        at androidx.compose.ui.node.DelegatingLayoutNodeWrapper.performDraw(DelegatingLayoutNodeWrapper.kt:70)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:209)
        at androidx.compose.ui.node.DelegatingLayoutNodeWrapper.performDraw(DelegatingLayoutNodeWrapper.kt:70)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:209)
        at androidx.compose.ui.node.DelegatingLayoutNodeWrapper.performDraw(DelegatingLayoutNodeWrapper.kt:70)
        at androidx.compose.ui.node.LayoutNodeWrapper.draw(LayoutNodeWrapper.kt:209)
        at androidx.compose.ui.node.LayoutNode.draw$ui_release(LayoutNode.kt:794)
        at androidx.compose.ui.platform.AndroidComposeView.dispatchDraw(AndroidComposeView.android.kt:658)
        at android.view.View.draw(View.java:22353)
        at android.view.View.updateDisplayListIfDirty(View.java:21226)
        at android.view.ViewGroup.recreateChildDisplayList(ViewGroup.java:4500)
        at android.view.ViewGroup.dispatchGetDisplayList(ViewGroup.java:4473)
        at android.view.View.updateDisplayListIfDirty(View.java:21186)
        at android.view.ViewGroup.recreateChildDisplayList(ViewGroup.java:4500)
        at android.view.ViewGroup.dispatchGetDisplayList(ViewGroup.java:4473)
        at android.view.View.updateDisplayListIfDirty(View.java:21186)
        at android.view.ViewGroup.recreateChildDisplayList(ViewGroup.java:4500)
        at android.view.ViewGroup.dispatchGetDisplayList(ViewGroup.java:4473)
        at android.view.View.updateDisplayListIfDirty(View.java:21186)
        at android.view.ViewGroup.recreateChildDisplayList(ViewGroup.java:4500)
        at android.view.ViewGroup.dispatchGetDisplayList(ViewGroup.java:4473)
        at android.view.View.updateDisplayListIfDirty(View.java:21186)
        at android.view.ThreadedRenderer.updateViewTreeDisplayList(ThreadedRenderer.java:559)
        at android.view.ThreadedRenderer.updateRootDisplayList(ThreadedRenderer.java:565)
        at android.view.ThreadedRenderer.draw(ThreadedRenderer.java:642)
        at android.view.ViewRootImpl.draw(ViewRootImpl.java:4106)
        at android.view.ViewRootImpl.performDraw(ViewRootImpl.java:3833)
        at android.view.ViewRootImpl.performTraversals(ViewRootImpl.java:3104)
        at android.view.ViewRootImpl.doTraversal(ViewRootImpl.java:1948)
        at android.view.ViewRootImpl$TraversalRunnable.run(ViewRootImpl.java:8177)
        at android.view.Choreographer$CallbackRecord.run(Choreographer.java:972)
        at android.view.Choreographer.doCallbacks(Choreographer.java:796)
        at android.view.Choreographer.doFrame(Choreographer.java:731)
E/AndroidRuntime:     at android.view.Choreographer$FrameDisplayEventReceiver.run(Choreographer.java:957)
        at android.os.Handler.handleCallback(Handler.java:938)
        at android.os.Handler.dispatchMessage(Handler.java:99)
        at android.os.Looper.loop(Looper.java:223)
        at android.app.ActivityThread.main(ActivityThread.java:7660)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:592)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:947)
I/Process: Sending signal. PID: 15725 SIG: 9
```

