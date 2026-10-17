package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.semantics.SemanticsNode;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidContentCaptureManager$sendContentCaptureAppearEvents$1 extends f30 implements my {
    final /* synthetic */ SemanticsNodeCopy $oldNode;
    final /* synthetic */ AndroidContentCaptureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$sendContentCaptureAppearEvents$1(SemanticsNodeCopy semanticsNodeCopy, AndroidContentCaptureManager androidContentCaptureManager) {
        super(2);
        this.$oldNode = semanticsNodeCopy;
        this.this$0 = androidContentCaptureManager;
    }

    public final void invoke(int i, SemanticsNode semanticsNode) {
        if (this.$oldNode.getChildren().a(semanticsNode.getId())) {
            return;
        }
        this.this$0.updateBuffersOnAppeared(i, semanticsNode);
        this.this$0.notifySubtreeStateChangeIfNeeded();
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (SemanticsNode) obj2);
        return w01.a;
    }
}
