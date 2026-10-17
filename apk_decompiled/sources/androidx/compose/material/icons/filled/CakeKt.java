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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CakeKt {
    private static ImageVector _cake;

    public static final ImageVector getCake(Icons.Filled filled) {
        ImageVector imageVector = _cake;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Cake", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.curveToRelative(0.0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f);
        b.lineTo(12.0f, 0.0f);
        b.lineToRelative(-1.71f, 2.97f);
        b.curveToRelative(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k4.x(b, 16.6f, 15.99f, -1.07f, -1.07f);
        b.lineToRelative(-1.08f, 1.07f);
        b.curveToRelative(-1.3f, 1.3f, -3.58f, 1.31f, -4.89f, 0.0f);
        b.lineToRelative(-1.07f, -1.07f);
        b.lineToRelative(-1.09f, 1.07f);
        b.curveTo(6.75f, 16.64f, 5.88f, 17.0f, 4.96f, 17.0f);
        b.curveToRelative(-0.73f, 0.0f, -1.4f, -0.23f, -1.96f, -0.61f);
        b.lineTo(3.0f, 21.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-4.61f);
        b.curveToRelative(-0.56f, 0.38f, -1.23f, 0.61f, -1.96f, 0.61f);
        b.curveToRelative(-0.92f, 0.0f, -1.79f, -0.36f, -2.44f, -1.01f);
        af0.l(b, 18.0f, 9.0f, -5.0f);
        fc.w(b, 13.0f, 7.0f, -2.0f, 2.0f);
        b.lineTo(6.0f, 9.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.verticalLineToRelative(1.54f);
        b.curveToRelative(0.0f, 1.08f, 0.88f, 1.96f, 1.96f, 1.96f);
        b.curveToRelative(0.52f, 0.0f, 1.02f, -0.2f, 1.38f, -0.57f);
        b.lineToRelative(2.14f, -2.13f);
        b.lineToRelative(2.13f, 2.13f);
        b.curveToRelative(0.74f, 0.74f, 2.03f, 0.74f, 2.77f, 0.0f);
        b.lineToRelative(2.14f, -2.13f);
        b.lineToRelative(2.13f, 2.13f);
        b.curveToRelative(0.37f, 0.37f, 0.86f, 0.57f, 1.38f, 0.57f);
        b.curveToRelative(1.08f, 0.0f, 1.96f, -0.88f, 1.96f, -1.96f);
        b.lineTo(20.99f, 12.0f);
        b.curveTo(21.0f, 10.34f, 19.66f, 9.0f, 18.0f, 9.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cake = build;
        build.getClass();
        return build;
    }
}
