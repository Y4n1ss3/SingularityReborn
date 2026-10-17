package androidx.compose.material3.internal;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.TextFieldLabelScope;
import androidx.compose.material3.Typography;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import defpackage.cb0;
import defpackage.eh0;
import defpackage.f1;
import defpackage.fc;
import defpackage.h7;
import defpackage.ih0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.o;
import defpackage.q10;
import defpackage.qh0;
import defpackage.ry;
import defpackage.t6;
import defpackage.te0;
import defpackage.w01;
import defpackage.wd;
import defpackage.x6;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final String ContainerId = "Container";
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final float TextFieldPadding = Dp.m7611constructorimpl(16.0f);
    private static final float AboveLabelHorizontalPadding = Dp.m7611constructorimpl(4.0f);
    private static final float AboveLabelBottomPadding = Dp.m7611constructorimpl(4.0f);
    private static final float SupportingTopPadding = Dp.m7611constructorimpl(4.0f);
    private static final float PrefixSuffixTextPadding = Dp.m7611constructorimpl(2.0f);
    private static final float MinTextLineHeight = Dp.m7611constructorimpl(24.0f);
    private static final float MinFocusedLabelLineHeight = Dp.m7611constructorimpl(16.0f);
    private static final float MinSupportingTextLineHeight = Dp.m7611constructorimpl(16.0f);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:378:0x03bf, code lost:
    
        if (r42 != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x037f, code lost:
    
        if (r42 != false) goto L217;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(final TextFieldType textFieldType, final CharSequence charSequence, final my myVar, final TextFieldLabelPosition textFieldLabelPosition, final ny nyVar, final my myVar2, final my myVar3, final my myVar4, final my myVar5, final my myVar6, final my myVar7, final boolean z, final boolean z2, final boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final TextFieldColors textFieldColors, final my myVar8, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        TextFieldColors textFieldColors2;
        Composer composer2;
        float f;
        InputPhase inputPhase;
        int i6;
        float f2;
        int i7;
        float f3;
        int i8;
        float f4;
        int i9;
        float f5;
        int i10;
        InputPhase inputPhase2;
        boolean changed;
        Object rememberedValue;
        Color color;
        InputPhase inputPhase3;
        boolean changed2;
        Object rememberedValue2;
        boolean z4;
        Object rememberedValue3;
        Composer.Companion companion;
        boolean z5;
        TextFieldColors textFieldColors3;
        Composer composer3;
        boolean z6;
        int i11;
        State state;
        boolean z7;
        boolean z8;
        int i12;
        TextStyle textStyle;
        final TextStyle textStyle2;
        final State state2;
        Object rememberedValue4;
        ComposableLambda composableLambda;
        Object rememberedValue5;
        State state3;
        State state4;
        boolean z9;
        ComposableLambda composableLambda2;
        ComposableLambda composableLambda3;
        ComposableLambda rememberComposableLambda;
        ComposableLambda composableLambda4;
        ComposableLambda composableLambda5;
        int i13;
        ComposableLambda rememberComposableLambda2;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(546805032);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i4 = i3 | (startRestartGroup.changedInstance(charSequence) ? 32 : 16);
        } else {
            i4 = i3;
        }
        int i15 = i & 384;
        int i16 = Fields.SpotShadowColor;
        if (i15 == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? 256 : 128;
        }
        int i17 = i & 3072;
        int i18 = Fields.RotationZ;
        if (i17 == 0) {
            i4 |= startRestartGroup.changed(textFieldLabelPosition) ? Fields.CameraDistance : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(nyVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar2) ? 131072 : 65536;
        }
        int i19 = i & 1572864;
        int i20 = Fields.BlendMode;
        if (i19 == 0) {
            i4 |= startRestartGroup.changedInstance(myVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar5) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar6) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i21 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changedInstance(myVar7) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (startRestartGroup.changed(z2)) {
                i16 = 256;
            }
            i5 |= i16;
        }
        if ((i2 & 3072) == 0) {
            if (startRestartGroup.changed(z3)) {
                i18 = Fields.CameraDistance;
            }
            i5 |= i18;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(interactionSource) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            textFieldColors2 = textFieldColors;
            if (startRestartGroup.changed(textFieldColors2)) {
                i20 = 1048576;
            }
            i5 |= i20;
        } else {
            textFieldColors2 = textFieldColors;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changedInstance(myVar8) ? 8388608 : 4194304;
        }
        int i22 = i5;
        if (startRestartGroup.shouldExecute(((i21 & 306783379) == 306783378 && (4793491 & i22) == 4793490) ? false : true, i21 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(546805032, i21, i22, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:98)");
            }
            boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i22 >> 12) & 14).getValue().booleanValue();
            InputPhase inputPhase4 = booleanValue ? InputPhase.Focused : charSequence.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            long m2568labelColorXeAY9LY$material3 = textFieldColors2.m2568labelColorXeAY9LY$material3(z2, z3, booleanValue);
            Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            final TextStyle bodyLarge = typography.getBodyLarge();
            final TextStyle bodySmall = typography.getBodySmall();
            long m7090getColor0d7_KjU = bodyLarge.m7090getColor0d7_KjU();
            Color.Companion companion2 = Color.Companion;
            boolean z10 = (Color.m4762equalsimpl0(m7090getColor0d7_KjU, companion2.m4797getUnspecified0d7_KjU()) && !Color.m4762equalsimpl0(bodySmall.m7090getColor0d7_KjU(), companion2.m4797getUnspecified0d7_KjU())) || (!Color.m4762equalsimpl0(bodyLarge.m7090getColor0d7_KjU(), companion2.m4797getUnspecified0d7_KjU()) && Color.m4762equalsimpl0(bodySmall.m7090getColor0d7_KjU(), companion2.m4797getUnspecified0d7_KjU()));
            long m7090getColor0d7_KjU2 = bodySmall.m7090getColor0d7_KjU();
            if (z10 && m7090getColor0d7_KjU2 == 16) {
                m7090getColor0d7_KjU2 = m2568labelColorXeAY9LY$material3;
            }
            long m7090getColor0d7_KjU3 = bodyLarge.m7090getColor0d7_KjU();
            long j = (z10 && m7090getColor0d7_KjU3 == 16) ? m2568labelColorXeAY9LY$material3 : m7090getColor0d7_KjU3;
            boolean z11 = nyVar != null && getShowExpandedLabel(textFieldLabelPosition);
            final boolean z12 = z10;
            long j2 = m7090getColor0d7_KjU2;
            Transition updateTransition = TransitionKt.updateTransition(inputPhase4, "TextFieldInputState", startRestartGroup, 48, 0);
            TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1 = new TextFieldImplKt$TextFieldTransitionScope$labelProgress$1(MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6));
            zv zvVar = zv.a;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zvVar);
            InputPhase inputPhase5 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-1436405362);
            boolean z13 = z11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i23 = iArr[inputPhase5.ordinal()];
            float f6 = 1.0f;
            if (i23 != 1) {
                if (i23 != 2) {
                    if (i23 != 3) {
                        o.n();
                        return;
                    }
                } else if (z13) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase6 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-1436405362);
                    if (ComposerKt.isTraceInProgress()) {
                        inputPhase = inputPhase6;
                    } else {
                        inputPhase = inputPhase6;
                        ComposerKt.traceEventStart(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
                    }
                    i6 = iArr[inputPhase.ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                o.n();
                                return;
                            }
                        } else if (z13) {
                            f2 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "LabelProgress", startRestartGroup, 196608);
                            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastEffects;
                            FiniteAnimationSpec value = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                            TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 = new TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1(value, MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, startRestartGroup, 6));
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(zvVar);
                            InputPhase inputPhase7 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(-1093194547);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
                            }
                            i7 = iArr[inputPhase7.ordinal()];
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        o.n();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceGroup();
                                Float valueOf2 = Float.valueOf(f3);
                                InputPhase inputPhase8 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-1093194547);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
                                }
                                i8 = iArr[inputPhase8.ordinal()];
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        if (i8 != 3) {
                                            o.n();
                                            return;
                                        }
                                    }
                                    f4 = 0.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, 196608);
                                    TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value);
                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(zvVar);
                                    InputPhase inputPhase9 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceGroup(-1258455321);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
                                    }
                                    i9 = iArr[inputPhase9.ordinal()];
                                    if (i9 != 1) {
                                        if (i9 != 2) {
                                            if (i9 != 3) {
                                                o.n();
                                                return;
                                            }
                                        } else if (z13) {
                                            f5 = 0.0f;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            Float valueOf3 = Float.valueOf(f5);
                                            InputPhase inputPhase10 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceGroup(-1258455321);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
                                            }
                                            i10 = iArr[inputPhase10.ordinal()];
                                            if (i10 != 1) {
                                                if (i10 != 2) {
                                                    if (i10 != 3) {
                                                        o.n();
                                                        return;
                                                    }
                                                } else if (z13) {
                                                    f6 = 0.0f;
                                                }
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, 196608);
                                            FiniteAnimationSpec value2 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                                            TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value2);
                                            InputPhase inputPhase11 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceGroup(-12973394);
                                            if (ComposerKt.isTraceInProgress()) {
                                                inputPhase2 = inputPhase11;
                                            } else {
                                                inputPhase2 = inputPhase11;
                                                ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                            }
                                            long j3 = iArr[inputPhase2.ordinal()] != 1 ? j2 : j;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            ColorSpace m4765getColorSpaceimpl = Color.m4765getColorSpaceimpl(j3);
                                            changed = startRestartGroup.changed(m4765getColorSpaceimpl);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                            InputPhase inputPhase12 = (InputPhase) updateTransition.getCurrentState();
                                            startRestartGroup.startReplaceGroup(-12973394);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                            }
                                            long j4 = iArr[inputPhase12.ordinal()] != 1 ? j2 : j;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            Color m4751boximpl = Color.m4751boximpl(j4);
                                            InputPhase inputPhase13 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceGroup(-12973394);
                                            if (ComposerKt.isTraceInProgress()) {
                                                color = m4751boximpl;
                                                inputPhase3 = inputPhase13;
                                            } else {
                                                color = m4751boximpl;
                                                inputPhase3 = inputPhase13;
                                                ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                            }
                                            if (iArr[inputPhase3.ordinal()] == 1) {
                                                j = j2;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            final State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, color, Color.m4751boximpl(j), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, 196608);
                                            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value2);
                                            startRestartGroup.startReplaceGroup(-464752477);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            ColorSpace m4765getColorSpaceimpl2 = Color.m4765getColorSpaceimpl(m2568labelColorXeAY9LY$material3);
                                            changed2 = startRestartGroup.changed(m4765getColorSpaceimpl2);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl2);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue2;
                                            startRestartGroup.startReplaceGroup(-464752477);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            Color m4751boximpl2 = Color.m4751boximpl(m2568labelColorXeAY9LY$material3);
                                            startRestartGroup.startReplaceGroup(-464752477);
                                            if (ComposerKt.isTraceInProgress()) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                                ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            final State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl2, Color.m4751boximpl(m2568labelColorXeAY9LY$material3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter2, "LabelContentColor", startRestartGroup, 196608);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            companion = Composer.Companion;
                                            if (rememberedValue3 == companion.getEmpty()) {
                                                rememberedValue3 = new TextFieldLabelScope() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1
                                                    @Override // androidx.compose.material3.TextFieldLabelScope
                                                    public float getLabelMinimizedProgress() {
                                                        return createTransitionAnimation.getValue().floatValue();
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            }
                                            final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                                            ComposableLambda composableLambda6 = null;
                                            if (nyVar != null) {
                                                startRestartGroup.startReplaceGroup(-1891724857);
                                                startRestartGroup.endReplaceGroup();
                                                z5 = z3;
                                                textFieldColors3 = textFieldColors;
                                                state2 = createTransitionAnimation;
                                                composer3 = startRestartGroup;
                                                z6 = z4;
                                                i11 = i21;
                                                state = createTransitionAnimation3;
                                                textStyle2 = bodySmall;
                                                textStyle = bodyLarge;
                                                z7 = booleanValue;
                                                z8 = z2;
                                                i12 = 54;
                                            } else {
                                                startRestartGroup.startReplaceGroup(-1891724856);
                                                z5 = z3;
                                                textFieldColors3 = textFieldColors;
                                                composer3 = startRestartGroup;
                                                z6 = z4;
                                                i11 = i21;
                                                state = createTransitionAnimation3;
                                                z7 = booleanValue;
                                                z8 = z2;
                                                i12 = 54;
                                                my myVar9 = new my() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                                    public final void invoke(Composer composer4, int i24) {
                                                        if (!composer4.shouldExecute((i24 & 3) != 2, i24 & 1)) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1076580032, i24, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
                                                        }
                                                        TextStyle lerp = TextStyleKt.lerp(TextStyle.this, bodySmall, createTransitionAnimation.getValue().floatValue());
                                                        boolean z14 = z12;
                                                        State<Color> state5 = createTransitionAnimation4;
                                                        if (z14) {
                                                            lerp = TextStyle.m7073copyp1EtxEg$default(lerp, state5.getValue().m4771unboximpl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                                        }
                                                        TextStyle textStyle3 = lerp;
                                                        long m4771unboximpl = createTransitionAnimation5.getValue().m4771unboximpl();
                                                        final ny nyVar2 = nyVar;
                                                        final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$12 = textFieldImplKt$CommonDecorationBox$3$labelScope$1$1;
                                                        TextFieldImplKt.m2985Decoration3JVO9M(m4771unboximpl, textStyle3, ComposableLambdaKt.rememberComposableLambda(1157484991, true, new my() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1.1
                                                            public final void invoke(Composer composer5, int i25) {
                                                                if (!composer5.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1157484991, i25, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:147)");
                                                                }
                                                                ny.this.invoke(textFieldImplKt$CommonDecorationBox$3$labelScope$1$12, composer5, 6);
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
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                };
                                                textStyle = bodyLarge;
                                                textStyle2 = bodySmall;
                                                state2 = createTransitionAnimation;
                                                composableLambda6 = ComposableLambdaKt.rememberComposableLambda(-1076580032, true, myVar9, composer3, 54);
                                                composer3.endReplaceGroup();
                                            }
                                            ComposableLambda composableLambda7 = composableLambda6;
                                            long m2570placeholderColorXeAY9LY$material3 = textFieldColors3.m2570placeholderColorXeAY9LY$material3(z8, z5, z7);
                                            rememberedValue4 = composer3.rememberedValue();
                                            if (rememberedValue4 == companion.getEmpty()) {
                                                rememberedValue4 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new t6(createTransitionAnimation2, 17));
                                                composer3.updateRememberedValue(rememberedValue4);
                                            }
                                            State state5 = (State) rememberedValue4;
                                            if (myVar2 == null && charSequence.length() == 0 && CommonDecorationBox$lambda$18$lambda$8(state5)) {
                                                composer3.startReplaceGroup(-1890614312);
                                                ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1405547205, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(createTransitionAnimation2, m2570placeholderColorXeAY9LY$material3, textStyle, myVar2), composer3, i12);
                                                composer3.endReplaceGroup();
                                                composableLambda = rememberComposableLambda3;
                                            } else {
                                                composer3.startReplaceGroup(-1890217110);
                                                composer3.endReplaceGroup();
                                                composableLambda = null;
                                            }
                                            long m2571prefixColorXeAY9LY$material3 = textFieldColors3.m2571prefixColorXeAY9LY$material3(z8, z5, z7);
                                            rememberedValue5 = composer3.rememberedValue();
                                            int i24 = 18;
                                            if (rememberedValue5 != companion.getEmpty()) {
                                                state3 = state;
                                                rememberedValue5 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new t6(state3, i24));
                                                composer3.updateRememberedValue(rememberedValue5);
                                            } else {
                                                state3 = state;
                                            }
                                            State state6 = (State) rememberedValue5;
                                            if (myVar5 == null && CommonDecorationBox$lambda$18$lambda$11(state6)) {
                                                composer3.startReplaceGroup(-1889877907);
                                                state4 = state3;
                                                z9 = 18;
                                                ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(606594655, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1(state4, m2571prefixColorXeAY9LY$material3, textStyle, myVar5), composer3, 54);
                                                composer3.endReplaceGroup();
                                                composableLambda2 = rememberComposableLambda4;
                                            } else {
                                                state4 = state3;
                                                z9 = 18;
                                                composer3.startReplaceGroup(-1889500886);
                                                composer3.endReplaceGroup();
                                                composableLambda2 = null;
                                            }
                                            long m2572suffixColorXeAY9LY$material3 = textFieldColors3.m2572suffixColorXeAY9LY$material3(z8, z5, z7);
                                            if (myVar6 == null && CommonDecorationBox$lambda$18$lambda$11(state6)) {
                                                composer3.startReplaceGroup(-1889301555);
                                                ComposableLambda rememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(-45078754, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1(state4, m2572suffixColorXeAY9LY$material3, textStyle, myVar6), composer3, 54);
                                                composer3.endReplaceGroup();
                                                composableLambda3 = rememberComposableLambda5;
                                            } else {
                                                composer3.startReplaceGroup(-1888924534);
                                                composer3.endReplaceGroup();
                                                composableLambda3 = null;
                                            }
                                            final long m2569leadingIconColorXeAY9LY$material3 = textFieldColors3.m2569leadingIconColorXeAY9LY$material3(z8, z5, z7);
                                            if (myVar3 != null) {
                                                composer3.startReplaceGroup(-1888749663);
                                                composer3.endReplaceGroup();
                                                rememberComposableLambda = null;
                                            } else {
                                                composer3.startReplaceGroup(-1888749662);
                                                rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1736293487, true, new my() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                                                    public final void invoke(Composer composer4, int i25) {
                                                        if (!composer4.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1736293487, i25, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
                                                        }
                                                        TextFieldImplKt.m2986DecorationIv8Zu3U(m2569leadingIconColorXeAY9LY$material3, myVar3, composer4, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer3, 54);
                                                composer3.endReplaceGroup();
                                            }
                                            final long m2575trailingIconColorXeAY9LY$material3 = textFieldColors3.m2575trailingIconColorXeAY9LY$material3(z8, z5, z7);
                                            if (myVar4 != null) {
                                                composer3.startReplaceGroup(-1888469888);
                                                composer3.endReplaceGroup();
                                                composableLambda4 = rememberComposableLambda;
                                                composableLambda5 = null;
                                            } else {
                                                composer3.startReplaceGroup(-1888469887);
                                                composableLambda4 = rememberComposableLambda;
                                                ComposableLambda rememberComposableLambda6 = ComposableLambdaKt.rememberComposableLambda(1334518521, true, new my() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                                                    public final void invoke(Composer composer4, int i25) {
                                                        if (!composer4.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1334518521, i25, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
                                                        }
                                                        TextFieldImplKt.m2986DecorationIv8Zu3U(m2575trailingIconColorXeAY9LY$material3, myVar4, composer4, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer3, 54);
                                                composer3.endReplaceGroup();
                                                composableLambda5 = rememberComposableLambda6;
                                            }
                                            final long m2573supportingTextColorXeAY9LY$material3 = textFieldColors3.m2573supportingTextColorXeAY9LY$material3(z8, z5, z7);
                                            if (myVar7 != null) {
                                                composer3.startReplaceGroup(-1888176380);
                                                composer3.endReplaceGroup();
                                                rememberComposableLambda2 = null;
                                                i13 = 1;
                                            } else {
                                                composer3.startReplaceGroup(-1888176379);
                                                my myVar10 = new my() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                                                    public final void invoke(Composer composer4, int i25) {
                                                        if (!composer4.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(837168720, i25, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
                                                        }
                                                        TextFieldImplKt.m2985Decoration3JVO9M(m2573supportingTextColorXeAY9LY$material3, textStyle2, myVar7, composer4, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                };
                                                i13 = 1;
                                                rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(837168720, true, myVar10, composer3, 54);
                                                composer3.endReplaceGroup();
                                            }
                                            i14 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                            if (i14 != i13) {
                                                ComposableLambda composableLambda8 = composableLambda3;
                                                Composer composer4 = composer3;
                                                int i25 = i11;
                                                composer4.startReplaceGroup(-1887830698);
                                                TextFieldKt.TextFieldLayout(Modifier.Companion, myVar, composableLambda7, composableLambda, composableLambda4, composableLambda5, composableLambda2, composableLambda8, z, textFieldLabelPosition, new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new eh0(state2) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1
                                                    @Override // defpackage.w20
                                                    public Object get() {
                                                        return ((State) this.receiver).getValue();
                                                    }
                                                }), ComposableLambdaKt.rememberComposableLambda(-1729858187, true, new my() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                                                    public final void invoke(Composer composer5, int i26) {
                                                        if (!composer5.shouldExecute((i26 & 3) != 2, i26 & 1)) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1729858187, i26, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
                                                        }
                                                        Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.ContainerId);
                                                        my myVar11 = my.this;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, layoutId);
                                                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                                        iy constructor = companion3.getConstructor();
                                                        if (composer5.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer5);
                                                        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        if (fc.l(myVar11, composer5, 0)) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer4, 54), rememberComposableLambda2, paddingValues, composer4, ((i25 >> 3) & 112) | 6 | ((i22 << 21) & 234881024) | ((i25 << 18) & 1879048192), ((i22 >> 6) & 7168) | 48);
                                                composer2 = composer4;
                                                composer2.endReplaceGroup();
                                            } else {
                                                if (i14 != 2) {
                                                    Composer composer5 = composer3;
                                                    composer5.startReplaceGroup(493292232);
                                                    composer5.endReplaceGroup();
                                                    o.n();
                                                    return;
                                                }
                                                composer3.startReplaceGroup(-1886778186);
                                                Object rememberedValue6 = composer3.rememberedValue();
                                                if (rememberedValue6 == companion.getEmpty()) {
                                                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m4573boximpl(Size.Companion.m4594getZeroNHjbRc()), null, 2, null);
                                                    composer3.updateRememberedValue(rememberedValue6);
                                                }
                                                final MutableState mutableState = (MutableState) rememberedValue6;
                                                ComposableLambda composableLambda9 = rememberComposableLambda2;
                                                ComposableLambda composableLambda10 = composableLambda;
                                                ComposableLambda composableLambda11 = composableLambda3;
                                                ComposableLambda rememberComposableLambda7 = ComposableLambdaKt.rememberComposableLambda(528115858, true, new my() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                                                    public final void invoke(Composer composer6, int i26) {
                                                        if (!composer6.shouldExecute((i26 & 3) != 2, i26 & 1)) {
                                                            composer6.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(528115858, i26, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
                                                        }
                                                        Modifier outlineCutout = OutlinedTextFieldKt.outlineCutout(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.ContainerId), new cb0(mutableState) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1.1
                                                            @Override // defpackage.cb0, defpackage.w20
                                                            public Object get() {
                                                                return ((MutableState) this.receiver).getValue();
                                                            }

                                                            public void set(Object obj) {
                                                                ((MutableState) this.receiver).setValue(obj);
                                                            }
                                                        }, TextFieldImplKt.getMinimizedAlignment(textFieldLabelPosition), paddingValues);
                                                        my myVar11 = myVar8;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer6, outlineCutout);
                                                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                                        iy constructor = companion3.getConstructor();
                                                        if (composer6.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer6.startReusableNode();
                                                        if (composer6.getInserting()) {
                                                            composer6.createNode(constructor);
                                                        } else {
                                                            composer6.useNode();
                                                        }
                                                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer6);
                                                        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        if (fc.l(myVar11, composer6, 0)) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer3, 54);
                                                Modifier.Companion companion3 = Modifier.Companion;
                                                TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new eh0(state2) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$2
                                                    @Override // defpackage.w20
                                                    public Object get() {
                                                        return ((State) this.receiver).getValue();
                                                    }
                                                });
                                                int i26 = i11;
                                                boolean changed3 = ((i26 & 7168) == 2048 ? true : z6) | composer3.changed(state2);
                                                Object rememberedValue7 = composer3.rememberedValue();
                                                if (changed3 || rememberedValue7 == companion.getEmpty()) {
                                                    rememberedValue7 = new f1(textFieldLabelPosition, state2, mutableState, 21);
                                                    composer3.updateRememberedValue(rememberedValue7);
                                                }
                                                Composer composer6 = composer3;
                                                OutlinedTextFieldKt.OutlinedTextFieldLayout(companion3, myVar, composableLambda10, composableLambda7, composableLambda4, composableLambda5, composableLambda2, composableLambda11, z, textFieldLabelPosition, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, (ky) rememberedValue7, rememberComposableLambda7, composableLambda9, paddingValues, composer6, ((i26 >> 3) & 112) | 6 | ((i22 << 21) & 234881024) | ((i26 << 18) & 1879048192), (57344 & (i22 >> 3)) | 384);
                                                composer2 = composer6;
                                                composer2.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }
                                    f5 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Float valueOf32 = Float.valueOf(f5);
                                    InputPhase inputPhase102 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceGroup(-1258455321);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i10 = iArr[inputPhase102.ordinal()];
                                    if (i10 != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, 196608);
                                    FiniteAnimationSpec value22 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value22);
                                    InputPhase inputPhase112 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceGroup(-12973394);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (iArr[inputPhase2.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    ColorSpace m4765getColorSpaceimpl3 = Color.m4765getColorSpaceimpl(j3);
                                    changed = startRestartGroup.changed(m4765getColorSpaceimpl3);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl3);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    TwoWayConverter twoWayConverter3 = (TwoWayConverter) rememberedValue;
                                    InputPhase inputPhase122 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceGroup(-12973394);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (iArr[inputPhase122.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Color m4751boximpl3 = Color.m4751boximpl(j4);
                                    InputPhase inputPhase132 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceGroup(-12973394);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (iArr[inputPhase3.ordinal()] == 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final State<Color> createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, color, Color.m4751boximpl(j), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter3, "LabelTextStyleColor", startRestartGroup, 196608);
                                    TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value22);
                                    startRestartGroup.startReplaceGroup(-464752477);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    ColorSpace m4765getColorSpaceimpl22 = Color.m4765getColorSpaceimpl(m2568labelColorXeAY9LY$material3);
                                    changed2 = startRestartGroup.changed(m4765getColorSpaceimpl22);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed2) {
                                    }
                                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl22);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue2;
                                    startRestartGroup.startReplaceGroup(-464752477);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Color m4751boximpl22 = Color.m4751boximpl(m2568labelColorXeAY9LY$material3);
                                    startRestartGroup.startReplaceGroup(-464752477);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final State<Color> createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl22, Color.m4751boximpl(m2568labelColorXeAY9LY$material3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$12.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter22, "LabelContentColor", startRestartGroup, 196608);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    companion = Composer.Companion;
                                    if (rememberedValue3 == companion.getEmpty()) {
                                    }
                                    final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$12 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                                    ComposableLambda composableLambda62 = null;
                                    if (nyVar != null) {
                                    }
                                    ComposableLambda composableLambda72 = composableLambda62;
                                    long m2570placeholderColorXeAY9LY$material32 = textFieldColors3.m2570placeholderColorXeAY9LY$material3(z8, z5, z7);
                                    rememberedValue4 = composer3.rememberedValue();
                                    if (rememberedValue4 == companion.getEmpty()) {
                                    }
                                    State state52 = (State) rememberedValue4;
                                    if (myVar2 == null) {
                                    }
                                    composer3.startReplaceGroup(-1890217110);
                                    composer3.endReplaceGroup();
                                    composableLambda = null;
                                    long m2571prefixColorXeAY9LY$material32 = textFieldColors3.m2571prefixColorXeAY9LY$material3(z8, z5, z7);
                                    rememberedValue5 = composer3.rememberedValue();
                                    int i242 = 18;
                                    if (rememberedValue5 != companion.getEmpty()) {
                                    }
                                    State state62 = (State) rememberedValue5;
                                    if (myVar5 == null) {
                                    }
                                    state4 = state3;
                                    z9 = 18;
                                    composer3.startReplaceGroup(-1889500886);
                                    composer3.endReplaceGroup();
                                    composableLambda2 = null;
                                    long m2572suffixColorXeAY9LY$material32 = textFieldColors3.m2572suffixColorXeAY9LY$material3(z8, z5, z7);
                                    if (myVar6 == null) {
                                    }
                                    composer3.startReplaceGroup(-1888924534);
                                    composer3.endReplaceGroup();
                                    composableLambda3 = null;
                                    final long m2569leadingIconColorXeAY9LY$material32 = textFieldColors3.m2569leadingIconColorXeAY9LY$material3(z8, z5, z7);
                                    if (myVar3 != null) {
                                    }
                                    final long m2575trailingIconColorXeAY9LY$material32 = textFieldColors3.m2575trailingIconColorXeAY9LY$material3(z8, z5, z7);
                                    if (myVar4 != null) {
                                    }
                                    final long m2573supportingTextColorXeAY9LY$material32 = textFieldColors3.m2573supportingTextColorXeAY9LY$material3(z8, z5, z7);
                                    if (myVar7 != null) {
                                    }
                                    i14 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                    if (i14 != i13) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                                f4 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, 196608);
                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value);
                                TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(zvVar);
                                InputPhase inputPhase92 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceGroup(-1258455321);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i9 = iArr[inputPhase92.ordinal()];
                                if (i9 != 1) {
                                }
                                f5 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Float valueOf322 = Float.valueOf(f5);
                                InputPhase inputPhase1022 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-1258455321);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i10 = iArr[inputPhase1022.ordinal()];
                                if (i10 != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter32, "PrefixSuffixOpacity", startRestartGroup, 196608);
                                FiniteAnimationSpec value222 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value222);
                                InputPhase inputPhase1122 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-12973394);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (iArr[inputPhase2.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                ColorSpace m4765getColorSpaceimpl32 = Color.m4765getColorSpaceimpl(j3);
                                changed = startRestartGroup.changed(m4765getColorSpaceimpl32);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl32);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                TwoWayConverter twoWayConverter32 = (TwoWayConverter) rememberedValue;
                                InputPhase inputPhase1222 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceGroup(-12973394);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (iArr[inputPhase1222.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Color m4751boximpl32 = Color.m4751boximpl(j4);
                                InputPhase inputPhase1322 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-12973394);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (iArr[inputPhase3.ordinal()] == 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final State<Color> createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, color, Color.m4751boximpl(j), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter32, "LabelTextStyleColor", startRestartGroup, 196608);
                                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value222);
                                startRestartGroup.startReplaceGroup(-464752477);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                ColorSpace m4765getColorSpaceimpl222 = Color.m4765getColorSpaceimpl(m2568labelColorXeAY9LY$material3);
                                changed2 = startRestartGroup.changed(m4765getColorSpaceimpl222);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl222);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue2;
                                startRestartGroup.startReplaceGroup(-464752477);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Color m4751boximpl222 = Color.m4751boximpl(m2568labelColorXeAY9LY$material3);
                                startRestartGroup.startReplaceGroup(-464752477);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final State<Color> createTransitionAnimation522 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl222, Color.m4751boximpl(m2568labelColorXeAY9LY$material3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$122.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter222, "LabelContentColor", startRestartGroup, 196608);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                companion = Composer.Companion;
                                if (rememberedValue3 == companion.getEmpty()) {
                                }
                                final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$122 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                                ComposableLambda composableLambda622 = null;
                                if (nyVar != null) {
                                }
                                ComposableLambda composableLambda722 = composableLambda622;
                                long m2570placeholderColorXeAY9LY$material322 = textFieldColors3.m2570placeholderColorXeAY9LY$material3(z8, z5, z7);
                                rememberedValue4 = composer3.rememberedValue();
                                if (rememberedValue4 == companion.getEmpty()) {
                                }
                                State state522 = (State) rememberedValue4;
                                if (myVar2 == null) {
                                }
                                composer3.startReplaceGroup(-1890217110);
                                composer3.endReplaceGroup();
                                composableLambda = null;
                                long m2571prefixColorXeAY9LY$material322 = textFieldColors3.m2571prefixColorXeAY9LY$material3(z8, z5, z7);
                                rememberedValue5 = composer3.rememberedValue();
                                int i2422 = 18;
                                if (rememberedValue5 != companion.getEmpty()) {
                                }
                                State state622 = (State) rememberedValue5;
                                if (myVar5 == null) {
                                }
                                state4 = state3;
                                z9 = 18;
                                composer3.startReplaceGroup(-1889500886);
                                composer3.endReplaceGroup();
                                composableLambda2 = null;
                                long m2572suffixColorXeAY9LY$material322 = textFieldColors3.m2572suffixColorXeAY9LY$material3(z8, z5, z7);
                                if (myVar6 == null) {
                                }
                                composer3.startReplaceGroup(-1888924534);
                                composer3.endReplaceGroup();
                                composableLambda3 = null;
                                final long m2569leadingIconColorXeAY9LY$material322 = textFieldColors3.m2569leadingIconColorXeAY9LY$material3(z8, z5, z7);
                                if (myVar3 != null) {
                                }
                                final long m2575trailingIconColorXeAY9LY$material322 = textFieldColors3.m2575trailingIconColorXeAY9LY$material3(z8, z5, z7);
                                if (myVar4 != null) {
                                }
                                final long m2573supportingTextColorXeAY9LY$material322 = textFieldColors3.m2573supportingTextColorXeAY9LY$material3(z8, z5, z7);
                                if (myVar7 != null) {
                                }
                                i14 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                if (i14 != i13) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                            f3 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase82 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-1093194547);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i8 = iArr[inputPhase82.ordinal()];
                            if (i8 != 1) {
                            }
                            f4 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, 196608);
                            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value);
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(zvVar);
                            InputPhase inputPhase922 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(-1258455321);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i9 = iArr[inputPhase922.ordinal()];
                            if (i9 != 1) {
                            }
                            f5 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf3222 = Float.valueOf(f5);
                            InputPhase inputPhase10222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-1258455321);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i10 = iArr[inputPhase10222.ordinal()];
                            if (i10 != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3222, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter322, "PrefixSuffixOpacity", startRestartGroup, 196608);
                            FiniteAnimationSpec value2222 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                            TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value2222);
                            InputPhase inputPhase11222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-12973394);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (iArr[inputPhase2.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            ColorSpace m4765getColorSpaceimpl322 = Color.m4765getColorSpaceimpl(j3);
                            changed = startRestartGroup.changed(m4765getColorSpaceimpl322);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl322);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            TwoWayConverter twoWayConverter322 = (TwoWayConverter) rememberedValue;
                            InputPhase inputPhase12222 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(-12973394);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (iArr[inputPhase12222.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Color m4751boximpl322 = Color.m4751boximpl(j4);
                            InputPhase inputPhase13222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-12973394);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (iArr[inputPhase3.ordinal()] == 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            final State<Color> createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, color, Color.m4751boximpl(j), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter322, "LabelTextStyleColor", startRestartGroup, 196608);
                            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value2222);
                            startRestartGroup.startReplaceGroup(-464752477);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            ColorSpace m4765getColorSpaceimpl2222 = Color.m4765getColorSpaceimpl(m2568labelColorXeAY9LY$material3);
                            changed2 = startRestartGroup.changed(m4765getColorSpaceimpl2222);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl2222);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue2;
                            startRestartGroup.startReplaceGroup(-464752477);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Color m4751boximpl2222 = Color.m4751boximpl(m2568labelColorXeAY9LY$material3);
                            startRestartGroup.startReplaceGroup(-464752477);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            final State<Color> createTransitionAnimation5222 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl2222, Color.m4751boximpl(m2568labelColorXeAY9LY$material3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter2222, "LabelContentColor", startRestartGroup, 196608);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            companion = Composer.Companion;
                            if (rememberedValue3 == companion.getEmpty()) {
                            }
                            final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1222 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                            ComposableLambda composableLambda6222 = null;
                            if (nyVar != null) {
                            }
                            ComposableLambda composableLambda7222 = composableLambda6222;
                            long m2570placeholderColorXeAY9LY$material3222 = textFieldColors3.m2570placeholderColorXeAY9LY$material3(z8, z5, z7);
                            rememberedValue4 = composer3.rememberedValue();
                            if (rememberedValue4 == companion.getEmpty()) {
                            }
                            State state5222 = (State) rememberedValue4;
                            if (myVar2 == null) {
                            }
                            composer3.startReplaceGroup(-1890217110);
                            composer3.endReplaceGroup();
                            composableLambda = null;
                            long m2571prefixColorXeAY9LY$material3222 = textFieldColors3.m2571prefixColorXeAY9LY$material3(z8, z5, z7);
                            rememberedValue5 = composer3.rememberedValue();
                            int i24222 = 18;
                            if (rememberedValue5 != companion.getEmpty()) {
                            }
                            State state6222 = (State) rememberedValue5;
                            if (myVar5 == null) {
                            }
                            state4 = state3;
                            z9 = 18;
                            composer3.startReplaceGroup(-1889500886);
                            composer3.endReplaceGroup();
                            composableLambda2 = null;
                            long m2572suffixColorXeAY9LY$material3222 = textFieldColors3.m2572suffixColorXeAY9LY$material3(z8, z5, z7);
                            if (myVar6 == null) {
                            }
                            composer3.startReplaceGroup(-1888924534);
                            composer3.endReplaceGroup();
                            composableLambda3 = null;
                            final long m2569leadingIconColorXeAY9LY$material3222 = textFieldColors3.m2569leadingIconColorXeAY9LY$material3(z8, z5, z7);
                            if (myVar3 != null) {
                            }
                            final long m2575trailingIconColorXeAY9LY$material3222 = textFieldColors3.m2575trailingIconColorXeAY9LY$material3(z8, z5, z7);
                            if (myVar4 != null) {
                            }
                            final long m2573supportingTextColorXeAY9LY$material3222 = textFieldColors3.m2573supportingTextColorXeAY9LY$material3(z8, z5, z7);
                            if (myVar7 != null) {
                            }
                            i14 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                            if (i14 != i13) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final State<Float> createTransitionAnimation6 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "LabelProgress", startRestartGroup, 196608);
                    MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.FastEffects;
                    FiniteAnimationSpec value3 = MotionSchemeKt.value(motionSchemeKeyTokens2, startRestartGroup, 6);
                    TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12 = new TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1(value3, MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, startRestartGroup, 6));
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(zvVar);
                    InputPhase inputPhase72 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(-1093194547);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = iArr[inputPhase72.ordinal()];
                    if (i7 != 1) {
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf222 = Float.valueOf(f3);
                    InputPhase inputPhase822 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-1093194547);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i8 = iArr[inputPhase822.ordinal()];
                    if (i8 != 1) {
                    }
                    f4 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, 196608);
                    TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value3);
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3222 = VectorConvertersKt.getVectorConverter(zvVar);
                    InputPhase inputPhase9222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(-1258455321);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i9 = iArr[inputPhase9222.ordinal()];
                    if (i9 != 1) {
                    }
                    f5 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf32222 = Float.valueOf(f5);
                    InputPhase inputPhase102222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-1258455321);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i10 = iArr[inputPhase102222.ordinal()];
                    if (i10 != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    State createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32222, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter3222, "PrefixSuffixOpacity", startRestartGroup, 196608);
                    FiniteAnimationSpec value22222 = MotionSchemeKt.value(motionSchemeKeyTokens2, startRestartGroup, 6);
                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value22222);
                    InputPhase inputPhase112222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-12973394);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (iArr[inputPhase2.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ColorSpace m4765getColorSpaceimpl3222 = Color.m4765getColorSpaceimpl(j3);
                    changed = startRestartGroup.changed(m4765getColorSpaceimpl3222);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl3222);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    TwoWayConverter twoWayConverter3222 = (TwoWayConverter) rememberedValue;
                    InputPhase inputPhase122222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(-12973394);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (iArr[inputPhase122222.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Color m4751boximpl3222 = Color.m4751boximpl(j4);
                    InputPhase inputPhase132222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-12973394);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (iArr[inputPhase3.ordinal()] == 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final State<Color> createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, color, Color.m4751boximpl(j), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter3222, "LabelTextStyleColor", startRestartGroup, 196608);
                    TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value22222);
                    startRestartGroup.startReplaceGroup(-464752477);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ColorSpace m4765getColorSpaceimpl22222 = Color.m4765getColorSpaceimpl(m2568labelColorXeAY9LY$material3);
                    changed2 = startRestartGroup.changed(m4765getColorSpaceimpl22222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl22222);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    TwoWayConverter twoWayConverter22222 = (TwoWayConverter) rememberedValue2;
                    startRestartGroup.startReplaceGroup(-464752477);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Color m4751boximpl22222 = Color.m4751boximpl(m2568labelColorXeAY9LY$material3);
                    startRestartGroup.startReplaceGroup(-464752477);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final State<Color> createTransitionAnimation52222 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl22222, Color.m4751boximpl(m2568labelColorXeAY9LY$material3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter22222, "LabelContentColor", startRestartGroup, 196608);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (rememberedValue3 == companion.getEmpty()) {
                    }
                    final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$12222 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                    ComposableLambda composableLambda62222 = null;
                    if (nyVar != null) {
                    }
                    ComposableLambda composableLambda72222 = composableLambda62222;
                    long m2570placeholderColorXeAY9LY$material32222 = textFieldColors3.m2570placeholderColorXeAY9LY$material3(z8, z5, z7);
                    rememberedValue4 = composer3.rememberedValue();
                    if (rememberedValue4 == companion.getEmpty()) {
                    }
                    State state52222 = (State) rememberedValue4;
                    if (myVar2 == null) {
                    }
                    composer3.startReplaceGroup(-1890217110);
                    composer3.endReplaceGroup();
                    composableLambda = null;
                    long m2571prefixColorXeAY9LY$material32222 = textFieldColors3.m2571prefixColorXeAY9LY$material3(z8, z5, z7);
                    rememberedValue5 = composer3.rememberedValue();
                    int i242222 = 18;
                    if (rememberedValue5 != companion.getEmpty()) {
                    }
                    State state62222 = (State) rememberedValue5;
                    if (myVar5 == null) {
                    }
                    state4 = state3;
                    z9 = 18;
                    composer3.startReplaceGroup(-1889500886);
                    composer3.endReplaceGroup();
                    composableLambda2 = null;
                    long m2572suffixColorXeAY9LY$material32222 = textFieldColors3.m2572suffixColorXeAY9LY$material3(z8, z5, z7);
                    if (myVar6 == null) {
                    }
                    composer3.startReplaceGroup(-1888924534);
                    composer3.endReplaceGroup();
                    composableLambda3 = null;
                    final long m2569leadingIconColorXeAY9LY$material32222 = textFieldColors3.m2569leadingIconColorXeAY9LY$material3(z8, z5, z7);
                    if (myVar3 != null) {
                    }
                    final long m2575trailingIconColorXeAY9LY$material32222 = textFieldColors3.m2575trailingIconColorXeAY9LY$material3(z8, z5, z7);
                    if (myVar4 != null) {
                    }
                    final long m2573supportingTextColorXeAY9LY$material32222 = textFieldColors3.m2573supportingTextColorXeAY9LY$material3(z8, z5, z7);
                    if (myVar7 != null) {
                    }
                    i14 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                    if (i14 != i13) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf4 = Float.valueOf(f);
            InputPhase inputPhase62 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1436405362);
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = iArr[inputPhase.ordinal()];
            if (i6 != 1) {
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State<Float> createTransitionAnimation62 = TransitionKt.createTransitionAnimation(updateTransition, valueOf4, Float.valueOf(f2), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter, "LabelProgress", startRestartGroup, 196608);
            MotionSchemeKeyTokens motionSchemeKeyTokens22 = MotionSchemeKeyTokens.FastEffects;
            FiniteAnimationSpec value32 = MotionSchemeKt.value(motionSchemeKeyTokens22, startRestartGroup, 6);
            TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122 = new TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1(value32, MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, startRestartGroup, 6));
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(zvVar);
            InputPhase inputPhase722 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-1093194547);
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = iArr[inputPhase722.ordinal()];
            if (i7 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf2222 = Float.valueOf(f3);
            InputPhase inputPhase8222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1093194547);
            if (ComposerKt.isTraceInProgress()) {
            }
            i8 = iArr[inputPhase8222.ordinal()];
            if (i8 != 1) {
            }
            f4 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, 196608);
            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value32);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter32222 = VectorConvertersKt.getVectorConverter(zvVar);
            InputPhase inputPhase92222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-1258455321);
            if (ComposerKt.isTraceInProgress()) {
            }
            i9 = iArr[inputPhase92222.ordinal()];
            if (i9 != 1) {
            }
            f5 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf322222 = Float.valueOf(f5);
            InputPhase inputPhase1022222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1258455321);
            if (ComposerKt.isTraceInProgress()) {
            }
            i10 = iArr[inputPhase1022222.ordinal()];
            if (i10 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation322222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322222, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), vectorConverter32222, "PrefixSuffixOpacity", startRestartGroup, 196608);
            FiniteAnimationSpec value222222 = MotionSchemeKt.value(motionSchemeKeyTokens22, startRestartGroup, 6);
            TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value222222);
            InputPhase inputPhase1122222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-12973394);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (iArr[inputPhase2.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m4765getColorSpaceimpl32222 = Color.m4765getColorSpaceimpl(j3);
            changed = startRestartGroup.changed(m4765getColorSpaceimpl32222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl32222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            TwoWayConverter twoWayConverter32222 = (TwoWayConverter) rememberedValue;
            InputPhase inputPhase1222222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-12973394);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (iArr[inputPhase1222222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Color m4751boximpl32222 = Color.m4751boximpl(j4);
            InputPhase inputPhase1322222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-12973394);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (iArr[inputPhase3.ordinal()] == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State<Color> createTransitionAnimation422222 = TransitionKt.createTransitionAnimation(updateTransition, color, Color.m4751boximpl(j), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter32222, "LabelTextStyleColor", startRestartGroup, 196608);
            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value222222);
            startRestartGroup.startReplaceGroup(-464752477);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m4765getColorSpaceimpl222222 = Color.m4765getColorSpaceimpl(m2568labelColorXeAY9LY$material3);
            changed2 = startRestartGroup.changed(m4765getColorSpaceimpl222222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(companion2).invoke(m4765getColorSpaceimpl222222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            TwoWayConverter twoWayConverter222222 = (TwoWayConverter) rememberedValue2;
            startRestartGroup.startReplaceGroup(-464752477);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Color m4751boximpl222222 = Color.m4751boximpl(m2568labelColorXeAY9LY$material3);
            startRestartGroup.startReplaceGroup(-464752477);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State<Color> createTransitionAnimation522222 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl222222, Color.m4751boximpl(m2568labelColorXeAY9LY$material3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter222222, "LabelContentColor", startRestartGroup, 196608);
            rememberedValue3 = startRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (rememberedValue3 == companion.getEmpty()) {
            }
            final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$122222 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
            ComposableLambda composableLambda622222 = null;
            if (nyVar != null) {
            }
            ComposableLambda composableLambda722222 = composableLambda622222;
            long m2570placeholderColorXeAY9LY$material322222 = textFieldColors3.m2570placeholderColorXeAY9LY$material3(z8, z5, z7);
            rememberedValue4 = composer3.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
            }
            State state522222 = (State) rememberedValue4;
            if (myVar2 == null) {
            }
            composer3.startReplaceGroup(-1890217110);
            composer3.endReplaceGroup();
            composableLambda = null;
            long m2571prefixColorXeAY9LY$material322222 = textFieldColors3.m2571prefixColorXeAY9LY$material3(z8, z5, z7);
            rememberedValue5 = composer3.rememberedValue();
            int i2422222 = 18;
            if (rememberedValue5 != companion.getEmpty()) {
            }
            State state622222 = (State) rememberedValue5;
            if (myVar5 == null) {
            }
            state4 = state3;
            z9 = 18;
            composer3.startReplaceGroup(-1889500886);
            composer3.endReplaceGroup();
            composableLambda2 = null;
            long m2572suffixColorXeAY9LY$material322222 = textFieldColors3.m2572suffixColorXeAY9LY$material3(z8, z5, z7);
            if (myVar6 == null) {
            }
            composer3.startReplaceGroup(-1888924534);
            composer3.endReplaceGroup();
            composableLambda3 = null;
            final long m2569leadingIconColorXeAY9LY$material322222 = textFieldColors3.m2569leadingIconColorXeAY9LY$material3(z8, z5, z7);
            if (myVar3 != null) {
            }
            final long m2575trailingIconColorXeAY9LY$material322222 = textFieldColors3.m2575trailingIconColorXeAY9LY$material3(z8, z5, z7);
            if (myVar4 != null) {
            }
            final long m2573supportingTextColorXeAY9LY$material322222 = textFieldColors3.m2573supportingTextColorXeAY9LY$material3(z8, z5, z7);
            if (myVar7 != null) {
            }
            i14 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
            if (i14 != i13) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: bu0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 CommonDecorationBox$lambda$19;
                    int intValue = ((Integer) obj2).intValue();
                    CommonDecorationBox$lambda$19 = TextFieldImplKt.CommonDecorationBox$lambda$19(TextFieldType.this, charSequence, myVar, textFieldLabelPosition, nyVar, myVar2, myVar3, myVar4, myVar5, myVar6, myVar7, z, z2, z3, interactionSource, paddingValues, textFieldColors, myVar8, i, i2, (Composer) obj, intValue);
                    return CommonDecorationBox$lambda$19;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonDecorationBox$lambda$18$lambda$10$lambda$9(State state) {
        return ((Number) state.getValue()).floatValue() > 0.0f;
    }

    private static final boolean CommonDecorationBox$lambda$18$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonDecorationBox$lambda$18$lambda$17$lambda$16(TextFieldLabelPosition textFieldLabelPosition, State state, MutableState mutableState, Size size) {
        boolean z = textFieldLabelPosition instanceof TextFieldLabelPosition.Above;
        w01 w01Var = w01.a;
        if (z) {
            return w01Var;
        }
        float floatValue = ((Number) state.getValue()).floatValue();
        float intBitsToFloat = Float.intBitsToFloat((int) (size.m4590unboximpl() >> 32)) * floatValue;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (size.m4590unboximpl() & 4294967295L)) * floatValue;
        if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m4590unboximpl() >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m4590unboximpl() & 4294967295L)) != intBitsToFloat2) {
            mutableState.setValue(Size.m4573boximpl(Size.m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L))));
        }
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonDecorationBox$lambda$18$lambda$7$lambda$6(State state) {
        return ((Number) state.getValue()).floatValue() > 0.0f;
    }

    private static final boolean CommonDecorationBox$lambda$18$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonDecorationBox$lambda$19(TextFieldType textFieldType, CharSequence charSequence, my myVar, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, my myVar8, int i, int i2, Composer composer, int i3) {
        CommonDecorationBox(textFieldType, charSequence, myVar, textFieldLabelPosition, nyVar, myVar2, myVar3, myVar4, myVar5, myVar6, myVar7, z, z2, z3, interactionSource, paddingValues, textFieldColors, myVar8, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m2985Decoration3JVO9M(long j, TextStyle textStyle, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(396611577);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(396611577, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:325)");
            }
            ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j, textStyle, myVar, startRestartGroup, i2 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ih0(j, textStyle, myVar, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    public static final void m2986DecorationIv8Zu3U(long j, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(590397809);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590397809, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:330)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j)), myVar, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new qh0(j, myVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Decoration_3J_VO9M$lambda$20(long j, TextStyle textStyle, my myVar, int i, Composer composer, int i2) {
        m2985Decoration3JVO9M(j, textStyle, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Decoration_Iv8Zu3U$lambda$21(long j, my myVar, int i, Composer composer, int i2) {
        m2986DecorationIv8Zu3U(j, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x013c, code lost:
    
        if (r30 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0100, code lost:
    
        if (r30 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01da, code lost:
    
        if (r30 != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024a  */
    /* renamed from: TextFieldTransitionScope-Jy8F4Js, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2987TextFieldTransitionScopeJy8F4Js(InputPhase inputPhase, long j, long j2, long j3, boolean z, ry ryVar, Composer composer, int i) {
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        float f5;
        int i6;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        Transition updateTransition = TransitionKt.updateTransition(inputPhase, "TextFieldInputState", composer, (i & 14) | 48, 0);
        TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1 = new TextFieldImplKt$TextFieldTransitionScope$labelProgress$1(MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6));
        zv zvVar = zv.a;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zvVar);
        InputPhase inputPhase2 = (InputPhase) updateTransition.getCurrentState();
        composer.startReplaceGroup(-1436405362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i7 = iArr[inputPhase2.ordinal()];
        float f6 = 0.0f;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    o.n();
                    return;
                }
            } else if (z) {
                f = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf = Float.valueOf(f);
                InputPhase inputPhase3 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(-1436405362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
                }
                i2 = iArr[inputPhase3.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            o.n();
                            return;
                        }
                    } else if (z) {
                        f2 = 0.0f;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter, "LabelProgress", composer, 196608);
                        MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastEffects;
                        FiniteAnimationSpec value = MotionSchemeKt.value(motionSchemeKeyTokens, composer, 6);
                        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 = new TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1(value, MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, composer, 6));
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(zvVar);
                        InputPhase inputPhase4 = (InputPhase) updateTransition.getCurrentState();
                        composer.startReplaceGroup(-1093194547);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
                        }
                        i3 = iArr[inputPhase4.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    o.n();
                                    return;
                                }
                            }
                            f3 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceGroup();
                            Float valueOf2 = Float.valueOf(f3);
                            InputPhase inputPhase5 = (InputPhase) updateTransition.getTargetState();
                            composer.startReplaceGroup(-1093194547);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
                            }
                            i4 = iArr[inputPhase5.ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        o.n();
                                        return;
                                    }
                                }
                                f4 = 0.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer.endReplaceGroup();
                                State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter2, "PlaceholderOpacity", composer, 196608);
                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value);
                                TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(zvVar);
                                InputPhase inputPhase6 = (InputPhase) updateTransition.getCurrentState();
                                composer.startReplaceGroup(-1258455321);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
                                }
                                i5 = iArr[inputPhase6.ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            o.n();
                                            return;
                                        }
                                    } else if (z) {
                                        f5 = 0.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        Float valueOf3 = Float.valueOf(f5);
                                        InputPhase inputPhase7 = (InputPhase) updateTransition.getTargetState();
                                        composer.startReplaceGroup(-1258455321);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
                                        }
                                        i6 = iArr[inputPhase7.ordinal()];
                                        if (i6 != 1) {
                                            if (i6 != 2) {
                                                if (i6 != 3) {
                                                    o.n();
                                                    return;
                                                }
                                            }
                                        }
                                        f6 = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter3, "PrefixSuffixOpacity", composer, 196608);
                                        FiniteAnimationSpec value2 = MotionSchemeKt.value(motionSchemeKeyTokens, composer, 6);
                                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value2);
                                        InputPhase inputPhase8 = (InputPhase) updateTransition.getTargetState();
                                        composer.startReplaceGroup(-12973394);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                        }
                                        long j4 = iArr[inputPhase8.ordinal()] != 1 ? j : j2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        ColorSpace m4765getColorSpaceimpl = Color.m4765getColorSpaceimpl(j4);
                                        changed = composer.changed(m4765getColorSpaceimpl);
                                        rememberedValue = composer.rememberedValue();
                                        if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl);
                                            composer.updateRememberedValue(rememberedValue);
                                        }
                                        TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                        InputPhase inputPhase9 = (InputPhase) updateTransition.getCurrentState();
                                        composer.startReplaceGroup(-12973394);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                        }
                                        long j5 = iArr[inputPhase9.ordinal()] != 1 ? j : j2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        Color m4751boximpl = Color.m4751boximpl(j5);
                                        InputPhase inputPhase10 = (InputPhase) updateTransition.getTargetState();
                                        composer.startReplaceGroup(-12973394);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                        }
                                        long j6 = iArr[inputPhase10.ordinal()] != 1 ? j : j2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl, Color.m4751boximpl(j6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter, "LabelTextStyleColor", composer, 196608);
                                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value2);
                                        composer.startReplaceGroup(-464752477);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        ColorSpace m4765getColorSpaceimpl2 = Color.m4765getColorSpaceimpl(j3);
                                        changed2 = composer.changed(m4765getColorSpaceimpl2);
                                        rememberedValue2 = composer.rememberedValue();
                                        if (!changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl2);
                                            composer.updateRememberedValue(rememberedValue2);
                                        }
                                        TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue2;
                                        composer.startReplaceGroup(-464752477);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        Color m4751boximpl2 = Color.m4751boximpl(j3);
                                        composer.startReplaceGroup(-464752477);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        ryVar.invoke(createTransitionAnimation, createTransitionAnimation4, TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl2, Color.m4751boximpl(j3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter2, "LabelContentColor", composer, 196608), createTransitionAnimation2, createTransitionAnimation3, composer, Integer.valueOf(i & 458752));
                                    }
                                }
                                f5 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                Float valueOf32 = Float.valueOf(f5);
                                InputPhase inputPhase72 = (InputPhase) updateTransition.getTargetState();
                                composer.startReplaceGroup(-1258455321);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i6 = iArr[inputPhase72.ordinal()];
                                if (i6 != 1) {
                                }
                                f6 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter3, "PrefixSuffixOpacity", composer, 196608);
                                FiniteAnimationSpec value22 = MotionSchemeKt.value(motionSchemeKeyTokens, composer, 6);
                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value22);
                                InputPhase inputPhase82 = (InputPhase) updateTransition.getTargetState();
                                composer.startReplaceGroup(-12973394);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (iArr[inputPhase82.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                ColorSpace m4765getColorSpaceimpl3 = Color.m4765getColorSpaceimpl(j4);
                                changed = composer.changed(m4765getColorSpaceimpl3);
                                rememberedValue = composer.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl3);
                                composer.updateRememberedValue(rememberedValue);
                                TwoWayConverter twoWayConverter3 = (TwoWayConverter) rememberedValue;
                                InputPhase inputPhase92 = (InputPhase) updateTransition.getCurrentState();
                                composer.startReplaceGroup(-12973394);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (iArr[inputPhase92.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                Color m4751boximpl3 = Color.m4751boximpl(j5);
                                InputPhase inputPhase102 = (InputPhase) updateTransition.getTargetState();
                                composer.startReplaceGroup(-12973394);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (iArr[inputPhase102.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                State createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl3, Color.m4751boximpl(j6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter3, "LabelTextStyleColor", composer, 196608);
                                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value22);
                                composer.startReplaceGroup(-464752477);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                ColorSpace m4765getColorSpaceimpl22 = Color.m4765getColorSpaceimpl(j3);
                                changed2 = composer.changed(m4765getColorSpaceimpl22);
                                rememberedValue2 = composer.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl22);
                                composer.updateRememberedValue(rememberedValue2);
                                TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue2;
                                composer.startReplaceGroup(-464752477);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                Color m4751boximpl22 = Color.m4751boximpl(j3);
                                composer.startReplaceGroup(-464752477);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                ryVar.invoke(createTransitionAnimation, createTransitionAnimation42, TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl22, Color.m4751boximpl(j3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$12.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter22, "LabelContentColor", composer, 196608), createTransitionAnimation2, createTransitionAnimation32, composer, Integer.valueOf(i & 458752));
                            }
                            f4 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter2, "PlaceholderOpacity", composer, 196608);
                            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value);
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(zvVar);
                            InputPhase inputPhase62 = (InputPhase) updateTransition.getCurrentState();
                            composer.startReplaceGroup(-1258455321);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i5 = iArr[inputPhase62.ordinal()];
                            if (i5 != 1) {
                            }
                            f5 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            Float valueOf322 = Float.valueOf(f5);
                            InputPhase inputPhase722 = (InputPhase) updateTransition.getTargetState();
                            composer.startReplaceGroup(-1258455321);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = iArr[inputPhase722.ordinal()];
                            if (i6 != 1) {
                            }
                            f6 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter32, "PrefixSuffixOpacity", composer, 196608);
                            FiniteAnimationSpec value222 = MotionSchemeKt.value(motionSchemeKeyTokens, composer, 6);
                            TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value222);
                            InputPhase inputPhase822 = (InputPhase) updateTransition.getTargetState();
                            composer.startReplaceGroup(-12973394);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (iArr[inputPhase822.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            ColorSpace m4765getColorSpaceimpl32 = Color.m4765getColorSpaceimpl(j4);
                            changed = composer.changed(m4765getColorSpaceimpl32);
                            rememberedValue = composer.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl32);
                            composer.updateRememberedValue(rememberedValue);
                            TwoWayConverter twoWayConverter32 = (TwoWayConverter) rememberedValue;
                            InputPhase inputPhase922 = (InputPhase) updateTransition.getCurrentState();
                            composer.startReplaceGroup(-12973394);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (iArr[inputPhase922.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            Color m4751boximpl32 = Color.m4751boximpl(j5);
                            InputPhase inputPhase1022 = (InputPhase) updateTransition.getTargetState();
                            composer.startReplaceGroup(-12973394);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (iArr[inputPhase1022.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            State createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl32, Color.m4751boximpl(j6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter32, "LabelTextStyleColor", composer, 196608);
                            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value222);
                            composer.startReplaceGroup(-464752477);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            ColorSpace m4765getColorSpaceimpl222 = Color.m4765getColorSpaceimpl(j3);
                            changed2 = composer.changed(m4765getColorSpaceimpl222);
                            rememberedValue2 = composer.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl222);
                            composer.updateRememberedValue(rememberedValue2);
                            TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue2;
                            composer.startReplaceGroup(-464752477);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            Color m4751boximpl222 = Color.m4751boximpl(j3);
                            composer.startReplaceGroup(-464752477);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            ryVar.invoke(createTransitionAnimation, createTransitionAnimation422, TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl222, Color.m4751boximpl(j3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$122.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter222, "LabelContentColor", composer, 196608), createTransitionAnimation22, createTransitionAnimation322, composer, Integer.valueOf(i & 458752));
                        }
                        f3 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        Float valueOf22 = Float.valueOf(f3);
                        InputPhase inputPhase52 = (InputPhase) updateTransition.getTargetState();
                        composer.startReplaceGroup(-1093194547);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i4 = iArr[inputPhase52.ordinal()];
                        if (i4 != 1) {
                        }
                        f4 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter2, "PlaceholderOpacity", composer, 196608);
                        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value);
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(zvVar);
                        InputPhase inputPhase622 = (InputPhase) updateTransition.getCurrentState();
                        composer.startReplaceGroup(-1258455321);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i5 = iArr[inputPhase622.ordinal()];
                        if (i5 != 1) {
                        }
                        f5 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        Float valueOf3222 = Float.valueOf(f5);
                        InputPhase inputPhase7222 = (InputPhase) updateTransition.getTargetState();
                        composer.startReplaceGroup(-1258455321);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i6 = iArr[inputPhase7222.ordinal()];
                        if (i6 != 1) {
                        }
                        f6 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3222, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter322, "PrefixSuffixOpacity", composer, 196608);
                        FiniteAnimationSpec value2222 = MotionSchemeKt.value(motionSchemeKeyTokens, composer, 6);
                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value2222);
                        InputPhase inputPhase8222 = (InputPhase) updateTransition.getTargetState();
                        composer.startReplaceGroup(-12973394);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (iArr[inputPhase8222.ordinal()] != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        ColorSpace m4765getColorSpaceimpl322 = Color.m4765getColorSpaceimpl(j4);
                        changed = composer.changed(m4765getColorSpaceimpl322);
                        rememberedValue = composer.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl322);
                        composer.updateRememberedValue(rememberedValue);
                        TwoWayConverter twoWayConverter322 = (TwoWayConverter) rememberedValue;
                        InputPhase inputPhase9222 = (InputPhase) updateTransition.getCurrentState();
                        composer.startReplaceGroup(-12973394);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (iArr[inputPhase9222.ordinal()] != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        Color m4751boximpl322 = Color.m4751boximpl(j5);
                        InputPhase inputPhase10222 = (InputPhase) updateTransition.getTargetState();
                        composer.startReplaceGroup(-12973394);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (iArr[inputPhase10222.ordinal()] != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl322, Color.m4751boximpl(j6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter322, "LabelTextStyleColor", composer, 196608);
                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value2222);
                        composer.startReplaceGroup(-464752477);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        ColorSpace m4765getColorSpaceimpl2222 = Color.m4765getColorSpaceimpl(j3);
                        changed2 = composer.changed(m4765getColorSpaceimpl2222);
                        rememberedValue2 = composer.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl2222);
                        composer.updateRememberedValue(rememberedValue2);
                        TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue2;
                        composer.startReplaceGroup(-464752477);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        Color m4751boximpl2222 = Color.m4751boximpl(j3);
                        composer.startReplaceGroup(-464752477);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        ryVar.invoke(createTransitionAnimation, createTransitionAnimation4222, TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl2222, Color.m4751boximpl(j3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter2222, "LabelContentColor", composer, 196608), createTransitionAnimation222, createTransitionAnimation3222, composer, Integer.valueOf(i & 458752));
                    }
                }
                f2 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter, "LabelProgress", composer, 196608);
                MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.FastEffects;
                FiniteAnimationSpec value3 = MotionSchemeKt.value(motionSchemeKeyTokens2, composer, 6);
                TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12 = new TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1(value3, MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, composer, 6));
                TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(zvVar);
                InputPhase inputPhase42 = (InputPhase) updateTransition.getCurrentState();
                composer.startReplaceGroup(-1093194547);
                if (ComposerKt.isTraceInProgress()) {
                }
                i3 = iArr[inputPhase42.ordinal()];
                if (i3 != 1) {
                }
                f3 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Float valueOf222 = Float.valueOf(f3);
                InputPhase inputPhase522 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(-1093194547);
                if (ComposerKt.isTraceInProgress()) {
                }
                i4 = iArr[inputPhase522.ordinal()];
                if (i4 != 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter22, "PlaceholderOpacity", composer, 196608);
                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value3);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter3222 = VectorConvertersKt.getVectorConverter(zvVar);
                InputPhase inputPhase6222 = (InputPhase) updateTransition.getCurrentState();
                composer.startReplaceGroup(-1258455321);
                if (ComposerKt.isTraceInProgress()) {
                }
                i5 = iArr[inputPhase6222.ordinal()];
                if (i5 != 1) {
                }
                f5 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Float valueOf32222 = Float.valueOf(f5);
                InputPhase inputPhase72222 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(-1258455321);
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = iArr[inputPhase72222.ordinal()];
                if (i6 != 1) {
                }
                f6 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32222, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter3222, "PrefixSuffixOpacity", composer, 196608);
                FiniteAnimationSpec value22222 = MotionSchemeKt.value(motionSchemeKeyTokens2, composer, 6);
                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value22222);
                InputPhase inputPhase82222 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(-12973394);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (iArr[inputPhase82222.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                ColorSpace m4765getColorSpaceimpl3222 = Color.m4765getColorSpaceimpl(j4);
                changed = composer.changed(m4765getColorSpaceimpl3222);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl3222);
                composer.updateRememberedValue(rememberedValue);
                TwoWayConverter twoWayConverter3222 = (TwoWayConverter) rememberedValue;
                InputPhase inputPhase92222 = (InputPhase) updateTransition.getCurrentState();
                composer.startReplaceGroup(-12973394);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (iArr[inputPhase92222.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Color m4751boximpl3222 = Color.m4751boximpl(j5);
                InputPhase inputPhase102222 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(-12973394);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (iArr[inputPhase102222.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl3222, Color.m4751boximpl(j6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter3222, "LabelTextStyleColor", composer, 196608);
                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value22222);
                composer.startReplaceGroup(-464752477);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                ColorSpace m4765getColorSpaceimpl22222 = Color.m4765getColorSpaceimpl(j3);
                changed2 = composer.changed(m4765getColorSpaceimpl22222);
                rememberedValue2 = composer.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl22222);
                composer.updateRememberedValue(rememberedValue2);
                TwoWayConverter twoWayConverter22222 = (TwoWayConverter) rememberedValue2;
                composer.startReplaceGroup(-464752477);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Color m4751boximpl22222 = Color.m4751boximpl(j3);
                composer.startReplaceGroup(-464752477);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                ryVar.invoke(createTransitionAnimation5, createTransitionAnimation42222, TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl22222, Color.m4751boximpl(j3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter22222, "LabelContentColor", composer, 196608), createTransitionAnimation2222, createTransitionAnimation32222, composer, Integer.valueOf(i & 458752));
            }
        }
        f = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf4 = Float.valueOf(f);
        InputPhase inputPhase32 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(-1436405362);
        if (ComposerKt.isTraceInProgress()) {
        }
        i2 = iArr[inputPhase32.ordinal()];
        if (i2 != 1) {
        }
        f2 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, valueOf4, Float.valueOf(f2), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter, "LabelProgress", composer, 196608);
        MotionSchemeKeyTokens motionSchemeKeyTokens22 = MotionSchemeKeyTokens.FastEffects;
        FiniteAnimationSpec value32 = MotionSchemeKt.value(motionSchemeKeyTokens22, composer, 6);
        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122 = new TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1(value32, MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, composer, 6));
        TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(zvVar);
        InputPhase inputPhase422 = (InputPhase) updateTransition.getCurrentState();
        composer.startReplaceGroup(-1093194547);
        if (ComposerKt.isTraceInProgress()) {
        }
        i3 = iArr[inputPhase422.ordinal()];
        if (i3 != 1) {
        }
        f3 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf2222 = Float.valueOf(f3);
        InputPhase inputPhase5222 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(-1093194547);
        if (ComposerKt.isTraceInProgress()) {
        }
        i4 = iArr[inputPhase5222.ordinal()];
        if (i4 != 1) {
        }
        f4 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, Float.valueOf(f4), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter222, "PlaceholderOpacity", composer, 196608);
        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222 = new TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(value32);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter32222 = VectorConvertersKt.getVectorConverter(zvVar);
        InputPhase inputPhase62222 = (InputPhase) updateTransition.getCurrentState();
        composer.startReplaceGroup(-1258455321);
        if (ComposerKt.isTraceInProgress()) {
        }
        i5 = iArr[inputPhase62222.ordinal()];
        if (i5 != 1) {
        }
        f5 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf322222 = Float.valueOf(f5);
        InputPhase inputPhase722222 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(-1258455321);
        if (ComposerKt.isTraceInProgress()) {
        }
        i6 = iArr[inputPhase722222.ordinal()];
        if (i6 != 1) {
        }
        f6 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation322222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322222, Float.valueOf(f6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), vectorConverter32222, "PrefixSuffixOpacity", composer, 196608);
        FiniteAnimationSpec value222222 = MotionSchemeKt.value(motionSchemeKeyTokens22, composer, 6);
        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222 = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1(value222222);
        InputPhase inputPhase822222 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(-12973394);
        if (ComposerKt.isTraceInProgress()) {
        }
        if (iArr[inputPhase822222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        ColorSpace m4765getColorSpaceimpl32222 = Color.m4765getColorSpaceimpl(j4);
        changed = composer.changed(m4765getColorSpaceimpl32222);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl32222);
        composer.updateRememberedValue(rememberedValue);
        TwoWayConverter twoWayConverter32222 = (TwoWayConverter) rememberedValue;
        InputPhase inputPhase922222 = (InputPhase) updateTransition.getCurrentState();
        composer.startReplaceGroup(-12973394);
        if (ComposerKt.isTraceInProgress()) {
        }
        if (iArr[inputPhase922222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Color m4751boximpl32222 = Color.m4751boximpl(j5);
        InputPhase inputPhase1022222 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(-12973394);
        if (ComposerKt.isTraceInProgress()) {
        }
        if (iArr[inputPhase1022222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation422222 = TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl32222, Color.m4751boximpl(j6), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter32222, "LabelTextStyleColor", composer, 196608);
        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222 = new TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(value222222);
        composer.startReplaceGroup(-464752477);
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        ColorSpace m4765getColorSpaceimpl222222 = Color.m4765getColorSpaceimpl(j3);
        changed2 = composer.changed(m4765getColorSpaceimpl222222);
        rememberedValue2 = composer.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl222222);
        composer.updateRememberedValue(rememberedValue2);
        TwoWayConverter twoWayConverter222222 = (TwoWayConverter) rememberedValue2;
        composer.startReplaceGroup(-464752477);
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Color m4751boximpl222222 = Color.m4751boximpl(j3);
        composer.startReplaceGroup(-464752477);
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        ryVar.invoke(createTransitionAnimation52, createTransitionAnimation422222, TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl222222, Color.m4751boximpl(j3), (FiniteAnimationSpec) textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222.invoke((Object) updateTransition.getSegment(), (Object) composer, (Object) 0), twoWayConverter222222, "LabelContentColor", composer, 196608), createTransitionAnimation22222, createTransitionAnimation322222, composer, Integer.valueOf(i & 458752));
    }

    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m2990animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, boolean z3, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        State<Color> rememberUpdatedState;
        State<Dp> rememberUpdatedState2;
        Composer composer2 = composer;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2047013045, i, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:472)");
        }
        long m2567indicatorColorXeAY9LY$material3 = textFieldColors.m2567indicatorColorXeAY9LY$material3(z, z2, z3);
        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer2, 6);
        if (z) {
            composer2.startReplaceGroup(-1674507999);
            rememberUpdatedState = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(m2567indicatorColorXeAY9LY$material3, value, null, null, composer, 0, 12);
            composer2 = composer;
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(-1674427244);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(m2567indicatorColorXeAY9LY$material3), composer2, 0);
            composer2.endReplaceGroup();
        }
        State<Color> state = rememberUpdatedState;
        FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
        if (z) {
            composer2.startReplaceGroup(-1674245832);
            rememberUpdatedState2 = AnimateAsStateKt.m127animateDpAsStateAjpBEmI(z3 ? f : f2, value2, null, null, composer2, 0, 12);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(-1674063769);
            rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Dp.m7609boximpl(f2), composer2, (i >> 15) & 14);
            composer2.endReplaceGroup();
        }
        State<BorderStroke> rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m253BorderStrokecXLIe8U(rememberUpdatedState2.getValue().m7625unboximpl(), state.getValue().m4771unboximpl()), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState3;
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new wd(str, 21), 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 defaultErrorSemantics$lambda$22(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
        return w01.a;
    }

    public static final float getAboveLabelBottomPadding() {
        return AboveLabelBottomPadding;
    }

    public static final float getAboveLabelHorizontalPadding() {
        return AboveLabelHorizontalPadding;
    }

    public static final Alignment.Horizontal getExpandedAlignment(TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return ((TextFieldLabelPosition.Above) textFieldLabelPosition).getAlignment();
        }
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).getExpandedAlignment();
        }
        o.e(textFieldLabelPosition, "Unknown position: ");
        return null;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final Alignment.Horizontal getMinimizedAlignment(TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return ((TextFieldLabelPosition.Above) textFieldLabelPosition).getAlignment();
        }
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).getMinimizedAlignment();
        }
        o.e(textFieldLabelPosition, "Unknown position: ");
        return null;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    private static final boolean getShowExpandedLabel(TextFieldLabelPosition textFieldLabelPosition) {
        return (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) && !((TextFieldLabelPosition.Attached) textFieldLabelPosition).getAlwaysMinimize();
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float minimizedLabelHalfHeight(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1251545215, i, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:527)");
        }
        long m7099getLineHeightXSAIIZE = MaterialTheme.INSTANCE.getTypography(composer, 6).getBodySmall().m7099getLineHeightXSAIIZE();
        long m3740getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m3740getBodySmallLineHeightXSAIIZE();
        if (!TextUnit.m7808isSpimpl(m7099getLineHeightXSAIIZE)) {
            m7099getLineHeightXSAIIZE = m3740getBodySmallLineHeightXSAIIZE;
        }
        float m7611constructorimpl = Dp.m7611constructorimpl(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo362toDpGaN1DYA(m7099getLineHeightXSAIIZE) / 2.0f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m7611constructorimpl;
    }

    public static final Modifier textFieldBackground(Modifier modifier, ColorProducer colorProducer, Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new te0(14, shape, colorProducer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult textFieldBackground$lambda$24(Shape shape, ColorProducer colorProducer, CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawBehind(new te0(13, shape.mo283createOutlinePq9zytI(cacheDrawScope.m4293getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope), colorProducer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 textFieldBackground$lambda$24$lambda$23(Outline outline, ColorProducer colorProducer, DrawScope drawScope) {
        OutlineKt.m5034drawOutlinewDX37Ww$default(drawScope, outline, colorProducer.mo1922invoke0d7_KjU(), 0.0f, null, null, 0, 60, null);
        return w01.a;
    }

    public static final float textFieldHorizontalIconPadding(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1986450462, i, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:520)");
        }
        float m7625unboximpl = ((Dp) composer.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl();
        if (Float.isNaN(m7625unboximpl)) {
            m7625unboximpl = Dp.m7611constructorimpl(0.0f);
        }
        float m7611constructorimpl = Dp.m7611constructorimpl(Dp.m7611constructorimpl(m7625unboximpl - SmallIconButtonTokens.INSTANCE.m3631getIconSizeD9Ej5fM()) / 2.0f);
        float m7611constructorimpl2 = Dp.m7611constructorimpl(0.0f);
        if (m7611constructorimpl < m7611constructorimpl2) {
            m7611constructorimpl = m7611constructorimpl2;
        }
        float m7611constructorimpl3 = Dp.m7611constructorimpl(m7611constructorimpl);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m7611constructorimpl3;
    }

    public static final Modifier textFieldLabelMinHeight(Modifier modifier, iy iyVar) {
        return LayoutModifierKt.layout(modifier, new x6(iyVar, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult textFieldLabelMinHeight$lambda$26(iy iyVar, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        float m7625unboximpl = ((Dp) iyVar.invoke()).m7625unboximpl();
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(constraints.m7570unboximpl(), 0, 0, ConstraintsKt.m7580constrainHeightK40F9xA(constraints.m7570unboximpl(), !Dp.m7616equalsimpl0(m7625unboximpl, Dp.Companion.m7631getUnspecifiedD9Ej5fM()) ? measureScope.mo361roundToPx0680j_4(m7625unboximpl) : 0), 0, 11, null));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new h7(9, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 textFieldLabelMinHeight$lambda$26$lambda$25(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }
}
