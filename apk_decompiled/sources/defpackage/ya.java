package defpackage;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ya implements oy {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ ky f;

    public /* synthetic */ ya(int i, ky kyVar, List list) {
        this.d = i;
        this.e = list;
        this.f = kyVar;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.d;
        w01 w01Var = w01.a;
        List list = this.e;
        ky kyVar = this.f;
        switch (i3) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    composer.startReplaceGroup(1699632098);
                    q90 q90Var = saVar.a;
                    kb.b(q90Var.b, q90Var.c, saVar.b, ComposableLambdaKt.rememberComposableLambda(2004054279, true, new ha(kyVar, q90Var, saVar), composer, 54), composer, 3072);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
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
                    composer2.startReplaceGroup(-1441398387);
                    Drawable drawable = (Drawable) kw0Var.d;
                    String str = (String) kw0Var.e;
                    String str2 = (String) kw0Var.f;
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    boolean changed = composer2.changed(kyVar) | composer2.changed(str2);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ga(kyVar, str2, 1);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(ClickableKt.m262clickableoSLSa3U$default(fillMaxWidth$default, false, null, null, null, (iy) rememberedValue, 15, null), 0.0f, Dp.m7611constructorimpl(10.0f), 1, null);
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m764paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                    uo.h(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    kb.k(drawable, str, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(32.0f)), composer2, 384);
                    SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion, Dp.m7611constructorimpl(14.0f)), composer2, 6);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                    iy constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer2);
                    uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyMedium(), composer2, 1572864, 0, 131006);
                    TextKt.m2607TextNvy7gAk(str2, null, materialTheme.getColorScheme(composer2, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodySmall(), composer2, 0, 0, 131066);
                    composer2.endNode();
                    composer2.endNode();
                    DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer2, 0, 7);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }
}
