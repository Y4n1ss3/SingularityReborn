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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BackHandKt {
    private static ImageVector _backHand;

    public static final ImageVector getBackHand(Icons.Outlined outlined) {
        ImageVector imageVector = _backHand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BackHand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 7.0f);
        b.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b.curveToRelative(-0.23f, 0.0f, -0.46f, 0.03f, -0.67f, 0.09f);
        b.curveTo(14.46f, 0.66f, 13.56f, 0.0f, 12.5f, 0.0f);
        b.curveToRelative(-1.23f, 0.0f, -2.25f, 0.89f, -2.46f, 2.06f);
        b.curveTo(9.87f, 2.02f, 9.69f, 2.0f, 9.5f, 2.0f);
        b.curveTo(8.12f, 2.0f, 7.0f, 3.12f, 7.0f, 4.5f);
        b.verticalLineToRelative(5.89f);
        b.curveToRelative(-0.34f, -0.31f, -0.76f, -0.54f, -1.22f, -0.66f);
        b.lineTo(5.01f, 9.52f);
        b.curveToRelative(-0.83f, -0.23f, -1.7f, 0.09f, -2.19f, 0.83f);
        b.curveToRelative(-0.38f, 0.57f, -0.4f, 1.31f, -0.15f, 1.95f);
        b.lineToRelative(2.56f, 6.43f);
        b.curveTo(6.49f, 21.91f, 9.57f, 24.0f, 13.0f, 24.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        bv.t(b, 7.0f, 19.0f, 16.0f);
        b.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-2.61f, 0.0f, -4.95f, -1.59f, -5.91f, -4.01f);
        b.lineToRelative(-2.6f, -6.54f);
        b.lineToRelative(0.53f, 0.14f);
        b.curveToRelative(0.46f, 0.12f, 0.83f, 0.46f, 1.0f, 0.9f);
        kf0.y(b, 7.0f, 15.0f, 2.0f, 4.5f);
        b.curveTo(9.0f, 4.22f, 9.22f, 4.0f, 9.5f, 4.0f);
        b.reflectiveCurveTo(10.0f, 4.22f, 10.0f, 4.5f);
        uf.z(b, 12.0f, 2.0f, 2.5f);
        b.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        b.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        uf.z(b, 12.0f, 2.0f, 4.0f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveTo(16.0f, 3.72f, 16.0f, 4.0f);
        bv.x(b, 8.0f, 2.0f, 7.0f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveTo(19.0f, 6.72f, 19.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 19.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backHand = build;
        build.getClass();
        return build;
    }
}
