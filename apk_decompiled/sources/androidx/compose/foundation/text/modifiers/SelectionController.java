package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.dq;
import defpackage.kf0;
import defpackage.nn0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    public static final int $stable = 8;
    private final long backgroundSelectionColor;
    private final Modifier modifier;
    private StaticTextSelectionParams params;
    private Selectable selectable;
    private final long selectableId;
    private final SelectionRegistrar selectionRegistrar;

    private SelectionController(long j, SelectionRegistrar selectionRegistrar, long j2, StaticTextSelectionParams staticTextSelectionParams) {
        this.selectableId = j;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j2;
        this.params = staticTextSelectionParams;
        this.modifier = PointerIconKt.pointerHoverIcon$default(SelectionController_androidKt.makeSelectionModifier(selectionRegistrar, j, new nn0(this, 2)), PointerIcon.Companion.getText(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates modifier$lambda$0(SelectionController selectionController) {
        return selectionController.params.getLayoutCoordinates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates onRemembered$lambda$0(SelectionController selectionController) {
        return selectionController.params.getLayoutCoordinates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult onRemembered$lambda$1(SelectionController selectionController) {
        return selectionController.params.getTextLayoutResult();
    }

    public final void draw(DrawScope drawScope) {
        Selection selection = (Selection) this.selectionRegistrar.getSubselections().b(this.selectableId);
        if (selection == null) {
            return;
        }
        int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
        if (offset > lastVisibleOffset) {
            offset = lastVisibleOffset;
        }
        if (offset2 > lastVisibleOffset) {
            offset2 = lastVisibleOffset;
        }
        Path pathForRange = this.params.getPathForRange(offset, offset2);
        if (pathForRange == null) {
            return;
        }
        if (!this.params.getShouldClip()) {
            DrawScope.m5325drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L));
        int m4750getIntersectrtfAjoo = ClipOp.Companion.m4750getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5259clipRectN_I0leg(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, m4750getIntersectrtfAjoo);
            DrawScope.m5325drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new nn0(this, 0), new nn0(this, 1)));
    }

    public final void updateGlobalPosition(LayoutCoordinates layoutCoordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, layoutCoordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void updateTextLayout(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !q10.b(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.notifySelectableChange(this.selectableId);
        }
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    public /* synthetic */ SelectionController(long j, SelectionRegistrar selectionRegistrar, long j2, StaticTextSelectionParams staticTextSelectionParams, dq dqVar) {
        this(j, selectionRegistrar, j2, staticTextSelectionParams);
    }

    public /* synthetic */ SelectionController(long j, SelectionRegistrar selectionRegistrar, long j2, StaticTextSelectionParams staticTextSelectionParams, int i, dq dqVar) {
        this(j, selectionRegistrar, j2, (i & 8) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }
}
