package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DatePickerDialog_androidKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import defpackage.dq;
import defpackage.iy;
import defpackage.k4;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerDialog_androidKt {
    private static final PaddingValues DialogButtonsPadding = PaddingKt.m759PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m7611constructorimpl(6.0f), Dp.m7611constructorimpl(8.0f), 3, null);
    private static final float DialogButtonsMainAxisSpacing = Dp.m7611constructorimpl(8.0f);
    private static final float DialogButtonsCrossAxisSpacing = Dp.m7611constructorimpl(12.0f);

    /* JADX WARN: Removed duplicated region for block: B:108:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d9  */
    /* renamed from: DatePickerDialog-GmEhDVc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1881DatePickerDialogGmEhDVc(final iy iyVar, final my myVar, Modifier modifier, my myVar2, Shape shape, float f, DatePickerColors datePickerColors, DialogProperties dialogProperties, final ny nyVar, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        my myVar3;
        Shape shape2;
        int i6;
        float f2;
        final DatePickerColors datePickerColors2;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        final my myVar4;
        final Shape shape3;
        final float f3;
        final DialogProperties dialogProperties2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        DialogProperties dialogProperties3;
        final my myVar5;
        final float f4;
        int i11;
        Modifier modifier4;
        final Shape shape4;
        boolean z;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(219718641);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar3 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar3) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i13 = Fields.Clip;
                                i3 |= i13;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                datePickerColors2 = datePickerColors;
                                if (startRestartGroup.changed(datePickerColors2)) {
                                    i12 = 1048576;
                                    i3 |= i12;
                                }
                            } else {
                                datePickerColors2 = datePickerColors;
                            }
                            i12 = Fields.BlendMode;
                            i3 |= i12;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        i7 = i2 & Fields.SpotShadowColor;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(dialogProperties) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if ((i2 & Fields.RotationX) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            i8 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                composer2 = startRestartGroup;
                                modifier3 = modifier2;
                                myVar4 = myVar3;
                                shape3 = shape2;
                                f3 = f2;
                                dialogProperties2 = dialogProperties;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i5 != 0) {
                                        myVar3 = null;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i9 = i8 & (-57345);
                                        shape2 = DatePickerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    } else {
                                        i9 = i8;
                                    }
                                    if (i6 != 0) {
                                        f2 = DatePickerDefaults.INSTANCE.m1880getTonalElevationD9Ej5fM();
                                    }
                                    if ((i2 & 64) != 0) {
                                        datePickerColors2 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i10 = i9 & (-3670017);
                                    } else {
                                        i10 = i9;
                                    }
                                    if (i7 != 0) {
                                        dialogProperties3 = new DialogProperties(false, false, false, 3, (dq) null);
                                        myVar5 = myVar3;
                                        f4 = f2;
                                        i11 = i10;
                                        modifier4 = modifier2;
                                        shape4 = shape2;
                                        z = false;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(219718641, i11, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:74)");
                                        }
                                        AlertDialogKt.BasicAlertDialog(iyVar, SizeKt.wrapContentHeight$default(modifier4, null, z, 3, null), dialogProperties3, ComposableLambdaKt.rememberComposableLambda(1108953335, true, new my() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                            public final void invoke(Composer composer3, int i14) {
                                                if (!composer3.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1108953335, i14, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:80)");
                                                }
                                                Modifier.Companion companion = Modifier.Companion;
                                                DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                                                Modifier m795heightInVpY3zN4$default = SizeKt.m795heightInVpY3zN4$default(SizeKt.m804requiredWidth3ABfNKs(companion, datePickerModalTokens.m3209getContainerWidthD9Ej5fM()), 0.0f, datePickerModalTokens.m3208getContainerHeightD9Ej5fM(), 1, null);
                                                Shape shape5 = Shape.this;
                                                long m1853getContainerColor0d7_KjU = datePickerColors2.m1853getContainerColor0d7_KjU();
                                                float f5 = f4;
                                                final ny nyVar2 = nyVar;
                                                final my myVar6 = myVar5;
                                                final my myVar7 = myVar;
                                                SurfaceKt.m2464SurfaceT9BRK9s(m795heightInVpY3zN4$default, shape5, m1853getContainerColor0d7_KjU, 0L, f5, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1782015378, true, new my() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                                    public final void invoke(Composer composer4, int i15) {
                                                        PaddingValues paddingValues;
                                                        if (!composer4.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1782015378, i15, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:88)");
                                                        }
                                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                        ny nyVar3 = ny.this;
                                                        final my myVar8 = myVar6;
                                                        final my myVar9 = myVar7;
                                                        Modifier.Companion companion2 = Modifier.Companion;
                                                        Alignment.Companion companion3 = Alignment.Companion;
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, companion3.getStart(), composer4, 6);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, companion2);
                                                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                                        iy constructor = companion4.getConstructor();
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
                                                        my b = k4.b(companion4, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                        Modifier weight = columnScopeInstance.weight(companion2, 1.0f, false);
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, weight);
                                                        iy constructor2 = companion4.getConstructor();
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
                                                        my b2 = k4.b(companion4, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion4.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        nyVar3.invoke(columnScopeInstance, composer4, 6);
                                                        composer4.endNode();
                                                        Modifier align = columnScopeInstance.align(companion2, companion3.getEnd());
                                                        paddingValues = DatePickerDialog_androidKt.DialogButtonsPadding;
                                                        Modifier padding = PaddingKt.padding(align, paddingValues);
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, padding);
                                                        iy constructor3 = companion4.getConstructor();
                                                        if (composer4.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor3);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer4);
                                                        my b3 = k4.b(companion4, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                                                        if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion4.getSetModifier());
                                                        DialogTokens dialogTokens = DialogTokens.INSTANCE;
                                                        ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(ColorSchemeKt.getValue(dialogTokens.getActionLabelTextColor(), composer4, 6), TypographyKt.getValue(dialogTokens.getActionLabelTextFont(), composer4, 6), ComposableLambdaKt.rememberComposableLambda(-1103927529, true, new my() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                            public final void invoke(Composer composer5, int i16) {
                                                                float f6;
                                                                float f7;
                                                                if (!composer5.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1103927529, i16, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
                                                                }
                                                                f6 = DatePickerDialog_androidKt.DialogButtonsMainAxisSpacing;
                                                                f7 = DatePickerDialog_androidKt.DialogButtonsCrossAxisSpacing;
                                                                final my myVar10 = my.this;
                                                                final my myVar11 = myVar9;
                                                                AlertDialogKt.m1594AlertDialogFlowRowixp7dh8(f6, f7, ComposableLambdaKt.rememberComposableLambda(-1980163584, true, new my() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                                    public final void invoke(Composer composer6, int i17) {
                                                                        if (!composer6.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                                            composer6.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(-1980163584, i17, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                                                                        }
                                                                        my myVar12 = my.this;
                                                                        if (myVar12 == null) {
                                                                            composer6.startReplaceGroup(322524505);
                                                                        } else {
                                                                            composer6.startReplaceGroup(-266690648);
                                                                            myVar12.invoke(composer6, 0);
                                                                        }
                                                                        composer6.endReplaceGroup();
                                                                        myVar11.invoke(composer6, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }

                                                                    @Override // defpackage.my
                                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                                        return w01.a;
                                                                    }
                                                                }, composer5, 54), composer5, 438);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }

                                                            @Override // defpackage.my
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                                return w01.a;
                                                            }
                                                        }, composer4, 54), composer4, 384);
                                                        composer4.endNode();
                                                        composer4.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer3, 54), composer3, 12582918, 104);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, (i11 & 14) | 3072 | ((i11 >> 15) & 896), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        dialogProperties2 = dialogProperties3;
                                        f3 = f4;
                                        myVar4 = myVar5;
                                        modifier3 = modifier4;
                                        composer2 = startRestartGroup;
                                        shape3 = shape4;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i10 = (i2 & 16) != 0 ? i8 & (-57345) : i8;
                                    if ((i2 & 64) != 0) {
                                        i10 &= -3670017;
                                    }
                                }
                                dialogProperties3 = dialogProperties;
                                i11 = i10;
                                modifier4 = modifier2;
                                myVar5 = myVar3;
                                f4 = f2;
                                z = false;
                                shape4 = shape2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                AlertDialogKt.BasicAlertDialog(iyVar, SizeKt.wrapContentHeight$default(modifier4, null, z, 3, null), dialogProperties3, ComposableLambdaKt.rememberComposableLambda(1108953335, true, new my() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                    public final void invoke(Composer composer3, int i14) {
                                        if (!composer3.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1108953335, i14, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:80)");
                                        }
                                        Modifier.Companion companion = Modifier.Companion;
                                        DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                                        Modifier m795heightInVpY3zN4$default = SizeKt.m795heightInVpY3zN4$default(SizeKt.m804requiredWidth3ABfNKs(companion, datePickerModalTokens.m3209getContainerWidthD9Ej5fM()), 0.0f, datePickerModalTokens.m3208getContainerHeightD9Ej5fM(), 1, null);
                                        Shape shape5 = Shape.this;
                                        long m1853getContainerColor0d7_KjU = datePickerColors2.m1853getContainerColor0d7_KjU();
                                        float f5 = f4;
                                        final ny nyVar2 = nyVar;
                                        final my myVar6 = myVar5;
                                        final my myVar7 = myVar;
                                        SurfaceKt.m2464SurfaceT9BRK9s(m795heightInVpY3zN4$default, shape5, m1853getContainerColor0d7_KjU, 0L, f5, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1782015378, true, new my() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                            public final void invoke(Composer composer4, int i15) {
                                                PaddingValues paddingValues;
                                                if (!composer4.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1782015378, i15, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:88)");
                                                }
                                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                ny nyVar3 = ny.this;
                                                final my myVar8 = myVar6;
                                                final my myVar9 = myVar7;
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                Alignment.Companion companion3 = Alignment.Companion;
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, companion3.getStart(), composer4, 6);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, companion2);
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                                iy constructor = companion4.getConstructor();
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
                                                my b = k4.b(companion4, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                Modifier weight = columnScopeInstance.weight(companion2, 1.0f, false);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, weight);
                                                iy constructor2 = companion4.getConstructor();
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
                                                my b2 = k4.b(companion4, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion4.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                nyVar3.invoke(columnScopeInstance, composer4, 6);
                                                composer4.endNode();
                                                Modifier align = columnScopeInstance.align(companion2, companion3.getEnd());
                                                paddingValues = DatePickerDialog_androidKt.DialogButtonsPadding;
                                                Modifier padding = PaddingKt.padding(align, paddingValues);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, padding);
                                                iy constructor3 = companion4.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer4);
                                                my b3 = k4.b(companion4, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                                                if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion4.getSetModifier());
                                                DialogTokens dialogTokens = DialogTokens.INSTANCE;
                                                ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(ColorSchemeKt.getValue(dialogTokens.getActionLabelTextColor(), composer4, 6), TypographyKt.getValue(dialogTokens.getActionLabelTextFont(), composer4, 6), ComposableLambdaKt.rememberComposableLambda(-1103927529, true, new my() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                    public final void invoke(Composer composer5, int i16) {
                                                        float f6;
                                                        float f7;
                                                        if (!composer5.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1103927529, i16, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
                                                        }
                                                        f6 = DatePickerDialog_androidKt.DialogButtonsMainAxisSpacing;
                                                        f7 = DatePickerDialog_androidKt.DialogButtonsCrossAxisSpacing;
                                                        final my myVar10 = my.this;
                                                        final my myVar11 = myVar9;
                                                        AlertDialogKt.m1594AlertDialogFlowRowixp7dh8(f6, f7, ComposableLambdaKt.rememberComposableLambda(-1980163584, true, new my() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                            public final void invoke(Composer composer6, int i17) {
                                                                if (!composer6.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                                    composer6.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1980163584, i17, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                                                                }
                                                                my myVar12 = my.this;
                                                                if (myVar12 == null) {
                                                                    composer6.startReplaceGroup(322524505);
                                                                } else {
                                                                    composer6.startReplaceGroup(-266690648);
                                                                    myVar12.invoke(composer6, 0);
                                                                }
                                                                composer6.endReplaceGroup();
                                                                myVar11.invoke(composer6, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }

                                                            @Override // defpackage.my
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                                return w01.a;
                                                            }
                                                        }, composer5, 54), composer5, 438);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer4, 54), composer4, 384);
                                                composer4.endNode();
                                                composer4.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, composer3, 54), composer3, 12582918, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i11 & 14) | 3072 | ((i11 >> 15) & 896), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                dialogProperties2 = dialogProperties3;
                                f3 = f4;
                                myVar4 = myVar5;
                                modifier3 = modifier4;
                                composer2 = startRestartGroup;
                                shape3 = shape4;
                            }
                            final DatePickerColors datePickerColors3 = datePickerColors2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: gp
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 DatePickerDialog_GmEhDVc$lambda$0;
                                        int intValue = ((Integer) obj2).intValue();
                                        DatePickerDialog_GmEhDVc$lambda$0 = DatePickerDialog_androidKt.DatePickerDialog_GmEhDVc$lambda$0(iy.this, myVar, modifier3, myVar4, shape3, f3, datePickerColors3, dialogProperties2, nyVar, i, i2, (Composer) obj, intValue);
                                        return DatePickerDialog_GmEhDVc$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
                        }
                        final DatePickerColors datePickerColors32 = datePickerColors2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 != 0) {
                    }
                    if ((i2 & Fields.RotationX) != 0) {
                    }
                    i8 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
                    }
                    final DatePickerColors datePickerColors322 = datePickerColors2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar3 = myVar2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                }
                if ((i2 & Fields.RotationX) != 0) {
                }
                i8 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
                }
                final DatePickerColors datePickerColors3222 = datePickerColors2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            myVar3 = myVar2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            if ((i2 & Fields.RotationX) != 0) {
            }
            i8 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
            }
            final DatePickerColors datePickerColors32222 = datePickerColors2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        myVar3 = myVar2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        if ((i2 & Fields.RotationX) != 0) {
        }
        i8 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
        }
        final DatePickerColors datePickerColors322222 = datePickerColors2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerDialog_GmEhDVc$lambda$0(iy iyVar, my myVar, Modifier modifier, my myVar2, Shape shape, float f, DatePickerColors datePickerColors, DialogProperties dialogProperties, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1881DatePickerDialogGmEhDVc(iyVar, myVar, modifier, myVar2, shape, f, datePickerColors, dialogProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
