package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import defpackage.dq;
import defpackage.ky;
import defpackage.o;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private ky onShowTranslation;
    private SelectionController selectionController;
    private final TextAnnotatedStringNode textAnnotatedStringNode;

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3, int i4, dq dqVar) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : kyVar, (i4 & 16) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & Fields.SpotShadowColor) != 0 ? 1 : i3, (i4 & Fields.RotationX) != 0 ? null : list, (i4 & Fields.RotationY) != 0 ? null : kyVar2, (i4 & Fields.RotationZ) != 0 ? null : selectionController, (i4 & Fields.CameraDistance) != 0 ? null : colorProducer, (i4 & Fields.TransformOrigin) != 0 ? null : textAutoSize, (i4 & 8192) != 0 ? null : kyVar3, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.textAnnotatedStringNode.drawNonExtension(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.maxIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.maxIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return this.textAnnotatedStringNode.m1475measureNonExtension3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.minIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.minIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.updateGlobalPosition(layoutCoordinates);
        }
    }

    /* renamed from: update-7NebLg4, reason: not valid java name */
    public final void m1474update7NebLg4(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, int i2, boolean z, FontFamily.Resolver resolver, int i3, ky kyVar, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        TextAnnotatedStringNode textAnnotatedStringNode = this.textAnnotatedStringNode;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(colorProducer, textStyle), this.textAnnotatedStringNode.updateText$foundation(annotatedString), this.textAnnotatedStringNode.m1476updateLayoutRelatedArgsy0kMQk(textStyle, list, i, i2, z, resolver, i3, textAutoSize), this.textAnnotatedStringNode.updateCallbacks(kyVar, kyVar2, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    private SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3) {
        this.selectionController = selectionController;
        this.onShowTranslation = kyVar3;
        this.textAnnotatedStringNode = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(annotatedString, textStyle, resolver, kyVar, i, z, i2, i3, list, kyVar2, selectionController, colorProducer, textAutoSize, kyVar3, null));
        if (this.selectionController != null) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        o.j();
        throw null;
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3, dq dqVar) {
        this(annotatedString, textStyle, resolver, kyVar, i, z, i2, i3, list, kyVar2, selectionController, colorProducer, textAutoSize, kyVar3);
    }
}
