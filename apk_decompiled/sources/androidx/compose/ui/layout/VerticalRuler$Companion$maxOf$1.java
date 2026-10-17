package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class VerticalRuler$Companion$maxOf$1 extends f30 implements my {
    final /* synthetic */ VerticalRuler[] $rulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalRuler$Companion$maxOf$1(VerticalRuler[] verticalRulerArr) {
        super(2);
        this.$rulers = verticalRulerArr;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Placeable.PlacementScope) obj, ((Number) obj2).floatValue());
    }

    public final Float invoke(Placeable.PlacementScope placementScope, float f) {
        float mergeRulerValues;
        mergeRulerValues = RulerKt.mergeRulerValues(placementScope, true, this.$rulers, f);
        return Float.valueOf(mergeRulerValues);
    }
}
