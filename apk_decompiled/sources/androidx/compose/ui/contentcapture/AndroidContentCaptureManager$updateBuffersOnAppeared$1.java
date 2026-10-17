package androidx.compose.ui.contentcapture;

import androidx.compose.ui.semantics.SemanticsNode;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidContentCaptureManager$updateBuffersOnAppeared$1 extends f30 implements my {
    final /* synthetic */ AndroidContentCaptureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$updateBuffersOnAppeared$1(AndroidContentCaptureManager androidContentCaptureManager) {
        super(2);
        this.this$0 = androidContentCaptureManager;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (SemanticsNode) obj2);
        return w01.a;
    }

    public final void invoke(int i, SemanticsNode semanticsNode) {
        this.this$0.updateBuffersOnAppeared(i, semanticsNode);
    }
}
