package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
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
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import defpackage.ed;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.rf;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final ny nyVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9;
        Modifier modifier2;
        boolean z3;
        Shape shape3;
        Composer composer2;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation3;
        BorderStroke borderStroke2;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        int i10;
        final PaddingValues contentPadding;
        BorderStroke borderStroke3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        int i11;
        Shape shape5;
        int i12;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource5;
        State<Dp> shadowElevation$material3;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1310015664);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i15 = Fields.CameraDistance;
                            i3 |= i15;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i15 = Fields.RotationZ;
                    i3 |= i15;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i14 = Fields.Clip;
                            i3 |= i14;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i14 = 8192;
                    i3 |= i14;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i13 = Fields.RenderEffect;
                            i3 |= i13;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i13 = 65536;
                    i3 |= i13;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    obj = borderStroke;
                    i3 |= startRestartGroup.changed(obj) ? 1048576 : Fields.BlendMode;
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        i7 = i16;
                    } else {
                        i7 = i16;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i8 = i2 & Fields.RotationX;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationY) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i7 != 0 ? Modifier.Companion : modifier;
                                boolean z5 = i4 != 0 ? true : z2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape4 = ButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    buttonColors4 = ButtonDefaults.INSTANCE.buttonColors(startRestartGroup, 6);
                                } else {
                                    buttonColors4 = buttonColors2;
                                }
                                int i17 = i3;
                                if ((i2 & 32) != 0) {
                                    modifier3 = modifier5;
                                    mutableInteractionSource3 = null;
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m1659buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 196608, 31);
                                    i10 = i17 & (-458753);
                                } else {
                                    modifier3 = modifier5;
                                    mutableInteractionSource3 = null;
                                    i10 = i17;
                                }
                                if (i5 != 0) {
                                    obj = mutableInteractionSource3;
                                }
                                contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                boolean z6 = z5;
                                borderStroke3 = obj;
                                z4 = z6;
                                mutableInteractionSource4 = i9 != 0 ? mutableInteractionSource3 : mutableInteractionSource;
                                i11 = i10;
                                buttonColors2 = buttonColors4;
                                shape5 = shape4;
                                i12 = -1310015664;
                                modifier4 = modifier3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i11 = i3;
                                shape5 = shape2;
                                borderStroke3 = obj;
                                modifier4 = modifier;
                                contentPadding = paddingValues;
                                mutableInteractionSource4 = mutableInteractionSource;
                                z4 = z2;
                                i12 = -1310015664;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i12, i11, -1, "androidx.compose.material3.Button (Button.kt:121)");
                            }
                            if (mutableInteractionSource4 == null) {
                                startRestartGroup.startReplaceGroup(1691738187);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-499617780);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource5 = mutableInteractionSource4;
                            }
                            long m1651containerColorvNxB06k$material3 = buttonColors2.m1651containerColorvNxB06k$material3(z4);
                            Modifier modifier6 = modifier4;
                            final long m1652contentColorvNxB06k$material3 = buttonColors2.m1652contentColorvNxB06k$material3(z4);
                            if (buttonElevation2 == null) {
                                startRestartGroup.startReplaceGroup(1691921830);
                                startRestartGroup.endReplaceGroup();
                                shadowElevation$material3 = null;
                            } else {
                                startRestartGroup.startReplaceGroup(-499611205);
                                shadowElevation$material3 = buttonElevation2.shadowElevation$material3(z4, mutableInteractionSource5, startRestartGroup, ((i11 >> 9) & 896) | ((i11 >> 6) & 14));
                                startRestartGroup.endReplaceGroup();
                            }
                            float m7625unboximpl = shadowElevation$material3 != null ? shadowElevation$material3.getValue().m7625unboximpl() : Dp.m7611constructorimpl(0.0f);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new ed(9);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            SurfaceKt.m2467Surfaceo_FOJdg(iyVar2, SemanticsModifierKt.semantics$default(modifier6, false, (ky) rememberedValue2, 1, null), z4, shape5, m1651containerColorvNxB06k$material3, m1652contentColorvNxB06k$material3, 0.0f, m7625unboximpl, borderStroke3, mutableInteractionSource5, ComposableLambdaKt.rememberComposableLambda(-535639973, true, new my() { // from class: androidx.compose.material3.ButtonKt$Button$2
                                public final void invoke(Composer composer3, int i18) {
                                    if (!composer3.shouldExecute((i18 & 3) != 2, i18 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-535639973, i18, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:138)");
                                    }
                                    long j = m1652contentColorvNxB06k$material3;
                                    TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer3, 6).getLabelLarge();
                                    final PaddingValues paddingValues3 = contentPadding;
                                    final ny nyVar2 = nyVar;
                                    ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j, labelLarge, ComposableLambdaKt.rememberComposableLambda(417635459, true, new my() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                        public final void invoke(Composer composer4, int i19) {
                                            if (!composer4.shouldExecute((i19 & 3) != 2, i19 & 1)) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(417635459, i19, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:142)");
                                            }
                                            Modifier.Companion companion = Modifier.Companion;
                                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                            Modifier padding = PaddingKt.padding(SizeKt.m791defaultMinSizeVpY3zN4(companion, buttonDefaults.m1667getMinWidthD9Ej5fM(), buttonDefaults.m1666getMinHeightD9Ej5fM()), PaddingValues.this);
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                            ny nyVar3 = nyVar2;
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, padding);
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
                                            nyVar3.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                                            composer4.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                            invoke((Composer) obj2, ((Number) obj3).intValue());
                                            return w01.a;
                                        }
                                    }, composer3, 54), composer3, 384);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i11 & 8078) | (234881024 & (i11 << 6)), 6, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            buttonColors3 = buttonColors2;
                            z3 = z4;
                            shape3 = shape5;
                            borderStroke2 = borderStroke3;
                            paddingValues2 = contentPadding;
                            modifier2 = modifier6;
                            buttonElevation3 = buttonElevation2;
                            mutableInteractionSource2 = mutableInteractionSource6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z2;
                            shape3 = shape2;
                            composer2 = startRestartGroup;
                            buttonColors3 = buttonColors2;
                            buttonElevation3 = buttonElevation2;
                            borderStroke2 = obj;
                            paddingValues2 = paddingValues;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new rf(iyVar, modifier2, z3, shape3, buttonColors3, buttonElevation3, borderStroke2, paddingValues2, mutableInteractionSource2, nyVar, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                obj = borderStroke;
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                i8 = i2 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            obj = borderStroke;
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        obj = borderStroke;
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Button$lambda$2$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6828getButtono7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Button$lambda$3(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        Button(iyVar, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedButton(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        Composer composer2;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation3;
        BorderStroke borderStroke3;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        boolean z4;
        Shape shape5;
        ButtonColors buttonColors5;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1943994298);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = Fields.CameraDistance;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = Fields.RotationZ;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = Fields.Clip;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i10 = Fields.RenderEffect;
                            i3 |= i10;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : Fields.BlendMode;
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationY) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                shape3 = shape2;
                                composer2 = startRestartGroup;
                                buttonColors3 = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                                mutableInteractionSource2 = mutableInteractionSource;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i13 != 0 ? Modifier.Companion : modifier2;
                                    boolean z5 = i4 == 0 ? z2 : true;
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        shape4 = ButtonDefaults.INSTANCE.getElevatedShape(startRestartGroup, 6);
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                        buttonColors4 = ButtonDefaults.INSTANCE.elevatedButtonColors(startRestartGroup, 6);
                                    } else {
                                        buttonColors4 = buttonColors2;
                                    }
                                    int i14 = i3;
                                    if ((i2 & 32) != 0) {
                                        buttonElevation2 = ButtonDefaults.INSTANCE.m1661elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 196608, 31);
                                        i3 = i14 & (-458753);
                                    } else {
                                        i3 = i14;
                                    }
                                    if (i5 != 0) {
                                        borderStroke2 = null;
                                    }
                                    PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                    borderStroke4 = borderStroke2;
                                    z4 = z5;
                                    shape5 = shape4;
                                    if (i8 != 0) {
                                        buttonColors5 = buttonColors4;
                                        modifier4 = modifier5;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        buttonColors5 = buttonColors4;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier4 = modifier5;
                                    }
                                    paddingValues3 = contentPadding;
                                    buttonElevation4 = buttonElevation2;
                                    i9 = -1943994298;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    paddingValues3 = paddingValues;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    z4 = z2;
                                    shape5 = shape2;
                                    buttonColors5 = buttonColors2;
                                    buttonElevation4 = buttonElevation2;
                                    borderStroke4 = borderStroke2;
                                    i9 = -1943994298;
                                    modifier4 = modifier2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.ElevatedButton (Button.kt:215)");
                                }
                                Button(iyVar2, modifier4, z4, shape5, buttonColors5, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, nyVar, startRestartGroup, i3 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                modifier3 = modifier4;
                                z3 = z4;
                                shape3 = shape5;
                                buttonColors3 = buttonColors5;
                                buttonElevation3 = buttonElevation4;
                                borderStroke3 = borderStroke4;
                                paddingValues2 = paddingValues3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new rf(iyVar, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, nyVar, i, i2, 2));
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ElevatedButton$lambda$4(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        ElevatedButton(iyVar, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalButton(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        Composer composer2;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation3;
        BorderStroke borderStroke3;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        boolean z4;
        Shape shape5;
        ButtonColors buttonColors5;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-102343472);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = Fields.CameraDistance;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = Fields.RotationZ;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = Fields.Clip;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i10 = Fields.RenderEffect;
                            i3 |= i10;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : Fields.BlendMode;
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationY) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                shape3 = shape2;
                                composer2 = startRestartGroup;
                                buttonColors3 = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                                mutableInteractionSource2 = mutableInteractionSource;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i13 != 0 ? Modifier.Companion : modifier2;
                                    boolean z5 = i4 == 0 ? z2 : true;
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        shape4 = ButtonDefaults.INSTANCE.getFilledTonalShape(startRestartGroup, 6);
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                        buttonColors4 = ButtonDefaults.INSTANCE.filledTonalButtonColors(startRestartGroup, 6);
                                    } else {
                                        buttonColors4 = buttonColors2;
                                    }
                                    int i14 = i3;
                                    if ((i2 & 32) != 0) {
                                        buttonElevation2 = ButtonDefaults.INSTANCE.m1663filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 196608, 31);
                                        i3 = i14 & (-458753);
                                    } else {
                                        i3 = i14;
                                    }
                                    if (i5 != 0) {
                                        borderStroke2 = null;
                                    }
                                    PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                    borderStroke4 = borderStroke2;
                                    z4 = z5;
                                    shape5 = shape4;
                                    if (i8 != 0) {
                                        buttonColors5 = buttonColors4;
                                        modifier4 = modifier5;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        buttonColors5 = buttonColors4;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier4 = modifier5;
                                    }
                                    paddingValues3 = contentPadding;
                                    buttonElevation4 = buttonElevation2;
                                    i9 = -102343472;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    paddingValues3 = paddingValues;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    z4 = z2;
                                    shape5 = shape2;
                                    buttonColors5 = buttonColors2;
                                    buttonElevation4 = buttonElevation2;
                                    borderStroke4 = borderStroke2;
                                    i9 = -102343472;
                                    modifier4 = modifier2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:288)");
                                }
                                Button(iyVar2, modifier4, z4, shape5, buttonColors5, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, nyVar, startRestartGroup, i3 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                modifier3 = modifier4;
                                z3 = z4;
                                shape3 = shape5;
                                buttonColors3 = buttonColors5;
                                buttonElevation3 = buttonElevation4;
                                borderStroke3 = borderStroke4;
                                paddingValues2 = paddingValues3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new rf(iyVar, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, nyVar, i, i2, 4));
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FilledTonalButton$lambda$5(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        FilledTonalButton(iyVar, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        Shape shape3;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation3;
        BorderStroke borderStroke3;
        PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        ButtonColors buttonColors5;
        BorderStroke borderStroke5;
        Shape shape5;
        boolean z4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(399974542);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = Fields.CameraDistance;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = Fields.RotationZ;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = Fields.Clip;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    buttonElevation2 = buttonElevation;
                    i3 |= startRestartGroup.changed(buttonElevation2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            if (startRestartGroup.changed(borderStroke2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i10 = Fields.BlendMode;
                        i3 |= i10;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationY) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                mutableInteractionSource2 = mutableInteractionSource;
                                z3 = z2;
                                shape3 = shape2;
                                buttonColors3 = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        shape4 = ButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                        i3 &= -7169;
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        buttonColors4 = ButtonDefaults.INSTANCE.outlinedButtonColors(startRestartGroup, 6);
                                        i3 &= -57345;
                                    } else {
                                        buttonColors4 = buttonColors2;
                                    }
                                    if (i5 != 0) {
                                        buttonElevation2 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        borderStroke4 = ButtonDefaults.INSTANCE.outlinedButtonBorder(z2, startRestartGroup, ((i3 >> 6) & 14) | 48, 0);
                                        i3 &= -3670017;
                                    } else {
                                        borderStroke4 = borderStroke2;
                                    }
                                    PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                    if (i8 != 0) {
                                        modifier3 = modifier4;
                                        buttonColors5 = buttonColors4;
                                        borderStroke5 = borderStroke4;
                                        shape5 = shape4;
                                        z4 = z2;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier3 = modifier4;
                                        buttonColors5 = buttonColors4;
                                        borderStroke5 = borderStroke4;
                                        shape5 = shape4;
                                        z4 = z2;
                                    }
                                    paddingValues3 = contentPadding;
                                    buttonElevation4 = buttonElevation2;
                                    i9 = 399974542;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    paddingValues3 = paddingValues;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    z4 = z2;
                                    shape5 = shape2;
                                    buttonColors5 = buttonColors2;
                                    buttonElevation4 = buttonElevation2;
                                    borderStroke5 = borderStroke2;
                                    i9 = 399974542;
                                    modifier3 = modifier;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.OutlinedButton (Button.kt:360)");
                                }
                                composer2 = startRestartGroup;
                                Button(iyVar2, modifier3, z4, shape5, buttonColors5, buttonElevation4, borderStroke5, paddingValues3, mutableInteractionSource3, nyVar, composer2, i3 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                z3 = z4;
                                shape3 = shape5;
                                buttonColors3 = buttonColors5;
                                buttonElevation3 = buttonElevation4;
                                borderStroke3 = borderStroke5;
                                paddingValues2 = paddingValues3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new rf(iyVar, modifier2, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, nyVar, i, i2, 0));
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedButton$lambda$6(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        OutlinedButton(iyVar, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation3;
        BorderStroke borderStroke3;
        PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        BorderStroke borderStroke4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues3;
        Modifier modifier4;
        Shape shape4;
        ButtonColors buttonColors4;
        ButtonElevation buttonElevation4;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1061374109);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i13 = Fields.CameraDistance;
                            i3 |= i13;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i13 = Fields.RotationZ;
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i12 = Fields.Clip;
                            i3 |= i12;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    buttonElevation2 = buttonElevation;
                    i3 |= startRestartGroup.changed(buttonElevation2) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : Fields.BlendMode;
                        i7 = i2 & Fields.SpotShadowColor;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i9 = i2 & Fields.RotationX;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                if ((i2 & Fields.RotationY) != 0) {
                                    i3 |= 805306368;
                                } else if ((i & 805306368) == 0) {
                                    i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        modifier3 = modifier2;
                                        z3 = z2;
                                        shape3 = shape2;
                                        buttonColors3 = buttonColors2;
                                        buttonElevation3 = buttonElevation2;
                                        borderStroke3 = borderStroke2;
                                        paddingValues2 = paddingValues;
                                    } else {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                            if (i14 != 0) {
                                                modifier2 = Modifier.Companion;
                                            }
                                            boolean z5 = i4 == 0 ? z2 : true;
                                            if ((i2 & 8) != 0) {
                                                i3 &= -7169;
                                                shape2 = ButtonDefaults.INSTANCE.getTextShape(startRestartGroup, 6);
                                            }
                                            if ((i2 & 16) != 0) {
                                                i3 &= -57345;
                                                buttonColors2 = ButtonDefaults.INSTANCE.textButtonColors(startRestartGroup, 6);
                                            }
                                            if (i5 != 0) {
                                                buttonElevation2 = null;
                                            }
                                            if (i6 != 0) {
                                                borderStroke2 = null;
                                            }
                                            PaddingValues textButtonContentPadding = i8 != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
                                            if (i10 != 0) {
                                                boolean z6 = z5;
                                                borderStroke4 = borderStroke2;
                                                z4 = z6;
                                                mutableInteractionSource3 = null;
                                            } else {
                                                boolean z7 = z5;
                                                borderStroke4 = borderStroke2;
                                                z4 = z7;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                            }
                                            paddingValues3 = textButtonContentPadding;
                                            modifier4 = modifier2;
                                            shape4 = shape2;
                                            buttonColors4 = buttonColors2;
                                            buttonElevation4 = buttonElevation2;
                                            i11 = -1061374109;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i2 & 8) != 0) {
                                                i3 &= -7169;
                                            }
                                            if ((i2 & 16) != 0) {
                                                i3 &= -57345;
                                            }
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            modifier4 = modifier2;
                                            shape4 = shape2;
                                            buttonColors4 = buttonColors2;
                                            buttonElevation4 = buttonElevation2;
                                            borderStroke4 = borderStroke2;
                                            i11 = -1061374109;
                                            z4 = z2;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(i11, i3, -1, "androidx.compose.material3.TextButton (Button.kt:429)");
                                        }
                                        composer2 = startRestartGroup;
                                        Button(iyVar2, modifier4, z4, shape4, buttonColors4, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, nyVar, composer2, i3 & 2147483646, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        z3 = z4;
                                        shape3 = shape4;
                                        buttonColors3 = buttonColors4;
                                        buttonElevation3 = buttonElevation4;
                                        borderStroke3 = borderStroke4;
                                        paddingValues2 = paddingValues3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new rf(iyVar, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, nyVar, i, i2, 3));
                                        return;
                                    }
                                    return;
                                }
                                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i10 = i9;
                            if ((i2 & Fields.RotationY) != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i8 = i7;
                        i9 = i2 & Fields.RotationX;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        if ((i2 & Fields.RotationY) != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & Fields.RotationX;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TextButton$lambda$7(iy iyVar, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        TextButton(iyVar, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
