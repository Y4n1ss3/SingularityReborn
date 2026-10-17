package androidx.compose.ui.window;

import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1 extends f30 implements ky {
    final /* synthetic */ PopupLayout $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1(PopupLayout popupLayout) {
        super(1);
        this.$this_apply = popupLayout;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m7875invokeozmzZPI(((IntSize) obj).m7786unboximpl());
        return w01.a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m7875invokeozmzZPI(long j) {
        this.$this_apply.m7878setPopupContentSizefhxjrPA(IntSize.m7774boximpl(j));
        this.$this_apply.updatePosition();
    }
}
