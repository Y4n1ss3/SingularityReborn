package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SyncKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class r5 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ r5(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DropdownMenu_IlH_yew$lambda$3$lambda$2;
        w01 ExposedDropdownMenu_vNxi1II$lambda$6$lambda$5;
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.e;
        switch (i) {
            case 0:
                DropdownMenu_IlH_yew$lambda$3$lambda$2 = AndroidMenu_androidKt.DropdownMenu_IlH_yew$lambda$3$lambda$2(mutableState, (IntRect) obj, (IntRect) obj2);
                return DropdownMenu_IlH_yew$lambda$3$lambda$2;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(787419503, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous> (AppsActivity.kt:655)");
                    }
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new j3(mutableState, 3);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    ButtonKt.TextButton((iy) rememberedValue, null, false, null, null, null, null, null, null, wk.b, composer, 805306374, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    return w01Var;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1332619250, intValue2, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous> (AppsActivity.kt:615)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f)), companion2.getCenterHorizontally(), composer2, 54);
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
                uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier clip = ClipKt.clip(SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(72.0f)), RoundedCornerShapeKt.getCircleShape());
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i2 = MaterialTheme.$stable;
                Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(clip, materialTheme.getColorScheme(composer2, i2).m1792getTertiaryContainer0d7_KjU(), null, 2, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m227backgroundbw27NRU$default);
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
                uo.h(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                IconKt.m2055Iconww6aTOc(SyncKt.getSync(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(36.0f)), materialTheme.getColorScheme(composer2, i2).m1767getOnTertiaryContainer0d7_KjU(), composer2, 432, 0);
                composer2.endNode();
                TextStyle titleLarge = materialTheme.getTypography(composer2, i2).getTitleLarge();
                FontWeight semiBold = FontWeight.Companion.getSemiBold();
                TextAlign.Companion companion4 = TextAlign.Companion;
                TextKt.m2607TextNvy7gAk("Restart Required", null, 0L, null, 0L, null, semiBold, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, titleLarge, composer2, 1572870, 0, 129982);
                TextKt.m2607TextNvy7gAk((String) ((xe0) mutableState.getValue()).d, null, materialTheme.getColorScheme(composer2, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i2).getBodyMedium(), composer2, 0, 0, 130042);
                composer2.endNode();
                if (!ComposerKt.isTraceInProgress()) {
                    return w01Var;
                }
                ComposerKt.traceEventEnd();
                return w01Var;
            default:
                ExposedDropdownMenu_vNxi1II$lambda$6$lambda$5 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$6$lambda$5(mutableState, (IntRect) obj, (IntRect) obj2);
                return ExposedDropdownMenu_vNxi1II$lambda$6$lambda$5;
        }
    }
}
