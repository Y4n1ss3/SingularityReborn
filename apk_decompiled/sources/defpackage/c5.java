package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AndroidComposeView e;

    public /* synthetic */ c5(AndroidComposeView androidComposeView, int i) {
        this.d = i;
        this.e = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        AndroidComposeView androidComposeView = this.e;
        switch (i) {
            case 0:
                AndroidComposeView.outOfFrameRunnable$lambda$0(androidComposeView);
                break;
            case 1:
                AndroidComposeView.sendHoverExitEvent$lambda$0(androidComposeView);
                break;
            case 2:
                androidComposeView.invalidateDescendants();
                break;
            default:
                androidComposeView.invalidateDescendants();
                break;
        }
    }
}
