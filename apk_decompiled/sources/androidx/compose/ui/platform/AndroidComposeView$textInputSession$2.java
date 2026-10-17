package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.ky;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$textInputSession$2 extends f30 implements ky {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$2(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.ky
    public final AndroidPlatformTextInputSession invoke(un unVar) {
        AndroidComposeView androidComposeView = this.this$0;
        return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), unVar);
    }
}
