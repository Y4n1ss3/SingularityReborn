package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import defpackage.iy;
import defpackage.w01;
import defpackage.xe0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextMeasurePolicy implements MeasurePolicy {
    private final iy placements;
    private final iy shouldMeasureLinks;

    public TextMeasurePolicy(iy iyVar, iy iyVar2) {
        this.shouldMeasureLinks = iyVar;
        this.placements = iyVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$3(List list, List list2, Placeable.PlacementScope placementScope) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                xe0 xe0Var = (xe0) list.get(i);
                Placeable.PlacementScope.m6303place70tqf50$default(placementScope, (Placeable) xe0Var.d, ((IntOffset) xe0Var.e).m7748unboximpl(), 0.0f, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xe0 xe0Var2 = (xe0) list2.get(i2);
                Placeable placeable = (Placeable) xe0Var2.d;
                iy iyVar = (iy) xe0Var2.e;
                Placeable.PlacementScope.m6303place70tqf50$default(placementScope, placeable, iyVar != null ? ((IntOffset) iyVar.invoke()).m7748unboximpl() : IntOffset.Companion.m7750getZeronOccac(), 0.0f, 2, null);
            }
        }
        return w01.a;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo5measure3p2s80s(androidx.compose.ui.layout.MeasureScope r20, java.util.List<? extends androidx.compose.ui.layout.Measurable> r21, long r22) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextMeasurePolicy.mo5measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }
}
