package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m4663isSupported0vamqd0(int i) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m5152equalsimpl0(i, TileMode.Companion.m5157getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m4664toAndroidTileMode0vamqd0(int i) {
        TileMode.Companion companion = TileMode.Companion;
        return TileMode.m5152equalsimpl0(i, companion.m5156getClamp3opZhB0()) ? Shader.TileMode.CLAMP : TileMode.m5152equalsimpl0(i, companion.m5159getRepeated3opZhB0()) ? Shader.TileMode.REPEAT : TileMode.m5152equalsimpl0(i, companion.m5158getMirror3opZhB0()) ? Shader.TileMode.MIRROR : TileMode.m5152equalsimpl0(i, companion.m5157getDecal3opZhB0()) ? Build.VERSION.SDK_INT >= 31 ? TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        Shader.TileMode tileMode2;
        int i = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i == 1) {
            return TileMode.Companion.m5156getClamp3opZhB0();
        }
        if (i == 2) {
            return TileMode.Companion.m5158getMirror3opZhB0();
        }
        if (i == 3) {
            return TileMode.Companion.m5159getRepeated3opZhB0();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            tileMode2 = Shader.TileMode.DECAL;
            if (tileMode == tileMode2) {
                return TileModeVerificationHelper.INSTANCE.m5160getComposeTileModeDecal3opZhB0();
            }
        }
        return TileMode.Companion.m5156getClamp3opZhB0();
    }
}
