package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private FocusRequester fallback;
    private final ky onExit = new FocusRestorerNode$onExit$1(this);
    private final ky onEnter = new FocusRestorerNode$onEnter$1(this);

    public FocusRestorerNode(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    public final FocusRequester getFallback() {
        return this.fallback;
    }

    public final void setFallback(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    private static /* synthetic */ void getOnExit$annotations() {
    }
}
