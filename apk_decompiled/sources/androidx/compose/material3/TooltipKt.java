package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TooltipAnchorPosition;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.bw0;
import defpackage.d00;
import defpackage.er;
import defpackage.h7;
import defpackage.iy;
import defpackage.j3;
import defpackage.k4;
import defpackage.ky;
import defpackage.l9;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.uh;
import defpackage.w01;
import defpackage.xv0;
import defpackage.yd;
import defpackage.yv0;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TooltipKt {
    private static final float ActionLabelBottomPadding;
    private static final float ActionLabelMinHeight;
    private static final float HeightFromSubheadToTextFirstLine;
    private static final float HeightToSubheadFirstLine;
    private static final PaddingValues PlainTooltipContentPadding;
    private static final float PlainTooltipHorizontalPadding;
    private static final float PlainTooltipVerticalPadding;
    private static final float RichTooltipHorizontalPadding;
    private static final float TextBottomPadding;
    private static final float SpacingBetweenTooltipAndAnchor = Dp.m7611constructorimpl(4.0f);
    private static final float TooltipMinHeight = Dp.m7611constructorimpl(24.0f);
    private static final float TooltipMinWidth = Dp.m7611constructorimpl(40.0f);

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(4.0f);
        PlainTooltipVerticalPadding = m7611constructorimpl;
        float m7611constructorimpl2 = Dp.m7611constructorimpl(8.0f);
        PlainTooltipHorizontalPadding = m7611constructorimpl2;
        PlainTooltipContentPadding = PaddingKt.m756PaddingValuesYgX7TsA(m7611constructorimpl2, m7611constructorimpl);
        RichTooltipHorizontalPadding = Dp.m7611constructorimpl(16.0f);
        HeightToSubheadFirstLine = Dp.m7611constructorimpl(28.0f);
        HeightFromSubheadToTextFirstLine = Dp.m7611constructorimpl(24.0f);
        TextBottomPadding = Dp.m7611constructorimpl(16.0f);
        ActionLabelMinHeight = Dp.m7611constructorimpl(36.0f);
        ActionLabelBottomPadding = Dp.m7611constructorimpl(8.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* renamed from: PlainTooltip-gv3ox5I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2789PlainTooltipgv3ox5I(final TooltipScope tooltipScope, Modifier modifier, Shape shape, float f, Shape shape2, long j, long j2, float f2, float f3, final my myVar, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Shape shape3;
        int i5;
        float f4;
        Shape shape4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final float f5;
        final Modifier modifier3;
        final Shape shape5;
        final Shape shape6;
        final float f6;
        final long j3;
        final long j4;
        final float f7;
        ScopeUpdateScope endRestartGroup;
        long j5;
        long j6;
        float m7611constructorimpl;
        float f8;
        final float f9;
        int i11;
        long j7;
        long j8;
        int i12;
        Modifier modifier4;
        Shape shape7;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-343758958);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 1;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shape3 = shape;
                i3 |= startRestartGroup.changed(shape3) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f4 = f;
                    i3 |= startRestartGroup.changed(f4) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 8) == 0) {
                            shape4 = shape2;
                            if (startRestartGroup.changed(shape4)) {
                                i15 = Fields.Clip;
                                i3 |= i15;
                            }
                        } else {
                            shape4 = shape2;
                        }
                        i15 = 8192;
                        i3 |= i15;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i & 196608) != 0) {
                        if ((i2 & 16) == 0) {
                            i6 = i16;
                            if (startRestartGroup.changed(j)) {
                                i14 = Fields.RenderEffect;
                                i3 |= i14;
                            }
                        } else {
                            i6 = i16;
                        }
                        i14 = 65536;
                        i3 |= i14;
                    } else {
                        i6 = i16;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j2)) ? 1048576 : Fields.BlendMode;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i8 = i2 & Fields.SpotShadowColor;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationX) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i10 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i6 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i4 != 0) {
                                    shape3 = null;
                                }
                                if (i5 != 0) {
                                    f4 = TooltipDefaults.INSTANCE.m2782getPlainTooltipMaxWidthD9Ej5fM();
                                }
                                if ((i2 & 8) != 0) {
                                    i10 &= -57345;
                                    shape4 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    j5 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                                    i10 &= -458753;
                                } else {
                                    j5 = j;
                                }
                                if ((i2 & 32) != 0) {
                                    j6 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                                    i10 &= -3670017;
                                } else {
                                    j6 = j2;
                                }
                                float m7611constructorimpl2 = i7 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                                m7611constructorimpl = i9 != 0 ? Dp.m7611constructorimpl(0.0f) : f3;
                                f8 = m7611constructorimpl2;
                                f9 = f4;
                                i11 = i10;
                                j7 = j6;
                                j8 = j5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i10 &= -57345;
                                }
                                if ((i2 & 16) != 0) {
                                    i10 &= -458753;
                                }
                                if ((i2 & 32) != 0) {
                                    i10 &= -3670017;
                                }
                                j8 = j;
                                j7 = j2;
                                f8 = f2;
                                m7611constructorimpl = f3;
                                f9 = f4;
                                i11 = i10;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-343758958, i11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                            }
                            if (shape3 != null) {
                                startRestartGroup.startReplaceGroup(-1720477287);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                Composer.Companion companion = Composer.Companion;
                                i12 = 57344;
                                if (rememberedValue == companion.getEmpty()) {
                                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Matrix.m5003boximpl(Matrix.m5005constructorimpl$default(null, 1, null)), null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                MutableState mutableState = (MutableState) rememberedValue;
                                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                long mo6769getContainerSizeYbymL2g = ((WindowInfo) startRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo6769getContainerSizeYbymL2g();
                                Modifier.Companion companion2 = Modifier.Companion;
                                boolean z = (i11 & 14) == 4 || ((i11 & 8) != 0 && startRestartGroup.changedInstance(tooltipScope));
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z || rememberedValue2 == companion.getEmpty()) {
                                    i13 = 0;
                                    rememberedValue2 = new xv0(tooltipScope, i13);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                } else {
                                    i13 = 0;
                                }
                                Modifier then = m2793layoutCaretJ5j9r9c(companion2, mutableState, density, mo6769getContainerSizeYbymL2g, (ky) rememberedValue2, tooltipScope.obtainPositionProvider()).then(modifier2);
                                int i17 = ((i11 & 896) == 256 ? 1 : 0) | (((((i11 & 57344) ^ 24576) <= 16384 || !startRestartGroup.changed(shape4)) && (i11 & 24576) != 16384) ? i13 : 1);
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (i17 != 0 || rememberedValue3 == companion.getEmpty()) {
                                    rememberedValue3 = new TooltipCaretShape(mutableState, shape4, shape3);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceGroup();
                                modifier4 = then;
                                shape7 = (TooltipCaretShape) rememberedValue3;
                            } else {
                                i12 = 57344;
                                startRestartGroup.startReplaceGroup(-1719831991);
                                startRestartGroup.endReplaceGroup();
                                modifier4 = modifier2;
                                shape7 = shape4;
                            }
                            final long j9 = j8;
                            float f10 = f9;
                            int i18 = i11 >> 9;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2464SurfaceT9BRK9s(modifier4, shape7, j7, 0L, f8, m7611constructorimpl, null, ComposableLambdaKt.rememberComposableLambda(-1573998995, true, new my() { // from class: androidx.compose.material3.TooltipKt$PlainTooltip$4
                                public final void invoke(Composer composer3, int i19) {
                                    if (!composer3.shouldExecute((i19 & 3) != 2, i19 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1573998995, i19, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.kt:462)");
                                    }
                                    Modifier padding = PaddingKt.padding(SizeKt.m811sizeInqDBjuR0$default(Modifier.Companion, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), f9, 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                                    long j10 = j9;
                                    my myVar2 = myVar;
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, padding);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                    iy constructor = companion3.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                                    my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j10)), TextKt.getLocalTextStyle().provides(TypographyKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextFont(), composer3, 6))}, myVar2, composer3, ProvidedValue.$stable);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), composer2, ((i11 >> 12) & 896) | 12582912 | (i18 & i12) | (i18 & 458752), 72);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            shape6 = shape3;
                            f7 = f8;
                            f5 = m7611constructorimpl;
                            j3 = j9;
                            shape5 = shape4;
                            j4 = j7;
                            f6 = f10;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            f5 = f3;
                            modifier3 = modifier2;
                            shape5 = shape4;
                            shape6 = shape3;
                            f6 = f4;
                            j3 = j;
                            j4 = j2;
                            f7 = f2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: zv0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 PlainTooltip_gv3ox5I$lambda$11;
                                    int intValue = ((Integer) obj2).intValue();
                                    PlainTooltip_gv3ox5I$lambda$11 = TooltipKt.PlainTooltip_gv3ox5I$lambda$11(TooltipScope.this, modifier3, shape6, f6, shape5, j3, j4, f7, f5, myVar, i, i2, (Composer) obj, intValue);
                                    return PlainTooltip_gv3ox5I$lambda$11;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i2 & Fields.RotationX) != 0) {
                    }
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f4 = f;
                if ((i & 24576) != 0) {
                }
                if ((i & 196608) != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & Fields.SpotShadowColor;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & Fields.RotationX) != 0) {
                }
                i10 = i3;
                if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            shape3 = shape;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            f4 = f;
            if ((i & 24576) != 0) {
            }
            if ((i & 196608) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & Fields.SpotShadowColor;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & Fields.RotationX) != 0) {
            }
            i10 = i3;
            if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        shape3 = shape;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        f4 = f;
        if ((i & 24576) != 0) {
        }
        if ((i & 196608) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & Fields.RotationX) != 0) {
        }
        i10 = i3;
        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    @er
    /* renamed from: PlainTooltip-m9Er-Xc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2790PlainTooltipm9ErXc(TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long j4;
        int i4;
        float f4;
        Shape shape2;
        long j5;
        int i5;
        int i6;
        float f5;
        int i7;
        int i8;
        int i9;
        Modifier modifier3;
        long j6;
        float f6;
        Shape shape3;
        Composer composer2;
        long j7;
        long j8;
        float f7;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        long j9;
        float m2782getPlainTooltipMaxWidthD9Ej5fM;
        Shape shape4;
        long j10;
        long j11;
        long j12;
        Shape shape5;
        long j13;
        int i10;
        float m7611constructorimpl;
        float f8;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1881241092);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 2) == 0) {
                    j4 = j;
                    if (startRestartGroup.changed(j4)) {
                        i12 = Fields.RotationX;
                        i3 |= i12;
                    }
                } else {
                    j4 = j;
                }
                i12 = Fields.SpotShadowColor;
                i3 |= i12;
            } else {
                j4 = j;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f;
                i3 |= startRestartGroup.changed(f4) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = Fields.Clip;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    j5 = j2;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j5)) ? Fields.RenderEffect : 65536;
                } else {
                    j5 = j2;
                }
                if ((1572864 & i) == 0) {
                    i5 = i3 | (((i2 & 32) == 0 && startRestartGroup.changed(j3)) ? 1048576 : Fields.BlendMode);
                } else {
                    i5 = i3;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i5 |= 12582912;
                    f5 = f2;
                } else {
                    f5 = f2;
                    if ((i & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(f5) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i5 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    int i14 = 805306368;
                    if ((i2 & Fields.RotationX) == 0) {
                        if ((i & 805306368) != 0) {
                            i9 = i5;
                            if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    modifier4 = i13 != 0 ? Modifier.Companion : modifier2;
                                    if ((i2 & 2) != 0) {
                                        j9 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
                                        i9 &= -897;
                                    } else {
                                        j9 = j4;
                                    }
                                    m2782getPlainTooltipMaxWidthD9Ej5fM = i4 != 0 ? TooltipDefaults.INSTANCE.m2782getPlainTooltipMaxWidthD9Ej5fM() : f4;
                                    if ((i2 & 8) != 0) {
                                        shape4 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                                        i9 &= -57345;
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        j10 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                                        i9 &= -458753;
                                    } else {
                                        j10 = j5;
                                    }
                                    if ((i2 & 32) != 0) {
                                        j11 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                                        i9 &= -3670017;
                                    } else {
                                        j11 = j3;
                                    }
                                    float m7611constructorimpl2 = i6 != 0 ? Dp.m7611constructorimpl(0.0f) : f5;
                                    if (i8 != 0) {
                                        f5 = m7611constructorimpl2;
                                        i10 = i9;
                                        m7611constructorimpl = Dp.m7611constructorimpl(0.0f);
                                        j12 = j9;
                                        shape5 = shape4;
                                        j13 = j11;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            f8 = m7611constructorimpl;
                                        } else {
                                            f8 = m7611constructorimpl;
                                            ComposerKt.traceEventStart(-1881241092, i10, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:389)");
                                        }
                                        int i15 = 2147482750 & i10;
                                        long j14 = j12;
                                        float f9 = m2782getPlainTooltipMaxWidthD9Ej5fM;
                                        long j15 = j10;
                                        float f10 = f5;
                                        float f11 = f8;
                                        m2789PlainTooltipgv3ox5I(tooltipScope, modifier4, TooltipDefaults.INSTANCE.m2780caretShapeEaSLcWc(j12), f9, shape5, j15, j13, f10, f11, myVar, startRestartGroup, i15, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        f5 = f10;
                                        composer2 = startRestartGroup;
                                        f7 = f11;
                                        j8 = j13;
                                        j7 = j15;
                                        f6 = f9;
                                        shape3 = shape5;
                                        j6 = j14;
                                    } else {
                                        f5 = m7611constructorimpl2;
                                        j12 = j9;
                                        shape5 = shape4;
                                        j13 = j11;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i9 &= -897;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i9 &= -57345;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i9 &= -458753;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i9 &= -3670017;
                                    }
                                    modifier4 = modifier2;
                                    j12 = j4;
                                    m2782getPlainTooltipMaxWidthD9Ej5fM = f4;
                                    shape5 = shape2;
                                    j10 = j5;
                                    j13 = j3;
                                }
                                i10 = i9;
                                m7611constructorimpl = f3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i152 = 2147482750 & i10;
                                long j142 = j12;
                                float f92 = m2782getPlainTooltipMaxWidthD9Ej5fM;
                                long j152 = j10;
                                float f102 = f5;
                                float f112 = f8;
                                m2789PlainTooltipgv3ox5I(tooltipScope, modifier4, TooltipDefaults.INSTANCE.m2780caretShapeEaSLcWc(j12), f92, shape5, j152, j13, f102, f112, myVar, startRestartGroup, i152, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                                f5 = f102;
                                composer2 = startRestartGroup;
                                f7 = f112;
                                j8 = j13;
                                j7 = j152;
                                f6 = f92;
                                shape3 = shape5;
                                j6 = j142;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                j6 = j4;
                                f6 = f4;
                                shape3 = shape2;
                                composer2 = startRestartGroup;
                                j7 = j5;
                                j8 = j3;
                                f7 = f3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new bw0(tooltipScope, modifier3, j6, f6, shape3, j7, j8, f5, f7, myVar, i, i2, 0));
                                return;
                            }
                            return;
                        }
                        i14 = startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i5 |= i14;
                    i9 = i5;
                    if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                int i142 = 805306368;
                if ((i2 & Fields.RotationX) == 0) {
                }
                i5 |= i142;
                i9 = i5;
                if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f4 = f;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            int i1422 = 805306368;
            if ((i2 & Fields.RotationX) == 0) {
            }
            i5 |= i1422;
            i9 = i5;
            if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        int i14222 = 805306368;
        if ((i2 & Fields.RotationX) == 0) {
        }
        i5 |= i14222;
        i9 = i5;
        if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PlainTooltip_gv3ox5I$lambda$11(TooltipScope tooltipScope, Modifier modifier, Shape shape, float f, Shape shape2, long j, long j2, float f2, float f3, my myVar, int i, int i2, Composer composer, int i3) {
        m2789PlainTooltipgv3ox5I(tooltipScope, modifier, shape, f, shape2, j, j2, f2, f3, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PlainTooltip_m9Er_Xc$lambda$6(TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, my myVar, int i, int i2, Composer composer, int i3) {
        m2790PlainTooltipm9ErXc(tooltipScope, modifier, j, f, shape, j2, j3, f2, f3, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0228  */
    /* renamed from: RichTooltip-EkvW5A0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2791RichTooltipEkvW5A0(final TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, Shape shape, float f, Shape shape2, RichTooltipColors richTooltipColors, float f2, float f3, final my myVar3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        final my myVar4;
        int i6;
        final my myVar5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Shape shape3;
        final float f4;
        final RichTooltipColors richTooltipColors2;
        final float f5;
        final Modifier modifier3;
        final my myVar6;
        final Shape shape4;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        Shape shape5;
        float m2783getRichTooltipMaxWidthD9Ej5fM;
        Shape shape6;
        final RichTooltipColors richTooltipColors3;
        float f7;
        int i15;
        int i16;
        int i17;
        float m3597getContainerElevationD9Ej5fM;
        int i18;
        Modifier modifier5;
        Shape shape7;
        Composer.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(236290785);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 1;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 2;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar;
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 4;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar5 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
                    i7 = i3 & 8;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(shape) ? Fields.Clip : 8192;
                        i8 = i3 & 16;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(f) ? Fields.RenderEffect : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i & 12582912) == 0) {
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(richTooltipColors)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        i9 = i3 & Fields.SpotShadowColor;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            i11 = i3 & Fields.RotationX;
                            if (i11 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i12 = i11;
                                i4 |= startRestartGroup.changed(f3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                if ((i3 & Fields.RotationY) != 0) {
                                    i13 = i2 | 6;
                                } else if ((i2 & 6) == 0) {
                                    i13 = i2 | (startRestartGroup.changedInstance(myVar3) ? 4 : 2);
                                } else {
                                    i13 = i2;
                                }
                                i14 = i4;
                                if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        modifier4 = i19 != 0 ? Modifier.Companion : modifier2;
                                        if (i5 != 0) {
                                            myVar4 = null;
                                        }
                                        if (i6 != 0) {
                                            myVar5 = null;
                                        }
                                        shape5 = i7 != 0 ? null : shape;
                                        m2783getRichTooltipMaxWidthD9Ej5fM = i8 != 0 ? TooltipDefaults.INSTANCE.m2783getRichTooltipMaxWidthD9Ej5fM() : f;
                                        if ((i3 & 32) != 0) {
                                            shape6 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                            i14 &= -3670017;
                                        } else {
                                            shape6 = shape2;
                                        }
                                        if ((i3 & 64) != 0) {
                                            richTooltipColors3 = TooltipDefaults.INSTANCE.richTooltipColors(startRestartGroup, 6);
                                            i14 &= -29360129;
                                        } else {
                                            richTooltipColors3 = richTooltipColors;
                                        }
                                        float m3254getLevel0D9Ej5fM = i10 != 0 ? ElevationTokens.INSTANCE.m3254getLevel0D9Ej5fM() : f2;
                                        if (i12 != 0) {
                                            m3597getContainerElevationD9Ej5fM = RichTooltipTokens.INSTANCE.m3597getContainerElevationD9Ej5fM();
                                            i15 = 12582912;
                                            f7 = m3254getLevel0D9Ej5fM;
                                            i16 = i14;
                                            i17 = 2;
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(236290785, i16, i13, "androidx.compose.material3.RichTooltip (Tooltip.kt:542)");
                                            }
                                            if (shape5 == null) {
                                                startRestartGroup.startReplaceGroup(-111951894);
                                                Object rememberedValue = startRestartGroup.rememberedValue();
                                                Composer.Companion companion2 = Composer.Companion;
                                                i18 = 57344;
                                                if (rememberedValue == companion2.getEmpty()) {
                                                    companion = companion2;
                                                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Matrix.m5003boximpl(Matrix.m5005constructorimpl$default(null, 1, null)), null, i17, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                } else {
                                                    companion = companion2;
                                                }
                                                MutableState mutableState = (MutableState) rememberedValue;
                                                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                long mo6769getContainerSizeYbymL2g = ((WindowInfo) startRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo6769getContainerSizeYbymL2g();
                                                Modifier.Companion companion3 = Modifier.Companion;
                                                boolean z = (i16 & 14) == 4 || ((i16 & 8) != 0 && startRestartGroup.changedInstance(tooltipScope));
                                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                if (z || rememberedValue2 == companion.getEmpty()) {
                                                    rememberedValue2 = new xv0(tooltipScope, 1);
                                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                                }
                                                Modifier then = m2793layoutCaretJ5j9r9c(companion3, mutableState, density, mo6769getContainerSizeYbymL2g, (ky) rememberedValue2, tooltipScope.obtainPositionProvider()).then(modifier4);
                                                boolean z2 = ((((3670016 & i16) ^ 1572864) > 1048576 && startRestartGroup.changed(shape6)) || (i16 & 1572864) == 1048576) | ((i16 & 57344) == 16384);
                                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                if (z2 || rememberedValue3 == companion.getEmpty()) {
                                                    rememberedValue3 = new TooltipCaretShape(mutableState, shape6, shape5);
                                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                modifier5 = then;
                                                shape7 = (TooltipCaretShape) rememberedValue3;
                                            } else {
                                                i18 = 57344;
                                                startRestartGroup.startReplaceGroup(-111306598);
                                                startRestartGroup.endReplaceGroup();
                                                modifier5 = modifier4;
                                                shape7 = shape6;
                                            }
                                            int i20 = i16 >> 12;
                                            composer2 = startRestartGroup;
                                            SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.m811sizeInqDBjuR0$default(modifier5, TooltipMinWidth, TooltipMinHeight, m2783getRichTooltipMaxWidthD9Ej5fM, 0.0f, 8, null), shape7, richTooltipColors3.m2292getContainerColor0d7_KjU(), 0L, f7, m3597getContainerElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(-1249811482, true, new my() { // from class: androidx.compose.material3.TooltipKt$RichTooltip$4
                                                public final void invoke(Composer composer3, int i21) {
                                                    if (!composer3.shouldExecute((i21 & 3) != 2, i21 & 1)) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1249811482, i21, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.kt:579)");
                                                    }
                                                    RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
                                                    TextStyle value = TypographyKt.getValue(richTooltipTokens.getActionLabelTextFont(), composer3, 6);
                                                    TextStyle value2 = TypographyKt.getValue(richTooltipTokens.getSubheadFont(), composer3, 6);
                                                    TextStyle value3 = TypographyKt.getValue(richTooltipTokens.getSupportingTextFont(), composer3, 6);
                                                    Modifier.Companion companion4 = Modifier.Companion;
                                                    Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(companion4, TooltipKt.getRichTooltipHorizontalPadding(), 0.0f, 2, null);
                                                    my myVar7 = my.this;
                                                    my myVar8 = myVar5;
                                                    RichTooltipColors richTooltipColors4 = richTooltipColors3;
                                                    my myVar9 = myVar3;
                                                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                                    Alignment.Companion companion5 = Alignment.Companion;
                                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer3, 0);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m764paddingVpY3zN4$default);
                                                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                                                    iy constructor = companion6.getConstructor();
                                                    if (composer3.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                                                    my b = k4.b(companion6, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                    }
                                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion6.getSetModifier());
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    if (myVar7 == null) {
                                                        composer3.startReplaceGroup(112051624);
                                                    } else {
                                                        composer3.startReplaceGroup(112051625);
                                                        Modifier m622paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m622paddingFromBaselineVpY3zN4$default(companion4, TooltipKt.getHeightToSubheadFirstLine(), 0.0f, 2, null);
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m622paddingFromBaselineVpY3zN4$default);
                                                        iy constructor2 = companion6.getConstructor();
                                                        if (composer3.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer3.startReusableNode();
                                                        if (composer3.getInserting()) {
                                                            composer3.createNode(constructor2);
                                                        } else {
                                                            composer3.useNode();
                                                        }
                                                        Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                                                        my b2 = k4.b(companion6, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion6.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(richTooltipColors4.m2294getTitleContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value2)}, myVar7, composer3, ProvidedValue.$stable);
                                                        composer3.endNode();
                                                    }
                                                    composer3.endReplaceGroup();
                                                    Modifier textVerticalPadding = TooltipKt.textVerticalPadding(companion4, myVar7 != null, myVar8 != null);
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, textVerticalPadding);
                                                    iy constructor3 = companion6.getConstructor();
                                                    if (composer3.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor3);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                                                    my b3 = k4.b(companion6, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                                                    if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                        k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                                                    }
                                                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion6.getSetModifier());
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(richTooltipColors4.m2293getContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value3)};
                                                    int i22 = ProvidedValue.$stable;
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, myVar9, composer3, i22);
                                                    composer3.endNode();
                                                    if (myVar8 == null) {
                                                        composer3.startReplaceGroup(112784836);
                                                    } else {
                                                        composer3.startReplaceGroup(112784837);
                                                        Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(SizeKt.m798requiredHeightInVpY3zN4$default(companion4, TooltipKt.getActionLabelMinHeight(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.getActionLabelBottomPadding(), 7, null);
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
                                                        iy constructor4 = companion6.getConstructor();
                                                        if (composer3.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer3.startReusableNode();
                                                        if (composer3.getInserting()) {
                                                            composer3.createNode(constructor4);
                                                        } else {
                                                            composer3.useNode();
                                                        }
                                                        Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer3);
                                                        my b4 = k4.b(companion6, m3878constructorimpl4, maybeCachedBoxMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
                                                        if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                            k4.j(b4, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion6.getSetModifier());
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(richTooltipColors4.m2291getActionContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value)}, myVar8, composer3, i22);
                                                        composer3.endNode();
                                                    }
                                                    composer3.endReplaceGroup();
                                                    composer3.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // defpackage.my
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                                    return w01.a;
                                                }
                                            }, startRestartGroup, 54), composer2, (i20 & i18) | i15 | (i20 & 458752), 72);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier3 = modifier4;
                                            shape3 = shape5;
                                            f4 = m2783getRichTooltipMaxWidthD9Ej5fM;
                                            shape4 = shape6;
                                            myVar6 = myVar4;
                                            richTooltipColors2 = richTooltipColors3;
                                            f6 = f7;
                                            f5 = m3597getContainerElevationD9Ej5fM;
                                        } else {
                                            f7 = m3254getLevel0D9Ej5fM;
                                            i15 = 12582912;
                                            i16 = i14;
                                            i17 = 2;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i21 = (i3 & 32) != 0 ? i14 & (-3670017) : i14;
                                        if ((i3 & 64) != 0) {
                                            i21 &= -29360129;
                                        }
                                        shape5 = shape;
                                        shape6 = shape2;
                                        richTooltipColors3 = richTooltipColors;
                                        f7 = f2;
                                        i16 = i21;
                                        modifier4 = modifier2;
                                        i15 = 12582912;
                                        i17 = 2;
                                        m2783getRichTooltipMaxWidthD9Ej5fM = f;
                                    }
                                    m3597getContainerElevationD9Ej5fM = f3;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (shape5 == null) {
                                    }
                                    int i202 = i16 >> 12;
                                    composer2 = startRestartGroup;
                                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.m811sizeInqDBjuR0$default(modifier5, TooltipMinWidth, TooltipMinHeight, m2783getRichTooltipMaxWidthD9Ej5fM, 0.0f, 8, null), shape7, richTooltipColors3.m2292getContainerColor0d7_KjU(), 0L, f7, m3597getContainerElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(-1249811482, true, new my() { // from class: androidx.compose.material3.TooltipKt$RichTooltip$4
                                        public final void invoke(Composer composer3, int i212) {
                                            if (!composer3.shouldExecute((i212 & 3) != 2, i212 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1249811482, i212, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.kt:579)");
                                            }
                                            RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
                                            TextStyle value = TypographyKt.getValue(richTooltipTokens.getActionLabelTextFont(), composer3, 6);
                                            TextStyle value2 = TypographyKt.getValue(richTooltipTokens.getSubheadFont(), composer3, 6);
                                            TextStyle value3 = TypographyKt.getValue(richTooltipTokens.getSupportingTextFont(), composer3, 6);
                                            Modifier.Companion companion4 = Modifier.Companion;
                                            Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(companion4, TooltipKt.getRichTooltipHorizontalPadding(), 0.0f, 2, null);
                                            my myVar7 = my.this;
                                            my myVar8 = myVar5;
                                            RichTooltipColors richTooltipColors4 = richTooltipColors3;
                                            my myVar9 = myVar3;
                                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                            Alignment.Companion companion5 = Alignment.Companion;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer3, 0);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m764paddingVpY3zN4$default);
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                                            iy constructor = companion6.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                                            my b = k4.b(companion6, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                            }
                                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion6.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            if (myVar7 == null) {
                                                composer3.startReplaceGroup(112051624);
                                            } else {
                                                composer3.startReplaceGroup(112051625);
                                                Modifier m622paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m622paddingFromBaselineVpY3zN4$default(companion4, TooltipKt.getHeightToSubheadFirstLine(), 0.0f, 2, null);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m622paddingFromBaselineVpY3zN4$default);
                                                iy constructor2 = companion6.getConstructor();
                                                if (composer3.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor2);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                                                my b2 = k4.b(companion6, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion6.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(richTooltipColors4.m2294getTitleContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value2)}, myVar7, composer3, ProvidedValue.$stable);
                                                composer3.endNode();
                                            }
                                            composer3.endReplaceGroup();
                                            Modifier textVerticalPadding = TooltipKt.textVerticalPadding(companion4, myVar7 != null, myVar8 != null);
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, textVerticalPadding);
                                            iy constructor3 = companion6.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                                            my b3 = k4.b(companion6, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                                            if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                                            }
                                            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion6.getSetModifier());
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(richTooltipColors4.m2293getContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value3)};
                                            int i22 = ProvidedValue.$stable;
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, myVar9, composer3, i22);
                                            composer3.endNode();
                                            if (myVar8 == null) {
                                                composer3.startReplaceGroup(112784836);
                                            } else {
                                                composer3.startReplaceGroup(112784837);
                                                Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(SizeKt.m798requiredHeightInVpY3zN4$default(companion4, TooltipKt.getActionLabelMinHeight(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.getActionLabelBottomPadding(), 7, null);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
                                                iy constructor4 = companion6.getConstructor();
                                                if (composer3.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor4);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer3);
                                                my b4 = k4.b(companion6, m3878constructorimpl4, maybeCachedBoxMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
                                                if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    k4.j(b4, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion6.getSetModifier());
                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(richTooltipColors4.m2291getActionContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value)}, myVar8, composer3, i22);
                                                composer3.endNode();
                                            }
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54), composer2, (i202 & i18) | i15 | (i202 & 458752), 72);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier4;
                                    shape3 = shape5;
                                    f4 = m2783getRichTooltipMaxWidthD9Ej5fM;
                                    shape4 = shape6;
                                    myVar6 = myVar4;
                                    richTooltipColors2 = richTooltipColors3;
                                    f6 = f7;
                                    f5 = m3597getContainerElevationD9Ej5fM;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    shape3 = shape;
                                    f4 = f;
                                    richTooltipColors2 = richTooltipColors;
                                    f5 = f3;
                                    modifier3 = modifier2;
                                    myVar6 = myVar4;
                                    shape4 = shape2;
                                    f6 = f2;
                                }
                                final my myVar7 = myVar5;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: aw0
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 RichTooltip_EkvW5A0$lambda$17;
                                            int intValue = ((Integer) obj2).intValue();
                                            RichTooltip_EkvW5A0$lambda$17 = TooltipKt.RichTooltip_EkvW5A0$lambda$17(TooltipScope.this, modifier3, myVar6, myVar7, shape3, f4, shape4, richTooltipColors2, f6, f5, myVar3, i, i2, i3, (Composer) obj, intValue);
                                            return RichTooltip_EkvW5A0$lambda$17;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i12 = i11;
                            if ((i3 & Fields.RotationY) != 0) {
                            }
                            i14 = i4;
                            if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                            }
                            final my myVar72 = myVar5;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & Fields.RotationX;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if ((i3 & Fields.RotationY) != 0) {
                        }
                        i14 = i4;
                        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                        }
                        final my myVar722 = myVar5;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 16;
                    if (i8 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i3 & Fields.SpotShadowColor;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & Fields.RotationX;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i3 & Fields.RotationY) != 0) {
                    }
                    i14 = i4;
                    if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                    }
                    final my myVar7222 = myVar5;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar5 = myVar2;
                i7 = i3 & 8;
                if (i7 == 0) {
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & Fields.SpotShadowColor;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & Fields.RotationX;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i3 & Fields.RotationY) != 0) {
                }
                i14 = i4;
                if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                }
                final my myVar72222 = myVar5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar;
            i6 = i3 & 4;
            if (i6 != 0) {
            }
            myVar5 = myVar2;
            i7 = i3 & 8;
            if (i7 == 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & Fields.SpotShadowColor;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & Fields.RotationX;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i3 & Fields.RotationY) != 0) {
            }
            i14 = i4;
            if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
            }
            final my myVar722222 = myVar5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 2;
        if (i5 == 0) {
        }
        myVar4 = myVar;
        i6 = i3 & 4;
        if (i6 != 0) {
        }
        myVar5 = myVar2;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & Fields.SpotShadowColor;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & Fields.RotationX;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i3 & Fields.RotationY) != 0) {
        }
        i14 = i4;
        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
        }
        final my myVar7222222 = myVar5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: RichTooltip-ZuUcA3Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2792RichTooltipZuUcA3Q(TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, my myVar3, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        my myVar4;
        int i6;
        my myVar5;
        long j2;
        int i7;
        float f4;
        RichTooltipColors richTooltipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape2;
        float f5;
        Modifier modifier3;
        my myVar6;
        Composer composer2;
        float f6;
        float f7;
        RichTooltipColors richTooltipColors3;
        my myVar7;
        long j3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        long j4;
        Shape shape3;
        int i13;
        my myVar8;
        float f8;
        float f9;
        float f10;
        RichTooltipColors richTooltipColors4;
        long j5;
        my myVar9;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-2125725529);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 2;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar;
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 4;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar5 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i3 & 8) == 0) {
                            j2 = j;
                            if (startRestartGroup.changed(j2)) {
                                i14 = Fields.Clip;
                                i4 |= i14;
                            }
                        } else {
                            j2 = j;
                        }
                        i14 = 8192;
                        i4 |= i14;
                    } else {
                        j2 = j;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 196608;
                        f4 = f;
                    } else {
                        f4 = f;
                        if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(f4) ? Fields.RenderEffect : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) != 0) {
                        richTooltipColors2 = richTooltipColors;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(richTooltipColors2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    } else {
                        richTooltipColors2 = richTooltipColors;
                    }
                    i8 = i3 & Fields.SpotShadowColor;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i10 = i3 & Fields.RotationX;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= startRestartGroup.changed(f3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i3 & Fields.RotationY) == 0) {
                                i12 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i12 = i2 | (startRestartGroup.changedInstance(myVar3) ? 4 : 2);
                            } else {
                                i12 = i2;
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                shape2 = shape;
                                f5 = f2;
                                modifier3 = modifier2;
                                myVar6 = myVar4;
                                composer2 = startRestartGroup;
                                f6 = f3;
                                f7 = f4;
                                richTooltipColors3 = richTooltipColors2;
                                myVar7 = myVar5;
                                j3 = j2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
                                    if (i5 != 0) {
                                        myVar4 = null;
                                    }
                                    my myVar10 = i6 == 0 ? myVar5 : null;
                                    if ((i3 & 8) != 0) {
                                        j4 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
                                        i4 &= -57345;
                                    } else {
                                        j4 = j2;
                                    }
                                    if (i7 != 0) {
                                        f4 = TooltipDefaults.INSTANCE.m2783getRichTooltipMaxWidthD9Ej5fM();
                                    }
                                    if ((i3 & 32) != 0) {
                                        shape3 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                        i4 &= -3670017;
                                    } else {
                                        shape3 = shape;
                                    }
                                    if ((i3 & 64) != 0) {
                                        richTooltipColors2 = TooltipDefaults.INSTANCE.richTooltipColors(startRestartGroup, 6);
                                        i4 = (-29360129) & i4;
                                    }
                                    float m3254getLevel0D9Ej5fM = i9 != 0 ? ElevationTokens.INSTANCE.m3254getLevel0D9Ej5fM() : f2;
                                    if (i11 != 0) {
                                        long j6 = j4;
                                        f10 = m3254getLevel0D9Ej5fM;
                                        richTooltipColors4 = richTooltipColors2;
                                        myVar9 = myVar4;
                                        f9 = RichTooltipTokens.INSTANCE.m3597getContainerElevationD9Ej5fM();
                                        i13 = i4;
                                        myVar8 = myVar10;
                                        f8 = f4;
                                        j5 = j6;
                                    } else {
                                        i13 = i4;
                                        myVar8 = myVar10;
                                        f8 = f4;
                                        my myVar11 = myVar4;
                                        f9 = f3;
                                        long j7 = j4;
                                        f10 = m3254getLevel0D9Ej5fM;
                                        richTooltipColors4 = richTooltipColors2;
                                        j5 = j7;
                                        myVar9 = myVar11;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -29360129;
                                    }
                                    my myVar12 = myVar5;
                                    i13 = i4;
                                    myVar8 = myVar12;
                                    shape3 = shape;
                                    f10 = f2;
                                    f8 = f4;
                                    modifier4 = modifier2;
                                    myVar9 = myVar4;
                                    f9 = f3;
                                    richTooltipColors4 = richTooltipColors2;
                                    j5 = j2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2125725529, i13, i12, "androidx.compose.material3.RichTooltip (Tooltip.kt:497)");
                                }
                                long j8 = j5;
                                float f11 = f8;
                                Shape shape4 = shape3;
                                m2791RichTooltipEkvW5A0(tooltipScope, modifier4, myVar9, myVar8, TooltipDefaults.INSTANCE.m2780caretShapeEaSLcWc(j5), f11, shape4, richTooltipColors4, f10, f9, myVar3, startRestartGroup, i13 & 2147426302, i12 & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                myVar7 = myVar8;
                                f5 = f10;
                                composer2 = startRestartGroup;
                                myVar6 = myVar9;
                                shape2 = shape4;
                                f6 = f9;
                                modifier3 = modifier4;
                                richTooltipColors3 = richTooltipColors4;
                                f7 = f11;
                                j3 = j8;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new yv0(tooltipScope, modifier3, myVar6, myVar7, j3, f7, shape2, richTooltipColors3, f5, f6, myVar3, i, i2, i3, 0));
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        if ((i3 & Fields.RotationY) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i3 & Fields.RotationX;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i3 & Fields.RotationY) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar5 = myVar2;
                if ((i & 24576) != 0) {
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i8 = i3 & Fields.SpotShadowColor;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & Fields.RotationX;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & Fields.RotationY) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar4 = myVar;
            i6 = i3 & 4;
            if (i6 != 0) {
            }
            myVar5 = myVar2;
            if ((i & 24576) != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationX;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & Fields.RotationY) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 2;
        if (i5 == 0) {
        }
        myVar4 = myVar;
        i6 = i3 & 4;
        if (i6 != 0) {
        }
        myVar5 = myVar2;
        if ((i & 24576) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationX;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & Fields.RotationY) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RichTooltip_EkvW5A0$lambda$17(TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, Shape shape, float f, Shape shape2, RichTooltipColors richTooltipColors, float f2, float f3, my myVar3, int i, int i2, int i3, Composer composer, int i4) {
        m2791RichTooltipEkvW5A0(tooltipScope, modifier, myVar, myVar2, shape, f, shape2, richTooltipColors, f2, f3, myVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RichTooltip_ZuUcA3Q$lambda$12(TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, my myVar3, int i, int i2, int i3, Composer composer, int i4) {
        m2792RichTooltipZuUcA3Q(tooltipScope, modifier, myVar, myVar2, j, f, shape, richTooltipColors, f2, f3, myVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TooltipBox(PopupPositionProvider popupPositionProvider, final ny nyVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, boolean z3, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        iy iyVar2;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        Modifier modifier3;
        iy iyVar3;
        boolean z6;
        boolean z7;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-293753984);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                iyVar2 = iyVar;
                i3 |= startRestartGroup.changedInstance(iyVar2) ? Fields.Clip : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    z4 = z;
                    i3 |= startRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : Fields.BlendMode;
                    }
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(z3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if ((i2 & Fields.RotationX) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
                            if (i9 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                iyVar2 = null;
                            }
                            boolean z8 = i5 != 0 ? false : z4;
                            Modifier modifier5 = modifier2;
                            boolean z9 = i6 != 0 ? true : z2;
                            boolean z10 = i8 != 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-293753984, i3, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                            }
                            final Transition updateTransition = TransitionKt.updateTransition((MutableTransitionState) tooltipState.getTransition(), "tooltip transition", startRestartGroup, MutableTransitionState.$stable | 48, 0);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                                modifier4 = modifier5;
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                modifier4 = modifier5;
                            }
                            MutableState mutableState = (MutableState) rememberedValue;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = new TooltipScopeImpl(new j3(mutableState, 18), popupPositionProvider);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) rememberedValue2;
                            int i10 = (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3);
                            iy iyVar4 = iyVar2;
                            Modifier modifier6 = modifier4;
                            BasicTooltipKt.BasicTooltipBox(popupPositionProvider, ComposableLambdaKt.rememberComposableLambda(-527401546, true, new my() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$3
                                public final void invoke(Composer composer2, int i11) {
                                    if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-527401546, i11, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:321)");
                                    }
                                    Modifier animateTooltip = TooltipKt.animateTooltip(Modifier.Companion, updateTransition);
                                    ny nyVar2 = nyVar;
                                    TooltipScopeImpl tooltipScopeImpl2 = tooltipScopeImpl;
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, animateTooltip);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    iy constructor = companion2.getConstructor();
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
                                    my b = k4.b(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    nyVar2.invoke(tooltipScopeImpl2, composer2, 6);
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
                            }, startRestartGroup, 54), tooltipState, modifier6, iyVar4, z8, z9, z10, ComposableLambdaKt.rememberComposableLambda(-23901870, true, new TooltipKt$TooltipBox$wrappedContent$1(mutableState, myVar), startRestartGroup, 54), startRestartGroup, i10, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z7 = z10;
                            z5 = z9;
                            z6 = z8;
                            iyVar3 = iyVar4;
                            modifier3 = modifier6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z5 = z2;
                            modifier3 = modifier2;
                            iyVar3 = iyVar2;
                            z6 = z4;
                            z7 = z3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new yd(popupPositionProvider, nyVar, tooltipState, modifier3, iyVar3, z6, z5, z7, myVar, i, i2));
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i2 & Fields.RotationX) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & Fields.RotationX) != 0) {
                }
                if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            iyVar2 = iyVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & Fields.RotationX) != 0) {
            }
            if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        iyVar2 = iyVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & Fields.RotationX) != 0) {
        }
        if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipBox$lambda$0(PopupPositionProvider popupPositionProvider, ny nyVar, TooltipState tooltipState, Modifier modifier, boolean z, boolean z2, my myVar, int i, int i2, Composer composer, int i3) {
        TooltipBox(popupPositionProvider, nyVar, tooltipState, modifier, z, z2, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipBox$lambda$1(PopupPositionProvider popupPositionProvider, ny nyVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, my myVar, int i, int i2, Composer composer, int i3) {
        TooltipBox(popupPositionProvider, nyVar, tooltipState, modifier, iyVar, z, z2, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates TooltipBox$lambda$4$lambda$3(MutableState mutableState) {
        return (LayoutCoordinates) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipBox$lambda$5(PopupPositionProvider popupPositionProvider, ny nyVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, boolean z3, my myVar, int i, int i2, Composer composer, int i3) {
        TooltipBox(popupPositionProvider, nyVar, tooltipState, modifier, iyVar, z, z2, z3, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final TooltipState TooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        return new TooltipStateImpl(z, z2, mutatorMutex);
    }

    public static /* synthetic */ TooltipState TooltipState$default(boolean z, boolean z2, MutatorMutex mutatorMutex, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return TooltipState(z, z2, mutatorMutex);
    }

    public static final Modifier animateTooltip(Modifier modifier, final Transition<Boolean> transition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(transition) : InspectableValueKt.getNoInspectorInfo(), new ny() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2
            private static final float invoke$lambda$1(State<Float> state) {
                return state.getValue().floatValue();
            }

            private static final float invoke$lambda$3(State<Float> state) {
                return state.getValue().floatValue();
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                Modifier m4923graphicsLayerAp8cVGQ;
                composer.startReplaceGroup(-1498516085);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1498516085, i, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:1268)");
                }
                final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
                final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
                Transition<Boolean> transition2 = transition;
                ny nyVar = new ny() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$scale$2
                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i2) {
                        composer2.startReplaceGroup(386845748);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(386845748, i2, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1272)");
                        }
                        FiniteAnimationSpec<Float> finiteAnimationSpec = value;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return finiteAnimationSpec;
                    }

                    @Override // defpackage.ny
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    }
                };
                zv zvVar = zv.a;
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zvVar);
                boolean booleanValue = transition2.getCurrentState().booleanValue();
                composer.startReplaceGroup(-1553362193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
                }
                float f = booleanValue ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = transition2.getTargetState().booleanValue();
                composer.startReplaceGroup(-1553362193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
                }
                float f2 = booleanValue2 ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                State createTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) nyVar.invoke(transition2.getSegment(), composer, 0), vectorConverter, "tooltip transition: scaling", composer, 196608);
                Transition<Boolean> transition3 = transition;
                ny nyVar2 = new ny() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$alpha$2
                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i2) {
                        composer2.startReplaceGroup(-281714272);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-281714272, i2, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1280)");
                        }
                        FiniteAnimationSpec<Float> finiteAnimationSpec = value2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return finiteAnimationSpec;
                    }

                    @Override // defpackage.ny
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    }
                };
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(zvVar);
                boolean booleanValue3 = transition3.getCurrentState().booleanValue();
                composer.startReplaceGroup(2073045083);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
                }
                float f3 = booleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf2 = Float.valueOf(f3);
                boolean booleanValue4 = transition3.getTargetState().booleanValue();
                composer.startReplaceGroup(2073045083);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
                }
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                m4923graphicsLayerAp8cVGQ = GraphicsLayerModifierKt.m4923graphicsLayerAp8cVGQ(modifier2, (r41 & 1) != 0 ? 1.0f : invoke$lambda$1(createTransitionAnimation), (r41 & 2) != 0 ? 1.0f : invoke$lambda$1(createTransitionAnimation), (r41 & 4) == 0 ? invoke$lambda$3(TransitionKt.createTransitionAnimation(transition3, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) nyVar2.invoke(transition3.getSegment(), composer, 0), vectorConverter2, "tooltip transition: alpha", composer, 196608)) : 1.0f, (r41 & 8) != 0 ? 0.0f : 0.0f, (r41 & 16) != 0 ? 0.0f : 0.0f, (r41 & 32) != 0 ? 0.0f : 0.0f, (r41 & 64) != 0 ? 0.0f : 0.0f, (r41 & Fields.SpotShadowColor) != 0 ? 0.0f : 0.0f, (r41 & Fields.RotationX) == 0 ? 0.0f : 0.0f, (r41 & Fields.RotationY) != 0 ? 8.0f : 0.0f, (r41 & Fields.RotationZ) != 0 ? TransformOrigin.Companion.m5174getCenterSzJe1aQ() : 0L, (r41 & Fields.CameraDistance) != 0 ? RectangleShapeKt.getRectangleShape() : null, (r41 & Fields.TransformOrigin) != 0 ? false : false, (r41 & 8192) != 0 ? null : null, (r41 & Fields.Clip) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (32768 & r41) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r41 & 65536) != 0 ? CompositingStrategy.Companion.m4850getAutoNrFUSI() : 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return m4923graphicsLayerAp8cVGQ;
            }

            @Override // defpackage.ny
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    public static final float caretX(float f, int i, Rect rect) {
        float min;
        float left = rect.getLeft();
        float right = rect.getRight();
        float f2 = (left + right) / 2.0f;
        float f3 = i;
        if (f >= f3) {
            return f2;
        }
        float f4 = f / 2.0f;
        if (f2 - f4 < 0.0f) {
            min = Math.max(f - f3, -left);
        } else {
            if (f2 + f4 <= f3) {
                return f4;
            }
            min = Math.min(f - right, 0.0f);
        }
        return min + f2;
    }

    public static final float getActionLabelBottomPadding() {
        return ActionLabelBottomPadding;
    }

    public static final float getActionLabelMinHeight() {
        return ActionLabelMinHeight;
    }

    public static final float getHeightToSubheadFirstLine() {
        return HeightToSubheadFirstLine;
    }

    public static final PaddingValues getPlainTooltipContentPadding() {
        return PlainTooltipContentPadding;
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getSpacingBetweenTooltipAndAnchor() {
        return SpacingBetweenTooltipAndAnchor;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    /* renamed from: layoutCaret-J5j9r9c, reason: not valid java name */
    private static final Modifier m2793layoutCaretJ5j9r9c(Modifier modifier, MutableState<Matrix> mutableState, Density density, long j, ky kyVar, PopupPositionProvider popupPositionProvider) {
        return LayoutModifierKt.layout(modifier, new l9(j, kyVar, density, popupPositionProvider, mutableState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00c5, code lost:
    
        if (((r14 - r10) - r13) < 0.0f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        r10 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0150, code lost:
    
        r7 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult layoutCaret_J5j9r9c$lambda$22(long j, ky kyVar, Density density, PopupPositionProvider popupPositionProvider, MutableState mutableState, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Rect boundsInWindow;
        char c;
        float f;
        long m4508constructorimpl;
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        int width = mo6234measureBRTryo0.getWidth();
        int height = mo6234measureBRTryo0.getHeight();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float f2 = width;
        float f3 = height;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) kyVar.invoke(measureScope);
        if (layoutCoordinates != null) {
            int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(SpacingBetweenTooltipAndAnchor);
            boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates, true);
            float top = boundsInWindow.getTop();
            float bottom = boundsInWindow.getBottom();
            float right = boundsInWindow.getRight();
            float left = boundsInWindow.getLeft();
            boolean z = popupPositionProvider instanceof TooltipPositionProviderImpl;
            if (z) {
                f = 0.0f;
                int m2797getTypelOKsHw4 = ((TooltipPositionProviderImpl) popupPositionProvider).m2797getTypelOKsHw4();
                TooltipAnchorPosition.Companion companion = TooltipAnchorPosition.Companion;
                c = ' ';
                if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw4, companion.m2776getLeftlOKsHw4()) || TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw4, companion.m2777getRightlOKsHw4()) || TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw4, companion.m2778getStartlOKsHw4()) || TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw4, companion.m2775getEndlOKsHw4())) {
                    f3 /= 2.0f;
                } else if (!TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw4, companion.m2773getAbovelOKsHw4())) {
                }
                if (z) {
                    int m2797getTypelOKsHw42 = ((TooltipPositionProviderImpl) popupPositionProvider).m2797getTypelOKsHw4();
                    TooltipAnchorPosition.Companion companion2 = TooltipAnchorPosition.Companion;
                    if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw42, companion2.m2776getLeftlOKsHw4())) {
                        m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits((left - ((float) mo361roundToPx0680j_4)) - f2 < f ? f : f2) << c) | (Float.floatToRawIntBits(f3) & 4294967295L));
                    } else if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw42, companion2.m2777getRightlOKsHw4())) {
                        m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits((right + ((float) mo361roundToPx0680j_4)) + f2 > ((float) i) ? f2 : f) << c) | (Float.floatToRawIntBits(f3) & 4294967295L));
                    } else if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw42, companion2.m2778getStartlOKsHw4())) {
                        float f4 = measureScope.getLayoutDirection() == LayoutDirection.Ltr ? f : f;
                        m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(f4) << c) | (Float.floatToRawIntBits(f3) & 4294967295L));
                    } else if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw42, companion2.m2775getEndlOKsHw4())) {
                        m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits((measureScope.getLayoutDirection() != LayoutDirection.Ltr ? (left - ((float) mo361roundToPx0680j_4)) - f2 >= f : (right + ((float) mo361roundToPx0680j_4)) + f2 > ((float) i)) ? f2 : f) << c) | (Float.floatToRawIntBits(f3) & 4294967295L));
                    } else {
                        m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(caretX(f2, i, boundsInWindow)) << c) | (Float.floatToRawIntBits(f3) & 4294967295L));
                    }
                } else {
                    m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(caretX(f2, i, boundsInWindow)) << c) | (Float.floatToRawIntBits(f3) & 4294967295L));
                }
                float[] m5005constructorimpl$default = Matrix.m5005constructorimpl$default(null, 1, null);
                Matrix.m5027translateimpl$default(m5005constructorimpl$default, Float.intBitsToFloat((int) (m4508constructorimpl >> c)), Float.intBitsToFloat((int) (m4508constructorimpl & 4294967295L)), 0.0f, 4, null);
                if (z) {
                    int m2797getTypelOKsHw43 = ((TooltipPositionProviderImpl) popupPositionProvider).m2797getTypelOKsHw4();
                    TooltipAnchorPosition.Companion companion3 = TooltipAnchorPosition.Companion;
                    if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw43, companion3.m2776getLeftlOKsHw4())) {
                        if ((left - mo361roundToPx0680j_4) - f2 < f) {
                            Matrix.m5019rotateZimpl(m5005constructorimpl$default, 90.0f);
                        } else {
                            Matrix.m5019rotateZimpl(m5005constructorimpl$default, -90.0f);
                        }
                    } else if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw43, companion3.m2777getRightlOKsHw4())) {
                        if (right + mo361roundToPx0680j_4 + f2 > i) {
                            Matrix.m5019rotateZimpl(m5005constructorimpl$default, -90.0f);
                        } else {
                            Matrix.m5019rotateZimpl(m5005constructorimpl$default, 90.0f);
                        }
                    } else if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw43, companion3.m2778getStartlOKsHw4())) {
                        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                            if ((left - mo361roundToPx0680j_4) - f2 < f) {
                                Matrix.m5019rotateZimpl(m5005constructorimpl$default, 90.0f);
                            } else {
                                Matrix.m5019rotateZimpl(m5005constructorimpl$default, -90.0f);
                            }
                        } else if (right + mo361roundToPx0680j_4 + f2 > i) {
                            Matrix.m5019rotateZimpl(m5005constructorimpl$default, -90.0f);
                        } else {
                            Matrix.m5019rotateZimpl(m5005constructorimpl$default, 90.0f);
                        }
                    } else if (TooltipAnchorPosition.m2769equalsimpl0(m2797getTypelOKsHw43, companion3.m2775getEndlOKsHw4())) {
                        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                            if (right + mo361roundToPx0680j_4 + f2 > i) {
                                Matrix.m5019rotateZimpl(m5005constructorimpl$default, -90.0f);
                            } else {
                                Matrix.m5019rotateZimpl(m5005constructorimpl$default, 90.0f);
                            }
                        } else if ((left - mo361roundToPx0680j_4) - f2 < f) {
                            Matrix.m5019rotateZimpl(m5005constructorimpl$default, 90.0f);
                        } else {
                            Matrix.m5019rotateZimpl(m5005constructorimpl$default, -90.0f);
                        }
                    } else if (f3 == f) {
                        Matrix.m5017rotateXimpl(m5005constructorimpl$default, 180.0f);
                    }
                } else if (f3 == f) {
                    Matrix.m5017rotateXimpl(m5005constructorimpl$default, 180.0f);
                }
                mutableState.setValue(Matrix.m5003boximpl(m5005constructorimpl$default));
            } else {
                c = ' ';
                f = 0.0f;
            }
        }
        return MeasureScope.layout$default(measureScope, width, height, null, new h7(13, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 layoutCaret_J5j9r9c$lambda$22$lambda$21(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    public static final TooltipState rememberTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1413230530, i, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:962)");
        }
        boolean z3 = ((((i & 112) ^ 48) > 32 && composer.changed(z2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TooltipStateImpl(z, z2, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipStateImpl;
    }

    public static final Modifier textVerticalPadding(Modifier modifier, boolean z, boolean z2) {
        return (z || z2) ? PaddingKt.m766paddingqDBjuR0$default(AlignmentLineKt.m622paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null) : PaddingKt.m764paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004f  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TooltipBox(PopupPositionProvider popupPositionProvider, ny nyVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, my myVar, Composer composer, int i, int i2) {
        PopupPositionProvider popupPositionProvider2;
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        my myVar2;
        iy iyVar2;
        Modifier modifier3;
        boolean z5;
        boolean z6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2055306788);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            popupPositionProvider2 = popupPositionProvider;
        } else if ((i & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i3 = (startRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        z4 = z2;
                        i3 |= startRestartGroup.changed(z4) ? 1048576 : Fields.BlendMode;
                        if ((i2 & Fields.SpotShadowColor) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            myVar2 = myVar;
                            i3 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            if (!startRestartGroup.shouldExecute((4785299 & i3) == 4785298, i3 & 1)) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                iy iyVar3 = (i2 & 16) != 0 ? null : iyVar;
                                boolean z7 = i5 != 0 ? true : z3;
                                Modifier modifier4 = modifier2;
                                boolean z8 = i6 != 0 ? true : z4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2055306788, i3, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:208)");
                                }
                                TooltipBox(popupPositionProvider2, nyVar, tooltipState, modifier4, null, z7, z8, false, myVar2, startRestartGroup, (i3 & 14) | 12607488 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z6 = z8;
                                z5 = z7;
                                iyVar2 = iyVar3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                iyVar2 = iyVar;
                                modifier3 = modifier2;
                                z5 = z3;
                                z6 = z4;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new uh(popupPositionProvider, nyVar, tooltipState, modifier3, iyVar2, z5, z6, myVar, i, i2));
                                return;
                            }
                            return;
                        }
                        myVar2 = myVar;
                        if (!startRestartGroup.shouldExecute((4785299 & i3) == 4785298, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z4 = z2;
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                    }
                    myVar2 = myVar;
                    if (!startRestartGroup.shouldExecute((4785299 & i3) == 4785298, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z4 = z2;
                if ((i2 & Fields.SpotShadowColor) != 0) {
                }
                myVar2 = myVar;
                if (!startRestartGroup.shouldExecute((4785299 & i3) == 4785298, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z4 = z2;
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            myVar2 = myVar;
            if (!startRestartGroup.shouldExecute((4785299 & i3) == 4785298, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z4 = z2;
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        myVar2 = myVar;
        if (!startRestartGroup.shouldExecute((4785299 & i3) == 4785298, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004d  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TooltipBox(PopupPositionProvider popupPositionProvider, ny nyVar, TooltipState tooltipState, Modifier modifier, boolean z, boolean z2, my myVar, Composer composer, int i, int i2) {
        PopupPositionProvider popupPositionProvider2;
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        my myVar2;
        Modifier modifier3;
        boolean z5;
        boolean z6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-375963176);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            popupPositionProvider2 = popupPositionProvider;
        } else if ((i & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i3 = (startRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? Fields.RotationX : Fields.SpotShadowColor;
            }
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
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        z4 = z2;
                        i3 |= startRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            myVar2 = myVar;
                            i3 |= startRestartGroup.changedInstance(myVar2) ? 1048576 : Fields.BlendMode;
                            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                z5 = i5 != 0 ? true : z3;
                                Modifier modifier4 = modifier2;
                                z6 = i6 != 0 ? true : z4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-375963176, i3, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:118)");
                                }
                                int i7 = i3 << 3;
                                TooltipBox(popupPositionProvider2, nyVar, tooltipState, modifier4, null, z5, z6, false, myVar2, startRestartGroup, (i3 & 14) | 12607488 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i7) | (i7 & 3670016) | ((i3 << 6) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z5 = z3;
                                z6 = z4;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new d00(popupPositionProvider, nyVar, tooltipState, modifier3, z5, z6, myVar, i, i2));
                                return;
                            }
                            return;
                        }
                        myVar2 = myVar;
                        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z4 = z2;
                    if ((i2 & 64) != 0) {
                    }
                    myVar2 = myVar;
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z4 = z2;
                if ((i2 & 64) != 0) {
                }
                myVar2 = myVar;
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z4 = z2;
            if ((i2 & 64) != 0) {
            }
            myVar2 = myVar;
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z4 = z2;
        if ((i2 & 64) != 0) {
        }
        myVar2 = myVar;
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
