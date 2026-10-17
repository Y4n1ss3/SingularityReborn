package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsRugbyKt {
    private static ImageVector _sportsRugby;

    public static final ImageVector getSportsRugby(Icons.Sharp sharp) {
        ImageVector imageVector = _sportsRugby;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SportsRugby", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.49f, 3.51f);
        b.curveToRelative(-0.56f, -0.56f, -2.15f, -0.97f, -4.16f, -0.97f);
        b.curveToRelative(-3.08f, 0.0f, -7.15f, 0.96f, -9.98f, 3.79f);
        b.curveTo(1.66f, 11.03f, 2.1f, 19.07f, 3.51f, 20.49f);
        b.curveToRelative(0.56f, 0.56f, 2.15f, 0.97f, 4.16f, 0.97f);
        b.curveToRelative(3.08f, 0.0f, 7.15f, -0.96f, 9.98f, -3.79f);
        b.curveTo(22.34f, 12.97f, 21.9f, 4.93f, 20.49f, 3.51f);
        b.close();
        b.moveTo(7.76f, 7.76f);
        b.curveToRelative(2.64f, -2.64f, 6.35f, -3.12f, 8.03f, -3.19f);
        b.curveToRelative(-2.05f, 0.94f, -4.46f, 2.45f, -6.61f, 4.61f);
        b.curveToRelative(-2.16f, 2.16f, -3.67f, 4.58f, -4.61f, 6.63f);
        b.curveTo(4.66f, 13.33f, 5.44f, 10.07f, 7.76f, 7.76f);
        b.close();
        b.moveTo(16.24f, 16.24f);
        b.curveToRelative(-2.64f, 2.64f, -6.35f, 3.12f, -8.03f, 3.19f);
        b.curveToRelative(2.05f, -0.94f, 4.46f, -2.45f, 6.61f, -4.61f);
        b.curveToRelative(2.16f, -2.16f, 3.67f, -4.58f, 4.62f, -6.63f);
        b.curveTo(19.34f, 10.67f, 18.56f, 13.93f, 16.24f, 16.24f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsRugby = build;
        build.getClass();
        return build;
    }
}
