package androidx.compose.animation;

import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.f30;
import defpackage.iy;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScope$skipToLookaheadPosition$4 extends f30 implements ny {
    final /* synthetic */ iy $enabled;
    final /* synthetic */ SharedTransitionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$skipToLookaheadPosition$4(iy iyVar, SharedTransitionScope sharedTransitionScope) {
        super(3);
        this.$enabled = iyVar;
        this.this$0 = sharedTransitionScope;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m91invoke3p2s80s((ApproachMeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m7570unboximpl());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m91invoke3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(approachMeasureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new SharedTransitionScope$skipToLookaheadPosition$4$1$1(this.$enabled, mo6234measureBRTryo0, this.this$0), 4, null);
    }
}
