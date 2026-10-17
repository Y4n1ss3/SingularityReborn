package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidRenderEffect extends RenderEffect {
    public static final int $stable = 0;
    private final android.graphics.RenderEffect androidRenderEffect;

    public AndroidRenderEffect(android.graphics.RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    public android.graphics.RenderEffect createRenderEffect() {
        return this.androidRenderEffect;
    }

    public final android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
