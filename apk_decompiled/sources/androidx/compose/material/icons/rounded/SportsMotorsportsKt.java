package androidx.compose.material.icons.rounded;

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

    public static final ImageVector getSportsMotorsports(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsMotorsports;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsMotorsports", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 11.39f);
        b.curveToRelative(0.0f, -0.65f, -0.39f, -1.23f, -0.98f, -1.48f);
        b.lineTo(5.44f, 7.55f);
        b.curveToRelative(-1.48f, 1.68f, -2.32f, 3.7f, -2.8f, 5.45f);
        b.horizontalLineToRelative(7.75f);
        b.curveTo(11.28f, 13.0f, 12.0f, 12.28f, 12.0f, 11.39f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(21.96f, 11.22f);
        b2.curveToRelative(-0.41f, -4.41f, -4.56f, -7.49f, -8.98f, -7.2f);
        b2.curveToRelative(-2.51f, 0.16f, -4.44f, 0.94f, -5.93f, 2.04f);
        b2.lineToRelative(4.74f, 2.01f);
        b2.curveToRelative(1.33f, 0.57f, 2.2f, 1.87f, 2.2f, 3.32f);
        b2.curveToRelative(0.0f, 1.99f, -1.62f, 3.61f, -3.61f, 3.61f);
        b2.horizontalLineTo(2.21f);
        b2.curveTo(2.0f, 16.31f, 2.0f, 17.2f, 2.0f, 17.2f);
        b2.verticalLineTo(18.0f);
        b2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b2.horizontalLineToRelative(10.0f);
        b2.curveTo(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsMotorsports = build;
        build.getClass();
        return build;
    }
}
