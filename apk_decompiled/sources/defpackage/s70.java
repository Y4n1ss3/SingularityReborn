package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class s70 implements ny {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s70(ku kuVar, boolean z, boolean z2) {
        this.g = kuVar;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long m1765getOnSurfaceVariant0d7_KjU;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.g;
        boolean z = this.f;
        boolean z2 = this.e;
        switch (i) {
            case 0:
                ku kuVar = (ku) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1371980809, intValue, -1, "com.lumi.singularity.ui.activities.PayloadSelectorDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:2286)");
                    }
                    Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(6.0f));
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer, 48);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m763paddingVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
                    uo.h(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String name = kuVar.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = name.toLowerCase(locale);
                    lowerCase.getClass();
                    if (lowerCase.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf = String.valueOf(lowerCase.charAt(0));
                        valueOf.getClass();
                        String upperCase = valueOf.toUpperCase(locale);
                        upperCase.getClass();
                        sb.append((Object) upperCase);
                        sb.append(lowerCase.substring(1));
                        lowerCase = sb.toString();
                    }
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme.getTypography(composer, i2).getBodyMedium();
                    FontWeight bold = z2 ? FontWeight.Companion.getBold() : FontWeight.Companion.getMedium();
                    if (z) {
                        composer.startReplaceGroup(-1559879807);
                        m1765getOnSurfaceVariant0d7_KjU = materialTheme.getColorScheme(composer, i2).m1764getOnSurface0d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1559877080);
                        m1765getOnSurfaceVariant0d7_KjU = materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU();
                        composer.endReplaceGroup();
                    }
                    TextKt.m2607TextNvy7gAk(lowerCase, null, m1765getOnSurfaceVariant0d7_KjU, null, 0L, null, bold, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer, 0, 0, 131002);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                MutableState mutableState = (MutableState) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1663729606, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2612)");
                    }
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer2.startReplaceGroup(246174814);
                        ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(SizeKt.m807size3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(24.0f)), 0L, Dp.m7611constructorimpl(2.0f), 0L, 0, 0.0f, composer2, 390, 58);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(246369463);
                        TextKt.m2607TextNvy7gAk(z2 ? "Update" : z ? "Reinstall" : "Download", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ s70(boolean z, boolean z2, MutableState mutableState) {
        this.e = z;
        this.f = z2;
        this.g = mutableState;
    }
}
