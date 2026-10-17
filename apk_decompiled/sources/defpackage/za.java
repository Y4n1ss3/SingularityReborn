package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class za implements oy {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public za(List list, SharedPreferences sharedPreferences, un unVar, Context context, MutableState mutableState) {
        this.d = 2;
        this.e = list;
        this.g = sharedPreferences;
        this.h = unVar;
        this.f = context;
        this.i = mutableState;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        Object obj5;
        long m1781getSurface0d7_KjU;
        int i4 = this.d;
        w01 w01Var = w01.a;
        Object obj6 = this.i;
        Object obj7 = this.h;
        List list = this.e;
        Object obj8 = this.g;
        switch (i4) {
            case 0:
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
                if (!composer.shouldExecute((i & 147) != 146, i & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    sa saVar = (sa) list.get(intValue);
                    composer.startReplaceGroup(-1631118002);
                    q90 q90Var = saVar.a;
                    kb.b(q90Var.b, q90Var.c, saVar.b, ComposableLambdaKt.rememberComposableLambda(-952503889, true, new la((SharedPreferences) obj8, q90Var, saVar, lazyItemScope, this.f, (ky) obj7, (ky) obj6), composer, 54), composer, 3072);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                LazyItemScope lazyItemScope2 = (LazyItemScope) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (composer2.changed(lazyItemScope2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= composer2.changed(intValue3) ? 32 : 16;
                }
                if (!composer2.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    kw0 kw0Var = (kw0) list.get(intValue3);
                    composer2.startReplaceGroup(-1678670842);
                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1020370566, true, new da((Drawable) kw0Var.f, (String) kw0Var.d, (un) obj8, (String) kw0Var.e, this.f, (MutableState) obj7, (MutableState) obj6), composer2, 54), composer2, 196614, 30);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                LazyItemScope lazyItemScope3 = (LazyItemScope) obj;
                int intValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (composer3.changed(lazyItemScope3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= composer3.changed(intValue5) ? 32 : 16;
                }
                if (!composer3.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    String str = (String) list.get(intValue5);
                    composer3.startReplaceGroup(-1284316130);
                    String e = hs.e(str);
                    Object rememberedValue = composer3.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        obj5 = null;
                        rememberedValue = uo.a(((SharedPreferences) obj8).getBoolean(e, false), null, 2, null, composer3);
                    } else {
                        obj5 = null;
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    boolean g0 = ds0.g0(str, "Auth / Account", false);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, obj5);
                    RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    if (g0) {
                        composer3.startReplaceGroup(1759699870);
                        m1781getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).m1749getErrorContainer0d7_KjU();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1759702743);
                        m1781getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).m1781getSurface0d7_KjU();
                        composer3.endReplaceGroup();
                    }
                    CardKt.Card(fillMaxWidth$default, m1056RoundedCornerShape0680j_4, cardDefaults.m1678cardColorsro_MJ88(m1781getSurface0d7_KjU, 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1773583870, true, new fs((SharedPreferences) obj8, e, (un) obj7, this.f, g0, str, mutableState, (MutableState) obj6), composer3, 54), composer3, 196614, 24);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ za(List list, Object obj, Context context, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = list;
        this.g = obj;
        this.f = context;
        this.h = obj2;
        this.i = obj3;
    }
}
