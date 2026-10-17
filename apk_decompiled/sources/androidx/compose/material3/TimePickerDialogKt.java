package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TimePickerDialogKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import defpackage.dq;
import defpackage.iy;
import defpackage.k4;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;
import defpackage.z5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerDialogKt {
    public static final void TimePickerCustomLayout(final my myVar, final my myVar2, final ny nyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-493479138);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-493479138, i2, -1, "androidx.compose.material3.TimePickerCustomLayout (TimePickerDialog.kt:130)");
            }
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(468305759, true, new my() { // from class: androidx.compose.material3.TimePickerDialogKt$TimePickerCustomLayout$content$1
                public final void invoke(Composer composer2, int i3) {
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(468305759, i3, -1, "androidx.compose.material3.TimePickerCustomLayout.<anonymous> (TimePickerDialog.kt:133)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier layoutId = LayoutIdKt.layoutId(companion, "title");
                    my myVar3 = myVar;
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, layoutId);
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
                    my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    myVar3.invoke(composer2, 0);
                    composer2.endNode();
                    Modifier layoutId2 = LayoutIdKt.layoutId(companion, "actions");
                    my myVar4 = myVar2;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, layoutId2);
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
                    my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                    if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                    }
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                    myVar4.invoke(composer2, 0);
                    composer2.endNode();
                    Modifier layoutId3 = LayoutIdKt.layoutId(companion, "timePickerContent");
                    ny nyVar2 = ny.this;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, layoutId3);
                    iy constructor3 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer2);
                    my b3 = k4.b(companion3, m3878constructorimpl3, columnMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                    if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                    }
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion3.getSetModifier());
                    nyVar2.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            rememberComposableLambda.invoke(startRestartGroup, 6);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(myVar, myVar2, nyVar, i, 13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimePickerCustomLayout$lambda$3(my myVar, my myVar2, ny nyVar, int i, Composer composer, int i2) {
        TimePickerCustomLayout(myVar, myVar2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* renamed from: TimePickerDialog-FItCLgY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2636TimePickerDialogFItCLgY(final iy iyVar, final my myVar, final my myVar2, Modifier modifier, DialogProperties dialogProperties, my myVar3, my myVar4, Shape shape, long j, final ny nyVar, Composer composer, final int i, final int i2) {
        int i3;
        final my myVar5;
        my myVar6;
        int i4;
        Modifier modifier2;
        int i5;
        DialogProperties dialogProperties2;
        int i6;
        my myVar7;
        int i7;
        my myVar8;
        int i8;
        int i9;
        Composer composer2;
        final Modifier modifier3;
        final DialogProperties dialogProperties3;
        final my myVar9;
        final my myVar10;
        final Shape shape2;
        final long j2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        final long j3;
        final Shape shape4;
        final my myVar11;
        int i10;
        final Modifier modifier4;
        final my myVar12;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(951250327);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            myVar5 = myVar;
        } else {
            myVar5 = myVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar5) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            myVar6 = myVar2;
            i3 |= startRestartGroup.changedInstance(myVar6) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    dialogProperties2 = dialogProperties;
                    i3 |= startRestartGroup.changed(dialogProperties2) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        myVar7 = myVar3;
                        i3 |= startRestartGroup.changedInstance(myVar7) ? Fields.RenderEffect : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            myVar8 = myVar4;
                            i3 |= startRestartGroup.changedInstance(myVar8) ? 1048576 : Fields.BlendMode;
                            if ((i & 12582912) == 0) {
                                if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(shape)) {
                                    i11 = GroupFlagsKt.IsNodeFlag;
                                    i3 |= i11;
                                }
                                i11 = 4194304;
                                i3 |= i11;
                            }
                            if ((i & 100663296) != 0) {
                                i8 = i3 | (((i2 & Fields.RotationX) == 0 && startRestartGroup.changed(j)) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag);
                            } else {
                                i8 = i3;
                            }
                            int i12 = i8;
                            if ((i2 & Fields.RotationY) == 0) {
                                i9 = i12 | 805306368;
                            } else if ((i & 805306368) == 0) {
                                i9 = i12 | (startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag);
                            } else {
                                i9 = i12;
                            }
                            if (startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier3 = modifier2;
                                dialogProperties3 = dialogProperties2;
                                myVar9 = myVar7;
                                myVar10 = myVar8;
                                shape2 = shape;
                                j2 = j;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    DialogProperties dialogProperties4 = i5 != 0 ? new DialogProperties(false, false, false, 3, (dq) null) : dialogProperties2;
                                    if (i6 != 0) {
                                        myVar7 = null;
                                    }
                                    if (i7 != 0) {
                                        myVar8 = null;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        shape3 = TimePickerDialogDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                        i9 &= -29360129;
                                    } else {
                                        shape3 = shape;
                                    }
                                    if ((i2 & Fields.RotationX) != 0) {
                                        i9 &= -234881025;
                                        shape4 = shape3;
                                        j3 = TimePickerDialogDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    } else {
                                        j3 = j;
                                        shape4 = shape3;
                                    }
                                    myVar11 = myVar7;
                                    i10 = i9;
                                    dialogProperties2 = dialogProperties4;
                                    modifier4 = modifier2;
                                    myVar12 = myVar8;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i9 &= -29360129;
                                    }
                                    if ((i2 & Fields.RotationX) != 0) {
                                        i9 &= -234881025;
                                    }
                                    shape4 = shape;
                                    j3 = j;
                                    myVar11 = myVar7;
                                    myVar12 = myVar8;
                                    i10 = i9;
                                    modifier4 = modifier2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(951250327, i10, -1, "androidx.compose.material3.TimePickerDialog (TimePickerDialog.kt:79)");
                                }
                                final my myVar13 = myVar6;
                                AndroidDialog_androidKt.Dialog(iyVar, dialogProperties2, ComposableLambdaKt.rememberComposableLambda(296331566, true, new my() { // from class: androidx.compose.material3.TimePickerDialogKt$TimePickerDialog$1
                                    public final void invoke(Composer composer3, int i13) {
                                        if (!composer3.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(296331566, i13, -1, "androidx.compose.material3.TimePickerDialog.<anonymous> (TimePickerDialog.kt:81)");
                                        }
                                        TimePickerDialogKt.m2637TimePickerDialogLayout3csKH6Y(my.this, myVar13, modifier4, myVar11, myVar12, shape4, j3, nyVar, composer3, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ((i10 >> 9) & 112) | (i10 & 14) | 384, 0);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                dialogProperties3 = dialogProperties2;
                                modifier3 = modifier4;
                                myVar9 = myVar11;
                                myVar10 = myVar12;
                                shape2 = shape4;
                                j2 = j3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: dv0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 TimePickerDialog_FItCLgY$lambda$0;
                                        int intValue = ((Integer) obj2).intValue();
                                        TimePickerDialog_FItCLgY$lambda$0 = TimePickerDialogKt.TimePickerDialog_FItCLgY$lambda$0(iy.this, myVar, myVar2, modifier3, dialogProperties3, myVar9, myVar10, shape2, j2, nyVar, i, i2, (Composer) obj, intValue);
                                        return TimePickerDialog_FItCLgY$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        myVar8 = myVar4;
                        if ((i & 12582912) == 0) {
                        }
                        if ((i & 100663296) != 0) {
                        }
                        int i122 = i8;
                        if ((i2 & Fields.RotationY) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    myVar7 = myVar3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    myVar8 = myVar4;
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) != 0) {
                    }
                    int i1222 = i8;
                    if ((i2 & Fields.RotationY) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                dialogProperties2 = dialogProperties;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                myVar7 = myVar3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                myVar8 = myVar4;
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) != 0) {
                }
                int i12222 = i8;
                if ((i2 & Fields.RotationY) == 0) {
                }
                if (startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            dialogProperties2 = dialogProperties;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            myVar7 = myVar3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            myVar8 = myVar4;
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) != 0) {
            }
            int i122222 = i8;
            if ((i2 & Fields.RotationY) == 0) {
            }
            if (startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        myVar6 = myVar2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        dialogProperties2 = dialogProperties;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        myVar7 = myVar3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        myVar8 = myVar4;
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        int i1222222 = i8;
        if ((i2 & Fields.RotationY) == 0) {
        }
        if (startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b1  */
    /* renamed from: TimePickerDialogLayout-3csKH6Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2637TimePickerDialogLayout3csKH6Y(final my myVar, final my myVar2, Modifier modifier, my myVar3, my myVar4, Shape shape, long j, final ny nyVar, Composer composer, final int i, final int i2) {
        int i3;
        my myVar5;
        int i4;
        Modifier modifier2;
        int i5;
        my myVar6;
        int i6;
        my myVar7;
        Shape shape2;
        long j2;
        int i7;
        Composer composer2;
        final my myVar8;
        final my myVar9;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-401873644);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            myVar5 = myVar2;
            i3 |= startRestartGroup.changedInstance(myVar5) ? 32 : 16;
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
                    myVar6 = myVar3;
                    i3 |= startRestartGroup.changedInstance(myVar6) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        myVar7 = myVar4;
                        i3 |= startRestartGroup.changedInstance(myVar7) ? Fields.Clip : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                shape2 = shape;
                                if (startRestartGroup.changed(shape2)) {
                                    i11 = Fields.RenderEffect;
                                    i3 |= i11;
                                }
                            } else {
                                shape2 = shape;
                            }
                            i11 = 65536;
                            i3 |= i11;
                        } else {
                            shape2 = shape;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                j2 = j;
                                if (startRestartGroup.changed(j2)) {
                                    i10 = 1048576;
                                    i3 |= i10;
                                }
                            } else {
                                j2 = j;
                            }
                            i10 = Fields.BlendMode;
                            i3 |= i10;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & Fields.SpotShadowColor) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i7 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                myVar8 = myVar6;
                                myVar9 = myVar7;
                                j3 = j2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i5 != 0) {
                                        myVar6 = null;
                                    }
                                    if (i6 != 0) {
                                        myVar7 = null;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i8 = i7 & (-458753);
                                        shape2 = TimePickerDialogDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    } else {
                                        i8 = i7;
                                    }
                                    if ((i2 & 64) != 0) {
                                        j2 = TimePickerDialogDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                        i9 = i8 & (-3670017);
                                    } else {
                                        i9 = i8;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i9 = (i2 & 32) != 0 ? i7 & (-458753) : i7;
                                    if ((i2 & 64) != 0) {
                                        i9 &= -3670017;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-401873644, i9, -1, "androidx.compose.material3.TimePickerDialogLayout (TimePickerDialog.kt:104)");
                                }
                                final my myVar10 = myVar7;
                                final my myVar11 = myVar5;
                                final my myVar12 = myVar6;
                                long j4 = j2;
                                composer2 = startRestartGroup;
                                SurfaceKt.m2464SurfaceT9BRK9s(BackgroundKt.m226backgroundbw27NRU(modifier2, j2, shape2), shape2, 0L, 0L, DialogTokens.INSTANCE.m3224getContainerElevationD9Ej5fM(), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1522143641, true, new my() { // from class: androidx.compose.material3.TimePickerDialogKt$TimePickerDialogLayout$1
                                    public final void invoke(Composer composer3, int i12) {
                                        if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1522143641, i12, -1, "androidx.compose.material3.TimePickerDialogLayout.<anonymous> (TimePickerDialog.kt:110)");
                                        }
                                        my myVar13 = my.this;
                                        final my myVar14 = myVar12;
                                        final my myVar15 = myVar10;
                                        final my myVar16 = myVar;
                                        TimePickerDialogKt.TimePickerCustomLayout(myVar13, ComposableLambdaKt.rememberComposableLambda(2122920701, true, new my() { // from class: androidx.compose.material3.TimePickerDialogKt$TimePickerDialogLayout$1.1
                                            public final void invoke(Composer composer4, int i13) {
                                                if (!composer4.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2122920701, i13, -1, "androidx.compose.material3.TimePickerDialogLayout.<anonymous>.<anonymous> (TimePickerDialog.kt:113)");
                                                }
                                                Modifier.Companion companion = Modifier.Companion;
                                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                                my myVar17 = my.this;
                                                my myVar18 = myVar15;
                                                my myVar19 = myVar16;
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer4, 0);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                                iy constructor = companion2.getConstructor();
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
                                                my b = k4.b(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                if (myVar17 == null) {
                                                    composer4.startReplaceGroup(675833080);
                                                } else {
                                                    composer4.startReplaceGroup(2100011049);
                                                    myVar17.invoke(composer4, 0);
                                                }
                                                composer4.endReplaceGroup();
                                                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer4, 0);
                                                if (myVar18 == null) {
                                                    composer4.startReplaceGroup(675935256);
                                                } else {
                                                    composer4.startReplaceGroup(2100014345);
                                                    myVar18.invoke(composer4, 0);
                                                }
                                                composer4.endReplaceGroup();
                                                myVar19.invoke(composer4, 0);
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
                                        }, composer3, 54), nyVar, composer3, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), composer2, ((i9 >> 12) & 112) | 12607488, 108);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                myVar8 = myVar6;
                                j3 = j4;
                                myVar9 = myVar10;
                            }
                            final Modifier modifier3 = modifier2;
                            final Shape shape3 = shape2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: cv0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 TimePickerDialogLayout_3csKH6Y$lambda$1;
                                        int intValue = ((Integer) obj2).intValue();
                                        TimePickerDialogLayout_3csKH6Y$lambda$1 = TimePickerDialogKt.TimePickerDialogLayout_3csKH6Y$lambda$1(my.this, myVar2, modifier3, myVar8, myVar9, shape3, j3, nyVar, i, i2, (Composer) obj, intValue);
                                        return TimePickerDialogLayout_3csKH6Y$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
                        }
                        final Modifier modifier32 = modifier2;
                        final Shape shape32 = shape2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    myVar7 = myVar4;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                    }
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
                    }
                    final Modifier modifier322 = modifier2;
                    final Shape shape322 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar6 = myVar3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                myVar7 = myVar4;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
                }
                final Modifier modifier3222 = modifier2;
                final Shape shape3222 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            myVar6 = myVar3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            myVar7 = myVar4;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
            }
            final Modifier modifier32222 = modifier2;
            final Shape shape32222 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        myVar5 = myVar2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        myVar6 = myVar3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        myVar7 = myVar4;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
        }
        final Modifier modifier322222 = modifier2;
        final Shape shape322222 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimePickerDialogLayout_3csKH6Y$lambda$1(my myVar, my myVar2, Modifier modifier, my myVar3, my myVar4, Shape shape, long j, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2637TimePickerDialogLayout3csKH6Y(myVar, myVar2, modifier, myVar3, myVar4, shape, j, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimePickerDialog_FItCLgY$lambda$0(iy iyVar, my myVar, my myVar2, Modifier modifier, DialogProperties dialogProperties, my myVar3, my myVar4, Shape shape, long j, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2636TimePickerDialogFItCLgY(iyVar, myVar, myVar2, modifier, dialogProperties, myVar3, myVar4, shape, j, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
