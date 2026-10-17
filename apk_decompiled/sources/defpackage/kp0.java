package defpackage;

import android.content.res.TypedArray;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.text.TextStyle;
import com.lumi.singularity.system.TweakService;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class kp0 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static int b(int i, int i2, TextStyle textStyle) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static int c(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int d(long j, int i, int i2) {
        return (Color.m4768hashCodeimpl(j) + i) * i2;
    }

    public static PathBuilder e(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static StringBuilder f(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static List g(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List h(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void i(long j, StringBuilder sb, String str) {
        sb.append((Object) Color.m4769toStringimpl(j));
        sb.append(str);
    }

    public static void j(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void k(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void l(TweakService tweakService, String str, boolean z) {
        tweakService.c().edit().putBoolean(str, z).apply();
    }

    public static /* synthetic */ void m(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (!(autoCloseable instanceof TypedArray)) {
                throw new IllegalArgumentException();
            }
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static PathBuilder n(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.lineToRelative(f4, f5);
        return pathBuilder;
    }

    public static List o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void p(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static PathBuilder s(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static PathBuilder u(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static void v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static PathBuilder w(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.close();
    }

    public static PathBuilder y(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }
}
