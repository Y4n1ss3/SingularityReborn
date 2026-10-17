package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HouseboatKt {
    private static ImageVector _houseboat;

    public static final ImageVector getHouseboat(Icons.Outlined outlined) {
        ImageVector imageVector = _houseboat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Houseboat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 16.0f);
        b.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        b.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        b.curveTo(3.38f, 16.0f, 3.24f, 17.0f, 2.0f, 17.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        b.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        b.curveToRelative(1.95f, 0.0f, 2.08f, -1.0f, 3.32f, -1.0f);
        b.reflectiveCurveToRelative(1.37f, 1.0f, 3.32f, 1.0f);
        b.curveToRelative(1.91f, 0.0f, 2.14f, -1.0f, 3.33f, -1.0f);
        b.curveToRelative(1.18f, 0.0f, 1.45f, 1.0f, 3.35f, 1.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        b.curveToRelative(-1.91f, 0.0f, -2.14f, 1.0f, -3.33f, 1.0f);
        b.curveTo(14.1f, 17.0f, 13.95f, 16.0f, 12.0f, 16.0f);
        k4.x(b, 20.34f, 11.34f, -1.37f, 1.37f);
        b.curveTo(18.78f, 12.89f, 18.52f, 13.0f, 18.26f, 13.0f);
        b.horizontalLineTo(17.0f);
        b.verticalLineTo(9.65f);
        b.lineToRelative(1.32f, 0.97f);
        b.lineTo(19.5f, 9.0f);
        b.lineTo(12.0f, 3.5f);
        b.lineTo(4.5f, 9.0f);
        b.lineToRelative(1.18f, 1.61f);
        uf.u(b, 7.0f, 9.65f, 13.0f, 5.74f);
        b.curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f);
        b.lineToRelative(-1.37f, -1.37f);
        b.lineToRelative(-1.41f, 1.41f);
        b.lineToRelative(1.37f, 1.37f);
        b.curveTo(4.18f, 14.68f, 4.95f, 15.0f, 5.74f, 15.0f);
        b.horizontalLineToRelative(12.51f);
        b.curveToRelative(0.8f, 0.0f, 1.56f, -0.32f, 2.12f, -0.88f);
        gy.B(b, 1.37f, -1.37f, 20.34f, 11.34f);
        bv.y(b, 13.0f, 13.0f, -2.0f, -2.0f);
        gy.i(b, 2.0f, 9.0f, 8.18f);
        b.lineToRelative(3.0f, -2.2f);
        b.lineToRelative(3.0f, 2.2f);
        b.verticalLineTo(13.0f);
        b.horizontalLineTo(13.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _houseboat = build;
        build.getClass();
        return build;
    }
}
