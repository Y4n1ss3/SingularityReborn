package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a9 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a9(int i, Object obj, boolean z, Object obj2) {
        this.d = i;
        this.e = z;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureResult exposedDropdownSize$lambda$3;
        int i = this.d;
        w01 w01Var = w01.a;
        boolean z = this.e;
        int i2 = 1;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                un unVar = (un) obj5;
                Context context = (Context) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1275585333, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:805)");
                    }
                    kb.a("Android Settings", "Launches the Android settings app", ComposableLambdaKt.rememberComposableLambda(1812342041, true, new f3(i2, unVar, z, context), composer, 54), composer, 438);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 1:
                exposedDropdownSize$lambda$3 = ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.exposedDropdownSize$lambda$3(this.e, (MutableIntState) obj5, (MutableIntState) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return exposedDropdownSize$lambda$3;
            default:
                ImageVector imageVector = (ImageVector) obj5;
                String str = (String) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1701489635, intValue2, -1, "com.lumi.singularity.ui.activities.ActionCard.<anonymous> (MainActivity.kt:2088)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxWidth$default = z ? SizeKt.fillMaxWidth$default(PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(14.0f)), 0.0f, 1, null) : PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(14.0f));
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(z ? Arrangement.INSTANCE.m648spacedByD5KLDUw(Dp.m7611constructorimpl(8.0f), companion2.getCenterHorizontally()) : Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion2.getCenterVertically(), composer2, 48);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                    Modifier m807size3ABfNKs = SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(20.0f));
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    IconKt.m2055Iconww6aTOc(imageVector, (String) null, m807size3ABfNKs, materialTheme.getColorScheme(composer2, i3).m1765getOnSurfaceVariant0d7_KjU(), composer2, 432, 0);
                    TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodyMedium(), composer2, 1572864, 0, 131006);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
        }
    }
}
