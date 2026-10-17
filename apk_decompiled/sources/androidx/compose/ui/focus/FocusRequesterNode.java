package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusRequesterNode extends Modifier.Node implements FocusRequesterModifierNode {
    private FocusRequester focusRequester;

    public FocusRequesterNode(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.focusRequester.getFocusRequesterNodes$ui().add(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.focusRequester.getFocusRequesterNodes$ui().remove(this);
        super.onDetach();
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }
}
