package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ ky $onTouchEvent$inlined;
    final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, ky kyVar) {
        super(1);
        this.$requestDisallowInterceptTouchEvent$inlined = requestDisallowInterceptTouchEvent;
        this.$onTouchEvent$inlined = kyVar;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerInteropFilter");
        inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", this.$requestDisallowInterceptTouchEvent$inlined);
        inspectorInfo.getProperties().set("onTouchEvent", this.$onTouchEvent$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
