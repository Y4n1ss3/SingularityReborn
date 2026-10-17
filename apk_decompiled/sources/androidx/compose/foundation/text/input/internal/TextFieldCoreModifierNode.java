package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.k10;
import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import defpackage.ui;
import defpackage.ut0;
import defpackage.vt0;
import defpackage.w01;
import defpackage.xe0;
import defpackage.xn;
import defpackage.y80;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private z10 changeObserverJob;
    private CursorAnimationState cursorAnimation;
    private Brush cursorBrush;
    private boolean isDragHovered;
    private boolean isFocused;
    private Orientation orientation;
    private PlatformSelectionBehaviors platformSelectionBehaviors;
    private int previousContainerSize;
    private Rect previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);
    private TextRange previousSelection;
    private int previousTextLayoutSize;
    private ScrollState scrollState;
    private final TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode;
    private final TextFieldMagnifierNode textFieldMagnifierNode;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private ToolbarRequester toolbarRequester;
    private boolean writeable;

    public TextFieldCoreModifierNode(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.isFocused = z;
        this.isDragHovered = z2;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z3;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.toolbarRequester = toolbarRequester;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
        this.textFieldMagnifierNode = (TextFieldMagnifierNode) delegate(AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, this.isFocused || this.isDragHovered));
        this.textContextMenuToolbarHandlerNode = (TextContextMenuToolbarHandlerNode) delegate(new TextContextMenuToolbarHandlerNode(this.toolbarRequester, new TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1(this, null), new TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2(this, null), new vt0(this, 0)));
    }

    /* renamed from: calculateOffsetToFollow-8ffj60Q, reason: not valid java name */
    private final int m1326calculateOffsetToFollow8ffj60Q(long j, int i, int i2) {
        TextRange textRange = this.previousSelection;
        if (textRange == null || TextRange.m7055getEndimpl(j) != TextRange.m7055getEndimpl(textRange.m7064unboximpl())) {
            return TextRange.m7055getEndimpl(j);
        }
        TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || TextRange.m7060getStartimpl(j) != TextRange.m7060getStartimpl(textRange2.m7064unboximpl())) {
            return TextRange.m7060getStartimpl(j);
        }
        if (i2 == this.previousTextLayoutSize && i == this.previousContainerSize) {
            return -1;
        }
        return TextRange.m7060getStartimpl(j);
    }

    private final void drawCursor(DrawScope drawScope) {
        CursorAnimationState cursorAnimationState = this.cursorAnimation;
        float cursorAlpha = cursorAnimationState != null ? cursorAnimationState.getCursorAlpha() : 0.0f;
        if (cursorAlpha != 0.0f && getShowCursor()) {
            Rect cursorRect = this.textFieldSelectionState.getCursorRect();
            DrawScope.m5320drawLine1RTmtNc$default(drawScope, this.cursorBrush, cursorRect.m4550getTopCenterF1C5BW0(), cursorRect.m4543getBottomCenterF1C5BW0(), cursorRect.getRight() - cursorRect.getLeft(), 0, null, cursorAlpha, null, 0, 432, null);
        }
    }

    private final void drawHighlight(DrawScope drawScope, xe0 xe0Var, TextLayoutResult textLayoutResult) {
        int m1251unboximpl = ((TextHighlightType) xe0Var.d).m1251unboximpl();
        long m7064unboximpl = ((TextRange) xe0Var.e).m7064unboximpl();
        if (TextRange.m7054getCollapsedimpl(m7064unboximpl)) {
            return;
        }
        Path pathForRange = textLayoutResult.getPathForRange(TextRange.m7058getMinimpl(m7064unboximpl), TextRange.m7057getMaximpl(m7064unboximpl));
        if (!TextHighlightType.m1248equalsimpl0(m1251unboximpl, TextHighlightType.Companion.m1252getHandwritingDeletePreviewsxJuwY())) {
            DrawScope.m5325drawPathLG529CI$default(drawScope, pathForRange, ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1568getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
            return;
        }
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null) {
            DrawScope.m5324drawPathGBMwjPU$default(drawScope, pathForRange, brush, 0.2f, null, null, 0, 56, null);
            return;
        }
        long m7090getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m7090getColor0d7_KjU();
        if (m7090getColor0d7_KjU == 16) {
            m7090getColor0d7_KjU = Color.Companion.m4787getBlack0d7_KjU();
        }
        long j = m7090getColor0d7_KjU;
        DrawScope.m5325drawPathLG529CI$default(drawScope, pathForRange, Color.m4760copywmQWz5c$default(j, Color.m4763getAlphaimpl(j) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    /* renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m1327drawSelectionSbBc2M(DrawScope drawScope, long j, TextLayoutResult textLayoutResult) {
        int m7058getMinimpl = TextRange.m7058getMinimpl(j);
        int m7057getMaximpl = TextRange.m7057getMaximpl(j);
        if (m7058getMinimpl != m7057getMaximpl) {
            DrawScope.m5325drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(m7058getMinimpl, m7057getMaximpl), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1568getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void drawText(DrawScope drawScope, TextLayoutResult textLayoutResult) {
        TextPainter.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), textLayoutResult);
    }

    private final boolean getShowCursor() {
        boolean isSpecified;
        if (!this.writeable) {
            return false;
        }
        if (!this.isFocused && !this.isDragHovered) {
            return false;
        }
        isSpecified = TextFieldCoreModifierKt.isSpecified(this.cursorBrush);
        return isSpecified;
    }

    /* renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1328measureHorizontalScroll3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int min = Math.min(mo6234measureBRTryo0.getWidth(), Constraints.m7564getMaxWidthimpl(j));
        return MeasureScope.layout$default(measureScope, min, mo6234measureBRTryo0.getHeight(), null, new ut0(this, min, mo6234measureBRTryo0, measureScope, 0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measureHorizontalScroll_3p2s80s$lambda$0(TextFieldCoreModifierNode textFieldCoreModifierNode, int i, Placeable placeable, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        textFieldCoreModifierNode.m1330updateScrollStatetIlFzwE(placementScope, i, placeable.getWidth(), textFieldCoreModifierNode.textFieldState.getVisualText().m1239getSelectiond9O1mEE(), measureScope.getLayoutDirection());
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, -textFieldCoreModifierNode.scrollState.getValue(), 0, 0.0f, 4, null);
        return w01.a;
    }

    /* renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1329measureVerticalScroll3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(mo6234measureBRTryo0.getHeight(), Constraints.m7563getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), min, null, new ut0(this, min, mo6234measureBRTryo0, measureScope, 1), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measureVerticalScroll_3p2s80s$lambda$0(TextFieldCoreModifierNode textFieldCoreModifierNode, int i, Placeable placeable, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        textFieldCoreModifierNode.m1330updateScrollStatetIlFzwE(placementScope, i, placeable.getHeight(), textFieldCoreModifierNode.textFieldState.getVisualText().m1239getSelectiond9O1mEE(), measureScope.getLayoutDirection());
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, -textFieldCoreModifierNode.scrollState.getValue(), 0.0f, 4, null);
        return w01.a;
    }

    private final void startCursorJob() {
        if (this.cursorAnimation == null) {
            this.cursorAnimation = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue());
            DrawModifierNodeKt.invalidateDraw(this);
        }
        this.changeObserverJob = p01.t(getCoroutineScope(), null, null, new TextFieldCoreModifierNode$startCursorJob$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect textContextMenuToolbarHandlerNode$lambda$0(TextFieldCoreModifierNode textFieldCoreModifierNode, LayoutCoordinates layoutCoordinates) {
        Rect derivedVisibleContentBounds$foundation = textFieldCoreModifierNode.textFieldSelectionState.getDerivedVisibleContentBounds$foundation();
        if (derivedVisibleContentBounds$foundation == null) {
            derivedVisibleContentBounds$foundation = Rect.Companion.getZero();
        }
        LayoutCoordinates textLayoutNodeCoordinates = textFieldCoreModifierNode.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            return TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(derivedVisibleContentBounds$foundation, textLayoutNodeCoordinates, layoutCoordinates);
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        o.j();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    private final void m1330updateScrollStatetIlFzwE(Density density, int i, int i2, long j, LayoutDirection layoutDirection) {
        TextLayoutResult layoutResult;
        Rect cursorRectInScroller;
        int i3;
        boolean z;
        float f;
        Integer num = 0;
        this.scrollState.setViewportSize$foundation(i);
        this.scrollState.setMaxValue$foundation(i2 - i);
        int m1326calculateOffsetToFollow8ffj60Q = m1326calculateOffsetToFollow8ffj60Q(j, i, i2);
        if (m1326calculateOffsetToFollow8ffj60Q < 0 || !getShowCursor() || (layoutResult = this.textLayoutState.getLayoutResult()) == null) {
            return;
        }
        k10 k10Var = new k10(0, layoutResult.getLayoutInput().getText().length(), 1);
        if (k10Var instanceof ui) {
            m1326calculateOffsetToFollow8ffj60Q = ((Number) y80.j(Integer.valueOf(m1326calculateOffsetToFollow8ffj60Q), (ui) k10Var)).intValue();
        } else {
            if (k10Var.isEmpty()) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + k10Var + '.');
            }
            if (m1326calculateOffsetToFollow8ffj60Q < num.intValue()) {
                m1326calculateOffsetToFollow8ffj60Q = num.intValue();
            } else {
                int i4 = k10Var.e;
                if (m1326calculateOffsetToFollow8ffj60Q > Integer.valueOf(i4).intValue()) {
                    m1326calculateOffsetToFollow8ffj60Q = Integer.valueOf(i4).intValue();
                }
            }
        }
        Rect cursorRect = layoutResult.getCursorRect(m1326calculateOffsetToFollow8ffj60Q);
        cursorRectInScroller = TextFieldCoreModifierKt.getCursorRectInScroller(density, cursorRect, layoutDirection == LayoutDirection.Rtl, i2);
        if (cursorRectInScroller.getLeft() == this.previousCursorRect.getLeft() && cursorRectInScroller.getTop() == this.previousCursorRect.getTop() && i2 == this.previousTextLayoutSize) {
            i3 = i2;
            z = false;
        } else {
            i3 = i2;
            z = true;
        }
        if (z || i != this.previousContainerSize) {
            boolean z2 = this.orientation == Orientation.Vertical;
            float top = z2 ? cursorRectInScroller.getTop() : cursorRectInScroller.getLeft();
            float bottom = z2 ? cursorRectInScroller.getBottom() : cursorRectInScroller.getRight();
            int value = this.scrollState.getValue();
            float f2 = value + i;
            if (bottom <= f2) {
                float f3 = value;
                if (top >= f3 || bottom - top <= i) {
                    f = (top >= f3 || bottom - top > ((float) i)) ? 0.0f : top - f3;
                    this.previousSelection = TextRange.m7048boximpl(j);
                    this.previousCursorRect = cursorRectInScroller;
                    this.previousContainerSize = i;
                    this.previousTextLayoutSize = i3;
                    p01.t(getCoroutineScope(), null, xn.g, new TextFieldCoreModifierNode$updateScrollState$1(this, f, z, cursorRect, null), 1);
                }
            }
            f = bottom - f2;
            this.previousSelection = TextRange.m7048boximpl(j);
            this.previousCursorRect = cursorRectInScroller;
            this.previousContainerSize = i;
            this.previousTextLayoutSize = i3;
            p01.t(getCoroutineScope(), null, xn.g, new TextFieldCoreModifierNode$updateScrollState$1(this, f, z, cursorRect, null), 1);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        xe0 highlight = visualText.getHighlight();
        if (highlight != null) {
            drawHighlight(contentDrawScope, highlight, layoutResult);
        }
        if (TextRange.m7054getCollapsedimpl(visualText.m1239getSelectiond9O1mEE())) {
            drawText(contentDrawScope, layoutResult);
            if (visualText.shouldShowSelection()) {
                drawCursor(contentDrawScope);
            }
        } else {
            if (visualText.shouldShowSelection()) {
                m1327drawSelectionSbBc2M(contentDrawScope, visualText.m1239getSelectiond9O1mEE(), layoutResult);
            }
            drawText(contentDrawScope, layoutResult);
        }
        this.textFieldMagnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return this.orientation == Orientation.Vertical ? m1329measureVerticalScroll3p2s80s(measureScope, measurable, j) : m1328measureHorizontalScroll3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.isFocused && getShowCursor()) {
            startCursorJob();
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setCoreNodeCoordinates(layoutCoordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    public final void updateNode(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors) {
        boolean showCursor = getShowCursor();
        boolean z4 = this.isFocused;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        ScrollState scrollState2 = this.scrollState;
        this.isFocused = z;
        this.isDragHovered = z2;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z3;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.toolbarRequester = toolbarRequester;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
        this.textFieldMagnifierNode.update(transformedTextFieldState, textFieldSelectionState, textLayoutState, z || z2);
        this.textContextMenuToolbarHandlerNode.update(toolbarRequester);
        if (!getShowCursor()) {
            z10 z10Var = this.changeObserverJob;
            if (z10Var != null) {
                z10Var.cancel(null);
            }
            this.changeObserverJob = null;
            CursorAnimationState cursorAnimationState = this.cursorAnimation;
            if (cursorAnimationState != null) {
                cursorAnimationState.cancelAndHide();
            }
        } else if (!z4 || !q10.b(transformedTextFieldState2, transformedTextFieldState) || !showCursor) {
            startCursorJob();
        }
        if (q10.b(transformedTextFieldState2, transformedTextFieldState) && q10.b(textLayoutState2, textLayoutState) && q10.b(textFieldSelectionState2, textFieldSelectionState) && q10.b(scrollState2, scrollState)) {
            return;
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
