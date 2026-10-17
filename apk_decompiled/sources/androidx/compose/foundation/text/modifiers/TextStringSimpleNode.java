package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
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
import androidx.compose.ui.text.Paragraph;
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
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;
import defpackage.h7;
import defpackage.hm0;
import defpackage.kp0;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import defpackage.uf;
import defpackage.w01;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private ParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;
    private ColorProducer overrideColor;
    private ky semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private String text;
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer, int i4, dq dqVar) {
        this(str, textStyle, resolver, (i4 & 8) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, (i4 & Fields.SpotShadowColor) != 0 ? null : colorProducer, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$0(TextStringSimpleNode textStringSimpleNode, List list) {
        TextStyle m7105mergedA7vx0o;
        ParagraphLayoutCache layoutCache = textStringSimpleNode.getLayoutCache();
        TextStyle textStyle = textStringSimpleNode.style;
        ColorProducer colorProducer = textStringSimpleNode.overrideColor;
        m7105mergedA7vx0o = textStyle.m7105mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo1922invoke0d7_KjU() : Color.Companion.m4797getUnspecified0d7_KjU(), (r60 & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : 0L, (r60 & Fields.RotationX) != 0 ? null : null, (r60 & Fields.RotationY) != 0 ? null : null, (r60 & Fields.RotationZ) != 0 ? null : null, (r60 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : 0L, (r60 & Fields.TransformOrigin) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & Fields.Clip) != 0 ? null : null, (r60 & Fields.CompositingStrategy) != 0 ? TextAlign.Companion.m7495getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m7511getUnspecifieds_7Xco() : 0, (r60 & Fields.RenderEffect) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : 0L, (r60 & Fields.ColorFilter) != 0 ? null : null, (r60 & Fields.BlendMode) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m7407getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m7383getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & GroupFlagsKt.IsNodeFlag) != 0 ? null : null);
        TextLayoutResult slowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(m7105mergedA7vx0o);
        if (slowCreateTextLayoutResultOrNull != null) {
            list.add(slowCreateTextLayoutResultOrNull);
        } else {
            slowCreateTextLayoutResultOrNull = null;
        }
        return slowCreateTextLayoutResultOrNull != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$1(TextStringSimpleNode textStringSimpleNode, AnnotatedString annotatedString) {
        textStringSimpleNode.setSubstitution(annotatedString.getText());
        textStringSimpleNode.invalidateForTranslate();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$2(TextStringSimpleNode textStringSimpleNode, boolean z) {
        TextSubstitutionValue textSubstitutionValue = textStringSimpleNode.textSubstitution;
        if (textSubstitutionValue == null) {
            return false;
        }
        if (textSubstitutionValue != null) {
            textSubstitutionValue.setShowingSubstitution(z);
        }
        textStringSimpleNode.invalidateForTranslate();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$3(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.clearSubstitution();
        textStringSimpleNode.invalidateForTranslate();
        return true;
    }

    private final void clearSubstitution() {
        this.textSubstitution = null;
    }

    private final ParagraphLayoutCache getLayoutCache() {
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        if (paragraphLayoutCache == null) {
            ParagraphLayoutCache paragraphLayoutCache2 = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            this._layoutCache = paragraphLayoutCache2;
            paragraphLayoutCache = paragraphLayoutCache2;
        }
        paragraphLayoutCache.getClass();
        return paragraphLayoutCache;
    }

    private final ParagraphLayoutCache getLayoutCacheForMeasure(IntrinsicMeasureScope intrinsicMeasureScope) {
        ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
        layoutCacheOrSubstitute.setDensity$foundation(intrinsicMeasureScope);
        return layoutCacheOrSubstitute;
    }

    private final ParagraphLayoutCache getLayoutCacheOrSubstitute() {
        ParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (!textSubstitutionValue.isShowingSubstitution()) {
                textSubstitutionValue = null;
            }
            if (textSubstitutionValue != null && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
                return layoutCache;
            }
        }
        return getLayoutCache();
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

    private final boolean setSubstitution(String str) {
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (q10.b(str, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.setSubstitution(str);
            ParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache == null) {
                return false;
            }
            layoutCache.m1473updateL6sJoHM(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            return true;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, str, false, null, 12, null);
        ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        paragraphLayoutCache.setDensity$foundation(getLayoutCache().getDensity$foundation());
        textSubstitutionValue2.setLayoutCache(paragraphLayoutCache);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        ky kyVar = this.semanticsTextLayoutResult;
        if (kyVar == null) {
            final int i = 0;
            kyVar = new ky(this) { // from class: tu0
                public final /* synthetic */ TextStringSimpleNode e;

                {
                    this.e = this;
                }

                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    boolean applySemantics$lambda$0;
                    int i2 = i;
                    TextStringSimpleNode textStringSimpleNode = this.e;
                    switch (i2) {
                        case 0:
                            applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$0(textStringSimpleNode, (List) obj);
                            break;
                        case 1:
                            applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$1(textStringSimpleNode, (AnnotatedString) obj);
                            break;
                        default:
                            applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$2(textStringSimpleNode, ((Boolean) obj).booleanValue());
                            break;
                    }
                    return Boolean.valueOf(applySemantics$lambda$0);
                }
            };
            this.semanticsTextLayoutResult = kyVar;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i2 = 2;
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, i2, 0 == true ? 1 : 0));
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(textSubstitutionValue.getSubstitution(), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
        }
        final int i3 = 1;
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new ky(this) { // from class: tu0
            public final /* synthetic */ TextStringSimpleNode e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                boolean applySemantics$lambda$0;
                int i22 = i3;
                TextStringSimpleNode textStringSimpleNode = this.e;
                switch (i22) {
                    case 0:
                        applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$0(textStringSimpleNode, (List) obj);
                        break;
                    case 1:
                        applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$1(textStringSimpleNode, (AnnotatedString) obj);
                        break;
                    default:
                        applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$2(textStringSimpleNode, ((Boolean) obj).booleanValue());
                        break;
                }
                return Boolean.valueOf(applySemantics$lambda$0);
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new ky(this) { // from class: tu0
            public final /* synthetic */ TextStringSimpleNode e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                boolean applySemantics$lambda$0;
                int i22 = i2;
                TextStringSimpleNode textStringSimpleNode = this.e;
                switch (i22) {
                    case 0:
                        applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$0(textStringSimpleNode, (List) obj);
                        break;
                    case 1:
                        applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$1(textStringSimpleNode, (AnnotatedString) obj);
                        break;
                    default:
                        applySemantics$lambda$0 = TextStringSimpleNode.applySemantics$lambda$2(textStringSimpleNode, ((Boolean) obj).booleanValue());
                        break;
                }
                return Boolean.valueOf(applySemantics$lambda$0);
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new hm0(this, 16), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, kyVar, 1, null);
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3) {
        if (z2 || z3) {
            getLayoutCache().m1473updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (isAttached()) {
            if (z2 || (z && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z2 || z3) {
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
        if (!isAttached()) {
            return;
        }
        ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
        Paragraph paragraph$foundation = layoutCacheOrSubstitute.getParagraph$foundation();
        if (paragraph$foundation == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
            o.j();
            return;
        }
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        boolean didOverflow$foundation = layoutCacheOrSubstitute.getDidOverflow$foundation();
        if (didOverflow$foundation) {
            float m1469getLayoutSizeYbymL2g$foundation = (int) (layoutCacheOrSubstitute.m1469getLayoutSizeYbymL2g$foundation() >> 32);
            float m1469getLayoutSizeYbymL2g$foundation2 = (int) (layoutCacheOrSubstitute.m1469getLayoutSizeYbymL2g$foundation() & 4294967295L);
            canvas.save();
            Canvas.m4733clipRectN_I0leg$default(canvas, 0.0f, 0.0f, m1469getLayoutSizeYbymL2g$foundation, m1469getLayoutSizeYbymL2g$foundation2, 0, 16, null);
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
                Paragraph.m6930painthn5TExg$default(paragraph$foundation, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
            } else {
                ColorProducer colorProducer = this.overrideColor;
                long mo1922invoke0d7_KjU = colorProducer != null ? colorProducer.mo1922invoke0d7_KjU() : Color.Companion.m4797getUnspecified0d7_KjU();
                if (mo1922invoke0d7_KjU == 16) {
                    mo1922invoke0d7_KjU = this.style.m7090getColor0d7_KjU() != 16 ? this.style.m7090getColor0d7_KjU() : Color.Companion.m4787getBlack0d7_KjU();
                }
                Paragraph.m6928paintLG529CI$default(paragraph$foundation, canvas, mo1922invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
            }
            if (didOverflow$foundation) {
                canvas.restore();
            }
        } finally {
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            ParagraphLayoutCache layoutCacheForMeasure = getLayoutCacheForMeasure(measureScope);
            boolean m1471layoutWithConstraintsK40F9xA = layoutCacheForMeasure.m1471layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
            layoutCacheForMeasure.getObserveFontChanges$foundation();
            Paragraph paragraph$foundation = layoutCacheForMeasure.getParagraph$foundation();
            paragraph$foundation.getClass();
            long m1469getLayoutSizeYbymL2g$foundation = layoutCacheForMeasure.m1469getLayoutSizeYbymL2g$foundation();
            if (m1471layoutWithConstraintsK40F9xA) {
                LayoutModifierNodeKt.invalidateLayer(this);
                Map map = this.baselineCache;
                if (map == null) {
                    map = new HashMap(2);
                    this.baselineCache = map;
                }
                map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(paragraph$foundation.getFirstBaseline())));
                map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(paragraph$foundation.getLastBaseline())));
            }
            int i = (int) (m1469getLayoutSizeYbymL2g$foundation >> 32);
            int i2 = (int) (m1469getLayoutSizeYbymL2g$foundation & 4294967295L);
            Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA(i, i, i2, i2));
            Map<AlignmentLine, Integer> map2 = this.baselineCache;
            map2.getClass();
            return measureScope.layout(i, i2, map2, new h7(12, mo6234measureBRTryo0));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean b = q10.b(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (b && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m1477updateLayoutRelatedArgsHuAbxIM(TextStyle textStyle, int i, int i2, boolean z, FontFamily.Resolver resolver, int i3) {
        boolean z2 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
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
        if (TextOverflow.m7537equalsimpl0(this.overflow, i3)) {
            return z2;
        }
        this.overflow = i3;
        return true;
    }

    public final boolean updateText(String str) {
        if (q10.b(this.text, str)) {
            return false;
        }
        this.text = str;
        clearSubstitution();
        return true;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private ParagraphLayoutCache layoutCache;
        private final String original;
        private String substitution;

        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache, int i, dq dqVar) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : paragraphLayoutCache);
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textSubstitutionValue.original;
            }
            if ((i & 2) != 0) {
                str2 = textSubstitutionValue.substitution;
            }
            if ((i & 4) != 0) {
                z = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i & 8) != 0) {
                paragraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(str, str2, z, paragraphLayoutCache);
        }

        public final String component1() {
            return this.original;
        }

        public final String component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final ParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache) {
            return new TextSubstitutionValue(str, str2, z, paragraphLayoutCache);
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

        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final String getOriginal() {
            return this.original;
        }

        public final String getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int c = kp0.c((this.substitution.hashCode() + (this.original.hashCode() * 31)) * 31, 31, this.isShowingSubstitution);
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return c + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final void setSubstitution(String str) {
            this.substitution = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.layoutCache);
            sb.append(", isShowingSubstitution=");
            return uf.e(sb, this.isShowingSubstitution, ')');
        }

        public TextSubstitutionValue(String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z;
            this.layoutCache = paragraphLayoutCache;
        }
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.overrideColor = colorProducer;
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer, dq dqVar) {
        this(str, textStyle, resolver, i, z, i2, i3, colorProducer);
    }
}
