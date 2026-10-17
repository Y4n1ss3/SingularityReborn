package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchKt;
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
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class fs implements ny {
    public final /* synthetic */ SharedPreferences d;
    public final /* synthetic */ String e;
    public final /* synthetic */ un f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;

    public fs(SharedPreferences sharedPreferences, String str, un unVar, Context context, boolean z, String str2, MutableState mutableState, MutableState mutableState2) {
        this.d = sharedPreferences;
        this.e = str;
        this.f = unVar;
        this.g = context;
        this.h = z;
        this.i = str2;
        this.j = mutableState;
        this.k = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long m1764getOnSurface0d7_KjU;
        long m1765getOnSurfaceVariant0d7_KjU;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ColumnScope) obj).getClass();
        if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1773583870, intValue, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DomainBlockerActivity.kt:215)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m763paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
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
            uo.h(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, weight$default);
            iy constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer);
            uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i = MaterialTheme.$stable;
            TextStyle bodyLarge = materialTheme.getTypography(composer, i).getBodyLarge();
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight medium = companion4.getMedium();
            boolean z = this.h;
            if (z) {
                composer.startReplaceGroup(1313329868);
                m1764getOnSurface0d7_KjU = materialTheme.getColorScheme(composer, i).m1755getOnErrorContainer0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1313332805);
                m1764getOnSurface0d7_KjU = materialTheme.getColorScheme(composer, i).m1764getOnSurface0d7_KjU();
                composer.endReplaceGroup();
            }
            String str = this.i;
            TextKt.m2607TextNvy7gAk(str, null, m1764getOnSurface0d7_KjU, null, 0L, null, medium, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyLarge, composer, 1572864, 0, 131002);
            List list = (List) hs.a.get(str);
            String i2 = j50.i(list != null ? list.size() : 0, "Blocks ", " domains");
            TextStyle bodyMedium = materialTheme.getTypography(composer, i).getBodyMedium();
            if (z) {
                composer.startReplaceGroup(1313344652);
                m1765getOnSurfaceVariant0d7_KjU = materialTheme.getColorScheme(composer, i).m1755getOnErrorContainer0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1313347596);
                m1765getOnSurfaceVariant0d7_KjU = materialTheme.getColorScheme(composer, i).m1765getOnSurfaceVariant0d7_KjU();
                composer.endReplaceGroup();
            }
            TextKt.m2607TextNvy7gAk(i2, null, m1765getOnSurfaceVariant0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer, 0, 0, 131066);
            Composer composer2 = composer;
            if (z) {
                composer2.startReplaceGroup(2059181352);
                TextKt.m2607TextNvy7gAk("HIGH RISK: Can break login and store access.", null, materialTheme.getColorScheme(composer2, i).m1748getError0d7_KjU(), null, 0L, null, companion4.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i).getLabelMedium(), composer2, 1572870, 0, 131002);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(2047543270);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            MutableState mutableState = this.j;
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            SharedPreferences sharedPreferences = this.d;
            boolean changedInstance = composer2.changedInstance(sharedPreferences);
            String str2 = this.e;
            boolean changed = changedInstance | composer2.changed(str2);
            un unVar = this.f;
            boolean changedInstance2 = changed | composer2.changedInstance(unVar);
            Context context = this.g;
            boolean changedInstance3 = changedInstance2 | composer2.changedInstance(context);
            Object rememberedValue = composer2.rememberedValue();
            if (changedInstance3 || rememberedValue == Composer.Companion.getEmpty()) {
                es esVar = new es(sharedPreferences, str2, unVar, mutableState, this.k, context);
                composer2.updateRememberedValue(esVar);
                rememberedValue = esVar;
            }
            SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, false, null, null, composer2, 0, 124);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }
}
