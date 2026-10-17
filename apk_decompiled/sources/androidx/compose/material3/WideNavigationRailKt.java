package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationRailBaselineItemTokens;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.material3.tokens.NavigationRailExpandedTokens;
import androidx.compose.material3.tokens.NavigationRailHorizontalItemTokens;
import androidx.compose.material3.tokens.NavigationRailVerticalItemTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.a00;
import defpackage.i6;
import defpackage.iy;
import defpackage.j3;
import defpackage.jc0;
import defpackage.ky;
import defpackage.m70;
import defpackage.m90;
import defpackage.my;
import defpackage.ny;
import defpackage.sn0;
import defpackage.te0;
import defpackage.w01;
import defpackage.wd;
import defpackage.xe0;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailKt {
    private static final float CollapsedRailWidth;
    private static final float ExpandedRailMaxWidth;
    private static final float ExpandedRailMinWidth;
    private static final String HeaderLayoutIdTag = "header";
    private static final float ItemHorizontalPadding;
    private static final float ItemStartIconIndicatorVerticalPadding;
    private static final float ItemTopIconIndicatorHorizontalPadding;
    private static final float ItemTopIconIndicatorVerticalPadding;
    private static final ProvidableCompositionLocal<ModalWideNavigationRailOverride> LocalModalWideNavigationRailOverride;
    private static final ProvidableCompositionLocal<WideNavigationRailOverride> LocalWideNavigationRailOverride;
    private static final float PredictiveBackMaxScaleXDistance;
    private static final float PredictiveBackMaxScaleYDistance;
    private static final float PredictiveBackPivotFractionY = 0.5f;
    private static final float TopIconItemMinHeight;
    private static final float WNRHeaderPadding;
    private static final float WNRItemNoLabelIndicatorPadding;
    private static final float WNRVerticalPadding;

    static {
        NavigationRailVerticalItemTokens navigationRailVerticalItemTokens = NavigationRailVerticalItemTokens.INSTANCE;
        float m3470getActiveIndicatorWidthD9Ej5fM = navigationRailVerticalItemTokens.m3470getActiveIndicatorWidthD9Ej5fM();
        NavigationRailBaselineItemTokens navigationRailBaselineItemTokens = NavigationRailBaselineItemTokens.INSTANCE;
        WNRItemNoLabelIndicatorPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(m3470getActiveIndicatorWidthD9Ej5fM - navigationRailBaselineItemTokens.m3453getIconSizeD9Ej5fM()) / 2.0f);
        ItemHorizontalPadding = Dp.m7611constructorimpl(20.0f);
        NavigationRailCollapsedTokens navigationRailCollapsedTokens = NavigationRailCollapsedTokens.INSTANCE;
        WNRVerticalPadding = navigationRailCollapsedTokens.m3458getTopSpaceD9Ej5fM();
        WNRHeaderPadding = navigationRailBaselineItemTokens.m3452getHeaderSpaceMinimumD9Ej5fM();
        CollapsedRailWidth = navigationRailCollapsedTokens.m3455getContainerWidthD9Ej5fM();
        NavigationRailExpandedTokens navigationRailExpandedTokens = NavigationRailExpandedTokens.INSTANCE;
        ExpandedRailMinWidth = navigationRailExpandedTokens.m3461getContainerWidthMinimumD9Ej5fM();
        ExpandedRailMaxWidth = navigationRailExpandedTokens.m3460getContainerWidthMaximumD9Ej5fM();
        TopIconItemMinHeight = navigationRailBaselineItemTokens.m3450getContainerHeightD9Ej5fM();
        ItemTopIconIndicatorVerticalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationRailVerticalItemTokens.m3469getActiveIndicatorHeightD9Ej5fM() - navigationRailBaselineItemTokens.m3453getIconSizeD9Ej5fM()) / 2.0f);
        ItemTopIconIndicatorHorizontalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationRailVerticalItemTokens.m3470getActiveIndicatorWidthD9Ej5fM() - navigationRailBaselineItemTokens.m3453getIconSizeD9Ej5fM()) / 2.0f);
        ItemStartIconIndicatorVerticalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(NavigationRailHorizontalItemTokens.INSTANCE.m3464getActiveIndicatorHeightD9Ej5fM() - navigationRailBaselineItemTokens.m3453getIconSizeD9Ej5fM()) / 2.0f);
        PredictiveBackMaxScaleXDistance = Dp.m7611constructorimpl(24.0f);
        PredictiveBackMaxScaleYDistance = Dp.m7611constructorimpl(48.0f);
        LocalWideNavigationRailOverride = CompositionLocalKt.compositionLocalOf$default(null, new sn0(20), 1, null);
        LocalModalWideNavigationRailOverride = CompositionLocalKt.compositionLocalOf$default(null, new sn0(21), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* renamed from: ModalWideNavigationRail-k3FuEkE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2846ModalWideNavigationRailk3FuEkE(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, my myVar, float f, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, final my myVar2, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape3;
        Shape shape4;
        int i5;
        my myVar3;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        final WindowInsets windowInsets2;
        Composer composer2;
        final my myVar4;
        final Modifier modifier3;
        final float f3;
        final boolean z3;
        final Shape shape5;
        final Shape shape6;
        final WideNavigationRailState wideNavigationRailState2;
        final WideNavigationRailColors wideNavigationRailColors2;
        final Arrangement.Vertical vertical2;
        final ModalWideNavigationRailProperties modalWideNavigationRailProperties2;
        ScopeUpdateScope endRestartGroup;
        WideNavigationRailState wideNavigationRailState3;
        Shape shape7;
        Shape shape8;
        WideNavigationRailColors wideNavigationRailColors3;
        WindowInsets windowInsets3;
        Arrangement.Vertical vertical3;
        ModalWideNavigationRailProperties modalWideNavigationRailProperties3;
        Modifier modifier4;
        my myVar5;
        WideNavigationRailState wideNavigationRailState4;
        float f4;
        Shape shape9;
        WindowInsets windowInsets4;
        Arrangement.Vertical vertical4;
        boolean z4;
        Shape shape10;
        WideNavigationRailColors wideNavigationRailColors4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-38559147);
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(wideNavigationRailState) : startRestartGroup.changedInstance(wideNavigationRailState)) {
                    i15 = 32;
                    i4 |= i15;
                }
            }
            i15 = 16;
            i4 |= i15;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i4 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    shape3 = shape;
                    if (startRestartGroup.changed(shape3)) {
                        i14 = Fields.CameraDistance;
                        i4 |= i14;
                    }
                } else {
                    shape3 = shape;
                }
                i14 = Fields.RotationZ;
                i4 |= i14;
            } else {
                shape3 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    shape4 = shape2;
                    if (startRestartGroup.changed(shape4)) {
                        i13 = Fields.Clip;
                        i4 |= i13;
                    }
                } else {
                    shape4 = shape2;
                }
                i13 = 8192;
                i4 |= i13;
            } else {
                shape4 = shape2;
            }
            if ((i & 196608) == 0) {
                i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(wideNavigationRailColors)) ? Fields.RenderEffect : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                myVar3 = myVar;
            } else {
                myVar3 = myVar;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar3) ? 1048576 : Fields.BlendMode;
                }
            }
            i6 = i3 & Fields.SpotShadowColor;
            if (i6 == 0) {
                i4 |= 12582912;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
            }
            if ((i & 100663296) == 0) {
                if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(windowInsets)) {
                    i12 = GroupFlagsKt.IsRecompositionRequiredFlag;
                    i4 |= i12;
                }
                i12 = GroupFlagsKt.HasAuxSlotFlag;
                i4 |= i12;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(vertical)) {
                    i11 = GroupFlagsKt.HasMovableContentFlag;
                    i4 |= i11;
                }
                i11 = GroupFlagsKt.IsMovableContentFlag;
                i4 |= i11;
            }
            i7 = i3 & Fields.RotationZ;
            if (i7 == 0) {
                i9 = i2 | 6;
                i8 = i7;
            } else if ((i2 & 6) == 0) {
                i8 = i7;
                i9 = i2 | (startRestartGroup.changed(modalWideNavigationRailProperties) ? 4 : 2);
            } else {
                i8 = i7;
                i9 = i2;
            }
            if ((i3 & Fields.CameraDistance) == 0) {
                i9 |= 48;
            } else if ((i2 & 48) == 0) {
                i9 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
            }
            i10 = i9;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                windowInsets2 = windowInsets;
                composer2 = startRestartGroup;
                myVar4 = myVar3;
                modifier3 = modifier2;
                f3 = f2;
                z3 = z2;
                shape5 = shape3;
                shape6 = shape4;
                wideNavigationRailState2 = wideNavigationRailState;
                wideNavigationRailColors2 = wideNavigationRailColors;
                vertical2 = vertical;
                modalWideNavigationRailProperties2 = modalWideNavigationRailProperties;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i16 != 0 ? Modifier.Companion : modifier2;
                    if ((i3 & 2) != 0) {
                        wideNavigationRailState3 = WideNavigationRailStateKt.rememberWideNavigationRailState(null, startRestartGroup, 0, 1);
                        i4 &= -113;
                    } else {
                        wideNavigationRailState3 = wideNavigationRailState;
                    }
                    if (i17 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 8) != 0) {
                        shape7 = WideNavigationRailDefaults.INSTANCE.getModalCollapsedShape(startRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        shape7 = shape3;
                    }
                    if ((i3 & 16) != 0) {
                        shape8 = WideNavigationRailDefaults.INSTANCE.getModalExpandedShape(startRestartGroup, 6);
                        i4 &= -57345;
                    } else {
                        shape8 = shape4;
                    }
                    if ((i3 & 32) != 0) {
                        wideNavigationRailColors3 = WideNavigationRailDefaults.INSTANCE.colors(startRestartGroup, 6);
                        i4 &= -458753;
                    } else {
                        wideNavigationRailColors3 = wideNavigationRailColors;
                    }
                    my myVar6 = i5 == 0 ? myVar3 : null;
                    float m7611constructorimpl = i6 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                    if ((i3 & Fields.RotationX) != 0) {
                        windowInsets3 = WideNavigationRailDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        i4 &= -234881025;
                    } else {
                        windowInsets3 = windowInsets;
                    }
                    if ((i3 & Fields.RotationY) != 0) {
                        vertical3 = WideNavigationRailDefaults.INSTANCE.getArrangement();
                        i4 &= -1879048193;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier5;
                        myVar5 = myVar6;
                        wideNavigationRailState4 = wideNavigationRailState3;
                        f4 = m7611constructorimpl;
                        shape9 = shape7;
                        windowInsets4 = windowInsets3;
                        vertical4 = vertical3;
                        modalWideNavigationRailProperties3 = WideNavigationRailDefaults.INSTANCE.getModalExpandedProperties();
                    } else {
                        modalWideNavigationRailProperties3 = modalWideNavigationRailProperties;
                        modifier4 = modifier5;
                        myVar5 = myVar6;
                        wideNavigationRailState4 = wideNavigationRailState3;
                        f4 = m7611constructorimpl;
                        shape9 = shape7;
                        windowInsets4 = windowInsets3;
                        vertical4 = vertical3;
                    }
                    z4 = z2;
                    shape10 = shape8;
                    wideNavigationRailColors4 = wideNavigationRailColors3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i3 & Fields.RotationX) != 0) {
                        i4 &= -234881025;
                    }
                    if ((i3 & Fields.RotationY) != 0) {
                        i4 &= -1879048193;
                    }
                    wideNavigationRailState4 = wideNavigationRailState;
                    wideNavigationRailColors4 = wideNavigationRailColors;
                    windowInsets4 = windowInsets;
                    vertical4 = vertical;
                    modalWideNavigationRailProperties3 = modalWideNavigationRailProperties;
                    myVar5 = myVar3;
                    modifier4 = modifier2;
                    f4 = f2;
                    z4 = z2;
                    shape9 = shape3;
                    shape10 = shape4;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-38559147, i4, i10, "androidx.compose.material3.ModalWideNavigationRail (WideNavigationRail.kt:477)");
                }
                ((ModalWideNavigationRailOverride) startRestartGroup.consume(LocalModalWideNavigationRailOverride)).ModalWideNavigationRail(new ModalWideNavigationRailOverrideScope(modifier4, wideNavigationRailState4, z4, shape9, shape10, wideNavigationRailColors4, myVar5, f4, windowInsets4, vertical4, modalWideNavigationRailProperties3, myVar2, null), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2 = startRestartGroup;
                modifier3 = modifier4;
                wideNavigationRailState2 = wideNavigationRailState4;
                z3 = z4;
                shape5 = shape9;
                shape6 = shape10;
                wideNavigationRailColors2 = wideNavigationRailColors4;
                myVar4 = myVar5;
                f3 = f4;
                windowInsets2 = windowInsets4;
                vertical2 = vertical4;
                modalWideNavigationRailProperties2 = modalWideNavigationRailProperties3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: k21
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 ModalWideNavigationRail_k3FuEkE$lambda$14;
                        int intValue = ((Integer) obj2).intValue();
                        ModalWideNavigationRail_k3FuEkE$lambda$14 = WideNavigationRailKt.ModalWideNavigationRail_k3FuEkE$lambda$14(Modifier.this, wideNavigationRailState2, z3, shape5, shape6, wideNavigationRailColors2, myVar4, f3, windowInsets2, vertical2, modalWideNavigationRailProperties2, myVar2, i, i2, i3, (Composer) obj, intValue);
                        return ModalWideNavigationRail_k3FuEkE$lambda$14;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i & 196608) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i7 = i3 & Fields.RotationZ;
        if (i7 == 0) {
        }
        if ((i3 & Fields.CameraDistance) == 0) {
        }
        i10 = i9;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ModalWideNavigationRailContent-pU6N4AM, reason: not valid java name */
    public static final void m2847ModalWideNavigationRailContentpU6N4AM(final boolean z, final boolean z2, final Animatable<Float, AnimationVector1D> animatable, final RailPredictiveBackState railPredictiveBackState, final my myVar, final Modifier modifier, final ModalWideNavigationRailState modalWideNavigationRailState, final WideNavigationRailColors wideNavigationRailColors, final Shape shape, final float f, final my myVar2, final WindowInsets windowInsets, final boolean z3, final Arrangement.Vertical vertical, final my myVar3, Composer composer, final int i, final int i2) {
        int i3;
        WideNavigationRailColors wideNavigationRailColors2;
        int i4;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1593438005);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = Fields.SpotShadowColor;
        if (i5 == 0) {
            i3 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? Fields.RotationX : 128;
        }
        int i7 = i & 3072;
        int i8 = Fields.RotationZ;
        if (i7 == 0) {
            i3 |= startRestartGroup.changed(railPredictiveBackState) ? Fields.CameraDistance : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(modalWideNavigationRailState) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            wideNavigationRailColors2 = wideNavigationRailColors;
            i3 |= startRestartGroup.changed(wideNavigationRailColors2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        } else {
            wideNavigationRailColors2 = wideNavigationRailColors;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(shape) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(f) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(myVar2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(windowInsets) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (startRestartGroup.changed(z3)) {
                i6 = Fields.RotationX;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (startRestartGroup.changed(vertical)) {
                i8 = Fields.CameraDistance;
            }
            i4 |= i8;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar3) ? 16384 : 8192;
        }
        int i9 = i4;
        if (startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i9 & 9363) == 9362) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1593438005, i3, i9, "androidx.compose.material3.ModalWideNavigationRailContent (WideNavigationRail.kt:988)");
            }
            boolean z4 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Strings.Companion companion = Strings.Companion;
            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_wide_navigation_rail_pane_title), startRestartGroup, 0);
            long m2840getModalContainerColor0d7_KjU = wideNavigationRailColors2.m2840getModalContainerColor0d7_KjU();
            long m2841getModalContentColor0d7_KjU = wideNavigationRailColors2.m2841getModalContentColor0d7_KjU();
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m814widthInVpY3zN4$default(modifier, 0.0f, f, 1, null), 0.0f, 1, null);
            boolean changed = startRestartGroup.changed(m2983getString2EP1pXo);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new wd(m2983getString2EP1pXo, 26);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(fillMaxHeight$default, false, (ky) rememberedValue, 1, null);
            boolean changedInstance = ((i3 & 896) == 256 || ((i3 & Fields.RotationY) != 0 && startRestartGroup.changedInstance(animatable))) | startRestartGroup.changedInstance(modalWideNavigationRailState) | ((i3 & 7168) == 2048) | startRestartGroup.changed(z4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new i6(animatable, modalWideNavigationRailState, railPredictiveBackState, z4);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(semantics$default, (ky) rememberedValue2);
            AnchoredDraggableState<WideNavigationRailValue> anchoredDraggableState$material3 = modalWideNavigationRailState.getAnchoredDraggableState$material3();
            Orientation orientation = Orientation.Horizontal;
            boolean changed2 = ((i3 & 112) == 32) | startRestartGroup.changed(z4) | startRestartGroup.changedInstance(modalWideNavigationRailState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new m70(z2, z4, modalWideNavigationRailState, 3);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier draggableAnchors = AnchoredDraggableKt.draggableAnchors(graphicsLayer, anchoredDraggableState$material3, orientation, (my) rememberedValue3);
            DraggableState draggableState$material3 = modalWideNavigationRailState.getAnchoredDraggableState$material3().getDraggableState$material3();
            boolean isAnimationRunning = modalWideNavigationRailState.getAnchoredDraggableState$material3().isAnimationRunning();
            boolean changedInstance2 = startRestartGroup.changedInstance(myVar);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new WideNavigationRailKt$ModalWideNavigationRailContent$4$1(myVar, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            composer2 = startRestartGroup;
            SurfaceKt.m2464SurfaceT9BRK9s(DraggableKt.draggable$default(draggableAnchors, draggableState$material3, orientation, z3, null, isAnimationRunning, null, (ny) rememberedValue4, false, 168, null), shape, m2840getModalContainerColor0d7_KjU, m2841getModalContentColor0d7_KjU, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1043835354, true, new WideNavigationRailKt$ModalWideNavigationRailContent$5(animatable, railPredictiveBackState, z4, z, wideNavigationRailColors2, shape, myVar2, windowInsets, vertical, myVar3), composer2, 54), composer2, ((i3 >> 21) & 112) | 12582912, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: i21
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 ModalWideNavigationRailContent_pU6N4AM$lambda$25;
                    int intValue = ((Integer) obj2).intValue();
                    ModalWideNavigationRailContent_pU6N4AM$lambda$25 = WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$25(z, z2, animatable, railPredictiveBackState, myVar, modifier, modalWideNavigationRailState, wideNavigationRailColors, shape, f, myVar2, windowInsets, z3, vertical, myVar3, i, i2, (Composer) obj, intValue);
                    return ModalWideNavigationRailContent_pU6N4AM$lambda$25;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRailContent_pU6N4AM$lambda$18$lambda$17(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRailContent_pU6N4AM$lambda$20$lambda$19(Animatable animatable, ModalWideNavigationRailState modalWideNavigationRailState, RailPredictiveBackState railPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float floatValue = ((Number) animatable.getValue()).floatValue();
        w01 w01Var = w01.a;
        if (floatValue <= 0.0f) {
            return w01Var;
        }
        float currentOffset = modalWideNavigationRailState.getCurrentOffset();
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() >> 32));
        if (!Float.isNaN(currentOffset) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
            graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX(graphicsLayerScope, floatValue, railPredictiveBackState.getSwipeEdgeMatchesRail()));
            graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY(graphicsLayerScope, floatValue));
            graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
        }
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xe0 ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22(boolean z, boolean z2, ModalWideNavigationRailState modalWideNavigationRailState, IntSize intSize, Constraints constraints) {
        float m7786unboximpl = (int) (intSize.m7786unboximpl() >> 32);
        if (!z) {
            m7786unboximpl = 0.0f;
        } else if (!z2) {
            m7786unboximpl = -m7786unboximpl;
        }
        return new xe0(AnchoredDraggableKt.DraggableAnchors(new jc0(m7786unboximpl, 2)), modalWideNavigationRailState.getTargetValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21(float f, float f2, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(WideNavigationRailValue.Collapsed, f);
        draggableAnchorsConfig.at(WideNavigationRailValue.Expanded, f2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRailContent_pU6N4AM$lambda$25(boolean z, boolean z2, Animatable animatable, RailPredictiveBackState railPredictiveBackState, my myVar, Modifier modifier, ModalWideNavigationRailState modalWideNavigationRailState, WideNavigationRailColors wideNavigationRailColors, Shape shape, float f, my myVar2, WindowInsets windowInsets, boolean z3, Arrangement.Vertical vertical, my myVar3, int i, int i2, Composer composer, int i3) {
        m2847ModalWideNavigationRailContentpU6N4AM(z, z2, animatable, railPredictiveBackState, myVar, modifier, modalWideNavigationRailState, wideNavigationRailColors, shape, f, myVar2, windowInsets, z3, vertical, myVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRail_k3FuEkE$lambda$14(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, my myVar, float f, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, my myVar2, int i, int i2, int i3, Composer composer, int i4) {
        m2846ModalWideNavigationRailk3FuEkE(modifier, wideNavigationRailState, z, shape, shape2, wideNavigationRailColors, myVar, f, windowInsets, vertical, modalWideNavigationRailProperties, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m2848Scrim3JVO9M(final long j, final ky kyVar, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(144695261);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144695261, i2, -1, "androidx.compose.material3.Scrim (WideNavigationRail.kt:1102)");
            }
            if (j != 16) {
                startRestartGroup.startReplaceGroup(-1530482291);
                int i4 = i2;
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                Object rememberedValue = startRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue == companion2.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                Strings.Companion companion3 = Strings.Companion;
                String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_wide_navigation_rail_close_rail), startRestartGroup, 0);
                if (z) {
                    startRestartGroup.startReplaceGroup(-1530047423);
                    companion = Modifier.Companion;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion2.getEmpty()) {
                        rememberedValue2 = new WideNavigationRailKt$Scrim$dismissModalRail$1$1(mutableState);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, kyVar, (PointerInputEventHandler) rememberedValue2);
                    boolean changed = startRestartGroup.changed(m2983getString2EP1pXo);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == companion2.getEmpty()) {
                        rememberedValue3 = new te0(mutableState, m2983getString2EP1pXo);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    modifier = SemanticsModifierKt.semantics(pointerInput, true, (ky) rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1529667363);
                    startRestartGroup.endReplaceGroup();
                    companion = Modifier.Companion;
                    modifier = companion;
                }
                Modifier then = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null).then(modifier);
                boolean changed2 = ((i4 & 14) == 4) | startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue4 == companion2.getEmpty()) {
                    rememberedValue4 = new m90(i3, j, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                CanvasKt.Canvas(then, (ky) rememberedValue4, startRestartGroup, 0);
                Boolean valueOf = Boolean.valueOf(Scrim_3J_VO9M$lambda$28(mutableState));
                boolean changedInstance = startRestartGroup.changedInstance(kyVar);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue5 == companion2.getEmpty()) {
                    rememberedValue5 = new WideNavigationRailKt$Scrim$2$1(kyVar, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue5, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1529413659);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: j21
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 Scrim_3J_VO9M$lambda$37;
                    int intValue = ((Integer) obj2).intValue();
                    Scrim_3J_VO9M$lambda$37 = WideNavigationRailKt.Scrim_3J_VO9M$lambda$37(j, kyVar, z, i, (Composer) obj, intValue);
                    return Scrim_3J_VO9M$lambda$37;
                }
            });
        }
    }

    private static final float Scrim_3J_VO9M$lambda$26(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Scrim_3J_VO9M$lambda$28(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Scrim_3J_VO9M$lambda$29(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_3J_VO9M$lambda$33$lambda$32(String str, MutableState mutableState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new j3(mutableState, 26), 1, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Scrim_3J_VO9M$lambda$33$lambda$32$lambda$31(MutableState mutableState) {
        Scrim_3J_VO9M$lambda$29(mutableState, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_3J_VO9M$lambda$35$lambda$34(long j, State state, DrawScope drawScope) {
        DrawScope.m5329drawRectnJ9OG0$default(drawScope, j, 0L, 0L, y80.g(Scrim_3J_VO9M$lambda$26(state), 0.0f, 1.0f), null, null, 0, 118, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_3J_VO9M$lambda$37(long j, ky kyVar, boolean z, int i, Composer composer, int i2) {
        m2848Scrim3JVO9M(j, kyVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WideNavigationRail(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, my myVar, WindowInsets windowInsets, Arrangement.Vertical vertical, final my myVar2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        WideNavigationRailColors wideNavigationRailColors2;
        my myVar3;
        WindowInsets windowInsets2;
        Arrangement.Vertical vertical2;
        my myVar4;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape3;
        final WideNavigationRailColors wideNavigationRailColors3;
        final my myVar5;
        final WindowInsets windowInsets3;
        final Arrangement.Vertical vertical3;
        final WideNavigationRailState wideNavigationRailState2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        WideNavigationRailState wideNavigationRailState3;
        WideNavigationRailState wideNavigationRailState4;
        Arrangement.Vertical arrangement;
        Shape shape4;
        WideNavigationRailColors wideNavigationRailColors4;
        my myVar6;
        WindowInsets windowInsets4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(164193188);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(wideNavigationRailState) : startRestartGroup.changedInstance(wideNavigationRailState)) {
                    i8 = 32;
                    i3 |= i8;
                }
            }
            i8 = 16;
            i3 |= i8;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i7 = Fields.RotationX;
                    i3 |= i7;
                }
            } else {
                shape2 = shape;
            }
            i7 = Fields.SpotShadowColor;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                wideNavigationRailColors2 = wideNavigationRailColors;
                if (startRestartGroup.changed(wideNavigationRailColors2)) {
                    i6 = Fields.CameraDistance;
                    i3 |= i6;
                }
            } else {
                wideNavigationRailColors2 = wideNavigationRailColors;
            }
            i6 = Fields.RotationZ;
            i3 |= i6;
        } else {
            wideNavigationRailColors2 = wideNavigationRailColors;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            myVar3 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar3) ? Fields.Clip : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i5 = Fields.RenderEffect;
                        i3 |= i5;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    vertical2 = vertical;
                    if (startRestartGroup.changed(vertical2)) {
                        i4 = 1048576;
                        i3 |= i4;
                    }
                } else {
                    vertical2 = vertical;
                }
                i4 = Fields.BlendMode;
                i3 |= i4;
            } else {
                vertical2 = vertical;
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier4 = i9 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 2) != 0) {
                            wideNavigationRailState3 = WideNavigationRailStateKt.rememberWideNavigationRailState(null, startRestartGroup, 0, 1);
                            i3 &= -113;
                        } else {
                            wideNavigationRailState3 = wideNavigationRailState;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape2 = WideNavigationRailDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            wideNavigationRailColors2 = WideNavigationRailDefaults.INSTANCE.colors(startRestartGroup, 6);
                        }
                        if (i10 != 0) {
                            myVar3 = null;
                        }
                        if ((i2 & 32) != 0) {
                            windowInsets2 = WideNavigationRailDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            wideNavigationRailState4 = wideNavigationRailState3;
                            arrangement = WideNavigationRailDefaults.INSTANCE.getArrangement();
                            shape4 = shape2;
                            wideNavigationRailColors4 = wideNavigationRailColors2;
                            myVar6 = myVar3;
                            windowInsets4 = windowInsets2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(164193188, i3, -1, "androidx.compose.material3.WideNavigationRail (WideNavigationRail.kt:169)");
                            }
                            Modifier modifier5 = modifier4;
                            ((WideNavigationRailOverride) startRestartGroup.consume(LocalWideNavigationRailOverride)).WideNavigationRail(new WideNavigationRailOverrideScope(modifier5, wideNavigationRailState4, shape4, wideNavigationRailColors4, myVar6, windowInsets4, arrangement, myVar4), startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier3 = modifier5;
                            wideNavigationRailState2 = wideNavigationRailState4;
                            shape3 = shape4;
                            wideNavigationRailColors3 = wideNavigationRailColors4;
                            myVar5 = myVar6;
                            windowInsets3 = windowInsets4;
                            vertical3 = arrangement;
                        } else {
                            wideNavigationRailState4 = wideNavigationRailState3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        wideNavigationRailState4 = wideNavigationRailState;
                        modifier4 = modifier2;
                    }
                    shape4 = shape2;
                    wideNavigationRailColors4 = wideNavigationRailColors2;
                    myVar6 = myVar3;
                    windowInsets4 = windowInsets2;
                    arrangement = vertical2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier4;
                    ((WideNavigationRailOverride) startRestartGroup.consume(LocalWideNavigationRailOverride)).WideNavigationRail(new WideNavigationRailOverrideScope(modifier52, wideNavigationRailState4, shape4, wideNavigationRailColors4, myVar6, windowInsets4, arrangement, myVar4), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    modifier3 = modifier52;
                    wideNavigationRailState2 = wideNavigationRailState4;
                    shape3 = shape4;
                    wideNavigationRailColors3 = wideNavigationRailColors4;
                    myVar5 = myVar6;
                    windowInsets3 = windowInsets4;
                    vertical3 = arrangement;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                    shape3 = shape2;
                    wideNavigationRailColors3 = wideNavigationRailColors2;
                    myVar5 = myVar3;
                    windowInsets3 = windowInsets2;
                    vertical3 = vertical2;
                    wideNavigationRailState2 = wideNavigationRailState;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: l21
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 WideNavigationRail$lambda$1;
                            int intValue = ((Integer) obj2).intValue();
                            WideNavigationRail$lambda$1 = WideNavigationRailKt.WideNavigationRail$lambda$1(Modifier.this, wideNavigationRailState2, shape3, wideNavigationRailColors3, myVar5, windowInsets3, vertical3, myVar2, i, i2, (Composer) obj, intValue);
                            return WideNavigationRail$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            myVar4 = myVar2;
            if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        myVar3 = myVar;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        myVar4 = myVar2;
        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 WideNavigationRail$lambda$1(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, my myVar, WindowInsets windowInsets, Arrangement.Vertical vertical, my myVar2, int i, int i2, Composer composer, int i3) {
        WideNavigationRail(modifier, wideNavigationRailState, shape, wideNavigationRailColors, myVar, windowInsets, vertical, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    /* renamed from: WideNavigationRailItem-pli-t6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2849WideNavigationRailItemplit6k(final boolean z, final iy iyVar, final my myVar, final my myVar2, final boolean z2, Modifier modifier, boolean z3, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i4;
        iy iyVar2;
        my myVar3;
        my myVar4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z5;
        int i7;
        NavigationItemColors navigationItemColors2;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final Modifier modifier3;
        final boolean z6;
        final int i11;
        final NavigationItemColors navigationItemColors3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1894733304);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z4 = z;
        } else {
            z4 = z;
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changed(z4) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i2 & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            myVar3 = myVar;
            i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                myVar4 = myVar2;
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    modifier2 = modifier;
                    i4 |= startRestartGroup.changed(modifier2) ? Fields.RenderEffect : 65536;
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((1572864 & i2) == 0) {
                        z5 = z3;
                        i4 |= startRestartGroup.changed(z5) ? 1048576 : Fields.BlendMode;
                        if ((12582912 & i2) == 0) {
                            if ((i3 & Fields.SpotShadowColor) == 0) {
                                i7 = i;
                                if (startRestartGroup.changed(i7)) {
                                    i15 = GroupFlagsKt.IsNodeFlag;
                                    i4 |= i15;
                                }
                            } else {
                                i7 = i;
                            }
                            i15 = 4194304;
                            i4 |= i15;
                        } else {
                            i7 = i;
                        }
                        if ((100663296 & i2) == 0) {
                            if ((i3 & Fields.RotationX) == 0) {
                                navigationItemColors2 = navigationItemColors;
                                if (startRestartGroup.changed(navigationItemColors2)) {
                                    i14 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                    i4 |= i14;
                                }
                            } else {
                                navigationItemColors2 = navigationItemColors;
                            }
                            i14 = GroupFlagsKt.HasAuxSlotFlag;
                            i4 |= i14;
                        } else {
                            navigationItemColors2 = navigationItemColors;
                        }
                        i8 = i3 & Fields.RotationY;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i9 = i8;
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i10 = i4;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i10 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier3 = modifier2;
                                z6 = z5;
                                i11 = i7;
                                navigationItemColors3 = navigationItemColors2;
                                mutableInteractionSource2 = mutableInteractionSource;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i6 != 0) {
                                        z5 = true;
                                    }
                                    if ((i3 & Fields.SpotShadowColor) != 0) {
                                        i12 = i10 & (-29360129);
                                        i7 = WideNavigationRailItemDefaults.INSTANCE.m2845iconPositionFors8pcRp0(z2);
                                    } else {
                                        i12 = i10;
                                    }
                                    if ((i3 & Fields.RotationX) != 0) {
                                        i12 &= -234881025;
                                        navigationItemColors2 = WideNavigationRailItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    }
                                    i13 = i12;
                                    if (i9 != 0) {
                                        mutableInteractionSource3 = null;
                                        Modifier modifier4 = modifier2;
                                        boolean z7 = z5;
                                        int i16 = i7;
                                        NavigationItemColors navigationItemColors4 = navigationItemColors2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1894733304, i13, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                                        }
                                        if (mutableInteractionSource3 != null) {
                                            startRestartGroup.startReplaceGroup(-1539072909);
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            startRestartGroup.startReplaceGroup(227446500);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        Shape value = ShapesKt.getValue(NavigationRailBaselineItemTokens.INSTANCE.getActiveIndicatorShape(), startRestartGroup, 6);
                                        NavigationRailVerticalItemTokens navigationRailVerticalItemTokens = NavigationRailVerticalItemTokens.INSTANCE;
                                        float m3470getActiveIndicatorWidthD9Ej5fM = navigationRailVerticalItemTokens.m3470getActiveIndicatorWidthD9Ej5fM();
                                        TextStyle value2 = TypographyKt.getValue(navigationRailVerticalItemTokens.getLabelTextFont(), startRestartGroup, 6);
                                        NavigationRailHorizontalItemTokens navigationRailHorizontalItemTokens = NavigationRailHorizontalItemTokens.INSTANCE;
                                        int i17 = i13 << 3;
                                        composer2 = startRestartGroup;
                                        NavigationItemKt.m2206AnimatedNavigationItemDQd_Gtc(z4, iyVar2, myVar3, value, m3470getActiveIndicatorWidthD9Ej5fM, value2, TypographyKt.getValue(navigationRailHorizontalItemTokens.getLabelTextFont(), startRestartGroup, 6), ItemTopIconIndicatorHorizontalPadding, ItemTopIconIndicatorVerticalPadding, navigationRailVerticalItemTokens.m3471getIconLabelSpaceD9Ej5fM(), navigationRailHorizontalItemTokens.m3465getFullWidthLeadingSpaceD9Ej5fM(), ItemStartIconIndicatorVerticalPadding, WNRItemNoLabelIndicatorPadding, navigationRailHorizontalItemTokens.m3467getIconLabelSpaceD9Ej5fM(), ItemHorizontalPadding, navigationItemColors4, modifier4, z7, myVar4, i16, mutableInteractionSource4, composer2, (i13 & 14) | 918577152 | (i13 & 112) | (i13 & 896), ((i13 >> 9) & 458752) | 28086 | (3670016 & i17) | (i17 & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 6) & 1879048192), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        navigationItemColors3 = navigationItemColors4;
                                        modifier3 = modifier4;
                                        z6 = z7;
                                        i11 = i16;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i13 = (i3 & Fields.SpotShadowColor) != 0 ? i10 & (-29360129) : i10;
                                    if ((i3 & Fields.RotationX) != 0) {
                                        i13 &= -234881025;
                                    }
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                Modifier modifier42 = modifier2;
                                boolean z72 = z5;
                                int i162 = i7;
                                NavigationItemColors navigationItemColors42 = navigationItemColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (mutableInteractionSource3 != null) {
                                }
                                Shape value3 = ShapesKt.getValue(NavigationRailBaselineItemTokens.INSTANCE.getActiveIndicatorShape(), startRestartGroup, 6);
                                NavigationRailVerticalItemTokens navigationRailVerticalItemTokens2 = NavigationRailVerticalItemTokens.INSTANCE;
                                float m3470getActiveIndicatorWidthD9Ej5fM2 = navigationRailVerticalItemTokens2.m3470getActiveIndicatorWidthD9Ej5fM();
                                TextStyle value22 = TypographyKt.getValue(navigationRailVerticalItemTokens2.getLabelTextFont(), startRestartGroup, 6);
                                NavigationRailHorizontalItemTokens navigationRailHorizontalItemTokens2 = NavigationRailHorizontalItemTokens.INSTANCE;
                                int i172 = i13 << 3;
                                composer2 = startRestartGroup;
                                NavigationItemKt.m2206AnimatedNavigationItemDQd_Gtc(z4, iyVar2, myVar3, value3, m3470getActiveIndicatorWidthD9Ej5fM2, value22, TypographyKt.getValue(navigationRailHorizontalItemTokens2.getLabelTextFont(), startRestartGroup, 6), ItemTopIconIndicatorHorizontalPadding, ItemTopIconIndicatorVerticalPadding, navigationRailVerticalItemTokens2.m3471getIconLabelSpaceD9Ej5fM(), navigationRailHorizontalItemTokens2.m3465getFullWidthLeadingSpaceD9Ej5fM(), ItemStartIconIndicatorVerticalPadding, WNRItemNoLabelIndicatorPadding, navigationRailHorizontalItemTokens2.m3467getIconLabelSpaceD9Ej5fM(), ItemHorizontalPadding, navigationItemColors42, modifier42, z72, myVar4, i162, mutableInteractionSource4, composer2, (i13 & 14) | 918577152 | (i13 & 112) | (i13 & 896), ((i13 >> 9) & 458752) | 28086 | (3670016 & i172) | (i172 & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 6) & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                mutableInteractionSource2 = mutableInteractionSource3;
                                navigationItemColors3 = navigationItemColors42;
                                modifier3 = modifier42;
                                z6 = z72;
                                i11 = i162;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: h21
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 WideNavigationRailItem_pli_t6k$lambda$16;
                                        int intValue = ((Integer) obj2).intValue();
                                        WideNavigationRailItem_pli_t6k$lambda$16 = WideNavigationRailKt.WideNavigationRailItem_pli_t6k$lambda$16(z, iyVar, myVar, myVar2, z2, modifier3, z6, i11, navigationItemColors3, mutableInteractionSource2, i2, i3, (Composer) obj, intValue);
                                        return WideNavigationRailItem_pli_t6k$lambda$16;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        i10 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i10 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z5 = z3;
                    if ((12582912 & i2) == 0) {
                    }
                    if ((100663296 & i2) == 0) {
                    }
                    i8 = i3 & Fields.RotationY;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                modifier2 = modifier;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                z5 = z3;
                if ((12582912 & i2) == 0) {
                }
                if ((100663296 & i2) == 0) {
                }
                i8 = i3 & Fields.RotationY;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar4 = myVar2;
            if ((i3 & 16) != 0) {
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            z5 = z3;
            if ((12582912 & i2) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            i8 = i3 & Fields.RotationY;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        myVar3 = myVar;
        if ((i3 & 8) == 0) {
        }
        myVar4 = myVar2;
        if ((i3 & 16) != 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        z5 = z3;
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        i8 = i3 & Fields.RotationY;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 WideNavigationRailItem_pli_t6k$lambda$16(boolean z, iy iyVar, my myVar, my myVar2, boolean z2, Modifier modifier, boolean z3, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        m2849WideNavigationRailItemplit6k(z, iyVar, myVar, myVar2, z2, modifier, z3, i, navigationItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WideNavigationRailLayout(Modifier modifier, boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, my myVar, WindowInsets windowInsets, Arrangement.Vertical vertical, my myVar2, Composer composer, int i) {
        int i2;
        WideNavigationRailColors wideNavigationRailColors2;
        float m7625unboximpl;
        Composer startRestartGroup = composer.startRestartGroup(-1004308036);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            wideNavigationRailColors2 = wideNavigationRailColors;
            i2 |= startRestartGroup.changed(wideNavigationRailColors2) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            wideNavigationRailColors2 = wideNavigationRailColors;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(vertical) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1004308036, i2, -1, "androidx.compose.material3.WideNavigationRailLayout (WideNavigationRail.kt:218)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableIntState mutableIntState2 = (MutableIntState) rememberedValue2;
            if (Dp.m7616equalsimpl0(((Dp) startRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl(), Dp.Companion.m7631getUnspecifiedD9Ej5fM())) {
                startRestartGroup.startReplaceGroup(-597966102);
                startRestartGroup.endReplaceGroup();
                m7625unboximpl = Dp.m7611constructorimpl(0.0f);
            } else {
                startRestartGroup.startReplaceGroup(-597931134);
                m7625unboximpl = ((Dp) startRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl();
                startRestartGroup.endReplaceGroup();
            }
            float f = m7625unboximpl;
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            State<Dp> m127animateDpAsStateAjpBEmI = AnimateAsStateKt.m127animateDpAsStateAjpBEmI(!z2 ? CollapsedRailWidth : ExpandedRailMinWidth, !z ? value : value2, null, null, startRestartGroup, 0, 12);
            State<Dp> m127animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m127animateDpAsStateAjpBEmI(!z2 ? CollapsedRailWidth : ExpandedRailMaxWidth, !z ? value : value2, null, null, startRestartGroup, 0, 12);
            State<Dp> m127animateDpAsStateAjpBEmI3 = AnimateAsStateKt.m127animateDpAsStateAjpBEmI(!z2 ? NavigationRailCollapsedTokens.INSTANCE.m3456getItemVerticalSpaceD9Ej5fM() : Dp.m7611constructorimpl(0.0f), value, null, null, startRestartGroup, 0, 12);
            int i3 = i2;
            SurfaceKt.m2464SurfaceT9BRK9s(modifier, shape, !z ? wideNavigationRailColors2.m2838getContainerColor0d7_KjU() : wideNavigationRailColors2.m2840getModalContainerColor0d7_KjU(), !z ? wideNavigationRailColors2.m2839getContentColor0d7_KjU() : wideNavigationRailColors2.m2841getModalContentColor0d7_KjU(), 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1489314345, true, new WideNavigationRailKt$WideNavigationRailLayout$1(windowInsets, myVar, z2, m127animateDpAsStateAjpBEmI, f, AnimateAsStateKt.m127animateDpAsStateAjpBEmI(!z2 ? TopIconItemMinHeight : f, value, null, null, startRestartGroup, 0, 12), m127animateDpAsStateAjpBEmI2, mutableIntState2, mutableIntState, vertical, m127animateDpAsStateAjpBEmI3, myVar2), startRestartGroup, 54), startRestartGroup, (i3 & 14) | 12582912 | ((i3 >> 9) & 112), 112);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a00(modifier, z, z2, wideNavigationRailColors, shape, myVar, windowInsets, vertical, myVar2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$10(State<Dp> state) {
        return state.getValue().m7625unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$11(State<Dp> state) {
        return state.getValue().m7625unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 WideNavigationRailLayout$lambda$12(Modifier modifier, boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, my myVar, WindowInsets windowInsets, Arrangement.Vertical vertical, my myVar2, int i, Composer composer, int i2) {
        WideNavigationRailLayout(modifier, z, z2, wideNavigationRailColors, shape, myVar, windowInsets, vertical, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$8(State<Dp> state) {
        return state.getValue().m7625unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$9(State<Dp> state) {
        return state.getValue().m7625unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f, boolean z) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return ((MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo367toPx0680j_4(PredictiveBackMaxScaleXDistance), intBitsToFloat), f) * (z ? 1.0f : -1.0f)) / intBitsToFloat) + 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo367toPx0680j_4(PredictiveBackMaxScaleYDistance), intBitsToFloat), f) / intBitsToFloat);
    }

    public static final ProvidableCompositionLocal<ModalWideNavigationRailOverride> getLocalModalWideNavigationRailOverride() {
        return LocalModalWideNavigationRailOverride;
    }

    public static final ProvidableCompositionLocal<WideNavigationRailOverride> getLocalWideNavigationRailOverride() {
        return LocalWideNavigationRailOverride;
    }

    public static final float getWNRItemNoLabelIndicatorPadding() {
        return WNRItemNoLabelIndicatorPadding;
    }
}
