package androidx.compose.ui.semantics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, SemanticsPropertiesAndroid$TestTagsAsResourceId$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<String> AccessibilityClassName = new SemanticsPropertyKey<>("AccessibilityClassName", true, SemanticsPropertiesAndroid$AccessibilityClassName$1.INSTANCE, null, 8, null);
    public static final int $stable = 8;

    private SemanticsPropertiesAndroid() {
    }

    public final SemanticsPropertyKey<String> getAccessibilityClassName() {
        return AccessibilityClassName;
    }

    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }
}
