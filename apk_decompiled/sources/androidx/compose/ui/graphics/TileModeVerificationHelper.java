package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TileModeVerificationHelper {
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    /* renamed from: getComposeTileModeDecal-3opZhB0, reason: not valid java name */
    public final int m5160getComposeTileModeDecal3opZhB0() {
        return TileMode.Companion.m5157getDecal3opZhB0();
    }

    public final Shader.TileMode getFrameworkTileModeDecal() {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }
}
