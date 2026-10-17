package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends f30 implements ny {
    final /* synthetic */ OnLookaheadMeasured $onLookaheadMeasured;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(OnLookaheadMeasured onLookaheadMeasured) {
        super(3);
        this.$onLookaheadMeasured = onLookaheadMeasured;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m35invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m7570unboximpl());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m35invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        OnLookaheadMeasured onLookaheadMeasured = this.$onLookaheadMeasured;
        if (measureScope.isLookingAhead()) {
            onLookaheadMeasured.m76invokeozmzZPI(IntSize.m7777constructorimpl((mo6234measureBRTryo0.getHeight() & 4294967295L) | (mo6234measureBRTryo0.getWidth() << 32)));
        }
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1(mo6234measureBRTryo0), 4, null);
    }
}
