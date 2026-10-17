package androidx.compose.ui.semantics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsNode_androidKt {
    public static final boolean isAccessibilityIgnoredLink(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker());
    }
}
