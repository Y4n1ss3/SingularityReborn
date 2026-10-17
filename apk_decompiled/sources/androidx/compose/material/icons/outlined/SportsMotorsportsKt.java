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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsMotorsportsKt {
    private static ImageVector _sportsMotorsports;

    public static final ImageVector getSportsMotorsports(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsMotorsports;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsMotorsports", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.96f, 11.22f);
        b.curveTo(21.57f, 7.01f, 17.76f, 4.0f, 13.56f, 4.0f);
        b.curveToRelative(-0.19f, 0.0f, -0.38f, 0.01f, -0.57f, 0.02f);
        b.curveTo(2.0f, 4.74f, 2.0f, 17.2f, 2.0f, 17.2f);
        b.verticalLineTo(18.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveTo(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f);
        b.close();
        b.moveTo(5.26f, 11.56f);
        b.curveToRelative(0.57f, -1.29f, 1.28f, -2.35f, 2.14f, -3.19f);
        b.lineToRelative(3.62f, 1.53f);
        b.curveToRelative(0.6f, 0.25f, 0.98f, 0.83f, 0.98f, 1.48f);
        b.curveToRelative(0.0f, 0.89f, -0.72f, 1.61f, -1.61f, 1.61f);
        b.horizontalLineTo(4.72f);
        b.curveTo(4.87f, 12.53f, 5.04f, 12.05f, 5.26f, 11.56f);
        b.close();
        b.moveTo(18.44f, 16.04f);
        b.curveTo(17.3f, 17.29f, 15.68f, 18.0f, 14.0f, 18.0f);
        b.horizontalLineTo(4.0f);
        b.verticalLineToRelative(-0.8f);
        b.curveToRelative(0.0f, -0.02f, 0.01f, -0.92f, 0.24f, -2.2f);
        b.horizontalLineToRelative(6.15f);
        b.curveToRelative(1.99f, 0.0f, 3.61f, -1.62f, 3.61f, -3.61f);
        b.curveToRelative(0.0f, -1.45f, -0.87f, -2.76f, -2.2f, -3.32f);
        b.lineTo(9.3f, 7.01f);
        b.curveToRelative(1.1f, -0.57f, 2.37f, -0.9f, 3.82f, -0.99f);
        b.curveTo(13.27f, 6.0f, 13.42f, 6.0f, 13.56f, 6.0f);
        b.curveToRelative(3.31f, 0.0f, 6.13f, 2.37f, 6.41f, 5.41f);
        b.curveTo(20.13f, 13.13f, 19.59f, 14.77f, 18.44f, 16.04f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsMotorsports = build;
        build.getClass();
        return build;
    }
}
