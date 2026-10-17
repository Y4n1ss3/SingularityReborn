package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.ky;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends f30 implements ny {
    final /* synthetic */ ky $onTouchEvent;
    final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(ky kyVar, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        super(3);
        this.$onTouchEvent = kyVar;
        this.$requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(374375707);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(374375707, i, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PointerInteropFilter();
            composer.updateRememberedValue(rememberedValue);
        }
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) rememberedValue;
        pointerInteropFilter.setOnTouchEvent(this.$onTouchEvent);
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(this.$requestDisallowInterceptTouchEvent);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pointerInteropFilter;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
