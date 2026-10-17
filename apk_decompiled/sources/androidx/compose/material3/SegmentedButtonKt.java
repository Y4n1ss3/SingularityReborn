package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.en0;
import defpackage.er;
import defpackage.fn0;
import defpackage.g6;
import defpackage.gn0;
import defpackage.iy;
import defpackage.k4;
import defpackage.kl0;
import defpackage.ky;
import defpackage.my;
import defpackage.ne0;
import defpackage.ny;
import defpackage.q10;
import defpackage.st;
import defpackage.un;
import defpackage.w01;
import defpackage.y80;
import defpackage.z5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SegmentedButtonKt {
    private static final float CheckedZIndexFactor = 5.0f;
    private static final float IconSpacing = Dp.m7611constructorimpl(8.0f);

    /* renamed from: MultiChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2357MultiChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float f, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1844783038);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                f = SegmentedButtonDefaults.INSTANCE.m2355getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1844783038, i3, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:367)");
            }
            Modifier width = IntrinsicKt.width(SizeKt.m792defaultMinSizeVpY3zN4$default(modifier, 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m3489getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(-f)), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, width);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
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
            my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MultiChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            nyVar.invoke((MultiChoiceSegmentedButtonScopeWrapper) rememberedValue, startRestartGroup, Integer.valueOf(((i3 >> 3) & 112) | 6));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new en0(modifier2, f2, nyVar, i, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$13(Modifier modifier, float f, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2357MultiChoiceSegmentedButtonRowuFdPcIQ(modifier, f, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedButton(SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, final boolean z, iy iyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, my myVar, final my myVar2, Composer composer, int i, int i2, int i3) {
        int i4;
        Shape shape2;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        PaddingValues paddingValues2;
        my myVar3;
        BorderStroke borderStroke3;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        SegmentedButtonColors segmentedButtonColors3;
        final PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        final my myVar4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource4;
        Composer startRestartGroup = composer.startRestartGroup(1532041126);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(singleChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i3 & 4) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                shape2 = shape;
                i4 |= startRestartGroup.changed(shape2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i3 & 8;
                if (i5 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
                    i6 = i3 & 16;
                    if (i6 == 0) {
                        i4 |= 196608;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
                        }
                    }
                    if ((i & 1572864) != 0) {
                        segmentedButtonColors2 = segmentedButtonColors;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(segmentedButtonColors2)) ? 1048576 : Fields.BlendMode;
                    } else {
                        segmentedButtonColors2 = segmentedButtonColors;
                    }
                    if ((i & 12582912) != 0) {
                        borderStroke2 = borderStroke;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i7 = i3 & Fields.SpotShadowColor;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i8 = i3 & Fields.RotationX;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i10 = i3 & Fields.RotationY;
                        if (i10 != 0) {
                            i12 = i2 | 6;
                            i11 = i10;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changedInstance(myVar) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if ((i3 & Fields.RotationZ) != 0) {
                            i12 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i12 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
                        }
                        i13 = i12;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i5 != 0 ? Modifier.Companion : modifier2;
                                if (i6 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    segmentedButtonColors2 = SegmentedButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & 64) != 0) {
                                    borderStroke2 = SegmentedButtonDefaults.m2352borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColors2.m2336borderColorWaAFU9c$material3(z3, z), 0.0f, 2, null);
                                    i4 &= -29360129;
                                }
                                PaddingValues contentPadding = i7 != 0 ? SegmentedButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                MutableInteractionSource mutableInteractionSource5 = i9 != 0 ? null : mutableInteractionSource;
                                if (i11 != 0) {
                                    Modifier modifier5 = modifier4;
                                    SegmentedButtonColors segmentedButtonColors4 = segmentedButtonColors2;
                                    myVar4 = ComposableLambdaKt.rememberComposableLambda(-643804033, true, new my() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$4
                                        public final void invoke(Composer composer2, int i14) {
                                            if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-643804033, i14, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:220)");
                                            }
                                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer2, 3072, 6);
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
                                    segmentedButtonColors3 = segmentedButtonColors4;
                                    modifier2 = modifier5;
                                    z4 = z3;
                                    paddingValues3 = contentPadding;
                                    mutableInteractionSource3 = mutableInteractionSource5;
                                } else {
                                    modifier2 = modifier4;
                                    z4 = z3;
                                    segmentedButtonColors3 = segmentedButtonColors2;
                                    paddingValues3 = contentPadding;
                                    mutableInteractionSource3 = mutableInteractionSource5;
                                    myVar4 = myVar;
                                }
                                borderStroke4 = borderStroke2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -29360129;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                z4 = z3;
                                segmentedButtonColors3 = segmentedButtonColors2;
                                borderStroke4 = borderStroke2;
                                paddingValues3 = paddingValues;
                                myVar4 = myVar;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1532041126, i4, i13, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                            }
                            if (mutableInteractionSource3 == null) {
                                startRestartGroup.startReplaceGroup(-1579561419);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-882238238);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            long m2337containerColorWaAFU9c$material3 = segmentedButtonColors3.m2337containerColorWaAFU9c$material3(z4, z);
                            long m2338contentColorWaAFU9c$material3 = segmentedButtonColors3.m2338contentColorWaAFU9c$material3(z4, z);
                            Modifier modifier6 = modifier2;
                            Modifier interactionZIndex = interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, modifier6, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource4, startRestartGroup, 0));
                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                            Modifier m791defaultMinSizeVpY3zN4 = SizeKt.m791defaultMinSizeVpY3zN4(interactionZIndex, buttonDefaults.m1667getMinWidthD9Ej5fM(), buttonDefaults.m1666getMinHeightD9Ej5fM());
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new kl0(24);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            PaddingValues paddingValues4 = paddingValues3;
                            my myVar5 = myVar4;
                            SegmentedButtonColors segmentedButtonColors5 = segmentedButtonColors3;
                            SurfaceKt.m2465Surfaced85dljk(z, iyVar, SemanticsModifierKt.semantics$default(m791defaultMinSizeVpY3zN4, false, (ky) rememberedValue2, 1, null), z4, shape2, m2337containerColorWaAFU9c$material3, m2338contentColorWaAFU9c$material3, 0.0f, 0.0f, borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1208080836, true, new my() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$6
                                public final void invoke(Composer composer2, int i14) {
                                    if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1208080836, i14, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:248)");
                                    }
                                    SegmentedButtonKt.SegmentedButtonContent(my.this, myVar2, paddingValues3, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 126) | ((i4 >> 6) & 7168) | (57344 & (i4 << 3)) | ((i4 << 6) & 1879048192), 48, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            borderStroke3 = borderStroke4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            segmentedButtonColors2 = segmentedButtonColors5;
                            myVar3 = myVar5;
                            paddingValues2 = paddingValues4;
                            modifier3 = modifier6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            paddingValues2 = paddingValues;
                            myVar3 = myVar;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new fn0(singleChoiceSegmentedButtonRowScope, z, iyVar, shape, modifier3, z3, segmentedButtonColors2, borderStroke3, paddingValues2, mutableInteractionSource2, myVar3, myVar2, i, i2, i3, 1));
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i3 & Fields.RotationY;
                    if (i10 != 0) {
                    }
                    if ((i3 & Fields.RotationZ) != 0) {
                    }
                    i13 = i12;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i6 = i3 & 16;
                if (i6 == 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 == 0) {
                }
                i8 = i3 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & Fields.RotationY;
                if (i10 != 0) {
                }
                if ((i3 & Fields.RotationZ) != 0) {
                }
                i13 = i12;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            shape2 = shape;
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 == 0) {
            }
            i8 = i3 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationY;
            if (i10 != 0) {
            }
            if ((i3 & Fields.RotationZ) != 0) {
            }
            i13 = i12;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        shape2 = shape;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 == 0) {
        }
        i8 = i3 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationY;
        if (i10 != 0) {
        }
        if ((i3 & Fields.RotationZ) != 0) {
        }
        i13 = i12;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SegmentedButton$lambda$1(MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, boolean z, ky kyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedButton(multiChoiceSegmentedButtonRowScope, z, kyVar, shape, modifier, z2, segmentedButtonColors, borderStroke, paddingValues, mutableInteractionSource, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SegmentedButton$lambda$4$lambda$3(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6833getRadioButtono7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SegmentedButton$lambda$5(SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, boolean z, iy iyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedButton(singleChoiceSegmentedButtonRowScope, z, iyVar, shape, modifier, z2, segmentedButtonColors, borderStroke, paddingValues, mutableInteractionSource, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SegmentedButton$lambda$6(MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, boolean z, ky kyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedButton(multiChoiceSegmentedButtonRowScope, z, kyVar, shape, modifier, z2, segmentedButtonColors, borderStroke, mutableInteractionSource, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SegmentedButton$lambda$7(SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, boolean z, iy iyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedButton(singleChoiceSegmentedButtonRowScope, z, iyVar, shape, modifier, z2, segmentedButtonColors, borderStroke, mutableInteractionSource, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SegmentedButtonContent(final my myVar, final my myVar2, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1069265073);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1069265073, i2, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:386)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier padding = PaddingKt.padding(Modifier.Companion, paddingValues);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
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
            my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextStyle value = TypographyKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getLabelTextFont(), startRestartGroup, 6);
            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            TextKt.ProvideTextStyle(value, ComposableLambdaKt.rememberComposableLambda(-1372614088, true, new my() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButtonContent$1$1
                public final void invoke(Composer composer2, int i3) {
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1372614088, i3, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:392)");
                    }
                    Object rememberedValue = composer2.rememberedValue();
                    Composer.Companion companion2 = Composer.Companion;
                    if (rememberedValue == companion2.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer2);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    un unVar = (un) rememberedValue;
                    FiniteAnimationSpec<Integer> finiteAnimationSpec = value2;
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 == companion2.getEmpty()) {
                        rememberedValue2 = new SegmentedButtonContentMeasurePolicy(unVar, finiteAnimationSpec);
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) rememberedValue2;
                    Modifier height = IntrinsicKt.height(Modifier.Companion, IntrinsicSize.Min);
                    my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(y80.E(my.this, myVar2));
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (rememberedValue3 == companion2.getEmpty()) {
                        rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(segmentedButtonContentMeasurePolicy);
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, height);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
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
                    my b2 = k4.b(companion3, m3878constructorimpl2, measurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                    }
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                    combineAsVirtualLayouts.invoke(composer2, 0);
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
            }, startRestartGroup, 54), startRestartGroup, 48);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(myVar, myVar2, paddingValues, i, 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SegmentedButtonContent$lambda$15(my myVar, my myVar2, PaddingValues paddingValues, int i, Composer composer, int i2) {
        SegmentedButtonContent(myVar, myVar2, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: SingleChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2358SingleChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float f, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2041406825);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                f = SegmentedButtonDefaults.INSTANCE.m2355getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2041406825, i3, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:331)");
            }
            Modifier width = IntrinsicKt.width(SizeKt.m792defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(modifier), 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m3489getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(-f)), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, width);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
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
            my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SingleChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            nyVar.invoke((SingleChoiceSegmentedButtonScopeWrapper) rememberedValue, startRestartGroup, Integer.valueOf(((i3 >> 3) & 112) | 6));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new en0(modifier2, f2, nyVar, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$10(Modifier modifier, float f, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2358SingleChoiceSegmentedButtonRowuFdPcIQ(modifier, f, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final State<Integer> interactionCountAsState(InteractionSource interactionSource, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(281890131, i, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:459)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableIntState mutableIntState = (MutableIntState) rememberedValue;
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SegmentedButtonKt$interactionCountAsState$1$1(interactionSource, mutableIntState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (my) rememberedValue2, composer, i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableIntState;
    }

    private static final Modifier interactionZIndex(Modifier modifier, boolean z, State<Integer> state) {
        return LayoutModifierKt.layout(modifier, new g6(4, z, state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult interactionZIndex$lambda$19(State state, boolean z, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new ne0(state, z, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 interactionZIndex$lambda$19$lambda$18(State state, boolean z, Placeable placeable, Placeable.PlacementScope placementScope) {
        placementScope.place(placeable, 0, 0, ((Number) state.getValue()).floatValue() + (z ? CheckedZIndexFactor : 0.0f));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedButton(MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, final boolean z, ky kyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, my myVar, final my myVar2, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        PaddingValues paddingValues2;
        my myVar3;
        BorderStroke borderStroke3;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        SegmentedButtonColors segmentedButtonColors3;
        final PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        final my myVar4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource4;
        Composer startRestartGroup = composer.startRestartGroup(697872538);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(multiChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i3 & 4) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(shape) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i3 & 8;
                if (i5 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
                    i6 = i3 & 16;
                    if (i6 == 0) {
                        i4 |= 196608;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
                        }
                    }
                    if ((i & 1572864) != 0) {
                        segmentedButtonColors2 = segmentedButtonColors;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(segmentedButtonColors2)) ? 1048576 : Fields.BlendMode;
                    } else {
                        segmentedButtonColors2 = segmentedButtonColors;
                    }
                    if ((i & 12582912) != 0) {
                        borderStroke2 = borderStroke;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i7 = i3 & Fields.SpotShadowColor;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i8 = i3 & Fields.RotationX;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i10 = i3 & Fields.RotationY;
                        if (i10 != 0) {
                            i12 = i2 | 6;
                            i11 = i10;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changedInstance(myVar) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if ((i3 & Fields.RotationZ) != 0) {
                            i12 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i12 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
                        }
                        i13 = i12;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -29360129;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                z4 = z3;
                                segmentedButtonColors3 = segmentedButtonColors2;
                                borderStroke4 = borderStroke2;
                                paddingValues3 = paddingValues;
                                myVar4 = myVar;
                            } else {
                                Modifier modifier4 = i5 != 0 ? Modifier.Companion : modifier2;
                                if (i6 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    segmentedButtonColors2 = SegmentedButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & 64) != 0) {
                                    borderStroke2 = SegmentedButtonDefaults.m2352borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColors2.m2336borderColorWaAFU9c$material3(z3, z), 0.0f, 2, null);
                                    i4 &= -29360129;
                                }
                                PaddingValues contentPadding = i7 != 0 ? SegmentedButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                MutableInteractionSource mutableInteractionSource5 = i9 != 0 ? null : mutableInteractionSource;
                                if (i11 != 0) {
                                    Modifier modifier5 = modifier4;
                                    SegmentedButtonColors segmentedButtonColors4 = segmentedButtonColors2;
                                    myVar4 = ComposableLambdaKt.rememberComposableLambda(1181873313, true, new my() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$1
                                        public final void invoke(Composer composer2, int i14) {
                                            if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1181873313, i14, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:140)");
                                            }
                                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer2, 3072, 6);
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
                                    segmentedButtonColors3 = segmentedButtonColors4;
                                    modifier2 = modifier5;
                                    z4 = z3;
                                    paddingValues3 = contentPadding;
                                    mutableInteractionSource3 = mutableInteractionSource5;
                                } else {
                                    modifier2 = modifier4;
                                    z4 = z3;
                                    segmentedButtonColors3 = segmentedButtonColors2;
                                    paddingValues3 = contentPadding;
                                    mutableInteractionSource3 = mutableInteractionSource5;
                                    myVar4 = myVar;
                                }
                                borderStroke4 = borderStroke2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(697872538, i4, i13, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                            }
                            if (mutableInteractionSource3 == null) {
                                startRestartGroup.startReplaceGroup(-1615180959);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(640633398);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            long m2337containerColorWaAFU9c$material3 = segmentedButtonColors3.m2337containerColorWaAFU9c$material3(z4, z);
                            long m2338contentColorWaAFU9c$material3 = segmentedButtonColors3.m2338contentColorWaAFU9c$material3(z4, z);
                            Modifier modifier6 = modifier2;
                            Modifier interactionZIndex = interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, modifier6, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource4, startRestartGroup, 0));
                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                            PaddingValues paddingValues4 = paddingValues3;
                            SegmentedButtonColors segmentedButtonColors5 = segmentedButtonColors3;
                            my myVar5 = myVar4;
                            SurfaceKt.m2466Surfaced85dljk(z, kyVar, SizeKt.m791defaultMinSizeVpY3zN4(interactionZIndex, buttonDefaults.m1667getMinWidthD9Ej5fM(), buttonDefaults.m1666getMinHeightD9Ej5fM()), z4, shape, m2337containerColorWaAFU9c$material3, m2338contentColorWaAFU9c$material3, 0.0f, 0.0f, borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(1717860164, true, new my() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$2
                                public final void invoke(Composer composer2, int i14) {
                                    if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1717860164, i14, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:167)");
                                    }
                                    SegmentedButtonKt.SegmentedButtonContent(my.this, myVar2, paddingValues3, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 126) | ((i4 >> 6) & 7168) | (57344 & (i4 << 3)) | (1879048192 & (i4 << 6)), 48, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            borderStroke3 = borderStroke4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            segmentedButtonColors2 = segmentedButtonColors5;
                            paddingValues2 = paddingValues4;
                            myVar3 = myVar5;
                            modifier3 = modifier6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            paddingValues2 = paddingValues;
                            myVar3 = myVar;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new fn0(multiChoiceSegmentedButtonRowScope, z, kyVar, shape, modifier3, z3, segmentedButtonColors2, borderStroke3, paddingValues2, mutableInteractionSource2, myVar3, myVar2, i, i2, i3, 0));
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i3 & Fields.RotationY;
                    if (i10 != 0) {
                    }
                    if ((i3 & Fields.RotationZ) != 0) {
                    }
                    i13 = i12;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i6 = i3 & 16;
                if (i6 == 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 == 0) {
                }
                i8 = i3 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & Fields.RotationY;
                if (i10 != 0) {
                }
                if ((i3 & Fields.RotationZ) != 0) {
                }
                i13 = i12;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 == 0) {
            }
            i8 = i3 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationY;
            if (i10 != 0) {
            }
            if ((i3 & Fields.RotationZ) != 0) {
            }
            i13 = i12;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 == 0) {
        }
        i8 = i3 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationY;
        if (i10 != 0) {
        }
        if ((i3 & Fields.RotationZ) != 0) {
        }
        i13 = i12;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0244  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SegmentedButton(MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, final boolean z, ky kyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, Composer composer, int i, int i2, int i3) {
        int i4;
        ky kyVar2;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        int i8;
        int i9;
        int i10;
        my myVar3;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        boolean z4;
        SegmentedButtonColors segmentedButtonColors3;
        ScopeUpdateScope endRestartGroup;
        SegmentedButtonColors segmentedButtonColors4;
        Modifier modifier4;
        int i11;
        SegmentedButtonColors segmentedButtonColors5;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(2065856961);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(multiChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            kyVar2 = kyVar;
            i4 |= startRestartGroup.changedInstance(kyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i3 & 4) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(shape) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i3 & 8;
                if (i5 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
                    i6 = i3 & 16;
                    if (i6 == 0) {
                        i4 |= 196608;
                    } else if ((196608 & i) == 0) {
                        z3 = z2;
                        i4 |= startRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i3 & 32) == 0) {
                                segmentedButtonColors2 = segmentedButtonColors;
                                if (startRestartGroup.changed(segmentedButtonColors2)) {
                                    i12 = 1048576;
                                    i4 |= i12;
                                }
                            } else {
                                segmentedButtonColors2 = segmentedButtonColors;
                            }
                            i12 = Fields.BlendMode;
                            i4 |= i12;
                        } else {
                            segmentedButtonColors2 = segmentedButtonColors;
                        }
                        if ((i & 12582912) == 0) {
                            borderStroke2 = borderStroke;
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i7 = i3 & Fields.SpotShadowColor;
                        if (i7 != 0) {
                            i4 |= 100663296;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i & 100663296) == 0) {
                                i4 |= startRestartGroup.changed(mutableInteractionSource2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            }
                        }
                        i8 = i3 & Fields.RotationX;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i3 & Fields.RotationY) == 0) {
                                i10 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i10 = i2 | (startRestartGroup.changedInstance(myVar2) ? 4 : 2);
                            } else {
                                i10 = i2;
                            }
                            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 32) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -29360129;
                                    }
                                    myVar3 = myVar;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i11 = i4;
                                    modifier4 = modifier2;
                                    segmentedButtonColors5 = segmentedButtonColors2;
                                } else {
                                    Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier2;
                                    if (i6 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        segmentedButtonColors4 = SegmentedButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i4 &= -3670017;
                                    } else {
                                        segmentedButtonColors4 = segmentedButtonColors2;
                                    }
                                    if ((i3 & 64) != 0) {
                                        borderStroke2 = SegmentedButtonDefaults.m2352borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColors4.m2336borderColorWaAFU9c$material3(z3, z), 0.0f, 2, null);
                                        i4 = (-29360129) & i4;
                                    }
                                    MutableInteractionSource mutableInteractionSource4 = i7 != 0 ? null : mutableInteractionSource2;
                                    if (i9 != 0) {
                                        mutableInteractionSource3 = mutableInteractionSource4;
                                        segmentedButtonColors5 = segmentedButtonColors4;
                                        myVar3 = ComposableLambdaKt.rememberComposableLambda(-1867102712, true, new my() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$8
                                            public final void invoke(Composer composer2, int i13) {
                                                if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1867102712, i13, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:264)");
                                                }
                                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer2, 3072, 6);
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
                                        modifier4 = modifier5;
                                        i11 = i4;
                                    } else {
                                        modifier4 = modifier5;
                                        mutableInteractionSource3 = mutableInteractionSource4;
                                        i11 = i4;
                                        segmentedButtonColors5 = segmentedButtonColors4;
                                        myVar3 = myVar;
                                    }
                                }
                                BorderStroke borderStroke4 = borderStroke2;
                                boolean z5 = z3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2065856961, i11, i10, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                                }
                                SegmentedButton(multiChoiceSegmentedButtonRowScope, z, kyVar2, shape, modifier4, z5, segmentedButtonColors5, borderStroke4, SegmentedButtonDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, myVar3, myVar2, startRestartGroup, ((i11 << 3) & 1879048192) | (i11 & 14) | 100663296 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11), ((i11 >> 27) & 14) | ((i10 << 3) & 112), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                borderStroke3 = borderStroke4;
                                segmentedButtonColors3 = segmentedButtonColors5;
                                z4 = z5;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                myVar3 = myVar;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier3 = modifier2;
                                z4 = z3;
                                segmentedButtonColors3 = segmentedButtonColors2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new gn0(multiChoiceSegmentedButtonRowScope, z, kyVar, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource3, myVar3, myVar2, i, i2, i3, 1));
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        if ((i3 & Fields.RotationY) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z3 = z2;
                    if ((1572864 & i) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i3 & Fields.SpotShadowColor;
                    if (i7 != 0) {
                    }
                    i8 = i3 & Fields.RotationX;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    if ((i3 & Fields.RotationY) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                modifier2 = modifier;
                i6 = i3 & 16;
                if (i6 == 0) {
                }
                z3 = z2;
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 != 0) {
                }
                i8 = i3 & Fields.RotationX;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i3 & Fields.RotationY) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            z3 = z2;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i3 & Fields.RotationX;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i3 & Fields.RotationY) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        kyVar2 = kyVar;
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        z3 = z2;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i3 & Fields.RotationX;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i3 & Fields.RotationY) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0244  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SegmentedButton(SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, final boolean z, iy iyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, Composer composer, int i, int i2, int i3) {
        int i4;
        iy iyVar2;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        int i8;
        int i9;
        int i10;
        my myVar3;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        boolean z4;
        SegmentedButtonColors segmentedButtonColors3;
        ScopeUpdateScope endRestartGroup;
        SegmentedButtonColors segmentedButtonColors4;
        Modifier modifier4;
        int i11;
        SegmentedButtonColors segmentedButtonColors5;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1723786701);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(singleChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            iyVar2 = iyVar;
            i4 |= startRestartGroup.changedInstance(iyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i3 & 4) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(shape) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i3 & 8;
                if (i5 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
                    i6 = i3 & 16;
                    if (i6 == 0) {
                        i4 |= 196608;
                    } else if ((196608 & i) == 0) {
                        z3 = z2;
                        i4 |= startRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i3 & 32) == 0) {
                                segmentedButtonColors2 = segmentedButtonColors;
                                if (startRestartGroup.changed(segmentedButtonColors2)) {
                                    i12 = 1048576;
                                    i4 |= i12;
                                }
                            } else {
                                segmentedButtonColors2 = segmentedButtonColors;
                            }
                            i12 = Fields.BlendMode;
                            i4 |= i12;
                        } else {
                            segmentedButtonColors2 = segmentedButtonColors;
                        }
                        if ((i & 12582912) == 0) {
                            borderStroke2 = borderStroke;
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i7 = i3 & Fields.SpotShadowColor;
                        if (i7 != 0) {
                            i4 |= 100663296;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i & 100663296) == 0) {
                                i4 |= startRestartGroup.changed(mutableInteractionSource2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            }
                        }
                        i8 = i3 & Fields.RotationX;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i3 & Fields.RotationY) == 0) {
                                i10 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i10 = i2 | (startRestartGroup.changedInstance(myVar2) ? 4 : 2);
                            } else {
                                i10 = i2;
                            }
                            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 32) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -29360129;
                                    }
                                    myVar3 = myVar;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i11 = i4;
                                    modifier4 = modifier2;
                                    segmentedButtonColors5 = segmentedButtonColors2;
                                } else {
                                    Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier2;
                                    if (i6 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        segmentedButtonColors4 = SegmentedButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i4 &= -3670017;
                                    } else {
                                        segmentedButtonColors4 = segmentedButtonColors2;
                                    }
                                    if ((i3 & 64) != 0) {
                                        borderStroke2 = SegmentedButtonDefaults.m2352borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColors4.m2336borderColorWaAFU9c$material3(z3, z), 0.0f, 2, null);
                                        i4 = (-29360129) & i4;
                                    }
                                    MutableInteractionSource mutableInteractionSource4 = i7 != 0 ? null : mutableInteractionSource2;
                                    if (i9 != 0) {
                                        mutableInteractionSource3 = mutableInteractionSource4;
                                        segmentedButtonColors5 = segmentedButtonColors4;
                                        myVar3 = ComposableLambdaKt.rememberComposableLambda(61121126, true, new my() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$10
                                            public final void invoke(Composer composer2, int i13) {
                                                if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(61121126, i13, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:294)");
                                                }
                                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer2, 3072, 6);
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
                                        modifier4 = modifier5;
                                        i11 = i4;
                                    } else {
                                        modifier4 = modifier5;
                                        mutableInteractionSource3 = mutableInteractionSource4;
                                        i11 = i4;
                                        segmentedButtonColors5 = segmentedButtonColors4;
                                        myVar3 = myVar;
                                    }
                                }
                                BorderStroke borderStroke4 = borderStroke2;
                                boolean z5 = z3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1723786701, i11, i10, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                                }
                                SegmentedButton(singleChoiceSegmentedButtonRowScope, z, iyVar2, shape, modifier4, z5, segmentedButtonColors5, borderStroke4, SegmentedButtonDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, myVar3, myVar2, startRestartGroup, ((i11 << 3) & 1879048192) | (i11 & 14) | 100663296 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11), ((i11 >> 27) & 14) | ((i10 << 3) & 112), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                borderStroke3 = borderStroke4;
                                segmentedButtonColors3 = segmentedButtonColors5;
                                z4 = z5;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                myVar3 = myVar;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier3 = modifier2;
                                z4 = z3;
                                segmentedButtonColors3 = segmentedButtonColors2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new gn0(singleChoiceSegmentedButtonRowScope, z, iyVar, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource3, myVar3, myVar2, i, i2, i3, 0));
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        if ((i3 & Fields.RotationY) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z3 = z2;
                    if ((1572864 & i) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i3 & Fields.SpotShadowColor;
                    if (i7 != 0) {
                    }
                    i8 = i3 & Fields.RotationX;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    if ((i3 & Fields.RotationY) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                modifier2 = modifier;
                i6 = i3 & 16;
                if (i6 == 0) {
                }
                z3 = z2;
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 != 0) {
                }
                i8 = i3 & Fields.RotationX;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i3 & Fields.RotationY) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            z3 = z2;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i3 & Fields.RotationX;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i3 & Fields.RotationY) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        iyVar2 = iyVar;
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        z3 = z2;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i3 & Fields.RotationX;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i3 & Fields.RotationY) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
