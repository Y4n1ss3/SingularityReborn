package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoxKt$EmptyBoxMeasurePolicy$1 implements MeasurePolicy {
    public static final BoxKt$EmptyBoxMeasurePolicy$1 INSTANCE = new BoxKt$EmptyBoxMeasurePolicy$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m7566getMinWidthimpl(j), Constraints.m7565getMinHeightimpl(j), null, new b(0), 4, null);
    }
}
