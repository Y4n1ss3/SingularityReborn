package androidx.compose.ui.graphics;

import android.graphics.Path;
import androidx.compose.ui.graphics.Path;
import defpackage.lu0;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidPath_androidKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[Path.Direction.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Path.Direction.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Path Path() {
        return new AndroidPath(null, 1, 0 == true ? 1 : 0);
    }

    public static final android.graphics.Path asAndroidPath(Path path) {
        if (path instanceof AndroidPath) {
            return ((AndroidPath) path).getInternalPath();
        }
        lu0.a("Unable to obtain android.graphics.Path");
        return null;
    }

    public static final Path asComposePath(android.graphics.Path path) {
        return new AndroidPath(path);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction toPlatformPathDirection(Path.Direction direction) {
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return Path.Direction.CCW;
        }
        if (i == 2) {
            return Path.Direction.CW;
        }
        o.n();
        return null;
    }
}
