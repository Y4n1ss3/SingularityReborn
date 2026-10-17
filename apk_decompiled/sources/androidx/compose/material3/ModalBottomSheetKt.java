package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.af;
import defpackage.dq;
import defpackage.er;
import defpackage.g5;
import defpackage.g7;
import defpackage.h90;
import defpackage.hz;
import defpackage.iy;
import defpackage.k90;
import defpackage.ky;
import defpackage.l90;
import defpackage.m90;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.p9;
import defpackage.st;
import defpackage.ud;
import defpackage.un;
import defpackage.uq;
import defpackage.w01;
import defpackage.w5;
import defpackage.wd;
import defpackage.xe0;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float PredictiveBackMaxScaleXDistance = Dp.m7611constructorimpl(48.0f);
    private static final float PredictiveBackMaxScaleYDistance = Dp.m7611constructorimpl(24.0f);
    private static final long PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /* renamed from: ModalBottomSheet-YbuCTN8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2145ModalBottomSheetYbuCTN8(final iy iyVar, Modifier modifier, SheetState sheetState, float f, boolean z, Shape shape, long j, long j2, float f2, long j3, my myVar, my myVar2, ModalBottomSheetProperties modalBottomSheetProperties, final ny nyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        SheetState sheetState2;
        int i5;
        float f3;
        int i6;
        boolean z2;
        Shape shape2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final long j4;
        final my myVar3;
        final ModalBottomSheetProperties modalBottomSheetProperties2;
        final float f4;
        final boolean z3;
        final Modifier modifier3;
        final SheetState sheetState3;
        final Shape shape3;
        final long j5;
        final float f5;
        final long j6;
        final my myVar4;
        ScopeUpdateScope endRestartGroup;
        long j7;
        long j8;
        long j9;
        my myVar5;
        float f6;
        ModalBottomSheetProperties modalBottomSheetProperties3;
        my myVar6;
        long j10;
        float f7;
        boolean z4;
        Modifier modifier4;
        Shape shape4;
        my myVar7;
        long j11;
        long j12;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1904798512);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetState2 = sheetState;
                    if (startRestartGroup.changed(sheetState2)) {
                        i15 = Fields.RotationX;
                        i4 |= i15;
                    }
                } else {
                    sheetState2 = sheetState;
                }
                i15 = Fields.SpotShadowColor;
                i4 |= i15;
            } else {
                sheetState2 = sheetState;
            }
            i5 = i3 & 8;
            int i17 = Fields.RotationZ;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f;
                i4 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z2 = z;
                    i4 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                    if ((i & 196608) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? Fields.RenderEffect : 65536;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) != 0) {
                        i7 = i4 | (((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.IsNodeFlag : 4194304);
                    } else {
                        i7 = i4;
                    }
                    i8 = i3 & Fields.RotationX;
                    if (i8 == 0) {
                        i7 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i7 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((i & 805306368) == 0) {
                        i7 |= ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(j3)) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i9 = i3 & Fields.RotationZ;
                    if (i9 == 0) {
                        i11 = i2 | 6;
                        i10 = i9;
                    } else if ((i2 & 6) == 0) {
                        i10 = i9;
                        i11 = i2 | (startRestartGroup.changedInstance(myVar) ? 4 : 2);
                    } else {
                        i10 = i9;
                        i11 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if ((i3 & Fields.CameraDistance) == 0 && startRestartGroup.changedInstance(myVar2)) {
                            i14 = 32;
                            i11 |= i14;
                        }
                        i14 = 16;
                        i11 |= i14;
                    }
                    int i18 = i11;
                    i12 = i3 & Fields.TransformOrigin;
                    if (i12 == 0) {
                        i13 = i18 | 384;
                    } else {
                        int i19 = i18;
                        if ((i2 & 384) == 0) {
                            i19 |= startRestartGroup.changed(modalBottomSheetProperties) ? Fields.RotationX : Fields.SpotShadowColor;
                        }
                        i13 = i19;
                    }
                    if ((i3 & 8192) == 0) {
                        i13 |= 3072;
                    } else if ((i2 & 3072) == 0) {
                        if (startRestartGroup.changedInstance(nyVar)) {
                            i17 = 2048;
                        }
                        i13 |= i17;
                        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i13 & 1171) != 1170, i7 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i16 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                int i20 = 3;
                                if ((i3 & 4) != 0) {
                                    i7 &= -897;
                                    sheetState2 = rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                }
                                float m1644getSheetMaxWidthD9Ej5fM = i5 != 0 ? BottomSheetDefaults.INSTANCE.m1644getSheetMaxWidthD9Ej5fM() : f3;
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    i7 &= -458753;
                                    shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                }
                                if ((i3 & 64) != 0) {
                                    i7 &= -3670017;
                                    j7 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                } else {
                                    j7 = j;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    j8 = ColorSchemeKt.m1797contentColorForek8zF_U(j7, startRestartGroup, (i7 >> 18) & 14);
                                    i7 &= -29360129;
                                } else {
                                    j8 = j2;
                                }
                                float m7611constructorimpl = i8 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                                if ((i3 & Fields.RotationY) != 0) {
                                    j9 = BottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    i7 &= -1879048193;
                                } else {
                                    j9 = j3;
                                }
                                my lambda$1121996006$material3 = i10 != 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.getLambda$1121996006$material3() : myVar;
                                if ((i3 & Fields.CameraDistance) != 0) {
                                    myVar5 = new my() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$1
                                        public final WindowInsets invoke(Composer composer3, int i21) {
                                            composer3.startReplaceGroup(-511854661);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-511854661, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:134)");
                                            }
                                            WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer3.endReplaceGroup();
                                            return windowInsets;
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            return invoke((Composer) obj, ((Number) obj2).intValue());
                                        }
                                    };
                                    i13 &= -113;
                                } else {
                                    myVar5 = myVar2;
                                }
                                int i21 = i13;
                                if (i12 != 0) {
                                    boolean z5 = false;
                                    f6 = m1644getSheetMaxWidthD9Ej5fM;
                                    modalBottomSheetProperties3 = new ModalBottomSheetProperties(z5, z5, i20, (dq) null);
                                    myVar6 = myVar5;
                                    j10 = j7;
                                    f7 = m7611constructorimpl;
                                    z4 = z2;
                                    modifier4 = modifier2;
                                    shape4 = shape2;
                                    myVar7 = lambda$1121996006$material3;
                                    j11 = j8;
                                    j12 = j9;
                                    i13 = i21;
                                } else {
                                    f6 = m1644getSheetMaxWidthD9Ej5fM;
                                    modalBottomSheetProperties3 = modalBottomSheetProperties;
                                    myVar6 = myVar5;
                                    j10 = j7;
                                    f7 = m7611constructorimpl;
                                    z4 = z2;
                                    modifier4 = modifier2;
                                    shape4 = shape2;
                                    myVar7 = lambda$1121996006$material3;
                                    j11 = j8;
                                    j12 = j9;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i3 & 32) != 0) {
                                    i7 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i7 &= -29360129;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    i7 &= -1879048193;
                                }
                                if ((i3 & Fields.CameraDistance) != 0) {
                                    i13 &= -113;
                                }
                                j10 = j;
                                j11 = j2;
                                f7 = f2;
                                j12 = j3;
                                myVar7 = myVar;
                                myVar6 = myVar2;
                                modalBottomSheetProperties3 = modalBottomSheetProperties;
                                f6 = f3;
                                z4 = z2;
                                modifier4 = modifier2;
                                shape4 = shape2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1904798512, i7, i13, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                            }
                            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
                            FiniteAnimationSpec value = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                            FiniteAnimationSpec value2 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                            FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                            int i22 = (i7 & 896) ^ 384;
                            boolean changedInstance = ((i22 > 256 && startRestartGroup.changed(sheetState2)) || (i7 & 384) == 256) | startRestartGroup.changedInstance(value2) | startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new af(sheetState2, value2, value3, value, 1);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            EffectsKt.SideEffect((iy) rememberedValue, startRestartGroup, 0);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            un unVar = (un) rememberedValue2;
                            int i23 = i7 & 14;
                            boolean changedInstance2 = ((i22 > 256 && startRestartGroup.changed(sheetState2)) || (i7 & 384) == 256) | startRestartGroup.changedInstance(unVar) | (i23 == 4);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = new p9(sheetState2, unVar, iyVar);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            iy iyVar2 = (iy) rememberedValue3;
                            boolean changedInstance3 = startRestartGroup.changedInstance(unVar) | ((i22 > 256 && startRestartGroup.changed(sheetState2)) || (i7 & 384) == 256) | (i23 == 4);
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changedInstance3 || rememberedValue4 == companion.getEmpty()) {
                                rememberedValue4 = new defpackage.f1(unVar, sheetState2, iyVar, 15);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            ky kyVar = (ky) rememberedValue4;
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == companion.getEmpty()) {
                                rememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            Animatable animatable = (Animatable) rememberedValue5;
                            boolean changedInstance4 = (i23 == 4) | ((i22 > 256 && startRestartGroup.changed(sheetState2)) || (i7 & 384) == 256) | startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(animatable);
                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changedInstance4 || rememberedValue6 == companion.getEmpty()) {
                                rememberedValue6 = new ud(sheetState2, unVar, animatable, iyVar);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            boolean z6 = true;
                            ModalBottomSheet_androidKt.m2151ModalBottomSheetDialogsW7UJKQ((iy) rememberedValue6, j11, modalBottomSheetProperties3, animatable, ComposableLambdaKt.rememberComposableLambda(1010026864, true, new ModalBottomSheetKt$ModalBottomSheet$4(j12, iyVar2, sheetState2, modalBottomSheetProperties3, animatable, unVar, kyVar, modifier4, f6, z4, shape4, j10, j11, f7, myVar7, myVar6, nyVar), startRestartGroup, 54), startRestartGroup, (i13 & 896) | ((i7 >> 18) & 112) | 24576 | (Animatable.$stable << 9));
                            composer2 = startRestartGroup;
                            if (sheetState2.getHasExpandedState()) {
                                composer2.startReplaceGroup(748459762);
                                if ((i22 <= 256 || !composer2.changed(sheetState2)) && (i7 & 384) != 256) {
                                    z6 = false;
                                }
                                Object rememberedValue7 = composer2.rememberedValue();
                                if (z6 || rememberedValue7 == companion.getEmpty()) {
                                    rememberedValue7 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState2, null);
                                    composer2.updateRememberedValue(rememberedValue7);
                                }
                                EffectsKt.LaunchedEffect(sheetState2, (my) rememberedValue7, composer2, (i7 >> 6) & 14);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(748521266);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            sheetState3 = sheetState2;
                            j6 = j12;
                            modalBottomSheetProperties2 = modalBottomSheetProperties3;
                            modifier3 = modifier4;
                            f4 = f6;
                            z3 = z4;
                            shape3 = shape4;
                            j4 = j10;
                            j5 = j11;
                            f5 = f7;
                            myVar4 = myVar7;
                            myVar3 = myVar6;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            j4 = j;
                            myVar3 = myVar2;
                            modalBottomSheetProperties2 = modalBottomSheetProperties;
                            f4 = f3;
                            z3 = z2;
                            modifier3 = modifier2;
                            sheetState3 = sheetState2;
                            shape3 = shape2;
                            j5 = j2;
                            f5 = f2;
                            j6 = j3;
                            myVar4 = myVar;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: i90
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 ModalBottomSheet_YbuCTN8$lambda$13;
                                    int intValue = ((Integer) obj2).intValue();
                                    ModalBottomSheet_YbuCTN8$lambda$13 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$13(iy.this, modifier3, sheetState3, f4, z3, shape3, j4, j5, f5, j6, myVar4, myVar3, modalBottomSheetProperties2, nyVar, i, i2, i3, (Composer) obj, intValue);
                                    return ModalBottomSheet_YbuCTN8$lambda$13;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i13 & 1171) != 1170, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                if ((i & 196608) != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i8 = i3 & Fields.RotationX;
                if (i8 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i9 = i3 & Fields.RotationZ;
                if (i9 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i182 = i11;
                i12 = i3 & Fields.TransformOrigin;
                if (i12 == 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i13 & 1171) != 1170, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z2 = z;
            if ((i & 196608) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i8 = i3 & Fields.RotationX;
            if (i8 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i9 = i3 & Fields.RotationZ;
            if (i9 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i1822 = i11;
            i12 = i3 & Fields.TransformOrigin;
            if (i12 == 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i13 & 1171) != 1170, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        int i172 = Fields.RotationZ;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i & 196608) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i3 & Fields.RotationX;
        if (i8 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i9 = i3 & Fields.RotationZ;
        if (i9 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i18222 = i11;
        i12 = i3 & Fields.TransformOrigin;
        if (i12 == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i13 & 1171) != 1170, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    @er
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2146ModalBottomSheetdYc4hso(iy iyVar, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, my myVar, my myVar2, ModalBottomSheetProperties modalBottomSheetProperties, ny nyVar, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        SheetState sheetState2;
        int i5;
        Shape shape2;
        long j4;
        long j5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        float f3;
        ModalBottomSheetProperties modalBottomSheetProperties2;
        Shape shape3;
        long j6;
        SheetState sheetState3;
        long j7;
        float f4;
        long j8;
        my myVar3;
        my myVar4;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j9;
        my myVar5;
        my myVar6;
        Shape shape5;
        Modifier modifier3;
        float f5;
        float f6;
        SheetState sheetState4;
        long j10;
        my myVar7;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(953901324);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetState2 = sheetState;
                    if (startRestartGroup.changed(sheetState2)) {
                        i15 = Fields.RotationX;
                        i4 |= i15;
                    }
                } else {
                    sheetState2 = sheetState;
                }
                i15 = Fields.SpotShadowColor;
                i4 |= i15;
            } else {
                sheetState2 = sheetState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i14 = Fields.Clip;
                            i4 |= i14;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i14 = 8192;
                    i4 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((i & 196608) == 0) {
                    j4 = j;
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j4)) ? Fields.RenderEffect : 65536;
                } else {
                    j4 = j;
                }
                if ((i & 1572864) == 0) {
                    j5 = j2;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j5)) ? 1048576 : Fields.BlendMode;
                } else {
                    j5 = j2;
                }
                i6 = i3 & Fields.SpotShadowColor;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i4 |= ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(j3)) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                i7 = i3 & Fields.RotationY;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        if ((i3 & Fields.RotationZ) == 0 && startRestartGroup.changedInstance(myVar2)) {
                            i13 = 4;
                            i9 = i2 | i13;
                        }
                        i13 = 2;
                        i9 = i2 | i13;
                    } else {
                        i9 = i2;
                    }
                    i10 = i3 & Fields.CameraDistance;
                    if (i10 == 0) {
                        i9 |= 48;
                        i11 = i10;
                    } else if ((i2 & 48) == 0) {
                        i11 = i10;
                        i9 |= startRestartGroup.changed(modalBottomSheetProperties) ? 32 : 16;
                    } else {
                        i11 = i10;
                    }
                    i12 = i9;
                    if ((i3 & Fields.TransformOrigin) == 0) {
                        i12 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i12 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i16 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    sheetState2 = rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                }
                                float m1644getSheetMaxWidthD9Ej5fM = i5 != 0 ? BottomSheetDefaults.INSTANCE.m1644getSheetMaxWidthD9Ej5fM() : f;
                                if ((i3 & 16) != 0) {
                                    shape4 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                    i4 &= -57345;
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i3 & 32) != 0) {
                                    j4 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ColorSchemeKt.m1797contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                float m7611constructorimpl = i6 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                                if ((i3 & Fields.RotationX) != 0) {
                                    j9 = BottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    i4 &= -234881025;
                                } else {
                                    j9 = j3;
                                }
                                my m1834getLambda$655173438$material3 = i8 != 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.m1834getLambda$655173438$material3() : myVar;
                                if ((i3 & Fields.RotationZ) != 0) {
                                    myVar5 = new my() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$7
                                        public final WindowInsets invoke(Composer composer3, int i17) {
                                            composer3.startReplaceGroup(69134487);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(69134487, i17, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:233)");
                                            }
                                            WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer3.endReplaceGroup();
                                            return windowInsets;
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            return invoke((Composer) obj, ((Number) obj2).intValue());
                                        }
                                    };
                                    i12 &= -15;
                                } else {
                                    myVar5 = myVar2;
                                }
                                modalBottomSheetProperties2 = i11 != 0 ? ModalBottomSheetDefaults.INSTANCE.getProperties() : modalBottomSheetProperties;
                                myVar6 = myVar5;
                                shape5 = shape4;
                                modifier3 = modifier2;
                                my myVar8 = m1834getLambda$655173438$material3;
                                f5 = m1644getSheetMaxWidthD9Ej5fM;
                                long j11 = j5;
                                f6 = m7611constructorimpl;
                                sheetState4 = sheetState2;
                                j10 = j11;
                                j8 = j9;
                                myVar7 = myVar8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & Fields.RotationX) != 0) {
                                    i4 &= -234881025;
                                }
                                if ((i3 & Fields.RotationZ) != 0) {
                                    i12 &= -15;
                                }
                                myVar7 = myVar;
                                myVar6 = myVar2;
                                modalBottomSheetProperties2 = modalBottomSheetProperties;
                                shape5 = shape2;
                                modifier3 = modifier2;
                                sheetState4 = sheetState2;
                                j10 = j5;
                                f5 = f;
                                f6 = f2;
                                j8 = j3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(953901324, i4, i12, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                            }
                            int i17 = i4 << 3;
                            int i18 = i12 << 3;
                            composer2 = startRestartGroup;
                            m2145ModalBottomSheetYbuCTN8(iyVar, modifier3, sheetState4, f5, true, shape5, j4, j10, f6, j8, myVar7, myVar6, modalBottomSheetProperties2, nyVar, composer2, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192), ((i4 >> 27) & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j12 = j10;
                            modifier2 = modifier3;
                            shape3 = shape5;
                            j7 = j12;
                            sheetState3 = sheetState4;
                            f3 = f5;
                            j6 = j4;
                            f4 = f6;
                            myVar3 = myVar7;
                            myVar4 = myVar6;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            f3 = f;
                            modalBottomSheetProperties2 = modalBottomSheetProperties;
                            shape3 = shape2;
                            j6 = j4;
                            sheetState3 = sheetState2;
                            j7 = j5;
                            f4 = f2;
                            j8 = j3;
                            myVar3 = myVar;
                            myVar4 = myVar2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new k90(iyVar, modifier2, sheetState3, f3, shape3, j6, j7, f4, j8, myVar3, myVar4, modalBottomSheetProperties2, nyVar, i, i2, i3, 0));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                if ((i2 & 6) != 0) {
                }
                i10 = i3 & Fields.CameraDistance;
                if (i10 == 0) {
                }
                i12 = i9;
                if ((i3 & Fields.TransformOrigin) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 24576) == 0) {
            }
            if ((i & 196608) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & Fields.SpotShadowColor;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & Fields.RotationY;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            i10 = i3 & Fields.CameraDistance;
            if (i10 == 0) {
            }
            i12 = i9;
            if ((i3 & Fields.TransformOrigin) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & 196608) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & Fields.SpotShadowColor;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & Fields.RotationY;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        i10 = i3 & Fields.CameraDistance;
        if (i10 == 0) {
        }
        i12 = i9;
        if ((i3 & Fields.TransformOrigin) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0219  */
    /* renamed from: ModalBottomSheetContent-7---e2Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2147ModalBottomSheetContent7e2Q(final BoxScope boxScope, final Animatable<Float, AnimationVector1D> animatable, final un unVar, final iy iyVar, final ky kyVar, Modifier modifier, SheetState sheetState, float f, boolean z, Shape shape, long j, long j2, float f2, my myVar, my myVar2, final ny nyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        un unVar2;
        int i5;
        int i6;
        Modifier modifier2;
        SheetState sheetState2;
        int i7;
        float f3;
        int i8;
        int i9;
        int i10;
        long j3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final boolean z2;
        final long j4;
        final my myVar3;
        final float f4;
        final SheetState sheetState3;
        final Modifier modifier3;
        Composer composer2;
        final Shape shape2;
        final long j5;
        final float f5;
        final my myVar4;
        ScopeUpdateScope endRestartGroup;
        int i16;
        boolean z3;
        Shape shape3;
        long j6;
        long j7;
        float m1642getElevationD9Ej5fM;
        my lambda$1716959002$material3;
        int i17;
        Modifier modifier4;
        float f6;
        int i18;
        long j8;
        Shape shape4;
        my myVar5;
        Shape shape5;
        int i19;
        float f7;
        Modifier modifier5;
        long j9;
        boolean z4;
        Object rememberedValue;
        boolean z5;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        int offset$material3;
        boolean z6;
        Object rememberedValue4;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(-37400432);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            unVar2 = unVar;
            i4 |= startRestartGroup.changedInstance(unVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 4;
            int i22 = Fields.CameraDistance;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(iyVar) ? 2048 : 1024;
                int i23 = 8192;
                if ((i3 & 8) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(kyVar) ? Fields.Clip : 8192;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 196608;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    sheetState2 = sheetState;
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(sheetState2)) ? 1048576 : Fields.BlendMode;
                } else {
                    sheetState2 = sheetState;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 12582912;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                }
                i8 = i3 & Fields.SpotShadowColor;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(z) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(shape)) {
                        i21 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i21;
                    }
                    i21 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i21;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & Fields.RotationY) == 0) {
                        i9 = i4;
                        if (startRestartGroup.changed(j)) {
                            i20 = 4;
                            i10 = i2 | i20;
                        }
                    } else {
                        i9 = i4;
                    }
                    i20 = 2;
                    i10 = i2 | i20;
                } else {
                    i9 = i4;
                    i10 = i2;
                }
                if ((i2 & 48) == 0) {
                    i11 = i9;
                    j3 = j2;
                    i10 |= ((i3 & Fields.RotationZ) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
                } else {
                    j3 = j2;
                    i11 = i9;
                }
                int i24 = i10;
                i12 = i3 & Fields.CameraDistance;
                if (i12 != 0) {
                    i13 = i24 | 384;
                } else if ((i2 & 384) == 0) {
                    i13 = i24 | (startRestartGroup.changed(f2) ? Fields.RotationX : Fields.SpotShadowColor);
                } else {
                    i13 = i24;
                }
                i14 = i3 & Fields.TransformOrigin;
                if (i14 != 0) {
                    i15 = i13 | 3072;
                } else {
                    int i25 = i13;
                    if ((i2 & 3072) == 0) {
                        if (!startRestartGroup.changedInstance(myVar)) {
                            i22 = 1024;
                        }
                        i15 = i25 | i22;
                    } else {
                        i15 = i25;
                    }
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 8192) == 0 && startRestartGroup.changedInstance(myVar2)) {
                        i23 = Fields.Clip;
                    }
                    i15 |= i23;
                }
                if ((i3 & Fields.Clip) != 0) {
                    i15 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i15 |= startRestartGroup.changedInstance(nyVar) ? 131072 : 65536;
                    if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (i15 & 74899) != 74898, i11 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        z2 = z;
                        j4 = j2;
                        myVar3 = myVar;
                        f4 = f3;
                        sheetState3 = sheetState2;
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        shape2 = shape;
                        j5 = j;
                        f5 = f2;
                        myVar4 = myVar2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i6 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if ((i3 & 32) != 0) {
                                sheetState2 = rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                i16 = i11 & (-3670017);
                            } else {
                                i16 = i11;
                            }
                            if (i7 != 0) {
                                f3 = BottomSheetDefaults.INSTANCE.m1644getSheetMaxWidthD9Ej5fM();
                            }
                            z3 = i8 != 0 ? true : z;
                            if ((i3 & Fields.RotationX) != 0) {
                                shape3 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                i16 &= -1879048193;
                            } else {
                                shape3 = shape;
                            }
                            if ((i3 & Fields.RotationY) != 0) {
                                i15 &= -15;
                                j6 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            } else {
                                j6 = j;
                            }
                            if ((i3 & Fields.RotationZ) != 0) {
                                j7 = ColorSchemeKt.m1797contentColorForek8zF_U(j6, startRestartGroup, i15 & 14);
                                i15 &= -113;
                            } else {
                                j7 = j2;
                            }
                            m1642getElevationD9Ej5fM = i12 != 0 ? BottomSheetDefaults.INSTANCE.m1642getElevationD9Ej5fM() : f2;
                            lambda$1716959002$material3 = i14 != 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.getLambda$1716959002$material3() : myVar;
                            if ((i3 & 8192) != 0) {
                                Modifier modifier6 = modifier2;
                                i17 = i16;
                                modifier4 = modifier6;
                                Shape shape6 = shape3;
                                myVar5 = new my() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$1
                                    public final WindowInsets invoke(Composer composer3, int i26) {
                                        composer3.startReplaceGroup(1023699493);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1023699493, i26, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:270)");
                                        }
                                        WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return windowInsets;
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        return invoke((Composer) obj, ((Number) obj2).intValue());
                                    }
                                };
                                f6 = f3;
                                j8 = j6;
                                shape4 = shape6;
                                i18 = i15 & (-57345);
                            } else {
                                Modifier modifier7 = modifier2;
                                i17 = i16;
                                modifier4 = modifier7;
                                f6 = f3;
                                i18 = i15;
                                j8 = j6;
                                shape4 = shape3;
                                myVar5 = myVar2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            int i26 = (i3 & 32) != 0 ? i11 & (-3670017) : i11;
                            if ((i3 & Fields.RotationX) != 0) {
                                i26 &= -1879048193;
                            }
                            if ((i3 & Fields.RotationY) != 0) {
                                i15 &= -15;
                            }
                            if ((i3 & Fields.RotationZ) != 0) {
                                i15 &= -113;
                            }
                            if ((i3 & 8192) != 0) {
                                i15 &= -57345;
                            }
                            Modifier modifier8 = modifier2;
                            i17 = i26;
                            modifier4 = modifier8;
                            z3 = z;
                            m1642getElevationD9Ej5fM = f2;
                            lambda$1716959002$material3 = myVar;
                            myVar5 = myVar2;
                            j7 = j3;
                            f6 = f3;
                            i18 = i15;
                            shape4 = shape;
                            j8 = j;
                        }
                        startRestartGroup.endDefaults();
                        float f8 = m1642getElevationD9Ej5fM;
                        if (ComposerKt.isTraceInProgress()) {
                            shape5 = shape4;
                            ComposerKt.traceEventStart(-37400432, i17, i18, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                        } else {
                            shape5 = shape4;
                        }
                        Strings.Companion companion = Strings.Companion;
                        String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_pane_title), startRestartGroup, 0);
                        Modifier modifier9 = modifier4;
                        int i27 = i18;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m814widthInVpY3zN4$default(boxScope.align(modifier4, Alignment.Companion.getTopCenter()), 0.0f, f6, 1, null), 0.0f, 1, null);
                        if (z3) {
                            startRestartGroup.startReplaceGroup(-1582035383);
                            Modifier.Companion companion2 = Modifier.Companion;
                            i19 = 3670016;
                            boolean z7 = (((i17 & 3670016) ^ 1572864) > 1048576 && startRestartGroup.changed(sheetState2)) || (i17 & 1572864) == 1048576;
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (z7 || rememberedValue5 == Composer.Companion.getEmpty()) {
                                rememberedValue5 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2, Orientation.Vertical, kyVar);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            f7 = f6;
                            modifier5 = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) rememberedValue5, null, 2, null);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            i19 = 3670016;
                            f7 = f6;
                            startRestartGroup.startReplaceGroup(-1582020872);
                            startRestartGroup.endReplaceGroup();
                            modifier5 = Modifier.Companion;
                        }
                        Modifier then = fillMaxWidth$default.then(modifier5);
                        AnchoredDraggableState<SheetValue> anchoredDraggableState$material3 = sheetState2.getAnchoredDraggableState$material3();
                        Orientation orientation = Orientation.Vertical;
                        int i28 = (i17 & i19) ^ 1572864;
                        if (i28 <= 1048576 || !startRestartGroup.changed(sheetState2)) {
                            j9 = j8;
                            if ((i17 & 1572864) != 1048576) {
                                z4 = false;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z4 || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new w5(sheetState2, 7);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                Modifier draggableAnchors = AnchoredDraggableKt.draggableAnchors(then, anchoredDraggableState$material3, orientation, (my) rememberedValue);
                                DraggableState draggableState$material3 = sheetState2.getAnchoredDraggableState$material3().getDraggableState$material3();
                                boolean z8 = !z3 && sheetState2.isVisible();
                                boolean isAnimationRunning = sheetState2.getAnchoredDraggableState$material3().isAnimationRunning();
                                z5 = (i17 & 57344) != 16384;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z5 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(kyVar, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                Modifier draggable$default = DraggableKt.draggable$default(draggableAnchors, draggableState$material3, orientation, z8, null, isAnimationRunning, null, (ny) rememberedValue2, false, 168, null);
                                changed = startRestartGroup.changed(m2983getString2EP1pXo);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                    rememberedValue3 = new wd(m2983getString2EP1pXo, 17);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(draggable$default, false, (ky) rememberedValue3, 1, null);
                                offset$material3 = (int) sheetState2.getOffset$material3();
                                if (offset$material3 < 0) {
                                    offset$material3 = 0;
                                }
                                Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(semantics$default, WindowInsetsKt.WindowInsets$default(0, offset$material3, 0, 0, 13, null));
                                z6 = ((i28 <= 1048576 && startRestartGroup.changed(sheetState2)) || (i17 & 1572864) == 1048576) | ((i17 & 112) != 32 || ((i17 & 64) != 0 && startRestartGroup.changedInstance(animatable)));
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!z6 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                    rememberedValue4 = new defpackage.g(27, sheetState2, animatable);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                SheetState sheetState4 = sheetState2;
                                boolean z9 = z3;
                                my myVar6 = myVar5;
                                my myVar7 = lambda$1716959002$material3;
                                int i29 = i27 << 6;
                                Shape shape7 = shape5;
                                long j10 = j7;
                                SurfaceKt.m2464SurfaceT9BRK9s(BottomSheetScaffoldKt.verticalScaleUp(GraphicsLayerModifierKt.graphicsLayer(consumeWindowInsets, (ky) rememberedValue4), sheetState2), shape7, j9, j10, f8, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(myVar6, animatable, sheetState4, myVar7, nyVar, iyVar, unVar2, z9), startRestartGroup, 54), startRestartGroup, ((i17 >> 24) & 112) | 12582912 | (i29 & 896) | (i29 & 7168) | (57344 & i29), 96);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z2 = z9;
                                sheetState3 = sheetState4;
                                myVar3 = myVar7;
                                shape2 = shape7;
                                f5 = f8;
                                composer2 = startRestartGroup;
                                f4 = f7;
                                myVar4 = myVar6;
                                j4 = j10;
                                modifier3 = modifier9;
                                j5 = j9;
                            }
                        } else {
                            j9 = j8;
                        }
                        z4 = true;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z4) {
                        }
                        rememberedValue = new w5(sheetState2, 7);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        Modifier draggableAnchors2 = AnchoredDraggableKt.draggableAnchors(then, anchoredDraggableState$material3, orientation, (my) rememberedValue);
                        DraggableState draggableState$material32 = sheetState2.getAnchoredDraggableState$material3().getDraggableState$material3();
                        if (z3) {
                        }
                        boolean isAnimationRunning2 = sheetState2.getAnchoredDraggableState$material3().isAnimationRunning();
                        if ((i17 & 57344) != 16384) {
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z5) {
                        }
                        rememberedValue2 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(kyVar, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        Modifier draggable$default2 = DraggableKt.draggable$default(draggableAnchors2, draggableState$material32, orientation, z8, null, isAnimationRunning2, null, (ny) rememberedValue2, false, 168, null);
                        changed = startRestartGroup.changed(m2983getString2EP1pXo);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue3 = new wd(m2983getString2EP1pXo, 17);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        Modifier semantics$default2 = SemanticsModifierKt.semantics$default(draggable$default2, false, (ky) rememberedValue3, 1, null);
                        offset$material3 = (int) sheetState2.getOffset$material3();
                        if (offset$material3 < 0) {
                        }
                        Modifier consumeWindowInsets2 = WindowInsetsPaddingKt.consumeWindowInsets(semantics$default2, WindowInsetsKt.WindowInsets$default(0, offset$material3, 0, 0, 13, null));
                        z6 = ((i28 <= 1048576 && startRestartGroup.changed(sheetState2)) || (i17 & 1572864) == 1048576) | ((i17 & 112) != 32 || ((i17 & 64) != 0 && startRestartGroup.changedInstance(animatable)));
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z6) {
                        }
                        rememberedValue4 = new defpackage.g(27, sheetState2, animatable);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        SheetState sheetState42 = sheetState2;
                        boolean z92 = z3;
                        my myVar62 = myVar5;
                        my myVar72 = lambda$1716959002$material3;
                        int i292 = i27 << 6;
                        Shape shape72 = shape5;
                        long j102 = j7;
                        SurfaceKt.m2464SurfaceT9BRK9s(BottomSheetScaffoldKt.verticalScaleUp(GraphicsLayerModifierKt.graphicsLayer(consumeWindowInsets2, (ky) rememberedValue4), sheetState2), shape72, j9, j102, f8, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(myVar62, animatable, sheetState42, myVar72, nyVar, iyVar, unVar2, z92), startRestartGroup, 54), startRestartGroup, ((i17 >> 24) & 112) | 12582912 | (i292 & 896) | (i292 & 7168) | (57344 & i292), 96);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z2 = z92;
                        sheetState3 = sheetState42;
                        myVar3 = myVar72;
                        shape2 = shape72;
                        f5 = f8;
                        composer2 = startRestartGroup;
                        f4 = f7;
                        myVar4 = myVar62;
                        j4 = j102;
                        modifier3 = modifier9;
                        j5 = j9;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: j90
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 ModalBottomSheetContent_7___e2Q$lambda$24;
                                int intValue = ((Integer) obj2).intValue();
                                ModalBottomSheetContent_7___e2Q$lambda$24 = ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$24(BoxScope.this, animatable, unVar, iyVar, kyVar, modifier3, sheetState3, f4, z2, shape2, j5, j4, f5, myVar3, myVar4, nyVar, i, i2, i3, (Composer) obj, intValue);
                                return ModalBottomSheetContent_7___e2Q$lambda$24;
                            }
                        });
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (i15 & 74899) != 74898, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            int i232 = 8192;
            if ((i3 & 8) != 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i242 = i10;
            i12 = i3 & Fields.CameraDistance;
            if (i12 != 0) {
            }
            i14 = i3 & Fields.TransformOrigin;
            if (i14 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i3 & Fields.Clip) != 0) {
            }
            if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (i15 & 74899) != 74898, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        unVar2 = unVar;
        i5 = i3 & 4;
        int i222 = Fields.CameraDistance;
        if (i5 == 0) {
        }
        int i2322 = 8192;
        if ((i3 & 8) != 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2422 = i10;
        i12 = i3 & Fields.CameraDistance;
        if (i12 != 0) {
        }
        i14 = i3 & Fields.TransformOrigin;
        if (i14 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i3 & Fields.Clip) != 0) {
        }
        if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (i15 & 74899) != 74898, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xe0 ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17(SheetState sheetState, IntSize intSize, Constraints constraints) {
        SheetValue sheetValue;
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new g5(Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl()), intSize, sheetState, 2));
        int i = WhenMappings.$EnumSwitchMapping$0[sheetState.getAnchoredDraggableState$material3().getTargetValue().ordinal()];
        if (i == 1) {
            sheetValue = SheetValue.Hidden;
        } else if (i == 2) {
            sheetValue = SheetValue.PartiallyExpanded;
            if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                sheetValue = SheetValue.Expanded;
                if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                    sheetValue = SheetValue.Hidden;
                }
            }
        } else {
            if (i != 3) {
                defpackage.o.n();
                return null;
            }
            sheetValue = SheetValue.Expanded;
            if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                sheetValue = SheetValue.Hidden;
            }
        }
        return new xe0(DraggableAnchors, sheetValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17$lambda$16(float f, IntSize intSize, SheetState sheetState, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(SheetValue.Hidden, f);
        if (((int) (intSize.m7786unboximpl() & 4294967295L)) > f / 2.0f && !sheetState.getSkipPartiallyExpanded$material3()) {
            draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, f / 2.0f);
        }
        if (((int) (intSize.m7786unboximpl() & 4294967295L)) != 0) {
            draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, f - ((int) (intSize.m7786unboximpl() & 4294967295L))));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheetContent_7___e2Q$lambda$21$lambda$20(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheetContent_7___e2Q$lambda$23$lambda$22(SheetState sheetState, Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L));
        if (!Float.isNaN(offset) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
            float floatValue = ((Number) animatable.getValue()).floatValue();
            graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX(graphicsLayerScope, floatValue));
            graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY(graphicsLayerScope, floatValue));
            graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + intBitsToFloat) / intBitsToFloat));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheetContent_7___e2Q$lambda$24(BoxScope boxScope, Animatable animatable, un unVar, iy iyVar, ky kyVar, Modifier modifier, SheetState sheetState, float f, boolean z, Shape shape, long j, long j2, float f2, my myVar, my myVar2, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        m2147ModalBottomSheetContent7e2Q(boxScope, animatable, unVar, iyVar, kyVar, modifier, sheetState, f, z, shape, j, j2, f2, myVar, myVar2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_YbuCTN8$lambda$1$lambda$0(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        sheetState.setShowMotionSpec$material3(finiteAnimationSpec);
        sheetState.setHideMotionSpec$material3(finiteAnimationSpec2);
        sheetState.setAnchoredDraggableMotionSpec$material3(finiteAnimationSpec3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_YbuCTN8$lambda$11$lambda$10(SheetState sheetState, un unVar, Animatable animatable, iy iyVar) {
        if (sheetState.getCurrentValue() == SheetValue.Expanded && sheetState.getHasPartiallyExpandedState()) {
            p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable, null), 3);
            p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$2(sheetState, null), 3);
        } else {
            p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$3(sheetState, null), 3).h(new g7(4, iyVar));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_YbuCTN8$lambda$11$lambda$10$lambda$9(iy iyVar, Throwable th) {
        iyVar.invoke();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_YbuCTN8$lambda$13(iy iyVar, Modifier modifier, SheetState sheetState, float f, boolean z, Shape shape, long j, long j2, float f2, long j3, my myVar, my myVar2, ModalBottomSheetProperties modalBottomSheetProperties, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        m2145ModalBottomSheetYbuCTN8(iyVar, modifier, sheetState, f, z, shape, j, j2, f2, j3, myVar, myVar2, modalBottomSheetProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_YbuCTN8$lambda$4$lambda$3(SheetState sheetState, un unVar, iy iyVar) {
        if (((Boolean) sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(SheetValue.Hidden)).booleanValue()) {
            p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1(sheetState, null), 3).h(new h90(sheetState, iyVar, 0));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2(SheetState sheetState, iy iyVar, Throwable th) {
        if (!sheetState.isVisible()) {
            iyVar.invoke();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_YbuCTN8$lambda$7$lambda$6(un unVar, SheetState sheetState, iy iyVar, float f) {
        p01.t(unVar, null, null, new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(sheetState, f, null), 3).h(new h90(sheetState, iyVar, 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5(SheetState sheetState, iy iyVar, Throwable th) {
        if (!sheetState.isVisible()) {
            iyVar.invoke();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_dYc4hso$lambda$14(iy iyVar, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, my myVar, my myVar2, ModalBottomSheetProperties modalBottomSheetProperties, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        m2146ModalBottomSheetdYc4hso(iyVar, modifier, sheetState, f, shape, j, j2, f2, j3, myVar, myVar2, modalBottomSheetProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-KTwxG1Y, reason: not valid java name */
    public static final void m2148ScrimKTwxG1Y(final long j, final iy iyVar, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(-391613911);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i4 = 0;
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-391613911, i2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:514)");
            }
            if (j != 16) {
                startRestartGroup.startReplaceGroup(-1438582326);
                int i5 = i2;
                Object animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                Strings.Companion companion2 = Strings.Companion;
                String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.close_sheet), startRestartGroup, 0);
                if (z2) {
                    startRestartGroup.startReplaceGroup(-1438283579);
                    companion = Modifier.Companion;
                    int i6 = i5 & 112;
                    boolean z3 = i6 == 32;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(iyVar);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, iyVar, (PointerInputEventHandler) rememberedValue);
                    boolean changed = (i6 == 32) | startRestartGroup.changed(m2983getString2EP1pXo);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new l90(m2983getString2EP1pXo, iyVar, i4);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    i3 = 1;
                    modifier = SemanticsModifierKt.semantics(pointerInput, true, (ky) rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                } else {
                    i3 = 1;
                    startRestartGroup.startReplaceGroup(-1437857391);
                    startRestartGroup.endReplaceGroup();
                    companion = Modifier.Companion;
                    modifier = companion;
                }
                Modifier then = SizeKt.fillMaxSize$default(companion, 0.0f, i3, null).then(modifier);
                int i7 = (startRestartGroup.changed(animateFloatAsState) ? 1 : 0) | ((i5 & 14) == 4 ? i3 : 0);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (i7 != 0 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new m90(i4, j, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                CanvasKt.Canvas(then, (ky) rememberedValue3, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1437676103);
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
            endRestartGroup.updateScope(new my() { // from class: n90
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 Scrim_KTwxG1Y$lambda$34;
                    int intValue = ((Integer) obj2).intValue();
                    Scrim_KTwxG1Y$lambda$34 = ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$34(j, iyVar, z, z2, i, (Composer) obj, intValue);
                    return Scrim_KTwxG1Y$lambda$34;
                }
            });
        }
    }

    private static final float Scrim_KTwxG1Y$lambda$27(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_KTwxG1Y$lambda$31$lambda$30(String str, iy iyVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new uq(3, iyVar), 1, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Scrim_KTwxG1Y$lambda$31$lambda$30$lambda$29(iy iyVar) {
        iyVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_KTwxG1Y$lambda$33$lambda$32(long j, State state, DrawScope drawScope) {
        DrawScope.m5329drawRectnJ9OG0$default(drawScope, j, 0L, 0L, y80.g(Scrim_KTwxG1Y$lambda$27(state), 0.0f, 1.0f), null, null, 0, 118, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_KTwxG1Y$lambda$34(long j, iy iyVar, boolean z, boolean z2, int i, Composer composer, int i2) {
        m2148ScrimKTwxG1Y(j, iyVar, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo367toPx0680j_4(PredictiveBackMaxScaleXDistance), intBitsToFloat), f) / intBitsToFloat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo367toPx0680j_4(PredictiveBackMaxScaleYDistance), intBitsToFloat), f) / intBitsToFloat);
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new hz(23);
                composer.updateRememberedValue(rememberedValue);
            }
            kyVar = (ky) rememberedValue;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:502)");
        }
        SheetState m2373rememberSheetStateAGcomas = SheetDefaultsKt.m2373rememberSheetStateAGcomas(z2, kyVar2, SheetValue.Hidden, false, 0.0f, 0.0f, composer, (i & 14) | 384 | (i & 112), 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2373rememberSheetStateAGcomas;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberModalBottomSheetState$lambda$26$lambda$25(SheetValue sheetValue) {
        return true;
    }
}
