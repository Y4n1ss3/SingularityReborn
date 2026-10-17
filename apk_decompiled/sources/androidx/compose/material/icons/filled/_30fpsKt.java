package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _30fpsKt {
    private static ImageVector __30fps;

    public static final ImageVector get_30fps(Icons.Filled filled) {
        ImageVector imageVector = __30fps;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._30fps", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(2.0f, 5.0f, 3.0f, 6.0f, 2.5f);
        af0.g(s, 3.0f, 3.0f, 5.0f, 16.0f);
        af0.u(s, 2.0f, 3.0f, 6.0f);
        s.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        s.verticalLineToRelative(-1.9f);
        s.curveToRelative(0.0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f);
        s.curveToRelative(1.16f, 0.0f, 2.1f, -0.94f, 2.1f, -2.1f);
        s.verticalLineTo(8.0f);
        s.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        kp0.D(s, 2.0f, 19.0f, 8.0f, 8.0f);
        uo.f(s, -4.0f, 8.0f, 19.0f);
        s.moveTo(19.0f, 5.0f);
        s.horizontalLineToRelative(-4.0f);
        s.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        s.verticalLineToRelative(8.0f);
        s.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        s.horizontalLineToRelative(4.0f);
        s.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        s.verticalLineTo(8.0f);
        s.curveTo(22.0f, 6.34f, 20.66f, 5.0f, 19.0f, 5.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __30fps = build;
        build.getClass();
        return build;
    }
}
