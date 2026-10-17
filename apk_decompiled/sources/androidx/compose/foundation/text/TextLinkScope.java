package androidx.compose.foundation.text;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.hm0;
import defpackage.iy;
import defpackage.kd;
import defpackage.ky;
import defpackage.ld;
import defpackage.my;
import defpackage.oi;
import defpackage.p7;
import defpackage.p9;
import defpackage.q10;
import defpackage.qu0;
import defpackage.sn0;
import defpackage.te0;
import defpackage.w01;
import defpackage.y80;
import defpackage.yq0;
import defpackage.z5;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextLinkScope {
    public static final int $stable = 8;
    private final AnnotatedString initialText;
    private AnnotatedString text;
    private final MutableState textLayoutResult$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final SnapshotStateList<ky> annotators = SnapshotStateKt.mutableStateListOf();

    public TextLinkScope(AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.text = annotatedString.flatMapAnnotations(new qu0(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinksComposables$lambda$0$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey<w01> linkTestMarker = SemanticsProperties.INSTANCE.getLinkTestMarker();
        w01 w01Var = w01.a;
        semanticsPropertyReceiver.set(linkTestMarker, w01Var);
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinksComposables$lambda$0$2$0(TextLinkScope textLinkScope, AnnotatedString.Range range, UriHandler uriHandler) {
        textLinkScope.handleLink((LinkAnnotation) range.getItem(), uriHandler);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinksComposables$lambda$0$5$0(TextLinkScope textLinkScope, AnnotatedString.Range range, LinkStateInteractionSourceObserver linkStateInteractionSourceObserver, TextAnnotatorScope textAnnotatorScope) {
        TextLinkStyles styles;
        TextLinkStyles styles2;
        TextLinkStyles styles3;
        TextLinkStyles styles4 = ((LinkAnnotation) range.getItem()).getStyles();
        SpanStyle spanStyle = null;
        SpanStyle mergeOrUse = textLinkScope.mergeOrUse(textLinkScope.mergeOrUse(styles4 != null ? styles4.getStyle() : null, (!linkStateInteractionSourceObserver.isFocused() || (styles3 = ((LinkAnnotation) range.getItem()).getStyles()) == null) ? null : styles3.getFocusedStyle()), (!linkStateInteractionSourceObserver.isHovered() || (styles2 = ((LinkAnnotation) range.getItem()).getStyles()) == null) ? null : styles2.getHoveredStyle());
        if (linkStateInteractionSourceObserver.isPressed() && (styles = ((LinkAnnotation) range.getItem()).getStyles()) != null) {
            spanStyle = styles.getPressedStyle();
        }
        textAnnotatorScope.replaceStyle(range, textLinkScope.mergeOrUse(mergeOrUse, spanStyle));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinksComposables$lambda$1(TextLinkScope textLinkScope, int i, Composer composer, int i2) {
        textLinkScope.LinksComposables(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private final void StyleAnnotation(Object[] objArr, ky kyVar, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2083052099);
        int i2 = (i & 48) == 0 ? (startRestartGroup.changedInstance(kyVar) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        startRestartGroup.startMovableGroup(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= startRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        startRestartGroup.endMovableGroup();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2083052099, i3, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            p7 p7Var = new p7(2);
            ArrayList arrayList = (ArrayList) p7Var.d;
            p7Var.b(kyVar);
            p7Var.e(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean changedInstance = ((i3 & 112) == 32) | startRestartGroup.changedInstance(this);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new kd(this, kyVar, i4);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(array, (ky) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 12, this, objArr, kyVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult StyleAnnotation$lambda$0$0(final TextLinkScope textLinkScope, final ky kyVar, DisposableEffectScope disposableEffectScope) {
        textLinkScope.annotators.add(kyVar);
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SnapshotStateList snapshotStateList;
                snapshotStateList = TextLinkScope.this.annotators;
                snapshotStateList.remove(kyVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 StyleAnnotation$lambda$1(TextLinkScope textLinkScope, Object[] objArr, ky kyVar, int i, Composer composer, int i2) {
        textLinkScope.StyleAnnotation(objArr, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_shouldMeasureLinks_$lambda$0(TextLinkScope textLinkScope) {
        TextLayoutInput layoutInput;
        AnnotatedString annotatedString = textLinkScope.text;
        TextLayoutResult textLayoutResult = textLinkScope.getTextLayoutResult();
        return q10.b(annotatedString, (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null) ? null : layoutInput.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _init_$lambda$0(AnnotatedString.Range range) {
        boolean isNullOrEmpty;
        SpanStyle spanStyle;
        if (range.getItem() instanceof LinkAnnotation) {
            Object item = range.getItem();
            item.getClass();
            isNullOrEmpty = TextLinkScopeKt.isNullOrEmpty(((LinkAnnotation) item).getStyles());
            if (!isNullOrEmpty) {
                Object item2 = range.getItem();
                item2.getClass();
                TextLinkStyles styles = ((LinkAnnotation) item2).getStyles();
                if (styles == null || (spanStyle = styles.getStyle()) == null) {
                    spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (dq) null);
                }
                return y80.a(range, new AnnotatedString.Range(spanStyle, range.getStart(), range.getEnd()));
            }
        }
        return y80.a(range);
    }

    private final AnnotatedString.Range<LinkAnnotation> calculateVisibleLinkRange(AnnotatedString.Range<LinkAnnotation> range, TextLayoutResult textLayoutResult) {
        int lineEnd$default = TextLayoutResult.getLineEnd$default(textLayoutResult, textLayoutResult.getLineCount() - 1, false, 2, null);
        if (range.getStart() < lineEnd$default) {
            return AnnotatedString.Range.copy$default(range, null, 0, Math.min(range.getEnd(), lineEnd$default), null, 11, null);
        }
        return null;
    }

    private final Modifier clipLink(Modifier modifier, AnnotatedString.Range<LinkAnnotation> range) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new te0(16, this, range));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 clipLink$lambda$0(TextLinkScope textLinkScope, AnnotatedString.Range range, GraphicsLayerScope graphicsLayerScope) {
        Shape shapeForRange = textLinkScope.shapeForRange(range);
        if (shapeForRange != null) {
            graphicsLayerScope.setShape(shapeForRange);
            graphicsLayerScope.setClip(true);
        }
        return w01.a;
    }

    private final void handleLink(LinkAnnotation linkAnnotation, UriHandler uriHandler) {
        LinkInteractionListener linkInteractionListener;
        if (!(linkAnnotation instanceof LinkAnnotation.Url)) {
            if (!(linkAnnotation instanceof LinkAnnotation.Clickable) || (linkInteractionListener = ((LinkAnnotation.Clickable) linkAnnotation).getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.onClick(linkAnnotation);
            return;
        }
        LinkInteractionListener linkInteractionListener2 = ((LinkAnnotation.Url) linkAnnotation).getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.onClick(linkAnnotation);
        } else {
            try {
                uriHandler.openUri(((LinkAnnotation.Url) linkAnnotation).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private final SpanStyle mergeOrUse(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle merge;
        return (spanStyle == null || (merge = spanStyle.merge(spanStyle2)) == null) ? spanStyle2 : merge;
    }

    private final Path pathForRangeInRangeCoordinates(AnnotatedString.Range<LinkAnnotation> range) {
        TextLayoutResult textLayoutResult;
        AnnotatedString.Range<LinkAnnotation> calculateVisibleLinkRange;
        if (!((Boolean) getShouldMeasureLinks().invoke()).booleanValue() || (textLayoutResult = getTextLayoutResult()) == null || (calculateVisibleLinkRange = calculateVisibleLinkRange(range, textLayoutResult)) == null) {
            return null;
        }
        Path pathForRange = textLayoutResult.getPathForRange(calculateVisibleLinkRange.getStart(), calculateVisibleLinkRange.getEnd());
        Rect boundingBox = textLayoutResult.getBoundingBox(calculateVisibleLinkRange.getStart());
        pathForRange.mo4653translatek4lQ0M(Offset.m4508constructorimpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(textLayoutResult.getLineForOffset(calculateVisibleLinkRange.getStart()) == textLayoutResult.getLineForOffset(calculateVisibleLinkRange.getEnd() + (-1)) ? Math.min(textLayoutResult.getBoundingBox(calculateVisibleLinkRange.getEnd() - 1).getLeft(), boundingBox.getLeft()) : 0.0f) << 32) | (Float.floatToRawIntBits(boundingBox.getTop()) & 4294967295L)) ^ (-9223372034707292160L)));
        return pathForRange;
    }

    private final Shape shapeForRange(AnnotatedString.Range<LinkAnnotation> range) {
        final Path pathForRangeInRangeCoordinates = pathForRangeInRangeCoordinates(range);
        if (pathForRangeInRangeCoordinates != null) {
            return new Shape() { // from class: androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Generic(Path.this);
                }
            };
        }
        return null;
    }

    private final Modifier textRange(Modifier modifier, AnnotatedString.Range<LinkAnnotation> range) {
        return modifier.then(new TextRangeLayoutModifier(new yq0(this, range)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRangeLayoutMeasureResult textRange$lambda$0(TextLinkScope textLinkScope, AnnotatedString.Range range, TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLayoutResult textLayoutResult = textLinkScope.getTextLayoutResult();
        if (textLayoutResult == null) {
            return textRangeLayoutMeasureScope.layout(0, 0, new sn0(11));
        }
        AnnotatedString.Range<LinkAnnotation> calculateVisibleLinkRange = textLinkScope.calculateVisibleLinkRange(range, textLayoutResult);
        if (calculateVisibleLinkRange == null) {
            return textRangeLayoutMeasureScope.layout(0, 0, new sn0(12));
        }
        IntRect roundToIntRect = IntRectKt.roundToIntRect(textLayoutResult.getPathForRange(calculateVisibleLinkRange.getStart(), calculateVisibleLinkRange.getEnd()).getBounds());
        return textRangeLayoutMeasureScope.layout(roundToIntRect.getWidth(), roundToIntRect.getHeight(), new hm0(roundToIntRect, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset textRange$lambda$0$0() {
        return IntOffset.m7730boximpl(IntOffset.Companion.m7750getZeronOccac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset textRange$lambda$0$1() {
        return IntOffset.m7730boximpl(IntOffset.Companion.m7750getZeronOccac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset textRange$lambda$0$2(IntRect intRect) {
        return IntOffset.m7730boximpl(intRect.m7768getTopLeftnOccac());
    }

    public final void LinksComposables(Composer composer, int i) {
        int i2;
        int i3;
        char c;
        boolean isNullOrEmpty;
        Composer startRestartGroup = composer.startRestartGroup(1154651354);
        char c2 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154651354, i2, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            UriHandler uriHandler = (UriHandler) startRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            AnnotatedString annotatedString = this.text;
            List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
            int size = linkAnnotations.size();
            int i5 = 0;
            while (i5 < size) {
                AnnotatedString.Range<LinkAnnotation> range = linkAnnotations.get(i5);
                if (range.getStart() != range.getEnd()) {
                    startRestartGroup.startReplaceGroup(725478935);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    Modifier clipLink = clipLink(Modifier.Companion, range);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new qu0(5);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(HoverableKt.hoverable$default(textRange(SemanticsModifierKt.semantics$default(clipLink, false, (ky) rememberedValue2, i4, null), range), mutableInteractionSource, false, 2, null), PointerIcon.Companion.getHand(), false, 2, null);
                    boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changed(range) | startRestartGroup.changedInstance(uriHandler);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new p9(this, range, uriHandler, 12);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    c = 2;
                    BoxKt.Box(ClickableKt.m266combinedClickableauXiCPI$default(pointerHoverIcon$default, mutableInteractionSource, null, false, null, null, null, null, null, false, (iy) rememberedValue3, 508, null), startRestartGroup, 0);
                    isNullOrEmpty = TextLinkScopeKt.isNullOrEmpty(range.getItem().getStyles());
                    if (isNullOrEmpty) {
                        i3 = 1;
                        startRestartGroup.startReplaceGroup(716130110);
                    } else {
                        startRestartGroup.startReplaceGroup(726303039);
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == companion.getEmpty()) {
                            rememberedValue4 = new LinkStateInteractionSourceObserver(mutableInteractionSource);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = (LinkStateInteractionSourceObserver) rememberedValue4;
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == companion.getEmpty()) {
                            rememberedValue5 = new TextLinkScope$LinksComposables$1$3$1(linkStateInteractionSourceObserver, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue5, startRestartGroup, 6);
                        Boolean valueOf = Boolean.valueOf(linkStateInteractionSourceObserver.isHovered());
                        Boolean valueOf2 = Boolean.valueOf(linkStateInteractionSourceObserver.isFocused());
                        Boolean valueOf3 = Boolean.valueOf(linkStateInteractionSourceObserver.isPressed());
                        TextLinkStyles styles = range.getItem().getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : null;
                        TextLinkStyles styles2 = range.getItem().getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        TextLinkStyles styles3 = range.getItem().getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        TextLinkStyles styles4 = range.getItem().getStyles();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean changedInstance2 = startRestartGroup.changedInstance(this) | startRestartGroup.changed(range);
                        Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue6 == companion.getEmpty()) {
                            i3 = 1;
                            rememberedValue6 = new g(this, range, linkStateInteractionSourceObserver, i3);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        } else {
                            i3 = 1;
                        }
                        StyleAnnotation(objArr, (ky) rememberedValue6, startRestartGroup, (i2 << 6) & 896);
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    i3 = i4;
                    c = c2;
                    startRestartGroup.startReplaceGroup(716130110);
                }
                startRestartGroup.endReplaceGroup();
                i5++;
                c2 = c;
                i4 = i3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new oi(this, i, 7));
        }
    }

    public final AnnotatedString applyAnnotators$foundation() {
        boolean isEmpty = this.annotators.isEmpty();
        AnnotatedString annotatedString = this.text;
        if (!isEmpty) {
            TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(annotatedString);
            SnapshotStateList<ky> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                snapshotStateList.get(i).invoke(textAnnotatorScope);
            }
            annotatedString = textAnnotatorScope.getStyledText();
        }
        this.text = annotatedString;
        return annotatedString;
    }

    public final AnnotatedString getInitialText$foundation() {
        return this.initialText;
    }

    public final iy getShouldMeasureLinks() {
        return new ld(this, 2);
    }

    public final AnnotatedString getText$foundation() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextLayoutResult getTextLayoutResult() {
        return (TextLayoutResult) this.textLayoutResult$delegate.getValue();
    }

    public final void setText$foundation(AnnotatedString annotatedString) {
        this.text = annotatedString;
    }

    public final void setTextLayoutResult(TextLayoutResult textLayoutResult) {
        this.textLayoutResult$delegate.setValue(textLayoutResult);
    }
}
