package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeViewContext$callback$1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ ComposeViewContext this$0;

    public ComposeViewContext$callback$1(ComposeViewContext composeViewContext) {
        this.this$0 = composeViewContext;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.this$0.onConfigurationChanged$ui(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @er
    public void onLowMemory() {
        this.this$0.getImageVectorCache$ui().clear();
        this.this$0.getResourceIdCache$ui().clear();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        this.this$0.getImageVectorCache$ui().clear();
        this.this$0.getResourceIdCache$ui().clear();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z) {
        this.this$0.getWindowInfo$ui().setWindowFocused(z);
    }
}
