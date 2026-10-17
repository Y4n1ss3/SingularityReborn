package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AppsKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.CodeKt;
import androidx.compose.material.icons.filled.LayersKt;
import androidx.compose.material.icons.filled.SyncKt;
import androidx.compose.material.icons.filled.TuneKt;
import androidx.compose.material.icons.filled.VideogameAssetKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import com.lumi.singularity.ui.activities.MainActivity;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class e80 {
    public static final String A(Context context, Uri uri) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex("_display_name");
                    String string = (columnIndex < 0 || !query.moveToFirst()) ? null : query.getString(columnIndex);
                    query.close();
                    return string;
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ImageVector imageVector, String str, String str2, Modifier modifier, boolean z, iy iyVar, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        iy iyVar2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1869476501);
        int i4 = 2;
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
            if ((196608 & i) != 0) {
                iyVar2 = iyVar;
                i3 |= startRestartGroup.changedInstance(iyVar2) ? Fields.RenderEffect : 65536;
            } else {
                iyVar2 = iyVar;
            }
            if (startRestartGroup.shouldExecute((74771 & i3) == 74770, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    z2 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1869476501, i3, -1, "com.lumi.singularity.ui.activities.ActionCard (MainActivity.kt:2083)");
                }
                CardKt.Card(ClickableKt.m262clickableoSLSa3U$default(modifier, false, null, null, null, iyVar2, 15, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1701489635, true, new a9(i4, imageVector, z2, str), startRestartGroup, 54), startRestartGroup, 196608, 28);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            boolean z3 = z2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new vh(imageVector, str, str2, modifier, z3, iyVar, i, i2));
                return;
            }
            return;
        }
        z2 = z;
        if ((196608 & i) != 0) {
        }
        if (startRestartGroup.shouldExecute((74771 & i3) == 74770, i3 & 1)) {
        }
        boolean z32 = z2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void b(final ky kyVar, final ku kuVar, final ky kyVar2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final ie ieVar, final String str, final boolean z8, final ky kyVar3, final ky kyVar4, final ky kyVar5, final ky kyVar6, final ky kyVar7, final ky kyVar8, final ky kyVar9, final ky kyVar10, final iy iyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        ky kyVar11;
        int i5;
        boolean z9;
        int i6;
        Composer composer2;
        kyVar.getClass();
        kuVar.getClass();
        kyVar2.getClass();
        ieVar.getClass();
        kyVar3.getClass();
        kyVar4.getClass();
        kyVar5.getClass();
        kyVar6.getClass();
        kyVar7.getClass();
        kyVar8.getClass();
        kyVar9.getClass();
        kyVar10.getClass();
        iyVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-392816135);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(kyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(kuVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            kyVar11 = kyVar2;
            i4 |= startRestartGroup.changedInstance(kyVar11) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            kyVar11 = kyVar2;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        int i7 = i & 1572864;
        int i8 = Fields.BlendMode;
        if (i7 == 0) {
            i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
        }
        int i9 = i & 100663296;
        int i10 = GroupFlagsKt.HasAuxSlotFlag;
        if (i9 == 0) {
            i4 |= startRestartGroup.changed(z6) ? 67108864 : 33554432;
        }
        int i11 = i & 805306368;
        int i12 = GroupFlagsKt.IsMovableContentFlag;
        if (i11 == 0) {
            i4 |= startRestartGroup.changed(z7) ? GroupFlagsKt.HasMovableContentFlag : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(ieVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z9 = z8;
            i5 |= startRestartGroup.changed(z9) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            z9 = z8;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changedInstance(kyVar4) ? 16384 : 8192;
        }
        if ((i2 & 1572864) == 0) {
            if (startRestartGroup.changedInstance(kyVar6)) {
                i8 = 1048576;
            }
            i5 |= i8;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changedInstance(kyVar7) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            if (startRestartGroup.changedInstance(kyVar8)) {
                i10 = 67108864;
            }
            i5 |= i10;
        }
        if ((i2 & 805306368) == 0) {
            if (startRestartGroup.changedInstance(kyVar9)) {
                i12 = GroupFlagsKt.HasMovableContentFlag;
            }
            i5 |= i12;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changedInstance(kyVar10) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        int i13 = i6;
        int i14 = 1;
        if (startRestartGroup.shouldExecute(((i4 & 302523539) == 302523538 && (306716819 & i5) == 306716818 && (i13 & 19) == 18) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-392816135, i4, i5, "com.lumi.singularity.ui.activities.PayloadSelectorDialog (MainActivity.kt:2132)");
            }
            final List E = y80.E(new t70("Singularity Magisk", "Installs the Singularity Magisk fork (v30.7) via tmpfs", true, false, null), new t70("Soft Reboot", "Performs a soft reboot for Magisk Zygisk", true, false, null), new t70("Persistent ADB Port", "Persists ADB over TCP on port 5555 across reboots", z4, true, kyVar4), new t70("Disable OTA Updates", "Redirects OTA URLs to localhost and disables the updater package.", z6, true, kyVar6), new t70("Boot Animation", "Replaces the system boot animation with the selected custom animation", z7, true, kyVar7), new t70("Auto Reboot", "Reboots and retries rooting if the exploit fails.", z9, true, kyVar10));
            final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            v1 v1Var = new v1(i14);
            int i15 = 14;
            boolean changedInstance = ((i4 & 14) == 4) | startRestartGroup.changedInstance(context) | ((1879048192 & i5) == 536870912);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new f1(context, kyVar, kyVar9, i15);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final g80 G = d41.G(v1Var, (ky) rememberedValue, startRestartGroup, 0);
            final ky kyVar12 = kyVar11;
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1600AlertDialogOix01E0(iyVar, el.a, SizeKt.fillMaxWidth(Modifier.Companion, 0.95f), null, null, null, ComposableLambdaKt.rememberComposableLambda(752792716, true, new my() { // from class: j70
                /* JADX WARN: Code restructure failed: missing block: B:117:0x072f, code lost:
                
                    if (r0 != null) goto L123;
                 */
                @Override // defpackage.my
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3;
                    Composer composer4;
                    Composer composer5;
                    ie ieVar2;
                    Composer composer6;
                    String str2;
                    long m1790getSurfaceVariant0d7_KjU;
                    Modifier modifier;
                    Modifier weight$default;
                    long m1790getSurfaceVariant0d7_KjU2;
                    Composer composer7 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (composer7.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(752792716, intValue, -1, "com.lumi.singularity.ui.activities.PayloadSelectorDialog.<anonymous> (MainActivity.kt:2217)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Alignment.Companion companion2 = Alignment.Companion;
                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), centerHorizontally, composer7, 54);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer7, fillMaxWidth$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        iy constructor = companion3.getConstructor();
                        if (composer7.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor);
                        } else {
                            composer7.useNode();
                        }
                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer7);
                        uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer7, fillMaxWidth$default2);
                        iy constructor2 = companion3.getConstructor();
                        if (composer7.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor2);
                        } else {
                            composer7.useNode();
                        }
                        Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer7);
                        uo.h(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        IconButtonKt.IconButton(iyVar, boxScopeInstance.align(companion, companion2.getTopStart()), false, null, null, null, el.b, composer7, 1572864, 60);
                        Modifier clip = ClipKt.clip(SizeKt.m807size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), Dp.m7611constructorimpl(56.0f)), RoundedCornerShapeKt.getCircleShape());
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i16 = MaterialTheme.$stable;
                        Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(clip, materialTheme.getColorScheme(composer7, i16).m1773getPrimaryContainer0d7_KjU(), null, 2, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer7, m227backgroundbw27NRU$default);
                        iy constructor3 = companion3.getConstructor();
                        if (composer7.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor3);
                        } else {
                            composer7.useNode();
                        }
                        Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer7);
                        uo.h(companion3, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                        IconKt.m2055Iconww6aTOc(LayersKt.getLayers(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(28.0f)), materialTheme.getColorScheme(composer7, i16).m1757getOnPrimaryContainer0d7_KjU(), composer7, 432, 0);
                        composer7.endNode();
                        composer7.endNode();
                        TextStyle titleLarge = materialTheme.getTypography(composer7, i16).getTitleLarge();
                        FontWeight semiBold = FontWeight.Companion.getSemiBold();
                        TextAlign.Companion companion4 = TextAlign.Companion;
                        TextKt.m2607TextNvy7gAk("Payload Selector", null, 0L, null, 0L, null, semiBold, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, titleLarge, composer7, 1572870, 0, 129982);
                        TextKt.m2607TextNvy7gAk("Choose which exploit and payloads to run. Changes take effect on the next exploit run.", null, materialTheme.getColorScheme(composer7, i16).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer7, i16).getBodySmall(), composer7, 6, 0, 130042);
                        Composer composer8 = composer7;
                        boolean z10 = true;
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        char c = 6;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion2.getTop(), composer8, 6);
                        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0));
                        CompositionLocalMap currentCompositionLocalMap4 = composer8.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer8, fillMaxWidth$default3);
                        iy constructor4 = companion3.getConstructor();
                        if (composer8.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer8.startReusableNode();
                        if (composer8.getInserting()) {
                            composer8.createNode(constructor4);
                        } else {
                            composer8.useNode();
                        }
                        Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer8);
                        uo.h(companion3, m3878constructorimpl4, rowMeasurePolicy, m3878constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion3, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer8.startReplaceGroup(-958891167);
                        xe0 xe0Var = new xe0(ku.d, Boolean.TRUE);
                        boolean z11 = z;
                        boolean z12 = z2;
                        Composer composer9 = composer8;
                        for (xe0 xe0Var2 : y80.E(xe0Var, new xe0(ku.e, Boolean.valueOf(z11 && !z12)))) {
                            ku kuVar2 = (ku) xe0Var2.d;
                            boolean booleanValue = ((Boolean) xe0Var2.e).booleanValue();
                            boolean z13 = kuVar == kuVar2 ? z10 : false;
                            if (booleanValue) {
                                composer9.startReplaceGroup(339424207);
                                Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
                                ky kyVar13 = kyVar12;
                                boolean changed = composer9.changed(kyVar13) | composer9.changed(kuVar2.ordinal());
                                Object rememberedValue2 = composer9.rememberedValue();
                                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new v4(23, kyVar13, kuVar2);
                                    composer9.updateRememberedValue(rememberedValue2);
                                }
                                weight$default = ClickableKt.m262clickableoSLSa3U$default(weight$default2, false, null, null, null, (iy) rememberedValue2, 15, null);
                                composer9.endReplaceGroup();
                            } else {
                                composer9.startReplaceGroup(339556701);
                                composer9.endReplaceGroup();
                                weight$default = RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
                            }
                            Modifier modifier2 = weight$default;
                            RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            CardDefaults cardDefaults = CardDefaults.INSTANCE;
                            if (z13 && booleanValue) {
                                composer9.startReplaceGroup(-958866654);
                                m1790getSurfaceVariant0d7_KjU2 = MaterialTheme.INSTANCE.getColorScheme(composer9, MaterialTheme.$stable).m1773getPrimaryContainer0d7_KjU();
                                composer9.endReplaceGroup();
                            } else if (booleanValue) {
                                composer9.startReplaceGroup(-958860416);
                                m1790getSurfaceVariant0d7_KjU2 = MaterialTheme.INSTANCE.getColorScheme(composer9, MaterialTheme.$stable).m1790getSurfaceVariant0d7_KjU();
                                composer9.endReplaceGroup();
                            } else {
                                composer9.startReplaceGroup(-958863260);
                                m1790getSurfaceVariant0d7_KjU2 = Color.m4760copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer9, MaterialTheme.$stable).m1790getSurfaceVariant0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                                composer9.endReplaceGroup();
                            }
                            Composer composer10 = composer9;
                            Composer composer11 = composer10;
                            z10 = true;
                            CardKt.Card(modifier2, m1056RoundedCornerShape0680j_4, cardDefaults.m1678cardColorsro_MJ88(m1790getSurfaceVariant0d7_KjU2, 0L, 0L, 0L, composer10, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(819499259, true, new s70(kuVar2, z13, booleanValue), composer11, 54), composer11, 196608, 24);
                            z12 = z12;
                            z11 = z11;
                            c = 6;
                            composer9 = composer11;
                        }
                        boolean z14 = z11;
                        boolean z15 = z12;
                        composer9.endReplaceGroup();
                        composer9.endNode();
                        if (z14) {
                            if (z15) {
                                composer9.startReplaceGroup(-549645979);
                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                int i17 = MaterialTheme.$stable;
                                Composer composer12 = composer9;
                                TextKt.m2607TextNvy7gAk("Cheese is patched on this firmware.", null, materialTheme2.getColorScheme(composer9, i17).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(TextAlign.Companion.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer9, i17).getBodySmall(), composer12, 6, 0, 130042);
                                composer3 = composer12;
                            } else {
                                composer9.startReplaceGroup(-654905332);
                                composer3 = composer9;
                            }
                            composer3.endReplaceGroup();
                            composer4 = composer3;
                        } else {
                            composer9.startReplaceGroup(-549999968);
                            MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                            int i18 = MaterialTheme.$stable;
                            Composer composer13 = composer9;
                            TextKt.m2607TextNvy7gAk("Cheese only supports Quest 3 / Quest 3S.", null, materialTheme3.getColorScheme(composer9, i18).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(TextAlign.Companion.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer9, i18).getBodySmall(), composer13, 6, 0, 130042);
                            Composer composer14 = composer13;
                            composer14.endReplaceGroup();
                            composer4 = composer14;
                        }
                        composer4.startReplaceGroup(536471865);
                        Iterator it = E.iterator();
                        Composer composer15 = composer4;
                        while (it.hasNext()) {
                            t70 t70Var = (t70) it.next();
                            Modifier.Companion companion5 = Modifier.Companion;
                            Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                            if (t70Var.e != null) {
                                composer15.startReplaceGroup(-1377832412);
                                boolean changed2 = composer15.changed(t70Var);
                                Object rememberedValue3 = composer15.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                    rememberedValue3 = new i2(t70Var, 21);
                                    composer15.updateRememberedValue(rememberedValue3);
                                }
                                modifier = ClickableKt.m262clickableoSLSa3U$default(companion5, false, null, null, null, (iy) rememberedValue3, 15, null);
                                composer15.endReplaceGroup();
                            } else {
                                composer15.startReplaceGroup(-1377690401);
                                composer15.endReplaceGroup();
                                modifier = companion5;
                            }
                            Modifier then = fillMaxWidth$default4.then(modifier);
                            RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            Composer composer16 = composer15;
                            CardColors m1678cardColorsro_MJ88 = CardDefaults.INSTANCE.m1678cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer15, MaterialTheme.$stable).m1790getSurfaceVariant0d7_KjU(), 0L, 0L, 0L, composer16, CardDefaults.$stable << 12, 14);
                            Composer composer17 = composer16;
                            CardKt.Card(then, m1056RoundedCornerShape0680j_42, m1678cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(88408421, true, new x6(t70Var, 7), composer17, 54), composer17, 196608, 24);
                            it = it;
                            composer15 = composer17;
                        }
                        boolean z16 = true;
                        composer15.endReplaceGroup();
                        if (z7) {
                            composer15.startReplaceGroup(-547138234);
                            Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), Alignment.Companion.getTop(), composer15, 6);
                            boolean z17 = false;
                            int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0));
                            CompositionLocalMap currentCompositionLocalMap5 = composer15.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer15, fillMaxWidth$default5);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                            iy constructor5 = companion6.getConstructor();
                            if (composer15.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer15.startReusableNode();
                            if (composer15.getInserting()) {
                                composer15.createNode(constructor5);
                            } else {
                                composer15.useNode();
                            }
                            Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer15);
                            uo.h(companion6, m3878constructorimpl5, rowMeasurePolicy2, m3878constructorimpl5, currentCompositionLocalMap5);
                            Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion6, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            composer15.startReplaceGroup(-466102003);
                            Iterator it2 = ie.j.iterator();
                            Composer composer18 = composer15;
                            while (true) {
                                boolean hasNext = it2.hasNext();
                                ieVar2 = ieVar;
                                if (!hasNext) {
                                    break;
                                }
                                ie ieVar3 = (ie) it2.next();
                                boolean z18 = ieVar2 == ieVar3 ? z16 : z17;
                                Modifier weight$default3 = RowScope.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null);
                                boolean changed3 = composer18.changed(ieVar3.ordinal());
                                g80 g80Var = G;
                                boolean changedInstance2 = changed3 | composer18.changedInstance(g80Var);
                                ky kyVar14 = kyVar8;
                                boolean changed4 = changedInstance2 | composer18.changed(kyVar14);
                                Object rememberedValue4 = composer18.rememberedValue();
                                if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                    rememberedValue4 = new p9(ieVar3, g80Var, kyVar14, 8);
                                    composer18.updateRememberedValue(rememberedValue4);
                                }
                                Modifier m262clickableoSLSa3U$default = ClickableKt.m262clickableoSLSa3U$default(weight$default3, false, null, null, null, (iy) rememberedValue4, 15, null);
                                RoundedCornerShape m1056RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                                if (z18) {
                                    composer18.startReplaceGroup(-466074256);
                                    m1790getSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer18, MaterialTheme.$stable).m1773getPrimaryContainer0d7_KjU();
                                    composer18.endReplaceGroup();
                                } else {
                                    composer18.startReplaceGroup(-466070994);
                                    m1790getSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer18, MaterialTheme.$stable).m1790getSurfaceVariant0d7_KjU();
                                    composer18.endReplaceGroup();
                                }
                                Composer composer19 = composer18;
                                Composer composer20 = composer19;
                                CardKt.Card(m262clickableoSLSa3U$default, m1056RoundedCornerShape0680j_43, cardDefaults2.m1678cardColorsro_MJ88(m1790getSurfaceVariant0d7_KjU, 0L, 0L, 0L, composer19, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1684531572, true, new g6(3, z18, ieVar3), composer20, 54), composer20, 196608, 24);
                                z17 = z17;
                                z16 = true;
                                composer18 = composer20;
                            }
                            composer18.endReplaceGroup();
                            composer18.endNode();
                            if (ieVar2 == ie.h) {
                                composer18.startReplaceGroup(-545009216);
                                String str3 = str;
                                if (str3 != null) {
                                    Uri parse = Uri.parse(str3);
                                    parse.getClass();
                                    str2 = e80.A(context, parse);
                                }
                                str2 = "No file selected";
                                String concat = "Selected: ".concat(str2);
                                MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                Composer composer21 = composer18;
                                TextKt.m2607TextNvy7gAk(concat, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), materialTheme4.getColorScheme(composer18, i19).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(TextAlign.Companion.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer18, i19).getBodySmall(), composer21, 48, 0, 130040);
                                composer6 = composer21;
                            } else {
                                composer18.startReplaceGroup(-654905332);
                                composer6 = composer18;
                            }
                            composer6.endReplaceGroup();
                            composer5 = composer6;
                        } else {
                            composer15.startReplaceGroup(-654905332);
                            composer5 = composer15;
                        }
                        composer5.endReplaceGroup();
                        composer5.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer7.skipToGroupEnd();
                    }
                    return w01.a;
                }
            }, startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, new DialogProperties(false, false, false, 3, (dq) null), composer2, ((i13 >> 3) & 14) | 1769904, 3072, 8088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: k70
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int updateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    int updateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    e80.b(ky.this, kuVar, kyVar2, z, z2, z3, z4, z5, z6, z7, ieVar, str, z8, kyVar3, kyVar4, kyVar5, kyVar6, kyVar7, kyVar8, kyVar9, kyVar10, iyVar, (Composer) obj, updateChangedFlags, updateChangedFlags2, updateChangedFlags3);
                    return w01.a;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:586:0x02eb, code lost:
    
        if (r8.p(r9) == false) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0db0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0f90  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x1350  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x136d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x1413  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x15ab  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x1602  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x16f2  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x16d2  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x15f1  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x137c  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1170  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0f69  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0749  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final boolean z, final boolean z2, final boolean z3, final iy iyVar, final Intent intent, final cq0 cq0Var, Composer composer, final int i) {
        int i2;
        int i3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i4;
        MutableState mutableState;
        ku kuVar;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        int i5;
        Object mutableStateOf$default;
        MutableState mutableState2;
        SnapshotMutationPolicy snapshotMutationPolicy3;
        int i6;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        ie ieVar;
        MutableState mutableState9;
        SharedPreferences sharedPreferences;
        int i7;
        hm hmVar;
        cq0 cq0Var2;
        boolean z4;
        boolean changedInstance;
        Object u70Var;
        hm hmVar2;
        Composer composer2;
        MutableState mutableState10;
        MutableState mutableState11;
        Context context;
        MutableState mutableState12;
        ky kyVar;
        MutableState mutableState13;
        MutableState mutableState14;
        MutableState mutableState15;
        MutableState mutableState16;
        SharedPreferences sharedPreferences2;
        un unVar;
        Animatable animatable;
        cq0 cq0Var3;
        g80 g80Var;
        Object[] objArr;
        MutableState mutableState17;
        boolean changed;
        Object w70Var;
        Object[] objArr2;
        MutableState mutableState18;
        Animatable animatable2;
        SharedPreferences sharedPreferences3;
        un unVar2;
        MutableState mutableState19;
        MutableState mutableState20;
        MutableState mutableState21;
        MutableState mutableState22;
        MutableState mutableState23;
        MutableState mutableState24;
        int i8;
        boolean changedInstance2;
        Object y70Var;
        int i9;
        MutableState mutableState25;
        MutableState mutableState26;
        SharedPreferences sharedPreferences4;
        MutableState mutableState27;
        MutableState mutableState28;
        MutableState mutableState29;
        MutableState mutableState30;
        MutableState mutableState31;
        MutableState mutableState32;
        un unVar3;
        Context context2;
        Composer composer3;
        boolean changedInstance3;
        Object rememberedValue;
        Context context3;
        MutableState mutableState33;
        hm hmVar3;
        boolean z5;
        Object rememberedValue2;
        int i10;
        boolean changedInstance4;
        Object rememberedValue3;
        y40 y40Var;
        boolean changedInstance5;
        Object rememberedValue4;
        un unVar4;
        y40 y40Var2;
        MutableState mutableState34;
        Context context4;
        MutableState mutableState35;
        Modifier.Companion companion;
        BoxScopeInstance boxScopeInstance;
        MaterialTheme materialTheme;
        int i11;
        Composer composer4;
        MutableState mutableState36;
        ComposeUiNode.Companion companion2;
        int i12;
        Object rememberedValue5;
        MutableState mutableState37;
        Icons icons;
        final MutableState mutableState38;
        Composer composer5;
        BoxScopeInstance boxScopeInstance2;
        Icons icons2;
        int i13;
        int i14;
        int i15;
        int i16;
        cq0 cq0Var4;
        Composer composer6;
        int i17;
        Composer composer7;
        MutableState mutableState39;
        MutableState mutableState40;
        Context context5;
        SharedPreferences sharedPreferences5;
        un unVar5;
        Object obj;
        int i18;
        int i19;
        Modifier.Companion companion3;
        hm hmVar4;
        boolean changed2;
        Object rememberedValue6;
        a11 j;
        MutableState mutableState41;
        un unVar6;
        a11 a11Var;
        int i20;
        MutableState mutableState42;
        ky kyVar2;
        SharedPreferences sharedPreferences6;
        MutableState mutableState43;
        MutableState mutableState44;
        ku kuVar2;
        ky kyVar3;
        ky kyVar4;
        ky kyVar5;
        ky kyVar6;
        ky kyVar7;
        MutableState mutableState45;
        ky kyVar8;
        ky kyVar9;
        boolean changedInstance6;
        Object rememberedValue7;
        Object rememberedValue8;
        boolean z6;
        final MutableState mutableState46;
        boolean changedInstance7;
        Object rememberedValue9;
        final Context context6;
        Composer composer8;
        int i21;
        final MutableState mutableState47;
        final MutableState mutableState48;
        final MutableState mutableState49;
        MutableState mutableState50;
        MutableState mutableState51;
        un unVar7;
        MainActivity mainActivity;
        MutableState mutableState52;
        String str = "BLACKHOLE";
        iyVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-1311589456);
        int i22 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i23 = i2;
        if ((196608 & i) == 0) {
            i3 = i23 | ((i & Fields.ColorFilter) == 0 ? startRestartGroup.changed(cq0Var) : startRestartGroup.changedInstance(cq0Var) ? Fields.RenderEffect : 65536);
        } else {
            i3 = i23;
        }
        if (startRestartGroup.shouldExecute((i3 & 66707) != 66706, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1311589456, i3, -1, "com.lumi.singularity.ui.activities.SingularityApp (MainActivity.kt:952)");
            }
            Context context7 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).getClass();
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (rememberedValue10 == companion4.getEmpty()) {
                rememberedValue10 = context7.getSharedPreferences("singularity_prefs", 0);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            SharedPreferences sharedPreferences7 = (SharedPreferences) rememberedValue10;
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == companion4.getEmpty()) {
                ro roVar = ro.a;
                sharedPreferences7.getClass();
                ro.f(sharedPreferences7);
                pz pzVar = pz.a;
                pz.g(sharedPreferences7);
                rememberedValue11 = Boolean.TRUE;
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            ((Boolean) rememberedValue11).getClass();
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == companion4.getEmpty()) {
                rememberedValue12 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            un unVar8 = (un) rememberedValue12;
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (rememberedValue13 == companion4.getEmpty()) {
                rememberedValue13 = new SnackbarHostState();
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) rememberedValue13;
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (rememberedValue14 == companion4.getEmpty()) {
                rememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            MutableState mutableState53 = (MutableState) rememberedValue14;
            boolean changedInstance8 = startRestartGroup.changedInstance(unVar8);
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (changedInstance8 || rememberedValue15 == companion4.getEmpty()) {
                rememberedValue15 = new c9(unVar8, mutableState53, snackbarHostState, i22);
                startRestartGroup.updateRememberedValue(rememberedValue15);
            }
            ky kyVar10 = (ky) rememberedValue15;
            Object rememberedValue16 = startRestartGroup.rememberedValue();
            if (rememberedValue16 == companion4.getEmpty()) {
                snapshotMutationPolicy = null;
                rememberedValue16 = uo.a(sharedPreferences7.getBoolean("is_unlocked_bootloader", false), null, 2, null, startRestartGroup);
            } else {
                snapshotMutationPolicy = null;
            }
            MutableState mutableState54 = (MutableState) rememberedValue16;
            Object rememberedValue17 = startRestartGroup.rememberedValue();
            if (rememberedValue17 == companion4.getEmpty()) {
                rememberedValue17 = uo.a(sharedPreferences7.getBoolean("root_on_boot", false), snapshotMutationPolicy, 2, snapshotMutationPolicy, startRestartGroup);
            }
            MutableState mutableState55 = (MutableState) rememberedValue17;
            Object rememberedValue18 = startRestartGroup.rememberedValue();
            if (rememberedValue18 == companion4.getEmpty()) {
                rememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue18);
            }
            MutableState mutableState56 = (MutableState) rememberedValue18;
            ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            Object rememberedValue19 = startRestartGroup.rememberedValue();
            if (rememberedValue19 == companion4.getEmpty()) {
                rememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue19);
            }
            MutableState mutableState57 = (MutableState) rememberedValue19;
            Object rememberedValue20 = startRestartGroup.rememberedValue();
            if (rememberedValue20 == companion4.getEmpty()) {
                rememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue20);
            }
            MutableState mutableState58 = (MutableState) rememberedValue20;
            Object rememberedValue21 = startRestartGroup.rememberedValue();
            if (rememberedValue21 == companion4.getEmpty()) {
                rememberedValue21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue21);
            }
            MutableState mutableState59 = (MutableState) rememberedValue21;
            Object rememberedValue22 = startRestartGroup.rememberedValue();
            if (rememberedValue22 == companion4.getEmpty()) {
                rememberedValue22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue22);
            }
            final MutableState mutableState60 = (MutableState) rememberedValue22;
            Object rememberedValue23 = startRestartGroup.rememberedValue();
            if (rememberedValue23 == companion4.getEmpty()) {
                rememberedValue23 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue23);
            }
            MutableState mutableState61 = (MutableState) rememberedValue23;
            Object rememberedValue24 = startRestartGroup.rememberedValue();
            if (rememberedValue24 == companion4.getEmpty()) {
                i4 = 2;
                rememberedValue24 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue24);
            } else {
                i4 = 2;
            }
            MutableState mutableState62 = (MutableState) rememberedValue24;
            Object rememberedValue25 = startRestartGroup.rememberedValue();
            if (rememberedValue25 == companion4.getEmpty()) {
                rememberedValue25 = uo.a(sharedPreferences7.getBoolean("auto_reboot_on_exploit_fail", false), null, i4, null, startRestartGroup);
            }
            MutableState mutableState63 = (MutableState) rememberedValue25;
            v1 v1Var = new v1(i4);
            Object rememberedValue26 = startRestartGroup.rememberedValue();
            int i24 = 12;
            if (rememberedValue26 == companion4.getEmpty()) {
                rememberedValue26 = new i3(mutableState61, i24);
                startRestartGroup.updateRememberedValue(rememberedValue26);
            }
            g80 G = d41.G(v1Var, (ky) rememberedValue26, startRestartGroup, 48);
            int i25 = 458752 & i3;
            boolean z7 = i25 == 131072 || ((i3 & Fields.ColorFilter) != 0 && startRestartGroup.changed(cq0Var));
            Object rememberedValue27 = startRestartGroup.rememberedValue();
            ku kuVar3 = ku.e;
            if (z7 || rememberedValue27 == companion4.getEmpty()) {
                String string = sharedPreferences7.getString("selected_exploit_binary", null);
                boolean b = q10.b(string, "FUGU");
                ku kuVar4 = ku.d;
                if (!b) {
                    if (!q10.b(string, "CHEESE")) {
                        MainActivity mainActivity2 = (MainActivity) cq0Var;
                        if (mainActivity2.q(kuVar3)) {
                        }
                    }
                    mutableState = mutableState61;
                    kuVar = kuVar3;
                    snapshotMutationPolicy2 = null;
                    i5 = 2;
                    mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kuVar, snapshotMutationPolicy2, i5, snapshotMutationPolicy2);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                }
                kuVar = kuVar4;
                i5 = 2;
                mutableState = mutableState61;
                snapshotMutationPolicy2 = null;
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kuVar, snapshotMutationPolicy2, i5, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
            } else {
                mutableState = mutableState61;
                mutableStateOf$default = rememberedValue27;
            }
            MutableState mutableState64 = (MutableState) mutableStateOf$default;
            Object rememberedValue28 = startRestartGroup.rememberedValue();
            if (rememberedValue28 == companion4.getEmpty()) {
                mutableState2 = mutableState64;
                snapshotMutationPolicy3 = null;
                i6 = 2;
                rememberedValue28 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue28);
            } else {
                mutableState2 = mutableState64;
                snapshotMutationPolicy3 = null;
                i6 = 2;
            }
            final MutableState mutableState65 = (MutableState) rememberedValue28;
            Object rememberedValue29 = startRestartGroup.rememberedValue();
            if (rememberedValue29 == companion4.getEmpty()) {
                rememberedValue29 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy3, snapshotMutationPolicy3, i6, snapshotMutationPolicy3);
                startRestartGroup.updateRememberedValue(rememberedValue29);
            }
            MutableState mutableState66 = (MutableState) rememberedValue29;
            Object rememberedValue30 = startRestartGroup.rememberedValue();
            if (rememberedValue30 == companion4.getEmpty()) {
                rememberedValue30 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, i6, snapshotMutationPolicy3);
                startRestartGroup.updateRememberedValue(rememberedValue30);
            }
            MutableState mutableState67 = (MutableState) rememberedValue30;
            Object rememberedValue31 = startRestartGroup.rememberedValue();
            if (rememberedValue31 == companion4.getEmpty()) {
                rememberedValue31 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, i6, snapshotMutationPolicy3);
                startRestartGroup.updateRememberedValue(rememberedValue31);
            }
            MutableState mutableState68 = (MutableState) rememberedValue31;
            Object rememberedValue32 = startRestartGroup.rememberedValue();
            if (rememberedValue32 == companion4.getEmpty()) {
                rememberedValue32 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), snapshotMutationPolicy3, i6, snapshotMutationPolicy3);
                startRestartGroup.updateRememberedValue(rememberedValue32);
            }
            MutableState mutableState69 = (MutableState) rememberedValue32;
            Object rememberedValue33 = startRestartGroup.rememberedValue();
            if (rememberedValue33 == companion4.getEmpty()) {
                rememberedValue33 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy3, i6, snapshotMutationPolicy3);
                startRestartGroup.updateRememberedValue(rememberedValue33);
            }
            MutableState mutableState70 = (MutableState) rememberedValue33;
            Object rememberedValue34 = startRestartGroup.rememberedValue();
            if (rememberedValue34 == companion4.getEmpty()) {
                rememberedValue34 = uo.a(sharedPreferences7.getBoolean("auto_check_updates", true), snapshotMutationPolicy3, i6, snapshotMutationPolicy3, startRestartGroup);
            }
            MutableState mutableState71 = (MutableState) rememberedValue34;
            Object rememberedValue35 = startRestartGroup.rememberedValue();
            if (rememberedValue35 == companion4.getEmpty()) {
                rememberedValue35 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, i6, snapshotMutationPolicy3);
                startRestartGroup.updateRememberedValue(rememberedValue35);
            }
            MutableState mutableState72 = (MutableState) rememberedValue35;
            Object rememberedValue36 = startRestartGroup.rememberedValue();
            if (rememberedValue36 == companion4.getEmpty()) {
                String string2 = sharedPreferences7.getString("update_channel", "stable");
                MutableState mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(string2 != null ? string2 : "stable", null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                rememberedValue36 = mutableStateOf$default2;
            }
            MutableState mutableState73 = (MutableState) rememberedValue36;
            Object[] objArr3 = new Object[0];
            Object rememberedValue37 = startRestartGroup.rememberedValue();
            if (rememberedValue37 == companion4.getEmpty()) {
                rememberedValue37 = new ms(12);
                startRestartGroup.updateRememberedValue(rememberedValue37);
            }
            MutableState mutableState74 = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, (iy) rememberedValue37, startRestartGroup, 48);
            Object rememberedValue38 = startRestartGroup.rememberedValue();
            if (rememberedValue38 == companion4.getEmpty()) {
                rememberedValue38 = context7.getSharedPreferences("payload_prefs", 0);
                startRestartGroup.updateRememberedValue(rememberedValue38);
            }
            SharedPreferences sharedPreferences8 = (SharedPreferences) rememberedValue38;
            Object rememberedValue39 = startRestartGroup.rememberedValue();
            if (rememberedValue39 == companion4.getEmpty()) {
                mutableState3 = mutableState70;
                rememberedValue39 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue39);
            } else {
                mutableState3 = mutableState70;
            }
            MutableState mutableState75 = (MutableState) rememberedValue39;
            Object rememberedValue40 = startRestartGroup.rememberedValue();
            if (rememberedValue40 == companion4.getEmpty()) {
                mutableState4 = mutableState72;
                rememberedValue40 = uo.a(sharedPreferences8.getBoolean("payload_singularity_magisk", true), null, 2, null, startRestartGroup);
            } else {
                mutableState4 = mutableState72;
            }
            MutableState mutableState76 = (MutableState) rememberedValue40;
            Object rememberedValue41 = startRestartGroup.rememberedValue();
            if (rememberedValue41 == companion4.getEmpty()) {
                mutableState5 = mutableState74;
                rememberedValue41 = uo.a(sharedPreferences8.getBoolean("payload_persistent_port", true), null, 2, null, startRestartGroup);
            } else {
                mutableState5 = mutableState74;
            }
            MutableState mutableState77 = (MutableState) rememberedValue41;
            Object rememberedValue42 = startRestartGroup.rememberedValue();
            if (rememberedValue42 == companion4.getEmpty()) {
                mutableState6 = mutableState77;
                rememberedValue42 = uo.a(sharedPreferences8.getBoolean("payload_soft_reboot", true), null, 2, null, startRestartGroup);
            } else {
                mutableState6 = mutableState77;
            }
            MutableState mutableState78 = (MutableState) rememberedValue42;
            Object rememberedValue43 = startRestartGroup.rememberedValue();
            if (rememberedValue43 == companion4.getEmpty()) {
                mutableState7 = mutableState78;
                rememberedValue43 = uo.a(sharedPreferences8.getBoolean("payload_disable_ota", false), null, 2, null, startRestartGroup);
            } else {
                mutableState7 = mutableState78;
            }
            MutableState mutableState79 = (MutableState) rememberedValue43;
            Object rememberedValue44 = startRestartGroup.rememberedValue();
            if (rememberedValue44 == companion4.getEmpty()) {
                mutableState8 = mutableState79;
                rememberedValue44 = uo.a(sharedPreferences8.getBoolean("payload_bootanimation", true), null, 2, null, startRestartGroup);
            } else {
                mutableState8 = mutableState79;
            }
            MutableState mutableState80 = (MutableState) rememberedValue44;
            Object rememberedValue45 = startRestartGroup.rememberedValue();
            if (rememberedValue45 == companion4.getEmpty()) {
                try {
                    String string3 = sharedPreferences8.getString("payload_bootanimation_choice", "BLACKHOLE");
                    if (string3 != null) {
                        str = string3;
                    }
                    ieVar = ie.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    ieVar = ie.f;
                }
                MutableState mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ieVar, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default3);
                rememberedValue45 = mutableStateOf$default3;
            }
            MutableState mutableState81 = (MutableState) rememberedValue45;
            Object rememberedValue46 = startRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (rememberedValue46 == companion5.getEmpty()) {
                mutableState9 = mutableState81;
                MutableState mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedPreferences8.getString("payload_bootanimation_custom_uri", null), null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default4);
                rememberedValue46 = mutableStateOf$default4;
            } else {
                mutableState9 = mutableState81;
            }
            MutableState mutableState82 = (MutableState) rememberedValue46;
            Object rememberedValue47 = startRestartGroup.rememberedValue();
            if (rememberedValue47 == companion5.getEmpty()) {
                sharedPreferences = sharedPreferences8;
                i7 = 2;
                rememberedValue47 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(sharedPreferences7.getFloat("payload_settle_sec", 0.3f)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue47);
            } else {
                sharedPreferences = sharedPreferences8;
                i7 = 2;
            }
            MutableState mutableState83 = (MutableState) rememberedValue47;
            Object rememberedValue48 = startRestartGroup.rememberedValue();
            if (rememberedValue48 == companion5.getEmpty()) {
                hmVar = null;
                rememberedValue48 = uo.a(sharedPreferences7.getBoolean("timing_expanded", false), null, i7, null, startRestartGroup);
            } else {
                hmVar = null;
            }
            MutableState mutableState84 = (MutableState) rememberedValue48;
            int i26 = i7;
            hm hmVar5 = hmVar;
            int i27 = i3;
            MutableState mutableState85 = mutableState9;
            SharedPreferences sharedPreferences9 = sharedPreferences;
            MutableState mutableState86 = mutableState4;
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState84.getValue()).booleanValue() ? 180.0f : 0.0f, null, 0.0f, "timingChevron", null, startRestartGroup, 3072, 22);
            Object rememberedValue49 = startRestartGroup.rememberedValue();
            if (rememberedValue49 == companion5.getEmpty()) {
                rememberedValue49 = AnimatableKt.Animatable$default(0.0f, 0.0f, i26, hmVar5);
                startRestartGroup.updateRememberedValue(rememberedValue49);
            }
            Animatable animatable3 = (Animatable) rememberedValue49;
            boolean changedInstance9 = startRestartGroup.changedInstance(sharedPreferences7) | startRestartGroup.changedInstance(context7) | startRestartGroup.changedInstance(unVar8) | startRestartGroup.changedInstance(animatable3) | startRestartGroup.changed(kyVar10);
            if (i25 != 131072) {
                cq0Var2 = cq0Var;
                if ((i27 & Fields.ColorFilter) == 0 || !startRestartGroup.changedInstance(cq0Var2)) {
                    z4 = false;
                    changedInstance = changedInstance9 | z4 | startRestartGroup.changedInstance(G);
                    Object rememberedValue50 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue50 == companion5.getEmpty()) {
                        hmVar2 = hmVar5;
                        composer2 = startRestartGroup;
                        cq0 cq0Var5 = cq0Var2;
                        mutableState10 = mutableState58;
                        mutableState11 = mutableState71;
                        context = context7;
                        u70Var = new u70(sharedPreferences7, context, mutableState10, mutableState59, mutableState11, unVar8, kyVar10, animatable3, mutableState65, mutableState73, mutableState66, mutableState67, cq0Var5, G, mutableState54, null);
                        mutableState12 = mutableState59;
                        kyVar = kyVar10;
                        mutableState13 = mutableState73;
                        mutableState14 = mutableState66;
                        mutableState15 = mutableState67;
                        mutableState16 = mutableState54;
                        sharedPreferences2 = sharedPreferences7;
                        unVar = unVar8;
                        animatable = animatable3;
                        cq0Var3 = cq0Var5;
                        g80Var = G;
                        composer2.updateRememberedValue(u70Var);
                    } else {
                        unVar = unVar8;
                        kyVar = kyVar10;
                        hmVar2 = hmVar5;
                        composer2 = startRestartGroup;
                        u70Var = rememberedValue50;
                        animatable = animatable3;
                        cq0Var3 = cq0Var2;
                        sharedPreferences2 = sharedPreferences7;
                        mutableState10 = mutableState58;
                        mutableState12 = mutableState59;
                        mutableState14 = mutableState66;
                        mutableState15 = mutableState67;
                        mutableState11 = mutableState71;
                        mutableState13 = mutableState73;
                        context = context7;
                        g80Var = G;
                        mutableState16 = mutableState54;
                    }
                    EffectsKt.LaunchedEffect(w01.a, (my) u70Var, composer2, 6);
                    ku i28 = i(mutableState2);
                    Boolean valueOf = Boolean.valueOf(g(mutableState10));
                    Boolean bool = (Boolean) mutableState.getValue();
                    bool.getClass();
                    Boolean bool2 = (Boolean) mutableState12.getValue();
                    bool2.getClass();
                    objArr = new Object[]{i28, valueOf, bool, bool2, Boolean.valueOf(z), Boolean.valueOf(d(mutableState16))};
                    MutableState mutableState87 = mutableState5;
                    mutableState17 = mutableState2;
                    changed = composer2.changed(mutableState87) | composer2.changedInstance(context) | composer2.changed(mutableState17) | (i25 != 131072 || ((i27 & Fields.ColorFilter) != 0 && composer2.changedInstance(cq0Var3))) | composer2.changedInstance(g80Var);
                    Object rememberedValue51 = composer2.rememberedValue();
                    if (!changed || rememberedValue51 == companion5.getEmpty()) {
                        objArr2 = objArr;
                        mutableState18 = mutableState11;
                        animatable2 = animatable;
                        sharedPreferences3 = sharedPreferences2;
                        unVar2 = unVar;
                        mutableState19 = mutableState13;
                        cq0 cq0Var6 = cq0Var3;
                        Context context8 = context;
                        MutableState mutableState88 = mutableState10;
                        MutableState mutableState89 = mutableState16;
                        MutableState mutableState90 = mutableState12;
                        MutableState mutableState91 = mutableState;
                        mutableState20 = mutableState15;
                        w70Var = new w70(mutableState90, mutableState88, mutableState91, mutableState87, mutableState89, context8, mutableState56, g80Var, cq0Var6, mutableState17, null);
                        mutableState10 = mutableState88;
                        context = context8;
                        mutableState21 = mutableState56;
                        mutableState22 = mutableState91;
                        mutableState23 = mutableState90;
                        mutableState24 = mutableState89;
                        cq0Var3 = cq0Var6;
                        composer2.updateRememberedValue(w70Var);
                    } else {
                        objArr2 = objArr;
                        mutableState24 = mutableState16;
                        mutableState18 = mutableState11;
                        animatable2 = animatable;
                        unVar2 = unVar;
                        mutableState23 = mutableState12;
                        mutableState19 = mutableState13;
                        mutableState21 = mutableState56;
                        mutableState22 = mutableState;
                        w70Var = rememberedValue51;
                        sharedPreferences3 = sharedPreferences2;
                        mutableState20 = mutableState15;
                    }
                    EffectsKt.LaunchedEffect(objArr2, (my) w70Var, composer2, 0);
                    Boolean valueOf2 = Boolean.valueOf(z);
                    Boolean bool3 = (Boolean) mutableState22.getValue();
                    bool3.getClass();
                    Boolean bool4 = (Boolean) mutableState23.getValue();
                    bool4.getClass();
                    i8 = i27 & 14;
                    changedInstance2 = (i8 != 4) | composer2.changedInstance(context) | composer2.changedInstance(sharedPreferences3) | (i25 != 131072 || ((i27 & Fields.ColorFilter) != 0 && composer2.changedInstance(cq0Var3))) | composer2.changed(mutableState17) | composer2.changedInstance(unVar2);
                    Object rememberedValue52 = composer2.rememberedValue();
                    if (!changedInstance2 || rememberedValue52 == companion5.getEmpty()) {
                        SharedPreferences sharedPreferences10 = sharedPreferences3;
                        un unVar9 = unVar2;
                        i9 = i8;
                        MutableState mutableState92 = mutableState21;
                        MutableState mutableState93 = mutableState10;
                        y70Var = new y70(z, context, cq0Var3, mutableState23, mutableState57, mutableState93, mutableState22, mutableState92, sharedPreferences10, mutableState60, mutableState17, unVar9, mutableState62, mutableState63, null);
                        mutableState25 = mutableState57;
                        mutableState26 = mutableState22;
                        sharedPreferences4 = sharedPreferences10;
                        mutableState27 = mutableState17;
                        mutableState28 = mutableState62;
                        mutableState29 = mutableState63;
                        mutableState30 = mutableState23;
                        mutableState31 = mutableState93;
                        mutableState32 = mutableState92;
                        unVar3 = unVar9;
                        context2 = context;
                        composer2.updateRememberedValue(y70Var);
                    } else {
                        mutableState30 = mutableState23;
                        mutableState32 = mutableState21;
                        mutableState27 = mutableState17;
                        mutableState25 = mutableState57;
                        mutableState29 = mutableState63;
                        context2 = context;
                        mutableState31 = mutableState10;
                        mutableState28 = mutableState62;
                        mutableState26 = mutableState22;
                        sharedPreferences4 = sharedPreferences3;
                        i9 = i8;
                        y70Var = rememberedValue52;
                        unVar3 = unVar2;
                    }
                    composer3 = composer2;
                    EffectsKt.LaunchedEffect(valueOf2, bool3, bool4, (my) y70Var, composer3, i9);
                    Boolean valueOf3 = Boolean.valueOf(z2);
                    changedInstance3 = composer3.changedInstance(context2) | ((i27 & 112) != 32);
                    rememberedValue = composer3.rememberedValue();
                    if (!changedInstance3 || rememberedValue == companion5.getEmpty()) {
                        Context context9 = context2;
                        hm hmVar6 = hmVar2;
                        rememberedValue = new z70(z2, context9, mutableState32, hmVar6, 0);
                        context3 = context9;
                        mutableState33 = mutableState32;
                        hmVar3 = hmVar6;
                        composer3.updateRememberedValue(rememberedValue);
                    } else {
                        context3 = context2;
                        mutableState33 = mutableState32;
                        hmVar3 = hmVar2;
                    }
                    EffectsKt.LaunchedEffect(valueOf3, (my) rememberedValue, composer3, (i27 >> 3) & 14);
                    Boolean valueOf4 = Boolean.valueOf(z3);
                    z5 = ((i27 & 7168) != 2048) | ((i27 & 896) != 256);
                    rememberedValue2 = composer3.rememberedValue();
                    if (!z5 || rememberedValue2 == companion5.getEmpty()) {
                        i10 = 14;
                        rememberedValue2 = new a80(z3, iyVar, hmVar3, 0);
                        composer3.updateRememberedValue(rememberedValue2);
                    } else {
                        i10 = 14;
                    }
                    EffectsKt.LaunchedEffect(valueOf4, (my) rememberedValue2, composer3, (i27 >> 6) & 14);
                    Boolean valueOf5 = Boolean.valueOf(g(mutableState31));
                    changedInstance4 = composer3.changedInstance(sharedPreferences4) | composer3.changedInstance(context3);
                    rememberedValue3 = composer3.rememberedValue();
                    if (!changedInstance4 || rememberedValue3 == companion5.getEmpty()) {
                        rememberedValue3 = new g4(sharedPreferences4, mutableState31, context3, hmVar3);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    EffectsKt.LaunchedEffect(valueOf5, (my) rememberedValue3, composer3, 0);
                    y40Var = (y40) composer3.consume(x50.a);
                    changedInstance5 = composer3.changedInstance(unVar3) | composer3.changedInstance(context3) | composer3.changedInstance(y40Var);
                    rememberedValue4 = composer3.rememberedValue();
                    if (!changedInstance5 || rememberedValue4 == companion5.getEmpty()) {
                        Context context10 = context3;
                        unVar4 = unVar3;
                        MutableState mutableState94 = mutableState25;
                        MutableState mutableState95 = mutableState31;
                        rememberedValue4 = new g70(y40Var, unVar4, mutableState30, mutableState94, context10, mutableState95);
                        y40Var2 = y40Var;
                        mutableState34 = mutableState94;
                        context4 = context10;
                        mutableState35 = mutableState95;
                        composer3.updateRememberedValue(rememberedValue4);
                    } else {
                        Context context11 = context3;
                        y40Var2 = y40Var;
                        context4 = context11;
                        unVar4 = unVar3;
                        mutableState35 = mutableState31;
                        mutableState34 = mutableState25;
                    }
                    EffectsKt.DisposableEffect(y40Var2, (ky) rememberedValue4, composer3, 0);
                    companion = Modifier.Companion;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, hmVar3);
                    Alignment.Companion companion6 = Alignment.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    iy constructor = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.useNode();
                    } else {
                        composer3.createNode(constructor);
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                    uo.h(companion7, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion7, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MutableState mutableState96 = mutableState33;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m762padding3ABfNKs);
                    iy constructor2 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.useNode();
                    } else {
                        composer3.createNode(constructor2);
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                    uo.h(companion7, m3878constructorimpl2, columnMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion7, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                    iy constructor3 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.useNode();
                    } else {
                        composer3.createNode(constructor3);
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                    uo.h(companion7, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion7, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    materialTheme = MaterialTheme.INSTANCE;
                    i11 = MaterialTheme.$stable;
                    SharedPreferences sharedPreferences11 = sharedPreferences4;
                    final MutableState mutableState97 = mutableState35;
                    int i29 = i10;
                    final un unVar10 = unVar4;
                    Context context12 = context4;
                    TextKt.m2607TextNvy7gAk("Singularity", null, materialTheme.getColorScheme(composer3, i11).m1772getPrimary0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i11).getHeadlineLarge(), composer3, 6, 0, 131066);
                    composer4 = composer3;
                    if (d(mutableState24)) {
                        composer4.startReplaceGroup(1460010036);
                        Modifier align = boxScopeInstance.align(companion, companion6.getCenterStart());
                        Object rememberedValue53 = composer4.rememberedValue();
                        if (rememberedValue53 == companion5.getEmpty()) {
                            mutableState52 = mutableState75;
                            rememberedValue53 = new j3(mutableState52, i29);
                            composer4.updateRememberedValue(rememberedValue53);
                        } else {
                            mutableState52 = mutableState75;
                        }
                        Modifier m262clickableoSLSa3U$default = ClickableKt.m262clickableoSLSa3U$default(align, false, null, null, null, (iy) rememberedValue53, 15, null);
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getCenterHorizontally(), composer4, 48);
                        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                        CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, m262clickableoSLSa3U$default);
                        iy constructor4 = companion7.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor4);
                        } else {
                            composer4.useNode();
                        }
                        Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer4);
                        uo.h(companion7, m3878constructorimpl4, columnMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion7, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                        IconKt.m2055Iconww6aTOc(LayersKt.getLayers(Icons.INSTANCE.getDefault()), "Payloads", SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(22.0f)), materialTheme.getColorScheme(composer4, i11).m1772getPrimary0d7_KjU(), composer4, 432, 0);
                        mutableState36 = mutableState52;
                        i12 = 48;
                        companion2 = companion7;
                        TextKt.m2607TextNvy7gAk("Payloads", null, materialTheme.getColorScheme(composer4, i11).m1772getPrimary0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i11).getLabelSmall(), composer4, 6, 0, 131066);
                        composer4 = composer4;
                        composer4.endNode();
                    } else {
                        mutableState36 = mutableState75;
                        companion2 = companion7;
                        i12 = 48;
                        composer4.startReplaceGroup(1389002800);
                    }
                    composer4.endReplaceGroup();
                    Modifier align2 = boxScopeInstance.align(companion, companion6.getCenterEnd());
                    rememberedValue5 = composer4.rememberedValue();
                    if (rememberedValue5 != companion5.getEmpty()) {
                        mutableState37 = mutableState86;
                        rememberedValue5 = new j3(mutableState37, 15);
                        composer4.updateRememberedValue(rememberedValue5);
                    } else {
                        mutableState37 = mutableState86;
                    }
                    Modifier m262clickableoSLSa3U$default2 = ClickableKt.m262clickableoSLSa3U$default(align2, false, null, null, null, (iy) rememberedValue5, 15, null);
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getCenterHorizontally(), composer4, i12);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, m262clickableoSLSa3U$default2);
                    iy constructor5 = companion2.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.useNode();
                    } else {
                        composer4.createNode(constructor5);
                    }
                    Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer4);
                    ComposeUiNode.Companion companion8 = companion2;
                    uo.h(companion8, m3878constructorimpl5, columnMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion8, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                    icons = Icons.INSTANCE;
                    Composer composer9 = composer4;
                    mutableState38 = mutableState37;
                    IconKt.m2055Iconww6aTOc(SyncKt.getSync(icons.getDefault()), "Updater", RotateKt.rotate(SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(22.0f)), ((Number) animatable2.getValue()).floatValue()), materialTheme.getColorScheme(composer4, i11).m1772getPrimary0d7_KjU(), composer9, 48, 0);
                    TextKt.m2607TextNvy7gAk("Updater", null, materialTheme.getColorScheme(composer9, i11).m1772getPrimary0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer9, i11).getLabelSmall(), composer9, 6, 0, 131066);
                    composer9.endNode();
                    composer9.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer9, 6);
                    CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(16.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-973485026, true, new xl(2, mutableState97, cq0Var), composer9, 54), composer9, 196614, 28);
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer9, 6);
                    composer5 = composer9;
                    CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(796484437, true, new d9(sharedPreferences11, cq0Var, mutableState55, mutableState24, mutableState27, 2), composer9, 54), composer5, 196614, 28);
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer5, 6);
                    if (!d(mutableState24) && !g(mutableState97)) {
                        mainActivity = (MainActivity) cq0Var;
                        if (mainActivity.q(i(mutableState27)) && mainActivity.p(i(mutableState27))) {
                            composer5.startReplaceGroup(-845009714);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            i16 = 12;
                            boxScopeInstance2 = boxScopeInstance;
                            icons2 = icons;
                            i14 = 1;
                            cq0Var4 = cq0Var;
                            CardColors m1678cardColorsro_MJ88 = CardDefaults.INSTANCE.m1678cardColorsro_MJ88(materialTheme.getColorScheme(composer5, i11).m1749getErrorContainer0d7_KjU(), 0L, 0L, 0L, composer5, CardDefaults.$stable << 12, 14);
                            composer5 = composer5;
                            i15 = 54;
                            CardKt.Card(fillMaxWidth$default2, m1056RoundedCornerShape0680j_4, m1678cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-300319879, true, new xk(cq0Var4), composer5, 54), composer5, 196614, 24);
                            i13 = 6;
                            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer5, 6);
                            composer5.endReplaceGroup();
                            int i30 = 5;
                            if (!d(mutableState24) && !g(mutableState97)) {
                                if (!((MainActivity) cq0Var4).q(i(mutableState27))) {
                                    composer5.startReplaceGroup(-843596703);
                                    Composer composer10 = composer5;
                                    i15 = 54;
                                    CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, i14, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), CardDefaults.INSTANCE.m1678cardColorsro_MJ88(materialTheme.getColorScheme(composer5, i11).m1749getErrorContainer0d7_KjU(), 0L, 0L, 0L, composer10, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-831870992, true, new x6(cq0Var4, i30), composer10, 54), composer10, 196614, 24);
                                    composer6 = composer10;
                                    Modifier m793height3ABfNKs = SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f));
                                    i17 = 6;
                                    SpacerKt.Spacer(m793height3ABfNKs, composer6, 6);
                                    composer6.endReplaceGroup();
                                    boolean booleanValue = ((Boolean) mutableState26.getValue()).booleanValue();
                                    if (d(mutableState24)) {
                                        composer7 = composer6;
                                        mutableState39 = mutableState97;
                                        mutableState40 = mutableState96;
                                        context5 = context12;
                                        sharedPreferences5 = sharedPreferences11;
                                        unVar5 = unVar10;
                                        obj = null;
                                        i18 = i17;
                                        composer7.startReplaceGroup(-921130090);
                                    } else {
                                        composer6.startReplaceGroup(-842090289);
                                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                        RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                        if (!f(mutableState34) && !g(mutableState97)) {
                                            MainActivity mainActivity3 = (MainActivity) cq0Var4;
                                            if (!mainActivity3.p(i(mutableState27)) && mainActivity3.q(i(mutableState27)) && booleanValue) {
                                                z6 = true;
                                                mutableState46 = mutableState27;
                                                changedInstance7 = composer6.changedInstance(context12) | (i25 != 131072 || ((i27 & Fields.ColorFilter) != 0 && composer6.changedInstance(cq0Var4))) | composer6.changed(mutableState46) | composer6.changedInstance(unVar10);
                                                rememberedValue9 = composer6.rememberedValue();
                                                if (!changedInstance7 || rememberedValue9 == companion5.getEmpty()) {
                                                    final cq0 cq0Var7 = cq0Var4;
                                                    context6 = context12;
                                                    composer8 = composer6;
                                                    i21 = i15;
                                                    mutableState47 = mutableState28;
                                                    mutableState48 = mutableState29;
                                                    final MutableState mutableState98 = mutableState34;
                                                    mutableState49 = mutableState96;
                                                    iy iyVar2 = new iy() { // from class: d70
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // defpackage.iy
                                                        public final Object invoke() {
                                                            MutableState mutableState99 = mutableState98;
                                                            if (!((Boolean) mutableState99.getValue()).booleanValue()) {
                                                                MutableState mutableState100 = mutableState60;
                                                                e80.h(mutableState100, 0);
                                                                Boolean bool5 = Boolean.FALSE;
                                                                MutableState mutableState101 = mutableState47;
                                                                mutableState101.setValue(bool5);
                                                                MutableState mutableState102 = mutableState49;
                                                                mutableState102.setValue("starting magic...\n");
                                                                mutableState99.setValue(Boolean.TRUE);
                                                                MutableState mutableState103 = mutableState46;
                                                                ku kuVar5 = (ku) mutableState103.getValue();
                                                                i3 i3Var = new i3(mutableState102, 13);
                                                                un unVar11 = unVar10;
                                                                cq0 cq0Var8 = cq0.this;
                                                                Context context13 = context6;
                                                                ((MainActivity) cq0Var8).j(context13, kuVar5, i3Var, new h70(unVar11, cq0Var8, context13, mutableState99, mutableState100, mutableState101, mutableState102, mutableState48, mutableState97, mutableState103, 0));
                                                            }
                                                            return w01.a;
                                                        }
                                                    };
                                                    mutableState50 = mutableState98;
                                                    mutableState51 = mutableState46;
                                                    unVar7 = unVar10;
                                                    mutableState39 = mutableState97;
                                                    composer8.updateRememberedValue(iyVar2);
                                                    rememberedValue9 = iyVar2;
                                                } else {
                                                    composer8 = composer6;
                                                    context6 = context12;
                                                    unVar7 = unVar10;
                                                    i21 = i15;
                                                    mutableState51 = mutableState46;
                                                    mutableState39 = mutableState97;
                                                    mutableState47 = mutableState28;
                                                    mutableState48 = mutableState29;
                                                    mutableState50 = mutableState34;
                                                    mutableState49 = mutableState96;
                                                }
                                                iy iyVar3 = (iy) rememberedValue9;
                                                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1097032913, true, new b9(mutableState50, mutableState47, mutableState51, 4), composer8, i21);
                                                mutableState29 = mutableState48;
                                                mutableState27 = mutableState51;
                                                unVar5 = unVar7;
                                                mutableState40 = mutableState49;
                                                Composer composer11 = composer8;
                                                context5 = context6;
                                                ButtonKt.Button(iyVar3, fillMaxWidth$default3, z6, m1056RoundedCornerShape0680j_42, null, null, null, null, null, rememberComposableLambda, composer11, 805306416, 496);
                                                composer7 = composer11;
                                                i18 = 6;
                                                SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer7, 6);
                                                obj = null;
                                                sharedPreferences5 = sharedPreferences11;
                                                CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1668665935, true, new d9(sharedPreferences11, mutableState84, mutableState83, animateFloatAsState, mutableState50), composer7, i21), composer7, 196614, 28);
                                            }
                                        }
                                        z6 = false;
                                        mutableState46 = mutableState27;
                                        changedInstance7 = composer6.changedInstance(context12) | (i25 != 131072 || ((i27 & Fields.ColorFilter) != 0 && composer6.changedInstance(cq0Var4))) | composer6.changed(mutableState46) | composer6.changedInstance(unVar10);
                                        rememberedValue9 = composer6.rememberedValue();
                                        if (changedInstance7) {
                                        }
                                        final cq0 cq0Var72 = cq0Var4;
                                        context6 = context12;
                                        composer8 = composer6;
                                        i21 = i15;
                                        mutableState47 = mutableState28;
                                        mutableState48 = mutableState29;
                                        final MutableState mutableState982 = mutableState34;
                                        mutableState49 = mutableState96;
                                        iy iyVar22 = new iy() { // from class: d70
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.iy
                                            public final Object invoke() {
                                                MutableState mutableState99 = mutableState982;
                                                if (!((Boolean) mutableState99.getValue()).booleanValue()) {
                                                    MutableState mutableState100 = mutableState60;
                                                    e80.h(mutableState100, 0);
                                                    Boolean bool5 = Boolean.FALSE;
                                                    MutableState mutableState101 = mutableState47;
                                                    mutableState101.setValue(bool5);
                                                    MutableState mutableState102 = mutableState49;
                                                    mutableState102.setValue("starting magic...\n");
                                                    mutableState99.setValue(Boolean.TRUE);
                                                    MutableState mutableState103 = mutableState46;
                                                    ku kuVar5 = (ku) mutableState103.getValue();
                                                    i3 i3Var = new i3(mutableState102, 13);
                                                    un unVar11 = unVar10;
                                                    cq0 cq0Var8 = cq0.this;
                                                    Context context13 = context6;
                                                    ((MainActivity) cq0Var8).j(context13, kuVar5, i3Var, new h70(unVar11, cq0Var8, context13, mutableState99, mutableState100, mutableState101, mutableState102, mutableState48, mutableState97, mutableState103, 0));
                                                }
                                                return w01.a;
                                            }
                                        };
                                        mutableState50 = mutableState982;
                                        mutableState51 = mutableState46;
                                        unVar7 = unVar10;
                                        mutableState39 = mutableState97;
                                        composer8.updateRememberedValue(iyVar22);
                                        rememberedValue9 = iyVar22;
                                        iy iyVar32 = (iy) rememberedValue9;
                                        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1097032913, true, new b9(mutableState50, mutableState47, mutableState51, 4), composer8, i21);
                                        mutableState29 = mutableState48;
                                        mutableState27 = mutableState51;
                                        unVar5 = unVar7;
                                        mutableState40 = mutableState49;
                                        Composer composer112 = composer8;
                                        context5 = context6;
                                        ButtonKt.Button(iyVar32, fillMaxWidth$default3, z6, m1056RoundedCornerShape0680j_42, null, null, null, null, null, rememberComposableLambda2, composer112, 805306416, 496);
                                        composer7 = composer112;
                                        i18 = 6;
                                        SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer7, 6);
                                        obj = null;
                                        sharedPreferences5 = sharedPreferences11;
                                        CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1668665935, true, new d9(sharedPreferences11, mutableState84, mutableState83, animateFloatAsState, mutableState50), composer7, i21), composer7, 196614, 28);
                                    }
                                    composer7.endReplaceGroup();
                                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer7, i18);
                                    if (g(mutableState39)) {
                                        composer7.startReplaceGroup(-836562431);
                                        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj);
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion6.getTop(), composer7, i18);
                                        int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                                        CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer7, fillMaxWidth$default4);
                                        iy constructor6 = companion8.getConstructor();
                                        if (composer7.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer7.startReusableNode();
                                        if (composer7.getInserting()) {
                                            composer7.createNode(constructor6);
                                        } else {
                                            composer7.useNode();
                                        }
                                        Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer7);
                                        uo.h(companion8, m3878constructorimpl6, rowMeasurePolicy, m3878constructorimpl6, currentCompositionLocalMap6);
                                        Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion8, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        ImageVector tune = TuneKt.getTune(icons2.getDefault());
                                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                        boolean changedInstance10 = composer7.changedInstance(context5);
                                        Object rememberedValue54 = composer7.rememberedValue();
                                        if (changedInstance10 || rememberedValue54 == companion5.getEmpty()) {
                                            rememberedValue54 = new b70(context5, 1);
                                            composer7.updateRememberedValue(rememberedValue54);
                                        }
                                        a(tune, "AIO Tweaks", "System, perf, display", weight$default, false, (iy) rememberedValue54, composer7, 432, 16);
                                        ImageVector apps = AppsKt.getApps(icons2.getDefault());
                                        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                        boolean changedInstance11 = composer7.changedInstance(context5);
                                        Object rememberedValue55 = composer7.rememberedValue();
                                        if (changedInstance11 || rememberedValue55 == companion5.getEmpty()) {
                                            rememberedValue55 = new b70(context5, 2);
                                            composer7.updateRememberedValue(rememberedValue55);
                                        }
                                        a(apps, "Apps/Modules", "Sideload and manage", weight$default2, false, (iy) rememberedValue55, composer7, 432, 16);
                                        composer7.endNode();
                                        SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer7, i18);
                                        Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion6.getTop(), composer7, i18);
                                        int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                                        CompositionLocalMap currentCompositionLocalMap7 = composer7.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer7, fillMaxWidth$default5);
                                        iy constructor7 = companion8.getConstructor();
                                        if (composer7.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer7.startReusableNode();
                                        if (composer7.getInserting()) {
                                            composer7.createNode(constructor7);
                                        } else {
                                            composer7.useNode();
                                        }
                                        Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer7);
                                        uo.h(companion8, m3878constructorimpl7, rowMeasurePolicy2, m3878constructorimpl7, currentCompositionLocalMap7);
                                        Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion8, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                                        ImageVector videogameAsset = VideogameAssetKt.getVideogameAsset(icons2.getDefault());
                                        Modifier weight$default3 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                        boolean changedInstance12 = composer7.changedInstance(context5);
                                        Object rememberedValue56 = composer7.rememberedValue();
                                        if (changedInstance12 || rememberedValue56 == companion5.getEmpty()) {
                                            i19 = 3;
                                            rememberedValue56 = new b70(context5, i19);
                                            composer7.updateRememberedValue(rememberedValue56);
                                        } else {
                                            i19 = 3;
                                        }
                                        a(videogameAsset, "Controllers", "Bindings and info", weight$default3, false, (iy) rememberedValue56, composer7, 432, 16);
                                        ImageVector code = CodeKt.getCode(icons2.getDefault());
                                        Modifier weight$default4 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                        companion3 = companion;
                                        boolean changedInstance13 = composer7.changedInstance(context5);
                                        Object rememberedValue57 = composer7.rememberedValue();
                                        if (changedInstance13 || rememberedValue57 == companion5.getEmpty()) {
                                            rememberedValue57 = new b70(context5, 4);
                                            composer7.updateRememberedValue(rememberedValue57);
                                        }
                                        a(code, "Terminal", "Root shell", weight$default4, false, (iy) rememberedValue57, composer7, 432, 16);
                                        composer7.endNode();
                                        SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(12.0f)), composer7, i18);
                                        composer7.endReplaceGroup();
                                        hmVar4 = null;
                                    } else {
                                        i19 = 3;
                                        composer7.startReplaceGroup(-834233990);
                                        Modifier fillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion6.getTop(), composer7, i18);
                                        int hashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                                        CompositionLocalMap currentCompositionLocalMap8 = composer7.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer7, fillMaxWidth$default6);
                                        iy constructor8 = companion8.getConstructor();
                                        if (composer7.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer7.startReusableNode();
                                        if (composer7.getInserting()) {
                                            composer7.createNode(constructor8);
                                        } else {
                                            composer7.useNode();
                                        }
                                        Composer m3878constructorimpl8 = Updater.m3878constructorimpl(composer7);
                                        uo.h(companion8, m3878constructorimpl8, rowMeasurePolicy3, m3878constructorimpl8, currentCompositionLocalMap8);
                                        Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, k4.c(companion8, m3878constructorimpl8, Integer.valueOf(hashCode8), m3878constructorimpl8));
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                        ImageVector tune2 = TuneKt.getTune(icons2.getDefault());
                                        Modifier weight$default5 = RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null);
                                        boolean changedInstance14 = composer7.changedInstance(context5);
                                        Object rememberedValue58 = composer7.rememberedValue();
                                        if (changedInstance14 || rememberedValue58 == companion5.getEmpty()) {
                                            rememberedValue58 = new b70(context5, 5);
                                            composer7.updateRememberedValue(rememberedValue58);
                                        }
                                        a(tune2, "AIO Tweaks", "System, perf, display", weight$default5, false, (iy) rememberedValue58, composer7, 432, 16);
                                        ImageVector apps2 = AppsKt.getApps(icons2.getDefault());
                                        Modifier weight$default6 = RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null);
                                        companion3 = companion;
                                        boolean changedInstance15 = composer7.changedInstance(context5);
                                        Object rememberedValue59 = composer7.rememberedValue();
                                        if (changedInstance15 || rememberedValue59 == companion5.getEmpty()) {
                                            rememberedValue59 = new b70(context5, i18);
                                            composer7.updateRememberedValue(rememberedValue59);
                                        }
                                        a(apps2, "Apps", "Sideload and manage", weight$default6, false, (iy) rememberedValue59, composer7, 432, 16);
                                        composer7.endNode();
                                        if (hr.c()) {
                                            hmVar4 = null;
                                            composer7.startReplaceGroup(-921130090);
                                        } else {
                                            composer7.startReplaceGroup(-833101033);
                                            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(8.0f)), composer7, i18);
                                            ImageVector code2 = CodeKt.getCode(icons2.getDefault());
                                            hmVar4 = null;
                                            Modifier fillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                            boolean changedInstance16 = composer7.changedInstance(context5);
                                            Object rememberedValue60 = composer7.rememberedValue();
                                            if (changedInstance16 || rememberedValue60 == companion5.getEmpty()) {
                                                rememberedValue60 = new b70(context5, 0);
                                                composer7.updateRememberedValue(rememberedValue60);
                                            }
                                            a(code2, "Terminal", "Wireless ADB shell", fillMaxWidth$default7, true, (iy) rememberedValue60, composer7, 28080, 0);
                                        }
                                        composer7.endReplaceGroup();
                                        SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(12.0f)), composer7, i18);
                                        composer7.endReplaceGroup();
                                    }
                                    Composer composer12 = composer7;
                                    int i31 = i18;
                                    TextKt.m2607TextNvy7gAk("Log output", null, materialTheme.getColorScheme(composer7, i11).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer7, i11).getLabelLarge(), composer12, 6, 0, 131066);
                                    startRestartGroup = composer12;
                                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(4.0f)), startRestartGroup, i31);
                                    MutableState mutableState99 = mutableState40;
                                    CardKt.Card(ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, hmVar4), 1.0f, false, 2, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-40310506, true, new u2(rememberScrollState, mutableState99, 2), startRestartGroup, 54), startRestartGroup, 196608, 28);
                                    String e = e(mutableState99);
                                    changed2 = startRestartGroup.changed(rememberScrollState);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue6 == companion5.getEmpty()) {
                                        rememberedValue6 = new d4(rememberScrollState, mutableState99, hmVar4, i31);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    EffectsKt.LaunchedEffect(e, (my) rememberedValue6, startRestartGroup, 0);
                                    startRestartGroup.endNode();
                                    j = j(mutableState14);
                                    if (j == null) {
                                        startRestartGroup.startReplaceGroup(2023832359);
                                        startRestartGroup.endReplaceGroup();
                                        mutableState41 = mutableState20;
                                        unVar6 = unVar5;
                                    } else {
                                        startRestartGroup.startReplaceGroup(2023832360);
                                        if (k(mutableState20)) {
                                            startRestartGroup.startReplaceGroup(1638220439);
                                            boolean l = l(mutableState68);
                                            float m = m(mutableState69);
                                            String n = n(mutableState3);
                                            un unVar11 = unVar5;
                                            boolean changedInstance17 = startRestartGroup.changedInstance(unVar11) | startRestartGroup.changedInstance(context5) | startRestartGroup.changed(j);
                                            Object rememberedValue61 = startRestartGroup.rememberedValue();
                                            if (changedInstance17 || rememberedValue61 == companion5.getEmpty()) {
                                                a11Var = j;
                                                rememberedValue61 = new r2(unVar11, context5, a11Var, mutableState68, mutableState69, mutableState3);
                                                unVar6 = unVar11;
                                                startRestartGroup.updateRememberedValue(rememberedValue61);
                                            } else {
                                                a11Var = j;
                                                unVar6 = unVar11;
                                            }
                                            iy iyVar4 = (iy) rememberedValue61;
                                            Object rememberedValue62 = startRestartGroup.rememberedValue();
                                            if (rememberedValue62 == companion5.getEmpty()) {
                                                mutableState41 = mutableState20;
                                                rememberedValue62 = new j3(mutableState41, 11);
                                                startRestartGroup.updateRememberedValue(rememberedValue62);
                                            } else {
                                                mutableState41 = mutableState20;
                                            }
                                            y(a11Var, iyVar4, (iy) rememberedValue62, l, m, n, startRestartGroup, 384);
                                        } else {
                                            mutableState41 = mutableState20;
                                            unVar6 = unVar5;
                                            startRestartGroup.startReplaceGroup(1548312348);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    if (q(mutableState36)) {
                                        startRestartGroup.startReplaceGroup(2024819989);
                                        ku i32 = i(mutableState27);
                                        MutableState mutableState100 = mutableState27;
                                        SharedPreferences sharedPreferences12 = sharedPreferences5;
                                        boolean changed3 = startRestartGroup.changed(mutableState100) | startRestartGroup.changedInstance(sharedPreferences12);
                                        Object rememberedValue63 = startRestartGroup.rememberedValue();
                                        if (changed3 || rememberedValue63 == companion5.getEmpty()) {
                                            rememberedValue63 = new c70(sharedPreferences12, mutableState100, 0);
                                            startRestartGroup.updateRememberedValue(rememberedValue63);
                                        }
                                        ky kyVar11 = (ky) rememberedValue63;
                                        MainActivity mainActivity4 = (MainActivity) cq0Var;
                                        boolean q = mainActivity4.q(kuVar3);
                                        boolean p = mainActivity4.p(kuVar3);
                                        boolean r = r(mutableState76);
                                        boolean s = s(mutableState6);
                                        boolean t = t(mutableState7);
                                        MutableState mutableState101 = mutableState41;
                                        boolean u = u(mutableState8);
                                        boolean v = v(mutableState80);
                                        ie w = w(mutableState85);
                                        String x = x(mutableState82);
                                        boolean booleanValue2 = ((Boolean) mutableState29.getValue()).booleanValue();
                                        boolean changedInstance18 = startRestartGroup.changedInstance(sharedPreferences9);
                                        Object rememberedValue64 = startRestartGroup.rememberedValue();
                                        if (changedInstance18 || rememberedValue64 == companion5.getEmpty()) {
                                            kuVar2 = i32;
                                            rememberedValue64 = new c70(sharedPreferences9, mutableState76, 1);
                                            startRestartGroup.updateRememberedValue(rememberedValue64);
                                        } else {
                                            kuVar2 = i32;
                                        }
                                        ky kyVar12 = (ky) rememberedValue64;
                                        boolean changedInstance19 = startRestartGroup.changedInstance(sharedPreferences9);
                                        Object rememberedValue65 = startRestartGroup.rememberedValue();
                                        if (changedInstance19 || rememberedValue65 == companion5.getEmpty()) {
                                            kyVar3 = kyVar12;
                                            rememberedValue65 = new c70(sharedPreferences9, mutableState6, 2);
                                            startRestartGroup.updateRememberedValue(rememberedValue65);
                                        } else {
                                            kyVar3 = kyVar12;
                                        }
                                        ky kyVar13 = (ky) rememberedValue65;
                                        boolean changedInstance20 = startRestartGroup.changedInstance(sharedPreferences9);
                                        Object rememberedValue66 = startRestartGroup.rememberedValue();
                                        if (changedInstance20 || rememberedValue66 == companion5.getEmpty()) {
                                            kyVar4 = kyVar13;
                                            rememberedValue66 = new c70(sharedPreferences9, mutableState7, 3);
                                            startRestartGroup.updateRememberedValue(rememberedValue66);
                                        } else {
                                            kyVar4 = kyVar13;
                                        }
                                        ky kyVar14 = (ky) rememberedValue66;
                                        boolean changedInstance21 = startRestartGroup.changedInstance(sharedPreferences9);
                                        Object rememberedValue67 = startRestartGroup.rememberedValue();
                                        if (changedInstance21 || rememberedValue67 == companion5.getEmpty()) {
                                            kyVar5 = kyVar14;
                                            rememberedValue67 = new c70(sharedPreferences9, mutableState8, 4);
                                            startRestartGroup.updateRememberedValue(rememberedValue67);
                                        } else {
                                            kyVar5 = kyVar14;
                                        }
                                        ky kyVar15 = (ky) rememberedValue67;
                                        boolean changedInstance22 = startRestartGroup.changedInstance(sharedPreferences9);
                                        Object rememberedValue68 = startRestartGroup.rememberedValue();
                                        if (changedInstance22 || rememberedValue68 == companion5.getEmpty()) {
                                            kyVar6 = kyVar15;
                                            rememberedValue68 = new c70(sharedPreferences9, mutableState80, 5);
                                            startRestartGroup.updateRememberedValue(rememberedValue68);
                                        } else {
                                            kyVar6 = kyVar15;
                                        }
                                        ky kyVar16 = (ky) rememberedValue68;
                                        boolean changedInstance23 = startRestartGroup.changedInstance(sharedPreferences9);
                                        Object rememberedValue69 = startRestartGroup.rememberedValue();
                                        if (changedInstance23 || rememberedValue69 == companion5.getEmpty()) {
                                            kyVar7 = kyVar16;
                                            mutableState45 = mutableState85;
                                            rememberedValue69 = new c70(sharedPreferences9, mutableState45, 6);
                                            startRestartGroup.updateRememberedValue(rememberedValue69);
                                        } else {
                                            kyVar7 = kyVar16;
                                            mutableState45 = mutableState85;
                                        }
                                        ky kyVar17 = (ky) rememberedValue69;
                                        boolean changedInstance24 = startRestartGroup.changedInstance(sharedPreferences9);
                                        Object rememberedValue70 = startRestartGroup.rememberedValue();
                                        if (changedInstance24) {
                                            kyVar8 = kyVar17;
                                        } else {
                                            kyVar8 = kyVar17;
                                            if (rememberedValue70 != companion5.getEmpty()) {
                                                kyVar9 = kyVar11;
                                                ky kyVar18 = (ky) rememberedValue70;
                                                changedInstance6 = startRestartGroup.changedInstance(sharedPreferences12);
                                                rememberedValue7 = startRestartGroup.rememberedValue();
                                                if (!changedInstance6 || rememberedValue7 == companion5.getEmpty()) {
                                                    rememberedValue7 = new c70(sharedPreferences12, mutableState29, 7);
                                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                                }
                                                ky kyVar19 = (ky) rememberedValue7;
                                                rememberedValue8 = startRestartGroup.rememberedValue();
                                                if (rememberedValue8 == companion5.getEmpty()) {
                                                    rememberedValue8 = new j3(mutableState36, i16);
                                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                                }
                                                iy iyVar5 = (iy) rememberedValue8;
                                                mutableState42 = mutableState101;
                                                ky kyVar20 = kyVar;
                                                sharedPreferences6 = sharedPreferences12;
                                                i20 = 1933978860;
                                                b(kyVar20, kuVar2, kyVar9, q, p, r, s, t, u, v, w, x, booleanValue2, kyVar3, kyVar4, kyVar5, kyVar6, kyVar7, kyVar8, kyVar18, kyVar19, iyVar5, startRestartGroup, 0, 0, 48);
                                                kyVar2 = kyVar20;
                                                startRestartGroup = startRestartGroup;
                                            }
                                        }
                                        kyVar9 = kyVar11;
                                        rememberedValue70 = new f1(sharedPreferences9, mutableState45, mutableState82, 13);
                                        startRestartGroup.updateRememberedValue(rememberedValue70);
                                        ky kyVar182 = (ky) rememberedValue70;
                                        changedInstance6 = startRestartGroup.changedInstance(sharedPreferences12);
                                        rememberedValue7 = startRestartGroup.rememberedValue();
                                        if (!changedInstance6) {
                                        }
                                        rememberedValue7 = new c70(sharedPreferences12, mutableState29, 7);
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                        ky kyVar192 = (ky) rememberedValue7;
                                        rememberedValue8 = startRestartGroup.rememberedValue();
                                        if (rememberedValue8 == companion5.getEmpty()) {
                                        }
                                        iy iyVar52 = (iy) rememberedValue8;
                                        mutableState42 = mutableState101;
                                        ky kyVar202 = kyVar;
                                        sharedPreferences6 = sharedPreferences12;
                                        i20 = 1933978860;
                                        b(kyVar202, kuVar2, kyVar9, q, p, r, s, t, u, v, w, x, booleanValue2, kyVar3, kyVar4, kyVar5, kyVar6, kyVar7, kyVar8, kyVar182, kyVar192, iyVar52, startRestartGroup, 0, 0, 48);
                                        kyVar2 = kyVar202;
                                        startRestartGroup = startRestartGroup;
                                    } else {
                                        i20 = 1933978860;
                                        mutableState42 = mutableState41;
                                        kyVar2 = kyVar;
                                        sharedPreferences6 = sharedPreferences5;
                                        startRestartGroup.startReplaceGroup(1933978860);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    if (o(mutableState38)) {
                                        startRestartGroup.startReplaceGroup(2027519035);
                                        String str2 = context5.getPackageManager().getPackageInfo(context5.getPackageName(), 0).versionName;
                                        if (str2 == null) {
                                            str2 = "Unknown";
                                        }
                                        String str3 = str2;
                                        boolean booleanValue3 = ((Boolean) mutableState18.getValue()).booleanValue();
                                        String p2 = p(mutableState19);
                                        boolean changedInstance25 = startRestartGroup.changedInstance(sharedPreferences6);
                                        Object rememberedValue71 = startRestartGroup.rememberedValue();
                                        if (changedInstance25 || rememberedValue71 == companion5.getEmpty()) {
                                            mutableState43 = mutableState19;
                                            rememberedValue71 = new c70(sharedPreferences6, mutableState43, 8);
                                            startRestartGroup.updateRememberedValue(rememberedValue71);
                                        } else {
                                            mutableState43 = mutableState19;
                                        }
                                        ky kyVar21 = (ky) rememberedValue71;
                                        boolean changedInstance26 = startRestartGroup.changedInstance(sharedPreferences6);
                                        Object rememberedValue72 = startRestartGroup.rememberedValue();
                                        if (changedInstance26 || rememberedValue72 == companion5.getEmpty()) {
                                            rememberedValue72 = new c70(sharedPreferences6, mutableState18, 9);
                                            startRestartGroup.updateRememberedValue(rememberedValue72);
                                        }
                                        ky kyVar22 = (ky) rememberedValue72;
                                        final Animatable animatable4 = animatable2;
                                        boolean changedInstance27 = startRestartGroup.changedInstance(unVar6) | startRestartGroup.changedInstance(animatable4) | startRestartGroup.changedInstance(context5) | startRestartGroup.changed(kyVar2);
                                        Object rememberedValue73 = startRestartGroup.rememberedValue();
                                        if (changedInstance27 || rememberedValue73 == companion5.getEmpty()) {
                                            final Context context13 = context5;
                                            final un unVar12 = unVar6;
                                            final ky kyVar23 = kyVar2;
                                            final MutableState mutableState102 = mutableState43;
                                            final MutableState mutableState103 = mutableState42;
                                            final MutableState mutableState104 = mutableState14;
                                            rememberedValue73 = new iy() { // from class: e70
                                                @Override // defpackage.iy
                                                public final Object invoke() {
                                                    MutableState.this.setValue(Boolean.FALSE);
                                                    p01.t(unVar12, null, null, new qa(true, context13, kyVar23, animatable4, mutableState65, mutableState102, mutableState104, mutableState103, null), 3);
                                                    return w01.a;
                                                }
                                            };
                                            mutableState44 = mutableState38;
                                            startRestartGroup.updateRememberedValue(rememberedValue73);
                                        } else {
                                            mutableState44 = mutableState38;
                                        }
                                        iy iyVar6 = (iy) rememberedValue73;
                                        Object rememberedValue74 = startRestartGroup.rememberedValue();
                                        if (rememberedValue74 == companion5.getEmpty()) {
                                            rememberedValue74 = new j3(mutableState44, 13);
                                            startRestartGroup.updateRememberedValue(rememberedValue74);
                                        }
                                        Composer composer13 = startRestartGroup;
                                        z(booleanValue3, str3, p2, kyVar21, kyVar22, iyVar6, (iy) rememberedValue74, composer13, 1572864);
                                        startRestartGroup = composer13;
                                    } else {
                                        startRestartGroup.startReplaceGroup(i20);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    SnackbarHostKt.SnackbarHost(snackbarHostState, boxScopeInstance2.align(companion3, companion6.getBottomCenter()), null, startRestartGroup, 6, 4);
                                    startRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                            composer6 = composer5;
                            i17 = i13;
                            composer6.startReplaceGroup(-921130090);
                            composer6.endReplaceGroup();
                            boolean booleanValue4 = ((Boolean) mutableState26.getValue()).booleanValue();
                            if (d(mutableState24)) {
                            }
                            composer7.endReplaceGroup();
                            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer7, i18);
                            if (g(mutableState39)) {
                            }
                            Composer composer122 = composer7;
                            int i312 = i18;
                            TextKt.m2607TextNvy7gAk("Log output", null, materialTheme.getColorScheme(composer7, i11).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer7, i11).getLabelLarge(), composer122, 6, 0, 131066);
                            startRestartGroup = composer122;
                            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(4.0f)), startRestartGroup, i312);
                            MutableState mutableState992 = mutableState40;
                            CardKt.Card(ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, hmVar4), 1.0f, false, 2, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-40310506, true, new u2(rememberScrollState, mutableState992, 2), startRestartGroup, 54), startRestartGroup, 196608, 28);
                            String e2 = e(mutableState992);
                            changed2 = startRestartGroup.changed(rememberScrollState);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue6 = new d4(rememberScrollState, mutableState992, hmVar4, i312);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                            EffectsKt.LaunchedEffect(e2, (my) rememberedValue6, startRestartGroup, 0);
                            startRestartGroup.endNode();
                            j = j(mutableState14);
                            if (j == null) {
                            }
                            if (q(mutableState36)) {
                            }
                            startRestartGroup.endReplaceGroup();
                            if (o(mutableState38)) {
                            }
                            startRestartGroup.endReplaceGroup();
                            SnackbarHostKt.SnackbarHost(snackbarHostState, boxScopeInstance2.align(companion3, companion6.getBottomCenter()), null, startRestartGroup, 6, 4);
                            startRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                    boxScopeInstance2 = boxScopeInstance;
                    icons2 = icons;
                    i13 = 6;
                    i14 = 1;
                    i15 = 54;
                    i16 = 12;
                    cq0Var4 = cq0Var;
                    composer5.startReplaceGroup(-921130090);
                    composer5.endReplaceGroup();
                    int i302 = 5;
                    if (!d(mutableState24)) {
                        if (!((MainActivity) cq0Var4).q(i(mutableState27))) {
                        }
                    }
                    composer6 = composer5;
                    i17 = i13;
                    composer6.startReplaceGroup(-921130090);
                    composer6.endReplaceGroup();
                    boolean booleanValue42 = ((Boolean) mutableState26.getValue()).booleanValue();
                    if (d(mutableState24)) {
                    }
                    composer7.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer7, i18);
                    if (g(mutableState39)) {
                    }
                    Composer composer1222 = composer7;
                    int i3122 = i18;
                    TextKt.m2607TextNvy7gAk("Log output", null, materialTheme.getColorScheme(composer7, i11).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer7, i11).getLabelLarge(), composer1222, 6, 0, 131066);
                    startRestartGroup = composer1222;
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(4.0f)), startRestartGroup, i3122);
                    MutableState mutableState9922 = mutableState40;
                    CardKt.Card(ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, hmVar4), 1.0f, false, 2, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-40310506, true, new u2(rememberScrollState, mutableState9922, 2), startRestartGroup, 54), startRestartGroup, 196608, 28);
                    String e22 = e(mutableState9922);
                    changed2 = startRestartGroup.changed(rememberScrollState);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue6 = new d4(rememberScrollState, mutableState9922, hmVar4, i3122);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    EffectsKt.LaunchedEffect(e22, (my) rememberedValue6, startRestartGroup, 0);
                    startRestartGroup.endNode();
                    j = j(mutableState14);
                    if (j == null) {
                    }
                    if (q(mutableState36)) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (o(mutableState38)) {
                    }
                    startRestartGroup.endReplaceGroup();
                    SnackbarHostKt.SnackbarHost(snackbarHostState, boxScopeInstance2.align(companion3, companion6.getBottomCenter()), null, startRestartGroup, 6, 4);
                    startRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                cq0Var2 = cq0Var;
            }
            z4 = true;
            changedInstance = changedInstance9 | z4 | startRestartGroup.changedInstance(G);
            Object rememberedValue502 = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            hmVar2 = hmVar5;
            composer2 = startRestartGroup;
            cq0 cq0Var52 = cq0Var2;
            mutableState10 = mutableState58;
            mutableState11 = mutableState71;
            context = context7;
            u70Var = new u70(sharedPreferences7, context, mutableState10, mutableState59, mutableState11, unVar8, kyVar10, animatable3, mutableState65, mutableState73, mutableState66, mutableState67, cq0Var52, G, mutableState54, null);
            mutableState12 = mutableState59;
            kyVar = kyVar10;
            mutableState13 = mutableState73;
            mutableState14 = mutableState66;
            mutableState15 = mutableState67;
            mutableState16 = mutableState54;
            sharedPreferences2 = sharedPreferences7;
            unVar = unVar8;
            animatable = animatable3;
            cq0Var3 = cq0Var52;
            g80Var = G;
            composer2.updateRememberedValue(u70Var);
            EffectsKt.LaunchedEffect(w01.a, (my) u70Var, composer2, 6);
            ku i282 = i(mutableState2);
            Boolean valueOf6 = Boolean.valueOf(g(mutableState10));
            Boolean bool5 = (Boolean) mutableState.getValue();
            bool5.getClass();
            Boolean bool22 = (Boolean) mutableState12.getValue();
            bool22.getClass();
            objArr = new Object[]{i282, valueOf6, bool5, bool22, Boolean.valueOf(z), Boolean.valueOf(d(mutableState16))};
            MutableState mutableState872 = mutableState5;
            mutableState17 = mutableState2;
            changed = composer2.changed(mutableState872) | composer2.changedInstance(context) | composer2.changed(mutableState17) | (i25 != 131072 || ((i27 & Fields.ColorFilter) != 0 && composer2.changedInstance(cq0Var3))) | composer2.changedInstance(g80Var);
            Object rememberedValue512 = composer2.rememberedValue();
            if (changed) {
            }
            objArr2 = objArr;
            mutableState18 = mutableState11;
            animatable2 = animatable;
            sharedPreferences3 = sharedPreferences2;
            unVar2 = unVar;
            mutableState19 = mutableState13;
            cq0 cq0Var62 = cq0Var3;
            Context context82 = context;
            MutableState mutableState882 = mutableState10;
            MutableState mutableState892 = mutableState16;
            MutableState mutableState902 = mutableState12;
            MutableState mutableState912 = mutableState;
            mutableState20 = mutableState15;
            w70Var = new w70(mutableState902, mutableState882, mutableState912, mutableState872, mutableState892, context82, mutableState56, g80Var, cq0Var62, mutableState17, null);
            mutableState10 = mutableState882;
            context = context82;
            mutableState21 = mutableState56;
            mutableState22 = mutableState912;
            mutableState23 = mutableState902;
            mutableState24 = mutableState892;
            cq0Var3 = cq0Var62;
            composer2.updateRememberedValue(w70Var);
            EffectsKt.LaunchedEffect(objArr2, (my) w70Var, composer2, 0);
            Boolean valueOf22 = Boolean.valueOf(z);
            Boolean bool32 = (Boolean) mutableState22.getValue();
            bool32.getClass();
            Boolean bool42 = (Boolean) mutableState23.getValue();
            bool42.getClass();
            i8 = i27 & 14;
            changedInstance2 = (i8 != 4) | composer2.changedInstance(context) | composer2.changedInstance(sharedPreferences3) | (i25 != 131072 || ((i27 & Fields.ColorFilter) != 0 && composer2.changedInstance(cq0Var3))) | composer2.changed(mutableState17) | composer2.changedInstance(unVar2);
            Object rememberedValue522 = composer2.rememberedValue();
            if (changedInstance2) {
            }
            SharedPreferences sharedPreferences102 = sharedPreferences3;
            un unVar92 = unVar2;
            i9 = i8;
            MutableState mutableState922 = mutableState21;
            MutableState mutableState932 = mutableState10;
            y70Var = new y70(z, context, cq0Var3, mutableState23, mutableState57, mutableState932, mutableState22, mutableState922, sharedPreferences102, mutableState60, mutableState17, unVar92, mutableState62, mutableState63, null);
            mutableState25 = mutableState57;
            mutableState26 = mutableState22;
            sharedPreferences4 = sharedPreferences102;
            mutableState27 = mutableState17;
            mutableState28 = mutableState62;
            mutableState29 = mutableState63;
            mutableState30 = mutableState23;
            mutableState31 = mutableState932;
            mutableState32 = mutableState922;
            unVar3 = unVar92;
            context2 = context;
            composer2.updateRememberedValue(y70Var);
            composer3 = composer2;
            EffectsKt.LaunchedEffect(valueOf22, bool32, bool42, (my) y70Var, composer3, i9);
            Boolean valueOf32 = Boolean.valueOf(z2);
            changedInstance3 = composer3.changedInstance(context2) | ((i27 & 112) != 32);
            rememberedValue = composer3.rememberedValue();
            if (changedInstance3) {
            }
            Context context92 = context2;
            hm hmVar62 = hmVar2;
            rememberedValue = new z70(z2, context92, mutableState32, hmVar62, 0);
            context3 = context92;
            mutableState33 = mutableState32;
            hmVar3 = hmVar62;
            composer3.updateRememberedValue(rememberedValue);
            EffectsKt.LaunchedEffect(valueOf32, (my) rememberedValue, composer3, (i27 >> 3) & 14);
            Boolean valueOf42 = Boolean.valueOf(z3);
            if ((i27 & 896) != 256) {
            }
            z5 = ((i27 & 7168) != 2048) | ((i27 & 896) != 256);
            rememberedValue2 = composer3.rememberedValue();
            if (z5) {
            }
            i10 = 14;
            rememberedValue2 = new a80(z3, iyVar, hmVar3, 0);
            composer3.updateRememberedValue(rememberedValue2);
            EffectsKt.LaunchedEffect(valueOf42, (my) rememberedValue2, composer3, (i27 >> 6) & 14);
            Boolean valueOf52 = Boolean.valueOf(g(mutableState31));
            changedInstance4 = composer3.changedInstance(sharedPreferences4) | composer3.changedInstance(context3);
            rememberedValue3 = composer3.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue3 = new g4(sharedPreferences4, mutableState31, context3, hmVar3);
            composer3.updateRememberedValue(rememberedValue3);
            EffectsKt.LaunchedEffect(valueOf52, (my) rememberedValue3, composer3, 0);
            y40Var = (y40) composer3.consume(x50.a);
            changedInstance5 = composer3.changedInstance(unVar3) | composer3.changedInstance(context3) | composer3.changedInstance(y40Var);
            rememberedValue4 = composer3.rememberedValue();
            if (changedInstance5) {
            }
            Context context102 = context3;
            unVar4 = unVar3;
            MutableState mutableState942 = mutableState25;
            MutableState mutableState952 = mutableState31;
            rememberedValue4 = new g70(y40Var, unVar4, mutableState30, mutableState942, context102, mutableState952);
            y40Var2 = y40Var;
            mutableState34 = mutableState942;
            context4 = context102;
            mutableState35 = mutableState952;
            composer3.updateRememberedValue(rememberedValue4);
            EffectsKt.DisposableEffect(y40Var2, (ky) rememberedValue4, composer3, 0);
            companion = Modifier.Companion;
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, hmVar3);
            Alignment.Companion companion62 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion62.getTopStart(), false);
            int hashCode9 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default2);
            ComposeUiNode.Companion companion72 = ComposeUiNode.Companion;
            iy constructor9 = companion72.getConstructor();
            if (composer3.getApplier() == null) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            Composer m3878constructorimpl9 = Updater.m3878constructorimpl(composer3);
            uo.h(companion72, m3878constructorimpl9, maybeCachedBoxMeasurePolicy3, m3878constructorimpl9, currentCompositionLocalMap9);
            Updater.m3886setimpl(m3878constructorimpl9, materializeModifier9, k4.c(companion72, m3878constructorimpl9, Integer.valueOf(hashCode9), m3878constructorimpl9));
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m762padding3ABfNKs2 = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7611constructorimpl(16.0f));
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MutableState mutableState962 = mutableState33;
            MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion62.getStart(), composer3, 0);
            int hashCode22 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, m762padding3ABfNKs2);
            iy constructor22 = companion72.getConstructor();
            if (composer3.getApplier() == null) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            Composer m3878constructorimpl22 = Updater.m3878constructorimpl(composer3);
            uo.h(companion72, m3878constructorimpl22, columnMeasurePolicy4, m3878constructorimpl22, currentCompositionLocalMap22);
            Updater.m3886setimpl(m3878constructorimpl22, materializeModifier22, k4.c(companion72, m3878constructorimpl22, Integer.valueOf(hashCode22), m3878constructorimpl22));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion62.getCenter(), false);
            int hashCode32 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default8);
            iy constructor32 = companion72.getConstructor();
            if (composer3.getApplier() == null) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            Composer m3878constructorimpl32 = Updater.m3878constructorimpl(composer3);
            uo.h(companion72, m3878constructorimpl32, maybeCachedBoxMeasurePolicy22, m3878constructorimpl32, currentCompositionLocalMap32);
            Updater.m3886setimpl(m3878constructorimpl32, materializeModifier32, k4.c(companion72, m3878constructorimpl32, Integer.valueOf(hashCode32), m3878constructorimpl32));
            materialTheme = MaterialTheme.INSTANCE;
            i11 = MaterialTheme.$stable;
            SharedPreferences sharedPreferences112 = sharedPreferences4;
            final MutableState mutableState972 = mutableState35;
            int i292 = i10;
            final un unVar102 = unVar4;
            Context context122 = context4;
            TextKt.m2607TextNvy7gAk("Singularity", null, materialTheme.getColorScheme(composer3, i11).m1772getPrimary0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i11).getHeadlineLarge(), composer3, 6, 0, 131066);
            composer4 = composer3;
            if (d(mutableState24)) {
            }
            composer4.endReplaceGroup();
            Modifier align22 = boxScopeInstance.align(companion, companion62.getCenterEnd());
            rememberedValue5 = composer4.rememberedValue();
            if (rememberedValue5 != companion5.getEmpty()) {
            }
            Modifier m262clickableoSLSa3U$default22 = ClickableKt.m262clickableoSLSa3U$default(align22, false, null, null, null, (iy) rememberedValue5, 15, null);
            MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion62.getCenterHorizontally(), composer4, i12);
            int hashCode52 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
            CompositionLocalMap currentCompositionLocalMap52 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(composer4, m262clickableoSLSa3U$default22);
            iy constructor52 = companion2.getConstructor();
            if (composer4.getApplier() == null) {
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
            }
            Composer m3878constructorimpl52 = Updater.m3878constructorimpl(composer4);
            ComposeUiNode.Companion companion82 = companion2;
            uo.h(companion82, m3878constructorimpl52, columnMeasurePolicy32, m3878constructorimpl52, currentCompositionLocalMap52);
            Updater.m3886setimpl(m3878constructorimpl52, materializeModifier52, k4.c(companion82, m3878constructorimpl52, Integer.valueOf(hashCode52), m3878constructorimpl52));
            icons = Icons.INSTANCE;
            Composer composer92 = composer4;
            mutableState38 = mutableState37;
            IconKt.m2055Iconww6aTOc(SyncKt.getSync(icons.getDefault()), "Updater", RotateKt.rotate(SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(22.0f)), ((Number) animatable2.getValue()).floatValue()), materialTheme.getColorScheme(composer4, i11).m1772getPrimary0d7_KjU(), composer92, 48, 0);
            TextKt.m2607TextNvy7gAk("Updater", null, materialTheme.getColorScheme(composer92, i11).m1772getPrimary0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer92, i11).getLabelSmall(), composer92, 6, 0, 131066);
            composer92.endNode();
            composer92.endNode();
            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer92, 6);
            CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(16.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-973485026, true, new xl(2, mutableState972, cq0Var), composer92, 54), composer92, 196614, 28);
            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer92, 6);
            composer5 = composer92;
            CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(796484437, true, new d9(sharedPreferences112, cq0Var, mutableState55, mutableState24, mutableState27, 2), composer92, 54), composer5, 196614, 28);
            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer5, 6);
            if (!d(mutableState24)) {
                mainActivity = (MainActivity) cq0Var;
                if (mainActivity.q(i(mutableState27))) {
                    composer5.startReplaceGroup(-845009714);
                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    RoundedCornerShape m1056RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    i16 = 12;
                    boxScopeInstance2 = boxScopeInstance;
                    icons2 = icons;
                    i14 = 1;
                    cq0Var4 = cq0Var;
                    CardColors m1678cardColorsro_MJ882 = CardDefaults.INSTANCE.m1678cardColorsro_MJ88(materialTheme.getColorScheme(composer5, i11).m1749getErrorContainer0d7_KjU(), 0L, 0L, 0L, composer5, CardDefaults.$stable << 12, 14);
                    composer5 = composer5;
                    i15 = 54;
                    CardKt.Card(fillMaxWidth$default22, m1056RoundedCornerShape0680j_43, m1678cardColorsro_MJ882, null, null, ComposableLambdaKt.rememberComposableLambda(-300319879, true, new xk(cq0Var4), composer5, 54), composer5, 196614, 24);
                    i13 = 6;
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer5, 6);
                    composer5.endReplaceGroup();
                    int i3022 = 5;
                    if (!d(mutableState24)) {
                    }
                    composer6 = composer5;
                    i17 = i13;
                    composer6.startReplaceGroup(-921130090);
                    composer6.endReplaceGroup();
                    boolean booleanValue422 = ((Boolean) mutableState26.getValue()).booleanValue();
                    if (d(mutableState24)) {
                    }
                    composer7.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer7, i18);
                    if (g(mutableState39)) {
                    }
                    Composer composer12222 = composer7;
                    int i31222 = i18;
                    TextKt.m2607TextNvy7gAk("Log output", null, materialTheme.getColorScheme(composer7, i11).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer7, i11).getLabelLarge(), composer12222, 6, 0, 131066);
                    startRestartGroup = composer12222;
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(4.0f)), startRestartGroup, i31222);
                    MutableState mutableState99222 = mutableState40;
                    CardKt.Card(ColumnScope.weight$default(columnScopeInstance2, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, hmVar4), 1.0f, false, 2, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-40310506, true, new u2(rememberScrollState, mutableState99222, 2), startRestartGroup, 54), startRestartGroup, 196608, 28);
                    String e222 = e(mutableState99222);
                    changed2 = startRestartGroup.changed(rememberScrollState);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue6 = new d4(rememberScrollState, mutableState99222, hmVar4, i31222);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    EffectsKt.LaunchedEffect(e222, (my) rememberedValue6, startRestartGroup, 0);
                    startRestartGroup.endNode();
                    j = j(mutableState14);
                    if (j == null) {
                    }
                    if (q(mutableState36)) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (o(mutableState38)) {
                    }
                    startRestartGroup.endReplaceGroup();
                    SnackbarHostKt.SnackbarHost(snackbarHostState, boxScopeInstance2.align(companion3, companion62.getBottomCenter()), null, startRestartGroup, 6, 4);
                    startRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            boxScopeInstance2 = boxScopeInstance;
            icons2 = icons;
            i13 = 6;
            i14 = 1;
            i15 = 54;
            i16 = 12;
            cq0Var4 = cq0Var;
            composer5.startReplaceGroup(-921130090);
            composer5.endReplaceGroup();
            int i30222 = 5;
            if (!d(mutableState24)) {
            }
            composer6 = composer5;
            i17 = i13;
            composer6.startReplaceGroup(-921130090);
            composer6.endReplaceGroup();
            boolean booleanValue4222 = ((Boolean) mutableState26.getValue()).booleanValue();
            if (d(mutableState24)) {
            }
            composer7.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer7, i18);
            if (g(mutableState39)) {
            }
            Composer composer122222 = composer7;
            int i312222 = i18;
            TextKt.m2607TextNvy7gAk("Log output", null, materialTheme.getColorScheme(composer7, i11).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer7, i11).getLabelLarge(), composer122222, 6, 0, 131066);
            startRestartGroup = composer122222;
            SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion3, Dp.m7611constructorimpl(4.0f)), startRestartGroup, i312222);
            MutableState mutableState992222 = mutableState40;
            CardKt.Card(ColumnScope.weight$default(columnScopeInstance2, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, hmVar4), 1.0f, false, 2, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-40310506, true, new u2(rememberScrollState, mutableState992222, 2), startRestartGroup, 54), startRestartGroup, 196608, 28);
            String e2222 = e(mutableState992222);
            changed2 = startRestartGroup.changed(rememberScrollState);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue6 = new d4(rememberScrollState, mutableState992222, hmVar4, i312222);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            EffectsKt.LaunchedEffect(e2222, (my) rememberedValue6, startRestartGroup, 0);
            startRestartGroup.endNode();
            j = j(mutableState14);
            if (j == null) {
            }
            if (q(mutableState36)) {
            }
            startRestartGroup.endReplaceGroup();
            if (o(mutableState38)) {
            }
            startRestartGroup.endReplaceGroup();
            SnackbarHostKt.SnackbarHost(snackbarHostState, boxScopeInstance2.align(companion3, companion62.getBottomCenter()), null, startRestartGroup, 6, 4);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: f70
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    e80.c(z, z2, z3, iyVar, intent, cq0Var, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return w01.a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean d(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String e(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean f(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean g(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void h(MutableState mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ku i(MutableState mutableState) {
        return (ku) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a11 j(MutableState mutableState) {
        return (a11) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean k(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean l(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float m(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String n(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean o(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String p(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean q(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean r(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean s(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean t(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean u(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean v(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ie w(MutableState mutableState) {
        return (ie) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String x(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    public static final void y(final a11 a11Var, final iy iyVar, final iy iyVar2, final boolean z, final float f, final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        MaterialTheme materialTheme;
        int i3;
        long m1773getPrimaryContainer0d7_KjU;
        long m1757getOnPrimaryContainer0d7_KjU;
        iyVar.getClass();
        iyVar2.getClass();
        str.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-262670135);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(a11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(f) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(str) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-262670135, i2, -1, "com.lumi.singularity.ui.activities.UpdateDialog (MainActivity.kt:2426)");
            }
            final boolean g0 = ds0.g0(str, "failed", true);
            final boolean z2 = g0 || ds0.g0(str, "Prompting system installer", true);
            if (g0) {
                startRestartGroup.startReplaceGroup(977084919);
                materialTheme = MaterialTheme.INSTANCE;
                i3 = MaterialTheme.$stable;
                m1773getPrimaryContainer0d7_KjU = materialTheme.getColorScheme(startRestartGroup, i3).m1749getErrorContainer0d7_KjU();
                startRestartGroup.endReplaceGroup();
            } else if (z2) {
                startRestartGroup.startReplaceGroup(977087482);
                materialTheme = MaterialTheme.INSTANCE;
                i3 = MaterialTheme.$stable;
                m1773getPrimaryContainer0d7_KjU = materialTheme.getColorScheme(startRestartGroup, i3).m1792getTertiaryContainer0d7_KjU();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(977089625);
                materialTheme = MaterialTheme.INSTANCE;
                i3 = MaterialTheme.$stable;
                m1773getPrimaryContainer0d7_KjU = materialTheme.getColorScheme(startRestartGroup, i3).m1773getPrimaryContainer0d7_KjU();
                startRestartGroup.endReplaceGroup();
            }
            if (g0) {
                startRestartGroup.startReplaceGroup(977092057);
                m1757getOnPrimaryContainer0d7_KjU = materialTheme.getColorScheme(startRestartGroup, i3).m1755getOnErrorContainer0d7_KjU();
                startRestartGroup.endReplaceGroup();
            } else if (z2) {
                startRestartGroup.startReplaceGroup(977094716);
                m1757getOnPrimaryContainer0d7_KjU = materialTheme.getColorScheme(startRestartGroup, i3).m1767getOnTertiaryContainer0d7_KjU();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(977096955);
                m1757getOnPrimaryContainer0d7_KjU = materialTheme.getColorScheme(startRestartGroup, i3).m1757getOnPrimaryContainer0d7_KjU();
                startRestartGroup.endReplaceGroup();
            }
            final long j = m1757getOnPrimaryContainer0d7_KjU;
            final ImageVector warning = g0 ? WarningKt.getWarning(Icons.INSTANCE.getDefault()) : z2 ? CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()) : SyncKt.getSync(Icons.INSTANCE.getDefault());
            boolean changed = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | startRestartGroup.changed(z2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new iy() { // from class: l70
                    @Override // defpackage.iy
                    public final Object invoke() {
                        if (!z || z2) {
                            iyVar2.invoke();
                        }
                        return w01.a;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            final boolean z3 = z2;
            final long j2 = m1773getPrimaryContainer0d7_KjU;
            AndroidAlertDialog_androidKt.m1600AlertDialogOix01E0((iy) rememberedValue, ComposableLambdaKt.rememberComposableLambda(1763987217, true, new h3(z, iyVar), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(358795539, true, new m70(iyVar2, z, z2, 0), startRestartGroup, 54), null, null, ComposableLambdaKt.rememberComposableLambda(-1748991978, true, new my() { // from class: n70
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    long m1764getOnSurface0d7_KjU;
                    Composer composer3;
                    Composer composer4 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (composer4.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1748991978, intValue, -1, "com.lumi.singularity.ui.activities.UpdateDialog.<anonymous> (MainActivity.kt:2444)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f)), companion2.getCenterHorizontally(), composer4, 54);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        iy constructor = companion3.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer4);
                        uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(ClipKt.clip(SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(72.0f)), RoundedCornerShapeKt.getCircleShape()), j2, null, 2, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m227backgroundbw27NRU$default);
                        iy constructor2 = companion3.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer4);
                        uo.h(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        IconKt.m2055Iconww6aTOc(warning, (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(36.0f)), j, composer4, 432, 0);
                        composer4.endNode();
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        int i4 = MaterialTheme.$stable;
                        TextStyle titleLarge = materialTheme2.getTypography(composer4, i4).getTitleLarge();
                        FontWeight semiBold = FontWeight.Companion.getSemiBold();
                        TextAlign.Companion companion4 = TextAlign.Companion;
                        TextKt.m2607TextNvy7gAk("Update Available", null, 0L, null, 0L, null, semiBold, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, titleLarge, composer4, 1572870, 0, 129982);
                        a11 a11Var2 = a11Var;
                        TextKt.m2607TextNvy7gAk("Version ".concat(a11Var2.a), null, materialTheme2.getColorScheme(composer4, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(companion4.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer4, i4).getBodySmall(), composer4, 0, 0, 130042);
                        if (z) {
                            composer4.startReplaceGroup(1828413156);
                            TextStyle bodyMedium = materialTheme2.getTypography(composer4, i4).getBodyMedium();
                            int m7489getCentere0LSkKk = companion4.m7489getCentere0LSkKk();
                            if (g0) {
                                composer4.startReplaceGroup(613175729);
                                m1764getOnSurface0d7_KjU = materialTheme2.getColorScheme(composer4, i4).m1748getError0d7_KjU();
                            } else {
                                composer4.startReplaceGroup(613176917);
                                m1764getOnSurface0d7_KjU = materialTheme2.getColorScheme(composer4, i4).m1764getOnSurface0d7_KjU();
                            }
                            composer4.endReplaceGroup();
                            TextKt.m2607TextNvy7gAk(str, null, m1764getOnSurface0d7_KjU, null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(m7489getCentere0LSkKk), 0L, 0, false, 0, 0, null, bodyMedium, composer4, 0, 0, 130042);
                            composer3 = composer4;
                            if (z3) {
                                composer3.startReplaceGroup(1714989302);
                            } else {
                                composer3.startReplaceGroup(1828673029);
                                float f2 = f;
                                boolean changed2 = composer3.changed(f2);
                                Object rememberedValue2 = composer3.rememberedValue();
                                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new r70(f2, 0);
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                ProgressIndicatorKt.m2270LinearProgressIndicatorGJbTh5U((iy) rememberedValue2, ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(8.0f))), 0L, 0L, 0, 0.0f, null, composer3, 0, 124);
                                TextKt.m2607TextNvy7gAk(((int) (f2 * 100.0f)) + "%", null, materialTheme2.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i4).getLabelSmall(), composer3, 0, 0, 131066);
                                composer3 = composer3;
                            }
                            composer3.endReplaceGroup();
                            composer3.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(1827613232);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                            CardColors m1678cardColorsro_MJ88 = CardDefaults.INSTANCE.m1678cardColorsro_MJ88(materialTheme2.getColorScheme(composer4, i4).m1790getSurfaceVariant0d7_KjU(), 0L, 0L, 0L, composer4, CardDefaults.$stable << 12, 14);
                            composer3 = composer4;
                            CardKt.Card(fillMaxWidth$default2, m1056RoundedCornerShape0680j_4, m1678cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(1874471705, true, new x6(a11Var2, 6), composer3, 54), composer3, 196614, 24);
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return w01.a;
                }
            }, composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: o70
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e80.y(a11.this, iyVar, iyVar2, z, f, str, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return w01.a;
                }
            });
        }
    }

    public static final void z(boolean z, String str, String str2, ky kyVar, ky kyVar2, iy iyVar, iy iyVar2, Composer composer, int i) {
        int i2;
        Composer composer2;
        str2.getClass();
        kyVar.getClass();
        kyVar2.getClass();
        iyVar.getClass();
        iyVar2.getClass();
        Composer startRestartGroup = composer.startRestartGroup(489382453);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar2) ? 1048576 : Fields.BlendMode;
        }
        if (startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489382453, i2, -1, "com.lumi.singularity.ui.activities.UpdateOptionsDialog (MainActivity.kt:2499)");
            }
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1600AlertDialogOix01E0(iyVar2, ComposableLambdaKt.rememberComposableLambda(1045571709, true, new l2(7, iyVar2), startRestartGroup, 54), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-876761214, true, new q70(str, iyVar, str2, kyVar, z, kyVar2), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 18) & 14) | 1769520, 0, 16284);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new vd(z, str, str2, kyVar, kyVar2, iyVar, iyVar2, i));
        }
    }
}
