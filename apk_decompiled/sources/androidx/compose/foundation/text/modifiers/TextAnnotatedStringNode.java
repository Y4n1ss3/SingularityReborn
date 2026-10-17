package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;
import defpackage.h7;
import defpackage.hm0;
import defpackage.kp0;
import defpackage.ky;
import defpackage.q10;
import defpackage.ut;
import defpackage.w01;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private MultiParagraphLayoutCache _layoutCache;
    private TextAutoSize autoSize;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private ky onPlaceholderLayout;
    private ky onShowTranslation;
    private ky onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private ky semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3, int i4, dq dqVar) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : kyVar, (i4 & 16) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & Fields.SpotShadowColor) != 0 ? 1 : i3, (i4 & Fields.RotationX) != 0 ? null : list, (i4 & Fields.RotationY) != 0 ? null : kyVar2, (i4 & Fields.RotationZ) != 0 ? null : selectionController, (i4 & Fields.CameraDistance) != 0 ? null : colorProducer, (i4 & Fields.TransformOrigin) != 0 ? null : textAutoSize, (i4 & 8192) != 0 ? null : kyVar3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean applySemantics$lambda$0(TextAnnotatedStringNode textAnnotatedStringNode, List list) {
        TextLayoutResult textLayoutResult;
        TextStyle m7105mergedA7vx0o;
        TextLayoutResult layoutOrNull = textAnnotatedStringNode.getLayoutCache().getLayoutOrNull();
        if (layoutOrNull != null) {
            AnnotatedString text = layoutOrNull.getLayoutInput().getText();
            TextStyle textStyle = textAnnotatedStringNode.style;
            ColorProducer colorProducer = textAnnotatedStringNode.overrideColor;
            m7105mergedA7vx0o = textStyle.m7105mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo1922invoke0d7_KjU() : Color.Companion.m4797getUnspecified0d7_KjU(), (r60 & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : 0L, (r60 & Fields.RotationX) != 0 ? null : null, (r60 & Fields.RotationY) != 0 ? null : null, (r60 & Fields.RotationZ) != 0 ? null : null, (r60 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : 0L, (r60 & Fields.TransformOrigin) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & Fields.Clip) != 0 ? null : null, (r60 & Fields.CompositingStrategy) != 0 ? TextAlign.Companion.m7495getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m7511getUnspecifieds_7Xco() : 0, (r60 & Fields.RenderEffect) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : 0L, (r60 & Fields.ColorFilter) != 0 ? null : null, (r60 & Fields.BlendMode) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m7407getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m7383getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & GroupFlagsKt.IsNodeFlag) != 0 ? null : null);
            textLayoutResult = TextLayoutResult.m7028copyO0kMr_c$default(layoutOrNull, new TextLayoutInput(text, m7105mergedA7vx0o, layoutOrNull.getLayoutInput().getPlaceholders(), layoutOrNull.getLayoutInput().getMaxLines(), layoutOrNull.getLayoutInput().getSoftWrap(), layoutOrNull.getLayoutInput().m7027getOverflowgIe3tQ8(), layoutOrNull.getLayoutInput().getDensity(), layoutOrNull.getLayoutInput().getLayoutDirection(), layoutOrNull.getLayoutInput().getFontFamilyResolver(), layoutOrNull.getLayoutInput().m7026getConstraintsmsEJaDk(), (dq) null), 0L, 2, null);
            if (textLayoutResult != null) {
                list.add(textLayoutResult);
                return textLayoutResult == null;
            }
        }
        textLayoutResult = null;
        if (textLayoutResult == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$1(TextAnnotatedStringNode textAnnotatedStringNode, AnnotatedString annotatedString) {
        textAnnotatedStringNode.setSubstitution(annotatedString);
        textAnnotatedStringNode.invalidateForTranslate();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$2(TextAnnotatedStringNode textAnnotatedStringNode, boolean z) {
        TextSubstitutionValue textSubstitutionValue = textAnnotatedStringNode.textSubstitution;
        if (textSubstitutionValue == null) {
            return false;
        }
        ky kyVar = textAnnotatedStringNode.onShowTranslation;
        if (kyVar != null) {
            textSubstitutionValue.getClass();
            kyVar.invoke(textSubstitutionValue);
        }
        TextSubstitutionValue textSubstitutionValue2 = textAnnotatedStringNode.textSubstitution;
        if (textSubstitutionValue2 != null) {
            textSubstitutionValue2.setShowingSubstitution(z);
        }
        textAnnotatedStringNode.invalidateForTranslate();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$3(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.clearSubstitution$foundation();
        textAnnotatedStringNode.invalidateForTranslate();
        return true;
    }

    private final MultiParagraphLayoutCache getLayoutCache() {
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        if (multiParagraphLayoutCache == null) {
            MultiParagraphLayoutCache multiParagraphLayoutCache2 = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize, null);
            this._layoutCache = multiParagraphLayoutCache2;
            multiParagraphLayoutCache = multiParagraphLayoutCache2;
        }
        multiParagraphLayoutCache.getClass();
        return multiParagraphLayoutCache;
    }

    private final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    private final boolean setSubstitution(AnnotatedString annotatedString) {
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        ut utVar = ut.d;
        if (textSubstitutionValue != null) {
            if (q10.b(annotatedString, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.setSubstitution(annotatedString);
            MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache == null) {
                return false;
            }
            layoutCache.m1461updateJ2qo7bo(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, utVar, this.autoSize);
            return true;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, annotatedString, false, null, 12, null);
        MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, utVar, this.autoSize, null);
        multiParagraphLayoutCache.setDensity$foundation(getLayoutCache().getDensity$foundation());
        textSubstitutionValue2.setLayoutCache(multiParagraphLayoutCache);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        ky kyVar = this.semanticsTextLayoutResult;
        if (kyVar == null) {
            final int i = 0;
            kyVar = new ky(this) { // from class: tt0
                public final /* synthetic */ TextAnnotatedStringNode e;

                {
                    this.e = this;
                }

                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    boolean applySemantics$lambda$0;
                    int i2 = i;
                    TextAnnotatedStringNode textAnnotatedStringNode = this.e;
                    switch (i2) {
                        case 0:
                            applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$0(textAnnotatedStringNode, (List) obj);
                            break;
                        case 1:
                            applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$1(textAnnotatedStringNode, (AnnotatedString) obj);
                            break;
                        default:
                            applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$2(textAnnotatedStringNode, ((Boolean) obj).booleanValue());
                            break;
                    }
                    return Boolean.valueOf(applySemantics$lambda$0);
                }
            };
            this.semanticsTextLayoutResult = kyVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
        }
        final int i2 = 1;
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new ky(this) { // from class: tt0
            public final /* synthetic */ TextAnnotatedStringNode e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                boolean applySemantics$lambda$0;
                int i22 = i2;
                TextAnnotatedStringNode textAnnotatedStringNode = this.e;
                switch (i22) {
                    case 0:
                        applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$0(textAnnotatedStringNode, (List) obj);
                        break;
                    case 1:
                        applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$1(textAnnotatedStringNode, (AnnotatedString) obj);
                        break;
                    default:
                        applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$2(textAnnotatedStringNode, ((Boolean) obj).booleanValue());
                        break;
                }
                return Boolean.valueOf(applySemantics$lambda$0);
            }
        }, 1, null);
        final int i3 = 2;
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new ky(this) { // from class: tt0
            public final /* synthetic */ TextAnnotatedStringNode e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                boolean applySemantics$lambda$0;
                int i22 = i3;
                TextAnnotatedStringNode textAnnotatedStringNode = this.e;
                switch (i22) {
                    case 0:
                        applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$0(textAnnotatedStringNode, (List) obj);
                        break;
                    case 1:
                        applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$1(textAnnotatedStringNode, (AnnotatedString) obj);
                        break;
                    default:
                        applySemantics$lambda$0 = TextAnnotatedStringNode.applySemantics$lambda$2(textAnnotatedStringNode, ((Boolean) obj).booleanValue());
                        break;
                }
                return Boolean.valueOf(applySemantics$lambda$0);
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new hm0(this, 10), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, kyVar, 1, null);
    }

    public final void clearSubstitution$foundation() {
        this.textSubstitution = null;
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            getLayoutCache().m1461updateJ2qo7bo(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize);
        }
        if (isAttached()) {
            if (z2 || (z && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z2 || z3 || z4) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (z) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        List<AnnotatedString.Range<Placeholder>> list;
        if (isAttached()) {
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m7537equalsimpl0(this.overflow, TextOverflow.Companion.m7550getVisiblegIe3tQ8());
            if (z) {
                Rect m4556Recttz77jQw = RectKt.m4556Recttz77jQw(Offset.Companion.m4532getZeroF1C5BW0(), Size.m4576constructorimpl((Float.floatToRawIntBits((int) (textLayoutResult.m7031getSizeYbymL2g() >> 32)) << 32) | (Float.floatToRawIntBits((int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L)) & 4294967295L)));
                canvas.save();
                Canvas.m4734clipRectmtrdDE$default(canvas, m4556Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    MultiParagraph.m6919painthn5TExg$default(multiParagraph, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long mo1922invoke0d7_KjU = colorProducer != null ? colorProducer.mo1922invoke0d7_KjU() : Color.Companion.m4797getUnspecified0d7_KjU();
                    if (mo1922invoke0d7_KjU == 16) {
                        mo1922invoke0d7_KjU = this.style.m7090getColor0d7_KjU() != 16 ? this.style.m7090getColor0d7_KjU() : Color.Companion.m4787getBlack0d7_KjU();
                    }
                    multiParagraph.m6924paintLG529CI(canvas, (r14 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : mo1922invoke0d7_KjU, (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z) {
                    canvas.restore();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (((textSubstitutionValue == null || !textSubstitutionValue.isShowingSubstitution()) ? TextAnnotatedStringNodeKt.hasLinks(this.text) : false) || !((list = this.placeholders) == null || list.isEmpty())) {
                    contentDrawScope.drawContent();
                }
            } catch (Throwable th) {
                if (z) {
                    canvas.restore();
                }
                throw th;
            }
        }
    }

    public final void drawNonExtension(ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final TextSubstitutionValue getTextSubstitution$foundation() {
        return this.textSubstitution;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
            boolean m1460layoutWithConstraintsK40F9xA = layoutCache.m1460layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
            TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
            textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
            if (m1460layoutWithConstraintsK40F9xA) {
                LayoutModifierNodeKt.invalidateLayer(this);
                ky kyVar = this.onTextLayout;
                if (kyVar != null) {
                    kyVar.invoke(textLayoutResult);
                }
                SelectionController selectionController = this.selectionController;
                if (selectionController != null) {
                    selectionController.updateTextLayout(textLayoutResult);
                }
                Map<AlignmentLine, Integer> map = this.baselineCache;
                if (map == null) {
                    map = new LinkedHashMap<>(2);
                }
                map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline())));
                map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())));
                this.baselineCache = map;
            }
            ky kyVar2 = this.onPlaceholderLayout;
            if (kyVar2 != null) {
                kyVar2.invoke(textLayoutResult.getPlaceholderRects());
            }
            Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA((int) (textLayoutResult.m7031getSizeYbymL2g() >> 32), (int) (textLayoutResult.m7031getSizeYbymL2g() >> 32), (int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L), (int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L)));
            int m7031getSizeYbymL2g = (int) (textLayoutResult.m7031getSizeYbymL2g() >> 32);
            int m7031getSizeYbymL2g2 = (int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L);
            Map<AlignmentLine, Integer> map2 = this.baselineCache;
            map2.getClass();
            return measureScope.layout(m7031getSizeYbymL2g, m7031getSizeYbymL2g2, map2, new h7(8, mo6234measureBRTryo0));
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m1475measureNonExtension3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return mo33measure3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final void setTextSubstitution$foundation(TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution = textSubstitutionValue;
    }

    public final boolean updateCallbacks(ky kyVar, ky kyVar2, SelectionController selectionController, ky kyVar3) {
        boolean z;
        if (this.onTextLayout != kyVar) {
            this.onTextLayout = kyVar;
            z = true;
        } else {
            z = false;
        }
        if (this.onPlaceholderLayout != kyVar2) {
            this.onPlaceholderLayout = kyVar2;
            z = true;
        }
        if (!q10.b(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z = true;
        }
        if (this.onShowTranslation == kyVar3) {
            return z;
        }
        this.onShowTranslation = kyVar3;
        return true;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean b = q10.b(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (b && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-y0k-MQk, reason: not valid java name */
    public final boolean m1476updateLayoutRelatedArgsy0kMQk(TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, int i2, boolean z, FontFamily.Resolver resolver, int i3, TextAutoSize textAutoSize) {
        boolean z2 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (!q10.b(this.placeholders, list)) {
            this.placeholders = list;
            z2 = true;
        }
        if (this.minLines != i) {
            this.minLines = i;
            z2 = true;
        }
        if (this.maxLines != i2) {
            this.maxLines = i2;
            z2 = true;
        }
        if (this.softWrap != z) {
            this.softWrap = z;
            z2 = true;
        }
        if (!q10.b(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z2 = true;
        }
        if (!TextOverflow.m7537equalsimpl0(this.overflow, i3)) {
            this.overflow = i3;
            z2 = true;
        }
        if (q10.b(this.autoSize, textAutoSize)) {
            return z2;
        }
        this.autoSize = textAutoSize;
        return true;
    }

    public final boolean updateText$foundation(AnnotatedString annotatedString) {
        boolean b = q10.b(this.text.getText(), annotatedString.getText());
        boolean z = (b && this.text.hasEqualAnnotations(annotatedString)) ? false : true;
        if (z) {
            this.text = annotatedString;
        }
        if (!b) {
            clearSubstitution$foundation();
        }
        return z;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private MultiParagraphLayoutCache layoutCache;
        private final AnnotatedString original;
        private AnnotatedString substitution;

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache, int i, dq dqVar) {
            this(annotatedString, annotatedString2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : multiParagraphLayoutCache);
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache, int i, Object obj) {
            if ((i & 1) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i & 2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i & 4) != 0) {
                z = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i & 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z, multiParagraphLayoutCache);
        }

        public final AnnotatedString component1() {
            return this.original;
        }

        public final AnnotatedString component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final MultiParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            return new TextSubstitutionValue(annotatedString, annotatedString2, z, multiParagraphLayoutCache);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return q10.b(this.original, textSubstitutionValue.original) && q10.b(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && q10.b(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final AnnotatedString getOriginal() {
            return this.original;
        }

        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int c = kp0.c((this.substitution.hashCode() + (this.original.hashCode() * 31)) * 31, 31, this.isShowingSubstitution);
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return c + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final void setSubstitution(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z;
            this.layoutCache = multiParagraphLayoutCache;
        }
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation(density);
        return layoutCache2;
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = kyVar;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = kyVar2;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.autoSize = textAutoSize;
        this.onShowTranslation = kyVar3;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3, dq dqVar) {
        this(annotatedString, textStyle, resolver, kyVar, i, z, i2, i3, list, kyVar2, selectionController, colorProducer, textAutoSize, kyVar3);
    }
}
