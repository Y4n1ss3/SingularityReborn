package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bb implements oy {
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ SnapshotStateMap e;
    public final /* synthetic */ un f;
    public final /* synthetic */ PackageManager g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ g80 i;
    public final /* synthetic */ ky j;
    public final /* synthetic */ MutableState k;

    public bb(ArrayList arrayList, SnapshotStateMap snapshotStateMap, un unVar, PackageManager packageManager, Context context, g80 g80Var, ky kyVar, MutableState mutableState) {
        this.d = arrayList;
        this.e = snapshotStateMap;
        this.f = unVar;
        this.g = packageManager;
        this.h = context;
        this.i = g80Var;
        this.j = kyVar;
        this.k = mutableState;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (composer.changed(lazyItemScope) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= composer.changed(intValue) ? 32 : 16;
        }
        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            b8 b8Var = (b8) this.d.get(intValue);
            composer.startReplaceGroup(-1848681385);
            e8 e8Var = (e8) this.e.get(b8Var.c);
            if (e8Var == null) {
                e8Var = new e8(28, "Ready", null);
            }
            boolean z = e8Var.b;
            boolean z2 = e8Var.c != null;
            boolean z3 = e8Var.d;
            kb.b(b8Var.a, b8Var.b, e8Var.a, ComposableLambdaKt.rememberComposableLambda(2060068266, true, new oa(z, z3, z2, b8Var, this.f, this.g, this.h, this.i, e8Var, this.j, this.e, this.k), composer, 54), composer, 3072);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }
}
