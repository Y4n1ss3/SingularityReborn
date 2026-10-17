package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import defpackage.hm0;
import defpackage.ky;
import defpackage.p01;
import defpackage.xn;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuToolbarHandlerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, TextContextMenuDataProvider {
    public static final int $stable = 8;
    private ky computeContentBounds;
    private ky onHide;
    private ky onShow;
    private ToolbarRequester requester;
    private z10 textToolbarJob;
    private final State derivedData$delegate = SnapshotStateKt.derivedStateOf(new hm0(this, 11));
    private Rect previousContentBounds = Rect.Companion.getZero();

    public TextContextMenuToolbarHandlerNode(ToolbarRequester toolbarRequester, ky kyVar, ky kyVar2, ky kyVar3) {
        this.requester = toolbarRequester;
        this.onShow = kyVar;
        this.onHide = kyVar2;
        this.computeContentBounds = kyVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuData derivedData_delegate$lambda$0(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        return textContextMenuToolbarHandlerNode.isAttached() ? TextContextMenuModifierKt.collectTextContextMenuData(textContextMenuToolbarHandlerNode) : TextContextMenuData.Companion.getEmpty();
    }

    private final TextContextMenuData getDerivedData() {
        return (TextContextMenuData) this.derivedData$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    public Rect contentBounds(LayoutCoordinates layoutCoordinates) {
        if (!isAttached()) {
            return this.previousContentBounds;
        }
        Rect rect = (Rect) this.computeContentBounds.invoke(layoutCoordinates);
        if (rect == null) {
            return this.previousContentBounds;
        }
        this.previousContentBounds = rect;
        return rect;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    public TextContextMenuData data() {
        return getDerivedData();
    }

    public final ky getComputeContentBounds() {
        return this.computeContentBounds;
    }

    public final ky getOnHide() {
        return this.onHide;
    }

    public final ky getOnShow() {
        return this.onShow;
    }

    public final ToolbarRequester getRequester() {
        return this.requester;
    }

    public final void hide() {
        z10 z10Var = this.textToolbarJob;
        if (z10Var == null) {
            return;
        }
        z10Var.cancel(null);
        this.textToolbarJob = null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.requester.setToolbarHandlerState$foundation(ToolbarHandlerState.Attached);
        this.requester.setToolbarHandlerNode$foundation(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.requester.setToolbarHandlerState$foundation(ToolbarHandlerState.Detached);
        this.requester.setToolbarHandlerNode$foundation(null);
        super.onDetach();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    /* renamed from: position-tuRUvjQ */
    public long mo1224positiontuRUvjQ(LayoutCoordinates layoutCoordinates) {
        return contentBounds(layoutCoordinates).m4551getTopLeftF1C5BW0();
    }

    public final void setComputeContentBounds(ky kyVar) {
        this.computeContentBounds = kyVar;
    }

    public final void setOnHide(ky kyVar) {
        this.onHide = kyVar;
    }

    public final void setOnShow(ky kyVar) {
        this.onShow = kyVar;
    }

    public final void setRequester(ToolbarRequester toolbarRequester) {
        this.requester = toolbarRequester;
    }

    public final void show() {
        TextContextMenuProvider textContextMenuProvider;
        if (isAttached()) {
            z10 z10Var = this.textToolbarJob;
            if ((z10Var == null || !z10Var.isActive()) && (textContextMenuProvider = (TextContextMenuProvider) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextContextMenuProviderKt.getLocalTextContextMenuToolbarProvider())) != null) {
                this.textToolbarJob = p01.t(getCoroutineScope(), null, xn.g, new TextContextMenuToolbarHandlerNode$show$1(this, textContextMenuProvider, null), 1);
            }
        }
    }

    public final void update(ToolbarRequester toolbarRequester) {
        this.requester.setToolbarHandlerNode$foundation(null);
        this.requester = toolbarRequester;
        toolbarRequester.setToolbarHandlerNode$foundation(this);
        this.requester.setToolbarHandlerState$foundation(isAttached() ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached);
    }
}
