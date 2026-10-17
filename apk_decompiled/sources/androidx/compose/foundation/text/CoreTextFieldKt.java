package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNodeKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import defpackage.an;
import defpackage.bq;
import defpackage.cd;
import defpackage.dn;
import defpackage.dq;
import defpackage.ed;
import defpackage.f1;
import defpackage.h5;
import defpackage.hm;
import defpackage.i2;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.o;
import defpackage.oi;
import defpackage.p01;
import defpackage.p10;
import defpackage.st;
import defpackage.un;
import defpackage.uo;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.x4;
import defpackage.xm;
import defpackage.xn;
import defpackage.z5;
import defpackage.zm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Code restructure failed: missing block: B:206:0x07df, code lost:
    
        if (r10 == r5.getEmpty()) goto L406;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue textFieldValue, final ky kyVar, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, ny nyVar, TextFieldScrollerPosition textFieldScrollerPosition, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        VisualTransformation visualTransformation2;
        int i9;
        ky kyVar3;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        int i11;
        final Brush brush2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final boolean z4;
        final boolean z5;
        final ny nyVar2;
        final TextFieldScrollerPosition textFieldScrollerPosition2;
        final VisualTransformation visualTransformation3;
        final MutableInteractionSource mutableInteractionSource3;
        final ky kyVar4;
        Composer composer2;
        final TextStyle textStyle3;
        final Modifier modifier3;
        final int i26;
        final int i27;
        final ImeOptions imeOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        Composer composer3;
        Brush brush3;
        ImeOptions imeOptions3;
        KeyboardActions keyboardActions3;
        boolean z7;
        ny lambda$559628295$foundation;
        VisualTransformation visualTransformation4;
        Modifier modifier4;
        ImeOptions imeOptions4;
        boolean z8;
        final ky kyVar5;
        int i28;
        boolean z9;
        MutableInteractionSource mutableInteractionSource4;
        int i29;
        int i30;
        TextFieldScrollerPosition textFieldScrollerPosition3;
        boolean z10;
        Object rememberedValue;
        Composer.Companion companion;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean z11;
        Orientation orientation;
        Modifier modifier5;
        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter;
        int i31;
        TextStyle textStyle4;
        Orientation orientation2;
        TextFieldScrollerPosition textFieldScrollerPosition4;
        TextFieldScrollerPosition textFieldScrollerPosition5;
        AnnotatedString annotatedString;
        TextStyle textStyle5;
        Density density;
        FontFamily.Resolver resolver;
        FocusManager focusManager;
        boolean z12;
        UndoManager undoManager;
        final boolean z13;
        boolean z14;
        boolean changedInstance;
        Object rememberedValue4;
        boolean z15;
        TextInputService textInputService;
        TextFieldValue textFieldValue2;
        ImeOptions imeOptions5;
        final TextFieldSelectionManager textFieldSelectionManager;
        un unVar;
        BringIntoViewRequester bringIntoViewRequester;
        boolean changed;
        boolean z16;
        boolean z17;
        boolean z18;
        Object rememberedValue5;
        State state;
        ImeOptions imeOptions6;
        boolean changedInstance2;
        Object rememberedValue6;
        boolean changedInstance3;
        Object rememberedValue7;
        LegacyTextFieldState legacyTextFieldState;
        FocusRequester focusRequester;
        boolean z19;
        OffsetMapping offsetMapping;
        boolean z20;
        boolean changedInstance4;
        MutableInteractionSource mutableInteractionSource5;
        boolean changedInstance5;
        Object rememberedValue8;
        boolean changedInstance6;
        Object rememberedValue9;
        boolean z21;
        final LegacyTextFieldState legacyTextFieldState2;
        boolean changedInstance7;
        Object rememberedValue10;
        int i32;
        boolean changedInstance8;
        Object rememberedValue11;
        ImeOptions imeOptions7;
        boolean z22;
        boolean changed2;
        Object rememberedValue12;
        boolean changedInstance9;
        Object rememberedValue13;
        int i33;
        Composer startRestartGroup = composer.startRestartGroup(31062401);
        if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i34 = i5 & 4;
        if (i34 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i7 = i5 & 8;
            int i35 = Fields.RotationZ;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? Fields.CameraDistance : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    visualTransformation2 = visualTransformation;
                    i6 |= startRestartGroup.changed(visualTransformation2) ? Fields.Clip : 8192;
                    i9 = i5 & 32;
                    int i36 = Fields.RenderEffect;
                    if (i9 == 0) {
                        i6 |= 196608;
                        kyVar3 = kyVar2;
                    } else {
                        kyVar3 = kyVar2;
                        if ((i3 & 196608) == 0) {
                            i6 |= startRestartGroup.changedInstance(kyVar3) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    int i37 = Fields.BlendMode;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i3 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & Fields.SpotShadowColor;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        brush2 = brush;
                    } else {
                        brush2 = brush;
                        if ((i3 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(brush2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i12 = i5 & Fields.RotationX;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(z) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i13 = i5 & Fields.RotationY;
                    if (i13 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i14 = i13;
                        i6 |= startRestartGroup.changed(i) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i15 = i5 & Fields.RotationZ;
                        if (i15 != 0) {
                            i17 = i4 | 6;
                            i16 = i15;
                        } else if ((i4 & 6) == 0) {
                            i16 = i15;
                            i17 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                        } else {
                            i16 = i15;
                            i17 = i4;
                        }
                        if ((i4 & 48) == 0) {
                            if ((i5 & Fields.CameraDistance) == 0 && startRestartGroup.changed(imeOptions)) {
                                i33 = 32;
                                i17 |= i33;
                            }
                            i33 = 16;
                            i17 |= i33;
                        }
                        int i38 = i17;
                        i18 = i5 & Fields.TransformOrigin;
                        if (i18 != 0) {
                            i19 = i38 | 384;
                        } else if ((i4 & 384) == 0) {
                            i19 = i38 | (startRestartGroup.changed(keyboardActions) ? Fields.RotationX : Fields.SpotShadowColor);
                        } else {
                            i19 = i38;
                        }
                        i20 = i5 & 8192;
                        if (i20 != 0) {
                            i21 = i19 | 3072;
                        } else {
                            int i39 = i19;
                            if ((i4 & 3072) == 0) {
                                if (startRestartGroup.changed(z2)) {
                                    i35 = Fields.CameraDistance;
                                }
                                i21 = i39 | i35;
                            } else {
                                i21 = i39;
                            }
                        }
                        i22 = i5 & Fields.Clip;
                        if (i22 != 0) {
                            i23 = i21 | 24576;
                        } else {
                            int i40 = i21;
                            if ((i4 & 24576) == 0) {
                                i23 = i40 | (startRestartGroup.changed(z3) ? Fields.Clip : 8192);
                            } else {
                                i23 = i40;
                            }
                        }
                        i24 = i5 & Fields.CompositingStrategy;
                        if (i24 != 0) {
                            i23 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            if (!startRestartGroup.changedInstance(nyVar)) {
                                i36 = 65536;
                            }
                            i23 |= i36;
                        }
                        i25 = i5 & 65536;
                        if (i25 != 0) {
                            i23 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            if (startRestartGroup.changed(textFieldScrollerPosition)) {
                                i37 = 1048576;
                            }
                            i23 |= i37;
                        }
                        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i23 & 599187) != 599186, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            dq dqVar = null;
                            if ((i3 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i34 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i7 != 0) {
                                    textStyle2 = TextStyle.Companion.getDefault();
                                }
                                VisualTransformation none = i8 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation2;
                                if (i9 != 0) {
                                    Object rememberedValue14 = startRestartGroup.rememberedValue();
                                    if (rememberedValue14 == Composer.Companion.getEmpty()) {
                                        rememberedValue14 = new ed(22);
                                        startRestartGroup.updateRememberedValue(rememberedValue14);
                                    }
                                    kyVar3 = (ky) rememberedValue14;
                                }
                                if (i10 != 0) {
                                    mutableInteractionSource2 = null;
                                }
                                if (i11 != 0) {
                                    composer3 = startRestartGroup;
                                    brush3 = new SolidColor(Color.Companion.m4797getUnspecified0d7_KjU(), dqVar);
                                } else {
                                    composer3 = startRestartGroup;
                                    brush3 = brush2;
                                }
                                boolean z23 = i12 != 0 ? true : z;
                                int i41 = i14 != 0 ? Integer.MAX_VALUE : i;
                                int i42 = i16 != 0 ? 1 : i2;
                                if ((i5 & Fields.CameraDistance) != 0) {
                                    imeOptions3 = ImeOptions.Companion.getDefault();
                                    i23 &= -113;
                                } else {
                                    imeOptions3 = imeOptions;
                                }
                                keyboardActions3 = i18 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                boolean z24 = i20 != 0 ? true : z2;
                                z7 = i22 != 0 ? false : z3;
                                lambda$559628295$foundation = i24 != 0 ? ComposableSingletons$CoreTextFieldKt.INSTANCE.getLambda$559628295$foundation() : nyVar;
                                if (i25 != 0) {
                                    int i43 = i42;
                                    visualTransformation4 = none;
                                    modifier4 = modifier2;
                                    imeOptions4 = imeOptions3;
                                    z8 = z24;
                                    kyVar5 = kyVar3;
                                    i28 = i43;
                                    int i44 = i23;
                                    textFieldScrollerPosition3 = null;
                                    i30 = i44;
                                    int i45 = i41;
                                    z9 = z23;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    i29 = i45;
                                    composer3.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        z10 = z9;
                                    } else {
                                        z10 = z9;
                                        ComposerKt.traceEventStart(31062401, i6, i30, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:212)");
                                    }
                                    rememberedValue = composer3.rememberedValue();
                                    companion = Composer.Companion;
                                    if (rememberedValue == companion.getEmpty()) {
                                        rememberedValue = new FocusRequester();
                                        composer3.updateRememberedValue(rememberedValue);
                                    }
                                    final FocusRequester focusRequester2 = (FocusRequester) rememberedValue;
                                    rememberedValue2 = composer3.rememberedValue();
                                    int i46 = i6;
                                    if (rememberedValue2 == companion.getEmpty()) {
                                        rememberedValue2 = LegacyPlatformTextInputServiceAdapter_androidKt.createLegacyPlatformTextInputServiceAdapter();
                                        composer3.updateRememberedValue(rememberedValue2);
                                    }
                                    LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter2 = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
                                    rememberedValue3 = composer3.rememberedValue();
                                    Brush brush4 = brush3;
                                    if (rememberedValue3 == companion.getEmpty()) {
                                        rememberedValue3 = new TextInputService(legacyPlatformTextInputServiceAdapter2);
                                        composer3.updateRememberedValue(rememberedValue3);
                                    }
                                    final TextInputService textInputService2 = (TextInputService) rememberedValue3;
                                    Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    FontFamily.Resolver resolver2 = (FontFamily.Resolver) composer3.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                    long m1568getBackgroundColor0d7_KjU = ((TextSelectionColors) composer3.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1568getBackgroundColor0d7_KjU();
                                    FocusManager focusManager2 = (FocusManager) composer3.consume(CompositionLocalsKt.getLocalFocusManager());
                                    WindowInfo windowInfo = (WindowInfo) composer3.consume(CompositionLocalsKt.getLocalWindowInfo());
                                    SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer3.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                                    final int i47 = i28;
                                    if (i29 != 1) {
                                        z11 = z8;
                                        if (!z10 && imeOptions4.getSingleLine()) {
                                            orientation = Orientation.Horizontal;
                                            Orientation orientation3 = orientation;
                                            if (textFieldScrollerPosition3 == null) {
                                                composer3.startReplaceGroup(-213744626);
                                                Object[] objArr = {orientation3};
                                                textStyle4 = textStyle2;
                                                Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.Companion.getSaver();
                                                modifier5 = modifier4;
                                                boolean changed3 = composer3.changed(orientation3.ordinal());
                                                Object rememberedValue15 = composer3.rememberedValue();
                                                legacyPlatformTextInputServiceAdapter = legacyPlatformTextInputServiceAdapter2;
                                                if (changed3 || rememberedValue15 == companion.getEmpty()) {
                                                    i31 = i29;
                                                    orientation2 = orientation3;
                                                    rememberedValue15 = new i2(orientation2, 9);
                                                    composer3.updateRememberedValue(rememberedValue15);
                                                } else {
                                                    i31 = i29;
                                                    orientation2 = orientation3;
                                                }
                                                textFieldScrollerPosition4 = (TextFieldScrollerPosition) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue15, composer3, 0);
                                                composer3.endReplaceGroup();
                                            } else {
                                                modifier5 = modifier4;
                                                legacyPlatformTextInputServiceAdapter = legacyPlatformTextInputServiceAdapter2;
                                                i31 = i29;
                                                textStyle4 = textStyle2;
                                                orientation2 = orientation3;
                                                composer3.startReplaceGroup(-213745742);
                                                composer3.endReplaceGroup();
                                                textFieldScrollerPosition4 = textFieldScrollerPosition3;
                                            }
                                            if (textFieldScrollerPosition4.getOrientation() != orientation2) {
                                                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(orientation2 == Orientation.Vertical ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
                                            }
                                            int i48 = i46 & 14;
                                            boolean z25 = (i48 == 4) | ((i46 & 57344) == 16384);
                                            Object rememberedValue16 = composer3.rememberedValue();
                                            if (z25 || rememberedValue16 == companion.getEmpty()) {
                                                TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation4, textFieldValue.getAnnotatedString());
                                                TextRange m7309getCompositionMzsxiRA = textFieldValue.m7309getCompositionMzsxiRA();
                                                if (m7309getCompositionMzsxiRA != null) {
                                                    textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                                    TransformedText m1178applyCompositionDecoration72CqOWE = TextFieldDelegate.Companion.m1178applyCompositionDecoration72CqOWE(m7309getCompositionMzsxiRA.m7064unboximpl(), filterWithValidation);
                                                    if (m1178applyCompositionDecoration72CqOWE != null) {
                                                        rememberedValue16 = m1178applyCompositionDecoration72CqOWE;
                                                        composer3.updateRememberedValue(rememberedValue16);
                                                    }
                                                } else {
                                                    textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                                }
                                                rememberedValue16 = filterWithValidation;
                                                composer3.updateRememberedValue(rememberedValue16);
                                            } else {
                                                textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                            }
                                            TransformedText transformedText = (TransformedText) rememberedValue16;
                                            AnnotatedString text = transformedText.getText();
                                            final OffsetMapping offsetMapping2 = transformedText.getOffsetMapping();
                                            RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composer3, 0);
                                            boolean changed4 = composer3.changed(softwareKeyboardController);
                                            Object rememberedValue17 = composer3.rememberedValue();
                                            if (changed4 || rememberedValue17 == companion.getEmpty()) {
                                                annotatedString = text;
                                                textStyle5 = textStyle4;
                                                density = density2;
                                                resolver = resolver2;
                                                rememberedValue17 = new LegacyTextFieldState(new TextDelegate(text, textStyle4, 0, 0, z10, 0, density2, resolver2, null, 300, null), currentRecomposeScope, softwareKeyboardController);
                                                composer3.updateRememberedValue(rememberedValue17);
                                            } else {
                                                annotatedString = text;
                                                textStyle5 = textStyle4;
                                                density = density2;
                                                resolver = resolver2;
                                            }
                                            final LegacyTextFieldState legacyTextFieldState3 = (LegacyTextFieldState) rememberedValue17;
                                            boolean z26 = z10;
                                            KeyboardActions keyboardActions4 = keyboardActions3;
                                            legacyTextFieldState3.m1142updatefnh65Uc(textFieldValue.getAnnotatedString(), annotatedString, textStyle5, z26, density, resolver, kyVar, keyboardActions4, focusManager2, m1568getBackgroundColor0d7_KjU);
                                            legacyTextFieldState3.getProcessor().reset(textFieldValue, legacyTextFieldState3.getInputSession());
                                            Object rememberedValue18 = composer3.rememberedValue();
                                            if (rememberedValue18 == companion.getEmpty()) {
                                                focusManager = focusManager2;
                                                rememberedValue18 = new UndoManager(0, 1, null);
                                                composer3.updateRememberedValue(rememberedValue18);
                                            } else {
                                                focusManager = focusManager2;
                                            }
                                            UndoManager undoManager2 = (UndoManager) rememberedValue18;
                                            UndoManager.snapshotIfNeeded$default(undoManager2, textFieldValue, 0L, 2, null);
                                            Object rememberedValue19 = composer3.rememberedValue();
                                            if (rememberedValue19 == companion.getEmpty()) {
                                                rememberedValue19 = EffectsKt.createCompositionCoroutineScope(st.d, composer3);
                                                composer3.updateRememberedValue(rememberedValue19);
                                            }
                                            final un unVar2 = (un) rememberedValue19;
                                            Object rememberedValue20 = composer3.rememberedValue();
                                            if (rememberedValue20 == companion.getEmpty()) {
                                                rememberedValue20 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                                composer3.updateRememberedValue(rememberedValue20);
                                            }
                                            final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue20;
                                            Object rememberedValue21 = composer3.rememberedValue();
                                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                            if (rememberedValue21 == companion.getEmpty()) {
                                                rememberedValue21 = new TextFieldSelectionManager(undoManager2);
                                                composer3.updateRememberedValue(rememberedValue21);
                                            }
                                            final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) rememberedValue21;
                                            textFieldSelectionManager2.setOffsetMapping$foundation(offsetMapping2);
                                            textFieldSelectionManager2.setVisualTransformation$foundation(visualTransformation4);
                                            textFieldSelectionManager2.setOnValueChange$foundation(legacyTextFieldState3.getOnValueChange());
                                            textFieldSelectionManager2.setState$foundation(legacyTextFieldState3);
                                            textFieldSelectionManager2.setValue$foundation(textFieldValue);
                                            textFieldSelectionManager2.setClipboard$foundation((Clipboard) composer3.consume(CompositionLocalsKt.getLocalClipboard()));
                                            textFieldSelectionManager2.setCoroutineScope$foundation(unVar2);
                                            textFieldSelectionManager2.setTextToolbar((TextToolbar) composer3.consume(CompositionLocalsKt.getLocalTextToolbar()));
                                            textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) composer3.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                                            textFieldSelectionManager2.setFocusRequester(focusRequester2);
                                            boolean z27 = !z7;
                                            textFieldSelectionManager2.setEditable(z27);
                                            textFieldSelectionManager2.setEnabled(z11);
                                            if (ComposeFoundationFlags.isSmartSelectionEnabled) {
                                                composer3.startReplaceGroup(1966756105);
                                                z12 = z27;
                                                undoManager = undoManager2;
                                                textFieldSelectionManager2.setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.EditableText, textStyle5.getLocaleList(), composer3, 6));
                                            } else {
                                                z12 = z27;
                                                undoManager = undoManager2;
                                                composer3.startReplaceGroup(1951015297);
                                            }
                                            composer3.endReplaceGroup();
                                            legacyTextFieldState3.getHasFocus();
                                            Modifier.Companion companion2 = Modifier.Companion;
                                            int i49 = i30 & 7168;
                                            int i50 = i30;
                                            int i51 = i50 & 57344;
                                            boolean changedInstance10 = (i49 == 2048) | composer3.changedInstance(legacyTextFieldState3) | (i51 == 16384) | composer3.changedInstance(textInputService2) | (i48 == 4);
                                            int i52 = (i50 & 112) ^ 48;
                                            if (i52 <= 32 || !composer3.changed(imeOptions4)) {
                                                z13 = z11;
                                                if ((i50 & 48) != 32) {
                                                    z14 = false;
                                                    changedInstance = changedInstance10 | z14 | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(unVar2) | composer3.changedInstance(bringIntoViewRequester2) | composer3.changedInstance(textFieldSelectionManager2);
                                                    rememberedValue4 = composer3.rememberedValue();
                                                    if (!changedInstance || rememberedValue4 == companion.getEmpty()) {
                                                        final ImeOptions imeOptions8 = imeOptions4;
                                                        final boolean z28 = z7;
                                                        rememberedValue4 = new ky() { // from class: wm
                                                            @Override // defpackage.ky
                                                            public final Object invoke(Object obj) {
                                                                w01 CoreTextField$lambda$13$0;
                                                                CoreTextField$lambda$13$0 = CoreTextFieldKt.CoreTextField$lambda$13$0(LegacyTextFieldState.this, z13, z28, textInputService2, textFieldValue, imeOptions8, offsetMapping2, textFieldSelectionManager2, unVar2, bringIntoViewRequester2, (FocusState) obj);
                                                                return CoreTextField$lambda$13$0;
                                                            }
                                                        };
                                                        z15 = z13;
                                                        textInputService = textInputService2;
                                                        textFieldValue2 = textFieldValue;
                                                        imeOptions5 = imeOptions8;
                                                        textFieldSelectionManager = textFieldSelectionManager2;
                                                        unVar = unVar2;
                                                        bringIntoViewRequester = bringIntoViewRequester2;
                                                        composer3.updateRememberedValue(rememberedValue4);
                                                    } else {
                                                        textInputService = textInputService2;
                                                        unVar = unVar2;
                                                        bringIntoViewRequester = bringIntoViewRequester2;
                                                        imeOptions5 = imeOptions4;
                                                        z15 = z13;
                                                        textFieldSelectionManager = textFieldSelectionManager2;
                                                        textFieldValue2 = textFieldValue;
                                                    }
                                                    final VisualTransformation visualTransformation5 = visualTransformation4;
                                                    Modifier textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z15, focusRequester2, mutableInteractionSource6, (ky) rememberedValue4);
                                                    final boolean z29 = z15;
                                                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z15 || z7) ? false : true), composer3, 0);
                                                    changed = composer3.changed(rememberUpdatedState) | composer3.changedInstance(legacyTextFieldState3) | composer3.changedInstance(textInputService) | composer3.changedInstance(textFieldSelectionManager);
                                                    if (i52 > 32 || !composer3.changed(imeOptions5)) {
                                                        z16 = changed;
                                                        if ((i50 & 48) != 32) {
                                                            z17 = false;
                                                            z18 = z16 | z17;
                                                            rememberedValue5 = composer3.rememberedValue();
                                                            if (!z18 || rememberedValue5 == companion.getEmpty()) {
                                                                rememberedValue5 = new CoreTextFieldKt$CoreTextField$5$1(legacyTextFieldState3, rememberUpdatedState, textInputService, textFieldSelectionManager, imeOptions5, null);
                                                                state = rememberUpdatedState;
                                                                composer3.updateRememberedValue(rememberedValue5);
                                                            } else {
                                                                state = rememberUpdatedState;
                                                            }
                                                            State state2 = state;
                                                            imeOptions6 = imeOptions5;
                                                            EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue5, composer3, 6);
                                                            changedInstance2 = composer3.changedInstance(legacyTextFieldState3);
                                                            rememberedValue6 = composer3.rememberedValue();
                                                            if (!changedInstance2 || rememberedValue6 == companion.getEmpty()) {
                                                                rememberedValue6 = new xm(legacyTextFieldState3, 0);
                                                                composer3.updateRememberedValue(rememberedValue6);
                                                            }
                                                            Modifier updateSelectionTouchMode = SelectionGesturesKt.updateSelectionTouchMode(companion2, (ky) rememberedValue6);
                                                            changedInstance3 = composer3.changedInstance(legacyTextFieldState3) | (i51 == 16384) | (i49 == 2048) | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(textFieldSelectionManager);
                                                            rememberedValue7 = composer3.rememberedValue();
                                                            if (!changedInstance3 || rememberedValue7 == companion.getEmpty()) {
                                                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                                                final boolean z30 = z7;
                                                                rememberedValue7 = new ky() { // from class: ym
                                                                    @Override // defpackage.ky
                                                                    public final Object invoke(Object obj) {
                                                                        w01 CoreTextField$lambda$17$0;
                                                                        CoreTextField$lambda$17$0 = CoreTextFieldKt.CoreTextField$lambda$17$0(LegacyTextFieldState.this, focusRequester2, z30, z29, textFieldSelectionManager3, offsetMapping2, (Offset) obj);
                                                                        return CoreTextField$lambda$17$0;
                                                                    }
                                                                };
                                                                legacyTextFieldState = legacyTextFieldState3;
                                                                focusRequester = focusRequester2;
                                                                z19 = z29;
                                                                offsetMapping = offsetMapping2;
                                                                composer3.updateRememberedValue(rememberedValue7);
                                                            } else {
                                                                z19 = z29;
                                                                legacyTextFieldState = legacyTextFieldState3;
                                                                offsetMapping = offsetMapping2;
                                                                focusRequester = focusRequester2;
                                                            }
                                                            Modifier tapPressTextFieldModifier = TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode, mutableInteractionSource6, z19, (ky) rememberedValue7);
                                                            MouseSelectionObserver mouseSelectionObserver$foundation = textFieldSelectionManager.getMouseSelectionObserver$foundation();
                                                            z20 = z19;
                                                            TextDragObserver touchSelectionObserver$foundation = textFieldSelectionManager.getTouchSelectionObserver$foundation();
                                                            changedInstance4 = composer3.changedInstance(textFieldSelectionManager);
                                                            FocusRequester focusRequester3 = focusRequester;
                                                            Object rememberedValue22 = composer3.rememberedValue();
                                                            if (changedInstance4) {
                                                                mutableInteractionSource5 = mutableInteractionSource6;
                                                            } else {
                                                                mutableInteractionSource5 = mutableInteractionSource6;
                                                            }
                                                            rememberedValue22 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$3$1
                                                                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                                                public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                                                                    Object awaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, TextFieldSelectionManager.this.getMouseSelectionObserver$foundation(), TextFieldSelectionManager.this.getTouchSelectionObserver$foundation(), hmVar);
                                                                    return awaitSelectionGestures == vn.d ? awaitSelectionGestures : w01.a;
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(rememberedValue22);
                                                            Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(tapPressTextFieldModifier, mouseSelectionObserver$foundation, touchSelectionObserver$foundation, (PointerInputEventHandler) rememberedValue22), PointerIcon.Companion.getText(), false, 2, null);
                                                            changedInstance5 = composer3.changedInstance(legacyTextFieldState) | (i48 == 4) | composer3.changedInstance(offsetMapping);
                                                            rememberedValue8 = composer3.rememberedValue();
                                                            if (!changedInstance5 || rememberedValue8 == companion.getEmpty()) {
                                                                rememberedValue8 = new f1(legacyTextFieldState, textFieldValue2, offsetMapping, 6);
                                                                composer3.updateRememberedValue(rememberedValue8);
                                                            }
                                                            final Modifier drawBehind = DrawModifierKt.drawBehind(companion2, (ky) rememberedValue8);
                                                            changedInstance6 = composer3.changedInstance(legacyTextFieldState) | (i49 == 2048) | composer3.changed(windowInfo) | composer3.changedInstance(textFieldSelectionManager) | (i48 == 4) | composer3.changedInstance(offsetMapping);
                                                            rememberedValue9 = composer3.rememberedValue();
                                                            if (!changedInstance6 || rememberedValue9 == companion.getEmpty()) {
                                                                rememberedValue9 = new zm(legacyTextFieldState, z20, windowInfo, textFieldSelectionManager, textFieldValue2, offsetMapping);
                                                                z21 = z20;
                                                                composer3.updateRememberedValue(rememberedValue9);
                                                            } else {
                                                                z21 = z20;
                                                            }
                                                            final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (ky) rememberedValue9);
                                                            boolean z31 = z21;
                                                            legacyTextFieldState2 = legacyTextFieldState;
                                                            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState2, z7, z31, visualTransformation5 instanceof PasswordVisualTransformation, offsetMapping, textFieldSelectionManager, imeOptions6, focusRequester3);
                                                            boolean z32 = (z31 || z7 || !windowInfo.isWindowFocused() || legacyTextFieldState2.hasHighlight()) ? false : true;
                                                            final OffsetMapping offsetMapping3 = offsetMapping;
                                                            final Modifier cursor = TextFieldCursorKt.cursor(companion2, legacyTextFieldState2, textFieldValue, offsetMapping3, brush4, z32);
                                                            changedInstance7 = composer3.changedInstance(textFieldSelectionManager);
                                                            rememberedValue10 = composer3.rememberedValue();
                                                            if (!changedInstance7 || rememberedValue10 == companion.getEmpty()) {
                                                                i32 = 0;
                                                                rememberedValue10 = new dn(textFieldSelectionManager, i32);
                                                                composer3.updateRememberedValue(rememberedValue10);
                                                            } else {
                                                                i32 = 0;
                                                            }
                                                            EffectsKt.DisposableEffect(textFieldSelectionManager, (ky) rememberedValue10, composer3, i32);
                                                            changedInstance8 = ((i52 <= 32 && composer3.changed(imeOptions6)) || (i50 & 48) == 32) | (i48 == 4) | composer3.changedInstance(legacyTextFieldState2) | composer3.changedInstance(textInputService);
                                                            rememberedValue11 = composer3.rememberedValue();
                                                            if (!changedInstance8 || rememberedValue11 == companion.getEmpty()) {
                                                                rememberedValue11 = new x4(legacyTextFieldState2, textInputService, textFieldValue, imeOptions6, 2);
                                                                imeOptions7 = imeOptions6;
                                                                composer3.updateRememberedValue(rememberedValue11);
                                                            } else {
                                                                imeOptions7 = imeOptions6;
                                                            }
                                                            EffectsKt.DisposableEffect(imeOptions7, (ky) rememberedValue11, composer3, (i50 >> 3) & 14);
                                                            final int i53 = i31;
                                                            Modifier m1188textFieldKeyInput2WJ9YEU = TextFieldKeyInputKt.m1188textFieldKeyInput2WJ9YEU(companion2, legacyTextFieldState2, textFieldSelectionManager, textFieldValue, legacyTextFieldState2.getOnValueChange(), z12, i53 == 1, offsetMapping3, undoManager, imeOptions7.m7257getImeActioneUduSuo());
                                                            ImeOptions imeOptions9 = imeOptions7;
                                                            int m7258getKeyboardTypePjHm6EE = imeOptions9.m7258getKeyboardTypePjHm6EE();
                                                            KeyboardType.Companion companion3 = KeyboardType.Companion;
                                                            z22 = KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion3.m7300getPasswordPjHm6EE()) && !KeyboardType.m7281equalsimpl0(imeOptions9.m7258getKeyboardTypePjHm6EE(), companion3.m7299getNumberPasswordPjHm6EE());
                                                            boolean CoreTextField$lambda$14 = CoreTextField$lambda$14(state2);
                                                            LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter3 = legacyPlatformTextInputServiceAdapter;
                                                            changed2 = composer3.changed(z22) | composer3.changedInstance(legacyPlatformTextInputServiceAdapter3);
                                                            rememberedValue12 = composer3.rememberedValue();
                                                            if (!changed2 || rememberedValue12 == companion.getEmpty()) {
                                                                rememberedValue12 = new cd(2, z22, legacyPlatformTextInputServiceAdapter3);
                                                                composer3.updateRememberedValue(rememberedValue12);
                                                            }
                                                            Modifier stylusHandwriting = StylusHandwritingKt.stylusHandwriting(companion2, CoreTextField$lambda$14, z22, (iy) rememberedValue12);
                                                            Brush m1061resolveAutofillHighlightWkMShQ = AutofillHighlightKt.m1061resolveAutofillHighlightWkMShQ((Brush) composer3.consume(AutofillHighlightKt.getLocalAutofillHighlightBrush()), ((Color) composer3.consume(AutofillHighlightKt.getLocalAutofillHighlightColor())).m4771unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor());
                                                            changedInstance9 = composer3.changedInstance(legacyTextFieldState2) | composer3.changed(m1061resolveAutofillHighlightWkMShQ);
                                                            rememberedValue13 = composer3.rememberedValue();
                                                            if (!changedInstance9 || rememberedValue13 == companion.getEmpty()) {
                                                                rememberedValue13 = new defpackage.g(12, legacyTextFieldState2, m1061resolveAutofillHighlightWkMShQ);
                                                                composer3.updateRememberedValue(rememberedValue13);
                                                            }
                                                            Modifier drawWithContent = DrawModifierKt.drawWithContent(companion2, (ky) rememberedValue13);
                                                            OverscrollEffect rememberTextFieldOverscrollEffect = TextFieldScroll_androidKt.rememberTextFieldOverscrollEffect(composer3, 0);
                                                            Modifier modifier6 = modifier5;
                                                            Modifier then = previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier6.then(drawWithContent), legacyPlatformTextInputServiceAdapter3, legacyTextFieldState2, textFieldSelectionManager).then(stylusHandwriting).then(textFieldFocusModifier), legacyTextFieldState2, focusManager), legacyTextFieldState2, textFieldSelectionManager).then(m1188textFieldKeyInput2WJ9YEU);
                                                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                                                            final TextFieldScrollerPosition textFieldScrollerPosition6 = textFieldScrollerPosition5;
                                                            Modifier addContextMenuComponents = addContextMenuComponents(OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(then, textFieldScrollerPosition6, mutableInteractionSource7, z31, rememberTextFieldOverscrollEffect).then(pointerHoverIcon$default).then(coreTextFieldSemanticsModifier), new xm(legacyTextFieldState2, 1)), textFieldSelectionManager, unVar);
                                                            boolean z33 = !z31 && legacyTextFieldState2.getHasFocus() && legacyTextFieldState2.isInTouchMode() && windowInfo.isWindowFocused();
                                                            Composer composer4 = composer3;
                                                            final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                                            final boolean z34 = z7;
                                                            final BringIntoViewRequester bringIntoViewRequester3 = bringIntoViewRequester;
                                                            final Modifier textFieldMagnifier = z33 ? TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager) : companion2;
                                                            final boolean z35 = z33;
                                                            final ny nyVar3 = lambda$559628295$foundation;
                                                            final TextStyle textStyle6 = textStyle5;
                                                            final Density density3 = density;
                                                            CoreTextFieldRootBox(addContextMenuComponents, textFieldSelectionManager4, ComposableLambdaKt.rememberComposableLambda(-814563849, true, new my() { // from class: en
                                                                @Override // defpackage.my
                                                                public final Object invoke(Object obj, Object obj2) {
                                                                    w01 CoreTextField$lambda$26;
                                                                    int intValue = ((Integer) obj2).intValue();
                                                                    CoreTextField$lambda$26 = CoreTextFieldKt.CoreTextField$lambda$26(ny.this, legacyTextFieldState2, textStyle6, i47, i53, textFieldScrollerPosition6, textFieldValue, visualTransformation5, cursor, drawBehind, onGloballyPositioned, textFieldMagnifier, bringIntoViewRequester3, textFieldSelectionManager4, z35, z34, kyVar5, offsetMapping3, density3, (Composer) obj, intValue);
                                                                    return CoreTextField$lambda$26;
                                                                }
                                                            }, composer4, 54), composer4, 384);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                            nyVar2 = nyVar3;
                                                            composer2 = composer4;
                                                            kyVar4 = kyVar5;
                                                            z6 = z34;
                                                            textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                                            brush2 = brush4;
                                                            imeOptions2 = imeOptions9;
                                                            z5 = z31;
                                                            z4 = z26;
                                                            keyboardActions2 = keyboardActions4;
                                                            i27 = i47;
                                                            modifier3 = modifier6;
                                                            mutableInteractionSource3 = mutableInteractionSource7;
                                                            i26 = i53;
                                                            textStyle3 = textStyle5;
                                                            visualTransformation3 = visualTransformation5;
                                                        }
                                                    } else {
                                                        z16 = changed;
                                                    }
                                                    z17 = true;
                                                    z18 = z16 | z17;
                                                    rememberedValue5 = composer3.rememberedValue();
                                                    if (z18) {
                                                    }
                                                    rememberedValue5 = new CoreTextFieldKt$CoreTextField$5$1(legacyTextFieldState3, rememberUpdatedState, textInputService, textFieldSelectionManager, imeOptions5, null);
                                                    state = rememberUpdatedState;
                                                    composer3.updateRememberedValue(rememberedValue5);
                                                    State state22 = state;
                                                    imeOptions6 = imeOptions5;
                                                    EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue5, composer3, 6);
                                                    changedInstance2 = composer3.changedInstance(legacyTextFieldState3);
                                                    rememberedValue6 = composer3.rememberedValue();
                                                    if (!changedInstance2) {
                                                    }
                                                    rememberedValue6 = new xm(legacyTextFieldState3, 0);
                                                    composer3.updateRememberedValue(rememberedValue6);
                                                    Modifier updateSelectionTouchMode2 = SelectionGesturesKt.updateSelectionTouchMode(companion2, (ky) rememberedValue6);
                                                    changedInstance3 = composer3.changedInstance(legacyTextFieldState3) | (i51 == 16384) | (i49 == 2048) | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(textFieldSelectionManager);
                                                    rememberedValue7 = composer3.rememberedValue();
                                                    if (changedInstance3) {
                                                    }
                                                    final TextFieldSelectionManager textFieldSelectionManager32 = textFieldSelectionManager;
                                                    final boolean z302 = z7;
                                                    rememberedValue7 = new ky() { // from class: ym
                                                        @Override // defpackage.ky
                                                        public final Object invoke(Object obj) {
                                                            w01 CoreTextField$lambda$17$0;
                                                            CoreTextField$lambda$17$0 = CoreTextFieldKt.CoreTextField$lambda$17$0(LegacyTextFieldState.this, focusRequester2, z302, z29, textFieldSelectionManager32, offsetMapping2, (Offset) obj);
                                                            return CoreTextField$lambda$17$0;
                                                        }
                                                    };
                                                    legacyTextFieldState = legacyTextFieldState3;
                                                    focusRequester = focusRequester2;
                                                    z19 = z29;
                                                    offsetMapping = offsetMapping2;
                                                    composer3.updateRememberedValue(rememberedValue7);
                                                    Modifier tapPressTextFieldModifier2 = TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode2, mutableInteractionSource6, z19, (ky) rememberedValue7);
                                                    MouseSelectionObserver mouseSelectionObserver$foundation2 = textFieldSelectionManager.getMouseSelectionObserver$foundation();
                                                    z20 = z19;
                                                    TextDragObserver touchSelectionObserver$foundation2 = textFieldSelectionManager.getTouchSelectionObserver$foundation();
                                                    changedInstance4 = composer3.changedInstance(textFieldSelectionManager);
                                                    FocusRequester focusRequester32 = focusRequester;
                                                    Object rememberedValue222 = composer3.rememberedValue();
                                                    if (changedInstance4) {
                                                    }
                                                    rememberedValue222 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$3$1
                                                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                                        public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                                                            Object awaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, TextFieldSelectionManager.this.getMouseSelectionObserver$foundation(), TextFieldSelectionManager.this.getTouchSelectionObserver$foundation(), hmVar);
                                                            return awaitSelectionGestures == vn.d ? awaitSelectionGestures : w01.a;
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(rememberedValue222);
                                                    Modifier pointerHoverIcon$default2 = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(tapPressTextFieldModifier2, mouseSelectionObserver$foundation2, touchSelectionObserver$foundation2, (PointerInputEventHandler) rememberedValue222), PointerIcon.Companion.getText(), false, 2, null);
                                                    changedInstance5 = composer3.changedInstance(legacyTextFieldState) | (i48 == 4) | composer3.changedInstance(offsetMapping);
                                                    rememberedValue8 = composer3.rememberedValue();
                                                    if (!changedInstance5) {
                                                    }
                                                    rememberedValue8 = new f1(legacyTextFieldState, textFieldValue2, offsetMapping, 6);
                                                    composer3.updateRememberedValue(rememberedValue8);
                                                    final Modifier drawBehind2 = DrawModifierKt.drawBehind(companion2, (ky) rememberedValue8);
                                                    changedInstance6 = composer3.changedInstance(legacyTextFieldState) | (i49 == 2048) | composer3.changed(windowInfo) | composer3.changedInstance(textFieldSelectionManager) | (i48 == 4) | composer3.changedInstance(offsetMapping);
                                                    rememberedValue9 = composer3.rememberedValue();
                                                    if (changedInstance6) {
                                                    }
                                                    rememberedValue9 = new zm(legacyTextFieldState, z20, windowInfo, textFieldSelectionManager, textFieldValue2, offsetMapping);
                                                    z21 = z20;
                                                    composer3.updateRememberedValue(rememberedValue9);
                                                    final Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (ky) rememberedValue9);
                                                    boolean z312 = z21;
                                                    legacyTextFieldState2 = legacyTextFieldState;
                                                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState2, z7, z312, visualTransformation5 instanceof PasswordVisualTransformation, offsetMapping, textFieldSelectionManager, imeOptions6, focusRequester32);
                                                    if (z312) {
                                                    }
                                                    final OffsetMapping offsetMapping32 = offsetMapping;
                                                    final Modifier cursor2 = TextFieldCursorKt.cursor(companion2, legacyTextFieldState2, textFieldValue, offsetMapping32, brush4, z32);
                                                    changedInstance7 = composer3.changedInstance(textFieldSelectionManager);
                                                    rememberedValue10 = composer3.rememberedValue();
                                                    if (changedInstance7) {
                                                    }
                                                    i32 = 0;
                                                    rememberedValue10 = new dn(textFieldSelectionManager, i32);
                                                    composer3.updateRememberedValue(rememberedValue10);
                                                    EffectsKt.DisposableEffect(textFieldSelectionManager, (ky) rememberedValue10, composer3, i32);
                                                    changedInstance8 = ((i52 <= 32 && composer3.changed(imeOptions6)) || (i50 & 48) == 32) | (i48 == 4) | composer3.changedInstance(legacyTextFieldState2) | composer3.changedInstance(textInputService);
                                                    rememberedValue11 = composer3.rememberedValue();
                                                    if (changedInstance8) {
                                                    }
                                                    rememberedValue11 = new x4(legacyTextFieldState2, textInputService, textFieldValue, imeOptions6, 2);
                                                    imeOptions7 = imeOptions6;
                                                    composer3.updateRememberedValue(rememberedValue11);
                                                    EffectsKt.DisposableEffect(imeOptions7, (ky) rememberedValue11, composer3, (i50 >> 3) & 14);
                                                    final int i532 = i31;
                                                    Modifier m1188textFieldKeyInput2WJ9YEU2 = TextFieldKeyInputKt.m1188textFieldKeyInput2WJ9YEU(companion2, legacyTextFieldState2, textFieldSelectionManager, textFieldValue, legacyTextFieldState2.getOnValueChange(), z12, i532 == 1, offsetMapping32, undoManager, imeOptions7.m7257getImeActioneUduSuo());
                                                    ImeOptions imeOptions92 = imeOptions7;
                                                    int m7258getKeyboardTypePjHm6EE2 = imeOptions92.m7258getKeyboardTypePjHm6EE();
                                                    KeyboardType.Companion companion32 = KeyboardType.Companion;
                                                    if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE2, companion32.m7300getPasswordPjHm6EE())) {
                                                    }
                                                    boolean CoreTextField$lambda$142 = CoreTextField$lambda$14(state22);
                                                    LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter32 = legacyPlatformTextInputServiceAdapter;
                                                    changed2 = composer3.changed(z22) | composer3.changedInstance(legacyPlatformTextInputServiceAdapter32);
                                                    rememberedValue12 = composer3.rememberedValue();
                                                    if (!changed2) {
                                                    }
                                                    rememberedValue12 = new cd(2, z22, legacyPlatformTextInputServiceAdapter32);
                                                    composer3.updateRememberedValue(rememberedValue12);
                                                    Modifier stylusHandwriting2 = StylusHandwritingKt.stylusHandwriting(companion2, CoreTextField$lambda$142, z22, (iy) rememberedValue12);
                                                    Brush m1061resolveAutofillHighlightWkMShQ2 = AutofillHighlightKt.m1061resolveAutofillHighlightWkMShQ((Brush) composer3.consume(AutofillHighlightKt.getLocalAutofillHighlightBrush()), ((Color) composer3.consume(AutofillHighlightKt.getLocalAutofillHighlightColor())).m4771unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor());
                                                    changedInstance9 = composer3.changedInstance(legacyTextFieldState2) | composer3.changed(m1061resolveAutofillHighlightWkMShQ2);
                                                    rememberedValue13 = composer3.rememberedValue();
                                                    if (!changedInstance9) {
                                                    }
                                                    rememberedValue13 = new defpackage.g(12, legacyTextFieldState2, m1061resolveAutofillHighlightWkMShQ2);
                                                    composer3.updateRememberedValue(rememberedValue13);
                                                    Modifier drawWithContent2 = DrawModifierKt.drawWithContent(companion2, (ky) rememberedValue13);
                                                    OverscrollEffect rememberTextFieldOverscrollEffect2 = TextFieldScroll_androidKt.rememberTextFieldOverscrollEffect(composer3, 0);
                                                    Modifier modifier62 = modifier5;
                                                    Modifier then2 = previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier62.then(drawWithContent2), legacyPlatformTextInputServiceAdapter32, legacyTextFieldState2, textFieldSelectionManager).then(stylusHandwriting2).then(textFieldFocusModifier), legacyTextFieldState2, focusManager), legacyTextFieldState2, textFieldSelectionManager).then(m1188textFieldKeyInput2WJ9YEU2);
                                                    MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource5;
                                                    final TextFieldScrollerPosition textFieldScrollerPosition62 = textFieldScrollerPosition5;
                                                    Modifier addContextMenuComponents2 = addContextMenuComponents(OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(then2, textFieldScrollerPosition62, mutableInteractionSource72, z312, rememberTextFieldOverscrollEffect2).then(pointerHoverIcon$default2).then(coreTextFieldSemanticsModifier2), new xm(legacyTextFieldState2, 1)), textFieldSelectionManager, unVar);
                                                    if (z312) {
                                                    }
                                                    Composer composer42 = composer3;
                                                    final TextFieldSelectionManager textFieldSelectionManager42 = textFieldSelectionManager;
                                                    final boolean z342 = z7;
                                                    final BringIntoViewRequester bringIntoViewRequester32 = bringIntoViewRequester;
                                                    final Modifier textFieldMagnifier2 = z33 ? TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager) : companion2;
                                                    final boolean z352 = z33;
                                                    final ny nyVar32 = lambda$559628295$foundation;
                                                    final TextStyle textStyle62 = textStyle5;
                                                    final Density density32 = density;
                                                    CoreTextFieldRootBox(addContextMenuComponents2, textFieldSelectionManager42, ComposableLambdaKt.rememberComposableLambda(-814563849, true, new my() { // from class: en
                                                        @Override // defpackage.my
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            w01 CoreTextField$lambda$26;
                                                            int intValue = ((Integer) obj2).intValue();
                                                            CoreTextField$lambda$26 = CoreTextFieldKt.CoreTextField$lambda$26(ny.this, legacyTextFieldState2, textStyle62, i47, i532, textFieldScrollerPosition62, textFieldValue, visualTransformation5, cursor2, drawBehind2, onGloballyPositioned2, textFieldMagnifier2, bringIntoViewRequester32, textFieldSelectionManager42, z352, z342, kyVar5, offsetMapping32, density32, (Composer) obj, intValue);
                                                            return CoreTextField$lambda$26;
                                                        }
                                                    }, composer42, 54), composer42, 384);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    nyVar2 = nyVar32;
                                                    composer2 = composer42;
                                                    kyVar4 = kyVar5;
                                                    z6 = z342;
                                                    textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                                    brush2 = brush4;
                                                    imeOptions2 = imeOptions92;
                                                    z5 = z312;
                                                    z4 = z26;
                                                    keyboardActions2 = keyboardActions4;
                                                    i27 = i47;
                                                    modifier3 = modifier62;
                                                    mutableInteractionSource3 = mutableInteractionSource72;
                                                    i26 = i532;
                                                    textStyle3 = textStyle5;
                                                    visualTransformation3 = visualTransformation5;
                                                }
                                            } else {
                                                z13 = z11;
                                            }
                                            z14 = true;
                                            changedInstance = changedInstance10 | z14 | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(unVar2) | composer3.changedInstance(bringIntoViewRequester2) | composer3.changedInstance(textFieldSelectionManager2);
                                            rememberedValue4 = composer3.rememberedValue();
                                            if (changedInstance) {
                                            }
                                            final ImeOptions imeOptions82 = imeOptions4;
                                            final boolean z282 = z7;
                                            rememberedValue4 = new ky() { // from class: wm
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj) {
                                                    w01 CoreTextField$lambda$13$0;
                                                    CoreTextField$lambda$13$0 = CoreTextFieldKt.CoreTextField$lambda$13$0(LegacyTextFieldState.this, z13, z282, textInputService2, textFieldValue, imeOptions82, offsetMapping2, textFieldSelectionManager2, unVar2, bringIntoViewRequester2, (FocusState) obj);
                                                    return CoreTextField$lambda$13$0;
                                                }
                                            };
                                            z15 = z13;
                                            textInputService = textInputService2;
                                            textFieldValue2 = textFieldValue;
                                            imeOptions5 = imeOptions82;
                                            textFieldSelectionManager = textFieldSelectionManager2;
                                            unVar = unVar2;
                                            bringIntoViewRequester = bringIntoViewRequester2;
                                            composer3.updateRememberedValue(rememberedValue4);
                                            final VisualTransformation visualTransformation52 = visualTransformation4;
                                            Modifier textFieldFocusModifier2 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z15, focusRequester2, mutableInteractionSource6, (ky) rememberedValue4);
                                            final boolean z292 = z15;
                                            State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z15 || z7) ? false : true), composer3, 0);
                                            changed = composer3.changed(rememberUpdatedState2) | composer3.changedInstance(legacyTextFieldState3) | composer3.changedInstance(textInputService) | composer3.changedInstance(textFieldSelectionManager);
                                            if (i52 > 32) {
                                            }
                                            z16 = changed;
                                            if ((i50 & 48) != 32) {
                                            }
                                            z17 = true;
                                            z18 = z16 | z17;
                                            rememberedValue5 = composer3.rememberedValue();
                                            if (z18) {
                                            }
                                            rememberedValue5 = new CoreTextFieldKt$CoreTextField$5$1(legacyTextFieldState3, rememberUpdatedState2, textInputService, textFieldSelectionManager, imeOptions5, null);
                                            state = rememberUpdatedState2;
                                            composer3.updateRememberedValue(rememberedValue5);
                                            State state222 = state;
                                            imeOptions6 = imeOptions5;
                                            EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue5, composer3, 6);
                                            changedInstance2 = composer3.changedInstance(legacyTextFieldState3);
                                            rememberedValue6 = composer3.rememberedValue();
                                            if (!changedInstance2) {
                                            }
                                            rememberedValue6 = new xm(legacyTextFieldState3, 0);
                                            composer3.updateRememberedValue(rememberedValue6);
                                            Modifier updateSelectionTouchMode22 = SelectionGesturesKt.updateSelectionTouchMode(companion2, (ky) rememberedValue6);
                                            changedInstance3 = composer3.changedInstance(legacyTextFieldState3) | (i51 == 16384) | (i49 == 2048) | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(textFieldSelectionManager);
                                            rememberedValue7 = composer3.rememberedValue();
                                            if (changedInstance3) {
                                            }
                                            final TextFieldSelectionManager textFieldSelectionManager322 = textFieldSelectionManager;
                                            final boolean z3022 = z7;
                                            rememberedValue7 = new ky() { // from class: ym
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj) {
                                                    w01 CoreTextField$lambda$17$0;
                                                    CoreTextField$lambda$17$0 = CoreTextFieldKt.CoreTextField$lambda$17$0(LegacyTextFieldState.this, focusRequester2, z3022, z292, textFieldSelectionManager322, offsetMapping2, (Offset) obj);
                                                    return CoreTextField$lambda$17$0;
                                                }
                                            };
                                            legacyTextFieldState = legacyTextFieldState3;
                                            focusRequester = focusRequester2;
                                            z19 = z292;
                                            offsetMapping = offsetMapping2;
                                            composer3.updateRememberedValue(rememberedValue7);
                                            Modifier tapPressTextFieldModifier22 = TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode22, mutableInteractionSource6, z19, (ky) rememberedValue7);
                                            MouseSelectionObserver mouseSelectionObserver$foundation22 = textFieldSelectionManager.getMouseSelectionObserver$foundation();
                                            z20 = z19;
                                            TextDragObserver touchSelectionObserver$foundation22 = textFieldSelectionManager.getTouchSelectionObserver$foundation();
                                            changedInstance4 = composer3.changedInstance(textFieldSelectionManager);
                                            FocusRequester focusRequester322 = focusRequester;
                                            Object rememberedValue2222 = composer3.rememberedValue();
                                            if (changedInstance4) {
                                            }
                                            rememberedValue2222 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$3$1
                                                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                                public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                                                    Object awaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, TextFieldSelectionManager.this.getMouseSelectionObserver$foundation(), TextFieldSelectionManager.this.getTouchSelectionObserver$foundation(), hmVar);
                                                    return awaitSelectionGestures == vn.d ? awaitSelectionGestures : w01.a;
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue2222);
                                            Modifier pointerHoverIcon$default22 = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(tapPressTextFieldModifier22, mouseSelectionObserver$foundation22, touchSelectionObserver$foundation22, (PointerInputEventHandler) rememberedValue2222), PointerIcon.Companion.getText(), false, 2, null);
                                            changedInstance5 = composer3.changedInstance(legacyTextFieldState) | (i48 == 4) | composer3.changedInstance(offsetMapping);
                                            rememberedValue8 = composer3.rememberedValue();
                                            if (!changedInstance5) {
                                            }
                                            rememberedValue8 = new f1(legacyTextFieldState, textFieldValue2, offsetMapping, 6);
                                            composer3.updateRememberedValue(rememberedValue8);
                                            final Modifier drawBehind22 = DrawModifierKt.drawBehind(companion2, (ky) rememberedValue8);
                                            changedInstance6 = composer3.changedInstance(legacyTextFieldState) | (i49 == 2048) | composer3.changed(windowInfo) | composer3.changedInstance(textFieldSelectionManager) | (i48 == 4) | composer3.changedInstance(offsetMapping);
                                            rememberedValue9 = composer3.rememberedValue();
                                            if (changedInstance6) {
                                            }
                                            rememberedValue9 = new zm(legacyTextFieldState, z20, windowInfo, textFieldSelectionManager, textFieldValue2, offsetMapping);
                                            z21 = z20;
                                            composer3.updateRememberedValue(rememberedValue9);
                                            final Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (ky) rememberedValue9);
                                            boolean z3122 = z21;
                                            legacyTextFieldState2 = legacyTextFieldState;
                                            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier22 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState2, z7, z3122, visualTransformation52 instanceof PasswordVisualTransformation, offsetMapping, textFieldSelectionManager, imeOptions6, focusRequester322);
                                            if (z3122) {
                                            }
                                            final OffsetMapping offsetMapping322 = offsetMapping;
                                            final Modifier cursor22 = TextFieldCursorKt.cursor(companion2, legacyTextFieldState2, textFieldValue, offsetMapping322, brush4, z32);
                                            changedInstance7 = composer3.changedInstance(textFieldSelectionManager);
                                            rememberedValue10 = composer3.rememberedValue();
                                            if (changedInstance7) {
                                            }
                                            i32 = 0;
                                            rememberedValue10 = new dn(textFieldSelectionManager, i32);
                                            composer3.updateRememberedValue(rememberedValue10);
                                            EffectsKt.DisposableEffect(textFieldSelectionManager, (ky) rememberedValue10, composer3, i32);
                                            changedInstance8 = ((i52 <= 32 && composer3.changed(imeOptions6)) || (i50 & 48) == 32) | (i48 == 4) | composer3.changedInstance(legacyTextFieldState2) | composer3.changedInstance(textInputService);
                                            rememberedValue11 = composer3.rememberedValue();
                                            if (changedInstance8) {
                                            }
                                            rememberedValue11 = new x4(legacyTextFieldState2, textInputService, textFieldValue, imeOptions6, 2);
                                            imeOptions7 = imeOptions6;
                                            composer3.updateRememberedValue(rememberedValue11);
                                            EffectsKt.DisposableEffect(imeOptions7, (ky) rememberedValue11, composer3, (i50 >> 3) & 14);
                                            final int i5322 = i31;
                                            Modifier m1188textFieldKeyInput2WJ9YEU22 = TextFieldKeyInputKt.m1188textFieldKeyInput2WJ9YEU(companion2, legacyTextFieldState2, textFieldSelectionManager, textFieldValue, legacyTextFieldState2.getOnValueChange(), z12, i5322 == 1, offsetMapping322, undoManager, imeOptions7.m7257getImeActioneUduSuo());
                                            ImeOptions imeOptions922 = imeOptions7;
                                            int m7258getKeyboardTypePjHm6EE22 = imeOptions922.m7258getKeyboardTypePjHm6EE();
                                            KeyboardType.Companion companion322 = KeyboardType.Companion;
                                            if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE22, companion322.m7300getPasswordPjHm6EE())) {
                                            }
                                            boolean CoreTextField$lambda$1422 = CoreTextField$lambda$14(state222);
                                            LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter322 = legacyPlatformTextInputServiceAdapter;
                                            changed2 = composer3.changed(z22) | composer3.changedInstance(legacyPlatformTextInputServiceAdapter322);
                                            rememberedValue12 = composer3.rememberedValue();
                                            if (!changed2) {
                                            }
                                            rememberedValue12 = new cd(2, z22, legacyPlatformTextInputServiceAdapter322);
                                            composer3.updateRememberedValue(rememberedValue12);
                                            Modifier stylusHandwriting22 = StylusHandwritingKt.stylusHandwriting(companion2, CoreTextField$lambda$1422, z22, (iy) rememberedValue12);
                                            Brush m1061resolveAutofillHighlightWkMShQ22 = AutofillHighlightKt.m1061resolveAutofillHighlightWkMShQ((Brush) composer3.consume(AutofillHighlightKt.getLocalAutofillHighlightBrush()), ((Color) composer3.consume(AutofillHighlightKt.getLocalAutofillHighlightColor())).m4771unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor());
                                            changedInstance9 = composer3.changedInstance(legacyTextFieldState2) | composer3.changed(m1061resolveAutofillHighlightWkMShQ22);
                                            rememberedValue13 = composer3.rememberedValue();
                                            if (!changedInstance9) {
                                            }
                                            rememberedValue13 = new defpackage.g(12, legacyTextFieldState2, m1061resolveAutofillHighlightWkMShQ22);
                                            composer3.updateRememberedValue(rememberedValue13);
                                            Modifier drawWithContent22 = DrawModifierKt.drawWithContent(companion2, (ky) rememberedValue13);
                                            OverscrollEffect rememberTextFieldOverscrollEffect22 = TextFieldScroll_androidKt.rememberTextFieldOverscrollEffect(composer3, 0);
                                            Modifier modifier622 = modifier5;
                                            Modifier then22 = previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier622.then(drawWithContent22), legacyPlatformTextInputServiceAdapter322, legacyTextFieldState2, textFieldSelectionManager).then(stylusHandwriting22).then(textFieldFocusModifier2), legacyTextFieldState2, focusManager), legacyTextFieldState2, textFieldSelectionManager).then(m1188textFieldKeyInput2WJ9YEU22);
                                            MutableInteractionSource mutableInteractionSource722 = mutableInteractionSource5;
                                            final TextFieldScrollerPosition textFieldScrollerPosition622 = textFieldScrollerPosition5;
                                            Modifier addContextMenuComponents22 = addContextMenuComponents(OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(then22, textFieldScrollerPosition622, mutableInteractionSource722, z3122, rememberTextFieldOverscrollEffect22).then(pointerHoverIcon$default22).then(coreTextFieldSemanticsModifier22), new xm(legacyTextFieldState2, 1)), textFieldSelectionManager, unVar);
                                            if (z3122) {
                                            }
                                            Composer composer422 = composer3;
                                            final TextFieldSelectionManager textFieldSelectionManager422 = textFieldSelectionManager;
                                            final boolean z3422 = z7;
                                            final BringIntoViewRequester bringIntoViewRequester322 = bringIntoViewRequester;
                                            final Modifier textFieldMagnifier22 = z33 ? TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager) : companion2;
                                            final boolean z3522 = z33;
                                            final ny nyVar322 = lambda$559628295$foundation;
                                            final TextStyle textStyle622 = textStyle5;
                                            final Density density322 = density;
                                            CoreTextFieldRootBox(addContextMenuComponents22, textFieldSelectionManager422, ComposableLambdaKt.rememberComposableLambda(-814563849, true, new my() { // from class: en
                                                @Override // defpackage.my
                                                public final Object invoke(Object obj, Object obj2) {
                                                    w01 CoreTextField$lambda$26;
                                                    int intValue = ((Integer) obj2).intValue();
                                                    CoreTextField$lambda$26 = CoreTextFieldKt.CoreTextField$lambda$26(ny.this, legacyTextFieldState2, textStyle622, i47, i5322, textFieldScrollerPosition622, textFieldValue, visualTransformation52, cursor22, drawBehind22, onGloballyPositioned22, textFieldMagnifier22, bringIntoViewRequester322, textFieldSelectionManager422, z3522, z3422, kyVar5, offsetMapping322, density322, (Composer) obj, intValue);
                                                    return CoreTextField$lambda$26;
                                                }
                                            }, composer422, 54), composer422, 384);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            nyVar2 = nyVar322;
                                            composer2 = composer422;
                                            kyVar4 = kyVar5;
                                            z6 = z3422;
                                            textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                            brush2 = brush4;
                                            imeOptions2 = imeOptions922;
                                            z5 = z3122;
                                            z4 = z26;
                                            keyboardActions2 = keyboardActions4;
                                            i27 = i47;
                                            modifier3 = modifier622;
                                            mutableInteractionSource3 = mutableInteractionSource722;
                                            i26 = i5322;
                                            textStyle3 = textStyle5;
                                            visualTransformation3 = visualTransformation52;
                                        }
                                    } else {
                                        z11 = z8;
                                    }
                                    orientation = Orientation.Vertical;
                                    Orientation orientation32 = orientation;
                                    if (textFieldScrollerPosition3 == null) {
                                    }
                                    if (textFieldScrollerPosition4.getOrientation() != orientation2) {
                                    }
                                } else {
                                    int i54 = i42;
                                    visualTransformation4 = none;
                                    modifier4 = modifier2;
                                    imeOptions4 = imeOptions3;
                                    z8 = z24;
                                    kyVar5 = kyVar3;
                                    i28 = i54;
                                    int i55 = i41;
                                    z9 = z23;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    i29 = i55;
                                    i30 = i23;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & Fields.CameraDistance) != 0) {
                                    i23 &= -113;
                                }
                                Brush brush5 = brush2;
                                visualTransformation4 = visualTransformation2;
                                brush3 = brush5;
                                keyboardActions3 = keyboardActions;
                                z8 = z2;
                                z7 = z3;
                                lambda$559628295$foundation = nyVar;
                                composer3 = startRestartGroup;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                kyVar5 = kyVar3;
                                modifier4 = modifier2;
                                i30 = i23;
                                z9 = z;
                                i29 = i;
                                i28 = i2;
                                imeOptions4 = imeOptions;
                            }
                            textFieldScrollerPosition3 = textFieldScrollerPosition;
                            composer3.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            rememberedValue = composer3.rememberedValue();
                            companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                            }
                            final FocusRequester focusRequester22 = (FocusRequester) rememberedValue;
                            rememberedValue2 = composer3.rememberedValue();
                            int i462 = i6;
                            if (rememberedValue2 == companion.getEmpty()) {
                            }
                            LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter22 = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
                            rememberedValue3 = composer3.rememberedValue();
                            Brush brush42 = brush3;
                            if (rememberedValue3 == companion.getEmpty()) {
                            }
                            final TextInputService textInputService22 = (TextInputService) rememberedValue3;
                            Density density22 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            FontFamily.Resolver resolver22 = (FontFamily.Resolver) composer3.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                            long m1568getBackgroundColor0d7_KjU2 = ((TextSelectionColors) composer3.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1568getBackgroundColor0d7_KjU();
                            FocusManager focusManager22 = (FocusManager) composer3.consume(CompositionLocalsKt.getLocalFocusManager());
                            WindowInfo windowInfo2 = (WindowInfo) composer3.consume(CompositionLocalsKt.getLocalWindowInfo());
                            SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composer3.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                            final int i472 = i28;
                            if (i29 != 1) {
                            }
                            orientation = Orientation.Vertical;
                            Orientation orientation322 = orientation;
                            if (textFieldScrollerPosition3 == null) {
                            }
                            if (textFieldScrollerPosition4.getOrientation() != orientation2) {
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z4 = z;
                            z5 = z2;
                            nyVar2 = nyVar;
                            textFieldScrollerPosition2 = textFieldScrollerPosition;
                            visualTransformation3 = visualTransformation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            kyVar4 = kyVar3;
                            composer2 = startRestartGroup;
                            textStyle3 = textStyle2;
                            modifier3 = modifier2;
                            i26 = i;
                            i27 = i2;
                            imeOptions2 = imeOptions;
                            keyboardActions2 = keyboardActions;
                            z6 = z3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: vm
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 CoreTextField$lambda$27;
                                    int intValue = ((Integer) obj2).intValue();
                                    CoreTextField$lambda$27 = CoreTextFieldKt.CoreTextField$lambda$27(TextFieldValue.this, kyVar, modifier3, textStyle3, visualTransformation3, kyVar4, mutableInteractionSource3, brush2, z4, i26, i27, imeOptions2, keyboardActions2, z5, z6, nyVar2, textFieldScrollerPosition2, i3, i4, i5, (Composer) obj, intValue);
                                    return CoreTextField$lambda$27;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i14 = i13;
                    i15 = i5 & Fields.RotationZ;
                    if (i15 != 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    int i382 = i17;
                    i18 = i5 & Fields.TransformOrigin;
                    if (i18 != 0) {
                    }
                    i20 = i5 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i5 & Fields.Clip;
                    if (i22 != 0) {
                    }
                    i24 = i5 & Fields.CompositingStrategy;
                    if (i24 != 0) {
                    }
                    i25 = i5 & 65536;
                    if (i25 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i23 & 599187) != 599186, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                visualTransformation2 = visualTransformation;
                i9 = i5 & 32;
                int i362 = Fields.RenderEffect;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                int i372 = Fields.BlendMode;
                if (i10 == 0) {
                }
                i11 = i5 & Fields.SpotShadowColor;
                if (i11 == 0) {
                }
                i12 = i5 & Fields.RotationX;
                if (i12 == 0) {
                }
                i13 = i5 & Fields.RotationY;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i5 & Fields.RotationZ;
                if (i15 != 0) {
                }
                if ((i4 & 48) == 0) {
                }
                int i3822 = i17;
                i18 = i5 & Fields.TransformOrigin;
                if (i18 != 0) {
                }
                i20 = i5 & 8192;
                if (i20 != 0) {
                }
                i22 = i5 & Fields.Clip;
                if (i22 != 0) {
                }
                i24 = i5 & Fields.CompositingStrategy;
                if (i24 != 0) {
                }
                i25 = i5 & 65536;
                if (i25 != 0) {
                }
                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i23 & 599187) != 599186, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            visualTransformation2 = visualTransformation;
            i9 = i5 & 32;
            int i3622 = Fields.RenderEffect;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            int i3722 = Fields.BlendMode;
            if (i10 == 0) {
            }
            i11 = i5 & Fields.SpotShadowColor;
            if (i11 == 0) {
            }
            i12 = i5 & Fields.RotationX;
            if (i12 == 0) {
            }
            i13 = i5 & Fields.RotationY;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i5 & Fields.RotationZ;
            if (i15 != 0) {
            }
            if ((i4 & 48) == 0) {
            }
            int i38222 = i17;
            i18 = i5 & Fields.TransformOrigin;
            if (i18 != 0) {
            }
            i20 = i5 & 8192;
            if (i20 != 0) {
            }
            i22 = i5 & Fields.Clip;
            if (i22 != 0) {
            }
            i24 = i5 & Fields.CompositingStrategy;
            if (i24 != 0) {
            }
            i25 = i5 & 65536;
            if (i25 != 0) {
            }
            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i23 & 599187) != 599186, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        int i352 = Fields.RotationZ;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        visualTransformation2 = visualTransformation;
        i9 = i5 & 32;
        int i36222 = Fields.RenderEffect;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        int i37222 = Fields.BlendMode;
        if (i10 == 0) {
        }
        i11 = i5 & Fields.SpotShadowColor;
        if (i11 == 0) {
        }
        i12 = i5 & Fields.RotationX;
        if (i12 == 0) {
        }
        i13 = i5 & Fields.RotationY;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i5 & Fields.RotationZ;
        if (i15 != 0) {
        }
        if ((i4 & 48) == 0) {
        }
        int i382222 = i17;
        i18 = i5 & Fields.TransformOrigin;
        if (i18 != 0) {
        }
        i20 = i5 & 8192;
        if (i20 != 0) {
        }
        i22 = i5 & Fields.Clip;
        if (i22 != 0) {
        }
        i24 = i5 & Fields.CompositingStrategy;
        if (i24 != 0) {
        }
        i25 = i5 & 65536;
        if (i25 != 0) {
        }
        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i23 & 599187) != 599186, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$0$0(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    private static final w01 CoreTextField$lambda$10(TextFieldSelectionManager textFieldSelectionManager, AnnotatedString annotatedString) {
        textFieldSelectionManager.paste$foundation(annotatedString);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$13$0(LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, un unVar, BringIntoViewRequester bringIntoViewRequester, FocusState focusState) {
        TextLayoutResultProxy layoutResult;
        boolean hasFocus = legacyTextFieldState.getHasFocus();
        boolean isFocused = focusState.isFocused();
        w01 w01Var = w01.a;
        if (hasFocus != isFocused) {
            legacyTextFieldState.setHasFocus(focusState.isFocused());
            if (legacyTextFieldState.getHasFocus() && z && !z2) {
                startInputSession(textInputService, legacyTextFieldState, textFieldValue, imeOptions, offsetMapping);
            } else {
                endInputSession(legacyTextFieldState);
            }
            if (focusState.isFocused() && (layoutResult = legacyTextFieldState.getLayoutResult()) != null) {
                p01.t(unVar, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester, textFieldValue, legacyTextFieldState, layoutResult, offsetMapping, null), 3);
            }
            if (!focusState.isFocused()) {
                TextFieldSelectionManager.m1553deselect_kEHs6E$foundation$default(textFieldSelectionManager, null, 1, null);
            }
        }
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$14(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$16$0(LegacyTextFieldState legacyTextFieldState, boolean z) {
        legacyTextFieldState.setInTouchMode(z);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$17$0(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z, boolean z2, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, Offset offset) {
        tapToFocus(legacyTextFieldState, focusRequester, !z);
        if (legacyTextFieldState.getHasFocus() && z2) {
            if (legacyTextFieldState.getHandleState() != HandleState.Selection) {
                TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                if (layoutResult != null) {
                    TextFieldDelegate.Companion.m1181setCursorOffsetULxng0E$foundation(offset.m4526unboximpl(), layoutResult, legacyTextFieldState.getProcessor(), offsetMapping, legacyTextFieldState.getOnValueChange());
                    if (legacyTextFieldState.getTextDelegate().getText().length() > 0) {
                        legacyTextFieldState.setHandleState(HandleState.Cursor);
                    }
                }
            } else {
                textFieldSelectionManager.m1557deselect_kEHs6E$foundation(offset);
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$19$0(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, DrawScope drawScope) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult != null) {
            TextFieldDelegate.Companion.m1179drawQ1vqE60$foundation(drawScope.getDrawContext().getCanvas(), textFieldValue, legacyTextFieldState.m1137getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState.m1134getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping, layoutResult.getValue(), legacyTextFieldState.getHighlightPaint(), legacyTextFieldState.m1136getSelectionBackgroundColor0d7_KjU());
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$20$0(LegacyTextFieldState legacyTextFieldState, boolean z, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping, LayoutCoordinates layoutCoordinates) {
        TextInputSession inputSession;
        legacyTextFieldState.setLayoutCoordinates(layoutCoordinates);
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult != null) {
            layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
        }
        if (z) {
            if (legacyTextFieldState.getHandleState() == HandleState.Selection) {
                if (legacyTextFieldState.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                    textFieldSelectionManager.showSelectionToolbar$foundation();
                } else {
                    textFieldSelectionManager.hideSelectionToolbar$foundation();
                }
                legacyTextFieldState.setShowSelectionHandleStart(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                legacyTextFieldState.setShowSelectionHandleEnd(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                legacyTextFieldState.setShowCursorHandle(TextRange.m7054getCollapsedimpl(textFieldValue.m7310getSelectiond9O1mEE()));
            } else if (legacyTextFieldState.getHandleState() == HandleState.Cursor) {
                legacyTextFieldState.setShowCursorHandle(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
            }
            notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
            TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
            if (layoutResult2 != null && (inputSession = legacyTextFieldState.getInputSession()) != null && legacyTextFieldState.getHasFocus()) {
                TextFieldDelegate.Companion.updateTextLayoutResult$foundation(inputSession, textFieldValue, offsetMapping, layoutResult2);
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CoreTextField$lambda$21$0(final TextFieldSelectionManager textFieldSelectionManager, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$lambda$21$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                TextFieldSelectionManager.this.hideSelectionToolbar$foundation();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CoreTextField$lambda$22$0(LegacyTextFieldState legacyTextFieldState, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, DisposableEffectScope disposableEffectScope) {
        if (legacyTextFieldState.getHasFocus()) {
            legacyTextFieldState.setInputSession(TextFieldDelegate.Companion.restartInput$foundation(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        }
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$lambda$22$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$23$0(boolean z, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter) {
        if (z) {
            legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$24$0(LegacyTextFieldState legacyTextFieldState, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (legacyTextFieldState.getAutofillHighlightOn() || legacyTextFieldState.getJustAutofilled()) {
            DrawScope.m5328drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$25(LegacyTextFieldState legacyTextFieldState, LayoutCoordinates layoutCoordinates) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult != null) {
            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$26(ny nyVar, final LegacyTextFieldState legacyTextFieldState, final TextStyle textStyle, final int i, final int i2, final TextFieldScrollerPosition textFieldScrollerPosition, final TextFieldValue textFieldValue, final VisualTransformation visualTransformation, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, final Modifier modifier4, final BringIntoViewRequester bringIntoViewRequester, final TextFieldSelectionManager textFieldSelectionManager, final boolean z, final boolean z2, final ky kyVar, final OffsetMapping offsetMapping, final Density density, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-814563849, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:588)");
            }
            nyVar.invoke(ComposableLambdaKt.rememberComposableLambda(-44346382, true, new my() { // from class: bn
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 CoreTextField$lambda$26$0;
                    int intValue = ((Integer) obj2).intValue();
                    CoreTextField$lambda$26$0 = CoreTextFieldKt.CoreTextField$lambda$26$0(LegacyTextFieldState.this, textStyle, i, i2, textFieldScrollerPosition, textFieldValue, visualTransformation, modifier, modifier2, modifier3, modifier4, bringIntoViewRequester, textFieldSelectionManager, z, z2, kyVar, offsetMapping, density, (Composer) obj, intValue);
                    return CoreTextField$lambda$26$0;
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$26$0(final LegacyTextFieldState legacyTextFieldState, TextStyle textStyle, int i, final int i2, TextFieldScrollerPosition textFieldScrollerPosition, final TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, final TextFieldSelectionManager textFieldSelectionManager, final boolean z, final boolean z2, final ky kyVar, final OffsetMapping offsetMapping, final Density density, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-44346382, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:591)");
            }
            Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m795heightInVpY3zN4$default(Modifier.Companion, legacyTextFieldState.m1135getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle, i, i2);
            boolean changedInstance = composer.changedInstance(legacyTextFieldState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new i2(legacyTextFieldState, 10);
                composer.updateRememberedValue(rememberedValue);
            }
            SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScroll_androidKt.textFieldScroll(heightInLines, textFieldScrollerPosition, textFieldValue, visualTransformation, (iy) rememberedValue).then(modifier).then(modifier2), textStyle).then(modifier3).then(modifier4), bringIntoViewRequester), ComposableLambdaKt.rememberComposableLambda(1412697320, true, new my() { // from class: cn
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 CoreTextField$lambda$26$0$1;
                    int intValue = ((Integer) obj2).intValue();
                    CoreTextField$lambda$26$0$1 = CoreTextFieldKt.CoreTextField$lambda$26$0$1(TextFieldSelectionManager.this, legacyTextFieldState, z, z2, kyVar, textFieldValue, offsetMapping, density, i2, (Composer) obj, intValue);
                    return CoreTextField$lambda$26$0$1;
                }
            }, composer, 54), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (r16 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w01 CoreTextField$lambda$26$0$1(TextFieldSelectionManager textFieldSelectionManager, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, ky kyVar, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i, Composer composer, int i2) {
        boolean z3 = true;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1412697320, i2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:612)");
            }
            CoreTextFieldKt$CoreTextField$8$1$1$2 coreTextFieldKt$CoreTextField$8$1$1$2 = new CoreTextFieldKt$CoreTextField$8$1$1$2(legacyTextFieldState, kyVar, textFieldValue, offsetMapping, density, i);
            Modifier.Companion companion = Modifier.Companion;
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
            Updater.m3886setimpl(m3878constructorimpl, coreTextFieldKt$CoreTextField$8$1$1$2, companion2.getSetMeasurePolicy());
            Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            composer.endNode();
            if (legacyTextFieldState.getHandleState() != HandleState.None && legacyTextFieldState.getLayoutCoordinates() != null) {
                LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
                layoutCoordinates.getClass();
                if (layoutCoordinates.isAttached()) {
                }
            }
            z3 = false;
            SelectionToolbarAndHandles(textFieldSelectionManager, z3, composer, 0);
            if (legacyTextFieldState.getHandleState() == HandleState.Cursor && !z2 && z) {
                composer.startReplaceGroup(-714666198);
                TextFieldCursorHandle(textFieldSelectionManager, composer, 0);
            } else {
                composer.startReplaceGroup(-747377894);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextField$lambda$27(TextFieldValue textFieldValue, ky kyVar, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, ny nyVar, TextFieldScrollerPosition textFieldScrollerPosition, int i3, int i4, int i5, Composer composer, int i6) {
        CoreTextField(textFieldValue, kyVar, modifier, textStyle, visualTransformation, kyVar2, mutableInteractionSource, brush, z, i, i2, imeOptions, keyboardActions, z2, z3, nyVar, textFieldScrollerPosition, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldScrollerPosition CoreTextField$lambda$4$0(Orientation orientation) {
        return new TextFieldScrollerPosition(orientation, 0.0f, 2, null);
    }

    private static final void CoreTextFieldRootBox(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2036174316);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036174316, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:701)");
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, myVar, startRestartGroup, (i2 >> 3) & 126);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 7, modifier, textFieldSelectionManager, myVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CoreTextFieldRootBox$lambda$1(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, my myVar, int i, Composer composer, int i2) {
        CoreTextFieldRootBox(modifier, textFieldSelectionManager, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void SelectionToolbarAndHandles(TextFieldSelectionManager textFieldSelectionManager, boolean z, Composer composer, int i) {
        int i2;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1054)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(1530097388);
                LegacyTextFieldState state$foundation = textFieldSelectionManager.getState$foundation();
                TextLayoutResult textLayoutResult = null;
                if (state$foundation != null && (layoutResult = state$foundation.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    LegacyTextFieldState state$foundation2 = textFieldSelectionManager.getState$foundation();
                    if (!(state$foundation2 != null ? state$foundation2.isLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    startRestartGroup.startReplaceGroup(1530097387);
                } else {
                    startRestartGroup.startReplaceGroup(1530097388);
                    if (TextRange.m7054getCollapsedimpl(textFieldSelectionManager.getValue$foundation().m7310getSelectiond9O1mEE())) {
                        startRestartGroup.startReplaceGroup(2062097806);
                    } else {
                        startRestartGroup.startReplaceGroup(2109807302);
                        int originalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation().originalToTransformed(TextRange.m7060getStartimpl(textFieldSelectionManager.getValue$foundation().m7310getSelectiond9O1mEE()));
                        int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation().originalToTransformed(TextRange.m7055getEndimpl(textFieldSelectionManager.getValue$foundation().m7310getSelectiond9O1mEE()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                        LegacyTextFieldState state$foundation3 = textFieldSelectionManager.getState$foundation();
                        if (state$foundation3 == null || !state$foundation3.getShowSelectionHandleStart()) {
                            startRestartGroup.startReplaceGroup(2062097806);
                        } else {
                            startRestartGroup.startReplaceGroup(2110225306);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, ((i2 << 6) & 896) | 6);
                        }
                        startRestartGroup.endReplaceGroup();
                        LegacyTextFieldState state$foundation4 = textFieldSelectionManager.getState$foundation();
                        if (state$foundation4 == null || !state$foundation4.getShowSelectionHandleEnd()) {
                            startRestartGroup.startReplaceGroup(2062097806);
                        } else {
                            startRestartGroup.startReplaceGroup(2110574459);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, ((i2 << 6) & 896) | 6);
                        }
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                    LegacyTextFieldState state$foundation5 = textFieldSelectionManager.getState$foundation();
                    if (state$foundation5 != null) {
                        if (textFieldSelectionManager.isTextChanged$foundation()) {
                            state$foundation5.setShowFloatingToolbar(false);
                        }
                        if (state$foundation5.getHasFocus()) {
                            if (state$foundation5.getShowFloatingToolbar()) {
                                textFieldSelectionManager.showSelectionToolbar$foundation();
                            } else {
                                textFieldSelectionManager.hideSelectionToolbar$foundation();
                            }
                        }
                    }
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1989076778);
                startRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new an(i, z, i3, textFieldSelectionManager));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionToolbarAndHandles$lambda$1(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Composer composer, int i2) {
        SelectionToolbarAndHandles(textFieldSelectionManager, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, int i) {
        int i2;
        AnnotatedString transformedText$foundation;
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1101)");
            }
            LegacyTextFieldState state$foundation = textFieldSelectionManager.getState$foundation();
            if (state$foundation == null || !state$foundation.getShowCursorHandle() || (transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation()) == null || transformedText$foundation.length() <= 0) {
                startRestartGroup.startReplaceGroup(2132946858);
            } else {
                startRestartGroup.startReplaceGroup(-2112351432);
                boolean changed = startRestartGroup.changed(textFieldSelectionManager);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                final long m1559getCursorPositiontuRUvjQ$foundation = textFieldSelectionManager.m1559getCursorPositiontuRUvjQ$foundation((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
                boolean changed2 = startRestartGroup.changed(m1559getCursorPositiontuRUvjQ$foundation);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1072provideF1C5BW0() {
                            return m1559getCursorPositiontuRUvjQ$foundation;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                Modifier.Companion companion = Modifier.Companion;
                boolean changedInstance = startRestartGroup.changedInstance(textDragObserver) | startRestartGroup.changedInstance(textFieldSelectionManager);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1

                        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                        @bq(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend", v = 1)
                        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends us0 implements my {
                            final /* synthetic */ TextFieldSelectionManager $manager;
                            final /* synthetic */ TextDragObserver $observer;
                            final /* synthetic */ PointerInputScope $this_pointerInput;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                            @bq(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1114}, m = "invokeSuspend", v = 1)
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            public static final class C00121 extends us0 implements my {
                                final /* synthetic */ TextDragObserver $observer;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00121(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, hm hmVar) {
                                    super(2, hmVar);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$observer = textDragObserver;
                                }

                                @Override // defpackage.mc
                                public final hm create(Object obj, hm hmVar) {
                                    return new C00121(this.$this_pointerInput, this.$observer, hmVar);
                                }

                                @Override // defpackage.my
                                public final Object invoke(un unVar, hm hmVar) {
                                    return ((C00121) create(unVar, hmVar)).invokeSuspend(w01.a);
                                }

                                @Override // defpackage.mc
                                public final Object invokeSuspend(Object obj) {
                                    int i = this.label;
                                    if (i == 0) {
                                        p10.Q(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        TextDragObserver textDragObserver = this.$observer;
                                        this.label = 1;
                                        Object detectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this);
                                        vn vnVar = vn.d;
                                        if (detectDownAndDragGesturesWithObserver == vnVar) {
                                            return vnVar;
                                        }
                                    } else {
                                        if (i != 1) {
                                            o.f("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        p10.Q(obj);
                                    }
                                    return w01.a;
                                }
                            }

                            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                            @bq(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1117}, m = "invokeSuspend", v = 1)
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
                            public static final class AnonymousClass2 extends us0 implements my {
                                final /* synthetic */ TextFieldSelectionManager $manager;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
                                    super(2, hmVar);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$manager = textFieldSelectionManager;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final w01 invokeSuspend$lambda$0(TextFieldSelectionManager textFieldSelectionManager, Offset offset) {
                                    textFieldSelectionManager.showSelectionToolbar$foundation();
                                    return w01.a;
                                }

                                @Override // defpackage.mc
                                public final hm create(Object obj, hm hmVar) {
                                    return new AnonymousClass2(this.$this_pointerInput, this.$manager, hmVar);
                                }

                                @Override // defpackage.my
                                public final Object invoke(un unVar, hm hmVar) {
                                    return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
                                }

                                @Override // defpackage.mc
                                public final Object invokeSuspend(Object obj) {
                                    int i = this.label;
                                    int i2 = 1;
                                    if (i == 0) {
                                        p10.Q(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        a aVar = new a(this.$manager, i2);
                                        this.label = 1;
                                        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, aVar, this, 7, null);
                                        vn vnVar = vn.d;
                                        if (detectTapGestures$default == vnVar) {
                                            return vnVar;
                                        }
                                    } else {
                                        if (i != 1) {
                                            o.f("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        p10.Q(obj);
                                    }
                                    return w01.a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
                                super(2, hmVar);
                                this.$this_pointerInput = pointerInputScope;
                                this.$observer = textDragObserver;
                                this.$manager = textFieldSelectionManager;
                            }

                            @Override // defpackage.mc
                            public final hm create(Object obj, hm hmVar) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$observer, this.$manager, hmVar);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // defpackage.my
                            public final Object invoke(un unVar, hm hmVar) {
                                return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
                            }

                            @Override // defpackage.mc
                            public final Object invokeSuspend(Object obj) {
                                if (this.label != 0) {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                p10.Q(obj);
                                un unVar = (un) this.L$0;
                                C00121 c00121 = new C00121(this.$this_pointerInput, this.$observer, null);
                                xn xnVar = xn.g;
                                p01.t(unVar, null, xnVar, c00121, 1);
                                p01.t(unVar, null, xnVar, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1);
                                return w01.a;
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                            Object n = p10.n(new AnonymousClass1(pointerInputScope, TextDragObserver.this, textFieldSelectionManager, null), hmVar);
                            return n == vn.d ? n : w01.a;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) rememberedValue3);
                boolean changed3 = startRestartGroup.changed(m1559getCursorPositiontuRUvjQ$foundation);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new h5(m1559getCursorPositiontuRUvjQ$foundation, i3);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                AndroidCursorHandle_androidKt.m1059CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics$default(pointerInput, false, (ky) rememberedValue4, 1, null), 0L, startRestartGroup, 0, 4);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new oi(textFieldSelectionManager, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TextFieldCursorHandle$lambda$3$0(long j, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, j, SelectionHandleAnchor.Middle, true, null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TextFieldCursorHandle$lambda$4(TextFieldSelectionManager textFieldSelectionManager, int i, Composer composer, int i2) {
        TextFieldCursorHandle(textFieldSelectionManager, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final Modifier addContextMenuComponents(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, un unVar) {
        return ComposeFoundationFlags.isNewContextMenuEnabled ? TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents(modifier, textFieldSelectionManager, unVar) : modifier;
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, hm hmVar) {
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m7057getMaximpl(textFieldValue.m7310getSelectiond9O1mEE()));
        Object bringIntoView = bringIntoViewRequester.bringIntoView(originalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(originalToTransformed) : originalToTransformed != 0 ? textLayoutResult.getBoundingBox(originalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L)), hmVar);
        return bringIntoView == vn.d ? bringIntoView : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.setInputSession(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextInputSession inputSession = legacyTextFieldState.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            TextFieldDelegate.Companion.notifyFocusedRect$foundation(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new ky() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            @Override // defpackage.ky
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m1112invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1112invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m1115cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m1553deselect_kEHs6E$foundation$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    public static final void tapToFocus(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.getHasFocus()) {
            FocusRequester.m4419requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        } else {
            if (!z || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }
}
