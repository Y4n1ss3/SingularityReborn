package androidx.compose.ui.layout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NoWindowInsetsAnimation implements WindowInsetsAnimation {
    public static final int $stable = 0;
    public static final NoWindowInsetsAnimation INSTANCE = new NoWindowInsetsAnimation();

    private NoWindowInsetsAnimation() {
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getAlpha() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public long getDurationMillis() {
        return 0L;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getFraction() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getSource() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getTarget() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isAnimating() {
        return false;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isVisible() {
        return true;
    }
}
