package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselPageSize;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bf;
import defpackage.ed;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ng;
import defpackage.ny;
import defpackage.o;
import defpackage.oy;
import defpackage.q10;
import defpackage.rg;
import defpackage.ug;
import defpackage.w01;
import defpackage.y80;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: Carousel-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2865CarouselcJHQLPU(final CarouselState carouselState, final Orientation orientation, final my myVar, final PaddingValues paddingValues, final int i, Modifier modifier, float f, TargetedFlingBehavior targetedFlingBehavior, boolean z, final oy oyVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        float f2;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i7;
        int i8;
        int i9;
        int i10;
        final boolean z2;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        CarouselState carouselState2;
        boolean z3;
        TargetedFlingBehavior targetedFlingBehavior4;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-2077912500);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(orientation.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 24576) == 0) {
                i4 |= startRestartGroup.changed(i5) ? Fields.Clip : 8192;
            }
        }
        int i12 = i3 & 32;
        if (i12 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.RenderEffect : 65536;
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 1048576 : Fields.BlendMode;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & Fields.SpotShadowColor) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i11 = GroupFlagsKt.IsNodeFlag;
                            i4 |= i11;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i11 = 4194304;
                    i4 |= i11;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i7 = i3 & Fields.RotationX;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i8 = i12;
                    i4 |= startRestartGroup.changed(z) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    i9 = i4;
                    if ((i3 & Fields.RotationY) != 0) {
                        if ((i2 & 805306368) == 0) {
                            i10 = i9 | (startRestartGroup.changedInstance(oyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag);
                        }
                        boolean z4 = true;
                        if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier3 = i8 != 0 ? Modifier.Companion : modifier2;
                                if (i6 != 0) {
                                    f2 = Dp.m7611constructorimpl(0.0f);
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    int i13 = (i9 & 14) | 384;
                                    carouselState2 = carouselState;
                                    i9 &= -29360129;
                                    z4 = true;
                                    targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i13, 2);
                                } else {
                                    carouselState2 = carouselState;
                                }
                                z3 = i7 != 0 ? z4 : z;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                modifier2 = modifier3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i9 &= -29360129;
                                }
                                carouselState2 = carouselState;
                                z3 = z;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                            }
                            int i14 = i9;
                            float f4 = f2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2077912500, i14, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:374)");
                            }
                            int i15 = ((i14 >> 9) & 14) | (i14 & 112);
                            float calculateBeforeContentPadding = calculateBeforeContentPadding(paddingValues, orientation, startRestartGroup, i15);
                            float calculateAfterContentPadding = calculateAfterContentPadding(paddingValues, orientation, startRestartGroup, i15);
                            boolean z5 = (i14 & 896) == 256 ? z4 : false;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new CarouselPageSize(myVar, calculateBeforeContentPadding, calculateAfterContentPadding);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            CarouselPageSize carouselPageSize = (CarouselPageSize) rememberedValue;
                            SnapPosition KeylineSnapPosition = KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize);
                            if (orientation == Orientation.Horizontal) {
                                startRestartGroup.startReplaceGroup(273387289);
                                CarouselPagerState pagerState$material3 = carouselState2.getPagerState$material3();
                                PaddingValues m759PaddingValuesa9UjIt4$default = PaddingKt.m759PaddingValuesa9UjIt4$default(0.0f, paddingValues.mo714calculateTopPaddingD9Ej5fM(), 0.0f, paddingValues.mo711calculateBottomPaddingD9Ej5fM(), 5, null);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new ed(11);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                PagerKt.m1002HorizontalPager8jOkeI(pagerState$material3, SemanticsModifierKt.semantics$default(modifier2, false, (ky) rememberedValue2, 1, null), m759PaddingValuesa9UjIt4$default, carouselPageSize, i5, f4, null, targetedFlingBehavior4, z3, false, null, null, KeylineSnapPosition, null, ComposableLambdaKt.rememberComposableLambda(-1817116752, true, new CarouselKt$Carousel$2(carouselState2, carouselPageSize, oyVar), startRestartGroup, 54), startRestartGroup, (i14 & 57344) | ((i14 >> 3) & 458752) | (i14 & 29360128) | (i14 & 234881024), 24576, 11840);
                                startRestartGroup.endReplaceGroup();
                            } else if (orientation == Orientation.Vertical) {
                                startRestartGroup.startReplaceGroup(275178469);
                                CarouselPagerState pagerState$material32 = carouselState2.getPagerState$material3();
                                PaddingValues m759PaddingValuesa9UjIt4$default2 = PaddingKt.m759PaddingValuesa9UjIt4$default(PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection())), 0.0f, PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection())), 0.0f, 10, null);
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                                    rememberedValue3 = new ed(12);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                PagerKt.m1004VerticalPager8jOkeI(pagerState$material32, SemanticsModifierKt.semantics$default(modifier2, false, (ky) rememberedValue3, 1, null), m759PaddingValuesa9UjIt4$default2, carouselPageSize, i, f4, null, targetedFlingBehavior4, z3, false, null, null, KeylineSnapPosition, null, ComposableLambdaKt.rememberComposableLambda(-1042567175, true, new CarouselKt$Carousel$4(carouselState2, carouselPageSize, oyVar), startRestartGroup, 54), startRestartGroup, (i14 & 57344) | ((i14 >> 3) & 458752) | (i14 & 29360128) | (i14 & 234881024), 24576, 11840);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(276916918);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f3 = f4;
                            targetedFlingBehavior3 = targetedFlingBehavior4;
                            z2 = z3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z2 = z;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            f3 = f2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            endRestartGroup.updateScope(new my() { // from class: pg
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 Carousel_cJHQLPU$lambda$19;
                                    int intValue = ((Integer) obj2).intValue();
                                    Carousel_cJHQLPU$lambda$19 = CarouselKt.Carousel_cJHQLPU$lambda$19(CarouselState.this, orientation, myVar, paddingValues, i, modifier4, f3, targetedFlingBehavior3, z2, oyVar, i2, i3, (Composer) obj, intValue);
                                    return Carousel_cJHQLPU$lambda$19;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i9 | 805306368;
                    i9 = i10;
                    boolean z42 = true;
                    if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i12;
                i9 = i4;
                if ((i3 & Fields.RotationY) != 0) {
                }
                i9 = i10;
                boolean z422 = true;
                if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            if ((i2 & 12582912) == 0) {
            }
            i7 = i3 & Fields.RotationX;
            if (i7 != 0) {
            }
            i8 = i12;
            i9 = i4;
            if ((i3 & Fields.RotationY) != 0) {
            }
            i9 = i10;
            boolean z4222 = true;
            if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        f2 = f;
        if ((i2 & 12582912) == 0) {
        }
        i7 = i3 & Fields.RotationX;
        if (i7 != 0) {
        }
        i8 = i12;
        i9 = i4;
        if ((i3 & Fields.RotationY) != 0) {
        }
        i9 = i10;
        boolean z42222 = true;
        if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Carousel_cJHQLPU$lambda$16$lambda$15(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6829getCarouselo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Carousel_cJHQLPU$lambda$18$lambda$17(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6829getCarouselo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Carousel_cJHQLPU$lambda$19(CarouselState carouselState, Orientation orientation, my myVar, PaddingValues paddingValues, int i, Modifier modifier, float f, TargetedFlingBehavior targetedFlingBehavior, boolean z, oy oyVar, int i2, int i3, Composer composer, int i4) {
        m2865CarouselcJHQLPU(carouselState, orientation, myVar, paddingValues, i, modifier, f, targetedFlingBehavior, z, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: HorizontalCenteredHeroCarousel-p2lB3Bg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2866HorizontalCenteredHeroCarouselp2lB3Bg(CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, oy oyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f5;
        int i5;
        float f6;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i6;
        boolean z2;
        int i7;
        float f7;
        int i8;
        int i9;
        int i10;
        PaddingValues paddingValues2;
        int i11;
        PaddingValues paddingValues3;
        Modifier modifier3;
        float f8;
        TargetedFlingBehavior targetedFlingBehavior3;
        boolean z3;
        Composer composer2;
        float f9;
        float f10;
        ScopeUpdateScope endRestartGroup;
        CarouselState carouselState2;
        PaddingValues paddingValues4;
        float f11;
        float f12;
        float f13;
        TargetedFlingBehavior targetedFlingBehavior4;
        Modifier modifier4;
        int i12;
        float f14;
        float f15;
        float f16;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1493031269);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
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
                f5 = f;
                i3 |= startRestartGroup.changed(f5) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f6 = f2;
                    i3 |= startRestartGroup.changed(f6) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                            if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                i13 = Fields.Clip;
                                i3 |= i13;
                            }
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? Fields.RenderEffect : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            f7 = f3;
                        } else {
                            f7 = f3;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(f7) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        i8 = i2 & Fields.SpotShadowColor;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        i9 = i2 & Fields.RotationX;
                        if (i9 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            paddingValues2 = paddingValues;
                            i3 |= startRestartGroup.changed(paddingValues2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            i11 = i3;
                            if ((i2 & Fields.RotationY) == 0) {
                                i11 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i11 |= startRestartGroup.changedInstance(oyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i14 != 0 ? Modifier.Companion : modifier2;
                                        if (i4 != 0) {
                                            f5 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
                                        }
                                        if (i5 != 0) {
                                            f6 = Dp.m7611constructorimpl(0.0f);
                                        }
                                        if ((i2 & 16) != 0) {
                                            int i15 = (i11 & 14) | 384;
                                            carouselState2 = carouselState;
                                            i11 &= -57345;
                                            targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i15, 2);
                                        } else {
                                            carouselState2 = carouselState;
                                        }
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            f7 = CarouselDefaults.INSTANCE.m2864getMinSmallItemSizeD9Ej5fM();
                                        }
                                        float m2863getMaxSmallItemSizeD9Ej5fM = i8 != 0 ? CarouselDefaults.INSTANCE.m2863getMaxSmallItemSizeD9Ej5fM() : f4;
                                        if (i10 != 0) {
                                            paddingValues4 = PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f));
                                            f13 = f6;
                                            modifier4 = modifier5;
                                            i12 = i11;
                                            f11 = m2863getMaxSmallItemSizeD9Ej5fM;
                                            f12 = f7;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                        } else {
                                            paddingValues4 = paddingValues;
                                            f11 = m2863getMaxSmallItemSizeD9Ej5fM;
                                            f12 = f7;
                                            f13 = f6;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            modifier4 = modifier5;
                                            i12 = i11;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 16) != 0) {
                                            i11 &= -57345;
                                        }
                                        carouselState2 = carouselState;
                                        modifier4 = modifier2;
                                        f12 = f7;
                                        f13 = f6;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        i12 = i11;
                                        paddingValues4 = paddingValues2;
                                        f11 = f4;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1493031269, i12, -1, "androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel (Carousel.kt:304)");
                                    }
                                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    Orientation orientation = Orientation.Horizontal;
                                    float f17 = f12;
                                    float f18 = f11;
                                    boolean changed = ((i12 & 896) == 256) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(carouselState2) | ((i12 & 3670016) == 1048576) | ((i12 & 29360128) == 8388608);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                        float f19 = f5;
                                        rememberedValue = new ug(density, f19, carouselState2, f17, f18, 0);
                                        f14 = f19;
                                        f15 = f17;
                                        f16 = f18;
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        f15 = f17;
                                        f16 = f18;
                                        f14 = f5;
                                    }
                                    int i16 = i12 << 9;
                                    PaddingValues paddingValues5 = paddingValues4;
                                    boolean z4 = z2;
                                    m2865CarouselcJHQLPU(carouselState, orientation, (my) rememberedValue, paddingValues5, 2, modifier4, f13, targetedFlingBehavior4, z4, oyVar, startRestartGroup, (i12 & 14) | 24624 | ((i12 >> 15) & 7168) | ((i12 << 12) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (1879048192 & i12), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    paddingValues3 = paddingValues5;
                                    composer2 = startRestartGroup;
                                    modifier3 = modifier4;
                                    f8 = f13;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    z3 = z4;
                                    f9 = f14;
                                    f7 = f15;
                                    f10 = f16;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    paddingValues3 = paddingValues;
                                    modifier3 = modifier2;
                                    f8 = f6;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    z3 = z2;
                                    composer2 = startRestartGroup;
                                    f9 = f5;
                                    f10 = f4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new ng(carouselState, modifier3, f9, f8, targetedFlingBehavior3, z3, f7, f10, paddingValues3, oyVar, i, i2));
                                    return;
                                }
                                return;
                            }
                            if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        paddingValues2 = paddingValues;
                        i11 = i3;
                        if ((i2 & Fields.RotationY) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    z2 = z;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & Fields.SpotShadowColor;
                    if (i8 != 0) {
                    }
                    i9 = i2 & Fields.RotationX;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    paddingValues2 = paddingValues;
                    i11 = i3;
                    if ((i2 & Fields.RotationY) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f6 = f2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & Fields.SpotShadowColor;
                if (i8 != 0) {
                }
                i9 = i2 & Fields.RotationX;
                if (i9 != 0) {
                }
                i10 = i9;
                paddingValues2 = paddingValues;
                i11 = i3;
                if ((i2 & Fields.RotationY) == 0) {
                }
                if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f5 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f6 = f2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & Fields.SpotShadowColor;
            if (i8 != 0) {
            }
            i9 = i2 & Fields.RotationX;
            if (i9 != 0) {
            }
            i10 = i9;
            paddingValues2 = paddingValues;
            i11 = i3;
            if ((i2 & Fields.RotationY) == 0) {
            }
            if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f5 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f6 = f2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & Fields.SpotShadowColor;
        if (i8 != 0) {
        }
        i9 = i2 & Fields.RotationX;
        if (i9 != 0) {
        }
        i10 = i9;
        paddingValues2 = paddingValues;
        i11 = i3;
        if ((i2 & Fields.RotationY) == 0) {
        }
        if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeylineList HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$12$lambda$11(Density density, float f, CarouselState carouselState, float f2, float f3, float f4, float f5) {
        return KeylinesKt.heroKeylineList(density, f4, !Float.isNaN(f) ? Float.valueOf(density.mo367toPx0680j_4(f)) : null, f5, ((Number) carouselState.getPagerState$material3().getPageCountState().getValue().invoke()).intValue(), true, density.mo367toPx0680j_4(f2), density.mo367toPx0680j_4(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13(CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, oy oyVar, int i, int i2, Composer composer, int i3) {
        m2866HorizontalCenteredHeroCarouselp2lB3Bg(carouselState, modifier, f, f2, targetedFlingBehavior, z, f3, f4, paddingValues, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0205  */
    /* renamed from: HorizontalMultiBrowseCarousel-3tcCNu0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2867HorizontalMultiBrowseCarousel3tcCNu0(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, oy oyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f5;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        boolean z2;
        int i6;
        float f6;
        int i7;
        int i8;
        int i9;
        PaddingValues paddingValues2;
        int i10;
        float f7;
        float f8;
        TargetedFlingBehavior targetedFlingBehavior3;
        boolean z3;
        PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        CarouselState carouselState2;
        float f9;
        float f10;
        TargetedFlingBehavior targetedFlingBehavior4;
        Modifier modifier3;
        int i11;
        PaddingValues paddingValues4;
        float f11;
        boolean changed;
        Object rememberedValue;
        float f12;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-221490402);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f5 = f2;
                i3 |= startRestartGroup.changed(f5) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i12 = Fields.Clip;
                            i3 |= i12;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f6 = f3;
                    } else {
                        f6 = f3;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f6) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i8 = i2 & Fields.RotationX;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        paddingValues2 = paddingValues;
                        i3 |= startRestartGroup.changed(paddingValues2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i10 = i3;
                        if ((i2 & Fields.RotationY) != 0) {
                            i10 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i10 |= startRestartGroup.changedInstance(oyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                f7 = f4;
                                f8 = f5;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                z3 = z2;
                                paddingValues3 = paddingValues;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier2;
                                    if (i4 != 0) {
                                        f5 = Dp.m7611constructorimpl(0.0f);
                                    }
                                    if ((i2 & 16) != 0) {
                                        int i14 = (i10 & 14) | 384;
                                        carouselState2 = carouselState;
                                        i10 &= -57345;
                                        targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i14, 2);
                                    } else {
                                        carouselState2 = carouselState;
                                    }
                                    if (i5 != 0) {
                                        z2 = true;
                                    }
                                    if (i6 != 0) {
                                        f6 = CarouselDefaults.INSTANCE.m2864getMinSmallItemSizeD9Ej5fM();
                                    }
                                    float m2863getMaxSmallItemSizeD9Ej5fM = i7 != 0 ? CarouselDefaults.INSTANCE.m2863getMaxSmallItemSizeD9Ej5fM() : f4;
                                    if (i9 != 0) {
                                        f8 = f5;
                                        z3 = z2;
                                        modifier3 = modifier4;
                                        paddingValues4 = PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f));
                                        f9 = m2863getMaxSmallItemSizeD9Ej5fM;
                                    } else {
                                        f9 = m2863getMaxSmallItemSizeD9Ej5fM;
                                        f10 = f6;
                                        f8 = f5;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        z3 = z2;
                                        modifier3 = modifier4;
                                        i11 = i10;
                                        paddingValues4 = paddingValues;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-221490402, i11, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:120)");
                                        }
                                        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                        Orientation orientation = Orientation.Horizontal;
                                        f11 = f10;
                                        changed = ((i11 & 112) != 32) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(carouselState2) | ((i11 & 3670016) != 1048576) | ((i11 & 29360128) == 8388608);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                            float f13 = f9;
                                            rememberedValue = new ug(density, f, carouselState2, f11, f13, 1);
                                            f12 = f11;
                                            f7 = f13;
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        } else {
                                            f12 = f11;
                                            f7 = f9;
                                        }
                                        int i15 = i11 << 9;
                                        PaddingValues paddingValues5 = paddingValues4;
                                        m2865CarouselcJHQLPU(carouselState, orientation, (my) rememberedValue, paddingValues5, 2, modifier3, f8, targetedFlingBehavior4, z3, oyVar, startRestartGroup, (i11 & 14) | 24624 | ((i11 >> 15) & 7168) | (458752 & i15) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (1879048192 & i11), 0);
                                        startRestartGroup = startRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        paddingValues3 = paddingValues5;
                                        modifier2 = modifier3;
                                        targetedFlingBehavior3 = targetedFlingBehavior4;
                                        f6 = f12;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i10 &= -57345;
                                    }
                                    carouselState2 = carouselState;
                                    modifier3 = modifier2;
                                    f8 = f5;
                                    z3 = z2;
                                    f9 = f4;
                                    paddingValues4 = paddingValues2;
                                }
                                f10 = f6;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                i11 = i10;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                Orientation orientation2 = Orientation.Horizontal;
                                f11 = f10;
                                changed = ((i11 & 112) != 32) | startRestartGroup.changed(density2) | startRestartGroup.changedInstance(carouselState2) | ((i11 & 3670016) != 1048576) | ((i11 & 29360128) == 8388608);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                float f132 = f9;
                                rememberedValue = new ug(density2, f, carouselState2, f11, f132, 1);
                                f12 = f11;
                                f7 = f132;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                int i152 = i11 << 9;
                                PaddingValues paddingValues52 = paddingValues4;
                                m2865CarouselcJHQLPU(carouselState, orientation2, (my) rememberedValue, paddingValues52, 2, modifier3, f8, targetedFlingBehavior4, z3, oyVar, startRestartGroup, (i11 & 14) | 24624 | ((i11 >> 15) & 7168) | (458752 & i152) | (i152 & 3670016) | (i152 & 29360128) | (i152 & 234881024) | (1879048192 & i11), 0);
                                startRestartGroup = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                paddingValues3 = paddingValues52;
                                modifier2 = modifier3;
                                targetedFlingBehavior3 = targetedFlingBehavior4;
                                f6 = f12;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new ng(carouselState, f, modifier2, f8, targetedFlingBehavior3, z3, f6, f7, paddingValues3, oyVar, i, i2));
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    paddingValues2 = paddingValues;
                    i10 = i3;
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 == 0) {
                }
                i8 = i2 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                paddingValues2 = paddingValues;
                i10 = i3;
                if ((i2 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f5 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 == 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            paddingValues2 = paddingValues;
            i10 = i3;
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f5 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 == 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        paddingValues2 = paddingValues;
        i10 = i3;
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bd  */
    @er
    /* renamed from: HorizontalMultiBrowseCarousel-zCIJ0Nk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2868HorizontalMultiBrowseCarouselzCIJ0Nk(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, float f3, float f4, PaddingValues paddingValues, final oy oyVar, Composer composer, final int i, final int i2) {
        CarouselState carouselState2;
        int i3;
        float f5;
        int i4;
        float f6;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        float f7;
        int i6;
        int i7;
        float f8;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        final Modifier modifier2;
        final PaddingValues paddingValues3;
        Composer composer2;
        final float f9;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final float f10;
        final float f11;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i10;
        float f12;
        PaddingValues paddingValues4;
        TargetedFlingBehavior targetedFlingBehavior4;
        float f13;
        float f14;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-118598974);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            carouselState2 = carouselState;
        } else {
            carouselState2 = carouselState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(carouselState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            f5 = f;
        } else {
            f5 = f;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(f5) ? 32 : 16;
            }
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f6 = f2;
                i3 |= startRestartGroup.changed(f6) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i12 = Fields.Clip;
                            i3 |= i12;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    f7 = f3;
                    i3 |= startRestartGroup.changed(f7) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        i7 = 196608;
                        f8 = f4;
                    } else {
                        i7 = 196608;
                        f8 = f4;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f8) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i8 = i2 & Fields.SpotShadowColor;
                    if (i8 == 0) {
                        i3 |= 12582912;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    if ((i2 & Fields.RotationX) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(oyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                float m7611constructorimpl = i4 != 0 ? Dp.m7611constructorimpl(0.0f) : f6;
                                if ((i2 & 16) != 0) {
                                    int i14 = (i9 & 14) | 384;
                                    i9 &= -57345;
                                    targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i14, 2);
                                }
                                if (i5 != 0) {
                                    f7 = CarouselDefaults.INSTANCE.m2864getMinSmallItemSizeD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    f8 = CarouselDefaults.INSTANCE.m2863getMaxSmallItemSizeD9Ej5fM();
                                }
                                if (i8 != 0) {
                                    float f15 = f7;
                                    modifier3 = modifier4;
                                    i10 = i9;
                                    f12 = f15;
                                    paddingValues4 = PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f));
                                } else {
                                    float f16 = f7;
                                    modifier3 = modifier4;
                                    i10 = i9;
                                    f12 = f16;
                                    paddingValues4 = paddingValues;
                                }
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                f13 = f8;
                                f14 = m7611constructorimpl;
                                i11 = -118598974;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i9 &= -57345;
                                }
                                paddingValues4 = paddingValues2;
                                f14 = f6;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                f13 = f8;
                                i10 = i9;
                                i11 = -118598974;
                                f12 = f7;
                                modifier3 = modifier;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i11, i10, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:165)");
                            }
                            int i15 = (i10 & 14) | i7 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10);
                            int i16 = i10 << 3;
                            m2867HorizontalMultiBrowseCarousel3tcCNu0(carouselState, f5, modifier3, f14, targetedFlingBehavior4, true, f12, f13, paddingValues4, oyVar, startRestartGroup, i15 | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier2 = modifier3;
                            f9 = f14;
                            targetedFlingBehavior3 = targetedFlingBehavior4;
                            f11 = f12;
                            f10 = f13;
                            paddingValues3 = paddingValues4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            paddingValues3 = paddingValues;
                            composer2 = startRestartGroup;
                            f9 = f6;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            f10 = f8;
                            f11 = f7;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: qg
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 HorizontalMultiBrowseCarousel_zCIJ0Nk$lambda$4;
                                    int intValue = ((Integer) obj2).intValue();
                                    HorizontalMultiBrowseCarousel_zCIJ0Nk$lambda$4 = CarouselKt.HorizontalMultiBrowseCarousel_zCIJ0Nk$lambda$4(CarouselState.this, f, modifier2, f9, targetedFlingBehavior3, f11, f10, paddingValues3, oyVar, i, i2, (Composer) obj, intValue);
                                    return HorizontalMultiBrowseCarousel_zCIJ0Nk$lambda$4;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f7 = f3;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i8 = i2 & Fields.SpotShadowColor;
                if (i8 == 0) {
                }
                if ((i2 & Fields.RotationX) == 0) {
                }
                i9 = i3;
                if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f6 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f7 = f3;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i8 = i2 & Fields.SpotShadowColor;
            if (i8 == 0) {
            }
            if ((i2 & Fields.RotationX) == 0) {
            }
            i9 = i3;
            if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f6 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f7 = f3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i8 = i2 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        if ((i2 & Fields.RotationX) == 0) {
        }
        i9 = i3;
        if (startRestartGroup.shouldExecute((i9 & 38347923) != 38347922, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeylineList HorizontalMultiBrowseCarousel_3tcCNu0$lambda$2$lambda$1(Density density, float f, CarouselState carouselState, float f2, float f3, float f4, float f5) {
        return KeylinesKt.multiBrowseKeylineList(density, f4, density.mo367toPx0680j_4(f), f5, ((Number) carouselState.getPagerState$material3().getPageCountState().getValue().invoke()).intValue(), density.mo367toPx0680j_4(f2), density.mo367toPx0680j_4(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, oy oyVar, int i, int i2, Composer composer, int i3) {
        m2867HorizontalMultiBrowseCarousel3tcCNu0(carouselState, f, modifier, f2, targetedFlingBehavior, z, f3, f4, paddingValues, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalMultiBrowseCarousel_zCIJ0Nk$lambda$4(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, float f3, float f4, PaddingValues paddingValues, oy oyVar, int i, int i2, Composer composer, int i3) {
        m2868HorizontalMultiBrowseCarouselzCIJ0Nk(carouselState, f, modifier, f2, targetedFlingBehavior, f3, f4, paddingValues, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0065  */
    @er
    /* renamed from: HorizontalUncontainedCarousel-9QcgTRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2869HorizontalUncontainedCarousel9QcgTRs(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, oy oyVar, Composer composer, int i, int i2) {
        CarouselState carouselState2;
        int i3;
        float f3;
        Modifier modifier2;
        int i4;
        float f4;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        PaddingValues paddingValues2;
        Composer composer2;
        Modifier modifier3;
        float f5;
        TargetedFlingBehavior targetedFlingBehavior3;
        PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        PaddingValues m755PaddingValues0680j_4;
        float f6;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2013916597);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            carouselState2 = carouselState;
        } else {
            carouselState2 = carouselState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(carouselState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(f3) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i6 = Fields.Clip;
                            i3 |= i6;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? Fields.RenderEffect : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(oyVar) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i7 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    f4 = Dp.m7611constructorimpl(0.0f);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    targetedFlingBehavior2 = CarouselDefaults.INSTANCE.noSnapFlingBehavior(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    modifier4 = modifier5;
                                    m755PaddingValues0680j_4 = PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f));
                                    f6 = f4;
                                    TargetedFlingBehavior targetedFlingBehavior4 = targetedFlingBehavior2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2013916597, i3, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:256)");
                                    }
                                    int i8 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                                    int i9 = i3 << 3;
                                    composer2 = startRestartGroup;
                                    m2870HorizontalUncontainedCarouselVUP9l70(carouselState2, f3, modifier4, f6, targetedFlingBehavior4, true, m755PaddingValues0680j_4, oyVar, composer2, i8 | (3670016 & i9) | (i9 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    f5 = f6;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    paddingValues3 = m755PaddingValues0680j_4;
                                } else {
                                    modifier4 = modifier5;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                modifier4 = modifier2;
                            }
                            f6 = f4;
                            m755PaddingValues0680j_4 = paddingValues2;
                            TargetedFlingBehavior targetedFlingBehavior42 = targetedFlingBehavior2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i82 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                            int i92 = i3 << 3;
                            composer2 = startRestartGroup;
                            m2870HorizontalUncontainedCarouselVUP9l70(carouselState2, f3, modifier4, f6, targetedFlingBehavior42, true, m755PaddingValues0680j_4, oyVar, composer2, i82 | (3670016 & i92) | (i92 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            f5 = f6;
                            targetedFlingBehavior3 = targetedFlingBehavior42;
                            paddingValues3 = m755PaddingValues0680j_4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            f5 = f4;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            paddingValues3 = paddingValues2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new rg(carouselState, f, modifier3, f5, targetedFlingBehavior3, paddingValues3, oyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f4 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b8  */
    /* renamed from: HorizontalUncontainedCarousel-VUP9l70, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2870HorizontalUncontainedCarouselVUP9l70(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, PaddingValues paddingValues, final oy oyVar, Composer composer, final int i, final int i2) {
        CarouselState carouselState2;
        int i3;
        Modifier modifier2;
        int i4;
        float f3;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        boolean z2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        Composer composer2;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        final float f4;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        TargetedFlingBehavior targetedFlingBehavior4;
        int i8;
        float f5;
        boolean z4;
        boolean z5;
        PaddingValues paddingValues4;
        TargetedFlingBehavior targetedFlingBehavior5;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(534621863);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            carouselState2 = carouselState;
        } else {
            carouselState2 = carouselState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(carouselState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i9 = Fields.Clip;
                            i3 |= i9;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues2) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(oyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        i7 = i3;
                        int i11 = 1;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                float m7611constructorimpl = i4 != 0 ? Dp.m7611constructorimpl(0.0f) : f3;
                                if ((i2 & 16) != 0) {
                                    targetedFlingBehavior4 = CarouselDefaults.INSTANCE.noSnapFlingBehavior(startRestartGroup, 6);
                                    i8 = i7 & (-57345);
                                } else {
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    i8 = i7;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if (i6 != 0) {
                                    f5 = m7611constructorimpl;
                                    z4 = z2;
                                    paddingValues4 = PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f));
                                    z5 = false;
                                } else {
                                    f5 = m7611constructorimpl;
                                    z4 = z2;
                                    z5 = false;
                                    paddingValues4 = paddingValues2;
                                }
                                targetedFlingBehavior5 = targetedFlingBehavior4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    int i12 = i7 & (-57345);
                                    TargetedFlingBehavior targetedFlingBehavior6 = targetedFlingBehavior2;
                                    i8 = i12;
                                    z5 = false;
                                    targetedFlingBehavior5 = targetedFlingBehavior6;
                                    f5 = f3;
                                    z4 = z2;
                                    paddingValues4 = paddingValues2;
                                } else {
                                    z4 = z2;
                                    z5 = false;
                                    paddingValues4 = paddingValues2;
                                    targetedFlingBehavior5 = targetedFlingBehavior2;
                                    i8 = i7;
                                    f5 = f3;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(534621863, i8, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:217)");
                            }
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            int i13 = i8;
                            Orientation orientation = Orientation.Horizontal;
                            boolean changed = startRestartGroup.changed(density);
                            if ((i13 & 112) == 32) {
                                z5 = true;
                            }
                            boolean z6 = z5 | changed;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new bf(f, i11, density);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            int i14 = i13 << 9;
                            composer2 = startRestartGroup;
                            Modifier modifier4 = modifier2;
                            m2865CarouselcJHQLPU(carouselState2, orientation, (my) rememberedValue, paddingValues4, 0, modifier4, f5, targetedFlingBehavior5, z4, oyVar, composer2, (i13 & 14) | 24624 | ((i13 >> 9) & 7168) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024) | ((i13 << 6) & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues3 = paddingValues4;
                            modifier3 = modifier4;
                            f4 = f5;
                            targetedFlingBehavior3 = targetedFlingBehavior5;
                            z3 = z4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            paddingValues3 = paddingValues2;
                            modifier3 = modifier2;
                            f4 = f3;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            z3 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: sg
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 HorizontalUncontainedCarousel_VUP9l70$lambda$8;
                                    int intValue = ((Integer) obj2).intValue();
                                    HorizontalUncontainedCarousel_VUP9l70$lambda$8 = CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$8(CarouselState.this, f, modifier3, f4, targetedFlingBehavior3, z3, paddingValues3, oyVar, i, i2, (Composer) obj, intValue);
                                    return HorizontalUncontainedCarousel_VUP9l70$lambda$8;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i3;
                    int i112 = 1;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                i7 = i3;
                int i1122 = 1;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            i7 = i3;
            int i11222 = 1;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        i7 = i3;
        int i112222 = 1;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalUncontainedCarousel_9QcgTRs$lambda$9(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, oy oyVar, int i, int i2, Composer composer, int i3) {
        m2869HorizontalUncontainedCarousel9QcgTRs(carouselState, f, modifier, f2, targetedFlingBehavior, paddingValues, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeylineList HorizontalUncontainedCarousel_VUP9l70$lambda$7$lambda$6(Density density, float f, float f2, float f3) {
        return KeylinesKt.uncontainedKeylineList(density, f2, density.mo367toPx0680j_4(f), f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalUncontainedCarousel_VUP9l70$lambda$8(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, PaddingValues paddingValues, oy oyVar, int i, int i2, Composer composer, int i3) {
        m2870HorizontalUncontainedCarouselVUP9l70(carouselState, f, modifier, f2, targetedFlingBehavior, z, paddingValues, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final float calculateAfterContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        float calculateEndPadding;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018496720, i, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:488)");
        }
        if (orientation == Orientation.Vertical) {
            composer.startReplaceGroup(-1907991582);
            composer.endReplaceGroup();
            calculateEndPadding = paddingValues.mo711calculateBottomPaddingD9Ej5fM();
        } else {
            composer.startReplaceGroup(-1907937239);
            calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
            composer.endReplaceGroup();
        }
        float mo367toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(calculateEndPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mo367toPx0680j_4;
    }

    private static final float calculateBeforeContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        float calculateStartPadding;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896839347, i, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:476)");
        }
        if (orientation == Orientation.Vertical) {
            composer.startReplaceGroup(-143556958);
            composer.endReplaceGroup();
            calculateStartPadding = paddingValues.mo714calculateTopPaddingD9Ej5fM();
        } else {
            composer.startReplaceGroup(-143505436);
            calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
            composer.endReplaceGroup();
        }
        float mo367toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(calculateStartPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mo367toPx0680j_4;
    }

    public static final float calculateCurrentScrollOffset(CarouselState carouselState, Strategy strategy) {
        float itemSpacing = strategy.getItemSpacing() + strategy.getItemMainAxisSize();
        return ((carouselState.getPagerState$material3().getCurrentPageOffsetFraction() * itemSpacing) + (carouselState.getPagerState$material3().getCurrentPage() * itemSpacing)) - KeylineSnapPositionKt.getSnapPositionOffset(strategy, carouselState.getPagerState$material3().getCurrentPage(), carouselState.getPagerState$material3().getPageCount());
    }

    public static final float calculateMaxScrollOffset(CarouselState carouselState, Strategy strategy) {
        float pageCount = carouselState.getPagerState$material3().getPageCount();
        float itemSpacing = (((pageCount - 1.0f) * strategy.getItemSpacing()) + (strategy.getItemMainAxisSize() * pageCount)) - strategy.getAvailableSpace();
        if (itemSpacing < 0.0f) {
            return 0.0f;
        }
        return itemSpacing;
    }

    public static final Modifier carouselItem(Modifier modifier, final int i, final CarouselState carouselState, final iy iyVar, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape) {
        return LayoutModifierKt.layout(modifier, new ny() { // from class: tg
            @Override // defpackage.ny
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult carouselItem$lambda$26;
                carouselItem$lambda$26 = CarouselKt.carouselItem$lambda$26(iy.this, carouselState, i, carouselItemDrawInfoImpl, shape, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return carouselItem$lambda$26;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult carouselItem$lambda$26(iy iyVar, final CarouselState carouselState, final int i, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Strategy strategy = (Strategy) iyVar.invoke();
        if (!strategy.isValid()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new ed(13), 4, null);
        }
        final boolean z = carouselState.getPagerState$material3().getLayoutInfo().getOrientation() == Orientation.Vertical;
        final boolean z2 = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
        float itemMainAxisSize = strategy.getItemMainAxisSize();
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(z ? Constraints.m7553copyZbe2FdA(constraints.m7570unboximpl(), Constraints.m7566getMinWidthimpl(constraints.m7570unboximpl()), Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl()), y80.P(itemMainAxisSize), y80.P(itemMainAxisSize)) : Constraints.m7553copyZbe2FdA(constraints.m7570unboximpl(), y80.P(itemMainAxisSize), y80.P(itemMainAxisSize), Constraints.m7565getMinHeightimpl(constraints.m7570unboximpl()), Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl())));
        final float f = i != carouselState.getPagerState$material3().getCurrentPage() ? i == 0 ? 0.0f : 1.0f / i : 1.0f;
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new ky() { // from class: vg
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 carouselItem$lambda$26$lambda$25;
                carouselItem$lambda$26$lambda$25 = CarouselKt.carouselItem$lambda$26$lambda$25(Placeable.this, f, carouselState, strategy, i, z, carouselItemDrawInfoImpl, shape, z2, (Placeable.PlacementScope) obj);
                return carouselItem$lambda$26$lambda$25;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 carouselItem$lambda$26$lambda$22(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 carouselItem$lambda$26$lambda$25(Placeable placeable, float f, final CarouselState carouselState, final Strategy strategy, final int i, final boolean z, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape, final boolean z2, Placeable.PlacementScope placementScope) {
        placementScope.placeWithLayer(placeable, 0, 0, f, new ky() { // from class: mg
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 carouselItem$lambda$26$lambda$25$lambda$24;
                carouselItem$lambda$26$lambda$25$lambda$24 = CarouselKt.carouselItem$lambda$26$lambda$25$lambda$24(CarouselState.this, strategy, i, z, carouselItemDrawInfoImpl, shape, z2, (GraphicsLayerScope) obj);
                return carouselItem$lambda$26$lambda$25$lambda$24;
            }
        });
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 carouselItem$lambda$26$lambda$25$lambda$24(CarouselState carouselState, Strategy strategy, int i, boolean z, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        float calculateCurrentScrollOffset = calculateCurrentScrollOffset(carouselState, strategy);
        float calculateMaxScrollOffset = calculateMaxScrollOffset(carouselState, strategy);
        KeylineList keylineListForScrollOffset$material3$default = Strategy.getKeylineListForScrollOffset$material3$default(strategy, calculateCurrentScrollOffset, calculateMaxScrollOffset, false, 4, null);
        KeylineList keylineListForScrollOffset$material3 = strategy.getKeylineListForScrollOffset$material3(calculateCurrentScrollOffset, calculateMaxScrollOffset, true);
        float itemMainAxisSize = ((strategy.getItemMainAxisSize() / 2.0f) + (i * (strategy.getItemSpacing() + strategy.getItemMainAxisSize()))) - calculateCurrentScrollOffset;
        Keyline keylineBefore = keylineListForScrollOffset$material3$default.getKeylineBefore(itemMainAxisSize);
        Keyline keylineAfter = keylineListForScrollOffset$material3$default.getKeylineAfter(itemMainAxisSize);
        Keyline lerp = KeylineListKt.lerp(keylineBefore, keylineAfter, getProgress(keylineBefore, keylineAfter, itemMainAxisSize));
        boolean b = q10.b(keylineBefore, keylineAfter);
        float intBitsToFloat = (z ? Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L)) : strategy.getItemMainAxisSize()) / 2.0f;
        float itemMainAxisSize2 = (z ? strategy.getItemMainAxisSize() : Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L))) / 2.0f;
        float intBitsToFloat2 = (z ? Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() >> 32)) : lerp.getSize()) / 2.0f;
        float size = (z ? lerp.getSize() : Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L))) / 2.0f;
        Rect rect = new Rect(intBitsToFloat - intBitsToFloat2, itemMainAxisSize2 - size, intBitsToFloat + intBitsToFloat2, itemMainAxisSize2 + size);
        carouselItemDrawInfoImpl.setSizeState(lerp.getSize());
        Iterator<Keyline> it = keylineListForScrollOffset$material3.iterator();
        if (!it.hasNext()) {
            o.q();
            return null;
        }
        Keyline next = it.next();
        if (it.hasNext()) {
            float size2 = next.getSize();
            do {
                Keyline next2 = it.next();
                float size3 = next2.getSize();
                if (Float.compare(size2, size3) > 0) {
                    next = next2;
                    size2 = size3;
                }
            } while (it.hasNext());
        }
        carouselItemDrawInfoImpl.setMinSizeState(next.getSize());
        carouselItemDrawInfoImpl.setMaxSizeState(keylineListForScrollOffset$material3.getFirstFocal().getSize());
        carouselItemDrawInfoImpl.setMaskRectState(rect);
        graphicsLayerScope.setClip(!rect.equals(new Rect(0.0f, 0.0f, Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L)))));
        graphicsLayerScope.setShape(shape);
        float offset = lerp.getOffset() - itemMainAxisSize;
        if (b) {
            offset += (itemMainAxisSize - lerp.getUnadjustedOffset()) / lerp.getSize();
        }
        if (z) {
            graphicsLayerScope.setTranslationY(offset);
        } else {
            if (z2) {
                offset = -offset;
            }
            graphicsLayerScope.setTranslationX(offset);
        }
        return w01.a;
    }

    /* renamed from: drawDebugLines-1Yev-eo, reason: not valid java name */
    private static final Modifier m2871drawDebugLines1Yeveo(Modifier modifier, final CarouselState carouselState, final CarouselPageSize carouselPageSize, final long j, final float f) {
        return DrawModifierKt.drawWithContent(modifier, new ky() { // from class: og
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 drawDebugLines_1Yev_eo$lambda$28;
                drawDebugLines_1Yev_eo$lambda$28 = CarouselKt.drawDebugLines_1Yev_eo$lambda$28(CarouselPageSize.this, carouselState, f, j, (ContentDrawScope) obj);
                return drawDebugLines_1Yev_eo$lambda$28;
            }
        });
    }

    /* renamed from: drawDebugLines-1Yev-eo$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2872drawDebugLines1Yeveo$default(Modifier modifier, CarouselState carouselState, CarouselPageSize carouselPageSize, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            j = Color.Companion.m4794getMagenta0d7_KjU();
        }
        long j2 = j;
        if ((i & 8) != 0) {
            f = Dp.m7611constructorimpl(4.0f);
        }
        return m2871drawDebugLines1Yeveo(modifier, carouselState, carouselPageSize, j2, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawDebugLines_1Yev_eo$lambda$28(CarouselPageSize carouselPageSize, CarouselState carouselState, float f, long j, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        Strategy strategy = carouselPageSize.getStrategy();
        KeylineList keylineListForScrollOffset$material3$default = Strategy.getKeylineListForScrollOffset$material3$default(strategy, calculateCurrentScrollOffset(carouselState, strategy), calculateMaxScrollOffset(carouselState, strategy), false, 4, null);
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float mo367toPx0680j_4 = contentDrawScope2.mo367toPx0680j_4(f);
        for (Keyline keyline : keylineListForScrollOffset$material3$default) {
            DrawScope.m5321drawLineNGM6Ib0$default(contentDrawScope2, j, Offset.m4508constructorimpl((Float.floatToRawIntBits(keyline.getOffset()) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(keyline.getOffset()) << 32) | (4294967295L & Float.floatToRawIntBits(100.0f))), mo367toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
            contentDrawScope2 = contentDrawScope;
        }
        return w01.a;
    }

    private static final float getProgress(Keyline keyline, Keyline keyline2, float f) {
        if (q10.b(keyline, keyline2)) {
            return 1.0f;
        }
        return (f - keyline.getUnadjustedOffset()) / (keyline2.getUnadjustedOffset() - keyline.getUnadjustedOffset());
    }
}
