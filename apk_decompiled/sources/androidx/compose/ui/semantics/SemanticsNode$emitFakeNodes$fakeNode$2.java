package androidx.compose.ui.semantics;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsNode$emitFakeNodes$fakeNode$2 extends f30 implements ky {
    final /* synthetic */ String $contentDescription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsNode$emitFakeNodes$fakeNode$2(String str) {
        super(1);
        this.$contentDescription = str;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return w01.a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.$contentDescription);
    }
}
