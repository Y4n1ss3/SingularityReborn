package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.iy;
import defpackage.k90;
import defpackage.ky;
import defpackage.ms;
import defpackage.my;
import defpackage.ny;
import defpackage.st;
import defpackage.un;
import defpackage.w01;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0062  */
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
    public static final /* synthetic */ void m2150ModalBottomSheetdYc4hso(iy iyVar, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, my myVar, WindowInsets windowInsets, ModalBottomSheetProperties modalBottomSheetProperties, ny nyVar, Composer composer, int i, int i2, int i3) {
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
        Shape shape3;
        long j6;
        Modifier modifier3;
        SheetState sheetState3;
        long j7;
        float f4;
        long j8;
        my myVar2;
        WindowInsets windowInsets2;
        ModalBottomSheetProperties modalBottomSheetProperties2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j9;
        final WindowInsets windowInsets3;
        ModalBottomSheetProperties properties;
        Shape shape5;
        Modifier modifier4;
        float f5;
        float f6;
        SheetState sheetState4;
        long j10;
        long j11;
        my myVar3;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1342054200);
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
                        if ((i3 & Fields.RotationZ) == 0 && startRestartGroup.changed(windowInsets)) {
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
                                    sheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
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
                                my m1835getLambda$1294623166$material3 = i8 != 0 ? ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1835getLambda$1294623166$material3() : myVar;
                                if ((i3 & Fields.RotationZ) != 0) {
                                    windowInsets3 = BottomSheetDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i12 &= -15;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                properties = i11 != 0 ? ModalBottomSheetDefaults.INSTANCE.getProperties() : modalBottomSheetProperties;
                                shape5 = shape4;
                                modifier4 = modifier2;
                                my myVar4 = m1835getLambda$1294623166$material3;
                                f5 = m1644getSheetMaxWidthD9Ej5fM;
                                long j12 = j5;
                                f6 = m7611constructorimpl;
                                sheetState4 = sheetState2;
                                j10 = j12;
                                j11 = j9;
                                myVar3 = myVar4;
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
                                myVar3 = myVar;
                                properties = modalBottomSheetProperties;
                                shape5 = shape2;
                                modifier4 = modifier2;
                                sheetState4 = sheetState2;
                                j10 = j5;
                                f5 = f;
                                f6 = f2;
                                j11 = j3;
                                windowInsets3 = windowInsets;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1342054200, i4, i12, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:343)");
                            }
                            int i17 = i4 << 3;
                            int i18 = i12 << 3;
                            composer2 = startRestartGroup;
                            ModalBottomSheetKt.m2145ModalBottomSheetYbuCTN8(iyVar, modifier4, sheetState4, f5, false, shape5, j4, j10, f6, j11, myVar3, new my() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
                                public final WindowInsets invoke(Composer composer3, int i19) {
                                    composer3.startReplaceGroup(-677688734);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-677688734, i19, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:354)");
                                    }
                                    WindowInsets windowInsets4 = WindowInsets.this;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceGroup();
                                    return windowInsets4;
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    return invoke((Composer) obj, ((Number) obj2).intValue());
                                }
                            }, properties, nyVar, composer2, (i4 & 8190) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192), ((i4 >> 27) & 14) | (i18 & 896) | (i18 & 7168), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            f3 = f5;
                            shape3 = shape5;
                            j7 = j10;
                            myVar2 = myVar3;
                            float f7 = f6;
                            windowInsets2 = windowInsets3;
                            sheetState3 = sheetState4;
                            j6 = j4;
                            f4 = f7;
                            j8 = j11;
                            modalBottomSheetProperties2 = properties;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            f3 = f;
                            shape3 = shape2;
                            j6 = j4;
                            modifier3 = modifier2;
                            sheetState3 = sheetState2;
                            j7 = j5;
                            f4 = f2;
                            j8 = j3;
                            myVar2 = myVar;
                            windowInsets2 = windowInsets;
                            modalBottomSheetProperties2 = modalBottomSheetProperties;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new k90(iyVar, modifier3, sheetState3, f3, shape3, j6, j7, f4, j8, myVar2, windowInsets2, modalBottomSheetProperties2, nyVar, i, i2, i3, 1));
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

    /* renamed from: ModalBottomSheetDialog-sW7UJKQ, reason: not valid java name */
    public static final void m2151ModalBottomSheetDialogsW7UJKQ(final iy iyVar, final long j, final ModalBottomSheetProperties modalBottomSheetProperties, final Animatable<Float, AnimationVector1D> animatable, final my myVar, Composer composer, final int i) {
        iy iyVar2;
        int i2;
        ModalBottomSheetProperties modalBottomSheetProperties2;
        int i3;
        final LayoutDirection layoutDirection;
        boolean z;
        Object obj;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(766784632);
        if ((i & 6) == 0) {
            iyVar2 = iyVar;
            i2 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
        } else {
            iyVar2 = iyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            modalBottomSheetProperties2 = modalBottomSheetProperties;
            i2 |= startRestartGroup.changed(modalBottomSheetProperties2) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            modalBottomSheetProperties2 = modalBottomSheetProperties;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & Fields.TransformOrigin) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
        }
        if (startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(766784632, i2, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:369)");
            }
            View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(myVar, startRestartGroup, (i2 >> 12) & 14);
            Object[] objArr = new Object[0];
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ms(16);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(objArr, (iy) rememberedValue, startRestartGroup, 48);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            un unVar = (un) rememberedValue2;
            boolean changed = startRestartGroup.changed(view) | startRestartGroup.changed(density);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                i3 = i2;
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new ModalBottomSheetDialogWrapper(iyVar2, modalBottomSheetProperties2, j, view, layoutDirection2, density, uuid, animatable, unVar, null);
                layoutDirection = layoutDirection2;
                z = true;
                modalBottomSheetDialogWrapper.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-1051373467, true, new ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1(rememberUpdatedState)));
                startRestartGroup.updateRememberedValue(modalBottomSheetDialogWrapper);
                obj = modalBottomSheetDialogWrapper;
            } else {
                i3 = i2;
                layoutDirection = layoutDirection2;
                z = true;
                obj = rememberedValue3;
            }
            final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = (ModalBottomSheetDialogWrapper) obj;
            boolean changedInstance = startRestartGroup.changedInstance(modalBottomSheetDialogWrapper2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                i4 = 4;
                rememberedValue4 = new o(modalBottomSheetDialogWrapper2, i4);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                i4 = 4;
            }
            EffectsKt.DisposableEffect(modalBottomSheetDialogWrapper2, (ky) rememberedValue4, startRestartGroup, 0);
            boolean changedInstance2 = startRestartGroup.changedInstance(modalBottomSheetDialogWrapper2) | ((i3 & 14) == i4 ? z : false) | ((i3 & 896) == 256 ? z : false) | ((i3 & 112) == 32 ? z : false) | startRestartGroup.changed(layoutDirection.ordinal());
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new iy() { // from class: androidx.compose.material3.n0
                    @Override // defpackage.iy
                    public final Object invoke() {
                        w01 ModalBottomSheetDialog_sW7UJKQ$lambda$10$lambda$9;
                        ModalBottomSheetDialog_sW7UJKQ$lambda$10$lambda$9 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$10$lambda$9(ModalBottomSheetDialogWrapper.this, iyVar, modalBottomSheetProperties, j, layoutDirection);
                        return ModalBottomSheetDialog_sW7UJKQ$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            EffectsKt.SideEffect((iy) rememberedValue5, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: o90
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    w01 ModalBottomSheetDialog_sW7UJKQ$lambda$11;
                    int intValue = ((Integer) obj3).intValue();
                    ModalBottomSheetDialog_sW7UJKQ$lambda$11 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$11(iy.this, j, modalBottomSheetProperties, animatable, myVar, i, (Composer) obj2, intValue);
                    return ModalBottomSheetDialog_sW7UJKQ$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final my ModalBottomSheetDialog_sW7UJKQ$lambda$1(State<? extends my> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheetDialog_sW7UJKQ$lambda$10$lambda$9(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, iy iyVar, ModalBottomSheetProperties modalBottomSheetProperties, long j, LayoutDirection layoutDirection) {
        modalBottomSheetDialogWrapper.m2144updateParameters9LQNqLg(iyVar, modalBottomSheetProperties, j, layoutDirection);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheetDialog_sW7UJKQ$lambda$11(iy iyVar, long j, ModalBottomSheetProperties modalBottomSheetProperties, Animatable animatable, my myVar, int i, Composer composer, int i2) {
        m2151ModalBottomSheetDialogsW7UJKQ(iyVar, j, modalBottomSheetProperties, animatable, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ModalBottomSheetDialog_sW7UJKQ$lambda$8$lambda$7(final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, DisposableEffectScope disposableEffectScope) {
        modalBottomSheetDialogWrapper.show();
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog_sW7UJKQ$lambda$8$lambda$7$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ModalBottomSheetDialogWrapper.this.dismiss();
                ModalBottomSheetDialogWrapper.this.disposeComposition();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalBottomSheet_dYc4hso$lambda$0(iy iyVar, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, my myVar, WindowInsets windowInsets, ModalBottomSheetProperties modalBottomSheetProperties, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        m2150ModalBottomSheetdYc4hso(iyVar, modifier, sheetState, f, shape, j, j2, f2, j3, myVar, windowInsets, modalBottomSheetProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* renamed from: isDark-8_81llA, reason: not valid java name */
    public static final boolean m2152isDark8_81llA(long j) {
        return !Color.m4762equalsimpl0(j, Color.Companion.m4796getTransparent0d7_KjU()) && ((double) ColorKt.m4813luminance8_81llA(j)) <= 0.5d;
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
